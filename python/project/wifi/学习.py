import pywifi
import time
# 1.获取网卡
def get_card():
    print('正在扫描可用网卡...')
    wifi=pywifi.PyWiFi()

    print('当前可用网卡有:')
    # interfaces() 方法属于 pywifi.PyWiFi() 类的实例，它会返回一个包含所有可用 WiFi 接口的列表
    print(wifi.interfaces())

    # 获取第一个可用的无线网卡（WiFi 接口），并将其赋值给变量 card
    card=wifi.interfaces()[0]
    time.sleep(1)
    print(f'已获取(默认第一个)网卡{wifi.interfaces()[0]}')

    # 断开连接
    card.disconnect()
    time.sleep(0.5)

    # 打印网卡状态
    print(f'当前网卡状态为:{card.status()}')
    '''
    const.IFACE_DISCONNECTED (值为 0)：表示网卡当前未连接到任何 WiFi 网络
    const.IFACE_SCANNING (值为 1)：表示网卡正在扫描可用的 WiFi 网络
    const.IFACE_INACTIVE (值为 2)：表示网卡当前处于非活动状态
    const.IFACE_CONNECTING (值为 3)：表示网卡正在连接到 WiFi 网络
    const.IFACE_CONNECTED (值为 4)：表示网卡已成功连接到 WiFi 网络
    '''

    # 判断网卡是否处于0或2状态,否则不能往后执行
    if card.status() in [0,2]:
        # 返回网卡
        return card
    else:
        print('当前网卡状态不能往后执行')
        return False
# 2.扫描wifi列表
def scan_wifi(card):
    print(f'{card}正在扫描wifi...')
    # 扫描wifi
    card.scan()
    time.sleep(15)
    # 打印wifi列表
    wifi_list = card.scan_results()
    print(f'扫描的wifi数量:{len(wifi_list)}')
    print(wifi_list)
# 3.破解指定wifi密码

if __name__:
    scan_wifi(get_card())