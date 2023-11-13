from tkinter import *

def update_font():
    name = "Arial" if var_name.get() else "Times New Roman"
    size = 20 if var_size.get() else 12
    weight = "bold" if var_bold.get() else "normal"
    label.config(font=(name, size, weight))

top = Tk()

top.title("Label Font Style")
top.geometry("400x400")

label = Label(top, text="Hello, world!")
label.place(x=120,y=10)

var_name = BooleanVar()
c1 = Checkbutton(top, text="Arial", variable=var_name, command=update_font)
c1.place(x=10,y=40)

var_size = BooleanVar()
c2 = Checkbutton(top, text="20", variable=var_size, command=update_font)
c2.place(x=10,y=70)

var_bold = BooleanVar()
c3 = Checkbutton(top, text="Bold", variable=var_bold, command=update_font)
c3.place(x=10,y=100)

top.mainloop()
