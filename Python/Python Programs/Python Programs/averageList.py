# averageList.py
# a program to calculate the average
# from a list of scores


def main(): # main function to start the program

    # creates and stores data in an array list (1D array)
    scores = [2.0, 1.9, 1.5, 1.3, 1.5]

    # initialises the variable
    sum = 0

    # repeats to calculate the running total
    for score in scores:
        sum = sum + score

    # calculates the average
    average = sum / len(scores)

    # displays the average to the user
    print("Average -> " + "{:.2f}".format(average))
main()
