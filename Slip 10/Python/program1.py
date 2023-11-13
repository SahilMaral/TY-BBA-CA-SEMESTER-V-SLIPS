from tkinter import *
from tkinter import messagebox

def ck():
    messagebox.showinfo('button','Button is pressed')

top = Tk()

top.geometry("400x400")
l1 = Label(top,text="Message from button").pack()
b1 = Button(top, text="Button",command = ck).pack()

top.mainloop()