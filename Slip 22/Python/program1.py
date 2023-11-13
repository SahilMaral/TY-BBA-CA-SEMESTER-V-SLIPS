class RepeatString:
    def __init__(self, string):
        self.string = string
    def __mul__(self, n):
        if n > 0:
            return self.string * n
obj = RepeatString("Hello ")
n = int(input("Enter a number: "))
print(obj.__mul__(n))
