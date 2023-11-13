from tkinter import *
from time import strftime

def update_time():
    string = strftime('%H:%M:%S')
    v1.config(text=string)
    v1.after(1000, update_time)

top = Tk()

top.title('Digital Clock')
top.geometry("80x40")

v1 = Label(top)
v1.place(x=10,y=10)

update_time()

top.mainloop()
