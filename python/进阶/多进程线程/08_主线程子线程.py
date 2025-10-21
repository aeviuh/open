import threading
import time

def work():
    for i in range(10):
        print("工作中...")
        time.sleep(0.2)

def main():
    sub_thread = threading.Thread(target=work)
    sub_thread.start()

if __name__ == "__main__":
    main()
    time.sleep(1)
    print("主线程执行完成")
"""
运行程序观察过程

说明:
    1.主线程会等待所有的子进程执行结束再结束
"""