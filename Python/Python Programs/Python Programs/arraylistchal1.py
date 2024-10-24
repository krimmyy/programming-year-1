# arraylistchal1.py
# a program to solve challenge 1 for array lists
# by Eligijus Ciza

def main():

    print("Challenge 1")
    print("-----------")
    print()
    numbers = [23, 59, 12, 1, 43, 7, 36]

    print("Min -> ", min(numbers))
    print("Max -> ", max(numbers))
    print("Middle number -> ", numbers[3])
    numbers.insert(1, 4)
    numbers.insert(4, 5)
    print("New list -> ", numbers)
    numbers.remove(36)
    print("Updated list -> ", numbers)
    numbers.sort()
    print("Sorted in ascending order -> ",numbers)
    numbers.reverse()
    print("Sorted in descending order -> ", numbers)

main()
