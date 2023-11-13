class demo():
    def get_String(self, str1):
        self.str1 = str1
    def print_String(self):
        print(self.str1.upper())
obj = demo()
str1 = input("Enter a string: ")
obj.get_String(str1)
obj.print_String()