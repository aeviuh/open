#互斥锁的创建
import threading
import time

# 创建互斥锁
lock = threading.Lock()

num=0

def add_num1():
    # 上锁
    lock.acquire()
    for i in range(10000000):
        global num
        num=num+1
    # 释放锁
    lock.release()
    print("add_num1:",num)

def add_num2():
    # 上锁
    lock.acquire()
    for i in range(10000000):
        global num
        num=num+1
    # 释放锁
    lock.release()
    print("add_num2:",num)

def main():
    add_num1_thread = threading.Thread(target=add_num1)
    add_num2_thread = threading.Thread(target=add_num2)
    add_num1_thread.start()
    add_num2_thread.start()

if __name__ == "__main__":
    main()

