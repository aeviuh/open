import re

test = "你好,世界,不好.正好"

testlist01 = test.split(",") # 利用split函数切割字符串
print("testlist01:",testlist01)

testlist02 = re.split(r'[,.]',test) # 利用正则表达式切割字符串,更加强大
print("testlist02:",testlist02)