
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



# 优秀的库

#### <font color=#ff0000>基础

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



#### <font color=#ff0000>activity状态保存


```
//icepick:避免在Activity恢复时重新设置状态的麻烦
  compile 'frankiesardo:icepick:3.2.0'
  provided 'frankiesardo:icepick-processor:3.2.0'
//3.7K
```
https://github.com/frankiesardo/icepick 


#### <font color="#ff0000">activity侧滑返回

```
//activity侧滑返回
    compile 'cn.bingoogolapple:bga-swipebacklayout:1.1.9'
//1.4K
```
https://github.com/bingoogolapple/BGASwipeBackLayout-Android    


#### <font color="#ff0000">fragment管理

```
//fragment管理
    compile 'me.yokeyword:fragmentation:1.3.6'
//7.2K
```
https://github.com/YoKeyword/Fragmentation  

#### <font color="#ff0000">事件总线


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


#### <font color="#ff0000">组件传递数据
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

#### <font color="#ff0000">二维码扫描

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

#### <font color="#ff0000">View注入框架

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


#### <font color="#ff0000">动态权限

https://blog.csdn.net/totond/article/details/73648103 以下三者对比

```
//permissionsdispatcher
    compile "com.github.hotchemi:permissionsdispatcher:4.0.0-alpha1"
    annotationProcessor "com.github.hotchemi:permissionsdispatcher-processor:4.0.0-alpha1"
//7.9K
```
https://github.com/permissions-dispatcher/PermissionsDispatcher     

```
//基于RxJava的RxPermissions：需要添加rxjava、rxandroid
    compile 'com.github.tbruyelle:rxpermissions:0.10.2'
//7.0K
```
https://github.com/tbruyelle/RxPermissions      

```
//easypermissions
    compile 'pub.devrel:easypermissions:1.3.0'
//6.3K
```
https://github.com/googlesamples/easypermissions     

```
//AndPermission
    compile 'com.yanzhenjie:permission:2.0.0-rc12'
//4.5K

```
https://github.com/yanzhenjie/AndPermission  


#### <font color="#ff0000">图片

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
//14.9K
```
https://github.com/facebook/fresco      

```
//Picasso----
    implementation 'com.squareup.picasso:picasso:2.71828'
//15.9K
```
https://github.com/square/picasso       

```
//为picasso提供多种图片转换
    compile 'jp.wasabeef:picasso-transformations:2.2.1'
    // If you want to use the GPU Filters
    compile 'jp.co.cyberagent.android.gpuimage:gpuimage-library:1.4.1'
//1.4K    
```
https://github.com/wasabeef/picasso-transformations    

```

//glide----
    implementation('com.github.bumptech.glide:glide:4.5.0') {
        exclude group: "com.android.support"
    }
    //使用okhttp加载图片
    compile 'com.github.bumptech.glide:okhttp3-integration:4.5.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.5.0'
//23.2K
```
https://github.com/bumptech/glide       

```
//为glide提供多种图片转换
    implementation 'jp.wasabeef:glide-transformations:3.3.0'
    // If you want to use the GPU Filters
    implementation 'jp.co.cyberagent.android.gpuimage:gpuimage-library:1.4.1'
//6.7K
```
https://github.com/wasabeef/glide-transformations       

```
//圆形图片
    compile 'de.hdodenhof:circleimageview:2.2.0'
//10.4K
```
https://github.com/hdodenhof/CircleImageView        

```
//圆角图片
    compile 'com.makeramen:roundedimageview:2.3.0'
//4.9K
```
https://github.com/vinc3m1/RoundedImageView     

```
//手势图片
    compile 'com.github.chrisbanes:PhotoView:2.1.4'
//13.8K
```
https://github.com/chrisbanes/PhotoView     

```
//仿微信选图
    compile 'me.iwf.photopicker:PhotoPicker:0.9.12@aar'
//2.6K
```
https://github.com/donglua/PhotoPicker      

```
//自定义相册，实现了拍照、图片选择（单选/多选）、裁剪等
    compile 'com.github.YancyYe:GalleryPick:1.2.1'
```
https://github.com/YancyYe/GalleryPick

```
//图片压缩框架
    implementation 'com.zxy.android:tiny:0.1.0'
//2.0K
```
https://github.com/Sunzxyong/Tiny       

```
//裁剪图片
    compile 'com.soundcloud.android:android-crop:1.0.1@aar'
//4.1K
```
https://github.com/jdamcd/android-crop  

```
//用于在Android设备上获取照片（拍照或从相册、文件中选择）、裁剪图片、压缩图片的开源工具库
    compile 'com.jph.takephoto:takephoto_library:4.1.0'
//5.5K
```
https://github.com/crazycodeboy/TakePhoto   

```
//完全仿微信的图片选择，并且提供了多种图片加载接口，选择图片后可以旋转，可以裁剪成矩形或圆形，可以配置各种其他的参数
	compile 'com.lzy.widget:imagepicker:0.6.1'  //指定版本
//3.2K
```
https://github.com/jeasonlzy/ImagePicker    

#### <font color="#ff0000">图标库

```
//图标icon库:android-iconify
    compile 'com.joanzapata.iconify:android-iconify-fontawesome:2.2.2' // (v4.5)
    compile 'com.joanzapata.iconify:android-iconify-entypo:2.2.2' // (v3,2015)
    compile 'com.joanzapata.iconify:android-iconify-typicons:2.2.2' // (v2.0.7)
    compile 'com.joanzapata.iconify:android-iconify-material:2.2.2' // (v2.0.0)
    compile 'com.joanzapata.iconify:android-iconify-material-community:2.2.2' // (v1.4.57)
    compile 'com.joanzapata.iconify:android-iconify-meteocons:2.2.2' // (latest)
    compile 'com.joanzapata.iconify:android-iconify-weathericons:2.2.2' // (v2.0)
    compile 'com.joanzapata.iconify:android-iconify-simplelineicons:2.2.2' // (v1.0.0)
    compile 'com.joanzapata.iconify:android-iconify-ionicons:2.2.2' // (v2.0.1)
//3.6K
```
https://github.com/JoanZapata/android-iconify       

```
//Android-Iconics
    //the core iconcis library (without any widgets)
    implementation "com.mikepenz:iconics-core:3.1.0-rc01"
    //this adds all ui view widgets (IconicsButton, IconicsImageView, ...)
    implementation "com.mikepenz:iconics-views:3.1.0-rc01"
    implementation 'com.mikepenz:google-material-typeface:3.0.1.2.original@aar'
    implementation 'com.mikepenz:material-design-iconic-typeface:2.2.0.4@aar'
    implementation 'com.mikepenz:fontawesome-typeface:5.0.13.0@aar'
    implementation 'com.mikepenz:octicons-typeface:3.2.0.4@aar'
    implementation 'com.mikepenz:meteocons-typeface:1.1.0.4@aar'
    implementation 'com.mikepenz:community-material-typeface:2.0.46.1@aar'
    implementation 'com.mikepenz:weather-icons-typeface:2.0.10.4@aar'
    implementation 'com.mikepenz:typeicons-typeface:2.0.7.4@aar'
    implementation 'com.mikepenz:entypo-typeface:1.0.0.4@aar'
    implementation 'com.mikepenz:devicon-typeface:2.0.0.4@aar'
    implementation 'com.mikepenz:foundation-icons-typeface:3.0.0.4@aar'
    implementation 'com.mikepenz:ionicons-typeface:2.0.1.4@aar'
    implementation 'com.mikepenz:pixeden-7-stroke-typeface:1.2.0.2@aar'
//3.8K
```
https://github.com/mikepenz/Android-Iconics     


#### <font color="#ff0000">屏幕适配

```
//-----------------------------------------屏幕适配-----------------------------------------

//
    compile 'com.zhy:autolayout:1.4.5'
//6.3K
```
https://github.com/hongyangAndroid/AndroidAutoLayout        

```

//
    implementation 'me.jessyan:autosize:0.9.5'
//2.7K 
```
https://github.com/JessYanCoding/AndroidAutoSize        


#### <font color="#ff0000">工具类

```
//工具类
    implementation 'com.blankj:utilcode:1.20.3'
//19.9K
```
https://github.com/Blankj/AndroidUtilCode/blob/master/utilcode/README-CN.md     
https://github.com/Blankj/AndroidUtilCode/blob/master/subutil/README-CN.md


#### <font color="#ff0000">google推送

```
//firebase的功能包括推送通知，云存储，活动监视，远程部署,Google推出的一个云端服务，使用免费但须翻墙
    compile 'com.google.firebase:firebase-core:9.0.2'
```

#### <font color="#ff0000">序列化：

```
//Parceler 是一个代码代码生成器包，用于生成Android Parcelable 模板代码。
    compile 'org.parceler:parceler-api:1.1.11'
    annotationProcessor 'org.parceler:parceler:1.1.11'
//3.3K
```
https://github.com/johncarl81/parceler      


#### <font color="#ff0000">java解析HTML

```
//jsoup
    compile 'org.jsoup:jsoup:1.11.3'
```
https://jsoup.org/download  
http://www.open-open.com/jsoup/     使用文档

#### <font color="#ff0000">控件

```
//RecyclerView的辅助适配器
    compile 'com.github.CymChad:BaseRecyclerViewAdapterHelper:2.9.34'
//14.9K
```
https://github.com/CymChad/BaseRecyclerViewAdapterHelper    

```
//RecyclerView下拉刷新和上拉加载更多以及RecyclerView线性、网格、瀑布流效果演示
    compile 'com.wuxiaolong.pullloadmorerecyclerview:library:1.1.2'
//1.2K
```
https://github.com/WuXiaolong/PullLoadMoreRecyclerView      

```
//RecyclerView侧滑菜单，Item拖拽，滑动删除Item，自动加载更多，HeaderView，FooterView，Item分组黏贴。
    compile 'com.yanzhenjie:recyclerview-swipe:1.1.4'
//3.4K
```
https://github.com/yanzhenjie/SwipeRecyclerView     

```
//RecyclerView侧滑
    compile 'com.github.AItsuki:SwipeMenuRecyclerView:1.1.3'
//125
```
https://github.com/AItsuki/SwipeMenuRecyclerView    

```
//listview、GridView、RecyclerView侧滑
    compile "com.daimajia.swipelayout:library:1.2.0@aar"
//10.5K
```
 https://github.com/daimajia/AndroidSwipeLayout      

```
//任意view下拉刷新
    compile 'in.srain.cube:ultra-ptr:1.0.11'
//9.2K
```
https://github.com/liaohuqiu/android-Ultra-Pull-To-Refresh      

```
//材料设计的dialog
    implementation 'com.afollestad.material-dialogs:core:2.0.0-alpha09'
//14.2K
```
https://github.com/afollestad/material-dialogs      

```
//多种下拉刷新效果、上拉加载更多、可配置自定义头部广告位
    implementation 'cn.bingoogolapple:bga-refreshlayout:1.1.8'
//3.7K
```
https://github.com/bingoogolapple/BGARefreshLayout-Android  

```
//RecyclerView的各种需求封装进库。提升开发效率
    compile 'com.jude:easyrecyclerview:4.4.2'
//1.9K
```
https://github.com/Jude95/EasyRecyclerView  

```
//recyclerview动画
     implementation 'jp.wasabeef:recyclerview-animators:2.3.0'
//8.3K
```
https://github.com/wasabeef/recyclerview-animators      

```

//支持各种刷新
	compile 'com.github.Aspsine:SwipeToLoadLayout:1.0.4'
//1.9K
```
https://github.com/Aspsine/SwipeToLoadLayout        

```

//android-Ultra-Pull-To-Refresh
    compile 'in.srain.cube:ultra-ptr:1.0.11'
//9.2K
```
https://github.com/liaohuqiu/android-Ultra-Pull-To-Refresh      

```

//兼容动画
  compile 'com.nineoldandroids:library:2.4.0'
//4.4K
```
https://github.com/JakeWharton/NineOldAndroids  

```
//loading动画
   compile 'com.wang.avi:library:2.1.3'
//7.8K
```
https://github.com/81813780/AVLoadingIndicatorView  

```
//Android 所有动画系列详尽教程
//977
```
https://github.com/OCNYang/Android-Animation-Set      

```
//滑动开关按钮
   	implementation 'com.kyleduo.switchbutton:library:2.0.0'
//3.7K
```
https://github.com/kyleduo/SwitchButton     

```
//选择城市，选择联系人等需要索引的功能
    compile 'me.yokeyword:indexablerecyclerview:1.3.0'
//975
```
https://github.com/YoKeyword/IndexableRecyclerView      

```

//日历
  implementation 'com.github.prolificinteractive:material-calendarview:2.0.0'
//4.5K
```
https://github.com/prolificinteractive/material-calendarview    

```
//实现各个方向的气泡弹窗，可控制气泡尖角偏移量。
    compile 'com.yuyh.bubble:library:1.0.0'
//191
```
https://github.com/smuyyh/BubblePopupWindow     

```

//MaterialSearchView
    compile 'com.miguelcatalan:materialsearchview:1.4.0'    
//3.2K
```
https://github.com/MiguelCatalan/MaterialSearchView     

```
//ViewPager tab指示
    compile 'com.ogaclejapan.smarttablayout:library:1.6.1@aar'
    //Optional: see how to use the utility.
    compile 'com.ogaclejapan.smarttablayout:utils-v4:1.6.1@aar'
    //Optional: see how to use the utility.
    compile 'com.ogaclejapan.smarttablayout:utils-v13:1.6.1@aar'
//5.6K
```
https://github.com/ogaclejapan/SmartTabLayout       

```
//轮播图：无限、自动等
    compile 'com.jude:rollviewpager:1.4.6'
//907
```
https://github.com/Jude95/RollViewPager/blob/master/README_ch.md    

```
//探探滑动菜单
    compile 'com.daprlabs.aaron:swipedeck:2.0.6'
//146
```
https://github.com/aaronbond/SwipeDeck2     


```
//AgentWeb 是一个基于的 Android WebView ，极度容易使用以及功能强大的库，
//提供了 Android WebView 一系列的问题解决方案 ，并且轻量和极度灵活
     compile 'com.just.agentweb:agentweb:4.0.2' // (必选)
     compile 'com.just.agentweb:download:4.0.2' // (可选)
     compile 'com.just.agentweb:filechooser:4.0.2'// (可选) 
//4.5K  
```
https://github.com/Justson/AgentWeb              

```
//Android流式布局，支持单选、多选等，适合用于产品标签等。
    compile 'com.hyman:flowlayout-lib:1.1.2'    
4.2K
```
https://github.com/hongyangAndroid/FlowLayout       

```
//Clans/FloatingActionButton：仿知乎FloatingActionButton浮动按钮
    compile 'com.github.clans:fab:1.6.4'
//4.3K
```
https://github.com/Clans/FloatingActionButton   


```
//支持自由定制外观、拖拽消除的MaterialDesign风格Android BadgeView
    compile 'q.rorbin:badgeview:1.1.3'
//2.7K
```
https://github.com/qstumn/BadgeView     

```
//SwipeDelMenuLayout 侧滑删除 任意的ViewGroup里的childView都可以使用
    compile 'com.github.mcxtzhang:SwipeDelMenuLayout:V1.3.0'
//2.3K
```
https://github.com/mcxtzhang/SwipeDelMenuLayout/blob/master/README-cn.md	


```
//AndroidImageSlider 图片轮播
    compile 'com.daimajia.slider:library:1.1.5@aar'
//5.1K
```
https://github.com/daimajia/AndroidImageSlider	


```
//NumberProgressBar	数字进度条
   compile 'com.daimajia.numberprogressbar:library:1.4@aar'
//5.1K
```
https://github.com/daimajia/NumberProgressBar	


```
//ShineButton 	闪烁动画的按钮，点赞效果等
    compile 'com.sackcentury:shinebutton:0.2.0'
//3.4K	
```
https://github.com/ChadCSong/ShineButton	


```
//Android-SpinKit 加载loading动画
   compile 'com.github.ybq:Android-SpinKit:1.1.0'
//5.2K
```
https://github.com/ybq/Android-SpinKit		


```
//sticky-headers-recyclerview	recyclerview粘性头部
	compile 'com.timehop.stickyheadersrecyclerview:library:0.4.3@aar'
//3.3K	
```
https://github.com/timehop/sticky-headers-recyclerview	


```
//SmoothProgressBar 炫酷的水平进度条
    // of course, do not write x.x.x but the version number
    compile 'com.github.castorflex.smoothprogressbar:library:1.1.0'
    // or
    compile 'com.github.castorflex.smoothprogressbar:library-circular:1.3.0'
//4.1K	
```
https://github.com/castorflex/SmoothProgressBar		



#### <font color="#ff0000">选择器

```
    /*--------------------------------选择器--------------------------------------*/
//选择器：时间选择器、省市区三级联动等
    compile 'com.contrarywind:Android-PickerView:4.1.6'
//8.2K
```
https://github.com/Bigkoo/Android-PickerView    

```
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
//3.9K
```
https://github.com/gzu-liyujiang/AndroidPicker  

#### <font color="#ff0000">颜色选择器

```
//颜色选择器
    compile 'com.larswerkman:HoloColorPicker:1.5'
//1.2K
```
https://github.com/LarsWerkman/HoloColorPicker      

```
//MaterialDateTimePicker    日期选择器
    compile 'com.wdullaer:materialdatetimepicker:3.6.3'
//3.6K
```
https://github.com/wdullaer/MaterialDateTimePicker  

#### <font color="#ff0000">数据库

[【Android 数据库框架总结，总有一个适合你！】](https://blog.csdn.net/da_caoyuan/article/details/61414626)

```

// greenrobot/greenDAO
    compile 'org.greenrobot:greendao:3.2.2' // add library
    compile 'org.greenrobot:greendao-generator:3.2.0'
//10.4K
```
https://github.com/greenrobot/greenDAO      

```
//郭霖：LitePal
    compile 'org.litepal.android:core:2.0.0'
//5.3K
```
https://github.com/LitePalFramework/LitePal 

```
//DBFlow
    // if Java use this. If using Kotlin do NOT use this.
    annotationProcessor "com.github.Raizlabs.DBFlow:dbflow-processor:4.2.4"

    // Use if Kotlin user.
    kapt "com.github.Raizlabs.DBFlow:dbflow-processor:4.2.4"
//4.3K
```
https://github.com/Raizlabs/DBFlow		


```
//realm ：   bat都在用，插件引入
//9.9K
```
github地址：https://github.com/realm/realm-java       
中文文档：https://realm.io/cn/docs/java/latest/  


```
//stetho：可在Chrome调试数据库、网络等
    compile 'com.facebook.stetho:stetho:1.5.0'              
    compile 'com.facebook.stetho:stetho-okhttp3:1.5.0'
    compile 'com.facebook.stetho:stetho-urlconnection:1.5.0'
    compile 'com.facebook.stetho:stetho-js-rhino:1.5.0'
//10.2K
```
https://github.com/facebook/stetho              

```
//Android-Debug-Database : 调试数据库
    debugImplementation 'com.amitshekhar.android:debug-db:1.0.4'
//5.1K
```
https://github.com/amitshekhariitbhu/Android-Debug-Database     


#### <font color="#ff0000">日志


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


#### <font color="#ff0000">状态栏

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


#### <font color="#ff0000">网络

```
//---------------------------------------网络------------------------------------------
    // 支持 retrofit
    compile 'com.squareup.retrofit2:retrofit:2.1.0'
    // 衔接 retrofit + rxjava
    compile 'com.squareup.retrofit2:adapter-rxjava:2.1.0'
    // 支持 Gson 解析
    compile 'com.squareup.retrofit2:converter-gson:2.1.0'

```
https://github.com/square/retrofit
https://github.com/square/retrofit/tree/master/retrofit-adapters
https://github.com/square/retrofit/tree/master/retrofit-converters

```
    // 支持 rxjava
    compile 'io.reactivex:rxjava:1.1.5'
    compile 'io.reactivex:rxandroid:1.2.0'
```
https://github.com/ReactiveX/RxJava
https://github.com/ReactiveX/RxAndroid

```
    //gson解析
    compile 'com.google.code.gson:gson:2.8.5'
```
https://github.com/google/gson

```
    // okhttp
    def OK_HTTP_VERSION = "3.4.1"
    compile "com.squareup.okhttp3:okhttp:${OK_HTTP_VERSION}"
    compile "com.squareup.okhttp3:okhttp-urlconnection:${OK_HTTP_VERSION}"
    compile "com.squareup.okhttp3:logging-interceptor:${OK_HTTP_VERSION}"
//28.7K
```
https://github.com/square/okhttp      
  
```

//OkHttp3 基于SharedPreferences持久化CookieJar
    compile 'com.github.franmontiel:PersistentCookieJar:v1.0.1'
//1.1K
```
https://github.com/franmontiel/PersistentCookieJar      

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
//FileDownloader Android 文件下载引擎，稳定、高效、灵活、简单易用
	implementation 'com.liulishuo.filedownloader:library:1.7.5'
//7.3K
```
https://github.com/lingochamp/FileDownloader/blob/master/README-zh.md	


#### <font color="#ff0000">视频播放

```

//--------------------------------------视频播放------------------------------------
    compile 'cn.jzvd:jiaozivideoplayer:6.3.1'
//7.6K
```
https://github.com/lipangit/JiaoZiVideoPlayer   

```
//基于IJKPlayer的多功能视频播放器
    implementation 'com.shuyu:GSYVideoPlayer:6.0.0-beta'
//7.3K
```
https://github.com/CarGuo/GSYVideoPlayer        

```
//GitLqr/LQRAudioRecord ： 集成录音与播音功能，使用简单方便
    compile 'com.lqr.audio:library:1.0.0'
//205
```
https://github.com/GitLqr/LQRAudioRecord        

#### <font color="#ff0000">调试

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
