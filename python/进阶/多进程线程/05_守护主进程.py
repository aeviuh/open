import multiprocessing
import time

def work():
    for i in range(10):
        print("工作中...")
        time.sleep(0.2)

work_process = multiprocessing.Process(target=work)#创建进程对象,执行work()

def main():
    work_process.daemon = True#守护主进程
    work_process.start()#启动进程work_process,执行work()


if __name__ == "__main__":
    main()
    time.sleep(1)
    print("主进程执行结束")
"""
运行程序观察过程

说明:
    1.设置守护主进程之后，主进程退出子进程直接销毁，不再执行子进程中的代码
"""