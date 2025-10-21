#导入线程模块
import threading

线程对象=threading.Thread()#创建线程对象,子线程
"""
方法threading.Thread参数说明:
  target:线程要执行的函数
  args:函数的参数,以元组的形式传递
  kwargs:函数的参数,以字典的形式传递
  name:线程的名称
  group:线程组，目前只能使用None
"""

#启动线程
线程对象.start()