#Write a Java/C/C++/Python program to implement RSA algorithm

import math
message = int(input("Enter the message to be encrypted: "))

p = 7
q = 17
n = p*q
m = (p-1)*(q-1)

for i in range(2,m):
    if math.gcd(i,m) == 1:
        e = i
        break
for i in range(m):
    if (e*i) % m == 1:
        d = i
        break

def encrypt(me):
    c = pow(message, e, n)
    return c
def decrypt(ct):
    p = pow(ct, d, n)
    return p

print("Original Message is: ", message)
CT = encrypt(message)
print("Encrypted Message is: ", CT)
PT = decrypt(CT)
print("Decrypted Message is:", PT)
