# Module 6: Software Engineering Java/Spring

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

## Homework 4 (Defining API using OpenAPI)

The context: we continue working with the "to-do" list for your company application.

The task consists of the following parts:
Think about what endpoints your API should provide (homework 5 could decent start https://classroom.google.com/u/0/w/NTgyOTY1NjYwMjky/tc/NTg4ODgwMzAzMTYy)
Design and define at least two endpoints using OpenAPI (I recommend using Swagger UI - https://swagger.io/tools/swaggerhub/)
The outcome to be submitted: .yaml or .json OpenAPI specification of the endpoint. It is recommended to use PR to the repo with your Spring Boot application

## Homework 5 (Publish to github packages)
The goal is to create a workflow that publishes your artefact to GitHub packages.

The workflow should be triggered on the push to the main branch.

Here you can find instructions for gradle based project:https://docs.github.com/en/actions/publishing-packages/publishing-java-packages-with-gradle


## Homework 6 (Playing with docker)
Part 1
Create a Java application that prints the current time to standard output.
We want to dockerise this java application.
Task: write dockerfile which is doing it. You have to use alpine-linux as a base image.


Part 2
Build a docker image for your spring boot application (here you can use gradle task to build an image).
We want to push the images to the docker registry (you can use docker hub or any alternatives you prefer)
Task: publish your docker image to the docker registry. Share the name of the image.

## Authors

- [@yordanlp](https://www.github.com/yordanlp)

