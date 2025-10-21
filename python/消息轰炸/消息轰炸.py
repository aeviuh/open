import pyautogui as pa
import pyperclip
import time


def main():
    # 取消PyAutoGUI的所有默认延迟
    pa.PAUSE = 0
    # 禁用安全特性（移动鼠标到角落会触发中断）
    pa.FAILSAFE = False

    count = int(input("发送次数:"))
    times = float(0.05)
    content = str(input("发送内容:"))
    if(content =="-y"):
        times = float(input("设置时间间隔(最好不小于0.02,最多2位小数)>>>"))
        content = str(input("发送内容:"))
        pyperclip.copy(content)
    else:
        pyperclip.copy(content)
    print()

    print(f"发送的次数:{count}")
    print(f"发送的内容:{content}")

    print("即将执行...(每次发送默认时间间隔为:0.06s)")
    for i in range(5, 0, -1):
        print(i, end=' ', flush=True)
        time.sleep(1)
    print("\n开始执行...")

    # 预获取粘贴内容避免每次调用pyperclip
    paste_content = pyperclip.paste()

    for _ in range(count):
        pa.hotkey('ctrl', 'v')
        pa.press('enter')
        time.sleep(times)


if __name__ == '__main__':
    main()