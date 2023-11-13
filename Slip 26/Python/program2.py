from tkinter import *

def alter_sentence():
    sentence = entry.get()
    sentence = sentence.replace(" ", "*")
    sentence = sentence.swapcase()
    sentence = "".join(["?" if char.isdigit() else char for char in sentence])
    label.config(text=sentence)

top = Tk()

top.title("Sentence Alteration")
top.geometry("400x400")

instruction = Label(top, text="Enter a sentence: ").place(x=10,y=10)

entry = Entry(top)
entry.place(x=120,y=10)

button = Button(top, text="Alter", command=alter_sentence).place(x=100,y=40)

label = Label(top)
label.place(x=50,y=70)

top.mainloop()
