# Day 3 – MCQ Quiz (Live Interview-Style)
## Module 1: Introduction to Spring & Spring Boot

> Goal: Think fast, explain clearly, eliminate options confidently  
> Format: What I say in an interview when judging options

---

## Q1. Which concept allows Spring to control object creation instead of the developer?

A. Encapsulation  
B. Inheritance  
C. Inversion of Control  
D. Polymorphism  

✅ Correct Answer: C

🧠 Interview Script:
“In Spring, object creation responsibility is inverted from the developer to the framework. That concept is Inversion of Control.”

❌ Why others are wrong (one go):
- Encapsulation hides data
- Inheritance reuses code
- Polymorphism changes behavior  
→ none talk about **object creation control**

---

## Q2. What is a Spring Bean?

A. Any Java object  
B. Object created using `new`  
C. Object managed by Spring container  
D. Static utility class  

✅ Correct Answer: C

🧠 Interview Script:
“A Spring Bean is specifically an object whose lifecycle is managed by the Spring container.”

❌ Others:
- Any Java object → unmanaged
- `new` keyword → manual creation
- Static class → not container-controlled

---

## Q3. Which container manages Spring beans and their lifecycle?

A. JVM  
B. Servlet Container  
C. ApplicationContext  
D. DispatcherServlet  

✅ Correct Answer: C

🧠 Interview Script:
“ApplicationContext is the core IoC container responsible for creating, wiring, and managing beans.”

❌ Others:
- JVM → runtime only
- Servlet container → web requests
- DispatcherServlet → routing

---

## Q4. Dependency Injection mainly helps achieve what?

A. Faster execution  
B. Loose coupling  
C. Smaller codebase  
D. Better UI  

✅ Correct Answer: B

🧠 Interview Script:
“Dependency Injection removes hard dependencies, resulting in loose coupling and easier testing.”

❌ Others:
- Performance/UI → side effects
- Code size → not guaranteed

---

## Q5. Which Dependency Injection approach is most recommended?

A. Field Injection  
B. Setter Injection  
C. Constructor Injection  
D. Static Injection  

✅ Correct Answer: C

🧠 Interview Script:
“Constructor injection enforces mandatory dependencies and improves immutability and testability.”

❌ Others:
- Field → hard to test
- Setter → optional dependencies
- Static → anti-pattern

---

## Q6. Which annotation enables automatic detection of a class as a Spring bean?

A. `@Bean`  
B. `@Autowired`  
C. `@Component`  
D. `@Primary`  

✅ Correct Answer: C

🧠 Interview Script:
“`@Component` works with component scanning to automatically register classes as beans.”

❌ Others:
- `@Bean` → method-level
- `@Autowired` → injection only
- `@Primary` → conflict resolution

---

## Q7. What does `@SpringBootApplication` NOT include?

A. Auto-configuration  
B. Component scanning  
C. REST endpoint definition  
D. Configuration support  

✅ Correct Answer: C

🧠 Interview Script:
“REST endpoints come from `@RestController`, not from `@SpringBootApplication`.”

❌ Others:
- Auto-config, scanning, configuration → all included

---

## Q8. What major problem does Spring Boot primarily solve?

A. JVM startup time  
B. Manual boilerplate configuration  
C. Java syntax complexity  
D. SQL performance  

✅ Correct Answer: B

🧠 Interview Script:
“Spring Boot reduces heavy boilerplate configuration using auto-configuration and starters.”

❌ Others:
- JVM, SQL, syntax → unrelated

---

## Q9. Spring Boot auto-configuration works mainly based on?

A. OS  
B. Java version  
C. Classpath dependencies  
D. CPU cores  

✅ Correct Answer: C

🧠 Interview Script:
“Spring Boot checks available dependencies on the classpath and configures beans accordingly.”

❌ Others:
- OS/hardware → irrelevant
- Java version → insufficient

---

## Q10. Why is `application.properties` or `application.yml` used?

A. To write business logic  
B. To replace annotations  
C. To externalize configuration  
D. To improve runtime speed  

✅ Correct Answer: C

🧠 Interview Script:
“It allows environment-specific configurations to stay outside the codebase.”

❌ Others:
- Business logic → service layer
- Replace annotations → false
- Speed → myth

---

## Q11. Which tool manages dependencies in Spring Boot projects?

A. JVM  
B. Spring Container  
C. Maven  
D. Tomcat  

✅ Correct Answer: C

🧠 Interview Script:
“Maven handles dependency management and the build lifecycle.”

❌ Others:
- JVM → runtime
- Spring → beans
- Tomcat → server

---

## Q12. What happens if two beans of the same type exist without qualifier?

A. Compile-time error  
B. Runtime ambiguity error  
C. JVM crash  
D. Spring silently picks one  

✅ Correct Answer: B

🧠 Interview Script:
“Spring resolves dependencies at runtime, so ambiguity causes a runtime error unless clarified.”

❌ Others:
- Compile-time → incorrect
- JVM crash → exaggerated
- Silent pick → unsafe

---

## Q13. Which statement best describes Spring Boot?

A. Replaces Spring  
B. Removes Dependency Injection  
C. Simplifies configuration using opinionated defaults  
D. Only for microservices  

✅ Correct Answer: C

🧠 Interview Script:
“Spring Boot is opinionated Spring—it simplifies setup without removing core concepts.”

❌ Others:
- Replaces/removes → false
- Only microservices → myth

---

## Q14. In an Airbnb-like backend, Spring is mainly used for?

A. UI rendering  
B. Object lifecycle & dependency management  
C. SQL tuning  
D. Frontend routing  

✅ Correct Answer: B

🧠 Interview Script:
“Spring excels at managing backend object lifecycles and dependencies.”

❌ Others:
- UI/frontend/SQL → different layers

---

## Q15. What mindset does Module 1 primarily build?

A. Memorizing annotations  
B. Competitive coding speed  
C. Real-world backend engineering thinking  
D. UI-focused development  

✅ Correct Answer: C

🧠 Interview Script:
“Module 1 focuses on thinking like a backend engineer, not just writing annotations.”

❌ Others:
- Memorization/UI/speed → shallow focus

---

## 🎯 Final Interview One-Liner
“Spring Boot doesn’t remove Spring concepts — it removes unnecessary pain while keeping control.”

---
