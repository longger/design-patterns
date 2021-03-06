# 观察者模式

观察者模式定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。

可以利用报纸订阅服务，来类比观察者模式。

出版者（subject）+ 观察者（observer）

## 过程

* 报社的业务就是出版报纸
* 向某家报社订阅报纸，只要他们有新报纸出版，就会给你送来。只要你是他们的订户，你就会一直受到新报纸
* 当你不想要再看报纸的时候，取消订阅，他们就不会再送新的报纸来
* 只要报社还在运营，就会一直有人向他们订阅报纸或取消订阅报纸


关键点：

订阅与取消订阅

及时更新


被观察者实现subject接口

观察者实现observer接口


## 注意

Java API有内置的观察者模式。java.util包内包含最基本的Observer接口与Observable类。可以参考Java API。

