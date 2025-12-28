# MCQ  Quiz Day 2 --> 28th Dec 2025   

# Core Java
Q1. Inheritance represents: 
A. HAS-A 
B. IS-A 
C. USES-A 
D. PART-OF

Q2. Which keyword prevents inheritance? 
A. static 
B. final 
C. private 
D. protected 

Q3. Method overriding supports: 
A. Compile-time polymorphism 
B. Runtime polymorphism 
C. Encapsulation 
D. Abstraction

Q4. Parent reference pointing to child object enables: 
A. Overloading
B. Inheritance only 
C. Runtime polymorphism 
D. Encapsulation

Q5. Which is decided at runtime? 
A. Variable access
B. Method overloading 
C. Method overriding 
D. Constructor call 

Q6. Why composition is preferred over inheritance?
A. Faster 
B. Less memory 
C. More flexible 
D. JVM requirement 

Q7. instanceof is used to: 
A. Create object 
B. Check reference type 
C. Override method 
D. Call constructor 

Q8. Which cannot be overridden? 
A. static method 
B. final method 
C. private method 
D. All of the above 

# 🌱 CodeShuttle – Spring
Q9. Dependency Injection mainly solves: 
A. Performance 
B. Tight coupling
C. Memory leaks 
D. Thread safety 

Q10. Best DI type in Spring is: 
A. Field
B. Setter 
C. Constructor 
D. XML 

Q11. ApplicationContext is responsible for: 
A. HTTP requests 
B. Bean lifecycle 
C. JVM execution 
D. Compilation 

Q12. Spring Boot auto-config works using: 
A. XML 
B. main() 
C. Classpath scanning 
D. JVM flags

Q13. Spring Boot is called opinionated because: 
A. It removes Spring 
B. It enforces defaults 
C. It uses XML 
D. It avoids annotations

Q14. Which file manages dependencies? 
A. application.properties 
B. settings.xml 
C. pom.xml 
D. build.gradle

Q15. Spring vs Spring Boot difference mainly lies in: 
A. Language 
B. JVM 
C. Configuration style 
D. Thread model



# SOLUTIONS : 

## Q1. Inheritance represents

✅ Answer: B. IS-A
Why? Inheritance shows an IS-A relationship (Child is a type of Parent).

❌ Other options:

HAS-A / PART-OF → Composition

USES-A → Dependency, not inheritance
---
## Q2. Which keyword prevents inheritance?

✅ Answer: B. final
Why? A final class cannot be extended.

❌ Other options:

static → Class-level behavior

private → Access control

protected → Allows inheritance
---
## Q3. Method overriding supports

✅ Answer: B. Runtime polymorphism
Why? Method call is resolved at runtime based on object type.

❌ Other options:

Compile-time polymorphism → Overloading

Encapsulation → Data hiding

Abstraction → Interface/abstract class concept
---
## Q4. Parent reference pointing to child object enables

✅ Answer: C. Runtime polymorphism
Why? JVM decides which overridden method to call at runtime.

❌ Other options:

Overloading → Compile-time

Inheritance only → Incomplete

Encapsulation → Data protection
---
## Q5. Which is decided at runtime?

✅ Answer: C. Method overriding
Why? JVM decides the method based on actual object, not reference.

❌ Other options:

Variable access → Compile-time

Method overloading → Compile-time

Constructor call → Compile-time
---
## Q6. Why composition is preferred over inheritance?

✅ Answer: C. More flexible
Why? Composition allows changing behavior without breaking hierarchy.

❌ Other options:

Faster / Less memory → Not guaranteed

JVM requirement → False
---
## Q7. instanceof is used to

✅ Answer: B. Check reference type
Why? It checks whether an object belongs to a class/interface.

❌ Other options:

Create object → new

Override method → Inheritance

Call constructor → new
---
## Q8. Which cannot be overridden?

✅ Answer: D. All of the above
Why?

static → Class-level

final → Locked

private → Not visible

❌ No incorrect option here — all are correct.

🌱 Spring / Spring Boot (Q9–Q15)
---
## Q9. Dependency Injection mainly solves

✅ Answer: B. Tight coupling
Why? DI removes direct dependencies between classes.

❌ Other options:

Performance → Side effect, not goal

Memory leaks → GC concern

Thread safety → Separate topic
---
## Q10. Best DI type in Spring

✅ Answer: C. Constructor
Why? Ensures mandatory dependencies + immutability.

❌ Other options:

Field → Hard to test

Setter → Optional dependencies

XML → Old style config
---
## Q11. ApplicationContext is responsible for

✅ Answer: B. Bean lifecycle
Why? It creates, manages, injects, and destroys beans.

❌ Other options:

HTTP requests → DispatcherServlet

JVM execution → JVM

Compilation → Compiler
---
## Q12. Spring Boot auto-config works using

✅ Answer: C. Classpath scanning
Why? Boot checks available dependencies and auto-configures.

❌ Other options:

XML → Optional

main() → Just entry point

JVM flags → Unrelated
---
## Q13. Spring Boot is opinionated because

✅ Answer: B. It enforces defaults
Why? Boot provides ready-made best practices.

❌ Other options:

Removes Spring → Built on Spring

Uses XML → Minimizes XML

Avoids annotations → Uses annotations heavily
---
## Q14. Which file manages dependencies?

✅ Answer: C. pom.xml
Why? Maven uses pom.xml to manage libraries.

❌ Other options:

application.properties → Config values

settings.xml → Maven user config

build.gradle → Gradle, not Maven
---
## Q15. Spring vs Spring Boot difference mainly lies in

✅ Answer: C. Configuration style
Why? Spring Boot uses auto-configuration, Spring requires manual setup.

❌ Other options:

Language → Java for both

JVM → Same JVM

Thread model → Same

🎯 Interview Memory Shortcut

Overloading → Compile-time

Overriding → Runtime

Inheritance → IS-A

Composition → HAS-A

Spring Boot → Less config, more defaults