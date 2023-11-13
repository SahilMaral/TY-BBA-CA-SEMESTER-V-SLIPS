class MyClass:
    def accept_string(self):
        self.string = input("Enter a string: ")
    def print_string(self):
        print(self.string)

class Country:
    def printNationality(self):
        print("I am from India")

class State(Country):
    def printState(self):
        print("I am from Maharashtra")

def print_details():
    s = State()
    s.printState()
    s.printNationality()

obj = MyClass()
obj.accept_string()
obj.print_string()
print_details()
