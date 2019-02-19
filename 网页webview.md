

从Android4.4系统开始，Chromium内核取代了Webkit内核。

从Android5.0系统开始，WebView移植成了一个独立的apk，可以不依赖系统而独立存在和更新。

从Android7.0 系统开始，如果用户手机里安装了 Chrome ， 系统优先选择 Chrome 为应用提供 WebView 渲染。

从Android8.0系统开始，默认开启WebView多进程模式，即WebView运行在独立的沙盒进程中。


# VasSonic

Tecent开源，提升web的首屏请求速度 : 

9.1K 

[Tencent/VasSonic](https://github.com/Tencent/VasSonic)

# AgentWeb

AgentWeb 是一个基于的 Android WebView ，极度容易使用以及功能强大的库，提供了 Android WebView 一系列的问题解决方案 ，并且轻量和极度灵活。

5.2K

[Justson/AgentWeb](https://github.com/Justson/AgentWeb)


# x5webview

1. TBS(腾讯浏览服务)的优势

1) 速度快：相比系统webview的网页打开速度有30+%的提升；

2) 省流量：使用云端优化技术使流量节省20+%；

3) 更安全：安全问题可以在24小时内修复；

4) 更稳定：经过亿级用户的使用考验，CRASH率低于0.15%；

5) 兼容好：无系统内核的碎片化问题，更少的兼容性问题；

6) 体验优：支持夜间模式、适屏排版、字体设置等浏览增强功能；

7) 功能全：在Html5、ES6上有更完整支持；

8) 更强大：集成强大的视频播放器，支持视频格式远多于系统webview；

9) 视频和文件格式的支持x5内核多于系统内核

10) 防劫持是x5内核的一大亮点

2. 运行环境

1)手机ROM版本高于或等于2.2版本

2)手机RAM大于500M，该RAM值通过手机 /proc/meminfo 文件的MemTotal动态获取

注：如果不满足上述条件，SDK会自动切换到系统WebView，SDK使用者不用关心该切换过程。

3. SDK尺寸指标

1)SDK提供的JAR包约250K

[tencent/x5webview官网文档](https://x5.tencent.com/tbs/guide/sdkInit.html)

[]()