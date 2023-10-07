import math 


def perpDist(px , py, a, b, c):
    solution = abs( (a * (px) + b * (py) + c)) / math.sqrt(((a*a) + (b * b)))
    return solution

print(perpDist(-3, 5, 4, -3, -26))