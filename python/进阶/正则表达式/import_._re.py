import re

test=("苹果是黄色的\n"
      "香蕉是绿色的\n"
      "西瓜是白色的\n"
      "彩虹是五颜六色的")

print(test)
print("=======================")

_re = re.compile(r'.色')

for re_ in _re.findall(test):
    print(re_)