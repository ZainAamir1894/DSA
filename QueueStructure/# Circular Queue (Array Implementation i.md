# Circular Queue (Array Implementation in Java)

## 📌 Overview

A **Circular Queue** is a linear data structure that follows **FIFO (First In First Out)** but with a twist — the last position connects back to the first, forming a circle.

This avoids wasted space in a normal queue by reusing empty positions.

---

## 🧠 Key Idea

Instead of letting `rear` go out of bounds, we use:

```
(rear + 1) % n
```

to wrap it back to the beginning.

---

## 📦 Data Members

* `int[] arr` → array to store elements
* `int front` → points to the first element
* `int rear` → points to the last element
* `int n` → size of the queue

Initial state:

```
front = -1
rear  = -1
```

This means the queue is empty.

---

## 🔄 Enqueue Operation (Insert)

### Algorithm:

1. Check if queue is empty:

   * If yes → set `front = rear = 0`, insert element
2. Check if queue is full:

   * If `(rear + 1) % n == front` → Overflow
3. Otherwise:

   * Update rear:

     ```
     rear = (rear + 1) % n
     ```
   * Insert element at `arr[rear]`

---

## 🔁 Dequeue Operation (Remove)

### Algorithm:

1. Check if queue is empty:

   * If `front == -1` → Underflow
2. If only one element: Means that while iterating, Front reaches Rear (front == rear)

   * Print/remove element
   * Set `front = rear = -1`
3. Otherwise:

   * Print/remove element at `front`
   * Move front:

     ```
     front = (front + 1) % n
     ```

---

## 🖨️ Display Operation

### Algorithm:

1. If queue is empty → print message
2. Start from `front`
3. Traverse using:

   ```
   i = (i + 1) % n
   ```
4. Stop when `i == rear`

---

## ⚠️ Important Conditions

### ✅ Empty Queue

```
front == -1
```

### ❌ Full Queue

```
(rear + 1) % n == front
```

---

## 🔁 Circular Behavior Example

Array size = 5

```
Initial: [-, -, -, -, -]

enqueue(1) → [1, -, -, -, -]
enqueue(2) → [1, 2, -, -, -]
enqueue(3) → [1, 2, 3, -, -]

dequeue() → removes 1

Now:
[-, 2, 3, -, -]

enqueue(4), enqueue(5), enqueue(6)

Final:
[6, 2, 3, 4, 5]
(front = 1, rear = 0)
```

👉 Notice how insertion wraps around to index `0`.

---

## 🎯 Advantages

* Efficient memory usage (no wasted space)
* Faster than shifting elements in a linear queue

---

## 🚫 Limitations

* Fixed size (array-based)
* Needs careful handling of indices

---

## 🧪 Summary

* Use `(index + 1) % n` for circular movement
* `front` → first element
* `rear` → last element
* Queue is full when next position of rear equals front

---

## 💡 One-Line Definition

A circular queue is a queue in which the last position is connected back to the first to make efficient use of space.

---
