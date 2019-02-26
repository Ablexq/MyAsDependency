
推荐阅读：

[集合：list、set与map(HashMap、TreeMap和HashTable、LinkedHashMap、ConcurrentHashMap)](https://blog.csdn.net/sinat_31057219/article/details/87874107)

# ArrayList

ArrayList就是动态数组

它允许所有元素，包括null。

ArrayList并不是线程安全的

其底层使用数组保存所有元素所以其操作基本上是对数组的操作。

在对 ArrayList 中存储元素时，都要去检查添加后元素的个数是否会超出当前数组的长度，如果超出，数组将会进行扩容，扩容原来的一半，以满足添加数据的需求。

# LinkedList

LinkedList 是一个继承于AbstractSequentialList的双向链表。它也可以被当作堆栈、队列或双端队列进行操作。

LinkedList 实现 List 接口，能对它进行队列操作，允许null元素。

LinkedList 实现了Cloneable接口，即覆盖了函数clone()，能克隆。

LinkedList 是非同步的,即非线程安全的，一种解决方法是在创建List时构造一个同步的List：List list = Collections.synchronizedList(new LinkedList(…));

LinkedList是通过节点直接彼此连接来实现的。每一个节点都包含前一个节点的引用，后一个节点的引用和节点存储的值。当一个新节点插入时，只需要修改其中保持先后关系的节点的引用即可，当删除记录时也一样。

LinkedList相对于ArrayList来说，是可以快速添加，删除元素，ArrayList添加删除元素的话需移动数组元素，可能还需要考虑到扩容数组长度。

# 对比：

1.ArrayList是实现了基于动态数组的数据结构，LinkedList基于链表的数据结构。 

2.对于随机访问get和set，ArrayList优于LinkedList，因为ArrayList可以随机定位，而LinkedList要移动指针一步一步的移动到节点处。（参考数组与链表来思考）

3.对于新增和删除操作add和remove，LinedList比较占优势，只需要对指针进行修改即可，而ArrayList要移动数据来填补被删除的对象的空间。

ArrayList：内部实现是个数组，其中的元素可以通过index获取。但是，如果一个数组满了的话，我们就必须重新分配一个更大的数组然后把所有元素移动到这个新数组，其时间复杂度为O(n)。添加或删除一个元素时也需要移动数组中的其它元素。这就是ArrayList的缺点。

LinkedList：是一个双向链表。因此如果我们要获取中间元素的话，我们就需要从头开始遍历；另一方面，添加或删除一个元素就变得很简单，因为只需要对这个链表本身操作即可。

