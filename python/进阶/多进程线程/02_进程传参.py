#进程传参
import multiprocessing
import time

def print1(num,):
    for i in range(num):
        print("1")
        time.sleep(0.5)

def print2(num):
    for i in range(num):
        print("2")
        time.sleep(0.5)

def print3(num1,num2):
    for i in range(num1):
        print(num2)
        time.sleep(0.5)

def print4(num1,num2):
    for i in range(num1):
        print(num2)
        time.sleep(0.5)

#使用元组的方式传递参数
print1_process = multiprocessing.Process(target=print1,args=(3,))#创建进程对象,执行print1(),以元组形式传递参数3
#使用字典的方式传递参数
print2_process = multiprocessing.Process(target=print2,kwargs={"num":3})#创建进程对象,执行print2()
#使用元组的方式传递参数
print3_process = multiprocessing.Process(target=print3,args=(3,3))#创建进程对象,执行print3(),以元组形式传递参数3,4
#使用字典的方式传递参数
print4_process = multiprocessing.Process(target=print4,kwargs={"num1":3,"num2":4})#创建进程对象,执行print4()

def main_1():
    print1_process.start()#启动进程print1_process,执行print1()
    print2_process.start()#启动进程print2_process,执行print2()
    print3_process.start()#启动进程print3_process,执行print3()
    print4_process.start()#启动进程print4_process,执行print4()

def main_2():
    print1(3)#直接执行print1()
    print2(3)#直接执行print2()
    print3(3,3)#直接执行print3()
    print4(3,4)#直接执行print4()

if __name__ == "__main__":
    main_1()
    #main_2()