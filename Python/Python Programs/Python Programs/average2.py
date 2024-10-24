# average2.py
# A program to average a set of numbers
# using a why loop
# by Eligijus Ciza

# main function to start the program
def main():
    sum = 0 # Initialises the variable
    moreData = "yes"
    count = 0

    # Input - prompts the user for a number
    # then prompt if there is another number
    # Process - repeats whilst the user enters yes

    while moreData == "yes" or moreData == "y":
        x = int(input("Enter the number -> "))
        sum = sum + x
        count = count + 1
        moreData = input("Are there more numbers (Yes/No)? -> )")
        moreData = moreData.lower()

    # Process - calculates the average
    average = sum / count

    # Output - displays the value of the average to the user
    print("The average is " + str(average))

    # or

    print("The average is " + "{:.2f}".format(average))

main() # calls the main function
