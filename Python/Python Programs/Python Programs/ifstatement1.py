# ifstatement1.py
# A program that calculates three test scores and displays
# the average. It congratulates the user if their average
# is a high score.
# by Eligijus Ciza

def main():
    # Initializing the variable
    high_score = 80

    # Input - prompts user for three different test scores
    test1 = int(input("Enter the score for test 1: "))
    test2 = int(input("Enter the score for test 2: "))
    test3 = int(input("Enter the score for test 3: "))

    # Process - calculates the average test score
    average = (test1 + test2 + test3) / 3

    # Output - displays the average test score
    print("The average test score is: ", average)

    # Process - if the average is a high score the user will be congratulated
    if average >= high_score:
        #Output - displays the congratulations message
        print("Congratulations!")
        print("That is a great average!")

    main()
