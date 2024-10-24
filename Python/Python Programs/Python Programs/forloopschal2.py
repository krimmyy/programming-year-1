# forloopschal2.py
# a program that displays the times tables for any number between 0 and 12
# by Eligijus Ciza

# main function to start the program
def main():
    # Initialising the variable
    # Input - prompts the user to enter a number of which they want to see the times tables for
    num = int(input("What numbers multiplication table do you want to see? -> "))

    # Process - calculates the times tables depending on which number the user inputs
    for i in range(1 , 13,):
        # Output - displays the times tables from 1 to 12 according to what number was picked
        print(num, 'x', i, '=', num * i)

main() # calls the main function
