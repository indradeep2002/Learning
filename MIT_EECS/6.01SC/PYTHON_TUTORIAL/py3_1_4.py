def clip(lo , x, hi):
    if x < lo:
        return lo
    elif x > hi:
        return hi
    else:
        return x

print(clip(3, 2, 1))
print(clip(0,2,1))