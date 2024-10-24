# ifstatementchal1.py
# A program that congratulates the user if they enter the right answer
# by Eligijus Ciza

def main():
    # Initializing the variable
    message = "No message"

    # Input - prompts the user to answer the question
    answer = input(int("What is 2 + 4? "))

    # Process - determines whether the correct
    # answer was entered
    if (answer == "6"):
        message ="Well done!"
    else:
         message ="Hard luck, that is not the correct answer."

         # Output - displays the message
         print(message)

    main()
