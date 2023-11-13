from tkinter import *

def calculate_volume():
    radius = float(entry.get())
    volume = (4/3) * 3.14 * radius ** 3
    label.config(text=f"The volume of the sphere is {volume:.2f}")

top = Tk()

top.title("Sphere Volume Calculator")
top.geometry("400x400")

instruction = Label(top, text="Enter the radius: ").place(x=10,y=10)

entry = Entry(top)
entry.place(x=110,y=10)

button = Button(top, text="Calculate", command=calculate_volume).place(x=110,y=40)

label = Label(top)
label.place(x=50,y=70)

top.mainloop()
