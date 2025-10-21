from urllib.request import urlopen
# 不建议在较高python版本使用,3.8即可

# 要爬取的网页
url = "http://www.baidu.com"


# 打开网页
resp = urlopen(url)


# 读取网页内容,保存到变量中
content = resp.read().decode('utf-8')
# html网页的hand下 charset=UTF-8 查看网页编码方式
# 调用 resp.read() 方法时，它会一次性读取响应的所有内容
# 在你第一次调用 resp.read().decode('utf-8') 并打印内容之后
# 响应的游标已经移动到了数据的末尾，再次调用 resp.read() 时
# 返回的将是一个空字节串，因此保存到文件中的内容为空
# 为了解决这个问题，你可以将读取到的内容保存到一个变量中


# 将爬取的内容保存到文件中
with open("aeviih.html", "w", encoding="utf-8") as f:
    f.write(content)


print("爬取完成")