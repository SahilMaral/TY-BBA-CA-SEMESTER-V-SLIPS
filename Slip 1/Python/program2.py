from datetime import date
from tkinter import *

def calculate():
    birth = date(int(year.get()), int(month.get()), int(day.get()))
    today = date.today()
    age = today.year - birth.year
    l4.config(text=f"Your age is {age} years.")
top = Tk()

top.geometry("400x400")
top.title("Age Calculator")

l1 = Label(top, text="Day: ").place(x=10,y=10)
day = Entry(top, width=20)
day.place(x=60,y=10)

l2 = Label(top, text="Month: ").place(x=10,y=40)
month = Entry(top, width=20)
month.place(x=60,y=40)

l2 = Label(top, text="Year: ").place(x=10,y=70)
year = Entry(top, width=20)
year.place(x=60,y=70)

calculate_button = Button(top, text="Calculate Age", command=calculate).place(x=60,y=100)

l4 = Label(top)
l4.place(x=10,y=130)

top.mainloop()
