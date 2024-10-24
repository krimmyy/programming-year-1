# forloopschal1.py
# a program to show usage of for loops
# by Eligijus Ciza

# Output displays the title of the program
print("Challenge 1 For Loops")
print("---------------------")

# Process - repeats 5 times and adds another "*" for every new row
for i in range(6):
    for j in range(i):
        # Output - displays the rows and columns of "*"
        print ("*", end="")
    print()
