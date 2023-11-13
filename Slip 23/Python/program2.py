class circles:
  def __init__(self, radius):
    self.radius = radius
  def __add__(self, other):
    return circles(self.radius + other.radius)
  def display_area(self):
    area = 3.14 * self.radius ** 2
    print(f"The area of the circle with radius: ",self.radius," is ",area)
obj1 = circles(2)
obj2 = circles(3)
obj3 = obj1 + obj2
obj1.display_area()
obj2.display_area()
obj3.display_area()
