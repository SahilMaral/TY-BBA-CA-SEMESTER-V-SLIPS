from tkinter import *

digit_words = {
    "0": "Zero",
    "1": "One",
    "2": "Two",
    "3": "Three",
    "4": "Four",
    "5": "Five",
    "6": "Six",
    "7": "Seven",
    "8": "Eight",
    "9": "Nine"
}
def words():
    number = entry.get()
    words = ""
    for digit in number:
        words += digit_words[digit] + " "
    label.config(text=words)

top = Tk()
top.title("Number to Words Converter")
top.geometry("400x400")

l1 = Label(top, text="Enter a number: ").place(x=10,y=10)

entry = Entry(top)
entry.place(x=100,y=10)

button = Button(top, text="Convert", command=words).place(x=110,y=40)

label = Label(top)
label.place(x=50,y=70)

top.mainloop()
