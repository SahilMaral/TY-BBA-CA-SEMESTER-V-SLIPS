from tkinter import *

top = Tk()
top.title("Label Example")
top.geometry("600x150")

my_label = Label(top, text="Hello World!",font=("Arial Bold", 70)).place(x=10,y=10)
top.mainloop()
