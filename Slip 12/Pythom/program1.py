from tkinter import *

top = Tk()

top.title("Font Style")
top.geometry("400x400")

l1 = Label(top, text="Hello World", font=("Times New Roman Bold",50)).pack()

top.mainloop()