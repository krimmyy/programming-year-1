# exceptions.py
# A program to demonstrate different types of exception handling techniques
# e.g. except ValueError and catch all exceptions
# Reference: http://www.easypythondocs.com/validation.html

#
print("Example 1")
print("---------")
def main():
    validInteger = False
    while not validInteger:
        try:
            age = int(input("How old are you? "))
            validInteger = True
        except ValueError:
            print("ERROR: You must enter a valid number.")
    print("You are " + str(age))
main()
'''
print("Example 2")
print("---------")
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

print("Example 3")
print("---------")
def main():
    isTeenager = False
    errorMessage = "ERROR: You must enter a valid number between 13 and 19."
    while not isTeenager:
        try:
            age = int(input("How old are you? "))
            if age >= 13 and age <= 19:
                isTeenager = True
            else:
                print(errorMessage)
        except:
            print(errorMessage)
    print("You are a teenager aged " + str(age))
main()

print("Example 4")
print("---------")
def main():
    age = getInteger("What is your age? ")
    players = getInteger("How many players in the game? ")
    print("You're age is: " + str(age))
    print("Number pf players: " + str(players))
def getInteger(message):
    while True:
        try:
            userInt = int(input(message))
            return userInt
        except ValueError:
            print("ERROR: You must enter an integer.")
main()
'''