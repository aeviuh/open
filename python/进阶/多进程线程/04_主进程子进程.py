import multiprocessing
import time

def work():
    for i in range(10):
        print("工作中...")
        time.sleep(0.2)

work_process = multiprocessing.Process(target=work)#创建进程对象,执行work()

def main():
    work_process.start()#启动进程work_process,执行work()


if __name__ == "__main__":
    main()
    time.sleep(1)
    print("主进程执行结束")
"""
运行程序观察过程

说明:
    1.主进程会等待所有的子进程执行结束再结束
"""