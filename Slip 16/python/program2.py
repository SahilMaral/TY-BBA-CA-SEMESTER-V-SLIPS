import tkinter as tk

def add_item():
    listbox.insert(tk.END, entry.get())

def print_items():
    for item in listbox.curselection():
        print(listbox.get(item))

def delete_items():
    for item in reversed(listbox.curselection()):
        listbox.delete(item)

window = tk.Tk()
window.title("Listbox Example")

entry = tk.Entry(window)
entry.pack()

add_button = tk.Button(window, text="Add", command=add_item)
add_button.pack()

print_button = tk.Button(window, text="Print", command=print_items)
print_button.pack()

delete_button = tk.Button(window, text="Delete", command=delete_items)
delete_button.pack()

listbox = tk.Listbox(window)
listbox.pack()

window.mainloop()
