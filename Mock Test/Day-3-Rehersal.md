# Day 3 – Mock Interview (Spring & Spring Boot – Module 1)

## Interview Goal
Explain Spring & Spring Boot concepts **confidently and clearly**
using real-world backend thinking (Airbnb-style systems).

---

## 2-Minute Mock Interview – Written Practice Script

### Interviewer:
What problem does Spring solve?

### You:
Spring solves the problem of **tight coupling** in Java applications.
Instead of developers creating and managing objects manually,
Spring uses **Inversion of Control** to manage object creation and wiring,
making the system easier to maintain, test, and scale.

---

### Interviewer:
What is a Spring Bean?

### You:
A Spring Bean is **an object whose lifecycle is fully managed by the Spring container**.
Only container-managed objects are considered beans,
not objects created using the `new` keyword.

---

### Interviewer:
How does Dependency Injection help in real projects?

### You:
Dependency Injection enables **loose coupling** by providing dependencies from outside.
This improves testability, readability, and flexibility.
In production systems, this allows easy replacement of implementations
without changing business logic.

---

### Interviewer:
Why is constructor injection preferred?

### You:
Constructor injection ensures **mandatory dependencies are always initialized**.
It promotes immutability and makes unit testing much easier,
which is why it’s recommended in real-world Spring applications.

---

### Interviewer:
Difference between Spring and Spring Boot?

### You:
Spring Boot is **opinionated Spring**.
It does not remove Spring concepts like IoC or DI,
but removes boilerplate configuration using
auto-configuration, starters, and externalized config.

---

### Interviewer:
What is auto-configuration?

### You:
Spring Boot auto-configuration works by checking
**classpath dependencies**.
If a dependency is present, Spring Boot automatically configures
the required beans unless overridden.

---

### Interviewer:
Why use `application.properties`?

### You:
It is used to **externalize configuration**.
This allows different configurations for dev, test, and production
without changing the codebase.

---

### Interviewer:
How is Spring useful in an Airbnb-like backend?

### You:
Spring manages object lifecycle, dependencies, and layering
(controller → service → repository).
This results in clean architecture, scalability,
and maintainable backend systems.

---

## One-Liner Answers (Interview Gold)

- “Spring controls object creation using IoC.”
- “Spring Boot removes boilerplate, not flexibility.”
- “Constructor injection gives immutability and testability.”
- “Auto-configuration is classpath-driven.”

---

## Final Confidence Statement
> I understand not just **how** Spring works,
> but **why** it exists and how it fits into real backend systems.
