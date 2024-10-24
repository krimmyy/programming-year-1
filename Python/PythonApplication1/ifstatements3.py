# magic8ball.py
# A program that displays a message based on a random number
# by Eligijus Ciza

import random

def main():
    # Initializing the variable
    message = "No message"

    # Output - prompts the user to enter a question
    print("Ask the magic 8 ball a question")
    print()

    # Input - pauses the screen
    input("Press any key when ready...")

    # Process - generates a random number between 1 and 8
    answer = random.ranint(1,8)

    # Process - sets the message base don the random number generated
    if (answer == 1):
        message = "It is certain"
    elif (answer == 2):
        message = "Outlook is good"
    elif (answer == 3):
        message = "You may rely on it"
    elif (answer == 4):
        message = "Ask again later"
    elif (answer == 5):
        message = "Concentrate and ask again"
    elif (answer == 6):
        message = "Very doubtful"
    elif (answer == 7):
        message = "the reply is no"
    else:
        message = "Don't count on it"

    # Output - displays the message
    print(message)
    print()

main()
