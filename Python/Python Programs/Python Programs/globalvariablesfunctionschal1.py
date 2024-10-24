# globalVariablesFunctions.py
# A program to demonstrate the use of global variables and their scope
# by Eligijus Ciza

print("Challenge 1")
print("-----------")

length = 0
breadth = 0
area = 0
perimeter = 0

def main():
    getMeasurements()
    areaRectangle()
    perimeterRectangle()
    displayResults()


def getMeasurements():
    global length, breadth
    length = int(input("Enter the length of the rectangle > "))
    breadth = int(input("Enter the breadth of the rectangle > "))


def areaRectangle():
    global area
    area = length * breadth

def perimeterRectangle():
    global perimeter, length, breadth
    perimeter = 2 * (length + breadth)

def displayResults():  
    print("")
    print("Area = " + str(area))
    print("Perimeter = " + str(perimeter))

main()

