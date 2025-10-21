"""
pyautogui库
    说明:
        1.对键盘鼠标进行自动化操作
    官方文档:
        URL_ADDRESS        https://pyautogui.readthedocs.io/en/latest/
    优势：
        1. 跨平台，支持Windows、Linux、MacOS等多个操作系统
        2. 支持多种鼠标和键盘操作，包括点击、拖拽、输入等
        3. 支持图像识别和自动化操作，例如查找并点击图像
    劣势：
        1. 只针对键鼠
        2. 可能会被操作系统拦截或检测，导致操作失败
"""

import pyautogui as pa


# 移动鼠标,到达指定位置
#pa.moveTo(100, 100, duration=0)
"""
参数x:到达屏幕分辨率距离左侧x像素
参数y:到达屏幕分辨率距离顶部y像素
参数duration:到达目的的时间,单位秒
"""


# 移动鼠标,相对当前位置移动
#pa.moveRel(100, 100, duration=0)
"""
参数x:相对当前位置,向右移动x像素
参数y:相对当前位置,向下移动y像素
参数duration:到达目的的时间,单位秒
"""


# 获取屏幕宽度和高度
#x , y = pa.size()#获取屏幕分辨率,返回一个元组,第一个元素为屏幕宽度,第二个元素为屏幕高度
#print(f"屏幕宽度: {x}, 屏幕高度: {y}")


# 获取鼠标位置
#x, y = pa.position()#获取鼠标当前位置,返回一个元组,第一个元素为鼠标当前位置的x坐标,第二个元素为鼠标当前位置的y坐标
#print(f"鼠标位置: x={x}, y={y}")


# 点击鼠标
#pa.click(x=100, y=100, clicks=1, interval=0, button='left')
"""
参数x:点击的位置的x坐标
参数y:点击的位置的y坐标
参数clicks:点击次数,默认为1
参数interval:点击之间的时间间隔,单位秒,默认为0
参数button:点击的按钮,默认为'left',可选值为'left','middle','right'
"""

# 按下鼠标
#pa.mouseDown(x=100, y=100, button='left')
"""
参数x:按下的位置的x坐标
参数y:按下的位置的y坐标
参数button:按下的按钮,默认为'left',可选值为'left','middle','right'
"""


# 松开鼠标
#pa.mouseUp(x=100, y=100, button='left')
"""
参数x:松开的位置的x坐标
参数y:松开的位置的y坐标
参数button:松开的按钮,默认为'left',可选值为'left','middle','right'
"""

# 鼠标滚动
#pa.scroll(clicks=1)
"""
参数clicks:滚动的数值,默认为1
正数:向上滚动
负数:向下滚动
"""


