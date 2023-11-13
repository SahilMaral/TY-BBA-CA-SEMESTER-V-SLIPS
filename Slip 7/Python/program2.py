from tkinter import *
import string,random

def pwd():
    clr()
    String = random.sample(string.ascii_letters, 6) + random.sample(string.digits, 4)
    random.shuffle(String)
    pwd = ''.join(String)
    e1.insert(10, str(pwd))

def clr() :
    e1.delete(0, END)

top = Tk()

top.title("random generator")
top.geometry("400x400")

l1 = Label(top, text = "Password: ").place(x=10,y=10)
e1 = Entry(top)
e1.place(x=80,y=10)
    
b1 = Button(top,text = "View",command = pwd).place(x=50,y=40)
b2 = Button(top,text = "Clear", command = clr).place(x=100,y=40) 

top.mainloop()