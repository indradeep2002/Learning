def mod(m , n):

    # prev = 0
    i = 0
    final = 0

    while (n * i <= m):
        final = i
        i += 1

    val = final * n
    remainder = m - val

    return remainder

print(mod(7,3))
print(mod(33, 10))
print(mod(4, 2))
print(mod(119 , 5))