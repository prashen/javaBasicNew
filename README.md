# JavaBasic - Learning | Practice | Notes
This repository is for everyone who is learning JAVA. I am also learning now so thought it would be good if
i make a github repo and start basic files and notes as Readme file. So it will be handy. How to use this:
+ I use _01 syntax for start point
+ So you can start from _01
+ I will add title and description when there is some concept or topic like Data Types, Strings etc
+ If you want to go to specific topic's code then follow the file name i mentioned near topic name.
+ Thanks !

# Hello world - Main_01.java
+ System.out.println("Hello world");

# Data Types - DataTypes_02.java
It includes all type of data types and example codes. There are two types of data types:
+ **Primitive data types**
  + **byte age = 32;** - stores whole numbers from -128 to 127 
  + **int dob = 1989;** - Stores whole numbers from -2,147,483,648 to 2,147,483,647 
  + **double heightValue = 5.4;** - Stores fractional numbers. Sufficient for storing 15 decimal digits 
  + **boolean isMarried = true;** - Stores true or false values 
  + **long salary = 10293847483920183L;** - Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 
  + **float floatingValue = 34.3452356e33F;** - 6 to 7 digit 
  + **char myChar = 'P';** - storing single character with single quote 
  + **short myShortNum = 5000;** - store whole numbers from -32768 to 32767
+ **Non-Primitive data types** - later discussed

# String - String_04.java
A String object can be created in one of two ways:

+ String Literal - Double quotes are used to construct string literals.
+ Using new: Using the keyword "new," a Java String is generated.

**1- Example: String  greetString = “Welcome”;**

This creates a String object in Java String Pool also referred to as String Constant Pool (SCP) which is a special place for all strings in Heap Memory.

Why is this special area in heap(SCP) required? Is it only for Strings?

Yes it is only for strings mainly for 2 reasons

+ Most Used Objects
+ Immutability of Strings

By storing only one copy of each literal String in the pool, JVM will optimize the amount of memory allocated for strings. When we declare a String variable and assign it a value, the JVM scans the pool for a String of the same value. If it is located, the compiler would automatically return a reference to its memory address rather than allocating additional memory.

**2 - Example: String greetString = new String(“Welcome”)**

This declaration creates a string object in heap memory and checks to see if it is in the string pool. If the string “Welcome” is not in the string pool, it will add it; otherwise, it will skip it and return a reference variable, which refers to the newly created heap object.