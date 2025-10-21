import threading
import time

num=0

def add_num1():
    for i in range(10000000):
        global num
        num=num+1
    print("add_num1:",num)

def add_num2():
    for i in range(10000000):
        global num
        num=num+1
    print("add_num2:",num)

def main():
    add_num1_thread = threading.Thread(target=add_num1)
    add_num2_thread = threading.Thread(target=add_num2)
    add_num1_thread.start()
    add_num2_thread.start()

if __name__ == "__main__":
    main()

"""
说明:
    多线程可以共享全局变量
    多线程共享全局变量的问题:
        1.多线程共享全局变量可能会出现数据不同步的问题
        2.多线程共享全局变量可能会出现死锁的问题
        3.多线程共享全局变量可能会出现数据不安全的问题
        4.多线程共享全局变量可能会出现数据不一致的问题
        5.多线程共享全局变量可能会出现数据丢失的问题
        6.多线程共享全局变量可能会出现数据覆盖的问题
    解决方法:
"""