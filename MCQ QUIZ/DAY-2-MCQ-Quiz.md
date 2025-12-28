# DAY 2 – MCQ Quiz (Core Java + Spring)
📅 Date: 28 Dec 2025  
🎯 Focus: Inheritance, Polymorphism, DI, Spring Boot Internals

---

## Core Java (Inheritance & Polymorphism)

### Q1. Inheritance represents:
✅ **Correct Answer:** B — IS-A  
🧠 **Why?** Inheritance models an “IS-A” relationship between parent and child classes.  
❌ A (HAS-A): Represents composition  
❌ C (USES-A): Dependency, not inheritance  
❌ D (PART-OF): Aggregation concept  

---

### Q2. Which keyword prevents inheritance?
✅ **Correct Answer:** B — final  
🧠 **Why?** A `final` class cannot be extended.  
❌ A (static): Belongs to class, not inheritance  
❌ C (private): Affects access, not inheritance  
❌ D (protected): Allows inheritance  

---

### Q3. Method overriding supports:
✅ **Correct Answer:** B — Runtime polymorphism  
🧠 **Why?** Overridden method execution is decided at runtime.  
❌ A: Compile-time is for overloading  
❌ C: Encapsulation hides data  
❌ D: Abstraction hides implementation  

---

### Q4. Parent reference pointing to child object enables:
✅ **Correct Answer:** C — Runtime polymorphism  
🧠 **Why?** JVM decides method call based on object type at runtime.  
❌ A: Overloading is compile-time  
❌ B: Inheritance alone doesn’t enable polymorphism  
❌ D: Encapsulation is unrelated  

---

### Q5. Which is decided at runtime?
✅ **Correct Answer:** C — Method overriding  
🧠 **Why?** JVM resolves overridden method during execution.  
❌ A: Variable access is compile-time  
❌ B: Overloading is compile-time  
❌ D: Constructors are not polymorphic  

---

### Q6. Why composition is preferred over inheritance?
✅ **Correct Answer:** C — More flexible  
🧠 **Why?** Composition allows behavior changes without affecting class hierarchy.  
❌ A: Speed is not the reason  
❌ B: Memory is not primary factor  
❌ D: JVM does not enforce it  

---

### Q7. `instanceof` is used to:
✅ **Correct Answer:** B — Check reference type  
🧠 **Why?** It checks whether an object belongs to a specific class/interface.  
❌ A: Object creation is done using `new`  
❌ C: Overriding is unrelated  
❌ D: Constructors are not checked  

---

### Q8. Which cannot be overridden?
✅ **Correct Answer:** D — All of the above  
🧠 **Why?** `static`, `final`, and `private` methods cannot be overridden.  
❌ A/B/C: Each individually cannot be overridden  

---

## CodeShuttle – Spring & Spring Boot

### Q9. Dependency Injection mainly solves:
✅ **Correct Answer:** B — Tight coupling  
🧠 **Why?** DI removes hard dependency between classes.  
❌ A: Performance is not the goal  
❌ C: Memory leaks are unrelated  
❌ D: Thread safety is separate  

---

### Q10. Best DI type in Spring is:
✅ **Correct Answer:** C — Constructor  
🧠 **Why?** Constructor injection ensures immutability and testability.  
❌ A: Field injection is discouraged  
❌ B: Setter injection is optional  
❌ D: XML is outdated  

---

### Q11. ApplicationContext is responsible for:
✅ **Correct Answer:** B — Bean lifecycle  
🧠 **Why?** It creates, manages, and injects Spring beans.  
❌ A: HTTP handled by DispatcherServlet  
❌ C: JVM execution is separate  
❌ D: Compilation is Java’s job  

---

### Q12. Spring Boot auto-configuration works using:
✅ **Correct Answer:** C — Classpath scanning  
🧠 **Why?** Spring Boot configures beans based on available dependencies.  
❌ A: XML is not required  
❌ B: `main()` only triggers startup  
❌ D: JVM flags are irrelevant  

---

### Q13. Spring Boot is called opinionated because:
✅ **Correct Answer:** B — It enforces defaults  
🧠 **Why?** Spring Boot provides default configurations to reduce decisions.  
❌ A: It doesn’t remove Spring  
❌ C: XML is optional  
❌ D: Annotations are heavily used  

---

### Q14. Which file manages dependencies?
✅ **Correct Answer:** C — pom.xml  
🧠 **Why?** Maven dependencies and build lifecycle are defined in `pom.xml`.  
❌ A: Used for config  
❌ B: Used for Maven settings  
❌ D: Gradle file, not Maven  

---

### Q15. Spring vs Spring Boot difference mainly lies in:
✅ **Correct Answer:** C — Configuration style  
🧠 **Why?** Spring Boot removes manual configuration via auto-config.  
❌ A: Same language  
❌ B: Same JVM  
❌ D: Thread model unchanged  

---

## 🎯 Final Score
**15 / 15 — Perfect**

## 🧠 Interview Readiness
- Inheritance vs Composition: ✅
- Polymorphism clarity: ✅
- Spring Boot internals: ✅
