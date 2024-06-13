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
