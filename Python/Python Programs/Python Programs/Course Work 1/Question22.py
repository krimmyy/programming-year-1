# question22.py
# a program to convert miles to kilometres
# by Eligijus Ciza

def main():
    # Input - prompts the user to enter the number of miles
    miles = float(input("Please enter the number of miles: "))

    # Process - converts miles to kilometres
    kilometres = miles / 50 * 80

    # Output - display the kilometres to the user
    print("The distance of " + "{:.1f}".format(miles), "miles is equal to " + "{:.1f}".format(kilometres), "kilometres.")

main()
