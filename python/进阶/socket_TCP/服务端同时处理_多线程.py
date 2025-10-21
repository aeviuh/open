import socket
import threading

# 处理客户端请求的函数
def handle_client(client_socket, client_addr):
    # 接收客户端发送的数据
    recv_data = client_socket.recv(1024)
    # 打印接收到的数据
    print("接收到的数据为:", recv_data.decode("utf-8"))
    # 发送数据给客户端
    send_data = "hello"
    client_socket.send(send_data.encode("utf-8"))
    # 关闭客户端套接字
    client_socket.close()

if __name__ == "__main__":

    tcp_server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    tcp_server.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    tcp_server.bind(("127.0.0.1", 8000))
    tcp_server.listen(128)

    while True:
        # 等待客户端连接
        print("等待客户端连接...")
        client_socket, client_addr = tcp_server.accept()
        print("客户端连接成功:", client_addr)

        # 创建子线程处理客户端请求
        sub_thread = threading.Thread(target=handle_client, args=(client_socket, client_addr))
        sub_thread.start()

    # 关闭服务端套接字
    tcp_server.close()