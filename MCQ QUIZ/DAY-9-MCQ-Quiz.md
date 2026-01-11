# DAY-9 – Spring Data JPA (Backend Foundations)

## Q1
**JPA is best described as:**  
✅ C) Specification  
🧠 Why: JPA only defines rules for ORM; Hibernate provides the implementation.  
❌ A) ORM Tool – Hibernate is the ORM tool.  
❌ B) Framework – JPA has no runtime engine.  
❌ D) Database – JPA is not a storage system.

---

## Q2
**Which component generates SQL in Spring Data JPA?**  
✅ C) Hibernate  
🧠 Why: Hibernate is the JPA implementation that creates and executes SQL.  
❌ A) Spring Boot – only configures.  
❌ B) Spring Data JPA – only provides repository abstraction.  
❌ D) MySQL – executes SQL but doesn’t generate it.

---

## Q3
**Main purpose of JPA?**  
✅ B) Convert Java objects to DB tables  
🧠 Why: JPA solves object–relational mismatch.  
❌ A, C, D – Not related to persistence.

---

## Q4
**Which annotation marks a class as DB table?**  
✅ B) @Entity  
🧠 Why: @Entity tells Hibernate to map the class to a table.  
❌ A) @Table is optional.  
❌ C) @Id is for PK.  
❌ D) @Repository is for Spring beans.

---

## Q5
**What if Entity has no @Id?**  
✅ C) Hibernate throws error  
🧠 Why: Every entity must have a primary key.  
❌ A, B, D – Hibernate requires ID.

---

## Q6
**@GeneratedValue does what?**  
✅ C) Generates primary key  
🧠 Why: It lets DB or Hibernate auto-create ID.  
❌ Others are unrelated.

---

## Q7
**Two entities with same ID are:**  
✅ C) Same entity  
🧠 Why: Hibernate uses primary key for identity.  
❌ Others violate entity identity.

---

## Q8
**Which state is tracked by Hibernate?**  
✅ C) Persistent  
🧠 Why: Only persistent entities are managed.  
❌ Transient, Detached, Removed are not tracked.

---

## Q9
**Dirty Checking means:**  
✅ B) Auto-updating DB when entity changes  
🧠 Why: Hibernate tracks changes and updates automatically.  
❌ Others are unrelated.

---

## Q10
**Which interface gives CRUD methods?**  
✅ B) JpaRepository  
🧠 Why: It provides save, find, delete, etc.  
❌ Others are wrong abstractions.

---

## Q11
**findByEmail() generates:**  
✅ B) JPQL  
🧠 Why: Spring Data converts method name into JPQL.  
❌ Others are incorrect.

---

## Q12
**JPQL works on:**  
✅ C) Entities  
🧠 Why: JPQL uses entity names and fields.  
❌ Tables, columns, indexes are SQL concepts.

---

## Q13
**@Transactional ensures:**  
✅ C) All-or-nothing DB operations  
🧠 Why: It maintains data consistency.  
❌ Others are not transaction responsibilities.

---

## Q14
**Risk without @Transactional:**  
✅ C) Partial commits  
🧠 Why: Some operations may commit while others fail.  
❌ Others are incorrect.

---

## Q15
**Hibernate identifies entity using:**  
✅ C) Primary Key  
🧠 Why: @Id defines entity identity.  
❌ Object reference, hashcode, class name are irrelevant.
