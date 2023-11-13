from tkinter import *

def show():
    num = int(e1.get())
    str1 = f"Table of {num}\n"
    for i in range(1, 10+1):
        str1 += f"{num} x {i} = {num*i}\n"
    l2.configure(text=str1)

top = Tk()
top.title("Multiplication Table")
top.geometry("400x400")

l1 = Label(top,text="Enter a number: ").place(x=10,y=10)
e1 = Entry(top)
e1.place(x=110,y=10)
b1 = Button(top, text="show",command=show).place(x=100,y=40)
l2 = Label(top)
l2.place(x=80,y=80)

top.mainloop()