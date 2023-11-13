from tkinter import *

def check():
    number = int(entry.get())
    is_prime = True
    for i in range(2, int(number ** 0.5) + 1):
        if number % i == 0:
            is_prime = False
            break
    is_perfect = False
    if sum([i for i in range(1, number) if number % i == 0]) == number:
        is_perfect = True
    is_armstrong = False
    if sum([int(digit) ** len(str(number)) for digit in str(number)]) == number:
        is_armstrong = True
    result = f"Number {number} is "
    if is_prime:
        result += "prime"
    elif is_perfect:
        result += "perfect"
    elif is_armstrong:
        result += "Armstrong"
    else:
        result += "not prime, perfect, or Armstrong"
    label.config(text=result)

top = Tk()

top.title("Number Checker")
top.geometry("400x400")

instruction = Label(top, text="Enter a number: ").place(x=10,y=10)

entry = Entry(top)
entry.place(x=120,y=10)

var = StringVar()
radio_prime = Radiobutton(top, text="Prime", variable=var, value="prime")
radio_prime.place(x=30,y=40)
radio_perfect = Radiobutton(top, text="Perfect", variable=var, value="perfect")
radio_perfect.place(x=30,y=70)
radio_armstrong = Radiobutton(top, text="Armstrong", variable=var, value="armstrong")
radio_armstrong.place(x=30,y=100)

button = Button(top, text="Check", command=check)
button.place(x=50,y=130)

label = Label(top)
label.place(x=30,y=170)

top.mainloop()
