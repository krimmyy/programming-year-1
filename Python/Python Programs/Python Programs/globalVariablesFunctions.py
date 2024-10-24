# globalVariablesFunctions.py
# A program to demonstrate the use of global variables and their scope

print("Example 3")
print("---------")

length = 0
breadth = 0
area = 0


def main():
    getMeasurements()
    areaRectangle()
    displayResults()


def getMeasurements():
    global length, breadth
    length = int(input("Enter the length of the rectangle > "))
    breadth = int(input("Enter the breadth of the rectangle > "))


def areaRectangle():
    global area
    area = length * breadth


def displayResults():  
    print("")
    print("Area = " + str(area))


main()

