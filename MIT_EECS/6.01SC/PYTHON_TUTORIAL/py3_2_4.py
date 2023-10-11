def div(m , n):
    i = 0
    final = 0

    while (n * i <= m):
        final = i
        i += 1

    return final

print(div(7,3))
print(div(33, 10))
print(div(4, 2))
print(div(119 , 5))