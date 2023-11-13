from tkinter import *

def result() :
    Radius = int(RadiusField.get())
    Height = int(HeightField.get())
    volume = round(3.14*Height*Radius**2,2)
    area = round((2*3.14*Radius*Height)+(2*3.14*Radius**2),2)
        
    volumeField.insert(10, str(volume))
    areaField.insert(10, str(area))
  
if __name__ == "__main__" :

    top = Tk()
    top.title("cylinder surface area and volume of cylinder")
    top.geometry("400x400")
    
    radius = Label(top, text = "Enter a radius:").place(x=10,y=10)
    height = Label(top, text = "Enter a height:").place(x=10,y=40)
    area = Label(top, text = "Area: ").place(x=10,y=70)
    volume = Label(top, text = "Volume: ").place(x=10,y=100)
    
    resultbutton = Button(top, text = "Result", command = result)
    
    RadiusField = Entry(top)
    HeightField = Entry(top)
    volumeField = Entry(top)
    areaField = Entry(top)

resultbutton.place(x=50,y=150)
    
RadiusField.place(x=100,y=10)
HeightField.place(x=100,y=40)
volumeField.place(x=100,y=70)
areaField.place(x=100,y=100)

top.mainloop()