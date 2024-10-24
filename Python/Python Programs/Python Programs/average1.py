# average1.py
# A program to work out the average from a set of numbers
# using for loops
# by Eligijus Ciza

# main function to start the program
def main():
    sum = 0 # Initialises the variable

    # Input - prompts the user for how many numbers
    n = int(input("How many numbers? -> "))

    # Input - prompt the user to enter the numbers to be averaged
    # Process - repeats the prompt for the exact amount of numbers
    for i in range(n):
        x = int(input("Enter number -> "))
        sum = sum + x               # Process - calculates the running total

    # Process - calculates the average
    average = sum / n

    # Output - displays the value of the average to the user
    print("The average is " + str(average))

    # or

    print("The average is " + "{:.2f}".format(average))

main() # calls the main function
