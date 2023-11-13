class InvalidDateException(Exception):
    pass

class Date:
    def __init__(self, day, month, year):
        if not self.valid_date(day, month, year):
            raise InvalidDateException("Invalid date")
        self.day = day
        self.month = month
        self.year = year

    def display_date(self):
        print("Date: ",self.day,"/",self.month,"/",self.year)

    def valid_date(self, day, month, year):
        if month < 1 or month > 12:
            return False
        if day < 1 or day > 31:
            return False
        if year > 2024:
            return False
        return True
try:    
    day = int(input("Enter day: "))
    month = int(input("Enter month: "))
    year = int(input("Enter year: "))
    date = Date(day, month, year)
    date.display_date()
except InvalidDateException as e:
    print(e)