# commonErrors.py
# A program to demonstrate different types of errors
# e.g. SyntaxError, ValueError, Type Error and NameError

# Returns a Syntax Error as the bracket at the end is not closed
# can be fixed by adding an extra bracket
print("Example 1") # For this example enter the number 12
print("---------")
def main():
    number = int(input("Please enter a number: ")
    result = number / 2
    print()
    print("The half of " + str(number) + " is " + str(result))
main()

# Value Error as you are trying to enter a negative number which the program cannot work out the square root for
# can be fixed by entering a positive number
print("Example 2") # For this example enter the number -100
print("---------")
import math
def main():
    number = int(input("Please enter a number: "))
    result = math.sqrt(number)
    print()
    print("The half of " + str(number) + " is " + str(result))
main()

# Exception thrown as the number the user inputs is stoerd s a string which cannot be divided by 2
# can be fixed by converting the number entered by the user to an integer which can then be divided
print("Example 3") # For this example enter the number 12
print("---------")
def main():
    number = input("Please enter a number: ")
    result = number / 2
    print()
    print("The half of " + str(number) + " is " + str(result))
main()

# Exception thrown as program is searching for a "res" to put the value there but there is no variable called res
# can be fixed by changing to "res = number / 2"
print("Example 4") # For this example enter the number 12
print("---------")
def main():
    number = int(input("Please enter a number: "))
    result = number / 2
    print()
    print("The half of " + str(number) + " is " + str(res))
main()