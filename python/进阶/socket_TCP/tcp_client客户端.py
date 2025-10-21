import socket
"""
客户端
"""

# 创建客户端套接字对象
tcp_client=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
"""
AF_INET:地址类型，IPV4
SOCK_STREAM:套接字类型，TCP
"""

# 和服务器套接字建立连接
tcp_client.connect(("127.0.0.1",8000))
"""
参数:
    元组类型，第一个参数为服务器的IP地址，第二个参数为服务器的端口号
"""

# 发送数据
tcp_client.send("hello".encode("utf-8"))
"""
参数:
    发送的数据，类型为字节流
    编码方式为utf-8
"""

# 接收数据,阻塞
recv_data=tcp_client.recv(1024) # 1024代表最多接收1024字节的数据
recv_data=recv_data.decode("utf-8") # 解码
print("接收到的数据为:",recv_data)

# 关闭连接
tcp_client.close()
