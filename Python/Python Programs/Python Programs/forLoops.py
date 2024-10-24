# forLoops.py
# Program to show the different styles of For Loops

# Repeats 4 times up to 3
print ("Example 1")
print ("---------")
for i in range(4):
    print(i)
    
# Repeats 5 times following the array
print ("Example 2")
print ("---------")
for i in [0, 1, 2, 3, 4]:
    print(i)
   
# Repeats 4 times from 1 to 4
print ("Example 3")
print ("---------")
for i in range(1, 5):
    print(i)
  
# Repeats 5 times going up in increments of 2 starting at 1
print ("Example 4")
print ("---------")
for i in range(1, 10, 2):
    print(i)
 
# Repeats 10 times from 1 to 10
print ("Example 5")
print ("---------")
for i in range(1, 11):
    print(i)
 
# Two for loops in one, one is nested inside the other
# i is for the number of rows and j is for the number of columns
# displays "*" for the given amount of rows and columns
print("Example 6")
print("---------")
for i in range(3):
    for j in range (6):
        print("*" , end="")
    print()
    
