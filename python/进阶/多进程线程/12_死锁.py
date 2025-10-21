#互斥锁的创建
import threading
import time

# 创建互斥锁
lock = threading.Lock()

num=0

def add_num1():
    # 上锁
    print("sum_num1...")
    lock.acquire()
    for i in range(10000000):
        global num
        num=num+1

    print("add_num1:",num)

def add_num2():
    # 上锁
    print("sum_num2...")
    lock.acquire()
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
    死锁:
        1.死锁是指两个或两个以上的进程或线程在执行过程中，因争夺资源而造成的一种互相等待的现象，若无外力作用，它们都将无法推进下去。
        2.死锁的四个必要条件:
            1.互斥条件:一个资源每次只能被一个进程或线程使用。
            2.请求与保持条件:一个进程或线程因请求资源而阻塞时，对已获得的资源保持不放。
            3.不剥夺条件:进程已获得的资源，在末使用完之前，不能强行剥夺。
            4.循环等待条件:若干进程或线程之间形成一种头尾相接的循环等待资源关系。
        3.死锁的解决方法:
            1.避免死锁:通过破坏死锁的四个必要条件来避免死锁。
            2.检测死锁:通过检测系统中是否存在死锁来解决死锁。
            3.解除死锁:通过解除死锁的一个或多个进程来解决死锁。
            4.忽略死锁:通过忽略死锁来解决死锁。
"""
