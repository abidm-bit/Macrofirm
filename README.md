# Macrofirm
This is a parody keygen to activate your office suite. No more annual subscription fees, one key for a lifetime install. 

[Link to a video demonstration. ](https://github.com/abidm-bit/Macrofirm/wiki/Macrofirm-GUI-Project)

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



I haven't figured out how to package this correctly with JLink and JPackage lol. 
I intend to package this with Jlink to minimize the file size and to ensure the app runs quickly.

