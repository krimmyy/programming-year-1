# localvariablesfunctionschal1.py
# A program to demonstrate the use of local variables and their scope
# by Eligijus Ciza

print("Challenge 1")
print("-----------")


def main():
    areaRectangle()
    areaTriangle()


def areaRectangle():
    width = int(input("Enter the width of the rectangle -> "))
    height = int(input("Enter the height of the rectangle -> "))

    area = width * height

    print("")
    print("The area of the rectangle is " + str(area))

    print("")

def areaTriangle():
    a = float(input("Enter first side -> "))
    b = float(input("Enter second side -> "))
    c = float(input("Enter third side -> "))

    s = (a + b + c) / 2

    area = (s*(s-a)*(s-b)*(s-c)) ** 0.5

    print("")
    print("The area of the triangle is " + "{:.1f}".format(area))

main()

