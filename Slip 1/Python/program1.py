marks =[]
no = int(input("Enter number of elements : "))
for i in range(no):
    value = int(input())
    marks.append(value)
print(marks)
new_marks=[]
for x in marks:
    if x not in new_marks:
        new_marks.append(x)
print(new_marks)