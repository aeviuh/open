import PyOfficeRobot

#发消息
PyOfficeRobot.chat.send_message(who='aeviih',message='你好')
"""

who: 联系人,可备注
message: 消息内容
"""

'''
#换行
PyOfficeRobot.chat.send_message(who='aeviih',message='你好'+'{ctrl}{enter}'+'你好')
'''