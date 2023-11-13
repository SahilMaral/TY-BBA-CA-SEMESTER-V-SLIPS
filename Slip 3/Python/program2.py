class Student:
    def __init__(self, roll_no, name, age, gender):
        self.roll_no = roll_no
        self.name = name
        self.age = age
        self.gender = gender

class Test(Student):
    def __init__(self, roll_no, name, age, gender, marks1, marks2, marks3):
        super().__init__(roll_no, name, age, gender)
        self.marks1 = marks1
        self.marks2 = marks2
        self.marks3 = marks3

    def display(self):
        total_marks = self.marks1 + self.marks2 + self.marks3
        print("Roll No: ",self.roll_no)
        print("Name: ",self.name)
        print("Age: ",self.age)
        print("Gender: ",self.gender)
        print("Marks 1: ",self.marks1)
        print("Marks 2: ",self.marks2)
        print("Marks 3: ",self.marks3)
        print("Total Marks: ",total_marks)


obj1 = Test(1, "Aniket", 20, "Male", 80, 90, 70)
obj2 = Test(2, "Tejas", 21, "Male", 70, 80, 90)
obj3 = Test(3, "Pranesh", 22, "Male", 60, 70, 80)

obj1.display()
obj2.display()
obj3.display()
