"""
requests库
"""

import requests

url = "https://fanyi.baidu.com/sug"

a=str(input("请输入要查询的单词:"))

dat = {
    "kw":f"{a}"
}

# 发送post请求
resp = requests.post(url,data=dat) # Data代表提交的表单数据
print(resp)

print(resp.json()) # 将服务器返回的内容直接处理成json(),返回的是一个字典