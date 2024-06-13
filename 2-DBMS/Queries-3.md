## SQL Queries

SQL Query: Create Table courses

```sql
CREATE TABLE courses (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(100),
    credits INT
);
```

SQL Query: Create Table

```sql
CREATE TABLE enrollments (
    enrollment_id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    course_id INT,
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);
```

SQL Query: Insert Data into Courses Table

```sql
INSERT INTO courses (course_id, course_name, credits) VALUES
(1, 'Computer Science 101', 3),
(2, 'Mathematics 101', 3),
(3, 'Physics 101', 4),
(4, 'Chemistry 101', 4),
(5, 'Biology 101', 3);
```

SQL Query: Insert Data into Enrollments Table

```sql
INSERT INTO enrollments (student_id, course_id) VALUES
(1, 1),
(1, 2),
(2, 2),
(2, 3),
(3, 1),
(3, 4),
(4, 5),
(5, 3),
(5, 5);
```

SQL Query: Retrieve all students and the courses they are enrolled in

```sql
SELECT students.student_id, students.first_name, students.last_name, courses.course_name
FROM students
INNER JOIN enrollments ON students.student_id = enrollments.student_id
INNER JOIN courses ON enrollments.course_id = courses.course_id;
```

![Inner join](assets\image-23.png)

SQL Query: Retrieve all students and the courses they are enrolled in, including students who are not enrolled in any courses

```sql
SELECT students.student_id, students.first_name, students.last_name, courses.course_name
FROM students
LEFT JOIN enrollments ON students.student_id = enrollments.student_id
LEFT JOIN courses ON enrollments.course_id = courses.course_id;
```

![Left join](assets\image-24.png)

SQL Query: Retrieve all courses and the students enrolled in them, including courses that have no students enrolled

```sql
SELECT students.student_id, students.first_name, students.last_name, courses.course_name
FROM students
RIGHT JOIN enrollments ON students.student_id = enrollments.student_id
RIGHT JOIN courses ON enrollments.course_id = courses.course_id;
```

![Right join](assets\image-25.png)

SQL Query: A combination of LEFT JOIN and RIGHT JOIN with a UNION to achieve a Full JOIN

```sql
SELECT students.student_id, students.first_name, students.last_name, courses.course_name
FROM students
LEFT JOIN enrollments ON students.student_id = enrollments.student_id
LEFT JOIN courses ON enrollments.course_id = courses.course_id

UNION

SELECT students.student_id, students.first_name, students.last_name, courses.course_name
FROM students
RIGHT JOIN enrollments ON students.student_id = enrollments.student_id
RIGHT JOIN courses ON enrollments.course_id = courses.course_id;
```

![Full JOIN](assets\image-26.png)
