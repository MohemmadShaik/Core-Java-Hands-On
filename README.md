# 📘 Interview Preparation – Day 1

## 🎯 Goal
Build a rock-solid Java foundation with clear interview articulation before moving to advanced topics.

---

## ✅ Topics Covered (Interview Perspective)

### 1️⃣ Java Basics
- **JDK vs JRE vs JVM**
  - JDK → develop
  - JRE → run
  - JVM → execute bytecode
- **Why Java is platform independent**
  - Bytecode + JVM (not because it is interpreted)

### 2️⃣ Java Execution Flow
- `.java → .class → JVM`
- Class Loader → Bytecode Verifier → Execution (Interpreter/JIT)

### 3️⃣ JVM Architecture (High-Impact)
- **Heap** → Objects
- **Stack** → Local variables & method calls
- **Method Area** → Class metadata & static members
- **Garbage Collector** → Cleans unused heap objects

### 4️⃣ Data Types & Variables
- Primitive vs Non-Primitive
- `int` preferred over `Integer` for performance
- **Default values**
  - Instance & static → YES
  - Local → NO (must initialize)

---

## 🧱 OOPS Fundamentals

### Encapsulation
- Hides **data**
- Achieved using `private` fields + getters/setters
- Improves security & maintainability

### Abstraction
- Hides **implementation**
- Achieved using interfaces / abstract classes
- Focuses on design & simplicity

👉 **Key Difference**
- Encapsulation → data security  
- Abstraction → design simplicity

---

## 🧠 Interview Takeaways
- Explain JVM in 2 minutes confidently
- Clearly differentiate Encapsulation vs Abstraction
- Avoid common traps (abstract ≠ data hiding)
- Speak with real-time examples (Bank Account, Microservice)

---

## 📌 Self-Assessment
- Quiz Score: **4/5**
- Mock Interview Score: **9.5/10**
- Status: **Interview-safe for Java Basics & OOPS**

---

## Key Learnings
- Java source code (.java) is compiled into bytecode (.class) using javac
- JVM executes bytecode, not source code
- Platform independence is achieved through JVM, not OS
- JVM handles memory management and JIT compilation

## MCQ Score
- Day 1 Score: 9/10
- Weak Area: JVM vs Compiler responsibility

### Quiz – Day 1 (27 DEC 2025)
- Topic: Abstraction & Encapsulation
- Score: 15/15
- Confidence: High
- Key clarity: Abstraction reduces complexity, encapsulation controls access
--- 

## DAY 2 – Core Java: Inheritance & Polymorphism  
📅 Date: 28 Dec 2025

### Topics Covered
- Inheritance (IS-A, overriding, super)
- Polymorphism (compile-time vs runtime)

### Hands-on
- Vehicle–Car inheritance example
- Runtime polymorphism using parent reference

### Interview Notes
- Prefer composition over inheritance
- Methods are polymorphic, variables are not

## 📅 Day 4 – Learning Tracker (Core Java + Spring Boot)

### 🟦 Core Java – Day 4 Topics
Focus: Strengthening fundamentals frequently tested in interviews

- Object vs Class (conceptual clarity)
- Memory Management
  - Stack vs Heap
- Pass-by-Value (with objects)
- Immutability
  - String immutability
  - Custom immutable class (conceptual)
- `equals()` vs `hashCode()`
  - Contract and real-world impact

🎯 Goal:  
Explain **why things work the way they do**, not just definitions.

---

### 🟩 Spring Framework & Spring Boot – Day 4 Topics
Focus: Deepening Module 1 understanding and preparing for next modules

- Spring Bean Lifecycle (high-level)
- Bean Scopes
  - `singleton`
  - `prototype`
- Stereotype Annotations
  - `@Component`
  - `@Service`
  - `@Repository`
- Dependency Injection (Revision + Comparison)
  - Field Injection vs Constructor Injection
- Basic Application Flow
  - Controller → Service → Repository

🎯 Goal:  
Build confidence in **core Spring concepts** before moving to MVC and REST.

---

### 🧠 Session Strategy
- Interactive MCQs (interview-pressure style)
- Written rehearsal scripts for explanation
- No microservices deep dive yet (planned for upcoming sessions)

---

### ✅ Status
- Day 1: Completed
- Day 2: Completed
- Day 3: Completed
- **Day 4: Planned & In Progress**

---

📌 *Note:*  
Microservices is a vast and highly demanded concept and will be covered in **upcoming sessions** after strengthening Spring fundamentals.
