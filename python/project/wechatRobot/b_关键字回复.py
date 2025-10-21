import PyOfficeRobot

# 关键字设置
keywords = {
    '你好': '不好',
    '你是谁': '不知道',
    '1+1=?': '3',
    '6': '6',
}

# 回复的对象
PyOfficeRobot.chat.chat_by_keywords(who='aeviih', keywords=keywords)
"""
who: 联系人,可备注
keywords: 关键字字典
"""