# Day 6 – Core Java Mock Test  
## Topic: String Fundamentals & Internal Working

---

## Q1. Which of the following statements about Java `String` is CORRECT?

**Answer:** C  
**Why:** Java maintains a special memory area called the String Constant Pool (SCP).

🎤 **Interview Script:**  
Java uses the String Constant Pool to store string literals so that identical immutable strings can be reused, saving memory.

---

## Q2. What happens when the following code is executed?

```java
String s1 = "Java";
String s2 = "Java";

Answer: B
Why: Both references point to the same SCP object.

🎤 Interview Script:
String literals are stored in SCP, and identical literals reuse the same object.

Q3. What is the main purpose of the String Constant Pool (SCP)?

Answer: C
Why: To reduce memory usage by reusing immutable String objects.

🎤 Interview Script:
The SCP optimizes memory by avoiding duplicate String objects.

Q4. Where is the String Constant Pool stored in Java 8+?

Answer: B
Why: SCP is part of the Heap from Java 8 onwards.

🎤 Interview Script:
PermGen was removed in Java 8, and SCP was moved into Heap memory.

Q5. What happens when this code is executed?

String s1 = new String("Java");

Answer: C
Why: One object in SCP (if not present) and one new object in Heap.

🎤 Interview Script:
The new keyword always creates a Heap object regardless of SCP.

Q6. Why are String objects immutable in Java?

Answer: B
Why: For security, thread safety, and caching benefits.

🎤 Interview Script:
Immutability ensures strings can be safely shared across threads and reused.

Q7. Which operation creates a NEW String object?

Answer: C
Why: Runtime concatenation creates a new String.

🎤 Interview Script:
String concatenation at runtime uses StringBuilder internally and produces new objects.

Q8. Key difference between StringBuilder and StringBuffer?

Answer: C
Why: StringBuffer is thread-safe; StringBuilder is not.

🎤 Interview Script:
Synchronization makes StringBuffer slower but thread-safe.

Q9. Best class for string manipulation in a single-threaded environment?

Answer: C
Why: StringBuilder is faster without synchronization.

🎤 Interview Script:
In single-threaded scenarios, avoid synchronization overhead.

Q10. Output?
String s1 = "Java";
String s2 = "Java";
System.out.println(s1 == s2);

Answer: A
Why: Both references point to same SCP object.

🎤 Interview Script:
== compares references, not content.

Q11. Output?
String s1 = new String("Java");
String s2 = "Java";
System.out.println(s1 == s2);
Answer: B
Why: Heap vs SCP reference comparison.

🎤 Interview Script:
Different memory locations lead to false.

Q12. Which statement about .equals() is TRUE?

Answer: C
Why: String overrides equals to compare content.

🎤 Interview Script:
.equals() compares characters, not references.

Q13. Worst performance scenario?

Answer: C
Why: String concatenation inside loops creates many objects.

🎤 Interview Script:
Always use StringBuilder in loops.

Q14. How does Java handle + inside loops at runtime?

Answer: C
Why: New StringBuilder is created on each iteration.

🎤 Interview Script:
Runtime concatenation is not optimized across loop iterations.

Q15. Best real-world use case for immutability?

Answer: B
Why: Database URLs must be thread-safe and unchangeable.

🎤 Interview Script:
Immutability ensures consistency and security.

✅ Day 6 Status

✔ Fundamentals reinforced
✔ Performance traps understood
✔ Interview-ready explanations prepared