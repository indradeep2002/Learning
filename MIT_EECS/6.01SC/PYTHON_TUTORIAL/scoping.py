def foo1(x):
    def bar(x):
        return x + 1
    return bar(x * 2)

print(foo1(3))

def foo2(x):
    def bar(z):
        return x + z
    return bar(3)

print(foo2(2))

