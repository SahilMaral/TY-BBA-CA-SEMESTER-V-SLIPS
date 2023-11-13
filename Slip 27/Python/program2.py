from tkinter import *

def convert_number():
    number = int(entry.get())
    binary = bin(number)[2:]
    octal = oct(number)[2:]
    hexadecimal = hex(number)[2:]
    label.config(text=f"Binary: {binary}\nOctal: {octal}\nHexa: {hexadecimal}")

top = Tk()
top.title("Number Conversion")
top.geometry("400x400")
instruction = Label(top, text="Enter a number: ").place(x=10,y=10)

entry = Entry(top)
entry.place(x=120,y=10)

button = Button(top, text="Convert", command=convert_number).place(x=50,y=40)

label = Label(top)
label.place(x=50,y=70)

top.mainloop()
