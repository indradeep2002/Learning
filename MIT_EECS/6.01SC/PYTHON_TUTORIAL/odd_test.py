#
# Define a procedure odd(x) that returns True when its integer argument is an odd
# number and False otherwise. It should have type int -> boolean. Use the % (mod)
# operator, not if. 

def odd(x):
    return x % 2 == 0

print(odd(3))

print(odd(2))