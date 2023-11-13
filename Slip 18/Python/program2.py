class Person:
    def __init__(self, name, address):
        self.name = name
        self.address = address

class Employee(Person):
    def __init__(self, name, address, salary):
        super().__init__(name, address)
        self.salary = salary

n = int(input("How many employees do you want to enter: "))
obj = []
for i in range(n):
    name = input("Enter the name of employee: ")
    address = input("Enter the address of employee: ")
    salary = input("Enter the staffed salary of employee: ")
    obj.append(Employee(name, address, salary))

for i in range(n):
    print("\nDetails of employee: ",i+1)
    print("Name: ",obj[i].name)
    print("Address: ",obj[i].address)
    print("Staffed Salary: ",obj[i].salary)
