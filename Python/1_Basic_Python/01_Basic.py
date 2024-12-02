# Print in python
print("Hello World!")

# Variables :
name="Beau"
age=39
bolVar=2.14
print(name,age,bolVar)
print((name,age)*2)
print("s"*5)

#Comments
#This is a comment in python

#Data types
intVar=100
print("Type of var : ",type(intVar), type(bolVar))
print("Is intVar integer? : ",isinstance(intVar,int))
print("Is intVar float? : ",isinstance(intVar,float))


age=float(2)
print("age instance of int ",isinstance(age,int))

number="20"
age=int(number)
print(isinstance(age,int))


#Arithmatic Operators

print(1+1)
print(1-1)
print(1*1)
print(1/1)
print(1%1)
print(2**3)
print(5//2)



age=8
age+=10
print("shorthand ", age)


a=1
b=2
print(a==b)
print(a!=b)
print(a>b)
print(a<=b)


print(0 or 1)
print(False or 'hey')
print('hi' or False)
print([] or False)
print(False or [])

#  is and in operators

print(1 is 1)
print(10 in [1,2,3])

# Ternary opertaor in python
term=20
print("Ok" if term>10 else "No")

print("beau".upper())
print("beau".upper().lower())

#  string slicing in python
print("beau"[0])
print("beau"[1])
print("sf".title().islower())

print(len("ssss"))


print("sger\"\"shg\njs")


