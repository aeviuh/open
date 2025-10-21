import pyautogui as pa
import time
while True:
    time.sleep(0.2)
    x, y = pa.position()
    print(f"鼠标位置：({x}, {y})")