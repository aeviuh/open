import threading
import time

def sing():
    for i in range(3):
        print("唱歌")
        time.sleep(0.5)

def dance():
    for i in range(3):
        print("跳舞")
        time.sleep(0.5)

def main():
    sing_thread = threading.Thread(target=sing)#创建线程对象
    dance_thread = threading.Thread(target=dance)#创建线程对象
    sing_thread.start()#启动线程
    dance_thread.start()#启动线程

if __name__ == "__main__":
    main()