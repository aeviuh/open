#基本的多进程编程
import multiprocessing
import time

def print1():
    for i in range(3):
        print("1")
        time.sleep(0.5)

def print2():
    for i in range(3):
        print("2")
        time.sleep(0.5)

print1_process = multiprocessing.Process(target=print1)#创建进程对象,执行print1()
print2_process = multiprocessing.Process(target=print2)#创建进程对象,执行print2()

def main_1():
    print1_process.start()#启动进程print1_process,执行print1()
    print2_process.start()#启动进程print2_process,执行print2()

def main_2():
    print1()#直接执行print1()
    print2()#直接执行print2()

if __name__ == "__main__":
    main_1()
    #main_2()