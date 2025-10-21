import re

test=("苹果是黄色的\n"
      "香蕉是绿色的\n"
      "西瓜是白色的\n"
      "彩虹是五颜六色的")

print(test)
print("=======================")

_re = re.compile(r'.色',re.M,re.S,re.U,re.X,re.A,re.I,re.L)

for re_ in _re.findall(test):
    print(re_)

re.A #
re.M # 多行匹配
re.S # 让.匹配包括换行符在内的所有字符
re.U # 根据Unicode字符集解析字符。这个标志影响 \w, \W, \b, \B.
re.X # 该标志通过给予你更灵活的格式以便你将正则表达式写得更易于理解。