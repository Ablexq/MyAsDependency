
[全家桶系列之刷新、加载更多、悬浮、左滑删除](https://github.com/soulrelay/StickyListHeadersWithRefreshAndLoadMore)

# 辅助库 alibaba/vlayout
```
//VirtualLayout是一个针对RecyclerView的LayoutManager扩展, 
//主要提供一整套布局方案和布局间的组件复用的问题。
  compile ('com.alibaba.android:vlayout:1.2.8@aar') {
  	transitive = true
  }
//8.5K
```
https://github.com/alibaba/vlayout/blob/master/README-ch.md

# SmartRefreshLayout

Android智能下拉刷新框架-SmartRefreshLayout

下拉刷新、上拉加载、二级刷新、淘宝二楼、RefreshLayout、OverScroll，
Android智能下拉刷新框架，支持越界回弹、越界拖动，具有极强的扩展性，集成了几十种炫酷的Header和 Footer。

```
//1.1.0 （1.0.5及以前版本的老用户升级需谨慎，API改动过大）
compile 'com.scwang.smartrefresh:SmartRefreshLayout:1.1.0-alpha-27'
compile 'com.scwang.smartrefresh:SmartRefreshHeader:1.1.0-alpha-27'//没有使用特殊Header，可以不加这行
compile 'com.android.support:appcompat-v7:25.3.1'//版本 23以上（必须）

//1.1.0 androidx 版本
implementation 'com.scwang.smartrefresh:SmartRefreshLayout:1.1.0-andx-10'
implementation 'com.scwang.smartrefresh:SmartRefreshHeader:1.1.0-andx-10'
implementation 'androidx.legacy:legacy-support-v4:1.0.0'

//1.0.5 （重大bug发现，无法兼容 Android P，不推荐使用）
```
https://github.com/scwang90/SmartRefreshLayout

# recycler适配器

```
//RecyclerView的辅助适配器
    compile 'com.github.CymChad:BaseRecyclerViewAdapterHelper:2.9.34'
//14.9K
```
https://github.com/CymChad/BaseRecyclerViewAdapterHelper    

#  recycler侧滑删除

```
//RecyclerView侧滑菜单，Item拖拽，滑动删除Item，自动加载更多，HeaderView，FooterView，Item分组黏贴。
    compile 'com.yanzhenjie:recyclerview-swipe:1.1.4'
//3.4K
```
https://github.com/yanzhenjie/SwipeRecyclerView     


#  recycler粘性头部

```
//sticky-headers-recyclerview	recyclerview粘性头部
	compile 'com.timehop.stickyheadersrecyclerview:library:0.4.3@aar'
//3.3K	 停止维护
```
https://github.com/timehop/sticky-headers-recyclerview	 

# 吸顶
```
    compile 'se.emilsjolander:stickylistheaders:x.x.x'
//5.3K  推荐
```
https://github.com/emilsjolander/StickyListHeaders

# 上拉加载等

```
//RecyclerView下拉刷新和上拉加载更多以及RecyclerView线性、网格、瀑布流效果演示
    compile 'com.wuxiaolong.pullloadmorerecyclerview:library:1.1.2'
//1.2K
```
https://github.com/WuXiaolong/PullLoadMoreRecyclerView      


# 侧滑
```
//RecyclerView侧滑
    compile 'com.github.AItsuki:SwipeMenuRecyclerView:1.1.3'
//125
```
https://github.com/AItsuki/SwipeMenuRecyclerView    

```
//RecyclerView的各种需求封装进库。提升开发效率
    compile 'com.jude:easyrecyclerview:4.4.2'
//1.9K
```
https://github.com/Jude95/EasyRecyclerView  


# recyclerview动画
```
     implementation 'jp.wasabeef:recyclerview-animators:2.3.0'
//8.3K
```
https://github.com/wasabeef/recyclerview-animators      




```
//选择城市，选择联系人等需要索引的功能
    compile 'me.yokeyword:indexablerecyclerview:1.3.0'
//975
```
https://github.com/YoKeyword/IndexableRecyclerView      

# 侧滑
```
//listview、GridView、RecyclerView侧滑
    compile "com.daimajia.swipelayout:library:1.2.0@aar"
//10.5K
```
 https://github.com/daimajia/AndroidSwipeLayout  

# Aspsine/SwipeToLoadLayout  下拉刷新 上拉加载更多
```
	compile 'com.github.Aspsine:SwipeToLoadLayout:1.0.4'
//1.9K
```
https://github.com/Aspsine/SwipeToLoadLayout


# zhou-you/EasyXRecyclerView 
主要提供了简单易用强大的RecyclerView库，
包括自定义刷新加载效果、极简通用的万能适配器Adapter、万能分割线、多种分组效果、
常见状态页面、item动画效果、添加多个header和footer、侧滑、拖拽、Sticky（黏性）效果、多item布局等,
各模块之间灵活、解耦、通用、又能相互组合使用。
```
 compile 'com.zhouyou:easyrecyclerview:1.0.5'
//316
```
https://github.com/zhou-you/EasyXRecyclerView

# 具有加载效果
sharish/ShimmerRecyclerView
具有微光视图的自定义回收器视图，用于指示正在加载视图
```
    implementation 'com.github.sharish:ShimmerRecyclerView:v1.3'
//2.3K
```
https://github.com/sharish/ShimmerRecyclerView


# jdsjlzx/LRecyclerView

LRecyclerView是支持addHeaderView、 addFooterView、下拉刷新、分页加载数据的RecyclerView。

它对 RecyclerView 控件进行了拓展，给RecyclerView增加HeaderView、FooterView，并且不需要对你的Adapter做任何修改。

```   
    implementation 'com.github.jdsjlzx:LRecyclerView:1.5.4.3'
//2.1K
```
https://github.com/jdsjlzx/LRecyclerView









