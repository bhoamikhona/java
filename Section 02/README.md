# Section 02: Java - A High-Level Overview

**About:** This section nicely builds on each topic to give you a solid, high-level understanding of Java. At the end of this section we will also run our first Java program. We begin the section by broadly defining what Java is. We will next discuss the motivation behind creating Java. This should help us understand why certain features that are unique to Java were introduced, and one of the features is Platform Independence. But, before learning platform independence, we need to first understand what platform dependency is. In the process, we also learn about what compilation is, which should be very useful for complete beginners. But to understand platform independence, we also need to understand about interpretation as it helps achieve platform independence. So, we discuss about interpreters. Then we discuss about how Java achieves platform independence. We then take a look at JVM which is kind of the soul of Java platform. It is a very important topic, and we also have a separate, dedicated Section to it. Java software family involves multiple platforms for developing applications for different types of devices like web servers, desktops, and mobile devices. Java SE is one of those platforms, and is also a core platform within the Java family; and this course is about Java SE platform. So, we will install Java SE and the entire installation process will be demostrated step-by-step. Finally, we will code our first Java program and compile and execute it. So, that's the agenda of this section. Note that coding exercises will actually start from next section. That's because this section is basically a high-level introduction to what Java is, and so it is more about theory. Although we write a basic "Hello, world!" program at the end of the section, the real language features will be introduced only from next section onwards. Now, without any further delay, let's get started with this section.

## Table of Content

- [Section 02: Java - A High-Level Overview](#section-02-java---a-high-level-overview)
  - [Table of Content](#table-of-content)
  - [Lessons Learned](#lessons-learned)
    - [What is Java \& Who is Using It?](#what-is-java--who-is-using-it)
  - [Author](#author)

## Lessons Learned

### What is Java & Who is Using It?

- Let's begin this section by getting a high-level understanding of what Java is.
- We will also see how Java is being using in the industry.
- So, what is Java?
- Java can be broadly defined as a <ins>general-purpose</ins>, <ins>object-oriented</ins>, <ins>platform independent</ins>, <ins>concurrent</ins> <ins>programming language</ins> that runs <ins>very fast</ins>.
- General purpose implies that, it is not constrained to one particular domain and can be used to develop wide variety of applications.
- Java is an object-oriented programming language, and object-orientedness helps model real-world scenarios in a more natural way.
- The concept of object and object-oriented programming will be introduced later.
- Java's mantra is "Write once, Run anywhere (WORA)" i.e. you write the program once you must be able to run it on any platform regardless of the operating system & architecture; and this is referred to as <ins>Platform Independence</ins>, and it is one of the key benefits of Java.
- Later in the section we will see how this goal is achieved in Java.
- Java supports concurrent programming, which is nothing byt multi-threading; and this enables programs to perform multiple activities at around the same time.
- Java is also very fast. It is almost indistinguishable from C and C++.
- Later in the section we will look at certain aspects of the Java platform, which makes Java programs run very fast.
- These are some core attributes of Java and they make Java a really solid, very reliable and a complete programming language.
- It is currently one of the most widely used programming languages.
- Java was also built on few additional principles so, let's look at some them.
- Java was invented in the mid 90s and most programmers during early 90s were using C and C++. Therefore Java's designers wanted to keep the syntax familiar hence, Java's syntax is kept similar to C and C++.
- Simplicity was one of the most important goals for Java's designers.
- So, in comparison to C and C++, they wanted Java to be easy to use.
- For this reason, Java doesn't have many features which make C and C++ complex, confusing, and unsafe.
- One example is related to memory management. In C and C++, programmers <ins>directly manipulate memory</ins> to free up space.
- And if it is not done properly, it can result in programs getting crashed.
- In contrast, Java is simple and safer as it provides automatic memory management using a feature called <ins>garbage collection</ins>. This relieves programmers from directly manipulating memory which in-turn makes programming task easier.
- Garbage collection will be discussed in detail in the JVM internals section.
- Java is also secure; and this is very important as Java programs can be downloaded from across the network and the downloaded programs should not cause any harm to the user's computer.
- So, we looked at some of the key principles of Java. However, there are few other nice things that Java has to offer.
- One of them is that Java comes with a <ins>rich library</ins>, which includes <ins>extensive pre-defined functionalities</ins> and this library is the <ins>Java API</ins>, where API as you may know, stands for Application Programming Interface.
- This helps developers to focus on writing new logic without having to re-invent the wheel i.e. they can simply make use of the pre-defined functionality, which is written by experts and is already being used by millions of programmers.
- Java is also free and that's great from everyone including startups and even individual programmers.
- It would help them to develop and launch their own products without having to invest a lot in the software.
- As we will see later, Java was initially developed to run inside embedded systems and later within web browsers in the form of Java programs called applets.
- However, it soon evolved as a popular language for developing large-scale web applications, standalone desktop applications, and mobile applications.
- Java provides separate dedicated platforms just for these different types of applications.
- Large companies like Google, Netflix, Amazon use Java.
- For instance, Gmail is mostly written in Java.
- Java was also used by NASA for their Mars Rover project called Spirit.
- It seems one of the reasons they picked Java is due to its platform independence capability; and this also tells that Java is truly general purpose programming language i.e. it is not constrained to only commercial space.
- Also, when it comes to open source libraries, probably most number of open source libraries are implemented in Java.
- Popular Java libraries: Apache Solr, Hadoop, Mahout.
- For instance, companies like eBay & Apple use Apache Solr for providing search capabilities within their websites.
- Java is also extremely popular in domains such as search, data mining, and machine learning, which are very hot right now and they typically deal with very huge amount of data.
- So, that's about what Java is. It was mainly designed to be simple, platform independent, and also very stable and secure.
- Performance wise it is very fast. It supports concurrent programming and comes with a rich library.

## Author

- [@bhoamikhona](https://github.com/bhoamikhona)
