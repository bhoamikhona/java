# Section 03: Classes, Objects, and Their Members

**About:** In this section we will get started with the language basic series which also includes a few other follow up sections. As the title of the section suggests, we will look classes, something called objects, and the fundamental units that make up classes and objects.

## Agenda

- Let's look at the agenda for this section.
- ![s-3-intro](https://github.com/user-attachments/assets/d1e2bd18-0cf5-41ff-b503-b546593aced0)
- Java is an <ins>object-oriented programming language</ins> and so, we begin the section by discussing about <ins>object-oriented environment</ins> and its use in modeling real-world scenarios.
- For this we will introduce Java's two of the most fundamental object-oriented concepts called <ins>class</ins> and <ins>object</ins>.
- We'll understand this concepts conceptually and also see how they can be created in Java.
- We will next look at some absolute basic coding constructs in Java which we need to know before we start programming in Java.
- Our next few lessons will include an in-depth coverage of variables.
- A variable is a basic unit of a class and is responsible for holding data i.e. it is basically like a container.
- Now, while a variable in its very basic form can hold a single value, we often also need variables that can hold a group of values; and for that we can use an array.
- So, we next look at an array which would be our first data structure of the course.
- An array is also one of the most basic data structures any programming language supports.
- Other sophisticated data structures will be discussed in the collections framework section, which comes later in the course.
- While variables help with holding a software's data, a software also needs something to encapsulate its business logic, and that's where methods come in.
- Our next few lessons will include an in-depth coverage of methods.
- Like a variable, a method is also a basic unit of a class.
- So, a software's business logic or algorithms will be part of methods.
- Finally, we will look at something called constructors which as the name implies, help in constructing something and that something would be objects.
- So, constructors help with creating objects.
- That's the agenda.

> [!TIP]
>
> In this course we take a top-down approach in learning the basics of the Java language i.e. instead of getting into the nitty-gritty details of the language, we first understand how Java as an object-oriented programming language helps model real world scenarios using classes and objects; and then we look their constituent components.
>
> We will also write several demo programs as we go alone and you will also be given a few coding exercises that would help validate and also reinforce what you have learned.

## Table of Content

- [Section 03: Classes, Objects, and Their Members](#section-03-classes-objects-and-their-members)
  - [Agenda](#agenda)
  - [Table of Content](#table-of-content)
  - [Lessons Learned](#lessons-learned)
    - [Classes \& Objects](#classes--objects)
    - [Demo: Absolute Java Basics](#demo-absolute-java-basics)
      - [print vs println](#print-vs-println)
    - [Identifiers - A Note on Naming Rules](#identifiers---a-note-on-naming-rules)
    - [Variables: Introduction](#variables-introduction)
    - [Demo: Declaring \& Re-intializing Variables](#demo-declaring--re-intializing-variables)
    - [Assignment 01: Currency Converter - Creating a Class with Variables](#assignment-01-currency-converter---creating-a-class-with-variables)
    - [Variables: Primitive Types](#variables-primitive-types)
    - [Primitive Variables: Integers + Demo](#primitive-variables-integers--demo)
    - [Demo: Other Integer Literal Formats](#demo-other-integer-literal-formats)
    - [Primitive Variables: Floating-Point Numbers + Demo](#primitive-variables-floating-point-numbers--demo)
    - [Demo: Floating-Point Pitfalls](#demo-floating-point-pitfalls)
    - [Primitive Variables: Character Data Type + Demo](#primitive-variables-character-data-type--demo)
    - [Demo: Alternate Ways to Initialize char Variables](#demo-alternate-ways-to-initialize-char-variables)
    - [Demo: Primitive Variables: Boolean Data Type](#demo-primitive-variables-boolean-data-type)
  - [Quiz 02](#quiz-02)
  - [Author](#author)

## Lessons Learned

### Classes & Objects

- We know that Java is an Object Oriented Programming (OOP) language, and if you recollect from the previous section, we also said that an OOP language helps model real world scenarios in a more natural way, and it does so with the help of objects and classes.
- OOP, as its name suggests, is all about objects, and an object is created from a class.
- In the last section, we looked at the `HelloWorld` class.
- Both classes and objects are the most fundamental units in an OOP language.
- In this lesson, we will first understand class and objects at a conceptual level i.e. how they represent real-world scenarios.
- Then we will see how they are represented in a Java program.
- Object Oriented Programming, which in short is often referred to as OOP, traces its roots back to 1960s.
- So, it is a very old programming paradigm and it was conceived to implement large, complex projects in a simple way.
- And by that we mean to help model real world scenarios in a more natural way.
- So, that's the main benefit of OOP.
- Let's take a look at a few real world examples.
- One example is a student registering in a particular course which is offered by a particular department.
- ![oop-ex-1](https://github.com/user-attachments/assets/9eb60f99-e9f9-44f1-aa4e-506575a37fda)
- Another example would be a customer buying a product.
- ![oop-ex-2](https://github.com/user-attachments/assets/dee7af62-2c6f-457c-8e0d-ea86fb50eb65)
- Similary, we can have a doctor treating a patient.
- ![oop-ex-3](https://github.com/user-attachments/assets/d8eb29ed-934e-4db8-8ff6-16a0f9f6cc41)
- And all these examples can be more naturally modeled or represented in an object-oriented environment.
- So, let's see how this is possible and let's pick the first example.
- ![oop-ex-1](https://github.com/user-attachments/assets/9eb60f99-e9f9-44f1-aa4e-506575a37fda)
- Here we have 3 entities viz student, course, and department.
- Here, a student would have some data associated with him or her and can also have some behavior associated.
- Data would be things like student name, student age, gender, address, etc.
- Behavior would be like registering for a course, or updating one's profile information.
- Similarly, course and department would also be associated with some data and some behavior.
- Here is an instance where we have a student named John and we have 4 courses and 2 departments viz Computer Science and Civil.
- ![oop-eg-1](https://github.com/user-attachments/assets/dc6a0daf-50c3-4aa1-82f0-6bad6f3a2376)
- So, here we have some instances with data being just the name like John or Java or Computer Science.
- We can have these four courses offered by the CS department and John can register in these three courses.
- ![oop-eg-2](https://github.com/user-attachments/assets/6a9a1401-9c42-4d22-b27f-a513deb81ebd)
- So, that's some behavior or actions happening between these instances.
- So, this is a realistic scenario where the student John has registered in three courses which are offered by the CS department.
- So, an instance like John can be visulized in this way, where data apart from the name would also include other things like student ID, gender, and courses that John has registered in.
- ![oop-eg-3](https://github.com/user-attachments/assets/f1b75acd-ae15-447b-adfd-0248b2f89579)
- Similarly, John can also perform the two actions - registering for a course and updating his profile information.
- In an object-oriented environment, this data that John's instance can have is generally referred to as state of the instance, while these actions as just behavior.
- ![oop-eg-4](https://github.com/user-attachments/assets/cabfd4cd-8c1f-4302-aa11-b987b53f8027)
- And this whole instance of John is referred to as an object.
- So, the student John is represented by this object, and similarly, we have other students represented by other objects which are unique to those students.
- So, an object has both state and behavior, and these objects cannot exist by themselves.
- There should be some sort of specification that tells the data that objects can have, like ID, name, gender, and so on; and also behavior like course registeration and update profile.
- And that specification is the class.
- So, class is like a blueprint and objects are actual instances of the class.
- In fact, often the term instance is also used to refer to an object.
- Here is an illustration of relation between a class and its objects.
- ![oop-eg-5](https://github.com/user-attachments/assets/955e7e63-0728-473b-9f02-4c991dccb7a9)
- At the top we have the student class defining the state and behavior that its object can have.
- State includes student information, such as ID, name, and gender, and there is only one behavior defined which allows the student objects to update their profile information.
- Now, for the sake of simplicity, course-related stuff like the courses registered by a student has been omitted from this illustration.
- And we can also see the three student objects in ellipticals and these are created from the `Student` class.
- Each student object has its own state.
- For example, first student's name is John, who is male and has a student ID of 1000.
- Similarly, second student's name is Raj, who is also a male and has an ID of 1001.
- Third student's name is Anita, who is a female and has an ID of 1002.
- And the behavior `updateProfile()` would be associated with all three objects i.e. it is common to all three of them.
- Now, in the `Student` class, `updateProfile()` would be a method.
- So, methods define the behavior.
- And in the last section we have seen the `main()` method in the `HelloWorld` class.
- Object state is defined by variables.
- Variables and methods in a class are considered as members of the class.
- ![oop-eg-6](https://github.com/user-attachments/assets/906c1aa4-97f1-4575-899e-d943e9acb65d)
- Later in the section, we will learn about both, variables as well as methods.
- Now, apart from variables and methods, a class can also have other less commonly used members such as nested classes and nested interfaces, which will be discussed much later - in the second half of the course.
- So, when someone refers to class members, they are normally referring to either variables or methods.
- That's about it. Conceptually, that's all there is to class and its objects.
- Now let's look at how they are represented in code, and we are going to use the same `Student` class example.
- For now, let's now worry about writing the code.
- Our goal for now is to just get a feel for how to create an object from a class in Java.

```java
class Student {
  // variable declarations
  int id;
  String name;
  String gender;

  // method definitions
  boolean updateProfile(String newName) {
    name = newName;
    return true;
  }
}
```

- So, here is the definition of Student class.
- It is first declaring the variables which would represent the state that student objects can have.
- So, we have ID, name, and gender.
- And variables are like containers as they hold some data, and each variable is also associated with something called a data type which tells what type of data the variable can hold.
- For instance, `id` is declared as an `int`, and `int` means integer, which means that `id` can hold integers like 1000, 1001, etc.
- Similarly, name and gender are declared with the data type of `String`.
- `String` implies that the variables can hold textual data like "Anita" for name and "female" for gender.
- `int` datatype will be discussed later in the sectio, while `String` will be discussed in one of the subsequent sections.
- Next, the `Student` class also defines the method `updateProfile()`, which simply updates the existing name with a new name, and the new name is passed as input to the method.
- Method parameter represents the input.
- In this case, it has the name `newName` and is of type `String`.
- Method parameter is also a variable, just like `id` or `name`.
- In the body of the method, the variable `name` is assigned with the value of the method parameter `newName`.
- `=` is an assignment operator and it just assigns the value on the right to the variable on the left.
- Methods will also be discussed later in this section.
- So, that's the `Student` class.
- Next, let's see how we can create a `Student` object and then initialize its state.
- We will also see how the `Student`'s only method `updateProfile()` can be executed.
- For that we will use a new class called `StudentTest`.

```java
class StudentTest {
  public static void main (String[] args) {}
}
```

- Let's assume that the code is written in the `main()` method of this class.
- So, the first step is to create a `Student` object, and this is how it is done:

```java
class StudentTest {
  public static void main (String[] args) {
    // 1. Create a new student object
    Student s = new Student();
  }
}
```

- You would use the keyword `new`, which would be followed by the keyword `Student`, which is followed by a set of parenthesis.
- So, `new Student()` would create a `Student` object, which is then assigned to a variable called `s` whose datatype is `Student`, which indicates that `s` would hold a `Student` object.
- So, it is similar to the way we declare the variable `id` in the `Student` class.
- With `id`, the datatype was `int`, indicating that it would store an integer value.
- So, we created a `Student` object name `s`.
- Next we need to initialize its state i.e. we need to set the values for the variables `id`, `name`, and `gender` that the student class has declared; and for that we use the dot operator i.e. we would have the object name `s`, followed by `.`, followed by variable name, eg `id`.
- Then we assign it with a value, which is `1000` in this case.

```java
class StudentTest {
  public static void main (String[] args) {
    // 1. Create a new student object
    Student s = new Student();

    // 2. Setting student's state
    s.id = 1000;
    s.name = "joan";
    s.gender = "male";
  }
}
```

- Here we have double quotes enclosing "joan" and "male", but not for the `id` value 1000, and that's because joan and male are strings, and in Java, for strings we need to use double quotes.
- So, the student object `s` now has a state.
- However, let's assume that the name was misspelled as 'joan' instead of 'john', and so we need to fix it.
- For that we need to execute the `updateProfile()` method and pass in the correct name "john" as an input.

```java
class StudentTest {
  public static void main (String[] args) {
    // 1. Create a new student object
    Student s = new Student();

    // 2. Setting student's state
    s.id = 1000;
    s.name = "joan";
    s.gender = "male";

    // 3. Updating profile with correct name
    s.updateProfile("john")
  }
}
```

- The method would then update the name variable with the new name "john".
- So, to execute `updateProfile()` method, we once again use the dot operator i.e. object name `s` followed by `.` followed by `updateProfile()` and we are passing "john" as input to the method.
- Here we say that we are invoking or calling the `updateProfile()` method on the object `s`.
- So, that's how we create an object, initialize it with state, and invoke its methods.
- Actually, to initialize object state, it is normally done using something called constructors, but they will be discussed later in the section, so doing it the way we see here is not done in professional projects, but this is just for us to get started for intiializing state.
- Also note that in real Object Oriented software, you would have tons of objects communicating with each other, and the way one object communicates with other is by invoking a method of the object and passing any necessary data as input.
- So, that's about it.
- Hopefully you now understand what a class and object is, how they represent real world entities like student, and how they can be created in Java.

### Demo: Absolute Java Basics

- Before we start looking at features, such as variables and methods, in this lesson, let's look at some really absolute basics of Java language.
- Here is what we are going to look at in this particular lesson:

  - Naming rules for classes/methods/variables
    - First character of a class/method/variable name has to be either a letter, or an underscore, or $
      - If you have anything else then you will get an error.
    - Remaming characters can be a letter, underscore, $, or numbers.
    - We cannot use any reserved keywords.
    - We cannot have duplicate names.
    - We also cannot have duplicate methods.
  - Java is case-sensitive
  - Printing to console
    - `System.out.println()`
    - `System.out.print()`
    - `\n`
  - Comments or Disabling Code
    - Single line comments
    - Block Quotes
  - Arithmetic Operations
    - `+`
    - `-`
    - `*`
    - `/`
    - `%`

#### print vs println

| `print()`                                                              | `println()`                                |
| ---------------------------------------------------------------------- | ------------------------------------------ |
| Does not add any new line                                              | Adds a new line after message is displayed |
| Printing begins in the same line                                       | Printing begins in the next line           |
| Compatible only with argument operations, or else it is a syntax error | Is operable with arguments                 |

> [!IMPORTANT]
>
> If you were to use `println` followed by `print`, the `print` statement will appear on the next line, but if the `print` statement comes before the `println`, the statement will stay on the same line.

- `System` is just a class in Java library, and `System` has this variable called `out`.
- So, we are saying `System.out` and that's how we are accessing the `out` variable.
- This variable corresponds to an object and that object has these methods `print` and `println`.
- That's how we are printing the strings.

### Identifiers - A Note on Naming Rules

- This is a minor note on naming rules that we discussed in previous lecture.
- The names that we associate with classes, methods, variables, or any other user-defined item in the program are also sometimes formally referred to as Identifiers (or Java Identifiers).
- You may come across this term in some resources such as Java Language Specification.
- In the previous lecture, we also discussed the rules for these names, e.g., cannot start with a digit or cannot be a reserverd keyword.
- In addition to what we discussed, it cannot also be `null`, `true`, `false`.
- These are referred to as literals and will be discussed later in this section. So, just to summarize, an identifier will have the following rules:
  - It can include letters (a-z, A-Z), digits (0-9), the underscore character (\_), and the dollar sign ($).
  - It cannot begin with a digit. Subsequent characters can include a digit.
  - It cannot be a reserved keyword in Java (e.g., `class`, `interface`, `public`, `static`, etc.).
  - It cannot be `null`, `true`, `false`
  - Identifiers are case-sensitive (MyClass and myclass would be considered different).

### Variables: Introduction

- Let's now look at variables.
- We know that object state is represented by variables i.e. variables store state information like student ID, student name, and student gender.
- So essentially, variables are like containers that hold some data.
- Some variables hold numeric data like student id, some other variables hold textual data like student name, and some may hold objects like the student object.
- We saw this when discussing class and object.
- What a variable can hold is determined by the datatype of the variable.
- So, every variable has a data type associated with it.
- And we saw this earlier when discussing class and object, and we can simply call this data type as a variable's type.
- So, if the type is `int`, it can hold numeric data like 1000, and if the type is `String`, it can hold textual data like "john".
- If the type is a class name like `Student`, then the variable can hold a student object.
- In Java, a variable's type is defined when the variable is first declared or created, and that type cannot be changed thereafter i.e. the type is fixed, which means that the variable can only hold that type of data.
- And if you try to store some other type of data, then you get a compilation error.
- For instance, if you say that a variable is of type `int`, then you can only store integers in it.
- And if you try to store a string in that variable, then you get a compilation error.
- Due to this, Java is referred to as a <ins>statically typed language</ins>, as the type of the variable is static, once defined i.e. it cannot be changed - and the compiler ensures this.
- This type of checking performed during compilation is referred to as <ins>static type checking</ins>.
- So, always keep that in mind that Java is a statically typed language.
- Now, in some languages like JavaScript, same variable can hold different types of data i.e. at one point in the program, it may hold a numeric value, while later at some point in the program it may hold textual data.
- Due to this, such languages are referred to as <ins>dynamically typed languages</ins>, as the type of the variable is dynamic i.e. it is not constant anymore.
- The type checking in such languages is mostly done at runtime, and therefore is referred to as <ins>dynamic type checking</ins>.
- One main advantage of static type checking over dynamic type checking is that static type checking allows earlier detection of programming mistakes i.e. during compilation time itself, you will be able to find the mistakes.
- For instance, if you assign a variable or a literal of one type to a variable of another type, then the compiler will report that as an error and you can fix it.
- So subsequently, during the program execution, you will not have any issues.
- But with the dynamically typed language, you will find the issues at runtime itself when you are executing the program; and at that point it is too late, so would have to fix it.
- Meanwhile, your users might have a bad experience.

```java
int id = 1000;
String name = "john";
Student s = new Student();
```

- Here we can see that a variable is holding either raw data like 1000 in the case of `id` or is holding an object like in the case of `s`.
- If the variable holds raw data like 1000 we refer to such a variable as <ins>primitive variable</ins>, as the data it is holding is really primitive i.e. it is as basic (primitive) as it can be.
- So, variable `id` is a primitive variable, whereas the variable that holds an object is referred to as an <ins>object reference</ins>.
- So, the variable `s` is an object reference i.e. it is holding a reference to an object.
- So, it is actually not holding an object but, a reference to an object.
- But, we will discuss that later.
- So, a variable can be primitive or an object reference, and that is determined by the variable's data type.
- In Java there are 8 primitive types, and `int` is only one of them.
- So, if a variable has any of those 8 primitive types, then it would be a primitive variable.
- If the variable's type is a class like `Student`, then the variable will be an object reference.
- And it would also be an object reference if the variable's type is something called an interface.
- Interfaces will be introduced after a few sections.
- Here, the variable name which is of type `String` is also an object reference as `String` is a class in Java.
- So, `String` is a class in Java library and we will look at it later.
- It looks like a primitive, as it does not have the `new` keyword, but internally, it is an object reference i.e. it holds a reference to a `String` object - more on that later.
- Both primitive types and object references will be discussed later.
- Now, we know how a variable declaration looks like, but, let's look at it in a more formal way.
- Declaring a variable involves stating the variable type, followed by the variable name.
- And it can be optionally initialized with something called a literal or an expression.

```java
// syntax to declare variables (not actual code)
<type> <name> [= literal or expression]
```

- Here, `=` symbol is referred to as an assignment operator, as it assigns the value on its right to the variable on its left.
- A literal is a simple raw data.
- Below are some example declarations involving literals:

```java
// literal examples
int id = 1000;
boolean flag = true;
String name = "john";
```

- In the first example, we are declaring an integer variable called `id` which is initialized with the literal 1000.
- In the second example, we are declaring a boolean variable called `flag` which is initialized with the literal `true`.
- And boolean is another primitive like `int`.
- In the third example, we are declaring a string variable called `name` which is initialized with the literal "john".
- So, all of these are literals.
- An expression is something that gets evaluated to a single value.
- Let's take a look at a few examples of expressions:

```java
// expression examples
int id = x;
```

- Here the integer variable `id` is initialized with another variable called `x`.
- The variable `x` is an expression, and the value it holds will be assigned to the variable `id`.
- So, `x` would have been declared somewhere earlier in the program.
- So, when the program is executing and this statement executes, `x` would have some value, and that value gets assigned to the variable `id`.
- So, you can see the difference between a literal and an expresssion.
- Literal is just a value, like 100 and needs no further computation, where as an expression involves computation.
- In this case, computation would be to take the value of `x` and assign it to `id`.

```java
// expression examples
int id = x + y;
```

- In this second example, the expression is `x + y`, where `x` and `y` are two variables.
- So, during the program execution, the values that `x` and `y` hold will be added, and the result is assed to the variable `id`.

```java
// expression examples
Student s = new Student();
```

- Here the expression is the `Student` object creation part i.e. `new Student()`, which at runtime creates a new student object and assigns it to the variable `s`.
- Such kind of declarations where we declare the value of a variable are reffered to as <ins>declaration statements</ins>.
- So, they are a type of statements.
- And declaration statements can appear anywhere in a class.
- ![variables-1](https://github.com/user-attachments/assets/43771527-b71c-4d46-82a2-73b085e0797a)
- So, we have looked at variable declaration, but often we would want to change the value assigned to a variable i.e. the variable would have been initialized during variable declaration, but later on in the program we would want to re-assign the variable with a different value.
- In fact, the term variable itself suggests that it is something whole value can be changed.
- And an assignment statement is used to change the variable value.
- Earlier we have seen the declaration statement, and here is the syntax of an assignment statement:

```java
// assignment statement syntax
<name> = literal or expression
```

- It is similar to a declaration statement but, without the variable type, as the type has already been defined in the declaration statement.
- Here are two example assignment statements:

```java
// example assignment statements:

count = 23; // literal
count = x + y; // expression
```

- Note that such assignment statements cannot appear at class level i.e. they cannot appear within the body of the class.
- They can appear inside members of a class such as methods.
- We would get a compilation error if we try to re-assign a variable's value directly within the body of a class.
- That's about it.
- That's a short introduction to variables.
- A variable is simply a container, and what it holds depends on its data type.
- Keep in mind that Java is statically typed language.
- Next, we will write a simply program and test everything we have seen in this lesson.

### Demo: Declaring & Re-intializing Variables

- In this lesson, let's go ahead and create a new clas, and then we will declare a few variables, and we will also re-initialize those variables.
- So, we will declare teh variables with both, literals as well as expressions and we will also re-initialize those variables.
- So, that's what we have seen in the previous lesson, and in this lesson we are going to test them out.
- So, in this lesson we will create a new class called Student; and as we progress through this section, as we learn new things like the primitive variables and so on, we will also extend this particular class.
- Let's create our `Student` calss.

```java
public class Student {}
```

- Let's create a new variable called `id`.

> [!NOTE]
>
> Identation should be of 4 spaces.

- Later we will also talk about coding conventions, and there we will also discuss about indentation.
- Indentations help in readability of the code.
- So, let's create our first variable called `id` of type `int` and first, let's just look at literal initialization.

```java
public class Student {
  int id = 1000;
}
```

- Let's also write a simple method called `compute()` and all it does is it prints the variable.

```java
public class Student {
  int id = 1000;

  void compute() {
    System.out.println(id);
  }
}
```

- Now let's write our `main()` method otherwise we cannot run this.

```java
public class Student {
  int id = 1000;

  void compute() {
    System.out.println(id);
  }

  public static void main(String[] args) {}
}
```

- THe first thing that we will do is we will create an object of the `Student` class.

```java
public class Student {
  int id = 1000;

  void compute() {
    System.out.println(id);
  }

  public static void main(String[] args) {
    Student s = new Student();
  }
}
```

- Now if we compile and run it, it still won't print anything and that's because a `Student` object has been created but, we will still did not invoke the `compute()` method.
- So, let's now invoke the method on the student object.

```java
public class Student {
  int id = 1000;

  void compute() {
    System.out.println(id);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now it will print the value of `id`.
- So, that's with the literal.
- Now let's create a new variable and initialize it with an expression.

```java
public class Student {
  int id = 1000;
  int nextId = id + 1;

  void compute() {
    System.out.println(id);
    System.out.println(nextId);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- So, `id + 1` is an expression, and when the program is executing and when the controller comes to see the statement `int nextId = id + 1`, `id` will have the value of 1000 and so, `nextId` will become 1001.
- Then when the `compute()` is invoked, the `nextId` will be printed along with `id`.
- So, when the `s` student object has been created, at that instance the `int id = 1000` and `int nextId = id + 1` get executed.
- When `s.compute()` is executed, the control goes into the `compute()` method and prints the `id` and `nextId`.
- That's how we get 1000 and 1001 printed.
- Now, `nextId` cannot be declared above `id` declaration.

```java
public class Student {

  // nextId cannot be declared before id
  int nextId = id + 1; // error
  int id = 1000;

  void compute() {
    System.out.println(id);
    System.out.println(nextId);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- If we do that, we get an error that says "illegal forward reference".
- So, when we have this declaration statement: `int nextId = id + 1`, `id` is not yet declared.
- This means that the scope of `id` (called as the scope of variable) it starts where it is declared and it is for the enitre class.
- But, we will discuss it more later on.
- Now, as we mentioned earlier, the declaration statement can appear anywhere in the class.
- So, let's move `nextId` to the `compute()` method.

```java
public class Student {
  int id = 1000;

  void compute() {
    int nextId = id + 1;

    System.out.println(id);
    System.out.println(nextId);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now if we recompile and re-run, it is still printing 1000 and 1001.
- So, when the `Student` object `s` is created, at that instance only the `id` value has been initialized.
- But, when we invoke the `compute()` method, then control comes to line `int nextId = id + 1` inside it and then `nextId` will be initialized with 1001. Subsequently, those values will be printed.
- Now, we also said that in the declaration of the variable the initialization is optional.
- So, let's see what happens if that's the case.

```java
public class Student {
  int id;

  void compute() {
    int nextId = id + 1;

    System.out.println(id);
    System.out.println(nextId);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- It prints the value 0 for `id` and 1 for `nextId`.
- So, if we are not initializing, then it is getting a default value of 0.
- And that's the case if the variable is of type `int`.
- So, if the variable is of type `int`, it gets a default value, and variables of other types might get some other value.
- Now let's see what happens if we have `id` declared inside of `compute()` as well.

```java
public class Student {

  void compute() {
    int id; // error
    int nextId = id + 1;

    System.out.println(id);
    System.out.println(nextId);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- We get an error which says "variable id might not have been initialized".
- But when we had it in the top level of the class, it was not an issue but, once we moved it inside `compute()`, then it gave us a compilation error.
- So, the thing is that, the variables that we declare inside a method are called as <ins>local variables</ins> and they do not get any default values.
- So, just keep that in mind.
- So, when we declare a variable at the top level of the class, it is called an <ins>instance variable</ins> but, when we declare it in a method, it is called as local variable.
- We will discuss both of them in one of the subsequent lessons.
- There is also nother type of variable called <ins>static variable</ins> which is also declared at the class level, and just like an instance variable, it will also get a default value.
- So, both static and instance variables will be declared at the class level and they would get default values, but local variables will not get default values. More on that later.
- Now, in order to solve the error that we are getting, we can either initialize the `id` variable with a value in the declaration statement or we can re-assign its value with an assignment statement, and then it will be fine.

```java
public class Student {

  void compute() {
    int id;

    // reassigning variable
    id = 1000;

    int nextId = id + 1;

    System.out.println(id);
    System.out.println(nextId);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now if we recompile and re-run the program, it will be fine.
- Now lets declare the variable at the class level and re-initialize it inside the `compute()` method.

```java
public class Student {
  int id;

  void compute() {
    // reassigning variable
    id = 1000;

    int nextId = id + 1;

    System.out.println(id);
    System.out.println(nextId);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now it prints 1000 and 1001.
- This is because, `id` is initially 0 but, when the `compute()` function is invoked, the `id` is re-initialized to 1000.
- Then in the next statement `nextId` is computed as 1001.
- So, this is how we reinitialize variables.
- Now, you might also recall from the previous lesson that if we re-assign the variable `id` at class level then it will not work.

```java
public class Student {
  int id;
  id = 1000; // error

  void compute() {
    int nextId = id + 1;

    System.out.println(id);
    System.out.println(nextId);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- This is because assignment statements cannot appear at class level.
- They can only appear at in methods or in other places called contructors, which we will discuss later.
- But at the class level, you can only have declaration statements.
- So, you cannot have assignment statements there. That's is just how Java is.
- So, let's move the assignment statement back inside the `compute()` method.
- Now, let's initialize the `id` variable at its declaration to 1000 and then reinitialize it inside the `compute()` method to "bhoami".

```java
public class Student {
  int id = 1000;

  void compute() {
    id = "bhoami"; // error
    int nextId = id + 1;

    System.out.println(id);
    System.out.println(nextId);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now we get the error "incompatible types: String cannot be converted to int".
- So, `id` is of type `int` but then we are trying to reinitialize it with string "bhoami" and that won't work because Java is statically typed language.
- You also cannot say that the type of `id` is `int` and then initialize it to a string literal.

```java
public class Student {
  int id = "bhoami"; // error

  void compute() {
    int nextId = id + 1;

    System.out.println(id);
    System.out.println(nextId);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- We get the same error of incompatible types.
- So, that's the static type checking that the compiler is performing and hence, always keep in mind, Java is a statically typed language.
- So, if somebody is going to ask you about that, you should just say that it is a statically typed language.
- Now let's make the print statement a bit more meaningful.

```java
public class Student {
  int id = "bhoami"; // error

  void compute() {
    int nextId = id + 1;

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- So, the thing is that we know that `+` is for addition, as we discussed previously.
- We will also discuss arithmetic operations later on and then we will talk about this `+` symbol.
- But when it is used with strings, then it works as a <ins>concatenation operator</ins>.
- And a concatenation operator is someting which concatenates, so it would append the thing on its right to the thing on its left.
- In this `"id: " + id`, the thing on the right is the variable `id` and its value is 1000.
- So, that value will be appended to this piece of text: `"id: "` which is a string literal.
- And that is what is getting printed.
- So, whenever `+` is used with strings, it acts as a concatenation operator, but otherwise it would act as a `+` symbol, which means that you only have numeric operands.
- So, both of them would be something like integers or some other types, but definitely not strings.

### Assignment 01: Currency Converter - Creating a Class with Variables

### Variables: Primitive Types

- Let's now look at primitive variable types.
- Although Java is an OOP language, for performance reasons, Java defines 8 primitive data types for variables and here they are:
- ![primitive-types-1](https://github.com/user-attachments/assets/7b4730a4-c64d-4b50-96c6-94180e41fc4d)
- The 8 primitive datatypes are emphasized in red here and they include:
  - `boolean`
  - `byte`
  - `short`
  - `int`
  - `long`
  - `float`
  - `double`
  - `char`
- Except for `boolean`, the rest of the datatypes are numeric data types, even `char` which can be used to represent an alphabet, is a numeric type as it is internally represented as an unsigned interger.
- So, `char` is also a numeric datatype in Java and you should always keep that in mind.
- Now, you might also wonder why Java designers defined 4 different datatypes just to represent integers? Why not use just one of them?
- Recall that a variable is like a container and the container will have a certain size.
- If we have only a single large container for integers then in resource constraint devices it could result in lot of wastage of memory i.e. to represent even a small number, we would be using the same large container i.e. more number of bits are used.
- Similarly, if you have only a single small container for integers then it may be difficult to represent large numbers i.e. numbers that are too big to fit into the container.
- So, for this reason, Java defined different containers each with a different size i.e. the datatypes `byte`, `short`, `int`, and `long` have different sizes as we will soon see but, they all represent integers.
- With this, the programmer can choose the best datatype as per his or her needs.
- So, these are the 8 different primitive datatypes.
- Next we will explore them in detail.

### Primitive Variables: Integers + Demo

- Let's begin by looking at the integer datatypes.
- We all know that integer are whole numbers or fixed point numbers and would include both positive as well as negative numbers.
- In Java, they can be represented by these four primitive data types:
  - `byte`
  - `short`
  - `int`
  - `long`
- This table gives more information about these integer datatypes:
- ![integers-1](https://github.com/user-attachments/assets/ce7a4421-f286-4170-90cc-5c5afd386928)
- First column shows the different integer data types.
- Second column indicates their bit depth, which is nothing but the number of bits needed to internally represent the datatype's variable value.
- Bit depth basically indicates the container size i.e. the storage space needed for a variable's value.
- Third column indicates the range of values a variable of a particular type can take.
- Note that range is dependent on the bit depth i.e. higher the bit depth, larger the range.
- Finally, fourth column indicates the default value of each of the data types.
- All four data types have 0 as a default value and we have already seen that for the `int` data type in one of the previous demos.
- Also, recall that variables declared in a method i.e. the local variables will not get any default value.
- So, let's look at what we have here for each of the datatypes.
- First is `byte`, which is represented in 8 bits.
- Due to this, a `byte` variable can hold any value between -2<sup>7</sup> to 2<sup>7</sup> - 1. That is, -128 to +127.
- And if you try to assign it a value outside of this range then you get a compilation error and soon we will see this in our demo.
- Now, in case you are not sure why a base 2 is used here, it is only because computers use binary system which deals with only 0s and 1s.
- We know that decimal system uses base 10 as decimal system uses teh digits 0 to 9 to represent numbers.
- Also, if you are wondering why the range is -128 to +127, it is only because the bit depth is 8 which can be used to represent a total of 2<sup>8</sup> numbers i.e. 256 numbers, -128 to +127 including 0.
- Now, among the 8 bits, the left most bit, which is called as the sign bit tells whether an number is positive or negative.
- If the sign bit is 0, it means it is a positive number, and if it is 1, it means that it is a negative number.
- Generally, the left most bit is also referred to as the most significant bit.
- The remaining 7 bits indicate the magnitude of the number like 127.
- So, that's the reason the range says -2<sup>7</sup> to 2<sup>7</sup> - 1.
- One of them is the signed bit.
- Next, `short` is represented in 16 bits.
- So, it's bit depth is higher than the bit depth of `byte` and so can store larger values.
- The range of values that a `short` can hold is between -2<sup>15</sup> to 2<sup>15</sup> - 1, which is nothing by -32,768 to +32,767.
- Next, `int` is represented in 32 bits and can take any value between -2<sup>31</sup> to 2<sup>31</sup> - 1.
- So, it can hold very large numbers.
- Finally, `long` is represented by 64 bits and so, it can take any value between -2<sup>63</sup> to 2<sup>63</sup> - 1.
- So, `long` as its name implies, is really long i.e. it can hold very, very large numbers.
- Now as good software engineers, we do need to have a clear idea of the different data types that are supported, and how much memory they consume.

> [!IMPORTANT]
>
> It is imperative to firmly memorize what we see in the table above, about the different data types, their bit depth, and the corresponding range of values that they support.

- You can expect couple of questions from this table in the upcoming quest.
- Now, internally Java uses something called <ins>signed two's complement scheme</ins> to represent integer.
- That's what computers also use to represent integers.

> [!NOTE]
>
> If you don't know what is signed 2's complement scheme, read the following article: [Link to Article](https://www3.ntu.edu.sg/home/ehchua/programming/java/DataRepresentation.html)
>
> This article discusses signed 2's complement scheme as well as other schemes for representing floating point and characters, which we will discuss later.
>
> You don't have to read this article right away, you can do it later once you are comfortable with Java.

- Now, let's go ahead and extend our `Student` class by declaring some new integer variables.
- So, here is our `Student` class:

```java
public class Student {
  int id = 1000;

  void compute() {
    int nextId = id + 1;

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- We declared a variable called `id`, which is of datatype `int`, and it is initialized to 1000.
- So, we already used the `int` data type and we also had this method called as `compute()`, where we are declaring another variable called `nextId` which is also of type `int`, and it would be `id + 1`, and we are printing both the values in the `compute()` method.
- In the `main()` method we are creating an object for `Student` class and we are invoking the `compute()` method which would print both the values.
- So, let's go ahead and create more variables.
- So, let's create a `byte` variable called `age` and initialize its value to 18.
- So, the student's age is 18.

```java
public class Student {
  int id = 1000;
  byte age = 18;

  void compute() {
    int nextId = id + 1;

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
    System.out.println("age: " + age);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now let's introduce another `byte` variable called `rank`.
- Assume that there is an entrance test to get an admission in the university, and so there would be a rank associated with the entrance test.
- Let's say that the student got a rank of 165 in the entrance test in order to gain an admission into the university.

```java
public class Student {
  int id = 1000;
  byte age = 18;
  byte rank = 165; // error, byte range: [-128, 127]

  void compute() {
    int nextId = id + 1;

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
    System.out.println("age: " + age);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now if we compile this, we get an error which says that "possible lossy conversion from int to byte".
- Essentially, what it is saying is that the value 165 falls outside the range of `byte`.
- We know that `byte`'s range is -128 to 127.
- So, 165 falls outside this range hence, we get a compilation error.
- Now, let's look at the error message: "possible lossy conversion from from int to byte"
- "byte" is fine because we are trying to create a `byte` variable but, why does it say `int`?
- The thing is, we know that 165 is a literal and in Java, 165 is a literal of type `int`.
- In Java, you don't have a `byte` literal. You only have an `int` literal or a `long` iteral, which we will discuss next.
- But, we don't have literals of type `byte` or literals of type `short`.
- So, no `byte` or `short`literals, we only have `int` or `long` literals.
- So, if you see some number like 165, just a whole number like 18 or 165 then it is an `int` literal.
- So, in order to make it work, we can assign it to a `long` or a `short` or an `int`, a larger datatype.
- So, that's the reason why it says "possible lossy conversion from int to byte".
- Now, if we change 165 to 128, then it is still out of range, so it will give the same error.
- But if you say -128 OR 127 then we should be good beause it falls within the range.
- But, we wanted to assign 165 so, let's just change the `byte` to `short`.

```java
public class Student {
  int id = 1000;
  byte age = 18;
  short rank = 165;

  void compute() {
    int nextId = id + 1;

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
    System.out.println("age: " + age);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now it works because `short` has a larger range of values.
- Now, let's introduce phone number and have its datatype as `int`.

```java
public class Student {
  int id = 1000;
  byte age = 18;
  short rank = 165;
  int phone = 1234567890;

  void compute() {
    int nextId = id + 1;

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
    System.out.println("age: " + age);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- If we compile this, then it works fine.
- Now, let's change the left most digit of `phone` to 2.

```java
public class Student {
  int id = 1000;
  byte age = 18;
  short rank = 165;
  int phone = 2234567890; // error: integer number too large

  void compute() {
    int nextId = id + 1;

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
    System.out.println("age: " + age);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now it says "integer number too large".
- So, this number: 2234567890 falls outside the range of `int`, which is fine, but you may notice that the error message is different from what we had earlier.
- Earlier, it said there there is incompatible types from `int` to `byte`, but here is does not say that, it says something else, it says "integer number too large".
- The reason is it is complaining about the literal 2234567890 itself.
- So, it is an invalid `int` literal.
- We know that `int` ranges from -2<sup>31</sup> to 2<sup>31</sup> - 1, and 2234567890 falls outside that range.
- So, it is complaining about the literal itself.
- It is a larger number so, we need to make it a `long` literal, and the way you do it is just add a trailing `L`, and it would be a `long` literal.
- You can use an uppercase L or a lowercase l, but it is recommended to use uppercase because the lowercase l is very similar to 1, and it can be very difficult to distinguish.

```java
public class Student {
  int id = 1000;
  byte age = 18;
  short rank = 165;
  int phone = 2234567890L; // add a trailing L

  void compute() {
    int nextId = id + 1;

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
    System.out.println("age: " + age);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now if we compile this, it gives the other type of error "possible lossy conversion from long to int", which we have seen earlier for incompatible types.
- Here it says "from long to int" which is fine, because 2234567890L is `long`, and we are declaring it as an `int` and it is not within the range of `int`.
- But, the important thing is that `long` literal cannot be assigned to `int` even if the number is within the range of `int`.
- For example, let's add a trailing L to the `id` variable with the value of 1000.

```java
public class Student {
  int id = 1000L; // error: possible lossy conversion from long to int
  byte age = 18;
  short rank = 165;
  int phone = 2234567890L; // error: possible lossy conversion from long to int

  void compute() {
    int nextId = id + 1;

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
    System.out.println("age: " + age);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now we get two compilation errors. One is for the `id` variable and the other one is for `phone` variable.
- Both of them say that "possible lossy conversion from long to int`.
- Here: `byte age = 18` is fine because we are using an `int` literal 18 and assigning it to a `byte` datatype, and it is working fine because 18 is within `byte` range.
- So, compiler is not complaining about that.
- But, if we change it to a `long` literal, the compiler doesn't like it.

```java
public class Student {
  int id = 1000L; // error: possible lossy conversion from long to int
  byte age = 18L; // error: possible lossy conversion from long to int
  short rank = 165;
  int phone = 2234567890L; // error: possible lossy conversion from long to int

  void compute() {
    int nextId = id + 1;

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
    System.out.println("age: " + age);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- So, this time it gives 3 errors, one for `id`, another for `age`, and last one for `phone`.
- So, the thing is that `int`, `byte`, and `short` can be assigned only `int` literals.
- That's how the language designers have designed it.
- The `long` literal i.e. the one with trailing `L`, cannot be assigned to any of three viz `int`, `byte`, and `short`.
- If you do that, we get a compilation error, as we just saw.
- So, a `long` literal can be assigned only to `long` or to other datatypes which are larger than `long` - we will see that later.
- So, always keep in mind that there are two integer literals viz <ins>int literal</ins> and <ins>long literal</ins>.
- So, to remedy the situation, all we have to do is to replace `int` with `long`.

```java
public class Student {
  int id = 1000;
  byte age = 18;
  short rank = 165;
  long phone = 2234567890L;

  void compute() {
    int nextId = id + 1;

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
    System.out.println("age: " + age);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now it works fine.
- Now, 2234567890 is a very large number, and not very readable.
- Maybe the first three digits of the number is area code and when you are using the user interface, sometimes the area code is take separately.
- So, it might be good to make it more readable.
- For instance, we can use underscore between the digits of the number, like so:

```java
public class Student {
  int id = 1000;
  byte age = 18;
  short rank = 165;
  long phone = 223_456_7890L;

  void compute() {
    int nextId = id + 1;

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
    System.out.println("age: " + age);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- From Java 7 onwards, you can actually use underscores between the digits of a number to make it more readable - just like we use commas in real life.
- Just keep in mind that these underscores cannot appear at the beginning or ending of a number. So, `_2234567890` and `2234567890_` is invalid. The underscore has to be somewhere in the middle.
- Also note, if you print this number, with underscore in between the digits, it will print it without the underscores.
- This applies for both, `int` literal and `long` literal.
- So, let's try and print it.

```java
public class Student {
  int id = 1_000;
  byte age = 18;
  short rank = 165;
  long phone = 223_456_7890L;

  void compute() {
    int nextId = id + 1;

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
    System.out.println("age: " + age);
    System.out.println("rank: " + rank);
    System.out.println("phone: " + phone);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Finally, let's see something interesting.
- So we know that the minimum value of `int` is -2<sup>31</sup>, and the max value is 2<sup>31</sup> - 1.
- So, if at all you want to see what those numbers are, you can print `Integer.MIN_VALUE` and `Integer.MAX_VALUE` to get the minimum and maximum values of `int`.

```java
public class Student {
  int id = 1_000;
  byte age = 18;
  short rank = 165;
  long phone = 223_456_7890L;

  int minValue = Integer.MIN_VALUE;
  int maxValue = Integer.MAX_VALUE;

  void compute() {
    int nextId = id + 1;

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
    System.out.println("age: " + age);
    System.out.println("rank: " + rank);
    System.out.println("phone: " + phone);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- So, `Integer` is a class that comes with the Java library, it is called as <ins>boxed primitive</ins> or a <ins>wrapper type</ins>.
- And every primitive type has an associated boxed primitive.
- So, `Integer` is a boxed primitive class and we will discuss it later in a subsequent section.
- So, all of the 8 primitive datatypes have associated box primitive types.
- For `byte` also, we can get its min and max value, which are -128 and 127 in the same way.
- So, let's go ahead and print these values.

```java
public class Student {
  int id = 1_000;
  byte age = 18;
  short rank = 165;
  long phone = 223_456_7890L;

  int minValue = Integer.MIN_VALUE;
  int maxValue = Integer.MAX_VALUE;

  void compute() {
    int nextId = id + 1;

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
    System.out.println("age: " + age);
    System.out.println("rank: " + rank);
    System.out.println("phone: " + phone);
    System.out.println("minValue: " + minValue);
    System.out.println("maxValue: " + maxValue);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- If you want to see it for `byte` then you can do this:

```java
public class Student {
  int id = 1_000;
  byte age = 18;
  short rank = 165;
  long phone = 223_456_7890L;

  int minValue = Integer.MIN_VALUE;
  int maxValue = Integer.MAX_VALUE;

  byte byteMinValue = Byte.MIN_VALUE;
  byte byteMaxValue = Byte.MAX_VALUE;

  void compute() {
    int nextId = id + 1;

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
    System.out.println("age: " + age);
    System.out.println("rank: " + rank);
    System.out.println("phone: " + phone);
    System.out.println("minValue: " + minValue);
    System.out.println("maxValue: " + maxValue);
    System.out.println("byteMinValue: " + byteMinValue);
    System.out.println("byteMaxValue: " + byteMaxValue);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now, what we have here is the decimal format.
- `int` and `long` literals can also be represented in other, less commonly used formats, eg Hexadecimal; and that is the subject of our next lesson.

### Demo: Other Integer Literal Formats

- Now, let's look at how integer variables can be represented in other less frequently used formats.
- We have hexadecimal, binary, and octal formats.
- Octal is very rarely used so, it is not very important.
- But, these other formats also improve code readability in certain contexts.
- They are very less commonly used but, in your professional life, if you happen to work on projects where you need to use such kind of formats, then you need to know how to use them.
- So, let's go ahead and quickly look at the binary, and hexadecimal formats.
- Let's use the `BasicDemo` class to learn this.
- In that class, let's create a method called `primitives()`.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

public class BasicsDemo {
  // other code

  public static void main(String[] args) {
    // other code

    primitives();
  }

  // other code


  static void primitives() {
    System.out.println("\n\nInside primitives...");
  }
}
```

- Now, one thing you may have observed here is that in `Student` class, we are creating an object of `Student` and then we are invoking the `compute()` method.
- But in the `BasicsDemo` class we are directly invoking the method.
- This is because the type of method that we are creating in `BasicsDemo` is `static`, whereas in `Student` class it is called an <ins>instance method</ins>.
- So, those are different types of methods and we will discuss them later.
- In fact, we have to still discuss methods itself in a formal way.
- So, just in case if you have noticed, why a `BasicsDemo` object was not created, that's only because we are using `static` methods here.
- And `static` methods can be directly invoked from the `main()` method, which is also a `static` method.
- But, just don't worry about that for now.
- So, we are invoking the `primitives()` method in the `main()` method of our `BasicsDemo` class.
- Now let's introduce our first variable.
- Let's call it as `intHex`, and let's initialize it with the number 0041.
- Note that hexadecimal numbers start with 0 and X (X can be either uppercase or lowercase).
- So, our number is 0x0041 where 0041 is our number itself.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

public class BasicsDemo {
  // other code

  public static void main(String[] args) {
    // other code

    primitives();
  }

  // other code


  static void primitives() {
    System.out.println("\n\nInside primitives...");
    int intHex = 0x0041;
    System.out.println("intHex: " + intHex);
  }
}
```

- Here the variable `intHex` will be assigned 65. As the hexadecimal number 41 maps to the decimal number of 65.

> [!NOTE]
>
> If you don't know what Hexadecimal is or how to convert between decimal and hexadecimal, you can read about it online.

- So, now if we compile, we get 65.
- So, such hexadecimal format is very useful when representing very large or very small numbers.
- It is also very useful in performing something called <ins>bitwise operations</ins>.
- We will also look at bitwise operations later.
- But sometimes in such bitwise operations, it may be even better if we can use binary numbers directly instead of hexadecimal numbers.
- You can also use decimal numbers in bitwise operations.
- But in certain low-level programming, you might want to use binary numbers instead of hexadecimal.
- Using binary numbers (binary literals) is only possible from Java 7 onwards.
- It was not possible before that.
- So, let's also use the next format which is the binary format.
- Binary number starts with 0b (b can either be lowercase or uppercase) and the rest of the number is the actual number itself.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

public class BasicsDemo {
  // other code

  public static void main(String[] args) {
    // other code

    primitives();
  }

  // other code


  static void primitives() {
    System.out.println("\n\nInside primitives...");

    int intHex = 0x0041;
    System.out.println("intHex: " + intHex);

    int intBinary = 0b01000001;
    System.out.println("intBinary: " + intBinary);
  }
}
```

- This 0b01000001 number translates to 65 so, if we now compile it, we should get 65.
- Also, even in hexadecimal and binary formats you can use underscores for readability purposes - same rules apply.
- Hexadecimal and Binary can also be used with long literals too.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

public class BasicsDemo {
  // other code

  public static void main(String[] args) {
    // other code

    primitives();
  }

  // other code


  static void primitives() {
    System.out.println("\n\nInside primitives...");

    int intHex = 0x0041;
    System.out.println("intHex: " + intHex);

    int intBinary = 0b01000_001;
    System.out.println("intBinary: " + intBinary);

    long longHex = 0x0041L;
    System.out.println("longHex: " + longHex);
  }
}
```

- Octal is not important at all but, for learning purposes, let's just see how it is.
- Octal starts with a 0 but, there is no letter like x or b after that. It just follows with more digits.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

public class BasicsDemo {
  // other code

  public static void main(String[] args) {
    // other code

    primitives();
  }

  // other code


  static void primitives() {
    System.out.println("\n\nInside primitives...");

    int intHex = 0x0041;
    System.out.println("intHex: " + intHex);

    int intBinary = 0b01000_001;
    System.out.println("intBinary: " + intBinary);

    long longHex = 0x0041L;
    System.out.println("longHex: " + longHex);

    int intOctal = 0101;
    System.out.println("intOctal: " + intOctal);
  }
}
```

- Octal 0101 also translates to 65, so that's what we get when we compile and run it.
- That's it.
- These are other less commonly used formats, and it is good that you also know about this.
- Just keep in mind that the underscore has to be in-between digits of the number. It cannot be at the start or at the end of the number.

### Primitive Variables: Floating-Point Numbers + Demo

- Now let's look at the data types that represent floating point numbers.
- Floating point numbers are real numbers like 3.14, and they can be negative too.
- They are good for measurements such as product rating or distances between two points or temperature, etc.
- In Java, they can be represented by either `float` or `double` data types.
- Here is a table with more information about `float` and `double`.
- ![float-1](https://github.com/user-attachments/assets/1f0b9cfa-b107-404d-80ee-ccbda734bb7a)
- The table is similar to the one that we saw for integers.
- One new column has been added to indicate precision, which indicates the number of digits we can have after the decimal point.
- Like integer datatypes, `float` and `double` also get a default of 0.
- Note that variables declared within the methods do not get such a default value.
- The trailing `f` in numbers like `0.0f` indicates `float` while the trailing `d` indicates `double`.
- So, let's start with `float`.
- `float` is represented in 32 bits and can take any value between -3.4 &times; 10<sup>38</sup> to +3.4 &times; 10<sup>38</sup>.
- In the table (in value range column), the notation with an `E` is called as exponential or scientific notation, and `E` can be in either upper or lower case.
- Generally, such a scientific notation is used only when representing very large or very small numbers.
- And with regards to precision, with `float`, we can have at most 6 to 7 decimal digits.
- Next, `double` is represented in 64 bits and hence can store a larger range of values.
- The range of values it can store is in between -1.7 &times; 10<sup>308</sup> and +1.7 &times 10<sup>308</sup>.
- With regards to precision, with `double` we can have at most 15 to 16 decimal digits.
- So, as we can see, `double` is more precise when compared to `float`.
- So, just try to memorize the information in the table above, as much as possible.
- Here we can see that we have the value of 1.7 for `float` and 3.4 for `double`. So, 3.4 is just two times 1.7 - just a good way to remember.
- For the exponent part, you have 38 for `float` and 308 for `double`. Just a tip to remember.
- The precision for `float` is 6-7 digits and the precision for `double` is 15-16 digits.
- So, if a number has more decimal digits then what a `float` or `double` can represent, then it cannot be accurately represented and hence would be approximated.
- That is, the number of decimal digits would be reduced to 6-7 or 15-16 depending on the data type.
- Number Pi is one such example.
- With real numbers, even with a small range of number like say 0.1 and 0.2, we can have infinite real numbers.
- So, many of these numbers cannot be accurately represented by either `float` or `double` because they have limited number of bits.
- And of the two, it is recommended to use `double` as it is more precise.
- In general, you should stick with `int` and `double`.
- So, among the integer data types, `int` is what you should be using.
- But, if the value falls outside the range of `int`, then you can use `long`.
- And if memory saving is critical, then you can think about using smaller size data types like `byte`, `short`, and `float`. You can also use them if you think it helps with readability.
- It seems game development is one area where `float` is preferred.
- Now internally, Java uses <ins>IEEE 754 floating-point scheme</ins> to represent `float` and `double`.
- Recall that it was <ins>Signed 2's complement scheme</ins> for integers.

> [!NOTE]
>
> If you don't know what is signed 2's complement scheme OR IEEE 754 floating-point scheme, read the following article: [Link to Article](https://www3.ntu.edu.sg/home/ehchua/programming/java/DataRepresentation.html)

- Now let's go back to the `Student` class and look at how `float` and `double` variables are declared.
- Let's add a new variable and its datatype will be `float`. The variable's name is gpa.
- GPA stands for grade point average and it is used to judge the performance of a student in a particular semester based on the grades he/she receives for the different courses the student is enrolled in.
- Let's say this student has a GPA of 3.8.
- For `float`, we have a trailing `f` (it can be upper or lower case) - this is mandatory.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code
  float gpa = 3.8f;

  void compute() {
    // other code
    System.out.println("gpa: ": gpa);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now if we compile and run it, it works just the way we expect it to.
- Now, let's see what happens if we remove the trailing `f`.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code
  float gpa = 3.8; // error: incompatible types: possible lossy conversion from double to float

  void compute() {
    // other code
    System.out.println("gpa: ": gpa);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- It gives a compilation error and this error message should be familiar to you.
- It says "incompatible types: possible lossy conversion from double to float".
- So, what this means is that we are trying to assign a double literal to a `float` variable.
- So, what this means is that we are trying to assign a double literal.
- So, if you do not include the trailing `f` then it would be a `double` data type.
- So by default, if you do not include anything, it is going to be a double literal and we are trying to assign a `double` to a `float`, and that's not possible.
- And `double` is a larger datatype.
- So, that's the thing.
- So, we need to change it to `double`.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code
  double gpa = 3.8;

  void compute() {
    // other code
    System.out.println("gpa: ": gpa);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now if we compile it, it compiles fine and prints the value 3.8.
- So by default, it will be a `double` literal.
- Now if you wish you can also add a trailing `d` e.g. `3.8d`.
- This `d` can be either lowercase or uppercase, and it simply indicates that it is a `double` datatype.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code
  double gpa = 3.8d;

  void compute() {
    // other code
    System.out.println("gpa: ": gpa);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- But, if you do not include anything then it is still going to be double literal.
- Now we also mentioned about the scientific notation or exponential notation.
- So, that would be `e` and let's say we have 4.
- So, it would be 3.8 &times; 10<sup>4</sup> which would equal to 38,000.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code
  double gpa = 3.8e4;

  void compute() {
    // other code
    System.out.println("gpa: ": gpa);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- If we compile and run it, we do indeed get 38,000.
- So, such a scientific notation is used when you want to represent very large or very small numbers.
- Now let's look at the precision.
- We said that with `double` it would be 15-16 digits.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code
  double gpa = 3.888888888888888888888888888888888888888;

  void compute() {
    // other code
    System.out.println("gpa: ": gpa);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- We get this output: `gpa: 3.888888888888889`
- So, that huge number is truncated to 15 digits because `double` has a precision of 15.
- So, there is an approximation and besides taht there is soemthing called rounding that has been done.
- The last digit of the output is rounded to 9.
- So, the output number is just an approximate.
- Now let's change the datatype to float, and let's see what happens.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code
  float gpa = 3.888888888888888888888888888888888888888f;

  void compute() {
    // other code
    System.out.println("gpa: ": gpa);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- This is the output: `gpa: 3.8888888`.
- Now it is printing 7 digits and the number is truncated.
- So, that's all there is with `float` and `double` data types.

### Demo: Floating-Point Pitfalls

- In the last lesson we looked at `float` and `double` datatypes and you can use them if you are fine with computations that could lead to approximate results.
- For instance, if you want to measure distance between two points and the actual distance is 515.8 miles and if your program computes it as, say 515.1 miles, then it is still fine.
- It is tolerable/acceptable, life is still good.
- But, if you application needs exact results then you should avoid `float` or `double` data types.
- For example, let's say if you have an e-commerce website then you would want all the sales to be exactly represented.
- If you charge less, you may run into losses.
- That's because `float` and `double` are associated with certain pitfalls and many engineers are not aware of this and things could be fine most of the time.
- But, if they run into this limitation that we are going to see, then they would see some surprising results and those could be disastrous too.
- So, let's go ahead and check it out, and it is very important to be aware of this.
- So, let's look at it in `BasicDemo` class.
- Let's say that we want to subtract 0.9 from 1 and print the result.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

public class BasicsDemo {
  // other code

  public static void main(String[] args) {
    // other code
    System.out.println(1 - 0.9);
  }

}
```

- The result should be 0.1 but, it gives us 0.09999999999999998 which is slightly lower than 0.1 but, it is not 0.1.
- Now let's take one more example, let's say we want to add 0.1 and 0.2 for which the result should be 0.3.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

public class BasicsDemo {
  // other code

  public static void main(String[] args) {
    // other code
    System.out.println(1 - 0.9);
    System.out.println(0.1 + 0.2);
  }

}
```

- We get 0.30000000000000004 instead of 0.3 so, it gives us a slightly larger number.
- So, the reason for this is is that numbers like 0.1, 0.2, etc cannot be accurately represented within computers, and this is due to the format that computers use.
- They follow IEEE 754 format and specifically they follow the binary floating-point format.
- And in that format, such numbers cannot be accurately represented.
- Now, this is an issue with all languages, it is not just Java.
- If you Google about this, you will see that with other languages like JavaScript and Python they also have the same issue.
- So, in Binary, 0.1 is represented like this: 0.00011001100110011...
- This 0011 will be repeated infinitely. This is because of the fomat but, both `float` and `double` have limited number of bits. So, this huge value has to be truncated to whatever `float` or `double` would have. So, it is an approximated and rounded. So, there will also be a rounding error.
- Now the issue is because the denominator of these number are not a power of 2.
- For instance, if you pick the number 0.1 then it is nothing 1/10.
- The 10 in the denominator is not a power of 2.
- If you pick 0.2 = 2/10 = 1/5 -- here also, the denominator is not a power of 2.
- Now, if you pick 0.5 = 5/10 = 1/2 -- so in the denominator you have 2 to the power of 1.
- So, 0.5 can be accurately represented.
- But, most of the numbers cannot be.
- This is especially an issue if we are dealing with money.
- So, when you are dealing with money, you should not be using `double` and `float`.
- It would be disastrous if you use it.
- So, what is recommended is to use a class in Java called `BigDecimal`.
- So, `BigDecimal` comes with the Java library and you can use it, especially when you are dealing with things like money, where you need exact results.
- So, let's see how it would work.
- `BigDecimal` is a class so, we will first create an object of that.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

public class BasicsDemo {
  // other code

  public static void main(String[] args) {
    // other code
    System.out.println(1 - 0.9);
    System.out.println(0.1 + 0.2);

    BigDecimal first = new BigDecimal();
  }

}
```

- But, instead of empty parentheses, we pass in the string of the value, like so:

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

public class BasicsDemo {
  // other code

  public static void main(String[] args) {
    // other code
    System.out.println(1 - 0.9);
    System.out.println(0.1 + 0.2);

    BigDecimal first = new BigDecimal("0.1");
    BigDecimal second = new BigDecimal("0.2");
  }

}
```

- Now to compute the values, `BigDecimal` has a method called `add()`.
- We call `add()` on the `first` object using the `.` operator and within its parenthese we pass in the `second` object.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

public class BasicsDemo {
  // other code

  public static void main(String[] args) {
    // other code
    System.out.println(1 - 0.9);
    System.out.println(0.1 + 0.2);

    BigDecimal first = new BigDecimal("0.1");
    BigDecimal second = new BigDecimal("0.2");

    System.out.println(first.add(second));
  }

}
```

- Now, this `BigDecimal` is part of a `math` package in Java so, we will need to import it for this to work.

> [!NOTE]
>
> Java library is split into packages

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

import Java.math.BigDecimal;

public class BasicsDemo {
  // other code

  public static void main(String[] args) {
    // other code
    System.out.println(1 - 0.9);
    System.out.println(0.1 + 0.2);

    BigDecimal first = new BigDecimal("0.1");
    BigDecimal second = new BigDecimal("0.2");

    System.out.println(first.add(second));
  }

}
```

- Now if we compile and run it, it gives us 0.3.
- So, you have to use `BigDecimal`.
- Now `BigDecimal` is slow but, if your application needs it, you have to use it.
- So, in any e-commerce application, that's what they use.
- Now there is item 48 in effective Java. It is item 48 in 2nd version and item 60 in 3rd version.
- These items are rules or best practicies.
- So item 48 says to avoid `float` and `double` if exact answers are required.
- That's what we mentioned in this particular lesson.
- It also talks about some of these examples and it recommends using `BigDecimal` but, it has some more information beyond what we discussed in this lesson.
- So later, once you are through this course and you are comfortable with Java, you can go ahead and read that particular article, just so that you will have a little bit more information than what we discussed.

### Primitive Variables: Character Data Type + Demo

- Thus far we have looked at the primitive data types that represent numbers that is both, whole as well as real numbers.
- For whole numbers, we have the integer data types `byte`, `short`, `int`, and `long`.
- For real numbers, we have `float` and `double`.
- We looked at 6 primitive data types so far and now, let's look at the next one which represents characters.
- Sometimes, we would like our variables to hold single letter characters like an alphabet or a digit like 0 or a special symbol like $.

> [!NOTE]
>
> We are talking about a single letter character and not multiple characters.
>
> For multiple characters, you would use a string but, string is not a primitive data type.
>
> It is a class that comes with the Java library.
>
> We will look at strings later.

- So, if you want your variable to hold a single character, then in Java, you would declare such a variable with a `char` datatype.
- Example: `char degree = 'B';` (B can be for Bachelor's degree)
- A `char` literal includes single quotes and we would get a compiler error if we omit the quotes or if we have multiple characters within the quotes.
- The example above shows how we declare a `char` variable but, there is a lot more to `char` data type so, let's get a good, solid understanding of the `char` data type.
- Though we are dealing with characters, internally, Java uses a <ins>16-bit unsigned integer scheme</ins> to represent characters.
- Unsigned integers represent 0 and positive integers, but not negative integers. Basically, whole numbers.
- Essentially, characters are integers internally.
- For instance, the `char` literal `B` will be stored as the integer 66. We will see how this mapping happens in a few moments.
- Below is a table with more information on `char`.
- ![char-1](https://github.com/user-attachments/assets/4ce0465c-107b-4151-8f6d-bc96ac5871d3)
- `char`'s bit depth is 16 bits i.e. a `char` value will be represented in 16 bits.
- And because `char` is internally a 16-bit unsigned integer, the range will be 0 to 2<sup>16</sup> - 1, that is 0 to 65,535 (you need to memorize these numbers).
- Note that here, 2 is raised to the power of 16 and not 15, like in the case of integer data types, as we are dealing with unsgined integers which do not include negative numbers.
- In other words, we do not need any special sign bit as with the integer data types.
- With integer data types, we need a signed bit to distinguish positive and negative numbers.
- Since we do not have negative numbers in the case of `char`, we do not need a signed bit.
- So, with unsigned integers, all of the bits together represent the mangitude.
- Recall that with signed integers, the bits following the signed bit represent the magnitude.
- So, it means that we can represent as many as 2<sup>16</sup> characters in Java for `char` i.e. 65,536 characters.
- So, a `char` variable can take any of those 65,536 characters and a corresponding integer value will be stored internally, in the memory.
- For example the integer 66 will be stored in the memory for the character `B`.
- If you are wondering what makes up all those 65,536 characters since we only have 26 English characters, and we can double that number to account for uppercase and lowercase alphabets, and we only have 0-9 digits and a few special symbols then what makes up for 65,536 characters?
- We need to remember that we have many characters in the world and each of those languages have many characters.
- So, we have many characters to represent.
- For instance, we should be able to represent a character such as this: ఈ. This character belongs to one of the Indian languages called Telugu.
- We even need to store emojis like this one: 😂
- We have many such symbols.
- So, we need to be able to represent such kind of characters too.
- Therefore, there is a mapping between characters and the corresponding integer values get stored internally.
- This mapping is defined by the Unicode character set.
- Unicode is a standard character set like ASCII, but can represent all characters in all languages across the world.
- It can represent all those exotic symbols too.
- It does so by associating every character with a hexadecimal number called <ins>code point</ins>.
- That hexadecimal number maps to some integer value, which is what is stored internally in binary format.
- But Unicode is a standard specification and it can have different implementations.
- Java uses one such implementation called UTF-16.
- Such an implmentation is referred to as an encoding scheme.
- Languages like C# and Python also use UTF-16 for storing characters.
- There are other encoding schemes too like UTF-8 and UTF-32.
- These schemes vary in the storage space they use.
- For instance, UTF-16 might use 16 bits for a particular character while UTF-8 might use only 8 bits for the same character.
- So, Unicode is a character set and UTF-16 is the encoding scheme that Java uses.
- UTF-16 also defines hexadecimal numbers like Unicode.
- For most characters, it uses the same hexadecimal numbers as Unicode.
- So, in Java, every `char` literal is encoded as a UTF-16 hexadecimal number.
- For instance, the `char` literal `B` would be encoded as UTF-16 hexadecimal number 0042, and its corresponding 16-bit unsigned integer: 00000000 01000010 is what gets stored internally. 0100 is 4 in binary and 0010 is 2 in binary therfore 01000010 represents 42 in binary.
- So, that's the benefit of hexadecimal numbers.
- It can be easily mapped to the binary format.
- And this 16-bit unsigned integer: 00000000 01000010 corresponds to the decimal value 66.
- So, that's how the character literal `B` is mapped to 66.
- So, for every character, you can imagine such a tupple: `<'B', \u0042, 66>`.
- Here we have the character uppercase `B` and it is associated with UTF-16 hexadecimal number 0042 and also decimal number 66.
- The binary equivalent of 66 is what is stored internally.
- Note that both hexadecimal 0042 and 66 correspond to the same binary number.
- In fact, the `char` variable `degree` can also be directly assgined such a hexadecimal number.
- That is, we can assign a literal such as this one: `'\u0042'`.
- This is called as <ins>Unicode Escape Sequence</ins> where we have a backslash followed by `u`, followed by the hexadecimal number 42.
- `u` here stands for Unicode and it needs to be in lowercase.
- Otherwise, we will get a compiler error.
- So, this is same as assigning the `char` literal uppercase `B`.
- Typically, you would use `char` literals for variable initialization, but sometimes, if you have to represent certain special characters and if your editor does not support them, then you can use such Unicode escape sequence for initialization.
- The default value for `char` is `\u0000` which is shown in the table above. This unicode represents a null character.
- A null character is a control character. Meaning that it is not something that you can print.
- In input/outpput section, one of the first lessons gives us a very detailed introduction to character encoding.
- In fact, it is a prerequisite lesson for that section.
- So, if you are not familiar with encoding, you can learn about it when you get there.

> [!NOTE]
>
> This article also discusses about character encoding: [Link to Article](https://www3.ntu.edu.sg/home/ehchua/programming/java/DataRepresentation.html)

- Now let's go ahead and use our `Student` class to see `char` varaible in action.
- So, let's go ahead and introduce a new variable called `degree` which will be of type `char` and initialize its value to `'B'`, where `B` can be for Bachelor's so, the student can be a Bachelor's student.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code
  char degree = 'B';

  void compute() {
    // other code
    System.out.println("degree: " + degree);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now if we compile and run it, it works just as we expect it to.
- Now, let's try some invalid `char` initializations.
- First, let's try and remove the single quotes around `B`.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code
  char degree = B; // error

  void compute() {
    // other code
    System.out.println("degree: " + degree);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- We get the error which says "cannot find symbol". We get this error because compiler thinks that `B` is some variable and it is not able to find that variable hence, the error.
- So, we need to have single quotes around the `char` value - that's a requirement.
- We also cannot have multiple characters. That is also invalid.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code
  char degree = 'BA'; // error

  void compute() {
    // other code
    System.out.println("degree: " + degree);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- When we have multiple characters in a `char`, we get the error "unclosed character literal" - all it is trying to say is we cannot have multiple characters in a `char` variable.
- Now let's try an empty `char` value.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code
  char degree = ''; // error

  void compute() {
    // other code
    System.out.println("degree: " + degree);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- This time we get an error which says "empty character literal" so, that is invalid as well.
- Although, an empty space character is allowed.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code
  char degree = ' '; // this works

  void compute() {
    // other code
    System.out.println("degree: " + degree);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- So, that's the char literal.
- We also discussed about the unique code escape sequence.
- We said that the char literal uppercase `B` can also be represented as `\u0042`.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code
  char degree = '\u0042'; // this will also print char B

  void compute() {
    // other code
    System.out.println("degree: " + degree);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- This works because the unicode `\u0042` corresponds to uppercase B in UTF-16.
- We also said that the `u` in `\u0042` needs to be lowercase, otherwise it will throw an error.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code
  char degree = '\U0042'; // error

  void compute() {
    // other code
    System.out.println("degree: " + degree);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Similarly, it needs to be a valid hexadecimal number.
- So, it is called as a code point in unicode specification.
- And in UTF-16, we just call it as code unit.
- That's just for your information.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code
  char degree = '\u004'; // invalid hexadecimal number - error

  void compute() {
    // other code
    System.out.println("degree: " + degree);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now it gives us an error which says "illegal unicode escape" basically, an invalid hexadecimal number.
- The default value is a null character.
- So, null is something that we cannot print.
- So, let's do that.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code
  char degree; // default value is null

  void compute() {
    // other code
    System.out.println("degree: " + degree);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now if we run it, you will see that nothing is printed.
- The null character's unicode number is 0 and it is represented like this: `\u0000`. So, `char degree;` and `char degree = '\u0000';` both are one and the same.
- Generally speaking, we would initialize a `char` variable.
- For `int` and other variables we may have default intializations, but with `char` we do initialize. That's how it is in practice.
- Recall that we talked about boxed primitives when discussing integer data types.
- We said that every primitive type also has an associated box primitive.
- Like for `int`, we looked at the `Integer` class. It is also called as a wrapper class.
- And box parameters will be discussed later.
- But, we saw that for `int`, we had the `Integer` class and `Integer` class defined both `MIN_VALUE` and `MAX_VALUE`.
- Similarly, for `char` there is a class called as `Character`. So, it is the box parameter class or the wrapper class.
- It also has `MIN_VALUE` for `char` which is `\u0000` and the `MAX_VALUE` is `\0ffff`.
- This is just for your information but, we will discuss the boxed primitive classes later on, in a different section.

### Demo: Alternate Ways to Initialize char Variables

- In the last lesson, we saw how a `char` variable canbe declared and intialized using a char literal.
- That is the typical way of intializing a `char` variable.
- We also saw that a `char` variable can be intialized using a unicode escape sequence, although that is not very common.
- Now, a `char` variable can also be intialized using an `int` literal.
- We know that a `char` variable value is internally represented using <ins>unsigned integer scheme</ins>.
- Java also allows us to assign an unsigned integer to a `char` variable.
- So, that is possible.
- We know that unsigned integer has the range of 0 to 65,535 so, we can assign any value in that range to a `char` variable.
- It is very uncommon but, we can do that.
- So, let's go ahead and see what happens if we do that.
- We will use our `BasicsDemo` class for it.
  import java.math.BigDecimal;
- In the `primitves()` method, let's declare a `char` variable called `charInt` and set its value to 65.
- Since int literal can also be represented in different variations viz hexadecimal, binary, octal, let's do the same here.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

public class BasicsDemo {
  // other code

  static void primitives() {
    // other code

    char charInt = 65;
    System.out.println("charInt: " + charInt);

    char charHex = 0x0041;
    System.out.println("charHex: " + charHex);

    char charBinary = 0b0100_0001;
    System.out.println("charBinary: " + charBinary);

    char charOctal = 0101;
    System.out.println("charOctal: " + charOctal);
  }

  public static void main(String[] args) {
    // other code

    primitives();

    // other code
  }
}
```

- Now let's compile and execute it.
- Once the result is printed, you can notice that it is printing the character "A".
- This is because in UTF-16, the decimal 65 corresponds to the uppercase letter A.
- Same with hexadecimal, octal, and binary - since they all map to 65 and 65 maps to capital letter A - and this is just because the datatype is `char`.
- Now, instead of setting `charInt`'s value to 65, let's set it to -1, what would it do?

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

public class BasicsDemo {
  // other code

  static void primitives() {
    // other code

    char charInt = -1; // error
    System.out.println("charInt: " + charInt);

    char charHex = 0x0041;
    System.out.println("charHex: " + charHex);

    char charBinary = 0b0100_0001;
    System.out.println("charBinary: " + charBinary);

    char charOctal = 0101;
    System.out.println("charOctal: " + charOctal);
  }

  public static void main(String[] args) {
    // other code

    primitives();

    // other code
  }
}
```

- It gives us a compilation error: "possible lossy conversion from int to char".
- This is because the range is 0 to 65,535, and -1 is out of range.
- If you assign the value 65,536, it will again give you the same compilation error because, it is also an out of range assignment.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

public class BasicsDemo {
  // other code

  static void primitives() {
    // other code

    char charInt = 65536; // error
    System.out.println("charInt: " + charInt);

    char charHex = 0x0041;
    System.out.println("charHex: " + charHex);

    char charBinary = 0b0100_0001;
    System.out.println("charBinary: " + charBinary);

    char charOctal = 0101;
    System.out.println("charOctal: " + charOctal);
  }

  public static void main(String[] args) {
    // other code

    primitives();

    // other code
  }
}
```

- And if you assign 0 then it means it is a null character so, it will not print anything.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

public class BasicsDemo {
  // other code

  static void primitives() {
    // other code

    char charInt = 0; // null character
    System.out.println("charInt: " + charInt);

    char charHex = 0x0041;
    System.out.println("charHex: " + charHex);

    char charBinary = 0b0100_0001;
    System.out.println("charBinary: " + charBinary);

    char charOctal = 0101;
    System.out.println("charOctal: " + charOctal);
  }

  public static void main(String[] args) {
    // other code

    primitives();

    // other code
  }
}
```

- Now let's try and do the reverse. Let's create an `int` variable and assign a char value 'A'.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

public class BasicsDemo {
  // other code

  static void primitives() {
    // other code

    char charInt = 0; // null character
    System.out.println("charInt: " + charInt);

    char charHex = 0x0041;
    System.out.println("charHex: " + charHex);

    char charBinary = 0b0100_0001;
    System.out.println("charBinary: " + charBinary);

    char charOctal = 0101;
    System.out.println("charOctal: " + charOctal);

    int intChar = 'A';
    System.out.println("intChar: " + intChar);
  }

  public static void main(String[] args) {
    // other code

    primitives();

    // other code
  }
}
```

- What do you think will be printed now?
- Because the variable's type is `int` now, it should print the decimal value 65, and it does.
- So, if you are assigning a char literal to an `int` it prints the corresponding UTF-16 `int` value.
- And if you assign an int literal to a `char` data type then it prints the corresponding UTF-16 character value.
- So, an int literal, we know can be assigned to `byte`, `short`, `int` but, it can also be assigned to `char` - this is very uncommon but, we need to be aware of this.
- So, we have seen that a `char` variable can be initialized with a `char` literal, which is the most common case.
- It can also be initialized with a unicode escape sequence, or it can also be initialized using an `int` literal.
- Internally, it is stored as an unsigned integer whose range is 0 to 65,535, and you need to memorize that.
- That's all there is to `char` datatype.

### Demo: Primitive Variables: Boolean Data Type

- So far we looked at 7 primitive types, of which 6 of them represent numbers, while one represent characters.
- Now let's look at the final primitive data type that represents logical values, like `true` or `false`.
- So, we have primitive type representing numbers, a primitive type for characters, and one for logical values and that final one is the boolean primitive type, and it can take either a `true` or `false` as value.
- So, `true` or `false` are boolean literals.
- Boolean is a binary data type, as it can take only one of the two values, `true` or `false`.
- By default, a `boolean` variable is initialized with `false` - keep that in mind.
- So, if you are not initializing a `boolean` variable, it gets `false` as its value.
- Coming to bit depth, it is not precisely defined, and it is specific to particular JVM implementation.
- So, it can vary from one JVM to another so, we need not worry about that.
- It could be 1 byte or 4 bytes, or whatever the JVM chooses.
- `boolean` variables are mostly used in control flow statements - which we will see in the next section but, as the name suggests, control flow statements are simply the statements that control the flow of your logic depending upon certain conditions.
- These conditions are `boolean` conditions and they can be based on `boolean` variables.
- One example is an `if` statement, and we will also look at `if` statement in the subsequent section.
- In this lesson, we will see a simple `if` statement, so that we can see how a `boolean` variable can be used.
- So, the `if` statement will use the `boolean` variable and it will see if the condition is `true` or `false`.
- If it is `true`, then it will execute certain piece of code, otherwise it will not.
- So, that's how the control will flow depending upon the condition.
- We will use our `Student` class to implement this simple logic for computing the tuition fess that the student has to pay in a semester.
- If the student is a local student, then the student would pay a certain fees but, if the student is an international student, then he/she would have to pay a higher fee.
- So, let's go ahead and declare a `boolean` variable called `international` and initialize it to `true`.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code

  boolean international = true;

  void compute() {
    // other code
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now let's define a variable called `tuitionFees` of type `double` and initialize it to `12000.0`.
- Now let's declare one more variable called `internationalFee` of type `double` and set it equal to `5000.0` - this would be an additional amount, if the student is an international student.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code

  boolean international = true;
  double tuitionFees = 12000.0;
  double internationalFees = 5000.0;

  void compute() {
    // other code
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now within the `compute()` method let's compute the tuition fees.
- We are going to use an `if` statement.
- It starts with the keyword `if` followed by a set of parentheses and a set of braces for the code body.
- The condition that results to either `true` or `false` is placed within the set of parentheses, and the code that you want to happen when the condition is `true` is placed between the braces.

```java
// if statement syntax

if (condition) {
  // code to execute when condition is true
}
```

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code

  boolean international = true;
  double tuitionFees = 12000.0;
  double internationalFees = 5000.0;

  void compute() {
    // other code

    if (international == true) {
      tuitionFees = tuitionFees + internationalFees;
    }

    System.out.println("tuitionFees: " + tuitionFees);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- There you go, it prints 17000.
- `==` is what we call an equality operator, but we don't have do this: `international == true`.
- If the value of `international` results to `true` then we don't have to explicitly check if it is `true`.
- This works just the same:

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code

  boolean international = true;
  double tuitionFees = 12000.0;
  double internationalFees = 5000.0;

  void compute() {
    // other code

    if (international) {
      tuitionFees = tuitionFees + internationalFees;
    }

    System.out.println("tuitionFees: " + tuitionFees);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now, we mentioned that the default value of a `boolean` variable is `false`.
- So, let's check that out as well.
- Now, if the condition evaluates to `false`, the code between the braces is skipped i.e. it will not be executed.

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/Student.java

public class Student {
  // other code

  boolean international; // default value is false
  double tuitionFees = 12000.0;
  double internationalFees = 5000.0;

  void compute() {
    // other code

    if (international) {
      tuitionFees = tuitionFees + internationalFees;
    }

    System.out.println("tuitionFees: " + tuitionFees);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}
```

- Now if we compile and run it, we get 12000 printed.
- So, that's all there is to a boolean variable.
- It can either take a `true` or a `false`.
- So, we are done with looking at all of the primitive data types and there were 8 of them.
- They are in-built into the Java language.

## Quiz 02

## Author

- [@bhoamikhona](https://github.com/bhoamikhona)
