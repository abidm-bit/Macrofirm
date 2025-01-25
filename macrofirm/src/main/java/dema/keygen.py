import sqlite3
from faker import Faker 
import random

fake = Faker()

def generate_key():
    pattern = "CCCCC-CCCCI-CCCIC-CCICC-ICIII"   
    key = ""
    for char in pattern:
        if char == "C":
            key += fake.random_uppercase_letter()
        elif char == "I":
            key += str(random.randint(0, 9))
        else:
            key += char
    return key

conn = sqlite3.connect('keys.db')
cursor = conn.cursor()

cursor.execute('''
CREATE TABLE IF NOT EXISTS keys (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    key TEXT UNIQUE NOT NULL
)
''')

for _ in range(1000000):  #define the # of keys to generate, I set 1,000,000 to keep the file size small lol 
    random_key = generate_key()
    try:
        cursor.execute('INSERT INTO keys (key) VALUES (?)', (random_key,))
    except sqlite3.IntegrityError:
   
        print(f"Duplicate key skipped: {random_key}")

conn.commit()
conn.close()
print("Keys generated and stored in keys.db!")
