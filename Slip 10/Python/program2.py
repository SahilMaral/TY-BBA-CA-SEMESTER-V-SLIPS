class p:
    def v(self,str1):
        stack, pchar = [], {"(":")","{":"}","[":"]"}
        for i in str1:
            if i in pchar:
                stack.append(i)
            elif len(stack) == 0 or pchar[stack.pop()] != i:
                return False
        return len(stack) == 0
obj = p()
print(obj.v("(){}[]"))
print(obj.v("(){{)}"))
print(obj.v("()"))
