# designPattern
<br>

## 目录

### UML时序图
* [UML时序图讲解](#UML时序图讲解)
### 软件设计七大原则
* [开闭原则](#开闭原则)
* [依赖倒置原则](#依赖倒置原则)








### UML时序图讲解
![Image text](https://github.com/Fanxx7201/designPattern/blob/master/src/main/resources/pics/UML%E6%97%B6%E5%BA%8F%E5%9B%BE.png)
## 软件设计七大原则
### 开闭原则
* 定义: 一个软件实体如类、模块和函数应该对外拓展开放, 对修改关闭
* 用抽象构建框架, 用实现拓展细节
* 优点: 提高软件系统的可复用性及可维护性
* 是所有原则的基础
* coding: com.design.principle.openclose
* 代码说明: 接口ICourse, 父类javaCourse对修改是关闭的, 可以通过继承的关系, 去进行拓展, 例如说打折活动之类的去获取新的价格. 不改接口和父类.
### 依赖倒置原则
* 定义: 高层模块不应该依赖低层模块, 二者都应该依赖其抽象
* 抽象不应该依赖细节, 细节应该依赖抽象
* 针对接口编程, 不要针对实现编程
* 优点: 可以减少类间的耦合性, 提高系统稳定性, 提高代码的可读性和可维护性, 可降低修改程序所造成的风险
* coding: com.design.principle.dependenceinversion

