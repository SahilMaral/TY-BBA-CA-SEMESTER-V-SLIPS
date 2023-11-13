class Employee:
    def __init__(self, id, name, department, salary):
        self.id = id
        self.name = name
        self.department = department
        self.salary = salary
        
class manager(Employee):
    def __init__(self, id, name, department, salary ,bonus):
        super(manager, self).__init__(id, name, department, salary)
        self.bonus = bonus
        
    def totalsalary(self):
        print(self.name,'got total salary :',self.salary+self.bonus)
        
obj = manager('1','Sahil','Game Designer',20000,8000)
obj1 = manager('2','Tejas','Software Developer',25000,6400)
obj.totalsalary()
obj1.totalsalary()