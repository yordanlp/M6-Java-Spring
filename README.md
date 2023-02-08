# Module 6: Java/Spring

Solution files for Module 6: Java/Spring homework assignments from Harbour.Space University's Master of Computer Science program.

## Homework 1

### Task1
Given an integer x, return true if x is a palindrome, and false otherwise.

Input: x = 121
Output: true

Input: x = 10
Output: false

### Task2
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string
is valid.
An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.


Input: s = "()[]{}"
Output: true
Input: s = "(]"
Output: false

## Homework 2

- create java applications using maven or Gradle
- add spring context as a dependency
- create the following classes (add interfaces if necessary): 
1. OxfordDictionary, UrbanDictionary
2. SpellChecker. It depends on the dictionary. SpellChecker should have the method "void checkSpelling()" that prints the name of the dictionary that was used to the console
3. Document. It depends on the spellChecker. The "document" constructor should print "Document is created!"

## Homework 3

* Create new GitHub repo or add new Gradle module to your existing one (you could check the example from here - https://github.com/igor-sakhankov/harbour-software-engineering)
* Create new spring boot web application
* The application should expose two endpoints:
GET /inbox/items  (returns any valid JSON)
POST /inbox/items/{id} (where ID - any integer number): accepts in the body {"id": 123, "status": "completed"}

## Authors

- [@yordanlp](https://www.github.com/yordanlp)

