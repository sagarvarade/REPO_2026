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

print("sg\\er\"\"shg\njs")
print("Au" in "Australia")

print("Sagar"[0])
print("sagar"[1:2])
print("sagar"[:2])
print("sagar"[2:])
for i in range(0,3):
  print("Sagar"[i])


# Complex number

com1=2+4j
print(com1.imag,"   ",com1.real)
com2=complex(10,3)
print(com2.imag,"   ",com2.real, "   ",type(com2))


print("Absolute value ",abs(5.5))

print("Round value ",round(-5.5))

#Enums

from enum import Enum

class State(Enum):
  INACTIVE=0
  ACTIVE=1

print("Enum use : ",State.ACTIVE.value)

# Condition

Condition=True
if Condition==True:
  print("Condition is True")

if Condition!=False:
  print("Condition is not false")

#List 
dogsList=["roger","syde","sse",1,23,43.34,7+8j]

dogsList.append("sssd")
dogsList.extend(["extend list"])

for i in range(0,len(dogsList)):
    print("Dog name : ",dogsList[i]," : ",type(dogsList[i]))

print("List length : ",len(dogsList))
print("syde" in dogsList)

# Tuples

names=("roger","syd")

print("Tuple: ",names[0],names[1])

print("Roger" in names)

sorted(names)

newTuple=names+("Tina","Quincy")
print(newTuple)


#Dictionaries

dog={"name":"Roger"}
dog["age"]=5  

print("Dictionary : ",dog)
print("Dog get : ",dog.get("name"),"==",dog.get("color","Color Not found"))

print(dog.keys(),"  ",dog.values())

print(len(dog))

# Sets
set1={1,2,3,4,5,6,7,8,9}
set2={1,2,3,4,5,6,7,8,9}

set1.add(1)
set1.add(10)
print(set1)
print(set1&set2)
print(set1|set2)
print(set1-set2)
print(set1<set2)
print(set1>set2)

# frozenset

