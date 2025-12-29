# DAY 2 – Mock Interview Practice (Core Java + Spring Boot)
📅 Date: 28 Dec 2025  
🎯 Goal: Confident verbal explanation based on MCQ understanding

---

## Section 1: Core Java – Inheritance & Polymorphism

### Q1. Can you explain Inheritance in Java?

**My Answer (Rehearsal Script):**  
“Inheritance in Java represents an IS-A relationship, where a child class acquires properties and behavior of a parent class.  
It is mainly used for code reuse and to support polymorphism.  
However, inheritance creates tight coupling, so it should be used only when the IS-A relationship is clearly valid.”

---

### Q2. What is Polymorphism? Give a real example.

**My Answer:**  
“Polymorphism means one interface with multiple implementations.  
In Java, runtime polymorphism happens when a parent reference points to a child object, and the method call is resolved at runtime based on the actual object.  
For example, an Animal reference pointing to a Dog object will call Dog’s overridden method.”

---

### Q3. Difference between method overloading and overriding?

**My Answer:**  
“Method overloading is compile-time polymorphism where methods have the same name but different parameters.  
Method overriding is runtime polymorphism where a child class provides its own implementation of a parent class method.  
Overloading is resolved at compile time, overriding at runtime.”

---

### Q4. Why do we prefer composition over inheritance?

**My Answer:**  
“Composition is preferred because it provides loose coupling and flexibility.  
With composition, behavior can be changed at runtime without affecting class hierarchy.  
In real-world enterprise applications, composition is used more often than inheritance to avoid rigid and fragile designs.”

---

### Q5. Can variables be overridden in Java?

**My Answer:**  
“No. Variables are not polymorphic in Java.  
Only methods participate in runtime polymorphism.  
Variable access is resolved at compile time based on reference type.”

---

## Section 2: Spring & Spring Boot (CodeShuttle – Module 1)

---

### Q6. What problem does Dependency Injection solve?

**My Answer:**  
“Dependency Injection solves the problem of tight coupling.  
Instead of a class creating its own dependencies, Spring injects them from outside.  
This improves flexibility, testability, and maintainability.”

---

### Q7. Which type of Dependency Injection is best and why?

**My Answer:**  
“Constructor injection is the best practice in Spring.  
It ensures immutability, makes dependencies explicit, and improves unit testing.  
Field injection is discouraged and setter injection is optional.”

---

### Q8. What is the role of ApplicationContext?

**My Answer:**  
“ApplicationContext is the Spring container responsible for creating, managing, and injecting beans.  
It also manages the entire bean lifecycle and configuration.”

---

### Q9. Explain Spring Framework vs Spring Boot.

**My Answer:**  
“Spring Framework provides powerful features but requires manual configuration.  
Spring Boot is built on top of Spring and reduces configuration using auto-configuration and opinionated defaults.  
Spring Boot helps in faster development and easier setup.”

---

### Q10. What is Auto-Configuration in Spring Boot?

**My Answer:**  
“Auto-configuration automatically configures beans based on classpath dependencies and conditions.  
For example, if spring-boot-starter-web is present, Spring Boot auto-configures Tomcat and MVC.”

---

### Q11. What is Maven and why do we use it?

**My Answer:**  
“Maven is a build and dependency management tool.  
It helps manage libraries, project structure, and build lifecycle using the pom.xml file.  
It avoids version conflicts and standardizes builds.”

---

### Q12. Can you explain Spring Boot startup flow at a high level?

**My Answer:**  
“When the main method runs, Spring Boot starts by creating the ApplicationContext.  
Then auto-configuration is triggered based on classpath dependencies.  
All required beans are created and initialized, and finally the application becomes ready to serve requests.”

---

## Section 3: Final Confidence Statements

### One-line Interview Closers

- “Inheritance models IS-A relationships, but composition is preferred in real-world applications.”
- “Polymorphism enables runtime behavior change using parent references.”
- “Spring Boot reduces configuration and speeds up development using auto-configuration.”
- “Dependency Injection is the backbone of loose coupling in Spring applications.”

---

## Self-Assessment
- Core Java confidence: ⭐⭐⭐⭐☆  
- Spring fundamentals: ⭐⭐⭐⭐☆  
- Ability to explain aloud: ✅  

---

## Next Improvement Areas
- More real-world examples
- Deeper Spring Boot internals
- Airbnb project mapping
