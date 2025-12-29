# Day 01 – Mock Test (Java Basics)
## Interview Rehearsal & Confidence Script

---

## Purpose of This Mock Test
This mock test is designed to:
- Verbally explain Java fundamentals with confidence
- Avoid common interview traps
- Practice structured answers instead of random explanations

---

## Mock Question 1: What is JVM and what is its role?

### Interview-Ready Answer:
The JVM (Java Virtual Machine) is responsible for executing Java bytecode and managing runtime operations such as memory allocation, garbage collection, and JIT compilation. It acts as a bridge between Java bytecode and the underlying operating system.

### Key Points to Emphasize:
- JVM does **not** compile `.java` files
- JVM executes `.class` files
- JVM ensures platform independence

### Common Trap to Avoid:
❌ Saying JVM converts `.java` to bytecode  
✅ That is the job of the Java compiler (`javac`)

---

## Mock Question 2: What happens after compiling a Java program?

### Interview-Ready Answer:
After compilation, the Java compiler converts the source code into bytecode, which is stored in a `.class` file. This bytecode is platform independent and later executed by the JVM.

### One-Line Summary:
Compilation produces bytecode, not machine code.

---

## Mock Question 3: How do you run a Java program?

### Interview-Ready Answer:
First, the program is compiled using `javac ClassName.java`.  
Then it is executed using `java ClassName`, which starts the JVM and runs the bytecode.

### Execution Flow (Verbal):
.java → .class → JVM → Output

---

## Mock Question 4: Why is Java called platform independent?

### Interview-Ready Answer:
Java is platform independent because the same bytecode can run on any operating system that has a compatible JVM installed.

### Strong Line for Interview:
“Write once, run anywhere is achieved because of JVM, not because of the OS.”

---

## Mock Question 5: What is JIT compilation?

### Interview-Ready Answer:
JIT (Just-In-Time) compilation is a feature of the JVM that converts frequently executed bytecode into native machine code at runtime to improve performance.

### Bonus Point:
JIT improves performance without losing platform independence.

---

## Mock Question 6: Explain Java program execution flow.

### Interview-Ready Answer:
A Java program starts as a `.java` source file, which is compiled into bytecode (`.class`).  
The JVM loads this bytecode, verifies it, and executes it starting from the `main()` method.

---

## Mock Question 7: What is the Method Area?

### Interview-Ready Answer:
The Method Area is a runtime memory area that stores class-level information such as method definitions, static variables, and metadata.

### One-Liner:
Objects go to heap, method calls go to stack, class info goes to method area.

---

## Mock Question 8: What happens when you run `java HelloWorld`?

### Interview-Ready Answer:
The JVM loads the `HelloWorld.class` file, locates the `main()` method, and begins execution from there.

---

## Mock Question 9: Is Java compiled or interpreted?

### Interview-Ready Answer:
Java is both compiled and interpreted.  
It is compiled into bytecode and then interpreted/executed by the JVM using JIT compilation.

### Interview Power Line:
“Java uses a hybrid execution model.”

---

## Mock Question 10: Why is `main()` method static?

### Interview-Ready Answer:
The `main()` method is static so that the JVM can invoke it without creating an object of the class.

### Simple Explanation:
JVM needs a starting point, and object creation depends on method execution — not the other way around.

---

## Mock Question 11: Can you explain Encapsulation in Java? Why do we need it?
A11. The process of hiding data by wrapping variables and methods together in a class and controlling access using access modifiers like "private" and "public".
It helps us to protect data from unauthorized access and to improve maintainability.

## Mock Question 12: How is Encapsulation implemented in Java? Give a simple example (no code needed, just explanation).
A12. Encapsulation is implemented by declaring variables as private and providing public getters and setters to access and modify them in a controlled way. For example, if we want to protect the internal data via controlled setter logic by adding a validation inside setSalary() to prevent negatives.

## Mock Question 13: What is Abstraction? How is it different from Encapsulation?
A13. Abstraction is the concept of hiding implementation details and exposing only essential functionality to the user. It allows us to focus on what an object does rather than how it does it. Abstraction hides implementation details using interfaces or abstract classes to reduce complexity, while encapsulation hides data using access modifiers to protect it. 
In simple words we can say abstraction focuses on design, whereas Encapsulation focuses on data security.


## Mock Question 14: (Trap Question)
### If I declare a class as abstract, does that automatically mean data is hidden? Explain clearly.
A14. No. Declaring a class as abstract does not hide data. It only prevents object creation and allows abstract methods.
Data hiding depends on access modifiers (like private), not on the abstract keyword.

## Mock Question 15: (Real Project Angle)
### In a real-time project or microservice, where would you use Abstraction and where would you use Encapsulation?
A15. We were designing an Account microservice for a bank and I expose AccountService as an interface , that’s abstraction. clients see what can be done.
Inside our Account domain model, keep balance private and provide controlled access via methods that validate and protect the state, that's Encapsulation.

## Mock Question 17: (Confidence Check)
### Explain Encapsulation vs Abstraction in one single sentence.
A16. Encapsulation focuses on data security, whereas abstraction focuses on simplifying design by hiding complexity.

## Final Interview Takeaways (Day 1)
- JVM vs Compiler distinction is critical
- Platform independence = JVM
- Java execution flow must be crystal clear
- Static `main()` is a favorite interview question

---

## Daily Self-Check
✔ Can I explain JVM in under 30 seconds?  
✔ Can I draw execution flow on paper?  
✔ Can I answer without using jargon unnecessarily?

If yes → Day 1 concepts are solid.
