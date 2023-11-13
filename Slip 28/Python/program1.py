from tkinter import *
courses = [
    "Introduction to Computer Science",
    "Data Structures and Algorithms",
    "Operating Systems",
    "Computer Networks",
    "Database Systems",
    "Artificial Intelligence",
    "Computer Graphics",
    "Software Engineering",
    "Computer Security",
    "Web Development"
]
top = Tk()

top.title("Computer Science Courses")
top.geometry("400x400")

instruction = Label(top, text="Select a course: ").place(x=10,y=10)

listbox = Listbox(top)

for course in courses:
    listbox.insert(END, course)
listbox.place(x=120,y=10)

top.mainloop()
