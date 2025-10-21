"""
requests库
"""

import requests

url = "https://www.sogou.com/web?query=周杰伦"

headers = {
    # 使用浏览器抓包工具获取User-Agent,实现反爬
    # 反爬:UA检测,UA伪装
    "User-Agent" :"Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:137.0) Gecko/20100101 Firefox/137.0"
}

resp = requests.get(url,headers=headers) # 浏览器地址栏一定是get请求
print(resp)

print(resp.text) # 页面源码