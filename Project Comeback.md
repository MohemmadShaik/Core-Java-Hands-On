# Day 1 Java Plan FAQ's:  

## Q1.Can you explain Encapsulation in Java? Why do we need it?
A1. The process of hiding data by wrapping variables and methods together in a class and controlling access using access modifiers like "private" and "public".
It helps us to protect data from unauthorized access and to improve maintainability.

## Q2.How is Encapsulation implemented in Java? Give a simple example (no code needed, just explanation).
A2. Encapsulation is implemented by declaring variables as private and providing public getters and setters to access and modify them in a controlled way. For example, if we want to protect the internal data via controlled setter logic by adding a validation inside setSalary() to prevent negatives.

## Q3.What is Abstraction? How is it different from Encapsulation?
A3. Abstraction is the concept of hiding implementation details and exposing only essential functionality to the user. It allows us to focus on what an object does rather than how it does it. Abstraction hides implementation details using interfaces or abstract classes to reduce complexity, while encapsulation hides data using access modifiers to protect it. 
In simple words we can say abstraction focuses on design, whereas Encapsulation focuses on data security.


## Q4. (Trap Question)
### If I declare a class as abstract, does that automatically mean data is hidden? Explain clearly.
A4. No. Declaring a class as abstract does not hide data. It only prevents object creation and allows abstract methods.
Data hiding depends on access modifiers (like private), not on the abstract keyword.

## Q5. (Real Project Angle)
### In a real-time project or microservice, where would you use Abstraction and where would you use Encapsulation?
A5. We were designing an Account microservice for a bank and I expose AccountService as an interface , that’s abstraction. clients see what can be done.
Inside our Account domain model, keep balance private and provide controlled access via methods that validate and protect the state, that's Encapsulation.

## Q6. (Confidence Check)
### Explain Encapsulation vs Abstraction in one single sentence.
A6. Encapsulation focuses on data security, whereas abstraction focuses on simplifying design by hiding complexity.

## Data types in Java

 Primitive Data Types : Total we have 8 Primitive data types in Java

 byte    --> 1 byte  
 short   --> 2 bytes  
 int     --> 4 bytes  
 long    --> 8 bytes  
 float   --> 4 bytes  
 double  --> 8 bytes  
 boolean --> 1 byte  
 char    --> 1 byte  

byte, short, int and long used for whole numbers

## Keynote :
 1.The default data type of whole number in Java is int
 2.If we perform any of the operation on the whole number the
    resultant is always a integer.

# Day 2 Java Plan FAQ's (28th Dec 2025)

PENDING...