class demo:
    def get_String(self,str1):
        self.str1 = str1
    def print_String(self):
        print(self.str1.upper())
        print(self.str1[::-1].lower())
        
obj = demo()
obj.get_String("Hello World")
obj.print_String()