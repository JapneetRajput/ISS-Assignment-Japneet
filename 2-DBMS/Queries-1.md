## SQL Queries

SQL Query: Create and Show Databases

```sql
create database iss;
show databases;
```

![Create DB](assets\image.png)

SQL Query: Create Table

```sql
CREATE TABLE students (
    student_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    date_of_birth DATE,
    major VARCHAR(50),
    gpa DECIMAL(3, 2)
);

show tables;
```

![Create Table](assets\image-1.png)

SQL Query: Describe Table schema

```sql
describe students;
```

![Describe tables](assets\image-2.png)

SQL Query: Insert into students Table

```sql
INSERT INTO students (student_id, first_name, last_name, date_of_birth, major, gpa)
VALUES
    (1, 'Aarav', 'Sharma', '2000-01-15', 'Computer Science', 3.5),
    (2, 'Vivaan', 'Verma', '1999-05-23', 'Mathematics', 3.8),
    (3, 'Aditya', 'Singh', '2001-08-30', 'Physics', 3.2),
    (4, 'Vihaan', 'Kumar', '2000-12-11', 'Chemistry', 3.6),
    (5, 'Arjun', 'Reddy', '1998-07-19', 'Biology', 3.9),
    (6, 'Sai', 'Patel', '1999-02-14', 'Engineering', 3.4),
    (7, 'Reyansh', 'Mehta', '2001-06-10', 'Art History', 3.7),
    (8, 'Krishna', 'Nair', '2000-11-22', 'Literature', 3.3),
    (9, 'Ishaan', 'Kapoor', '1998-04-05', 'Philosophy', 3.5),
    (10, 'Shaurya', 'Malhotra', '1999-09-17', 'Economics', 3.6),
    (11, 'Ayaan', 'Mishra', '2000-01-15', 'Computer Science', 3.4),
    (12, 'Arnav', 'Gupta', '1999-05-23', 'Mathematics', 3.6),
    (13, 'Ansh', 'Pandey', '2001-08-30', 'Physics', 3.1),
    (14, 'Parth', 'Joshi', '2000-12-11', 'Chemistry', 3.5),
    (15, 'Aarush', 'Das', '1998-07-19', 'Biology', 3.8),
    (16, 'Ritvik', 'Chopra', '1999-02-14', 'Engineering', 3.3),
    (17, 'Atharv', 'Chatterjee', '2001-06-10', 'Art History', 3.6),
    (18, 'Kabir', 'Yadav', '2000-11-22', 'Literature', 3.2),
    (19, 'Laksh', 'Sinha', '1998-04-05', 'Philosophy', 3.4),
    (20, 'Aryan', 'Dutta', '1999-09-17', 'Economics', 3.5),
    (21, 'Vihaan', 'Chauhan', '2000-01-15', 'Computer Science', 3.7),
    (22, 'Rudra', 'Ghosh', '1999-05-23', 'Mathematics', 3.9),
    (23, 'Kabir', 'Roy', '2001-08-30', 'Physics', 3.2),
    (24, 'Arnav', 'Bansal', '2000-12-11', 'Chemistry', 3.4),
    (25, 'Arhaan', 'Saxena', '1998-07-19', 'Biology', 3.7),
    (26, 'Anay', 'Bakshi', '1999-02-14', 'Engineering', 3.5),
    (27, 'Darsh', 'Ahuja', '2001-06-10', 'Art History', 3.8),
    (28, 'Divit', 'Srivastava', '2000-11-22', 'Literature', 3.3),
    (29, 'Aarav', 'Chauhan', '1998-04-05', 'Philosophy', 3.6),
    (30, 'Vihaan', 'Bhatt', '1999-09-17', 'Economics', 3.4),
    (31, 'Vivaan', 'Dubey', '2000-01-15', 'Computer Science', 3.5),
    (32, 'Aditya', 'Joshi', '1999-05-23', 'Mathematics', 3.8),
    (33, 'Vihaan', 'Nanda', '2001-08-30', 'Physics', 3.2),
    (34, 'Shaurya', 'Sodhi', '2000-12-11', 'Chemistry', 3.6),
    (35, 'Aryan', 'Gill', '1998-07-19', 'Biology', 3.9),
    (36, 'Ayaan', 'Sehgal', '1999-02-14', 'Engineering', 3.4),
    (37, 'Reyansh', 'Ahluwalia', '2001-06-10', 'Art History', 3.7),
    (38, 'Sai', 'Mehrotra', '2000-11-22', 'Literature', 3.3),
    (39, 'Ritvik', 'Mahajan', '1998-04-05', 'Philosophy', 3.5),
    (40, 'Ansh', 'Mani', '1999-09-17', 'Economics', 3.6),
    (41, 'Parth', 'Shetty', '2000-01-15', 'Computer Science', 3.4),
    (42, 'Aarush', 'Nadkarni', '1999-05-23', 'Mathematics', 3.6),
    (43, 'Atharv', 'Taneja', '2001-08-30', 'Physics', 3.1),
    (44, 'Krishna', 'Khanna', '2000-12-11', 'Chemistry', 3.5),
    (45, 'Arjun', 'Mehrotra', '1998-07-19', 'Biology', 3.8),
    (46, 'Ishaan', 'Lal', '1999-02-14', 'Engineering', 3.3),
    (47, 'Laksh', 'Bhardwaj', '2001-06-10', 'Art History', 3.6),
    (48, 'Rudra', 'Narang', '2000-11-22', 'Literature', 3.2),
    (49, 'Darsh', 'Mathur', '1998-04-05', 'Philosophy', 3.4),
    (50, 'Kabir', 'Chadha', '1999-09-17', 'Economics', 3.5);
```

![Insert](assets\image-3.png)

SQL Query: Select all from students Table

```sql
select * from students;
```

![Select all](assets\image-4.png)

SQL Query: Select specific columns from students Table

```sql
SELECT student_id, major, gpa FROM students;
```

![Select specific](assets\image-5.png)

SQL Query: Select all from students Table where the student has a cgpa over 3.5

```sql
SELECT student_id, first_name, last_name, major, gpa
FROM students
WHERE gpa > 3.5;
```

![Select where](assets\image-6.png)

SQL Query: Select all from students Table where the student has a cgpa over 3.5 in a descending order

```sql
SELECT *
FROM students
WHERE gpa > 3.5
ORDER BY gpa DESC;
```

![Select where order by](assets\image-7.png)

SQL Query: Select all from students Table in a descending order and limit tuples to 5

```sql
SELECT *
FROM students
ORDER BY gpa DESC
LIMIT 5;
```

![Select order by limit 5](assets\image-8.png)

SQL Query: Select students majoring in 'Computer Science' AND a GPA greater than 3.5

```sql
SELECT student_id, first_name, last_name, major, gpa
FROM students
WHERE major = 'Computer Science' AND gpa > 3.5;
```

![Select Where AND](assets\image-9.png)

SQL Query: Select students majoring in 'Computer Science' or 'Mathematics'

```sql
SELECT student_id, first_name, last_name, major, gpa
FROM students
WHERE major = 'Computer Science' OR major = 'Mathematics';
```

![Select Where OR](assets\image-10.png)

SQL Query: Select students majoring in 'Computer Science' with a GPA greater than 3.5 or majoring in 'Mathematics'

```sql
SELECT student_id, first_name, last_name, major, gpa
FROM students
WHERE (major = 'Computer Science' AND gpa > 3.5) OR major = 'Mathematics';
```

![Select Where AND OR](assets\image-11.png)

SQL Query: Update the GPA of a specific student

```sql
UPDATE students
SET gpa = 3.9
WHERE student_id = 1;
```

![Update](assets\image-12.png)

![Select Where AND OR](assets\image-11.png)

SQL Query: Delete all students with a GPA less than 2.0

```sql
DELETE FROM students
WHERE gpa < 2.0;
```

![Delete](assets\image-13.png)
