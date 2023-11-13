class Student:
    def __init__(self, student_name, marks):
        self.student_name = student_name
        self.marks = marks

student1 = Student("Sahil", 90)

print("Original")
print("Student name:", student1.student_name)
print("Marks:", student1.marks)

student1.student_name = "Tejas"
student1.marks = 95

print("Modify")
print("Student name:", student1.student_name)
print("Marks:", student1.marks)
