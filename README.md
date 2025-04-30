
## 💼 Hibernate CRUD Operations using Named Native Queries

This Java project demonstrates how to perform **Create, Read, Update, and Delete (CRUD)** operations using **Hibernate ORM** with **Named Native SQL Queries**. It covers two entity models: `Employee` and `Student`.

---

### 📁 Project Structure

```
src/
├── com.sit.model
│   ├── Employee.java
│   └── Student.java
├── com.sit.controller
│   ├── InsertData.java
│   ├── UpdateData.java
│   └── (Add/Delete/View classes for full operations)
└── com.sit.configuration
    └── HibernateUtil.java
```

---

### 🚀 Features

- ✅ Full CRUD operations using **Named Native Queries**
- 🧍 `Employee` Entity: `id`, `name`, `email`
- 🎓 `Student` Entity: `id`, `name`, `address`, `email`
- ⚙️ Hibernate for ORM and transaction management
- 📦 Clean separation of logic in model and controller packages

---

### 🛠 Technologies Used

- ☕ Java 8+
- 🔄 Hibernate 5+
- 🐬 MySQL / 🗃️ H2 (or any JDBC-compatible database)
- 📘 JPA Annotations
- 🧰 Maven (optional)

---

### ⚙️ Setup Instructions

1. **📥 Clone the Repository**:

```bash
git clone https://github.com/your-username/hibernate-crud-native-queries.git
cd hibernate-crud-native-queries
```

2. **🔗 Configure Database**:

Update your `hibernate.cfg.xml` with correct database credentials:

```xml
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/yourdb</property>
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">yourpassword</property>
```

3. **▶️ Run the Application**:

- Use your IDE (Eclipse, IntelliJ, or STS) to run specific classes:
  - `InsertData.java` ➡️ Insert a record
  - `UpdateData.java` ➡️ Update a record
  - Add similar classes for `Select` and `Delete`

---

### 🧾 Named Native Queries Overview

#### 🧍 For `Employee` Entity

```java
@NamedNativeQuery(name="InsertData", query="INSERT INTO Employee(emp_id, emp_name, emp_email) VALUES(:id, :name, :email)")
@NamedNativeQuery(name="SelectData", query="SELECT * FROM employee")
@NamedNativeQuery(name="UpdateData", query="UPDATE employee SET emp_name=:name, emp_email=:email WHERE emp_id=:id")
@NamedNativeQuery(name="DeleteData", query="DELETE FROM employee WHERE emp_id=:id")
```

#### 🎓 For `Student` Entity

```java
@NamedNativeQuery(name="UpdateData", query="UPDATE student SET sname=:name, semail=:email, saddr=:addr WHERE sid=:id")
@NamedNativeQuery(name="SelectData", query="SELECT * FROM student")
@NamedNativeQuery(name="DeleteData", query="DELETE FROM student WHERE sid=:id")
```

---

### 🧪 Usage Tips

- Use `session.getNamedNativeQuery("QueryName")` to execute a query.
- Bind parameters using `.setParameter("paramName", value)`.
- Always execute updates within a transaction using `Transaction tx = session.beginTransaction()`.

---

### 🙌 Contribution

Contributions are welcome! Feel free to fork the repo, improve features (e.g., DAO layer, service abstraction, exception handling), and open a PR.
