class demo:
    def accept(self):
        self.no1 = int(input("Enter a first number: "))
        self.no2 = int(input("Enter a second number: "))
    def display(self):
        print("Addition of obj1 + obj2 of number 1 ",self.no1)
        print("Addition of obj1 + obj2 of number 2 ",self.no2)
    def sum(self, obj1, obj2):
        self.no1 = obj1.no1 + obj2.no1
        self.no2 = obj1.no2 + obj2.no2

obj1 = demo()
obj2 = demo()
obj3 = demo()

print("Enter first complex number: ")
obj1.accept()

print("Enter second complex number: ")
obj2.accept()

print("Sum of two complex number are: ")
obj3.sum(obj1, obj2)
obj3.display()