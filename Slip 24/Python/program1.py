def prime(no):
    if no < 2 or no % 2 == 0:
        return False
    for i in range(3, int(no**0.5) + 1, 2):
        if no % i == 0:
            return False
    return True
def factorial(n):
    sum = 1
    for i in range(1, n + 1):
        sum *= i
    return sum
number = int(input("Enter a number: "))
if prime(number):
    print(number, "is a prime number.")
else:
    print(number, "is not a prime number.")
print("The factorial of", number, "is", factorial(number))
