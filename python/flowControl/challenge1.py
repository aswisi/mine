name = input("please enter your name: ")
age = int(input("please enter your age, {}: ".format(name)))

if 18 <= age <= 30:
    print("welcome to the holiday")
else:
    print("sorry can't do holiday")