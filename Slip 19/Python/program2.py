class Shape:
    def area(self):
        return 0
    def volume(self):
        return 0

class Square(Shape):
    def __init__(self, length):
        self.length = length
    def area(self):
        return self.length ** 2
    def volume(self):
        return self.length * self.length * self.length

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius
    def area(self):
        return 3.14 * self.radius ** 2
    def volume(self):
        return 0

obj = Square(5)
print("Area of square:", obj.area())
print("Volume of square:", obj.volume())

obj = Circle(3)
print("Area of circle:", obj.area())
print("Volume of circle:", obj.volume())
