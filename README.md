

基础
===

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

网络
===

```
//---------------------------------------网络------------------------------------------
    // 支持 retrofit
    compile 'com.squareup.retrofit2:retrofit:2.1.0'
//      https://github.com/square/retrofit
    // 衔接 retrofit + rxjava
    compile 'com.squareup.retrofit2:adapter-rxjava:2.1.0'
//      https://github.com/square/retrofit/tree/master/retrofit-adapters
    // 支持 Gson 解析
    compile 'com.squareup.retrofit2:converter-gson:2.1.0'
//      https://github.com/square/retrofit/tree/master/retrofit-converters

    // 支持 rxjava
    compile 'io.reactivex:rxjava:1.1.5'
//      https://github.com/ReactiveX/RxJava
    compile 'io.reactivex:rxandroid:1.2.0'
//      https://github.com/ReactiveX/RxAndroid

    //gson解析
    compile 'com.google.code.gson:gson:2.8.5'
//      https://github.com/google/gson

    // okhttp
    def OK_HTTP_VERSION = "3.4.1"
    compile "com.squareup.okhttp3:okhttp:${OK_HTTP_VERSION}"
    compile "com.squareup.okhttp3:okhttp-urlconnection:${OK_HTTP_VERSION}"
    compile "com.squareup.okhttp3:logging-interceptor:${OK_HTTP_VERSION}"
//      https://github.com/square/okhttp        //28.7K

//OkHttp3 基于SharedPreferences持久化CookieJar
    compile 'com.github.franmontiel:PersistentCookieJar:v1.0.1'
//      https://github.com/franmontiel/PersistentCookieJar      //1.1K

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
//      https://github.com/trello/RxLifecycle   //6.1K

```

动态权限
===

```

//------------------------------------动态权限-------------------------------------------
//https://blog.csdn.net/totond/article/details/73648103 以下三者对比

//permissionsdispatcher
    compile "com.github.hotchemi:permissionsdispatcher:4.0.0-alpha1"
    annotationProcessor "com.github.hotchemi:permissionsdispatcher-processor:4.0.0-alpha1"
//      https://github.com/permissions-dispatcher/PermissionsDispatcher     //7.9K

//基于RxJava的RxPermissions：需要添加rxjava、rxandroid
    compile 'com.github.tbruyelle:rxpermissions:0.10.2'
//      https://github.com/tbruyelle/RxPermissions      //7.0K

//easypermissions
    compile 'pub.devrel:easypermissions:1.3.0'
//      https://github.com/googlesamples/easypermissions     //6.3K

//AndPermission
    compile 'com.yanzhenjie:permission:2.0.0-rc12'
//      https://github.com/yanzhenjie/AndPermission  //4.5K

```

图片
===

```

    /*----------------------------------- 图片 ------------------------------------*/
//fresco
    def FRESCO_VERSION = "1.10.0"
    //fresco必加
    compile "com.facebook.fresco:fresco:${FRESCO_VERSION}"
    // 在 API < 14 上的机器支持 WebP 时，需要添加（按需添加）
    compile "com.facebook.fresco:animated-base-support:${FRESCO_VERSION}"
    // 支持 GIF 动图，需要添加（按需添加）
    compile "com.facebook.fresco:animated-gif:${FRESCO_VERSION}"
    // 支持 WebP （静态图+动图），需要添加（按需添加）
    compile "com.facebook.fresco:animated-webp:${FRESCO_VERSION}"
    compile "com.facebook.fresco:webpsupport:${FRESCO_VERSION}"
    // 仅支持 WebP 静态图，需要添加（按需添加）
    compile "com.facebook.fresco:webpsupport:${FRESCO_VERSION}"
//      https://github.com/facebook/fresco      //14.9K

//Picasso----
    implementation 'com.squareup.picasso:picasso:2.71828'
//      https://github.com/square/picasso       //15.9K

//为picasso提供多种图片转换
    compile 'jp.wasabeef:picasso-transformations:2.2.1'
    // If you want to use the GPU Filters
    compile 'jp.co.cyberagent.android.gpuimage:gpuimage-library:1.4.1'
//      https://github.com/wasabeef/picasso-transformations    //1.4K    

//glide----
    implementation('com.github.bumptech.glide:glide:4.5.0') {
        exclude group: "com.android.support"
    }
    //使用okhttp加载图片
    compile 'com.github.bumptech.glide:okhttp3-integration:4.5.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.5.0'
//      https://github.com/bumptech/glide       //23.2K

//为glide提供多种图片转换
    implementation 'jp.wasabeef:glide-transformations:3.3.0'
    // If you want to use the GPU Filters
    implementation 'jp.co.cyberagent.android.gpuimage:gpuimage-library:1.4.1'
//      https://github.com/wasabeef/glide-transformations       //6.7K

//圆形图片
    compile 'de.hdodenhof:circleimageview:2.2.0'
//      https://github.com/hdodenhof/CircleImageView        //10.4K

//手势图片
    compile 'com.github.chrisbanes:PhotoView:2.1.4'
//      https://github.com/chrisbanes/PhotoView     //13.8K

//仿微信选图
    compile 'me.iwf.photopicker:PhotoPicker:0.9.12@aar'
//      https://github.com/donglua/PhotoPicker      //2.6K

//自定义相册，实现了拍照、图片选择（单选/多选）、裁剪等
    compile 'com.github.YancyYe:GalleryPick:1.2.1'
//      https://github.com/YancyYe/GalleryPick

//图片压缩框架
    implementation 'com.zxy.android:tiny:0.1.0'
//      https://github.com/Sunzxyong/Tiny       //2.0K

//裁剪图片
    compile 'com.soundcloud.android:android-crop:1.0.1@aar'
//      https://github.com/jdamcd/android-crop  //4.1K

//用于在Android设备上获取照片（拍照或从相册、文件中选择）、裁剪图片、压缩图片的开源工具库
    compile 'com.jph.takephoto:takephoto_library:4.1.0'
//      https://github.com/crazycodeboy/TakePhoto   //5.5K

//完全仿微信的图片选择，并且提供了多种图片加载接口，选择图片后可以旋转，可以裁剪成矩形或圆形，可以配置各种其他的参数
	compile 'com.lzy.widget:imagepicker:0.6.1'  //指定版本
//      https://github.com/jeasonlzy/ImagePicker    //3.2K
```

数据库
===

```

// ---------------------------------------数据库------------------------------------
    compile 'org.greenrobot:greendao:3.2.2' // add library
    compile 'org.greenrobot:greendao-generator:3.2.0'
//      https://github.com/greenrobot/greenDAO      //10.4K

```

事件传递
===

```

//-------------------------------------事件传递-----------------------------------------
    compile 'org.greenrobot:eventbus:3.1.1'
//      https://github.com/greenrobot/EventBus      //19.2K

```

组件传递数据
===
```

//Extra是Android标准的组件之间（Activity/Fragment/Service等）传递数据的方式。Dart的使用，它优雅的处理了组件间跳转和数据传递
    implementation 'com.f2prateek.dart:dart-annotations:3.0.1'
    implementation 'com.f2prateek.dart:dart:3.0.1'
    implementation 'com.f2prateek.dart:henson:3.0.1'
    annotationProcessor 'com.f2prateek.dart:dart-processor:3.0.1'
    annotationProcessor 'com.f2prateek.dart:henson-processor:3.0.1'
//      https://github.com/f2prateek/dart       //1.1K
```


日志
===

```

//----------------------------------------日志库-------------------------------------
    implementation 'com.orhanobut:logger:2.2.0'
//      https://github.com/orhanobut/logger     9.8K


//
    implementation 'com.jakewharton.timber:timber:4.7.1'
//      https://github.com/JakeWharton/timber       //6.0K

```
视频播放
===

```

//--------------------------------------视频播放------------------------------------
    compile 'cn.jzvd:jiaozivideoplayer:6.3.1'
//      https://github.com/lipangit/JiaoZiVideoPlayer   //7.6K

//基于IJKPlayer的多功能视频播放器
    implementation 'com.shuyu:GSYVideoPlayer:6.0.0-beta'
//      https://github.com/CarGuo/GSYVideoPlayer        //7.3K


```

View注入框架
===
```

//--------------------------------View注入框架-------------------------------------
//butterknife:避免在代码里写大量的findViewById
    implementation 'com.jakewharton:butterknife:8.8.1'
    annotationProcessor 'com.jakewharton:butterknife-compiler:8.8.1'
//      https://github.com/JakeWharton/butterknife      22.0K

```
依赖注入
===
```
//依赖注入是面向对象编程的一种设计模式，其目的是为了降低程序耦合，这个耦合就是类之间的依赖引起的.
    compile"com.google.dagger:dagger:2.14.1"
    annotationProcessor"com.google.dagger:dagger-compiler:2.14.1"
//      https://github.com/google/dagger    //11.8K
```



选择器
===
```
    /*--------------------------------选择器--------------------------------------*/
//选择器：时间选择器、省市区三级联动等
    compile 'com.contrarywind:Android-PickerView:4.1.6'
//      https://github.com/Bigkoo/Android-PickerView    8.2K

//滚轮、文件、颜色选择器
    compile('com.github.gzu-liyujiang.AndroidPicker:WheelPicker:1.5.6') {
        exclude group: 'com.android.support'
    }
    compile('com.github.gzu-liyujiang.AndroidPicker:FilePicker:1.5.6') {
        exclude group: 'com.android.support'
    }
    compile('com.github.gzu-liyujiang.AndroidPicker:ColorPicker:1.5.6') {
        exclude group: 'com.android.support'
    }
//      https://github.com/gzu-liyujiang/AndroidPicker  //3.9K


```
控件
===
```
    /*------------------------------- 控件 ---------------------------------------*/
//RecyclerView的辅助适配器
    compile 'com.github.CymChad:BaseRecyclerViewAdapterHelper:2.9.34'
//      https://github.com/CymChad/BaseRecyclerViewAdapterHelper    //14.9K

//RecyclerView下拉刷新和上拉加载更多以及RecyclerView线性、网格、瀑布流效果演示
    compile 'com.wuxiaolong.pullloadmorerecyclerview:library:1.1.2'
//      https://github.com/WuXiaolong/PullLoadMoreRecyclerView      //1.2K

//RecyclerView侧滑菜单，Item拖拽，滑动删除Item，自动加载更多，HeaderView，FooterView，Item分组黏贴。
    compile 'com.yanzhenjie:recyclerview-swipe:1.1.4'
//      https://github.com/yanzhenjie/SwipeRecyclerView     //3.4K

//RecyclerView侧滑
    compile 'com.github.AItsuki:SwipeMenuRecyclerView:1.1.3'
//      https://github.com/AItsuki/SwipeMenuRecyclerView    //125

//listview、GridView、RecyclerView侧滑
    compile "com.daimajia.swipelayout:library:1.2.0@aar"
//      https://github.com/daimajia/AndroidSwipeLayout      //10.5K

//任意view下拉刷新
    compile 'in.srain.cube:ultra-ptr:1.0.11'
//      https://github.com/liaohuqiu/android-Ultra-Pull-To-Refresh      //9.2K

//材料设计的dialog
    implementation 'com.afollestad.material-dialogs:core:2.0.0-alpha09'
//      https://github.com/afollestad/material-dialogs      //14.2K

//多种下拉刷新效果、上拉加载更多、可配置自定义头部广告位
    implementation 'cn.bingoogolapple:bga-refreshlayout:1.1.8'
//      https://github.com/bingoogolapple/BGARefreshLayout-Android  //3.7K


//兼容动画
  compile 'com.nineoldandroids:library:2.4.0'
//      https://github.com/JakeWharton/NineOldAndroids  //4.4K


//loading动画
   compile 'com.wang.avi:library:2.1.3'
//      https://github.com/81813780/AVLoadingIndicatorView  //7.8K


//滑动开关按钮
   	implementation 'com.kyleduo.switchbutton:library:2.0.0'
//      https://github.com/kyleduo/SwitchButton     //3.7K


//选择城市，选择联系人等需要索引的功能
    compile 'me.yokeyword:indexablerecyclerview:1.3.0'
//      https://github.com/YoKeyword/IndexableRecyclerView      //975


//日历
  implementation 'com.github.prolificinteractive:material-calendarview:2.0.0'
//      https://github.com/prolificinteractive/material-calendarview    //4.5K
```
二维码扫描
===
```
//二维码扫描
    implementation 'cn.bingoogolapple:bga-qrcode-zxing:1.2.5'
    implementation 'cn.bingoogolapple:bga-qrcode-zbar:1.2.5'
//      https://github.com/bingoogolapple/BGAQRCode-Android     //4.3K

//Google提供二维码扫描
    compile 'com.google.zxing:core:3.3.0'   
//      https://github.com/zxing/zxing      //19.9K

//xuyisheng/ZXingLib
//https://github.com/xuyisheng/ZXingLib     //362
```
activity侧滑返回
===
```
//activity侧滑返回
    compile 'cn.bingoogolapple:bga-swipebacklayout:1.1.9'
//      https://github.com/bingoogolapple/BGASwipeBackLayout-Android    //1.4K

```

状态栏
===
```
//状态栏
    compile 'com.jaeger.statusbarutil:library:1.5.1'
//      https://github.com/laobie/StatusBarUtil     //6.1K

//systembartint
    compile 'com.readystatesoftware.systembartint:systembartint:1.0.3'
//      https://github.com/jgilfelt/SystemBarTint       //5.0K

```
颜色选择器
===
```
//颜色选择器
    compile 'com.larswerkman:HoloColorPicker:1.5'
//      https://github.com/LarsWerkman/HoloColorPicker      //1.2K
```



```
//firebase的功能包括推送通知，云存储，活动监视，远程部署,Google推出的一个云端服务，使用免费但须翻墙
    compile 'com.google.firebase:firebase-core:9.0.2'
```

序列化：
===
```
//Parceler 是一个代码代码生成器包，用于生成Android Parcelable 模板代码。
    compile 'org.parceler:parceler-api:1.1.11'
    annotationProcessor 'org.parceler:parceler:1.1.11'
//      https://github.com/johncarl81/parceler      //3.3K

```

activity状态保存
===

```
//icepick:避免在Activity恢复时重新设置状态的麻烦
  compile 'frankiesardo:icepick:3.2.0'
  provided 'frankiesardo:icepick-processor:3.2.0'
//      https://github.com/frankiesardo/icepick //3.7K
```

调试
===
```
//stetho
    compile 'com.facebook.stetho:stetho-okhttp3:1.5.0'
    compile 'com.facebook.stetho:stetho-urlconnection:1.5.0'
    compile 'com.facebook.stetho:stetho-js-rhino:1.5.0'
//      https://github.com/facebook/stetho      //10.2K

//blockcanary：卡顿检测
    compile 'com.github.markzhai:blockcanary-android:1.5.0'
//      https://github.com/markzhai/AndroidPerformanceMonitor   //4.4K


//blockcanary改进版
    debugCompile 'com.letv.sarrsdesktop:BlockCanaryExJRT:0.9.9.4'
    releaseCompile 'com.letv.sarrsdesktop:BlockCanaryExJRTNoOp:0.9.9.4'
    testCompile 'com.letv.sarrsdesktop:BlockCanaryExJRTNoOp:0.9.9.4'
//      https://github.com/seiginonakama/BlockCanaryEx  //1.8K

//leakcanary：内存泄漏检测
    debugImplementation 'com.squareup.leakcanary:leakcanary-android:1.6.1'
    releaseImplementation 'com.squareup.leakcanary:leakcanary-android-no-op:1.6.1'
    // Optional, if you use support library fragments:
    debugImplementation 'com.squareup.leakcanary:leakcanary-support-fragment:1.6.1'
//      https://github.com/square/leakcanary    20.5K

```





六个可以让代码变得更整洁的 Android 库
==

1.butterknife

2.icepick

3.Dart 和Henson

4.Parceler

5.Timber

6.Dagger和Dagger2

感谢：
===
[Android 开源项目](https://github.com/Trinea/android-open-project#%E7%AC%AC%E4%B8%89%E9%83%A8%E5%88%86-%E4%BC%98%E7%A7%80%E9%A1%B9%E7%9B%AE)

[学习项目：SeeWeather](https://github.com/xcc3641/SeeWeather)

[学习项目：GeekNews](https://github.com/codeestX/GeekNews)

[学习项目：LQRWeChat](https://github.com/GitLqr/LQRWeChat)

[学习项目：AndroidFire](https://github.com/jaydenxiao2016/AndroidFire)

[学习项目：MvpApp](https://github.com/Rukey7/MvpApp)

[学习项目：Toutiao](https://github.com/iMeiji/Toutiao)

[学习项目：KingTV](https://github.com/jenly1314/KingTV)

[RxJava 2 和 Retrofit 结合使用的几个最常见使用方式举例](https://github.com/rengwuxian/RxJavaSamples)

[RxjavaRetrofitDemo](https://github.com/tough1985/RxjavaRetrofitDemo)

[在线视频App](https://github.com/GeekGhost/Ghost)

[LifeHelper](https://github.com/yangchong211/LifeHelper)













