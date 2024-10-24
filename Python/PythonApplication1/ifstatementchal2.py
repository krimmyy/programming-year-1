# examresults.py
# A program that calculates the percentage of exam marks
# and displays the grade depending on the mark
# by Eligijus Ciza

def main():
    # Initializing the variable
    message = "No message"

    # Output - prompts the user to enter the total exam mark
    totalexam = input(int("Please enter the total exam mark "))
    # Output - prompts the user to enter their score
    score = input(int("Please enter your score "))

    # Process - calculates the percentage
    percentage = (score / totalexam * 100)

    # Process - sets the grade depending on the percentage
    if (percentage >=80):
        message = "You got the grade A!"
    elif (percentage >=60):
        message = "You got the grade B!"
    elif (percentage >=40):
        message = "You got the grade C!"
    else:
        message = "You failed!"

    main()
