# voidFunctions.py
# A program to demonstrate modularisation of code by organising code into functions

print("Example 1")
print("---------")


def main():
    message1()
    message2()


def message1():
    print("This is the message from the first message function.")
    print("This is a void function as no values are inside the brackets e.g. message1()")
    print("")


def message2():
    print("This is the message from the second void function.")
    print("This is a void function as no values are inside the brackets e.g. message2()")
    print("")


main()
