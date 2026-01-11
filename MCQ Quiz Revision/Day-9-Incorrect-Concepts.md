# Day 9 – Incorrect Concepts & Fixes

## ❌ Mistake: Q15 – Hibernate uses class name to identify entity

### ❌ What I thought:
Hibernate uses class name to identify entities.

### ✅ Correct Concept:
Hibernate uses the **Primary Key (@Id)** to identify and track entities.

Two objects with the same ID are treated as the **same row** in the database.

### 🧠 Interview-ready line:
"Hibernate identifies and tracks entities using their primary key, not their class name."

This is critical for:
- Dirty checking
- Caching
- Update vs Insert decision
