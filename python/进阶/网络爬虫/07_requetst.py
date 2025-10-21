import requests

url ="https://movie.douban.com/j/chart/top_list"

# 封装参数
param = {
    "type":"24",
    "interval_id":"100:90",
    "action":"",
    "start":"0",
    "limit":"20",
}
headers = {
    "User-Agent":"Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:137.0) Gecko/20100101 Firefox/137.0"
}
resp = requests.get(url,params=param,headers=headers)
# print(resp.request.url) # 打印请求的url
print(resp.request.headers) # 打印请求的User-Agent
print(resp.json())
resp.close() # 关闭连接