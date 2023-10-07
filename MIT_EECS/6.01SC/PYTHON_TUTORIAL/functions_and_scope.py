a = 10
def f(x):
    return x + a

print(f(9)) # expects 19

a = 3

print(f(1)) # expects 4

x = 12

def g(x):
    x = x + 1
    def h(y):
        return x + y
    return h(6)

print(g(x))
