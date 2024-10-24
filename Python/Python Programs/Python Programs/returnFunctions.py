# returnFunctions.py
# A program to demonstrate parameter passing and returns

print("Example 4")
print("---------")


def main():
    length = getLength()
    breadth = getBreadth()
    area = calculateArea(length, breadth)
    displayResults(area)


def getLength():
    length = int(input("Enter the length of the rectangle > "))
    return length


def getBreadth():
    breadth = int(input("Enter the breadth of the rectangle > "))
    return breadth


def calculateArea(length, breadth):
    area = length * breadth
    return area

def displayResults(area):
    print("")
    print("Area = " + str(area))


main()

