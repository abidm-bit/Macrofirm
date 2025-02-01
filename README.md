# Macrofirm
This is a parody keygen to activate your office suite. No more annual subscription fees, one key for a lifetime install. 

Demo:
https://github.com/user-attachments/assets/22d0a925-2d1e-484c-8c95-dc8fc2f11a66


JavaFX  (desktop app for Windows & Mac) 
  - includes icons for a Windows.exe and a MacOS.app 
  - Maven build
  - Python faker: used to generate keys, stored in a SQLite database
  - SQLite (absolutely no incoming/outgoing requests) - the program accesses keys locally


Python faker
  - The key has 25 characters, it follows this pattern
  - CCCCC-CCCCI-CCCIC-CCICC-ICIII
  - C (Characters) , I (Integers) 
  - 26 characters and 10 integers  (the permutations goes into a couple million keys)

I stored 1,000,000 keys to keep the db size to 81 megabytes. 


As for the missing unit test(s) -- I blame JavaFX's missing documentation lol. 
