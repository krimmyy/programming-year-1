# CW2.py
# a program to work out the users credit score
# by Eligijus Ciza


totalLimit = 0
totalBal = 0
accounts = ""
elecRoll = ""
missingPymts = ""
ccjs = ""
indicator = ""

def main():
    welcome()
    creditCards()
    cardBalance()
    cardLimit()
    newAccount()
    electoralRoll()
    missingPayments()
    ccj()
    creditScore()
    scoreIndicator()
    summary()

def welcome():
    print("Thankyou for using CreditScore!")
    print("===============================")

def creditCards():
    global noOfCards
    validCards = False
    while not validCards:
        try:
            noOfCards = int(input("How many credit cards? (0-3)? "))
            if 0 < noOfCards >3:
                print("ERROR: Invalid number of cards must be between 0-3, please re-enter!")
            elif noOfCards == 0:
                print("You cannot calculate a credit score with 0 credit cards, Thankyou!")
            else:
                validCards = True
        except ValueError:
            print("You must enter a valid number!")

def cardBalance():
    global noOfCards, totalBal
    count = 0
    balance = 0.0

    while count < noOfCards:
        valid = False
        count +=1
        while not valid:
            balance = float(input("What is the balance of card "+ str(count) +"(0-10,000)? " ))
            if 0 < balance > 10000:
                print("ERROR: Invalid balance please re-enter.")
            else:
                totalBal= totalBal + balance
                valid = True

def cardLimit():
    global noOfCards, totalLimit
    count = 0
    limit = 0.0
    while count < noOfCards:
        valid = False
        count +=1
        while not valid:
            limit = float(input("What is the limit of card " + str(count) +"(0-10,000)? " ))
            if 0 < limit > 10000:
                print("ERROR: Invalid limit please re-enter")
            else:
                totalLimit = totalLimit + limit
                valid = True

def newAccount():
    global accounts
    valid = False
    while not valid:
        accounts = input("Have you opened any new accounts in the last 6 months? (Y or N)? ").upper()
        if accounts == "Y" or accounts == "YES":
            accounts = "Yes"
            valid = True
        elif accounts =="N" or accounts == "NO":
            accounts = "No"
            valid = True
        else:
             print("ERROR: Please enter a valid answer!")

def electoralRoll():
    global elecRoll
    valid = False
    while not valid:
        elecRoll = input("Are you registered on the Electoral Roll? (Y or N)? ").upper()
        if elecRoll == "Y" or elecRoll == "YES":
            elecRoll = "Yes"
            valid = True
        elif elecRoll == "N" or elecRoll == "NO":
            elecRoll = "No"
            valid = True
        else:
            print("ERROR: Please enter a valid answer!")

def missingPayments():
    global missingPymts
    valid = False
    while not valid:
        missingPymts = input("Do you have any records of missing payments? (Y or N)? ").upper()
        if missingPymts == "Y" or missingPymts == "YES":
            missingPymts = "Yes"
            valid = True
        elif missingPymts == "N" or missingPymts == "NO":
            missingPymts = "No"
            valid = True
        else:
            print("ERROR: Please enter a valid answer!")

def ccj():
    global ccjs
    valid = False
    while not valid:
        ccjs = input("Do you have any CCJs? (Y or N)? ").upper()
        if ccjs == "Y" or ccjs == "YES":
            ccjs = "Yes"
            valid = True
        elif ccjs == "N" or ccjs == "NO":
            ccjs = "No"
            valid = True
        else:
            print("ERROR: Please enter a valid answer!")


def creditScore():
    global totalBal, totalLimit, basePoints, accounts, elecRoll, missingPymts, ccjs
    basePoints = 400


    if totalLimit >=5000:
        basePoints +=50

    if totalLimit <=250:
        basePoints -=20

    if totalBal <=50:
        basePoints +=60

    if totalBal >=15000:
        basePoints -=30

    if totalBal <=0.3* totalLimit:
        basePoints +=90

    if totalBal >=0.9* totalLimit:
        basePoints -=50

    if accounts == "N" or accounts == "No":
        basePoints +=50

    if accounts == "Y" or accounts == "Yes":
        basePoints -=30

    if elecRoll == "Y" or elecRoll == "Yes":
        basePoints +=50

    if elecRoll == "N" or elecRoll == "No":
        basePoints -=20

    if missingPymts == "N" or missingPymts == "No":
        basePoints +=125

    if missingPymts == "Y" or missingPymts == "Yes":
        basePoints -=100

    if ccjs == "N" or ccjs == "No":
        basePoints +=175

    if ccjs == "Y" or ccjs == "Yes":
        basePoints -=150

def scoreIndicator():
    global basePoints, indicator
    indicator = ""

    if (0 < basePoints < 199):
        indicator = "VERY POOR"
    elif (200 < basePoints < 399):
        indicator = "POOR"
    elif (400 < basePoints < 599):
        indicator = "FAIR"
    elif (600 < basePoints < 799):
        indicator = "GOOD"
    else:
        indicator = "EXCELLENT"

def summary():
    global noOfCards, totalBal, totalLimit, basePoints, accounts, elecRoll, missingPymts, ccjs, indicator
    print("Summary")
    print("=======")
    print("Number of credit cards: " + str(noOfCards))
    print("Card            Balance           Limit")
    print("=======================================")



    print("=======================================")
    print("Total         "+ str(totalBal),"       " + str(totalLimit))

    print("New account in the last 6 mnths?: " + accounts)
    print("Electoral roll?:                  " + elecRoll)
    print("Missing payments?:                " + missingPymts)
    print("CCJ?                              " + ccjs)

    print("Credit score rating")
    print("===================")
    print("Score:      " + str(basePoints))
    print("Indicator:  " + indicator)

main()
