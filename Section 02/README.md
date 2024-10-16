# Section 02: Java - A High-Level Overview

**About:** This section nicely builds on each topic to give you a solid, high-level understanding of Java. At the end of this section we will also run our first Java program. We begin the section by broadly defining what Java is. We will next discuss the motivation behind creating Java. This should help us understand why certain features that are unique to Java were introduced, and one of the features is Platform Independence. But, before learning platform independence, we need to first understand what platform dependency is. In the process, we also learn about what compilation is, which should be very useful for complete beginners. But to understand platform independence, we also need to understand about interpretation as it helps achieve platform independence. So, we discuss about interpreters. Then we discuss about how Java achieves platform independence. We then take a look at JVM which is kind of the soul of Java platform. It is a very important topic, and we also have a separate, dedicated Section to it. Java software family involves multiple platforms for developing applications for different types of devices like web servers, desktops, and mobile devices. Java SE is one of those platforms, and is also a core platform within the Java family; and this course is about Java SE platform. So, we will install Java SE and the entire installation process will be demostrated step-by-step. Finally, we will code our first Java program and compile and execute it. So, that's the agenda of this section. Note that coding exercises will actually start from next section. That's because this section is basically a high-level introduction to what Java is, and so it is more about theory. Although we write a basic "Hello, world!" program at the end of the section, the real language features will be introduced only from next section onwards. Now, without any further delay, let's get started with this section.

## Table of Content

- [Section 02: Java - A High-Level Overview](#section-02-java---a-high-level-overview)
  - [Table of Content](#table-of-content)
  - [Lessons Learned](#lessons-learned)
    - [What is Java \& Who is Using It?](#what-is-java--who-is-using-it)
    - [Story Behind Java's Creating ~ A Brief History](#story-behind-javas-creating--a-brief-history)
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

### Story Behind Java's Creating ~ A Brief History

- Before moving on, let's now spend some time understanding how Java came into existence.
- Compared to languages like C and C++, Java has some unique features and there's a certain motivation behind creating Java with those features.
- So, understanding the motivation will help us better appreciate the features that Java offers.
- So, let's go ahead and learn the story behind Java's creation.
- You must have heard of Sun Microsystems, which was a well-known Silicon Valley based company that got acquired by Oracle in 2010.
- In 1991, having been in business for almost a decade, selling unique space computers, Sun wanted to see what the next wave in computing was.
- So, they assembled a small team to brainstorm on this and they name the team as The Green Team.
- The Green Team's initial conclusion was that a network of hetergenous consumer devices communicating with each other could be one significant trend.
- These devices are small, they are reliable, distributed, real-time, embedded systems.
- Based on this initial conclusion, they decided to build a prototype as a part of new project called The Green Project.
- So, it is the Green team working the Green project.
- The vision for this project was to build an interactive wireless hand-held device which would communicate with home entertainment devices like TV and VCR; and the software that the Green team develops would be installed on all of these devices.
- The technology was expected to help in doing stuff like playing a certain TV channel or recording a particular favorite program, which is common these days but, not in early 90s.
- However, realizing that this vision was pretty challenging as it had some unique goals:
  - First goal is that the software should consume less memory as the target consumer devices are embedded devices which have limited resources like memory.
  - Next, the technology should allow these devices to communicate with each other and also pass around any software programs.
  - This leads us to the third and one of the most important goals, which is platform independence.
  - So, when these software programs are delivered from one device to another, they should run on the target device without any issues i.e. the hardware and operating system of the target devices should not cause any issues; and that's basically platform independence.
  - Similarly, when software programs are delivered to the target devices, they should not cause any harm to those devices.
  - So, security is critical.
  - Finally, the software should support multi-threading so that the devices can perform multiple activities at the same time.
  - For instance, if a program is being downloaded from another consumer device, then the current device might want to perform some other activity while the program is being downloaded.
- Initially, C++ was considered for this project, but it was rejected as it did not meet some of the project goals, which we just discussed, and platform independence was one of them.
- So, the team decided to create a brand new technology.
- Then one of the team members, James Gosling, created an entirely new language and named it <ins>Oak</ins>, after the tree outside his office.
- Oak was later re-named to Java due to trademark issues.
- So, Gosling is regarded as the Father of Java.
- Soon, The Green Team came up with a working demo and the interactive hand-held device was called <ins>Star Seven</ins>.
- It is interesting to note that this was way back in '92 and Star Seven already had a touch screen with feature similar to today's smartphones.
- Just Google for Gosling Star Seven and you should be able to find an old video of James Gosling demonstrating \*7.
- It is definitely worth watching.
- Sun targeted the cable TV industry to sell this product, but the technology was far too advanced for them, and hence, the project did not meet sucess.
- But, Sun soon realized that the newly popular world wide web was exactly identical to the Green project i.e. a network of heterogenous systems communicating with each other.
- Before Java came into existence, internet involved moving around only static HTML content, and some believe that by integrating Java they can make webpages more interactive.
- So, Sun developed a browser called HotJava and they showcased it at the SunWorld conference in 1995.
- The browser allowed Java programs called applets to be embedded in HTML pages and this would allow web applications to be interactive.
- But, for this to work, the client's browser should install Java, and the way it work is that an HTML page would include HTML tags corresponding to applets.
- The applets would actually reside on some remote server.
- When browser processes an HTML and when ti encounters these applet-related tags, it would then download the corresponding applets from the remote server and then execute them as it already had Java installed.
- Now like HTML content, same applet can run on heterogenous client platforms i.e. platform independence capability of HTML pages is still supported.
- Meaning that the applet might be on a Linux server and the client's browser might be on a Windows machine, but the downloaded applet from the Linux server would execute without any issues within the client's browser on the Windows machine.
- At the same conference, Netscape also announced their popular Netscape Navigator browser would include Java suport, and with that, the entire tech industry was very excited about the Java technology as this integration could be verybig for the future of internet.
- And soo, the first version of Java was released in January of 1996.
- So, that's brief history of Java.
- Always keep in mind that Java was mainly designed to work in a network environment consisting of heterogenous consumer devices.
- The environment had some unique goals and that led to the development of Java.
- Though it could not be adopted in the cable TV industry, it eventually found its success with the worldwide web; and especially, it soon evolved as a popular language for developing large scale web applications, standalone desktop applications, and mobile applications.

## Author

- [@bhoamikhona](https://github.com/bhoamikhona)
