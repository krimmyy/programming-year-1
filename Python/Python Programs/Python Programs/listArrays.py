# listArrays.py
# A program to demonstrate different functions and methods of lists
'''
# stores numbers in array list and displays them to the user
print("Example 1")
print("---------")
numbers = [1, 2, 3, 4, 5]
print(numbers)

# stores numbers in a list from 0 to 5 and then repeats and displays numbers from 0 to 4
print("Example 2")
print("---------")
numbers = list(range(0, 5))
for i in range(5):
    print(numbers[i])
 
# stores a list of numbers from 0 to 5 and then calculates the length of the numbers list
# displays the list of numbers the amount of times depending on the length of the list
print("Example 3")
print("---------")
numbers = list(range(0, 5))
for i in range(len(numbers)):
    print(numbers[i])

# stores a list of numbers from 0 to 5 which goes up in increments of 2
# displays the list of numbers the amount of times depending on the
# length of the list
print("Example 4")
print("---------")
numbers = list(range(0, 5, 2))
for i in range(len(numbers)):
    print(numbers[i])
 
# stores a list of weekdays in a list then displays the days 
# checks if sunday is in the list of weekdays and if it is displays
# "It's here" and if not there displays "Not here" to the user
print("Example 5")
print("---------")
weekDays = ["Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
print(weekDays[2:6])
find = "Sunday"
if find in weekDays:
    print("It's here")
else:
    print("Not here")
'''
# 
print("Example 6")
print("---------")
print()
numbers = []
response = "y"
while response == "y":
    number = int(input("Enter a number: "))
    numbers.append(number)
    response = input("Enter another? > ")
for number in numbers:
    print(number)
 
    