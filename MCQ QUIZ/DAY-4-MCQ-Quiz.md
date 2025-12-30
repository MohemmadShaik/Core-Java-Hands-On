# Day 4 – Core Java & Spring Boot MCQ Quiz (Solutions)

---

## Q1. Which statement best describes a class in Java?
✅ Correct Answer: C  
🧠 Why: A class is a blueprint defining properties and behavior; memory is allocated only when an object is created.  
❌ Others:
- A: Objects, not classes, are real entities
- B: Runtime object ≠ class
- D: Class is not a memory location

🎤 Interview Script:
"A class acts as a blueprint, while objects are actual runtime instances."

---

## Q2. Where are objects stored in Java memory?
✅ Correct Answer: C  
🧠 Why: Objects are always created in heap memory.  
❌ Others:
- A: Stack holds references, not objects
- B: Method area stores class metadata
- D: CPU registers are irrelevant

---

## Q3. Which of the following is stored in stack memory?
✅ Correct Answer: C  
🧠 Why: Stack stores method calls and local variables.  
❌ Others:
- A: Objects live in heap
- B: Static variables live in method area
- D: String literals are in string pool

---

## Q4. Java uses which parameter passing mechanism?
✅ Correct Answer: B  
🧠 Why: Java always passes arguments by value, including object references.  
❌ Others:
- A: Pass-by-reference is a myth
- C: Java has no pointers
- D: Mechanism never changes

🎤 Interview Script:
"Java is 100% pass-by-value."

---

## Q5. What happens when an object reference is reassigned inside a method?
✅ Correct Answer: C  
🧠 Why: Only the local copy of the reference changes.  
❌ Others:
- A: State change ≠ reference reassignment
- B: Global replacement never happens
- D: No JVM error occurs

---

## Q6. Which property is NOT guaranteed by immutability?
✅ Correct Answer: C  
🧠 Why: Immutability doesn’t always improve performance.  
❌ Others:
- A: Immutability ensures thread safety
- B: Prevents malicious modification
- D: Predictable behavior is guaranteed

---

## Q7. Why is String immutable in Java?
✅ Correct Answer: B  
🧠 Why: Immutability provides thread safety and security.  
❌ Others:
- A: Memory usage may increase
- C: JVM can modify but doesn’t allow
- D: GC still applies

---

## Q8. What is the contract between equals() and hashCode()?
✅ Correct Answer: B  
🧠 Why: Equal objects must have the same hashCode.  
❌ Others:
- A: Same hashCode doesn’t guarantee equality
- C: hashCode need not be unique
- D: equals is mandatory for HashMap correctness

---

## Q9. Which bean scope is default in Spring?
✅ Correct Answer: C  
🧠 Why: Spring creates one singleton bean per container by default.

---

## Q10. Which callback is used for initialization in annotation-based configuration?
✅ Correct Answer: C  
🧠 Why: @PostConstruct runs after dependency injection.  
❌ Others:
- A: Not annotation-based
- B: Interface-based callback
- D: @Bean defines a bean, not lifecycle

---

## Q11. Which stereotype annotation is best for business logic?
✅ Correct Answer: B  
🧠 Why: @Service represents business layer semantics.  
❌ Others:
- A: Generic
- C: DAO layer
- D: Web layer

---

## Q12. Which annotation enables persistence exception translation?
✅ Correct Answer: D  
🧠 Why: @Repository converts DB exceptions to Spring’s DataAccessException.

---

## Q13. Which Dependency Injection type is recommended?
✅ Correct Answer: C  
🧠 Why: Constructor injection ensures immutability and testability.  
❌ Others:
- A: Field injection hides dependencies
- B: Setter allows partially constructed objects
- D: Not a DI type

---

## Q14. Which layer should contain transactional business rules?
✅ Correct Answer: C  
🧠 Why: Service layer owns business logic and transactions.  
❌ Others:
- A: Controller delegates only
- B: Repository handles data access
- D: Entity is a data model

---

## Q15. Correct request flow in Spring Boot is:
✅ Correct Answer: C  
🧠 Why: Controller → Service → Repository follows layered architecture.  
❌ Others:
- A/B/D: Break separation of concerns
