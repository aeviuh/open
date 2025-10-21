import re

test=("苹果是黄色的的的\n"
      "香蕉是绿色的的的的\n"
      "西瓜是白色的的\n"
      "彩虹是五颜六色的\n"
      "的的是\n")

print(test)
print("=======================")

_re = re.compile(r'.色的{2,3}')

for re_ in _re.findall(test):
    print(re_)