h, m = map(int, input().split())
M=m-45
H=h
if M < 0:
    M += 60
    H = h - 1
    if H < 0:
        H = 23
elif H < 0:
    H = 23
print(H,M,sep=' ')