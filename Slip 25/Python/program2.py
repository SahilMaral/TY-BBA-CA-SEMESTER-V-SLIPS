class Calculator:
    def __init__(self, a, b):
        self.a = a
        self.b = b

    def add(self):
        return self.a + self.b

    def subtract(self):
        return self.a - self.b

    def multiply(self):
        return self.a * self.b

    def divide(self):
        return self.a / self.b

a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

obj = Calculator(a, b)

print("1. Addition")
print("2. Subtraction")
print("3. Multiplication")
print("4. Division")

ch = int(input("Enter your choice: "))

if ch == 1:
    print("Result:", obj.add())
elif ch == 2:
    print("Result:", obj.subtract())
elif ch == 3:
    print("Result:", obj.multiply())
elif ch == 4:
    print("Result:", obj.divide())
