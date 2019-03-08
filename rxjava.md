


```
    // 支持 rxjava
    compile 'io.reactivex:rxjava:1.1.5'
    compile 'io.reactivex:rxandroid:1.2.0'
```
https://github.com/ReactiveX/RxJava

https://github.com/ReactiveX/RxAndroid



# 解决rxjava内存泄漏

[Android架构中添加AutoDispose解决RxJava内存泄漏,rxlifecycle缺点](https://blog.csdn.net/mq2553299/article/details/79418068)

```
//解决rxjava内存泄漏
    implementation 'com.trello.rxlifecycle2:rxlifecycle:2.2.2'
    // If you want to bind to Android-specific lifecycles
    implementation 'com.trello.rxlifecycle2:rxlifecycle-android:2.2.2'
    // If you want pre-written Activities and Fragments you can subclass as providers
    implementation 'com.trello.rxlifecycle2:rxlifecycle-components:2.2.2'
    // If you want pre-written support preference Fragments you can subclass as providers
    implementation 'com.trello.rxlifecycle2:rxlifecycle-components-preference:2.2.2'
    // If you want to use Navi for providers
    implementation 'com.trello.rxlifecycle2:rxlifecycle-navi:2.2.2'
    // If you want to use Android Lifecycle for providers
    implementation 'com.trello.rxlifecycle2:rxlifecycle-android-lifecycle:2.2.2'
    // If you want to use Kotlin syntax
    implementation 'com.trello.rxlifecycle2:rxlifecycle-kotlin:2.2.2'
    // If you want to use Kotlin syntax with Android Lifecycle
    implementation 'com.trello.rxlifecycle2:rxlifecycle-android-lifecycle-kotlin:2.2.2'
//6.1K
```
https://github.com/trello/RxLifecycle




```
implementation 'com.uber.autodispose:autodispose:x.y.z'
//1.9K
```
https://github.com/uber/AutoDispose



# rxjava

android rxjava
https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=1&tn=baidu&wd=android%20rxjava&oq=android%2520rxandroid%252Bretrofit%252Bmvp%252Bdagger2&rsv_pq=ed17c1140000aa17&rsv_t=6bd73E0rJ%2BWSKFsadeB7VqXY83kNmEFD2w9UqPoAWbjDDNoTBpkyTdIlI1g&rqlang=cn&rsv_enter=1&inputT=3346&rsv_sug3=26&rsv_sug1=26&rsv_sug7=100&rsv_sug2=0&rsv_sug4=7185

https://www.jianshu.com/c/299d0a51fdd4

[THEONE10211024/RxJavaSamples](https://github.com/THEONE10211024/RxJavaSamples)

[这可能是最好的RxJava 2.x 教程](https://www.cnblogs.com/liushilin/tag/rxjava/)

[RxJava2 Examples —— 这可能是从 RxJava1 跳到 RxJava2（学习 RxJava2 ）最好的例子 Demo](https://github.com/nanchen2251/RxJava2Examples)

[RxJavaApp 教程app](https://github.com/jiang111/RxDocs)




### 观察者
```
public interface Observer<T> {
    void onSubscribe(@NonNull Disposable d);
    void onNext(@NonNull T t);
    void onError(@NonNull Throwable e);
    void onComplete();
}

//只观察结果
public interface Consumer<T> {
    void accept(T t) throws Exception;
}
```

### 被观察者

```
public interface ObservableSource<T> {
    void subscribe(@NonNull Observer<? super T> observer);
}

public abstract class Observable<T> implements ObservableSource<T> {...}

```

```
public interface Publisher<T> {
    public void subscribe(Subscriber<? super T> s);
}

//支持背压
public abstract class Flowable<T> implements Publisher<T> {...}

```


### 兼具观察者+被观察者
```
public abstract class Subject<T> extends Observable<T> implements Observer<T> {
   
    public abstract boolean hasObservers();
    public abstract boolean hasThrowable();
    public abstract boolean hasComplete();
	
    @Nullable
    public abstract Throwable getThrowable();
	
	//线程安全
    @NonNull
    public final Subject<T> toSerialized() {
        if (this instanceof SerializedSubject) {
            return this;
        }
        return new SerializedSubject<T>(this);
    }
}

```
Subject 有两种用途：

做为observable向其他的observable发送事件
做为observer接收其他的observable发送的事件。

Subject 可以同时代表 Observer 和 Observable，允许从数据源中多次发送结果给多个观察者。

除了 onSubscribe(), onNext(), onError() 和 onComplete() 之外，所有的方法都是线程安全的。此外，你还可以使用 toSerialized() 方法，也就是转换成串行的，将这些方法设置成线程安全的。

Subject 的toSerialized()，就是用来保证 onNext() 等方法的线程安全性。

```
public final class PublishSubject<T> extends Subject<T> {...}

```

在 RxJava2 ，Subject 有几个默认的实现，下面我们对它们之间的区别做简单的说明：

> AsyncSubject:
只有当 Subject 调用 onComplete 方法时，才会将 Subject 中的最后一个事件传递给所有的 Observer。

> BehaviorSubject:
该类有创建时需要一个默认参数，该默认参数会在 Subject 未发送过其他的事件时，向注册的 Observer 发送；新注册的 Observer 不会收到之前发送的事件，这点和 PublishSubject 一致。

> PublishSubject:
不会改变事件的发送顺序；在已经发送了一部分事件之后注册的 Observer 不会收到之前发送的事件。

> ReplaySubject:
无论什么时候注册 Observer 都可以接收到任何时候通过该 Observable 发射的事件。

> UnicastSubject:
只允许一个 Observer 进行监听，在该 Observer 注册之前会将发射的所有的事件放进一个队列中，并在 Observer 注册的时候一起通知给它。

对比 PublishSubject 和 ReplaySubject，它们的区别在于新注册的 Observer 是否能够收到在它注册之前发送的事件。这个类似于 EventBus 中的 StickyEvent 即黏性事件


[RxBus学习之旅－－从入门到提高](https://www.jianshu.com/p/f43903b28cc2)

[[深入RxBus]：支持Sticky事件](https://www.jianshu.com/p/71ab00a2677b)

[[深入RxBus]：异常处理](https://www.jianshu.com/p/0493cc28a811)

[RxBus 简单使用学习](https://blog.csdn.net/senkai123/article/details/78202217)








