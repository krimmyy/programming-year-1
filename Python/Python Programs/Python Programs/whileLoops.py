# whileLoops.py
# Program to show the different styles of While Loops

# repeats 10 times and adds 1 on each new line and stops before 10
print("Example 1")
print("---------")
i = 0
while i < 10:
    print(i)
    i += 1
 
# prompts the user to enter a positive number and tests to see if it is
# if not the program does not finish until a positive number is entered
print("Example 2")
print("---------")
print()
number = int(input("Please enter a positive number > "))
while number < 0:
    print("ERROR: The number is not a positive number.")
    number = int(input("Please enter a positive number > "))

# prompts the user to enter a number between 1 and 10 and tests to see if
# it is between 1 and 10 if not the user will be prompted to enter a new number
print("Example 3")
print("---------")
print()
number = int(input("Please enter a number between 1 and 10 > "))
while number < 1 or number > 10:
    print("ERROR: The number is not between 1 and 10.")
    number = int(input("Please enter a number between 1 and 10 > "))
 
# prompts the user to enter a username and password then tests to see if it
# is correct if not the user will be prompted to enter it again
print("Example 4")
print("---------")
print()
username = input("Please enter a username > ")
password = input("Please enter a password > ")
while username != "lfalls" and password != 10:
    print("ERROR: Invalid credentials.")
    username = input("Please enter a username > ")
    password = input("Please enter a password > ")
 
# prompts the user to enter a number and tests to see if a number is entered
# if a number is entered it asks for another if not the program ends
print("Example 5")
print("---------")
print()
response = "y"
while response == "y":
    number = int(input("Enter a number: "))
    response = input("Enter another? > ")

# prompts the user to enter a positive number then tests to see if it is
# if the number isnt positive it prompts the user again until they enter one
print("Example 6")
print("---------")
print()
while True:
    number = int(input("Enter a positive number: "))
    if number >= 0:
        break
    
