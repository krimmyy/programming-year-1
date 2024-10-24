# question23.py
# a program to 
# by Eligijus Ciza

def main():
    # Initializing the variables
    pointsEarned = 0
    booksPurchased = 0

    # Input - prompts the user to enter the amount of books purchased
    booksPurchased = input("Please enter how many books you have purchased this month: ")

    # Process - calculates the amount of points earned depending on the amount of books purchased
    if (booksPurchased == 0):
        pointsEarned = 0
    elif (booksPurchased == 2):
        pointsEarned = 5
    elif(booksPurchased == 4):
        pointsEarned = 15
    elif(booksPurchased == 6,7):
        pointsEarned = 30
    else:
        pointsEarned = 50

    # Output - displays how many books purchased and how many points earned
    print("Number of books purchased this month: ", booksPurchased)
    print("Points earned this month = ", pointsEarned)

main()
