
---

# 📄 `Revision-Day-6-Incorrect-Concepts.md`

```md
# Revision – Day 6 Incorrect & Weak Concepts

---

## 1️⃣ SCP Purpose Misunderstanding

❌ Mistake: SCP exists for thread safety  
✅ Correct: SCP exists for memory optimization via reuse

🔑 Remember:  
Thread safety comes from **immutability**, not SCP.

---

## 2️⃣ SCP Location Confusion (Java Versions)

❌ Mistake: SCP is in native memory  
✅ Correct:
- Java 6/7 → PermGen
- Java 8+ → Heap

🔑 Interview Tip:  
Always mention Java version when discussing SCP.

---

## 3️⃣ Immutability Reason Confusion

❌ Mistake: Immutability helps resizing or GC  
✅ Correct: Security, caching, thread safety

🔑 Example:  
Class loaders, file paths, DB URLs

---

## 4️⃣ `==` vs `.equals()` Confusion

❌ Mistake: `==` compares content  
✅ Correct:
- `==` → reference comparison
- `.equals()` → content comparison

🔑 Golden Line:  
“If references matter, use `==`; if values matter, use `.equals()`.”

---

## 5️⃣ StringBuilder vs StringBuffer Mix-up

❌ Mistake: StringBuilder is thread-safe  
✅ Correct:
- StringBuffer → thread-safe (slow)
- StringBuilder → not thread-safe (fast)

🔑 Rule of Thumb:  
Single thread → StringBuilder  
Multiple threads → StringBuffer

---

## 6️⃣ Runtime String Concatenation Trap

❌ Mistake: JVM stores intermediate strings in SCP  
✅ Correct: Each loop iteration creates new StringBuilder

🔑 Performance Rule:  
Never use `+` inside loops.

---

## ✅ Revision Outcome

✔ Conceptual gaps identified  
✔ Interview traps neutralized  
✔ Ready for next difficulty level
