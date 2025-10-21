import threading
import time

def work():
    for i in range(10):
        print("工作中...")
        time.sleep(0.2)

def main():
    sub_thread = threading.Thread(target=work,daemon=True)#守护主线程
    #sub_thread.daemon = True
    sub_thread.start()

if __name__ == "__main__":
    main()
    time.sleep(1)
    print("主线程执行完成")
"""
运行程序观察过程

说明:
    1.设置守护主线程的方法:
        线程对象.daemon = True
    2.守护主线程会等待主线程代码执行结束后才结束
"""