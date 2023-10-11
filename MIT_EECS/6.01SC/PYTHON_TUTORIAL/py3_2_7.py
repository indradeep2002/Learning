def perfectSquare(n):

    i = 1
    
    while i < n:
        if (i * i == n):
            return True
        i += 1
    
    return False

print(perfectSquare(9))
print(perfectSquare(49))
print(perfectSquare(7))