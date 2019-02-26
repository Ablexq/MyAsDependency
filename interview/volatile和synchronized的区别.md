
[全面理解Java内存模型](https://blog.csdn.net/suifeng3051/article/details/52611310)

[线程之间的通信（thread signal）](https://blog.csdn.net/suifeng3051/article/details/51863010)

[什么是线程安全](https://blog.csdn.net/suifeng3051/article/details/52164267)

[数据库、锁、事务等概念](https://blog.csdn.net/sinat_31057219/article/details/86706227)

# 并发编程中的三个概念


1.原子性：即一个操作或者多个操作 要么全部执行并且执行的过程不会被任何因素打断，要么就都不执行。

2.可见性：指当多个线程访问同一个变量时，一个线程修改了这个变量的值，其他线程能够立即看得到修改的值。

3.有序性：即程序执行的顺序按照代码的先后顺序执行。



# volatile和synchronized特点

首先需要理解线程安全的两个方面：【执行控制】和【内存可见】。

执行控制的目的是控制代码执行（顺序）及是否可以并发执行。

内存可见控制的是线程执行结果在内存中对其它线程的可见性。根据Java内存模型的实现，线程在具体执行时，会先拷贝主存数据到线程本地（CPU缓存），操作完成后再把结果从线程本地刷到主存。

synchronized关键字解决的是执行控制的问题，它会阻止其它线程获取当前对象的监控锁，这样就使得当前对象中被synchronized关键字保护的代码块无法被其它线程访问，也就无法并发执行。更重要的是，synchronized还会创建一个内存屏障，内存屏障指令保证了所有CPU操作结果都会直接刷到主存中，从而保证了操作的内存可见性，同时也使得先获得这个锁的线程的所有操作，都happens-before于随后获得这个锁的线程的操作。

volatile关键字解决的是内存可见性的问题，会使得所有对volatile变量的读写都会直接刷到主存，即保证了变量的可见性。这样就能满足一些对变量可见性有要求而对读取顺序没有要求的需求。

使用volatile关键字仅能实现对原始变量(如boolen、 short 、int 、long等)操作的原子性，但需要特别注意， volatile不能保证复合操作的原子性，即使只是i++，实际上也是由多个原子操作组成：read i; inc; write i，假如多个线程同时执行i++，volatile只能保证他们操作的i是同一块内存，但依然可能出现写入脏数据的情况。

在Java 5提供了原子数据类型atomic wrapper classes，对它们的increase之类的操作都是原子操作，不需要使用sychronized关键字。

对于volatile关键字，当且仅当满足以下所有条件时可使用：

1. 对变量的写入操作不依赖变量的当前值，或者你能确保只有单个线程更新变量的值。

2. 该变量没有包含在具有其他变量的不变式中。

# volatile和synchronized的区别

在多线程并发编程中synchronized和Volatile都扮演着重要的角色，Volatile是轻量级的synchronized，它在多处理器开发中保证了共享变量的“可见性”。

可见性的意思是当一个线程修改一个共享变量时，另外一个线程能读到这个修改的值。它在某些情况下比synchronized的开销更小。


> volatile本质是在告诉jvm当前变量在寄存器（工作内存）中的值是不确定的，需要从主存中读取； synchronized则是锁定当前变量，只有当前线程可以访问该变量，其他线程被阻塞住。

> volatile仅能使用在变量级别；synchronized则可以使用在变量、方法、和类级别的

> volatile仅能实现变量的修改可见性，不能保证原子性；而synchronized则可以保证变量的修改可见性和原子性

> volatile不会造成线程的阻塞；synchronized可能会造成线程的阻塞。

> volatile标记的变量不会被编译器优化；synchronized标记的变量可以被编译器优化


