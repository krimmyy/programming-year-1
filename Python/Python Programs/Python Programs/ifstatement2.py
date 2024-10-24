# password.py
# A program that prompts the user to enter
# a password then displays a message if
# the password is correct or not
# by Eligijus Ciza

def main():
    # Initializing the variable
    message = "No message"

    # Input - prompts the user to enter a password
    password = input("Enter the password: ")

    # Process - determines whether the correct password
    # was entered
    if (password == "prospero"):
        message ="Password accepted."

    else:
         message ="Sorry, that password is not correct."
         
    #  Output - displays the message
    print(message)

    main()
