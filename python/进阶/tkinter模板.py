from tkinter import *
class Application(Frame):
    """模板"""
    def __init__(self, master=None):
        super().__init__(master)#表示继承父类的构造函数
        self.master = master#将master赋值给self.master
        self.pack()#显示窗口
        self.createWidgets()#创建组件
# ------------------------------------------------------
    # 组件
    def createWidgets(self):
        pass


# ++++++++++++++++++++++++++++++++++++++++++++++++++++++
if __name__ == '__main__':
    root = Tk()  # 创建窗口
    root.geometry("1200x800")  # 设置窗口大小
    root.title("gui写法")  # 设置窗口标题
    app = Application(master=root)  # 在root窗口创建
    root.mainloop()  # 显示窗口