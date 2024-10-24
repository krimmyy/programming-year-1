# whileloopschal2.py
# a program that adds two numbers together and displays the sum
# by Eligijus Ciza

print("While Loops Challenge 2")
print("-----------------------")
print()
response = "y"
while response == "y":
    number1 = int(input("Enter the first number -> "))
    number2 = int(input("Enter the second number -> "))
    sum = number1 + number2
    print(str(number1) + " + " + str(number2) + " = " + str(sum))
    response = input("Enter new numbers? ->")
