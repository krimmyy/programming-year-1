# Challenge 1
print("Challenge1")
print("----------")
def main():
    validFloat = False
    while not validFloat:
        try:
            height = float(input('What is your height in cm? '))
            validFloat = True
        except ValueError:
            print("ERROR: You must enter a valid number.")
    print("Your height is: " + str(height))
main()

# Challenge 2
print("Challenge2")
print("----------")
def main():
    isLongEnough = False

    while not isLongEnough:
        pinNumber = input("Please enter a 4 digit Pin Number -> ")
    if len(pinNumber)=4:
        isLongEnough = True
    else:
        print("ERROR: Pin Number is not the right length!")

    validInteger = False

    while not validInteger:
        pinNumber = input("Enter ")
