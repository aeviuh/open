import threading
import time

def sing(num):
    for i in range(num):
        print("唱歌")
        time.sleep(0.5)

def dance(num):
    for i in range(num):
        print("跳舞")
        time.sleep(0.5)


def main():
    #以元组的方式传递参数
    sing_thread = threading.Thread(target=sing,args=(3,))#创建线程对象
    #以字典的方式传递参数
    dance_thread = threading.Thread(target=dance,kwargs={"num":3})#创建线程对象

    sing_thread.start()#启动线程
    dance_thread.start()#启动线程

if __name__ == "__main__":
    main()