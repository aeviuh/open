import pyautogui as pa
# 显示消息框
pa.alert(text='这是一个消息框', title='消息框', button='确定')
"""
alert() 函数用于显示消息框。它接受以下参数：
text：消息框的文本内容。
title：消息框的标题。
button：消息框的按钮文本。
"""
# 显示输入框
name = pa.prompt(text='请输入你的名字', title='输入框', default='')
"""
prompt() 函数用于显示输入框。它接受以下参数：
text：输入框的文本内容。
title：输入框的标题。
default：输入框的默认值。
返回值：
用户输入的文本内容。
如果用户点击取消按钮，则返回 None。
"""
print(name)