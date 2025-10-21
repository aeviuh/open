import socket

# 创建服务端套接字对象
tcp_server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
"""
AF_INET:地址类型，IPV4
SOCK_STREAM:套接字类型，TCP
"""

#设置端口复用
tcp_server.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)

#绑定ip地址和端口号
tcp_server.bind(("127.0.0.1", 8000))
"""
bind()方法:绑定ip地址和端口号
参数:元组(IP地址，端口号)
"""

#设置监听
tcp_server.listen(128)
"""
listen()方法:设置监听
参数:最大连接数
"""

#等待客户端连接,
client_socket, client_addr = tcp_server.accept()

"""
accept()方法:等待客户端连接
返回值:元组(客户端套接字对象，客户端地址信息)
"""

#接收客户端发送的数据,阻塞
recv_data = client_socket.recv(1024)

#打印接收到的数据
print("接收到的数据为:", recv_data.decode("utf-8"))

#发送数据给客户端
send_data = "hello"
client_socket.send(send_data.encode("utf-8"))

#关闭客户端套接字
client_socket.close()

#关闭服务端套接字
tcp_server.close()