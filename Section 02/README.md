# Section 02: Java - A High-Level Overview

**About:** This section nicely builds on each topic to give you a solid, high-level understanding of Java. At the end of this section we will also run our first Java program. We begin the section by broadly defining what Java is. We will next discuss the motivation behind creating Java. This should help us understand why certain features that are unique to Java were introduced, and one of the features is Platform Independence. But, before learning platform independence, we need to first understand what platform dependency is. In the process, we also learn about what compilation is, which should be very useful for complete beginners. But to understand platform independence, we also need to understand about interpretation as it helps achieve platform independence. So, we discuss about interpreters. Then we discuss about how Java achieves platform independence. We then take a look at JVM which is kind of the soul of Java platform. It is a very important topic, and we also have a separate, dedicated Section to it. Java software family involves multiple platforms for developing applications for different types of devices like web servers, desktops, and mobile devices. Java SE is one of those platforms, and is also a core platform within the Java family; and this course is about Java SE platform. So, we will install Java SE and the entire installation process will be demostrated step-by-step. Finally, we will code our first Java program and compile and execute it. So, that's the agenda of this section. Note that coding exercises will actually start from next section. That's because this section is basically a high-level introduction to what Java is, and so it is more about theory. Although we write a basic "Hello, world!" program at the end of the section, the real language features will be introduced only from next section onwards. Now, without any further delay, let's get started with this section.

## Table of Content

- [Section 02: Java - A High-Level Overview](#section-02-java---a-high-level-overview)
  - [Table of Content](#table-of-content)
  - [Lessons Learned](#lessons-learned)
    - [What is Java \& Who is Using It?](#what-is-java--who-is-using-it)
    - [Story Behind Java's Creating ~ A Brief History](#story-behind-javas-creating--a-brief-history)
    - [Compilation](#compilation)
    - [Platform Dependency + Demo](#platform-dependency--demo)
    - [Interpreter](#interpreter)
      - [CPU's Fetch-and-Execute Cycle](#cpus-fetch-and-execute-cycle)
      - [Interpreter's Fetch-and-Execute Cycle](#interpreters-fetch-and-execute-cycle)
      - [Pros \& Cons of Interpreter](#pros--cons-of-interpreter)
        - [Pros](#pros)
        - [Cons](#cons)
    - [Platform Independence in Java + Demo](#platform-independence-in-java--demo)
    - [Java Virtual Machine (JVM)](#java-virtual-machine-jvm)
      - [JVM Architecture](#jvm-architecture)
      - [Performance](#performance)
      - [JIT Compilation Example](#jit-compilation-example)
    - [An Overview of Java SE](#an-overview-of-java-se)
    - [Java SE Release Cycles \& Release History](#java-se-release-cycles--release-history)
    - [Installing JDK 17 on Windows](#installing-jdk-17-on-windows)
    - [Installing Java on Mac](#installing-java-on-mac)
    - [Installing Java on Linux](#installing-java-on-linux)
    - [Setting Classpath Environment Variable](#setting-classpath-environment-variable)
    - [Writing First Java Program + Demo](#writing-first-java-program--demo)
      - [HelloWorld Program](#helloworld-program)
      - [Main Method](#main-method)
    - [Conclusion ~ Section 01](#conclusion--section-01)
      - [Summary](#summary)
    - [Quiz](#quiz)
    - [Important Q\&A Discussions](#important-qa-discussions)
      - [Can you please specify which programming languages are compiled to another programming languages? (Related to lesson on Compilation)](#can-you-please-specify-which-programming-languages-are-compiled-to-another-programming-languages-related-to-lesson-on-compilation)
      - [Why a single file cannot have more than one public class?](#why-a-single-file-cannot-have-more-than-one-public-class)
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

### Compilation

- We now know that platform independence is one of the key benefits of Java.
- But, before understanding hwo Java achieves platform independence, we need to first understand what platform dependency is.
- To understand platform dependency, we also need to know what compilation is.
- Compilation is a very fundamental concept in computer science, and if you are new to programming and not completely sure about what compilation is, then this short discussion on compilation should be very helpful.
- But if you are already familiar with programming and clearly understand what compilation is, then feel free to skip this lesson.
- Let's start with absolute basic concepts of a computer.
- Every computer has a fixed set of instructions that it understands and collectively they are referred to as <ins>the instruction set of a computer</ins>.
- So, the CPU would understand these instructions.
- A computer program is made up of some of these instructions.
- The instructions help a computer program to perform something meaningful.
- Each instruction tells the CPU to perform certain action, and each instruction is basically a sequence of 0s and 1s i.e. an instruction has a binary format.
- Such instructions that computer understands is called as <ins>Machine Language</ins> i.e. the language which a machine understands, just like the way we humans understand our languages.
- Machine language is also referred to as <ins>machine code</ins> and is sometimes also reffered to as <ins>native code</ins>.
- Here is an example of a machine instruction which performs addition operation: `000000 00001 00010 00110 00000 100000`
- The 6 digits on the right i.e. `100000` specify that it is an add operation.
- A computer program would involve many such instructions, and obviously, it would be very frustrating for someone to write and also read such instructions which have only 0s and 1s.
- So, it is very cumbersome and it has got to be simpler than that.
- So, computer scientists came up with another language called <ins>assembly language</ins> which was much more easier to read and write.
- Below is an example of adding two numbers in assembly language, which is much more expressive than machine code.

```x86asm
add $s0, $s1, $s2
```

- So, assembly language provides certain higher level notations for writing instructions, like add in this example.
- But computers understand only machine language.
- They do not understand assembly language.
- So, there is a program called <ins>assembler</ins> that translates assembly language instructions into machine language instructions which a computer can understand.
- Now, both machine language and assembly language are refferred to as low-level languages, and that's because they use low-level details of a computer.
- One example would be specifying the memory locaton where we are storing data.
- But, writing programs even in assembly language is still tedious, so programmers wanted programs to be expressed in a more easier way and they also wanted to hide low-level details.
- So in time, they came up with high-level languages.
- Some examples of high-level languages include FORTRAN, C, C++, Java, and C#.
- They use English-like words like `public`, `private`, mathematical notations like `+` and `-` and punctuations to write programs.
- So, they are much more easier to write and read, as we will see in this course.
- Below is an example Java program, and as you can see, it uses English words, math notations, and punctuation; and of course, they hide low-level details of the computer:

```java
public class Math {
  public static int sum(int x, int y) {
    return x + y;
  }
}
```

- So today, we mostly use only high-level languages.
- Assembly language is not very much used and is only used where performance is critical like in the case of operating systems of electronic devices.
- In terms of terminology, <ins>source code</ins> is the term that is use to refer to any code expressed in a programming language.
- So, source code is nothing but the programs that we write, like the Java program in the example above.
- Now, like in the case of assembly language, source code also cannot be understood by a computer, so we need to translate source code into machine into machine language and that's where compiler comes in.
- So, the translation from source code to machine code is done by this program called <ins>compiler</ins>.
- Machine code, which is the executable program, is then executed directly by CPU in a separate step.
- So, compilation and execution are two different steps.
- First, compilation is performed in order to translate source code into machine code, and then, separately, the machine code will be executed.
- So process is like this:
  - Source code ==> Compiler ==> Target language
- Note that here we are calling the translated languag as "target language" and not machine language.
- This is because in some cases it may be something else too.
- For example, in the case of C or C++, target language would be machine code.
- However, in Java's case, it is <ins>Java Bytecode</ins> - which will be discussed later.
- Sometimes target language can also be another programming language, for example ClojureScript is a language and it comes with a compiler which compiles ClojureScript programs into JavaScript, which is a different language.
- Such compilers are also referred to as <ins>source-to-source compilers</ins> or <ins>transcompilers</ins>.
- Source-to-source because it is converting one source code into another source code.
- There are some core operations that a compiler performs, and let's see what those are:
  - Verifying syntax and semantics of the source code is one of them.
  - This ensures that the source code complies with the rules of the programming language.
  - For example, a program is made up of statements, and in case of Java,every statement must end with a semicolon. That's a rule of Java programming language.
  - If a statement does not end with a semi-colon, then the compiler detects it as a syntactic error and reports it to the developer.
  - For example, here is a statement in Java that prints the text "hello!": `System.out.println("hello!");` and as you can see, the statement ends in a semi-colon.
  - If we omit the semicolon, then the compiler reports it as a syntax error.
  - Semantics is about meaning.
  - For example, in Java, we write our programs as classes; and a class can also have somehting called a subclass, which is just another class but, a specialized version of the original class.
  - But, if we declare the class with a keyword called `final`, then the compiler ensures that the class cannot have a subclass.
  - So, if we happen to define a subclass, then the compiler reports it as an error.
  - So, that's how the compiler is ensuring that the semantics associated with the `final` keyword is being respected i.e. it is not being violated.
  - Compilers also perform certain code optimizations for faster execution of the program. Certain compilers do that.
  - Finally, it generates machine code from the intermediate optimized code.
  - So, the optimization is done and then the machine code is generated from that.
- A compiler is a very complex program and these core operations are basic operations that any compiler supports.
- And as you will see in this course, a Java compiler perform tons of additional operations to ease the programmer's task.
- So, the compilation process can be slow due to the complexity in translation.
- However, once compiled, machine code execution will be very fast and the machine code can be executed any time and any number of times.
- But any change to the source code requires complete re-compilation.
- Next, we will look at platform dependency, which will also give you an idea on how a C program is compiled on Windows and Linux machines.
- We are not going to write any code for the discussion, but towards the end of the section, we will write, compile, and execute our first Java program.
- So, in this section, we will only write one program, but as the course progresses, starting from the next section, we will write lots of programs.

### Platform Dependency + Demo

- Now that we have a basic understanding of what compilation is, let's take a look at what platform dependency is.
- We will also do a short demo of platform dependency.
- Let's first consider that we have a windows machine and let's also assume that we have written a C program called `Hello.c`.
- To compile the program, we can use a compiler called GCC, and this would be the command, `gcc -o Hello Hello.c` where `Hello.c` is the file containing the C program, while `-o` is an option that tells compiler to name the output file as `Hello`, which will have a `.exe` extension on Windows.
- So, on compiling `Hello.c` we get an executable file called `Hello.exe` which includes the machine code.
- Here compilation step is also doing something called <ins>linking</ins>.
- Generally, any software comprises of many source code files, and each source code file is compiled into a separate file called the object file, which has an extension `.o` or `.obj`.
- For example, in this case it could be `Hello.o`.
- These object files are then grouped or linked to form a final executable file.
- This linking in many cases is done by the compiler itself.
- However, it can also be done manually by programmers themselves using another program called a <ins>linker</ins>.
- In this example, compiler does the linking and is generating an executable called `Hello.exe` which is finally executed by just typing in `Hello` at the command line.
- Similarly, we can also compile the same `Hello.c` program on a Linux machine using the same command as on Windows.
- this would also produce an executable, but in Linux the executable will be named as `Hello.out`.
- So, the extension is `out` here rather than `exe`, which can then be executed by typing `./Hello`.
- So, what we have here is both the executables being successfully executed on the machines on which those executables are generated.
- ![platform-dependency-0](https://github.com/user-attachments/assets/f471d838-832b-4532-ba3d-bc77611edcef)
- But this wouldn't be possible:
- `Hello` executable generated on Windows machine cannot be executed on Linux, and that is an example of platform dependency.
- ![platform-dependency-1](https://github.com/user-attachments/assets/f2b2b3b2-c6c9-4bd2-ad4f-1492c5777b38)
- So, `Hello.exe` can be run only on Windows operating system.
- To run it on Linux, we would have to recompile `Hello.c` program on Linux.
- Similarly, the `Hello` executable generated on Linux cannot be executed on a Windows machine.
- You would have to recompile on Windows.
- ![platform-dependency-2](https://github.com/user-attachments/assets/83b93d78-91a6-4467-a484-d9c08cc3936e)
- So, the generated executable is specific to the operating system.
- So, platform dependency has to do with operating system and one main reason is due to the format of the executable file generated.
- Windows uses a format called "PE" which stands for "Portable Executable", while Linux uses a format called "ELF" which stands for "Executable and Linkable Format".
- In case you are interested about these formats, you can read more about them on Google.
- Just search for portable executable or ELF, and you can read more about them.
- Another reason for dependency on operating system is when the program makes system calls.
- System calls are useful for performing operations like file opening, directory creation, or even printing to console or the terminal.
- System calls are routed to the operating systems kernal.
- Platform dependency can also be due to hardware.
- For instance, machine code generated for a program on an x86 processor would be different from the machine code generated for the same program on an ARM processor.
- So, the machine on which an executable is executed should be similar to the machine on which it has been generated.
- Otherwise it has to be recompiled using an appropriate compiler.
- So, both operating system, as well as hardware play a part in platform dependency.
- Next, we will see how an interpreter can help resolve the platform dependency issue.
- To watch demo, go through the lesson.

### Interpreter

- We have seen how software developed using compiled languages like C is not platform independent.
- Now let's look at interpreters, which address the platform dependency issue but, have some other limitations.
- It is an interesting lesson because many engineers do not understand how interpreters work.
- So, let's go ahead and get a good high-level understanding of how interpreters work.
- ![interpreter-1](https://github.com/user-attachments/assets/2c86e066-005f-44e1-a045-893ebb8abf33)
- We know that in a compiled language, machine code is first generated by the compiler and the generated code is in separately executed by the CPU.
- ![interpreter-2](https://github.com/user-attachments/assets/92641c67-d27b-4012-abcf-7d10f0486d89)
- An interpreted language works differently.
- In an interpreted language, we have an interpreter, which is a program that directly executes the source code.
- ![interpreter-3](https://github.com/user-attachments/assets/d6aa7170-e816-483d-8ec1-8a0ee878be4a)
- That is, there is no separate compilation and execution step like in the case of a compiled language.
- As you can see in the diagram above, input to the interpreter is the source code and output is the result of execution of that source code.
- So, you can see the similarity between an interpreter and CPU.
- ![interpreter-4](https://github.com/user-attachments/assets/dd84ff60-12f6-4f0b-8595-ee4ee84d386c)
- A CPU turns machine code into results while an interpreter turns source code into results.
- So, machine code serves as the instruction set for the CPU, while source code serves as the instruction set for the interpreter.
- Just note that interpreter is also a program and it needs to be run.
- So, CPU executes the interpreter and interpreter in-turn executes the source code.
- So, interpreter is nothing but a virtual machine that simulates a CPU.
- Just the way, a CPU executes machine language instructions using the <ins>fetch-and-execute cycle</ins>, an interpreter also executes instructions in the source code in a similar fetch-and-execute cycle.
- Let's now look at how a computer's fetch-and-execute cycle works.

#### CPU's Fetch-and-Execute Cycle

- ![fetch-and-execute-1](https://github.com/user-attachments/assets/1966d9fa-8464-4106-931a-a6a0d44c2e68)
- Fetch-and-execute cycle is the most fundamental operation of a computer and every programmer MUST know it.
- In case you are not familiar with it, this brief discussion should be helpful.
- Here we have a CPU, Memory, and a Hard Disk with the program to be executed.
- ![fetch-and-execute-2](https://github.com/user-attachments/assets/e27fe00b-94aa-4ee5-a6e4-b1914b8b880f)
- When the program is executed or started, the program first gets loaded into memory.
- We know that a program is a machine code and is basically a sequence of instructions where each instruction is simply a sequence of 0s and 1s.
- Next, CPU fetches an instruction from the memory and it then executes it.
- In the process it may also fetch any data needed to execute the instruction.
- ![fetch-and-execute-4](https://github.com/user-attachments/assets/8657de06-0b09-4615-a5c6-86bca5e9ff7c)
- Any data generated by the execution of the instruction will be written back to the memory.
- ![fetch-and-execute-5](https://github.com/user-attachments/assets/7a99da7d-53b1-41c0-b98c-12fa6e93f612)
- CPU then fetches the next instruction and executes it.
- So, this cycle continues until all of the instructions in the program are executed.
- That's basically the CPU's fetch-and-execute lifecycle.
- Now let's look at interpreter fetch-and-execute cycle.

#### Interpreter's Fetch-and-Execute Cycle

- Like a CPU, interpreter also fetches its instructions from the memory.
- However, in interpreter's case, the instruction is basically a statement in the source code.
- It then understands what is necessary to carry out that statement; and these two steps are also done by the compiler.
- Next step would be to execute the program statement and here is the interesting thing, interpreter maintains a library of compiled machine code and it just executes the appropriate compiled machine code that corresponds to the program statement.
- So, the interpreter is not generating machine code, it simply uses its own compiled machine code to accomplish what the source code directs.
- Let's actually look at an example.
- ![execution-step-example-1](https://github.com/user-attachments/assets/000ffbe4-4af9-40d2-bf0b-45514bca57f7)
- Here we have an add statement in the source code and the interpreter executes a corresponding compiled code from its library, which is the machine code version of this block of code that we see.
- The code is fetching the two numbers to add from the memory, then it is performing the actual addition and is finally storing the output back in the memory.
- So once again, interpreter is not generating machine code, it just uses its library of pre-compiled machine code.
- One main advantage of interpreter is platform independence.
- ![interpreter-platform-independence-1](https://github.com/user-attachments/assets/96952d57-3ecd-4e59-ade8-e4b4ba0a2dd7)
- As you can see in the illustration above, the same source code can be executed on any of the platforms.
- Only requirement is to install an interpreter specific to the platform.
- Recall that with a compiled language, we could not achieve platform independence.
- That was because instead of source code, we were using machine code, which was platform dependent i.e. the machine code includes attributes specific to the platform on which it was generated.
- So, the target platform on which the machine code is to be executed could have different set of attributes and thus the machine code would fail to execute.
- But with an interpreted language, we are executing source code, which is identical regardless of the platform on which it is written i.e. it is platform independent.
- It is just that the interpreter on the target platform ensures that the platform independent source code is executed without any issues.
- What we mean by that is, as mentioned eariler, interpreter has library of machine code and this machine code is specific to the target platform.
- For instance, interpreter installed on Windows will have machine code instructions for that Windows machine itself.
- ![interpreter-platform-independence-2](https://github.com/user-attachments/assets/6fc2e2d0-fe71-4aa4-9744-1c2ae54700b5)
- So, it simply executes those instructions corresponding to the statements in source code and hence, there wouldn't be any issues.
- Also note that a statement in a programming language like Java would be a single line of code that ends in a semicolon e.g. `i = i + 1;`

#### Pros & Cons of Interpreter

##### Pros

- One advantage of an interpreter includes platform independence, as we have just seen.
- Next, there is no compilation step i.e. a program execution can start immediately.
- One main advantage of not having a compilation step is that would enable easier updates.
- For example, in some of our projects, we might have have instances where we have to fix bugs in the JS code on production servers.
- JS was an interpreter language (NOTE: today it is an Just-in-Time compiled language) (here we are talking about when it used to be an interpreter language) so, we could easily make the required code changes directly on the production servers, which could save us a lot of time.
- Now, had it been a compiled language, we would have to make the changes externally, compile the code, and then deploy the compiled code onto production servers, which would consume a lot of valuable time.

##### Cons

- In terms of limitations, interpretation is orders of magnitude slower than compiled code.
- There are a couple of reasons for this.
- One is due to costly memory access operations.
- For example, this is the library code fromt he add instruction example that we saw earlier:
- ![execution-step-example-2](https://github.com/user-attachments/assets/bf905d40-3a00-4aec-9f99-9f57a612a60a)
- As you can see, there are several costly memory access operations.
- In a compiled language, it would haveen taken care of in registers, which could result in code that runs very fast, probably even a 100 times faster.
- Second reason for slowness is program has to be re-interpreted every single time it runs.
- Another limitation is that interpreter is loaded into memory along with the source code. So, you have an extra program that is getting loaded into the memory.
  - It might not be a big deal but, ti is just something we need to know.
- So, as we can see, though interpreters solve the platform independence issue, they do have other limitations like slow execution speed.
- We will next see how Java takes care of the speed issue without compromising on platform independence.

### Platform Independence in Java + Demo

- Now let's see how Java achieves platform independence but, without affecting execution speed.
- ![platform-independence-java-1](https://github.com/user-attachments/assets/05991591-60e9-481a-b086-dccddcf58e6e)
- We discussed about compilation and interpretation, which offer contrasting benefits and limitations.
- We have seen that with compilation we get fast execution speed but, without the benefit of platform independence.
- We have also seen that with interpretation, we get the benefit of platform independence but, with much slower execution speed.
- With Java, we get the best of both worlds i.e. Java uses compilation to achieve fast execution speed and it also uses interpretation to achieve platform independence.
- So, let's see how that is accomplished in Java.
- We have Java source code, which is first compiled by the Java compiler into something called Java bytecode.
- ![platform-independence-java-2](https://github.com/user-attachments/assets/5e35828b-ebef-470c-8a3f-60dfc6a89388)
- So, it is not the machine code that typical compilers generate, but it is an intermediate format called as the Java bytecode.
- Then the compiled Java bytecode can be interpreted on any platform that has a Java interpreter installed.
- ![platform-independence-java-3](https://github.com/user-attachments/assets/716bc6a3-4f38-497d-84f0-891ec8f256f4)
- Earlier, we saw that an interpreter, interprets source code directly.
- ![platform-independence-java-4](https://github.com/user-attachments/assets/a4ccd0b0-38ee-4b29-a88c-eee03825f289)
- But here in Java world, the Java interpreter is interpreting the Java bytecode rather than the source code.
- So, Java bytecode is an intermediate format generated from the source code.
- Interpreting this compiled Java bytecode as opposed to interpreting source code directly is what makes executing Java programs much faster.
- So, executing Java bytecode is much faster.
- This Java interpreter is nothing but JVM, which stands for Java Virtual Machine i.e. a virtual machine that can execute Java programs, which include the Java bytecode.
- ![platform-independence-java-5](https://github.com/user-attachments/assets/737ff210-3953-4de1-8d2f-361e7e0a3655)
- So, as JVM is interpreting Java bytecode, we can think of Java as an interpreted language.
- ![platform-independence-java-6](https://github.com/user-attachments/assets/839834ec-7ac4-4877-9954-d52640ddc1e5)
- Also, just like any interpreter, JVM is platform specific, and that helps in achieving platform independence.
- So, we learned earlier that platform-dependent interpreters help achieve platform independence.
- ![platform-independence-java-7](https://github.com/user-attachments/assets/13475917-973c-4cec-9057-f6a9428488f8)
- Similarly, with Java, platform dependent JVM would help achieve platform independence.
- ![platform-independence-java-8](https://github.com/user-attachments/assets/155fed54-51f5-49b5-b621-679b69b4fb53)
- It is just that JVM would interpret Java bytecode rather than source code directly. That's the main difference.
- So, Java bytecode is platform independent while JVM is platform dependent, just like source code is platform independent, whereas an interpreter is platform dependent.
- So, you can see the similarity there.
- Now, let's also look at the commands used for compilation and execution in Java.
- At the end of this lesson, we will also execute these commands on the terminal to compile and execute a Java program.
- ![platform-independence-java-9](https://github.com/user-attachments/assets/1f6e5beb-721b-4558-84da-7e60d9268e1f)
- So, let's assume we have a Java program called `Hello.java`, which includes the source code.
- So, the extension of the file is `.java` and `Hello.java` can then be compiled to generate a file called `Hello.class`, which includes the Java bytecode.
- To compile, we use the command `javac Hello.java`
- `javac` is the Java compiler.
- Also, it does not matter whether we are compiling on Windows or Linux, the file generated would be `Hello.class`.
- `Hello.class` can then be executed on any platform that has a JVM installed.
- To execute the class file, we use the command `java Hello`.
- Here `java` is the Java interpreter and it is the same command regardless of the platform.
- This command, `java Hello`, creates an instance of JVM.
- So, JVM is just a software and it creates an instance of JVM i.e. the operating system loads the JVM into memory as soon as we execute this command, and then the JVM executes `Hello.class`.
- In other words, JVM interprets the Java bytecode present in `Hello.class` and as mentioned earlier, we will soon look at it in action.
- Now coming back to execution speed, as mentioned earlier, interpreting Java bytecode is much faster than interpreting source code.
- That's because Java bytecode is compact in comparison to source code and is designed specifically to be interpreted by JVM, while the source code is designed to be read and written by humans i.e. developers.
- Moreover, it is already compiled, which means that things like syntax checking, which happens when interpreting source code is already done.
- So, that save us time.
- Also, the Java bytecode is up to a certain extent optimized with certain operations, which would make it run faster.
- Next, to further speed up execution, JVM also performs additional optimization through a process called just-in-time compilation, which will be discussed in one of the subsequent lessons.
- But this particular optimization will be done at execution time by the JVM so, it is not done by the compiler and it plays a very critical role in making Java programs run faster.
- Finally, note that the Java bytecode's compact form also enables in quick transfer of bytecodes across networks.
- Recall that Java was originally designed to work in a networked environment where transferring compiled Java programs, which are nothing but the Java bytecode across different devices was one of the goals.
- So, that's about it.
- We have now seen how Java bytecode and JVM were used to achieve platform independence without compromising on speed.
- To watch the demo, go through the lesson.

### Java Virtual Machine (JVM)

- We have seen that one of the unique selling points of Java is its platform independence capability without compromising on execution speed.
- We also know that it is because of JVM.
- Platform independence was possible because JVM installed on a particular platform can interpret Java bytecode without any issues; and since Java bytecode is designed specifically to be interpreted by JVM, we also get very fast execution speed.
- We also said that JVM can additionally perform something called Just-in-Time (JIT) compilation, which makes executing Java programs even faster.
- So, they can execute super fast.
- So, JVM is the cornerstone of Java, and it has other important benefits too.
- It is a very sophisticated software.
- It is so good that even programs written in other popular programming languages like Scala and Groovy can be compiled into Java bytecode, which can then be run on any JVM.
- That way, they also get the benefits of JVM such as platform independence and fast execution speed.
- So, to run JVM, all you need to do is produce Java bytecode. So, you need compilers which can produce Java bytecode.
- Since JVM plays such a vital role in making Java really attractive and making it one of the most popular languages out there, it is important to have a good understanding of JVM.
- We have a separate section dedicated to JVM, but at this point, but at this point, let's at least get a good high-level understanding of JVM and also its architecture.
- We will also see why Java programs run as fast as C or C++ programs.
- It is very important to understand this viz why Java programs run very fast instead of just diving into the code.
- Java Virtual Machine is called <ins>Virtual</ins> and that's because it is an abstract computing machine.
- That is like a real computing machine, it has an instruction set which it executes, and its instruction set is the Java bytecode.
- So, for a CPU, machine code serves as the instruction set, while for JVM, Java bytecode serves as the instruction set.
- JVM also manipulates memory at runtime i.e. it uses memory to run its programs and to manipulate their data.
- Note that the term "runtime" here refers to the time when the program is actually executed.
- As mentioned earlier, JVM is the cornerstone of Java platform, and it has a few core responsibilities.
- One of them is loading and interpreting Java bytecode.
- We know that interpreting Java bytecode helps achieve platform independence along with fast execution speed.
- So, it is a very fundamental responsibility of JVM.
- Next is security.
- Security is critical as Java was developed for a networked environment where programs can be downloaded from across the network, and you don't want those programs to perform any harmful activities on the user's machine.
- Third is automatic memory management.
- Unlike C or C++, Java relieves its programmers from directly manipulating memory; and it does that through its automatic memory management process.
- This makes programming in Java easier and also makes Java programs a lot safer i.e. it will greatly minimize some really nasty memory-related errors that one might make if they are manipulating the memory directly.
- And as we will soon see, JVM has separate components to manage these responsibilities.
- Now, before we look at what constitutes a JVM, let's first look at what happens when a Java program is run.
- Let's say we have a Java program called `Hello` and now when we execute this program using the command `java Hello`, an instance of JVM is created and is loaded into memory.
- JVM then in-turn loads the `Hello` program into memory and executes it.
- At this point, both JVM and `Hello` program are now in memory.
- So, each Java application, like `Hello` program runs inside a JVM instance.
- ![jvm-1](https://github.com/user-attachments/assets/017f66ba-ff3d-4dbf-8af8-e5550b94fc60)
- So, we can see the JVM instance here.
- Note that a JVM instance runs only one Java application.
- If you want to run another program at the same time, then you can execute it separately.
- For instance, while the `Hello` program is running, if you want to run another program called `Goodbye`, then you would just say `java Goodbye`.
- This would then create yet another instance of JVM which will then execute the `Goodbye.class`.
- So, two JVM instances are being run at the same time, just like the way you can have two instances of your browser running at the same time.
- Now let's take a look at a typical architecture of JVM.

#### JVM Architecture

- Let's assume that we have a Java program called `Hello.java` which is compiled.
- ![jvm-2](https://github.com/user-attachments/assets/6766604b-a95c-4ca5-a1d2-77e7284ba84a)
- Next, we need to run it, and so we would say `java Hello`, and we know with that, JVM will be launched.
- ![jvm-3](https://github.com/user-attachments/assets/70761a9f-74b9-4ced-bd09-ee284f159ec7)
- That is, it will be loaded into memory.
- At the same time, JVM will also get a chunk of memory from the underlying operating system, and we are referring it as <ins>runtime data areas</ins> aka JVM memory.
- ![jvm-4](https://github.com/user-attachments/assets/0f35d034-12e2-48d8-bad3-4461981774ca)
- JVM now has to load `Hello.class` which includes that Java bytecode.
- For this, JVM invokes a component called Class Loader, which as the name implies, locates `Hello.class` and loads the corresponding bytecode into memory.
- ![jvm-5](https://github.com/user-attachments/assets/c1e31de0-a5a0-44d0-9356-f03a8ec6d3de)
- So, as the name Class Loader suggests, it loads the class.
- And when we say memory, it would be these two areas called <ins>Heap</ins> and <ins>Method Area</ins>:
- ![jvm-6](https://github.com/user-attachments/assets/82e7b16b-a831-440c-8013-e248d41f433b)
- Next, the bytecodes are verified by a component called <ins>Bytecode Verifier</ins>.
- ![jvm-7](https://github.com/user-attachments/assets/f7ac231e-8070-4b21-a668-7fedc5c839c0)
- This is to ensure that the loaded class file is not corrupted.
- This is very critical, because in certain Java application we know that classes can be downloaded from across the internet, like in the case of applets.
- Those classes could have been created by some hackers.
- So, bytecode verification is critical to ensure the integrity of JVM.
- Once the bytecode has been verified and if there are no issues, then it can be safely executed by the execution engine, which includes the Java interpreter along with a JIT compiler.
- ![jvm-8](https://github.com/user-attachments/assets/19877eb9-7488-4ae5-8660-15cfa1b4a996)
- So, the interpreter here, interprets the Java bytecode.
- So, this execution engine, which includes the interpreter and JIT compiler, gives us the benefit of platform independence and very fast execution speed.
- So, it handles one of the core responsibilities of JVM which we discussed earlier.
- Garbage collector is the component that is responsible for automatic memroy management, which as we mentioned earlier is another core responsibility of JVM.
- ![jvm-9](https://github.com/user-attachments/assets/13ea711a-c0be-4da2-95b5-a3ed4f06aece)
- And as the name implies, Garbage collector, collects the garbage in our program, which would be things that are no longer useful.
- This means that it would reclaim the memory accessed by those things.
- Next, Security Manager is responsible for ensuring security, which is another core responsibility of JVM.
- ![jvm-10](https://github.com/user-attachments/assets/3f5f5667-e4a0-4b46-98ec-b445e58c3af9)
- For example, if you want to restrict any bytecode from accessing your file system, then security manager can ensure this by running the bytecode in a more restricted environment called the <ins>sandbox environment</ins>.
- Finally, there are also a few other components that constitute a JVM.
- ![jvm-11](https://github.com/user-attachments/assets/c046d979-4227-456d-bea5-63107321c8c9)
- But, let's not worry about them.
- We have discussed some of the main ones here, and it should give you a fair idea about what constitutes a JVM.
- In JVM internals section, we will discuss many of these components in detail.
- Now, let's spend a little bit of time discussing the JIT compiler, as it plays a critical role in making Java programs run very fast, just like in the case of C or C++.

#### Performance

- We already discussed this:
  - Interpreting Java bytecode is much faster than interpreting source code.
  - This is because bytecode is designed specifically for JVM, and is already compiled and also sometimes optimized.
- So, let's see how JIT compilation helps in further speeding up the execution.
  - As the program is executing and bytecode is being interpreted, JVM monitors frequency of execution of each piece of executed bytecode.
  - Some of the code is more frequently executed than others, and the frequently executed code is referred to as "hot spots".
  - Hot spots are then given to the JIT compiler, which is a component of JVM as we just saw.
  - JIT compiler converts these hot spots to machine code.
  - This machine code is then cached, which means that it is saved in memory for future use; and in future, whenever there is a need to execute these hot spots, the corresponding cached machine code is what gets executed, resulting in much faster performance.
  - Rest of the code is still interpreted by the interpreter.
  - So, the frequently executed code, that is the hot spots, is not interpreted every single time.
  - Its corresponding cached machine code is what gets executed directly.
  - This JIT compilation is referred to as <ins>dynamic compilation</ins>, as the compilation into machine code is done dynamically at runtime.
- Now, let's just try to understand this JIT compilation process through a simple example.

#### JIT Compilation Example

- Let's consider that we have two methods called `foo()` and `bar()`.
- ![jit-1](https://github.com/user-attachments/assets/b40e1a8d-6c2b-40cb-bc2e-18bef070e84a)
- NOTE: In some programming languages, methods are referred to as functions.
- In Java they are simply called Methods, and we will discuss them in the next section.
- Essentially, they are blocks of code that represent certain logic to be executed.
- Here `foo()` would represent some logic and `bar()` would represent something else.
- Now let's consider that the method `bar()` has 50 lines of code.
- At runtime, the bytecode corresponding to each of these 50 lines of code is interpreted, and the corresponding machine code is executed.
- ![jit-2](https://github.com/user-attachments/assets/28152cc2-be7b-4c75-855e-f45456bb8840)
- This happens the first time the method is executed, and it also happens the second time and so on, until say 1000 times.
- And every single time, the bytecode corresponding to every line of code here is interpreted and its corresponding machine code is executed.
- Now that it ran for 1000 times, this code in `bar()` method could be considered as frequently executed code.
- So, JVM would designate it as a hot spot.
- And with that, JIT compiler would then kick in, and it would generate its own machine code version of this entire method.
- ![jit-3](https://github.com/user-attachments/assets/e13ec0ec-b321-4065-94ae-5a2eee917fa4)
- And JIT compiler, like a regular compiler, could have done some optimizations too when it is generating this machine code.
- This JIT generated machine code is then cached.
- ![jit-4](https://github.com/user-attachments/assets/9b2f3442-5fc8-4e10-b383-04b7aaeda0a8)
- And when bar is executed for the 1001st time, the cached machine code will executed directly.
- So, there is no more interpretation of the bytecode corresponding to the 50 lines of code that the `bar()` method has.
- Since machine code is being executed directly, it would run very fast, just like code written in C or C++, where CPU executes compiled machine code directly.
- ![jit-5](https://github.com/user-attachments/assets/e496b727-716a-470f-bfb6-9ae87993bf00)
- So, you can see that there is no difference here.
- So, that's why Java is considered as almost as fast as languages like C or C++.
- Now here, if `bar()` is executed for say 2000 times, then it might trigger another round of optimization by the JIT compiler for further speed-up of execution.
- ![jit-6](https://github.com/user-attachments/assets/a41dcdea-b9e5-4503-a8dd-016222cf4129)
- Note that method `foo()` may not be that frequently executed, and hence might be interpreted every single time.
- So, this is how conceptually a JIT compiler would work.
- The actual way in which it works could differ slightly, but conceptually this is how it would work.
- That's about it. That's a high-level overview of JVM.
- And as you can see, that it is a very highly sophisticate piece of software that makes Java programs run very fast and securely and also platform independently.

### An Overview of Java SE

- As mentioned at the beginning of the section, we can create Java applications for different devices like desktops, web servers, mobile applications, and so on.
- There are separate platforms dedicated for developing these different types of applications.
- This course is about one such platform called Java SE, which stands for Java Standard Edition.
- In this lesson, let's get a good high-level understanding of what Java SE platform is.
- The Java software family includes multiple platforms targeting different types of devices, and there are 3 main platforms that are most commonly used.
- The first one is the Java Standard Edition or Java SE in short, which is the subject of this lesson as well as the course; and previously it was called as J2SE, and it used to develop standalone applications that typically run on desktops but, may also run on servers.
- An example can be a hospital management system used with a hospital.
- Such a system is a standalone system i.e. it would be installed on different desktops within the hospital and the hospital administration staff would use it enter information like patient details and which doctor will be treating the patient and so on and so forth.
- Next is Java Enterprise Edition or Java EE in short, and this was previously called as J2EE.
- It is used to develop large-scale applications that run on web servers.
- When we say large-scale it implies large number of users will be using the application at any given instance of time.
- An example would be an e-commerce website like Amazon.
- You might hae heard of technologies like Servlets and JSPs and they fall under Java EE platform.
- Java EE is built on top of Java SE platform.
- So, Java SE technology serves as the foundation for Java EE.
- Java SE is not constrained to just building standalone applications, but it is needed for building large-scale web applications too.
- It is just that we need more than what Java SE offers and that's where some of the other technologies within Java EE come into play.
- Note that in 2017, Java EE has been re-branded as Jakarta EE as Java EE's development has been shifted from Oracle to Eclipse Foundation.
- Eclipse is a foundation which is also responsible for developing Eclipse IDE.
- Eclipse foundation has chosen to rename it as Jakarta EE, but originally, it used to be with Oracle.
- Third platform is Java Micro Edition or Java ME in short.
- This was previously called J2ME, and it is used to develop applications for resource-constrained devices like mobile phones and set-top boxes.
- So, it is mainly for small devices which have limited resources and limited processing power.
- While Java EE is built on Java SE, Java ME uses a subset of Java SE.
- In this course, we will be learning about Java SE as it represents the core Java programming language.
- We will also briefly get into Java EE at the very end as the course project is a web application and we use some basic Java EE technologies like Servlets and JSPs.
- Note that even if you want to develop Java EE or Java ME applications, you still need to have a solid foundation in Java as both Java EE and Java ME, as we can see, are based on Java SE.
- You may also know that to develop full-featured Android apps, we need to know Java.
- So, having sound foundation in Java is very important and this course is all about setting that foundation firmly.
- Not having a good foundation in Java can really hurt your performance as a software engineer when you are developing Java EE or Android applications.
- So, it is important to learn Java well, give it the time that it needs, and once you have a good background in Java, learning these other platforms is pretty easy and it shouldn't also take too much of time to acquire those skills.
- Now, strictly speaking, each of these different platforms define one or more specifications.
- A specification is simply a document that describes the technology in plain English.
- So, it is not a software and just a document.
- So the software, which is the implementation of the specification would be something different and an implementation can come from different providers like Oracle or Amazon or IBM, etc.
- So, a specification is like a blueprint for a house and the implementation is the actual house itself.
- Since this course is about Java SE, let's just focus on that now.
- ![jse-1](https://github.com/user-attachments/assets/7cdc96a3-9a38-4370-a12c-cda3682229af)
- Java SE defines a few specifications, and one is Java Language Specification (JLS).
- It defines the entire Java programming language itself i.e. it defines the syntax and semantics of the language, that is the rules of the language - and it is the most comprehensive and accurate document that you can get on Java as it is written by the Java Language designers themselves like James Gosling.
- So, it is like any good book on Java but, it is not easy to understand, at least for a beginner.
- Later we will also look at the JLS, which is online.
- The next specification is Java Virtual Machine specification which defines how a JVM should work.
- It also specifies the bytecode instruction set.
- We will look at some of the bytecode instructions in the JVM internals section.
- It also includes the Java API specification, which is nothing but the specification of the Java library.
- So, that's what Java SE specification is and it has many implementations.
- One is the official implementation from Oracle and it is reffered to as Oracle JDK, where JDK means Java Development Kit.
- Then there is Oracle's OpenJDK.
- So, they both come from Oracle.
- The difference between Oracle JDK and OpenJDK is that OpenJDK is completely free while with Oracle JDK, you would have to pay Oracle if your are using it for commercial purpose; and with that you would get their support for fixing any bugs in the implementation.
- Now, OpenJDK is completely free so, it is even free for commercial purpose.
- But, since we are learning Java here, it is fine to use even Oracle JDK.
- There are also many other providers and a few prominent ones are AdoptOpenJDK, Amazon Corretto, Red Hat's OpenJDK.
- These are also free just like Oracle's OpenJDK.
- Now each of these implementations is basically JDK, that is, Java development kit, and we need a JDK to write, compile, and execute our Java programs.
- Soon we will install one of the latest versions of JDK.
- Now let's see what a JDK would contain.
- ![jse-2](https://github.com/user-attachments/assets/90451610-0342-45a7-ac5d-cad58087edbb)
- It would obviously include a JVM which implements the JVM specification.
- It would also contain the actual Java API code that is the Java library code which is a pre-defined functionality that we can readily use when writing our Java programs.
- It would also include development tools like the Java compiler so that we can compile our Java programs.
- So, all JDKs that we get from the different providers would include these components.
- JDK is also referred to as Java SDK, where SDK stands for <ins>software development kit</ins>.
- SDK is more of a general term and many times developers may also refer to JDK as Java SE, although stictly speaking, Java SE is a set of specifications, just as we discussed.
- The JVM and and the Java API are collectively referred to as JRE, which stands for <ins>Java Runtime Envrionment</ins>.
- ![jse-4](https://github.com/user-attachments/assets/bb3e2173-fa70-4797-ac86-21c76159d57d)
- Oracle used to offer such a JRE separately from JDK although JDK includes a JRE.
- That's because Java Runtime Environment (JRE), as its name suggests, is essentially a runtime environment.
- That is, it is an environment used to only run Java applications.
- So, you cannot develop Java applications using JRE.
- So, if you are shipping your Java application to your clients, then your clients would only need to install a JRE to run it.
- They do not need development tools like the Java compiler which comes with the JDK.
- So, they do not need a JDK, but they need a JRE.
- However, such a separate JRE was offered only till Java SE 10, where 10 is one of the versions of Java SE.
- From Java SE 11 onwards, Oracle stopped offering it as they were including a tool called <ins>jlink</ins> which can be used to create a custom JRE.
- This custom JRE can be smaller in size than a regular JRE, or one can simply install a JDK itself, as it also includes a JRE.
- So, JRE is not included separately by Oracle from Java 11 onwards.
- But, regardless of whether a separate JRE is available or not, we as developers who develop Java programs would need a JDK as it includes tools like Java compiler which is needed to compile our programs and since it also includes a JVM, we can also execute our programs.
- So, JDK is what we need.
- Now, earlier we mentioned some of the most prominent JDK providers.
- Although these are different implementations, they are all based on the same source code and this source code is developed as part of the project called OpenJDK.
- ![jse-6](https://github.com/user-attachments/assets/50adc994-b9fb-4e9d-8009-b595fcd337db)
- This source code is open source and it was originally proprietary to Oracle, but later Oracle made it open source so that anyone can contribute to it, including engineers from companies such as Oracle, Amazon, and IBM.
- Now, when we say source code, it would mainly be the Java library or the Java API code and a JVM implementation called HotSpot.
- HotSpot is written in C++.
- So, all these different providers would include the same API code and the HotSpot JVM.
- However, certain providers might add some non-core functionality and may also provide additional services like offering paid support like in the case of Oracle's JDK.
- Now, AdoptOpenJDK also provides the option to use another JVM called OpenJ9 which is form the Eclipse foundation.
- OpenJ9 is also open source and was originally developed by IBM.
- So, HotSpot and OpenJ9 are two different implementations and both are great.
- HotSpot is more like a standard one because it was originally developed by Oracle and it is also a part of OpenJDK.
- But, OpenJ9 is also very good.
- So, keep in mind that Java is open source.
- Now let's briefly look at the [Java SE specifications](https://docs.oracle.com/javase/specs/) that are available on the web. (Go through the rest of lesson for the introduction)
  - Java Specification Request (JSR) - mainly describes features that got added within the particular release.
  - Java Community Process (JCP) - Formal mechanism/process to develop Java specifications.
- [Java API](https://download.java.net/java/early_access/jdk24/docs/api/) documentation

### Java SE Release Cycles & Release History

- Let's now go ahead and look at the different Java SE releases.
- So, in the last lesson we got a good understanding of the Java SE, like an overview of Java SE, and it has many releases over the years.
- In this lesson, we will look at different releases and the release cycle, like how often a release is being made and generally what comes out from the release.
- Also, we will look at a little bit about the history of releases.
- Here we are: [Java SE Specification](https://docs.oracle.com/javase/specs/)
- In a given year, currently they are doing 2 releases, one in March and one in September.
- For instance, in 2019, in March, they released Java SE 12.
- So, along with that, all of the providers were also trying to come up with the JDK implementation, like the Oracle, Amazon, the OpenJDK, Oracle, and so on.
- So, every year they are doing one release in March and one in September.
- So, that's a 6 month release cycle.
- And this 6 month release cycle started from Java 10 onwards.
- Before that, the releases were much less frequent.
- So, they used to release anywhere from once every 2 years to 5 years.
- For instance, Java 6 came out in 2006, and Java 7 came out in 2011. So, there is a gap of 5 years.
- Java 8 came out in 2014 and Java 9 came out in 2017.
- So, the problem with this is that Java was evolving very slowly, while other platforms and programming languages were evolving quickly as those were doing releases very quickly.
- So, Java was not like that. It was very slow and not as agile as other platforms/programming languages.
- Because of that, the innovation was kind of slow so, they wanted to make it faster.
- The reason why it used happen like that is because the designers were always trying to bring out large, big features in every release.
- For instance, in Java 8, there were Lambda expressions, and Java 8 was a very huge release.
- Similarly in Java 9 they had something called as modules, the Java platform module system, which was also a very huge change.
- So, they have certain deadlines to meet, but because those features are so complex, the deadlines were constantly getting extended and the release was not happening.
- But, the problem with that is, in a release, apart from these big features, there would also be some smaller features, which were completed but we are unable to use it because the release itself is not happening.
- So, the release was stopping those small features to see the light. So, we were unable to use those small features.
- So, the Java designers wanted to change that, and hence they decided to do frequent releases from Java 10 onwards.
- But the different is that in each release they will only have fewer features coming out.
- Like if there are any smaller features, they would come out.
- But, the larger features would also come out in one of the releases.
- But in each release, you will only see a few changes being made.
- So, that's the thing.
- They wanted to be agile like all other platforms too.
- This particular document: [Java SE Specification](https://docs.oracle.com/javase/specs/) only shows releases from Java 6 but, before Java 6 we also had 5 other releases dating back to 1996 when Java came into existence.
- So, Java 1 was initially called JDK 1, then there was JDK 1.1 which came out in 1997.
- The next version was J2SE. Recall that Java SE was earlier called as J2SE.
- So, they had some inconsistent version numbers like J2SE, 1.2, 1.3, etc.
- But in this course, let's call them as Java 1, Java 1.1, Java 2, Java 3, Java 6...
- Let's now get an idea about what came out in those intial versions.
- Before Java 6, they had only few hundred classes.
- Recall that each release comes with the Java library and the Java library had only few 100 classes, and the platform itself in Java 1 and Java 1.1 was pretty slow.
- Then Java 2 came out and it was a major release with addition of significant number of new classes.
- So, there were large number of classes that got added, and more importantly, it was faster too, as it included the JIT compiler.
- Then after that, Java 5 came out in around 2004.
- It was also a pretty huge release.
- In between there were Java 3 and Java 4, but probably they are not that significant.
- Java 5 was really huge with new additions like generics and some new multi-threading features, and it had close to 2,500 classes.
- Then later in Java 6, which we can see on [Java SE Specification](https://docs.oracle.com/javase/specs/) came out.
- It did not add much to the language itself but, had some important changes in the JVM.
- So, sometimes in certain releases, you will see more changes in JVM and fewer language changes.
- But now in the recent releases, mostly only smaller features are coming out.
- Some of those features are preview features.
- For example, switch expressions was added as a preview feature in Java 12. It was still a preview feature in Java 13, and in Java 14 it became a permanent feature.
- So, some of them are released as preview features. They are not standard and they may be removed in the next release too.
- So, if the developers do not like them and they get a negative feedbacke, they might remove the feature.
- That's about it.
- Next, we will install one of the latest versions of a Java SE implementation.
- We will install a JDK and we will get started.

### Installing JDK 17 on Windows

- The JDK gets installed in C Drive => Program Files => Java => jdk-21
- jdk-21 is the directory of your JDK.
- If we go inside jdk-21 => bin, you will see all the executables, like the Java compiler, Java interpreter, and all the development tools that we need.
- Some of the executables that we have in the bin folder are:
  - javac - That's for comiling our programs
  - java - Which is the Java interpreter so, it is anothe executable. This is for running our programs.
  - javap - It is called as a disassembler. If you want to look at the bytecode that your compiler generates; your compiler generates a `.class` file which has Java bytecode - if you want examine that, you would use this tool.
  - jar - This tool is used for packaging your software. So, once you have your software, you can create something called as a jar file. So, that's a unit of release and that jar file, you can give it to your clients or partners.
- So, these are some of the development tools that you have in the bin directory.

### Installing Java on Mac

### Installing Java on Linux

### Setting Classpath Environment Variable

- We just installed Java, but before we write our first Java program we need to take a look at an envrionemnt variable called <ins>Classpath</ins>.
- ![classpath-1](https://github.com/user-attachments/assets/10bcf759-9364-4b42-adfd-d801a11e2607)
- An environment variable is simply a variable whose value is visible to the entire environment i.e. to all processes running within the system.
- So, it is like a global variable.
- Classpath, as the name implies, is simply a path on the file system for locating Java classes; and it can include more than one path too.
- It is used during both, compilation as well as execution of Java programs.
- So, classpath environment variable is specific to Java.
- For instance, if you run a program by executing the command `java Hello`, then the Java interpreter needs to know where it can locate the `Hello` program, which is nothing but `Hello.class`; and to look at the program, it may use the classpath.
- For instance, let's say that this is the class path: `C:\foo;C:\bar`, which includes two paths.
- Then it would first look for `Hello.class` within the data tree `foo` within C drive.
- So, that's the first path, and if it is not found there, then it would search in the second path, which includes the `bar` directory.
- In this case, it finds it under `bar` directory and it would then execute `Hello.class`.
- Note that this classpath is needed only when we are compiling and running our programs from the command line.
- It would not be needed if we are using an IDE like Eclipse.
- IDE stands for Integrated Development Environment.
- Initially, we will write our programs in a regular text editor and we will compile and run those programs from the command line.
- But later, we will switch over to Eclipse for writing our Java programs.
- In the next lesson we will discuss a little bit more about why we are using a text editor initially, instead of Eclipse.
- We won't get into details of Classpath here as it is a little bit more complicated, and we will do that in a later section.
- For now, we are interested only in finding out whether we need to modify the classpath or not.
- ![classpath-2](https://github.com/user-attachments/assets/ea1ae665-36e3-4add-9fff-c7bf80542a43)
- First thing we would do is check if there is a classpath among the list of environment variables.
- If it is not there, then we are good and there is nothing to do and we can move on.
- We can also move on if classpath is there, but it also includes a `.` as a separate path.
- It means that either you or somebody else has already added classpath.
- However, if classpath exists but, it does not include a `.`, then we need to insert one.
- `.` implies current directory.
- So, if we execute `java Hello`, then the Java interpreter would look at the classpath and the `.` in the classpath tells Java interpreter to look for `Hello.class` within the same directory where the Java command is being executed.
- Like we mentioned earlier, initially we will run our Java programs from command line before we switch to Eclipse and we will run those programs from the directory where those programs exist.
- So, `.` should be there in the classpath, and if it is not there, we need to insert one.
- Also, if there is no classpath then it is defaulted to current directory.
- So, Java interpreter would look for the program in the current directory.
- But, if classpath is there, then it overrides this default property and `.` needs to be present if Java interpreter has to search in the current directory.
- Go through the rest of the lesson to understand how to set the classpath.

### Writing First Java Program + Demo

- Let's now go ahead and write our first Java program.
- But, before doing that, let's take a quick look at the structure of a Java program.
- ![java-program-structure-1](https://github.com/user-attachments/assets/4aee1f91-de12-4340-9284-8b7abe607648)
- Java programs consist of classes.
- That is, when you write Java program, you write at least one class.
- From a class, we can create one or more objects.
- An object is a central concept in object-oriented programming (OOP), and we will look at object and OOP in the next section.
- For now, let's just look at what constitutes a class.
- What we see here (in the diagram above) are the elements or the program constructs in a class.
- We have variable declarations, constructors, methods, and nested classes.
- Variables, constructors, and methods will be introduced in the next section, while nested classes will be introduced towards the later part of the course.
- Typically, HelloWorld program is the first program that is written when we are learning a new programming language, and so let's do the same.
- That is, we will write a class called `HelloWorld`, and this class will have a single method which prints the text "Hello, World!".
- Let's look at the steps we are going to follow for this.
- ![first-java-program-1](https://github.com/user-attachments/assets/41a33891-b890-452f-8dba-3fa2ce6c946b)
  - We will first create this directory structure:
    - `javaindepth\src\com\semanticsquare\basics`
    - `javaindepth` is the root directory, and it contains other sub-directories, ending with the directory called `basics`.
    - The `HelloWorld` program we will write will go into the basics directory, and many of the Java programs we write in this course will be stored somewhere within the `javaindepth` directory.
    - For now, let's not worry about this directory structure, and it will be clear very soon.
  - Next we will write the `HelloWorld.java` in a text editor, and you can use any text editor like Notepad, it is upto you.
    - Note that we will use text editor for approximately only the first 20% of the course, and later we will switch to Eclipse, which is an IDE.
    - IDE stands for Integrated Development Environment i.e. it is an environment where a lot of development tools are integrated so that we can program effectively.
    - Eclipse is used by millions of professional developers, and it is much more productive to program using an IDE rather than using regular text editors.
    - The reason we are initially using a regular text editor is because, at least for those of you who are completely new to programming, it is important to actually compile and execute programs from the command line.
    - If we use an IDE like Eclipse, compilation happens automatically, and there are also many details an IDE hides.
    - So, if you start off with something like Eclipse, you may never know how things work behind the scenes.
    - So, we will use a regular text editor initially, and then switch over to Eclipse.
    - Now, when we do the switch over to Eclipse, you will also see how easy and productive it is to program using Eclipse.
    - There is also a very solid Eclipse tutorial that comes later, and it will teach you on how you can use Eclipse at a professional level.
    - It is a very nice tutorial but, if you are familiar with Eclipse, you can also use it right from this lesson itself.
    - Moreover, as with the text editors, you are free to use other IDEs like IntelliJ or NetBeans.
    - So, it need not be Eclipse.
  - Now, once we write our program, we will compile and run it.

#### HelloWorld Program

- Every class begins with the keyword `class`, which is a reserved keyword in Java.
- The keyword is followed by the name of the class, which is "HelloWorld" in our case.
- And every class has an opening and closing brace brackets.

```java
class HelloWorld {}
```

- So, this is the class declaration.
- Within our class, let's just have one method, and it is called `main` method.

```java
class HelloWorld {
  public static void main(String[] args) {}
}
```

- The main method also has the opening and closing braces.
- `main` is the name of the method.
- `String[] args` is the method parameter, we will look at that later, but it is an array of strings.
- Arrays and strings will be discussed later in the course.
- `void` is the method output. In this case it is called as `void` but, let's not worry about that for now.
- So, our `main` method has both, input and output.
- `public` and `static`, both of them are called as modifiers.
- `public` is called as an <ins>access modifier</ins>. There are other access modifiers too, but we will learn them later in the course.
- `static` is just a type of a method, and we will discuss that also later.
- Let's just have one single statement within this class, and it is going to print the string "Hello, World!".

```java
class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}
```

- Every statement ends with a semicolon. That is just how it is in Java.
- So, this is our `HelloWorld` program.
- Let's save it as `HelloWorld.java` in the basics folder.
- To compile and run it, we will go to the command prompt and cd into the relative directory.
- To compile we will use the `javac HelloWorld.java` command.
- Once compiled, the `HelloWorld.class` file has been generated in the same directory as the `HelloWorld.java` file.
- This `.class` file has the Java bytecodes.
- We know that this `.class` file can be executed on any platform, whether it is Linux or Mac or Windows - and that's the advantage of Java, which is platform independence.
- Let's just go ahead and execute it.
- For that, we use the Java interpreter: `java HelloWorld` (this is nothing but HelloWorld.class)
- So, when we hit enter, it is going to print the "Hello, World!" message.
- At this point we compiled and ran our first program.
- Now let's go back to our code.
- Note that the file name is `HelloWorld` and the class name is also `HelloWorld`; and it need not be same.
- So, if you want we can change it.
- But, you shouldn't do that.
- Typically, we all have the same name.
- The file name and class name are the same.
- Generally, we also have the `public` modifier in front of `class`, like so:

```java
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}
```

- But if you do that, then the compiler requires that both the file name and the class name are same. Otherwise, it will throw an error.
- We can also have more than one class in one particular file.
- Normally, you wouldn't do that but, for learning purposes, let's just do that here.

```java
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}

class GoodByeWorld {
  public static void main(String[] args) {
    System.out.println("GoodBye, World!");
  }
}
```

- Now we have two classes here in the same file, `HelloWorld`, and `GoodByeWorld`, and both of them have a `main` method and both of them are printing something.
- Now if you check your directory, it created two new class files viz HelloWord and GoodByeWorld.
- So, the compiler is going to scan this particular file and create separate class files for both of them.
- But generally, you will never have more than one class in a single file.
- There is something called nested classes where within one class you can have nested classes, you can have other classes nested within one class.
- We will see that later in the course, but normally, you wouldn't have a class externally, the way we have here.
- Probably if you want to do some quick prototyping or if you want to have multiple classes, you might do that, but generally, you will not do this.

#### Main Method

- Now, let's understand/discuss a little bit more about the `main()` method.
- ![main-method-1](https://github.com/user-attachments/assets/48eb9c54-0e04-4e0d-8d92-c92ff3f00ee8)
- If you want to run a class from the command line, you need to have a main method in that class.
- `main()` method is where your program starts running.
- That is, on executing `java HelloWorld`, JVM first loads the bytecodes that are associated with `HelloWorld.class` into the memory and then it invokes its `main()` method.
- `main()` method must be declared as `public`, `static`, and `void`.
- `public` keyword is required for JVM to invoke it, otherwise the program will compile but not execute.
- From the `main()` method, we typically invoke other classes that constitute the software, and those other classes need not have a `main()` method.
- So, it is just the class which is being executed from the command line must have a `main()` method.
- Program ends when the `main()` method ends.
- That's about it.

### Conclusion ~ Section 01

- This is the end of first section.
- And as we discussed several important concepts to get a good high-level understanding of what Java is and what the Java platform is, especially the Java platform.
- We discussed about platform independence, how Java achieves platform independence through JVM.
- We also discussed about Java SE and the JDK, and finally about Java SE release itself.
- Now, let's go ahead and do a quick recap of the most important points that we discussed.
- It is going to be a nice summary and a very good refresher.
- So, let's go ahead and get started.

#### Summary

- It started all with this:
- ![summary-1](https://github.com/user-attachments/assets/aaf7598d-d421-4c9f-a4b4-3268bdd8c84a)
- We said that Java was invented to work in a network environment consisting of heterogenous consumer devices that communicate with each other.
- Such an environment offered unique challenges, and one of them was platform independence.
- That's because software programs can be transmitted from one device to another, and when the programs are passed from one device to another, they need to execute without any issues on the target device, regardless of the target device's operating system and hardware architecture.
- So, platform independence is a very critical goal.
- There were some other challenges too, and here are some of them:
  - ![summary-2](https://github.com/user-attachments/assets/d3104c7d-d13c-46ae-950d-63f4b6253d08)
  - Security is critical as those downloaded programs should not cause any harm on the target device.
  - Similarly, multi-threading is another important oal.
  - And the language itself has to be familiar i.e. it needs to be similar to C and C++.
  - The language should also be simple to use. So, the programmers should not be manipulating memory as it can lead to all sorts fo issues.
  - So, simplicity is important and we need automatic memory management.
- So, these challenges demanded unique features which led to the birth of Java.
- And this cartoon character below is Duke and it is the official mascot of Java.
- ![summary-3](https://github.com/user-attachments/assets/251e4071-9543-4c79-892d-5b3b8d08da88)
- It is also seen in the \*7 prototype which was developed.
- ![summary-4](https://github.com/user-attachments/assets/577d84ce-f639-4152-a551-4fff1956eba8)
- And coffee mug is the official logo of Java.
- Here is how platform independence is achieved in Java:
- IMG
- First, our source code is compiled into Java bytecode, which is then executed by the Java interpreter, which is part of the JVM.
- Essentially, we are interpreting Java bytecode.
- So, in that sense, Java can be classified as an interpreted language.
- Now in general, an interpreter, interprets source code, but with Java it is the Java bytecode that is interpreted.
- So, JVM is an abstract computing machine, and Java bytecode would be the abstract machine language.
- ![summary-5](https://github.com/user-attachments/assets/84588eaa-154e-45d8-937b-841e55f35ddf)
- Here is another illustration showing traditional interpretation vs Java interpretation.
- ![summary-6](https://github.com/user-attachments/assets/d870498a-516f-4b14-ae81-aac41a98c9a4)
- This is just to emphasize that source code and Java bytecode are platform independent.
- Source code in the case of traditional interpretation and Java bytecode in the case of Java platform, while JVM and interpreter are platform dependent i.e. they are specific to the platform on which they are installed, and hence make it possible to achieve platform independence.
- That's possible because they maintain machine code instructions specific to that platform.
- So, when a JVM encounters a Java bytecode instruction, it would execute the corresponding machine code instructions from its library.
- Now, we know that with the compiled language we get fast execution speed but, platform independence is an issue. Like in the case of C++.
- ![summary-7](https://github.com/user-attachments/assets/698c47a7-3753-4e41-980e-c8221860763b)
- And with a pure interpreted language, we get the benefit of platform independence, but the execution speed is slower.
- ![summary-8](https://github.com/user-attachments/assets/a116a9d7-3708-4b5e-9b7d-d2d0ec7454c3)
- But with Java, we get the best of both worlds as we have a compilation step and also an interpretation step.
- ![summary-9](https://github.com/user-attachments/assets/dc3bb901-8a9c-45a7-a57d-6651e2b4e798)
- And unlike traditional interpretation, with Java we interpret compiled Java bytecode, which is much faster than interpreting source code.
- That's how we get fast execution.
- And that's possible because Java bytecode is specifically designed for JVM and it is already complied and also optimized.
- Not to forget, there is the JIT compilation at runtime, which is done by the JVM.
- ![summary-10](https://github.com/user-attachments/assets/262a8682-91ff-4ebc-b1ea-f454d6c264ea)
- So, JVM is the cornerstone of Java platform, and these are some of its core responsibilities.
- ![summary-11](https://github.com/user-attachments/assets/e9538ec1-553c-4002-b4b0-f2cf929b9aad)
- Interpreting Java bytecode gives the benefit of platform independence.
- JVM also ensures that security is not compromised when interpreting Java bytecode.
- Finally, JVM is also responsible for automatic memory management i.e. developers do not have to manipulate memory, and that's garbage collection and it will be discussed in detail.
- We next said that Java SE is a set of specifications like the Java Language Specification or JLS in short, Java Virtual Machine Specification and the Java Library Specification itself.
- And we have these several Java development kits which implement Java SE specification. These are from different vendors.
- ![summary-12](https://github.com/user-attachments/assets/8abf87da-0de2-4120-8458-ea6c77c3369f)
- JDK would include development tools like the Java compiler.
- In addition to that, it will also include the private JRE, which includes JVM and the Java library itself.
- So, everytime we download JDK to develop Java programs, we also get the JVM and the Java library.
- ![summary-13](https://github.com/user-attachments/assets/984ed914-6793-4442-8269-0a3fa8dbb45b)
- So, everytime we download JDK to develop Java programs, we also get the JVM and the Java library.
- Finally, Java is here to stay.
- That's because it is a very stable language and it is very scalable too.
- It can scale to millions of users and stability comes from the fact that there is rigorous formal process to introduce every new feature in each release.
- This process is the Java Community Process (JCP), which is the formal mechanism for developing Java specifications.
- ![summary-14](https://github.com/user-attachments/assets/62fe084b-0b5e-4864-929d-e0b59896c57f)
- We said that every Java release has an associated Umbrella JSR, where JSR stands for Java Specification Request.
- This umbrella JSR gives a high-level overview of the Java release itself i.e. what features it includes.
- And the umbrella JSR goes through a formal strict approval process by an expert group.
- So, it is a multi-state process, and finally it needs to be approved.
- And any new feature that is introduced through JSR will also have to pass some associated tests.
- ![summary-15](https://github.com/user-attachments/assets/85bdbd49-8a8a-48ae-8a14-a0c7e11edcab)
- Such a rigorous process involving experts is what makes Java really rock solid.
- Every single feature is well thought out.
- Now, JCP doesn't mean that Java is not innovating.
- This formal, rigorous process doesn't mean that Java is not innovating.
- A new Java version is released every 6 months with new features, and hence the language is constantly evolving.
- Finally, there is the incredible JVM, the super sophisticated virtual machine, which is also constantly improved.
- ![summary-16](https://github.com/user-attachments/assets/b31b993d-f8ff-4f75-a37e-697ff4db7854)
- There are three things that you should remember when it comes to JVM.
- First thing is that it helps achieve platform independence through interpretation.
- Then, it provides automatic memory management through garbage collection, and finally, it helps Java programs run very fast because it performs JIT compilation at runtime.
- So, at least those are three things that you should remember as they are unique features of Java.
- And these benefits make Java a truly popular language when it comes to implementing complex enterprise software.
- And all of the large companies like MAANG, all of them use Java.
- And even in the banking section, it is very heavily used, and that's because Java is a very stable and scalable language.
- So, it is a great tool.
- So, let's go ahead and master this tool so that we can also develop really complex and well designed software.
- Let's learn it really well so that we don't have to come back in future and re-learn it.
- Let's do it well the very first time.

### Quiz

### Important Q&A Discussions

#### Can you please specify which programming languages are compiled to another programming languages? (Related to lesson on Compilation)

- [ClojureScript](https://clojurescript.org) is one such language (a slight variant of Clojure) and it comes with a compiler that compiles its programs into JavaScript.
- It looks like there are not many tools that do such translations.
- Such compilers are also referred to as source-to-source compilers or transcompilers.
- Also FYI, Clojure is also a language, whose programs once compiled run on JVM ~ the platform on which Java programs run and is covered in detail in this course.
- Web containers like Tomcat also convert JSPs code into Servlet source code before compiling them into class file.
- Since we are learning about Java in this course, you may not be aware of JSPs & Servlets, which fall under Java EE.
- But, just keep in mind that there is source code to source code translation happening (from JSP to Servlet).
- But, Web container like Tomcat is not a compiler.
- It is more of a Web server, but can do some code translation + compiling translated code.
- P.S. We discuss JSPs & Servlets briefly towards the end of the course in a separate section.

#### Why a single file cannot have more than one public class?

- `public` is a keyword that comes into play when we are dealing with the concept of package, which is introduced later in section 05.
- Don't worry if this answer is confusing as package concept is not yet discussed and you can revisit this answer later once you learn about packages.
- But, here is some explanation, which may be helpful.
- packages help in organizing classes in a meaningful way.
- Classes in one package share some common properties.
- For e.g., classes in java.io package are related to doing some input-output operation like reading from a file.
- Think of them as directories on file system (e.g., songs directory hold songs).
- When classes are declared as `public`, it means they are accessible to classes in other packages so that their functionality can be used.
- Now, let's see what problem we may have when a single file can have two public classes, which is not allowed in Java.
- Let's assume we have two public classes Y & Z in a file named Y.java in package p1.
- Let's also assume a class X in a different package p2 is using the class Z that is inside Y.java (in package p1).
- Now, when we compile X, the compiler first tries to locate Z.class in package p1 and if it cannot find it, then it tries to locate Z.java in package p1 so that it can compile it automatically.
- But, since we only have Y.java, the class Z cannot be located and hence we get a compilation error saying that class Z could not be found.
- So, for this to work we need to place the public class Z in its own file Z.java.
- So, a single file can have only one public class.
- Also, note that if class Z was not public, then it cannot even be accessed by class X in package p2.

## Author

- [@bhoamikhona](https://github.com/bhoamikhona)
