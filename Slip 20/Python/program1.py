class Circle:
    def __init__(self, radius):
        self.radius = radius
    def area(self):
        return 3.14 * self.radius ** 2
    def circumference(self):
        return 2 * 3.14 * self.radius
obj = Circle(5)
print("The area of the circle is", obj.area())
print("The circumference of the circle is", obj.circumference())
