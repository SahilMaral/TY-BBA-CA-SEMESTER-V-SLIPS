try:
    num = int(input("Enter a number: "))
    if num <= 0:
        print("The number is not positive.")
    else:
        print("The number entered is positive.")
except ValueError:
    print("Invalid Integer.")
