# validationTechniques.py
# A program to demonstrate different types of validation techniques
# e.g. range check, length check and type check
# Reference: http://www.easypythondocs.com/validation.html

# Only lets the user input a number between 13 and 19 for their age
# if you try entering something below or higher it tells you to enter a number between 13 and 19
# it then repeats your age back to you
print("Example 1") # For this example enter the number 12 then try 16
print("---------")
def main():
    isTeenager = False
    while not isTeenager:
            age = int(input("How old are you? "))
            if age >= 13 and age <= 19:
                isTeenager = True
            else:
                print("ERROR: You must enter a valid number between 13 and 19.")

            print("You are a teenager aged " + str(age))
main()

# Only accepts a password that is longer than 5 characters, if it is too short it will display and error
# and ask for another password to be entered. When a long enough password is entered it will repeat it back to you
print("Example 2") # For this example enter passwords of different lengths
print("---------")
def main():
    isLongEnough = False
    while not isLongEnough:
        password = input("Enter password at least 5 characters: ")
        if len(password) >= 5:
            isLongEnough = True
        else:
            print("ERROR: Password entered is too short.")
    print("Your password entered is: " + password)
main()

# Only accepts integer inputs from the user. Prompts the user for their age and if they enter anything but a number it wont accept it
# when you try inputting a letter or word it will display an error and ask for you to enter something else
# when a number is inputted it will repeat how old you are
print("Example 3") # For this example enter non-numeric data e.g. q or w or etc.
print("---------")
def main():
    validInteger = False
    while not validInteger:
        age = input("How old are you? ")
        if age.isdigit():
            validInteger = True
        else:
            print("ERROR: You must enter a valid number.")
    print("You are " + str(age))
main()