class Ractangle():
    def __init__(self,l,w):
        self.l = l
        self.w = w
    def rectangle_area(self):
        return self.l*self.w
    def rectangle_Perimeter(self):
        return (self.l*2)+(self.w*2)
    
l = int(input('Enter a length:'))
w = int(input('Enter a width:'))
obj = Ractangle(l,w)
print("Area of rectangle is: ",obj.rectangle_area())
print("Perimeter of rectangle is: ",obj.rectangle_Perimeter())