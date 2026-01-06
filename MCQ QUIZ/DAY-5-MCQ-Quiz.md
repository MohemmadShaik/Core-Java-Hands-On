# Day 5 – MCQ Quiz (CodeShuttle)
## Spring Boot – Module 1 + Module 2 (Interview-Oriented)

> Goal: Think like a backend engineer, not a framework memorizer  
> Format: MCQs with interviewer-ready explanation & option elimination

---

## 🟦 MODULE 1 – Spring & Spring Boot Fundamentals (Q1–Q15)

### Q1. What is the primary problem Spring Framework solves?
**Correct:** B – Tight coupling in Java applications  
**Why:** Spring introduces IoC & DI to decouple object creation from usage.  
**Why others are wrong:** JVM/UI/DB are not Spring’s core concern.

---

### Q2. What does Inversion of Control (IoC) mean?
**Correct:** B – Spring controls object creation and wiring  
**Why:** Control shifts from developer to framework.  
**Others:** JVM/objects controlling is incorrect.

---

### Q3. Which container manages Spring Bean lifecycle?
**Correct:** C – ApplicationContext  
**Why:** It creates, wires, and manages beans.  
**Others:** JVM, Servlet container, DispatcherServlet have different roles.

---

### Q4. Which annotation enables component scanning?
**Correct:** C – `@Component`  
**Why:** Automatically detects and registers classes as beans.  
**Others:** `@Bean` is method-level, others are not scanners.

---

### Q5. Most recommended Dependency Injection type?
**Correct:** C – Constructor Injection  
**Why:** Enforces mandatory dependencies, immutability, testability.  
**Others:** Field/setter/static have design drawbacks.

---

### Q6. Primary advantage of Spring Boot?
**Correct:** C – Auto-configuration & reduced boilerplate  
**Why:** Starters + auto-config simplify setup.  
**Others:** JVM speed, DB, no-Java are myths.

---

### Q7. What does `@SpringBootApplication` do?
**Correct:** B – Combines config, scanning, auto-config  
**Why:** It’s a meta-annotation.  
**Others:** REST APIs and DB startup are not its job.

---

### Q8. How does auto-configuration work?
**Correct:** C – Based on classpath dependencies  
**Why:** Presence of starters triggers config.  
**Others:** OS/CPU/Java version irrelevant.

---

### Q9. Purpose of `application.properties` / `yml`?
**Correct:** C – Externalize configuration  
**Why:** Keep env-specific values outside code.  
**Others:** Logic, speed, annotation replacement are false.

---

### Q10. Two beans of same type without qualifier leads to?
**Correct:** B – Runtime ambiguity error  
**Why:** Dependency wiring happens at runtime.  
**Others:** Compile-time/JVM crash/silent pick are wrong.

---

### Q11. Default bean scope in Spring?
**Correct:** C – `singleton`  
**Why:** One instance per container by default.  
**Others:** Prototype/request/session differ.

---

### Q12. `@Component` vs `@Service`?
**Correct:** B – Generic vs semantic  
**Why:** Same behavior, different intent.  
**Others:** No auto logic or injection difference.

---

### Q13. Best annotation for DAO layer?
**Correct:** C – `@Repository`  
**Why:** Persistence semantics + exception translation.  
**Others:** Generic or wrong layers.

---

### Q14. Which DI style supports immutability?
**Correct:** C – Constructor Injection  
**Why:** Dependencies set once at creation.  
**Others:** Mutable or anti-patterns.

---

### Q15. Spring Boot starters are?
**Correct:** C – Curated dependency sets  
**Why:** Version compatibility & simplicity.  
**Others:** Not templates, APIs, or build tools.

---

## 🟩 MODULE 2 – Spring Boot MVC & REST APIs (Q16–Q30)

### Q16. Annotation for REST APIs?
**Correct:** C – `@RestController`  
**Why:** Combines `@Controller` + `@ResponseBody`.  
**Others:** Wrong layers.

---

### Q17. Annotation for GET requests?
**Correct:** C – `@GetMapping`  
**Why:** Specific > generic for clarity.  
**Others:** Generic or wrong HTTP method.

---

### Q18. Bind path variable from URL?
**Correct:** B – `@PathVariable`  
**Why:** Extracts `/users/{id}` values.  
**Others:** Query/body/form handling.

---

### Q19. Bind JSON request body?
**Correct:** C – `@RequestBody`  
**Why:** Converts JSON → Java object.  
**Others:** Params/path/response only.

---

### Q20. HTTP method to create resource?
**Correct:** B – POST  
**Why:** Creates new resource.  
**Others:** GET/PUT/DELETE semantics differ.

---

### Q21. Idempotent full update method?
**Correct:** C – PUT  
**Why:** Same request → same result.  
**Others:** POST/PATCH/GET differ.

---

### Q22. Return body + status + headers?
**Correct:** C – `ResponseEntity`  
**Why:** Full control over HTTP response.  
**Others:** Partial or unrelated.

---

### Q23. Global exception handling annotation?
**Correct:** B – `@ControllerAdvice`  
**Why:** Centralized exception handling.  
**Others:** Controller-level or unrelated.

---

### Q24. HTTP status for resource creation?
**Correct:** B – 201 Created  
**Why:** Explicitly indicates creation.  
**Others:** 200/204/400 mean different things.

---

### Q25. Bind query parameters like `?page=1`?
**Correct:** C – `@RequestParam`  
**Why:** Query string handling.  
**Others:** Path/body/form.

---

### Q26. HTTP method for partial update?
**Correct:** C – PATCH  
**Why:** Updates selected fields only.  
**Others:** PUT replaces entire resource.

---

### Q27. Role of DispatcherServlet?
**Correct:** B – Front controller  
**Why:** Entry point for all requests.  
**Others:** DI/DB/JSON are not its job.

---

### Q28. Validate request body?
**Correct:** A – `@Valid`  
**Why:** Triggers Bean Validation.  
**Others:** Binding/response only.

---

### Q29. Purpose of DTOs?
**Correct:** C – Control API data shape  
**Why:** Decouple API from entities.  
**Others:** DB mapping/performance myths.

---

### Q30. Why not expose entities directly?
**Correct:** C – Security & tight coupling risks  
**Why:** Entities leak internals and break contracts.  
**Others:** REST supports entities, performance not issue.

---

## 🏁 Final Takeaway (Interview Line)

> “I use Spring Boot to design clean, decoupled backend systems with proper dependency management, REST semantics, and safe API contracts.”

---

