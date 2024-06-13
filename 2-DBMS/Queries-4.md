## SQL Queries

SQL Query: Combine results from two SELECT statements - UNION

```sql
SELECT student_id, first_name, last_name FROM students LIMIT 5
UNION
SELECT course_id, course_name, credits FROM courses;
```

![UNION](assets\image-27.png)

SQL Query: Create a backup of the students table into a new table called students_backup - SELECT INTO alternative

```sql
CREATE TABLE students_backup AS
SELECT * FROM students;
```

![SELECT INTO](assets\image-28.png)

SQL Query: Insert data from one table into another table. For example, inserting students with GPA greater than 3.7 into a new table called honors_students

```sql
CREATE TABLE honors_students (
    student_id INT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    date_of_birth DATE,
    major VARCHAR(50),
    gpa DECIMAL(3, 2)
);

INSERT INTO honors_students (student_id, first_name, last_name, date_of_birth, major, gpa)
SELECT student_id, first_name, last_name, date_of_birth, major, gpa
FROM students
WHERE gpa > 3.7;
```

![Insert INTO Select](assets\image-29.png)

SQL Query: Add the unique attribute to the student_id field

```sql
ALTER TABLE students
ADD UNIQUE (student_id);
```

![UNIQUE](assets\image-30.png)

SQL Query: Adding a CHECK constraint to ensure that student_id is greater than 0

```sql
ALTER TABLE students
ADD CONSTRAINT check_student_id CHECK (student_id > 0);
```

![Check](assets\image-31.png)

SQL Query: Adding a status column with a default value of 'active'

```sql
ALTER TABLE students
ADD COLUMN status VARCHAR(50) DEFAULT 'active';
```

![Default](assets\image-32.png)

SQL Query: Creating a composite index on first_name and last_name

```sql
CREATE INDEX idx_first_last_name ON students(first_name, last_name);
```

![INDEX](assets\image-33.png)

SQL Query: Ensure the course_id column references a valid courses table

```sql
ALTER TABLE enrollments
ADD FOREIGN KEY (course_id) REFERENCES courses(course_id);
```

![Foreign key](assets\image-34.png)
