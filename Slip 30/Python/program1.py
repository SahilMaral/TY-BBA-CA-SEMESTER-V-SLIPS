from tkinter import *

def count_occurrences():
    string = e1.get()
    char = e2.get()
    count = string.count(char)
    label.config(text=f"The character '{char}' occurs {count} times in the string")

top = Tk()

top.title("Character Occurrence Counter")
top.geometry("400x400")

l1 = Label(top, text="Enter a string:").place(x=10,y=10)

e1 = Entry(top)
e1.place(x=100,y=10)

l2 = Label(top, text="Enter a character:").place(x=10,y=40)

e2 = Entry(top)
e2.place(x=120,y=40)

button = Button(top, text="Count", command=count_occurrences).place(x=50,y=70)

label = Label(top)
label.place(x=50,y=100)

top.mainloop()
