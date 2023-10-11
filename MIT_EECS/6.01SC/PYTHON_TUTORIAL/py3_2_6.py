def power_of_2(i):
    k = 0
    ans = 1

    while k < i:
        ans *= 2
        k += 1

    return ans


def p2(x):
    prev = 0
    if x > 1:
        i = 0
        
        while power_of_2(i) < x:
            prev = power_of_2(i)
            i += 1
        
        return prev 
    else:
        return prev 
            

print(p2(2))
print(p2(17))
print(p2(13))

