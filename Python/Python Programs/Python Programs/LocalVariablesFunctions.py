# localVariablesFunctions.py
# A program to demonstrate the use of local variables and their scope

import math

print("Example 2")
print("---------")


def main():
    areaSquare()
    areaCircle()


def areaSquare():
    length = int(input("Enter the length of the square > "))
    area = length ** 2
    print("")
    print("Area = " + str(area))


def areaCircle():
    radius = int(input("Enter the radius of the circle > "))
    area = 2 * math.pi * radius ** 2
    print("")
    print("Area = " + "{:.1f}".format(area))


main()

