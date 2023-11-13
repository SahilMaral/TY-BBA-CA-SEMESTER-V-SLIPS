from tkinter import *
import random

def change_bg_color():
    r = random.randint(0, 255)
    g = random.randint(0, 255)
    b = random.randint(0, 255)
    color = f"#{r:02x}{g:02x}{b:02x}"
    top.configure(bg=color)
    top.after(1000, change_bg_color)

top = Tk()

top.title("Background Color Changer")
top.geometry("400x400")

change_bg_color()

top.mainloop()
