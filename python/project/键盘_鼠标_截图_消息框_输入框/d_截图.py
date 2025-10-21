# 安装依赖的三方库 Pillow

import pyautogui as pa

# 截取当前屏幕
pa.screenshot(imageFilename='screenshot.png')
"""
screenshot() 函数用于截取当前屏幕。
参数:
    imageFilename: 截取的屏幕保存的文件名,路径
        参数:
            imageFilename=: 截取的屏幕保存的文件名,路径
    region: 截取的屏幕区域,默认为全屏
        参数:(left, top, width, height)# 元组
            left: 截取的屏幕区域的左上角的x坐标
            top: 截取的屏幕区域的左上角的y坐标
            width: 截取的屏幕区域的宽度
            height: 截取的屏幕区域的高度
返回值:
    截取的屏幕图像。
"""