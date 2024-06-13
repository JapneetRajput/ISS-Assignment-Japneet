## SQL Queries

SQL Query: Drop a table

```sql
DROP TABLE students_backup;
```

![Drop table](assets\image-35.png)

SQL Query: Drop a column

```sql
ALTER TABLE students
DROP COLUMN status;
```

![Drop column](assets\image-36.png)

SQL Query: Add a column

```sql
ALTER TABLE students
ADD COLUMN status VARCHAR(50) DEFAULT 'active';
```

![Add column](assets\image-37.png)

SQL Query: Create View

```sql
CREATE VIEW student_view AS
SELECT first_name, last_name, gpa
FROM students
WHERE gpa > 3.5;
```

SQL Query: Group by Multiple Columns

```sql
SELECT major, gpa, COUNT(*)
FROM students
GROUP BY major, gpa;
```

![Group BY](assets\image-38.png)

SQL Query: Using HAVING with GROUP BY

```sql
SELECT major, AVG(gpa) as avg_gpa
FROM students
GROUP BY major
HAVING AVG(gpa) > 3.5;
```

![HAVING](assets\image-39.png)

SQL Query: Using IFNULL

```sql
SELECT first_name, last_name, IFNULL(major, 'Undeclared') AS major
FROM students;
```

![If NULL](assets\image-40.png)
