# Define a procedure fourthPower(x) that takes a numeric parameter x and returns that
# value raised to the fourth power. It should have type num -> num. You should use the
# square procedure




def square(x):
    return x * x

def fourthPower(x):
    return square(square(x))

print(fourthPower(3))
    