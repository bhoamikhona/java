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

## Author

- [@bhoamikhona](https://github.com/bhoamikhona)
