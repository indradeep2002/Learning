def multIA(m, n):
    i = 0
    ans = 0

    while i < n:
        ans += m
        i += 1

    return ans

def multAgen(m , n):
    if m > 0 and n > 0:
        return multIA(m, n)

    elif m > 0 and n < 0:
        n = -1 * n
        return -1 * (multIA(m , n))
    
    elif m < 0 and n > 0:
        m = -1 * m
        return -1 * (multIA(m , n))
    else:
        m = -1 * m
        n = -1 * n
        return multIA(m, n)

print(multAgen(2, 3))
print(multAgen(2, -3))
print(multAgen(-2 , 3))
print(multAgen(-2, -3))