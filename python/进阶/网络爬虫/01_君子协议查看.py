# 要爬取的网页
url = "http://www.baidu.com"


from urllib.request import urlopen
url = url+'/robots.txt'
# 打开网页
resp = urlopen(url)
# 读取网页内容,打印
# print(resp.read()) # 二进制数据
print(resp.read().decode('utf-8')) # 字符串数据
# html网页的hand下 charset=UTF-8 查看网页编码方式