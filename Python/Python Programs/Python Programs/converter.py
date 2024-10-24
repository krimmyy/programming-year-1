# converter.py
# A program to convert Celsius to Fahrenheit
# by Eligijus Ciza

def main():
    # Input - prompt the user to enter the celsius
    celsius = int(input("Enter Celsius "))

    # Process - converts celsius to fahrenheit
    fahrenheit = (9.0/5.0) * celsius + 32

    # Output - display fahrenheit to the user
    print("The celsius in fahrenheit is ",fahrenheit)

main()
