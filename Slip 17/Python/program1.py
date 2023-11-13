from tkinter import *

def upper() :
        display.insert(20, str(str1.get().upper()))
top = Tk()
top.title("upper case")
top.geometry("400x400")

Stringin = Label(top, text = "Enter a String:").place(x=10,y=10)
result = Label(top, text = "Result").place(x=10,y=40)
str1 = Entry(top)
str1.place(x=100,y=10)
    
result = Button(top, text = "Result", command = upper).place(x=100,y=100)

display = Entry(top)
display.place(x=100,y=40)

top.mainloop()