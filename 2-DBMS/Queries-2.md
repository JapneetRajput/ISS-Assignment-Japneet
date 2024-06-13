## SQL Queries

### Injection hands-on :

```python
import mysql.connector

conn = mysql.connector.connect(
    host="localhost",
    user="arjun",
    password="arjun",
    database="iss"
)

cursor = conn.cursor()

# Parameterized query
query = "SELECT * FROM students WHERE first_name = %s"
cursor.execute(query, ('Aarav',))

results = cursor.fetchall()

for row in results:
    print(row)

cursor.close()
conn.close()
```

![Injection](assets\image-15.png)

SQL Query: Select the top 5 students with the highest GPA

```sql
SELECT * FROM students
ORDER BY gpa DESC
LIMIT 5;
```

![Select top](assets\image-15.png)

SQL Query: Select students whose first names start with 'A'

```sql
SELECT * FROM students
WHERE first_name LIKE 'A%';
```

![Select LIKE](assets\image-16.png)

SQL Query: Select students whose last names contain 'ar'

```sql
SELECT * FROM students
WHERE last_name LIKE '%ar%';
```

![Select LIKE](assets\image-17.png)

SQL Query: Select students with first names that are exactly 4 characters long and start with 'A'

```sql
SELECT * FROM students
WHERE first_name LIKE 'A___';
```

![Select _ wildcard](assets\image-22.png)

SQL Query: Select students majoring in either 'Computer Science', 'Mathematics', or 'Physics'

```sql
SELECT * FROM students
WHERE major IN ('Computer Science', 'Mathematics', 'Physics');
```

![Select Where IN](assets\image-18.png)

SQL Query: Select students with a GPA between 3.0 and 3.2

```sql
SELECT * FROM students
WHERE gpa BETWEEN 3.0 AND 4.0;
```

![Select Between](assets\image-19.png)

SQL Query: Using aliases to make column names more readable

```sql
SELECT
    student_id AS ID,
    first_name AS 'First Name',
    last_name AS 'Last Name',
    major AS 'Major Subject',
    gpa AS 'Grade Point Average'
FROM students;
```

![Aliases](assets\image-20.png)

SQL Query: Using table aliases for joining tables (assuming there's another table courses and an enrollments table)

```sql
SELECT
    s.student_id,
    s.first_name,
    s.last_name
FROM
    students s;
```

![Select using Alias](assets\image-21.png)
