
[github搜索排名](https://github.com/trending)

[Android 开源项目](https://github.com/Trinea/android-open-project#%E7%AC%AC%E4%B8%89%E9%83%A8%E5%88%86-%E4%BC%98%E7%A7%80%E9%A1%B9%E7%9B%AE)

[Android 开源组件和第三方库汇总](https://blog.csdn.net/renjianhhong/article/details/51798874)

[优秀的控件UI库](https://github.com/wasabeef/awesome-android-ui)

[优秀的Android资源收集与整理](https://github.com/AlanCheen/Android-Resources)

# 六个可以让代码变得更整洁的 Android 库

1.butterknife

2.icepick

3.Dart 和Henson

4.Parceler

5.Timber

6.Dagger和Dagger2


# 大神的GitHub


[JessYan](https://github.com/JessYanCoding)

[jeasonlzy](https://github.com/jeasonlzy)

[鸿洋：hongyangAndroid](https://github.com/hongyangAndroid)

[扔物线：rengwuxian](https://github.com/rengwuxian)

[代码家：daimajia](https://github.com/daimajia)

# 快速开发框架

[TommyLemon/Android-ZBLibrary](https://github.com/TommyLemon/Android-ZBLibrary) //2.8K

[jiangqqlmj/FastDev4Android](https://github.com/jiangqqlmj/FastDev4Android)     //2.6K

# 优秀项目

[优秀项目](https://github.com/Ablexq/MyAsDependency/blob/master/%E4%BC%98%E7%A7%80%E9%A1%B9%E7%9B%AE.md)

# 网络相关

[网络相关](https://github.com/Ablexq/MyAsDependency/blob/master/%E7%BD%91%E7%BB%9C%E7%9B%B8%E5%85%B3.md)

# 优秀的库

#### <font color="#ff0000">基础</font>

```
//---------------------------------------基础------------------------------------------------

    compile 'com.android.support:appcompat-v7:25.3.1'
    compile 'com.android.support:support-v4:25.3.1'
    compile 'com.android.support:recyclerview-v7:25.3.1'
    compile 'com.android.support:design:25.3.1'
    compile 'com.android.support:cardview-v7:25.3.1'
    compile 'com.android.support:support-vector-drawable:25.3.1'
    compile 'com.android.support:palette-v7:25.3.1'
    compile 'com.android.support:percent:25.3.1'
    compile 'com.android.support:support-annotations:25.3.1'
    //分包
    compile 'com.android.support:multidex:1.0.1'
```



#### <font color=#ff0000>activity状态保存</font>


```
//icepick:避免在Activity恢复时重新设置状态的麻烦
  compile 'frankiesardo:icepick:3.2.0'
  provided 'frankiesardo:icepick-processor:3.2.0'
//3.7K
```
https://github.com/frankiesardo/icepick 


#### <font color="#ff0000">activity侧滑返回</font>

```
//activity侧滑返回
    compile 'cn.bingoogolapple:bga-swipebacklayout:1.1.9'
//1.4K
```
https://github.com/bingoogolapple/BGASwipeBackLayout-Android    


#### <font color="#ff0000">fragment管理</font>

```
//fragment管理
    compile 'me.yokeyword:fragmentation:1.3.6'
//7.2K
```
https://github.com/YoKeyword/Fragmentation  

#### <font color="#ff0000">事件总线</font>


```

//-------------------------------------事件总线-----------------------------------------
//事件总线框架, 它简化了Activity、Fragment、Service等组件之间的交互，
//很大程度上降低了它们之间的耦合，使得我们的代码更加简洁，耦合性更低，提升我们的代码质量。
    compile 'org.greenrobot:eventbus:3.1.1'
//19.2K
```
https://github.com/greenrobot/EventBus      

```
//
    implementation 'com.squareup:otto:1.3.8'
//5.1K
```
https://github.com/square/otto      

```
	compile 'org.simple:androideventbus:1.0.5.1'
//1.4K (停止维护)
```
https://github.com/hehonghui/AndroidEventBus    

```
    compile 'com.hwangjr.rxbus:rxbus:1.0.6'
//1.7K
```
https://github.com/AndroidKnife/RxBus

#### <font color="#ff0000">组件传递数据</font>
```

//Extra是Android标准的组件之间（Activity/Fragment/Service等）传递数据的方式。Dart的使用，它优雅的处理了组件间跳转和数据传递
    implementation 'com.f2prateek.dart:dart-annotations:3.0.1'
    implementation 'com.f2prateek.dart:dart:3.0.1'
    implementation 'com.f2prateek.dart:henson:3.0.1'
    annotationProcessor 'com.f2prateek.dart:dart-processor:3.0.1'
    annotationProcessor 'com.f2prateek.dart:henson-processor:3.0.1'
//1.1K
```
https://github.com/f2prateek/dart       

#### <font color="#ff0000">二维码扫描</font>

```
//二维码扫描
    implementation 'cn.bingoogolapple:bga-qrcode-zxing:1.2.5'
    implementation 'cn.bingoogolapple:bga-qrcode-zbar:1.2.5'
//4.3K
```
https://github.com/bingoogolapple/BGAQRCode-Android     

```
//Google提供二维码扫描
    compile 'com.google.zxing:core:3.3.0'   
//19.9K
```
https://github.com/zxing/zxing      


```
//xuyisheng/ZXingLib
//362
```
https://github.com/xuyisheng/ZXingLib     

#### <font color="#ff0000">View注入框架</font>

```

//--------------------------------View注入框架-------------------------------------
//butterknife:避免在代码里写大量的findViewById
    implementation 'com.jakewharton:butterknife:8.8.1'
    annotationProcessor 'com.jakewharton:butterknife-compiler:8.8.1'
22.0K
```
https://github.com/JakeWharton/butterknife      


```
//依赖注入是面向对象编程的一种设计模式，其目的是为了降低程序耦合，这个耦合就是类之间的依赖引起的.
    compile"com.google.dagger:dagger:2.14.1"
    annotationProcessor"com.google.dagger:dagger-compiler:2.14.1"
//11.8K
```
https://github.com/google/dagger    



#### <font color="#ff0000">工具类</font>

```
//工具类
    implementation 'com.blankj:utilcode:1.20.3'
//19.9K
```
https://github.com/Blankj/AndroidUtilCode/blob/master/utilcode/README-CN.md     
https://github.com/Blankj/AndroidUtilCode/blob/master/subutil/README-CN.md


#### <font color="#ff0000">google推送</font>

```
//firebase的功能包括推送通知，云存储，活动监视，远程部署,Google推出的一个云端服务，使用免费但须翻墙
    compile 'com.google.firebase:firebase-core:9.0.2'
```

#### <font color="#ff0000">序列化</font>

```
//Parceler 是一个代码代码生成器包，用于生成Android Parcelable 模板代码。
    compile 'org.parceler:parceler-api:1.1.11'
    annotationProcessor 'org.parceler:parceler:1.1.11'
//3.3K
```
https://github.com/johncarl81/parceler      


#### <font color="#ff0000">java解析HTML</font>

```
//jsoup
    compile 'org.jsoup:jsoup:1.11.3'
```
https://jsoup.org/download  
http://www.open-open.com/jsoup/     使用文档



#### <font color="#ff0000">日志</font>


```
    implementation 'com.orhanobut:logger:2.2.0'
//9.8K
```
https://github.com/orhanobut/logger     

```
    implementation 'com.jakewharton.timber:timber:4.7.1'
//6.0K
```
https://github.com/JakeWharton/timber       


#### <font color="#ff0000">状态栏</font>

```
//状态栏
    compile 'com.jaeger.statusbarutil:library:1.5.1'
//6.1K
```
https://github.com/laobie/StatusBarUtil     

```
//systembartint
    compile 'com.readystatesoftware.systembartint:systembartint:1.0.3'
//5.0K
```
https://github.com/jgilfelt/SystemBarTint       


#### <font color="#ff0000">调试</font>

```
//stetho
    compile 'com.facebook.stetho:stetho-okhttp3:1.5.0'
    compile 'com.facebook.stetho:stetho-urlconnection:1.5.0'
    compile 'com.facebook.stetho:stetho-js-rhino:1.5.0'
//10.2K    
```    
https://github.com/facebook/stetho      

```
//blockcanary：卡顿检测
    compile 'com.github.markzhai:blockcanary-android:1.5.0'
//4.4K
```
https://github.com/markzhai/AndroidPerformanceMonitor   

```
//blockcanary改进版
    debugCompile 'com.letv.sarrsdesktop:BlockCanaryExJRT:0.9.9.4'
    releaseCompile 'com.letv.sarrsdesktop:BlockCanaryExJRTNoOp:0.9.9.4'
    testCompile 'com.letv.sarrsdesktop:BlockCanaryExJRTNoOp:0.9.9.4'
//1.8K    
```
https://github.com/seiginonakama/BlockCanaryEx  

```
//leakcanary：内存泄漏检测
    debugImplementation 'com.squareup.leakcanary:leakcanary-android:1.6.1'
    releaseImplementation 'com.squareup.leakcanary:leakcanary-android-no-op:1.6.1'
    // Optional, if you use support library fragments:
    debugImplementation 'com.squareup.leakcanary:leakcanary-support-fragment:1.6.1'
//20.5K
```
https://github.com/square/leakcanary    


```
//蒲公英是应用托管平台，有内测 + 分发 + 更新 + Crash上报 + 反馈 + Bug云管理 + 专家测试 + iso加速审核等功能
    compile 'com.pgyersdk:sdk:2.8.1'
```
https://www.pgyer.com/doc/view/sdk_android_guide
