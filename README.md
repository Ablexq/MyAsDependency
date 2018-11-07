
[github搜索排名](https://github.com/trending)

[Android 开源项目](https://github.com/Trinea/android-open-project#%E7%AC%AC%E4%B8%89%E9%83%A8%E5%88%86-%E4%BC%98%E7%A7%80%E9%A1%B9%E7%9B%AE)

[Android 开源组件和第三方库汇总](https://blog.csdn.net/renjianhhong/article/details/51798874)

[优秀的控件UI库](https://github.com/wasabeef/awesome-android-ui)

[优秀的Android资源收集与整理](https://github.com/AlanCheen/Android-Resources)

[2017上半年技术文章集合—184篇文章分类汇总](https://blog.csdn.net/androidstarjack/article/details/77923753)



# 常见库汇总

[Android主流UI开源库整理](https://www.jianshu.com/p/47a4a7b99364)

[Android 开源项目分类汇总](https://github.com/Trinea/android-open-project)

[List of Android UI/UX Libraries](https://github.com/wasabeef/awesome-android-ui)

[android 优秀框架整理](https://blog.csdn.net/huangxiaoguo1/article/details/79032186)

[史上最全分类 Android 开源大全](https://github.com/XXApple/AndroidLibs)

[常用的工具类](https://github.com/l123456789jy/Lazy)

[Android优秀开源框架汇总](https://github.com/Ericsongyl/AOSF)



# 快速开发框架

[TommyLemon/Android-ZBLibrary](https://github.com/TommyLemon/Android-ZBLibrary) //2.8K

[jiangqqlmj/FastDev4Android](https://github.com/jiangqqlmj/FastDev4Android)     //2.6K

[一些开源工具类（作者GitHubdemo挺好）](https://github.com/tuacy/ViewMove/blob/master/common/src/main/java/com/pilot/common/utils/TimeUtils.java)

# 导航

[优秀项目](https://github.com/Ablexq/MyAsDependency/blob/master/%E4%BC%98%E7%A7%80%E9%A1%B9%E7%9B%AE.md)

[网络相关](https://github.com/Ablexq/MyAsDependency/blob/master/%E7%BD%91%E7%BB%9C%E7%9B%B8%E5%85%B3.md)

[事件总线](https://github.com/Ablexq/MyAsDependency/blob/master/%E4%BA%8B%E4%BB%B6%E6%80%BB%E7%BA%BF.md)

[二维码](https://github.com/Ablexq/MyAsDependency/blob/master/%E4%BA%8C%E7%BB%B4%E7%A0%81.md)

[列表相关](https://github.com/Ablexq/MyAsDependency/blob/master/%E5%88%97%E8%A1%A8RecyclerView.md)

[原理解析与教程](https://github.com/Ablexq/MyAsDependency/blob/master/%E5%8E%9F%E7%90%86%E8%A7%A3%E6%9E%90%E5%8F%8A%E6%95%99%E7%A8%8B.md)

[动态权限](https://github.com/Ablexq/MyAsDependency/blob/master/%E5%8A%A8%E6%80%81%E6%9D%83%E9%99%90.md)

[图片相关](https://github.com/Ablexq/MyAsDependency/blob/master/%E5%9B%BE%E7%89%87.md)

[存储与数据库](https://github.com/Ablexq/MyAsDependency/blob/master/%E5%AD%98%E5%82%A8%E4%B8%8E%E6%95%B0%E6%8D%AE%E5%BA%93.md)

[屏幕适配](https://github.com/Ablexq/MyAsDependency/blob/master/%E5%B1%8F%E5%B9%95%E9%80%82%E9%85%8D.md)

[控件相关](https://github.com/Ablexq/MyAsDependency/blob/master/%E6%8E%A7%E4%BB%B6.md)

[日志](https://github.com/Ablexq/MyAsDependency/blob/master/%E6%97%A5%E5%BF%97.md)

[更新升级](https://github.com/Ablexq/MyAsDependency/blob/master/%E6%9B%B4%E6%96%B0%E5%8D%87%E7%BA%A7.md)

[注解](https://github.com/Ablexq/MyAsDependency/blob/master/%E6%B3%A8%E8%A7%A3.md)

[状态栏](https://github.com/Ablexq/MyAsDependency/blob/master/%E7%8A%B6%E6%80%81%E6%A0%8F.md)

[视频播放](https://github.com/Ablexq/MyAsDependency/blob/master/%E8%A7%86%E9%A2%91%E6%92%AD%E6%94%BE.md)

[调试](https://github.com/Ablexq/MyAsDependency/blob/master/%E8%B0%83%E8%AF%95.md)

[选择器](https://github.com/Ablexq/MyAsDependency/blob/master/%E9%80%89%E6%8B%A9%E5%99%A8.md)

[面试](https://github.com/Ablexq/MyAsDependency/blob/master/%E9%9D%A2%E8%AF%95.md)

[]()

# 其他

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

bingoogolapple/BGASwipeBackLayout-Android
Android Activity 滑动返回。支持微信滑动返回样式、横屏滑动返回、全屏滑动返回
```
//activity侧滑返回
    compile 'cn.bingoogolapple:bga-swipebacklayout:1.1.9'
//1.4K
```
https://github.com/bingoogolapple/BGASwipeBackLayout-Android    


ikew0ng/SwipeBackLayout
可用SwipeBackLayout实现滑动关闭当前Activity
```
    compile 'me.imid.swipebacklayout.lib:library:1.1.0'
//5.3K
```
https://github.com/ikew0ng/SwipeBackLayout

#### <font color="#ff0000">fragment管理</font>

```
//fragment管理
    compile 'me.yokeyword:fragmentation:1.3.6'
//7.2K
```
https://github.com/YoKeyword/Fragmentation  


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



#### 路由
```
//alibaba/ARouter
//7.5K
```
https://github.com/alibaba/ARouter  
中文文档：
https://github.com/alibaba/ARouter/blob/master/README_CN.md


#### 文件操作
```
   // io
    api 'commons-io:commons-io:2.6'
```


#### 时间格式化
```
    compile 'org.ocpsoft.prettytime:prettytime:4.0.1.Final'
//965
```
https://github.com/ocpsoft/prettytime


```
    api 'joda-time:joda-time:2.9.9'
```



#### Android Signature V2 Scheme签名下的新一代渠道包打包神器
```
    compile 'com.meituan.android.walle:library:1.1.6'
//3.6K
```
https://github.com/Meituan-Dianping/walle


#### Android资源混淆工具(微信团队)
5.1K
https://github.com/shwenzhang/AndResGuard/blob/master/README.zh-cn.md



### 状态切换
```
//内容界面
//加载数据中
//加载数据错误
//加载后没有数据
//没有网络
    compile 'cn.yc:YCStateLib:1.1.5
//95
```
https://github.com/yangchong211/YCStateLayout

状态切换布局，使用场景（网路数据请求的时候，正在请求数据，请求数据失败，请求数据成功多种状态下显示不同的布局）。
https://github.com/tuacy/StateSwitchLayout

Android 加载成功、加载失败、加载中、无数据四个不同界面的切换
https://blog.csdn.net/zhaozhuzi/article/details/73822894












