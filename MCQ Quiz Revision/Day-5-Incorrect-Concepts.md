# Day 5 – Incorrect Concepts Revision
## (Module 1 + Module 2 | CodeShuttle)

> Purpose: Quick recall before interviews  
> Time needed: 5–7 minutes  
> Rule: Read once, speak anchors aloud

---

## 1️⃣ @RequestMapping vs @GetMapping

❌ Trap:
Used `@RequestMapping` for GET request

✅ Correct Thought:
- `@GetMapping` is **specific and preferred**
- `@RequestMapping` is generic (avoid in interviews)

🧠 Anchor:
> “Specific mapping beats generic mapping.”

---

## 2️⃣ ResponseEntity vs @ResponseStatus

❌ Trap:
Picked `@ResponseStatus` for full response control

✅ Correct Thought:
- `ResponseEntity` → body + status + headers
- `@ResponseStatus` → status only

🧠 Anchor:
> “Need full HTTP control → ResponseEntity.”

---

## 3️⃣ @ExceptionHandler vs @ControllerAdvice

❌ Trap:
Used `@ExceptionHandler` for global exceptions

✅ Correct Thought:
- `@ControllerAdvice` → global exception handling
- `@ExceptionHandler` → controller-level only

🧠 Anchor:
> “Global problems need global handling.”

---

## 4️⃣ HTTP Status: 200 OK vs 201 Created

❌ Trap:
Used `200 OK` after POST

✅ Correct Thought:
- `201 Created` → resource created
- `200 OK` → request succeeded (not creation)

🧠 Anchor:
> “POST creates → 201, not 200.”

---

## 5️⃣ PUT vs PATCH

❌ Trap:
Used PUT for partial update

✅ Correct Thought:
- PUT → full replace (idempotent)
- PATCH → partial update

🧠 Anchor:
> “PUT replaces, PATCH updates.”

---

## 6️⃣ DispatcherServlet Responsibility

❌ Trap:
Thought DispatcherServlet handles DI

✅ Correct Thought:
- DispatcherServlet → front controller (request routing)
- IoC Container → dependency injection

🧠 Anchor:
> “DispatcherServlet routes, Spring injects.”

---

## 🧠 15-Second Final Recall Block

@GetMapping > @RequestMapping  
ResponseEntity = body + status + headers  
@ControllerAdvice = global exceptions  
POST → 201 Created  
PUT = full replace  
PATCH = partial update  
DispatcherServlet = front door

---

