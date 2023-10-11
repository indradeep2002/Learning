def prime(n):
    i = 2
    if n < 2:
        return False
    elif n == 2 or n == 3:
        return True
    else:
        while i < n:
            if n % i == 0:
                return False
            i += 1
        return True
    

print(prime(4))
print(prime(9))
print(prime(12))
print(prime(19))
print(prime(5))
print(prime(7))
print(prime(11))
print(prime(23))