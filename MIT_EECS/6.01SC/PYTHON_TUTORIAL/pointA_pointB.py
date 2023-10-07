import math

def square(x):
    return x * x


def pointDist(x1, y1, x2, y2):
    return math.sqrt(square(x1 - x2) + square(y1 - y2))

print(pointDist(0,0,6,6))