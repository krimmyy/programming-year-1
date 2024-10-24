# returnfunctionschal1.py
# A program to demonstrate parameter passing and returns
# by Eligijus Ciza

print("Challenge 1")
print("-----------")


def main():
    length = getLength()
    breadth = getBreadth()
    area = calculateArea(length, breadth)
    perimeter = calculatePerimeter(length, breadth)
    displayResults(area, perimeter)


def getLength():
    length = int(input("Enter the length of the rectangle > "))
    return length


def getBreadth():
    breadth = int(input("Enter the breadth of the rectangle > "))
    return breadth


def calculateArea(length, breadth):
    area = length * breadth
    return area

def calculatePerimeter(length, breadth):
    perimeter = 2 * (length + breadth)
    return perimeter

def displayResults(area, perimeter):
    print("")
    print("Area = " + str(area))
    print("Perimeter = " + str(perimeter))

main()

