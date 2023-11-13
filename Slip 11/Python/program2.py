from tkinter import *

def change(color):
    top.config(bg=color)

top = Tk()

top.title("Color Menu")
top.geometry("400x400")

menubar = Menu(top)

colormenu = Menu(menubar)
colormenu.add_command(label="Red", command=lambda: change("red"))
colormenu.add_command(label="Green", command=lambda: change("green"))
colormenu.add_command(label="Blue", command=lambda: change("blue"))

menubar.add_cascade(label="Colors", menu=colormenu)

top.config(menu=menubar)

top.mainloop()
