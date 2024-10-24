# voidfunctionschal2.py
# a program to demonstrate modularisation of code by organising code into functions
# by Eligijus Ciza

print("Challenge 2")
print("-----------")


def main():
    message("first")
    message("second")
    message("third")


def message(text):
    print("This is the message from the " + text + " message function.")
    print("This is a void function as no values are inside the brackets e.g. message(\"first\")")
    print("")

main()
