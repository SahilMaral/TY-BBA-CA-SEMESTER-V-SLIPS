class reverse:
    def __init__(self,str1):
        self.str1 = str1
        print("String in reverse: ",self.str1[::-1])
str1 = input("Enter a string: ")
obj = reverse(str1) 