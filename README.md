# designPattern
<br>

## 目录

### UML时序图
* [UML时序图讲解](#UML时序图讲解)
### 软件设计七大原则
* [开闭原则](#开闭原则)
* [依赖倒置原则](#依赖倒置原则)
* [单一职责原则](#单一职责原则)
* [接口隔离原则](#接口隔离原则)
* [迪米特原则](#迪米特原则)
* [里式替换原则](#里式替换原则)
* [合成(组合)/聚合复用原则](#合成(组合)/聚合复用原则)
### 简单工厂
* [简单工厂 - 定义与类型](#简单工厂-定义与类型)
* [简单工厂 - 适用场景](#简单工厂-适用场景)
* [简单工厂 - 优点](#简单工厂-优点)
* [简单工厂 - 缺点](#简单工厂-缺点)
* [简单工厂 - coding](#简单工厂-coding)
### 工厂方法
* [工厂方法 - 定义与类型](#工厂方法-定义与类型)
* [工厂方法 - 适用场景](#工厂方法-适用场景)
* [工厂方法 - 优点](#工厂方法-优点)
* [工厂方法 - 缺点](#工厂方法-缺点)
* [工厂方法 - coding](#工厂方法-coding)
* [工厂方法 - 源码解读](#工厂方法-源码解读)
### 抽象工厂
* [抽象工厂 - 定义与类型](#抽象工厂-定义与类型)
* [抽象工厂 - 适用场景](#抽象工厂-适用场景)
* [抽象工厂 - 优点](#抽象工厂-优点)
* [抽象工厂 - 缺点](#抽象工厂-缺点)
* [抽象工厂 - 产品等级结构与产品族](#抽象工厂-产品等级结构与产品族)
* [抽象工厂 - coding](#抽象工厂-coding)
### 建造者模式
* [建造者 - 定义与类型](#建造者-定义与类型)
* [建造者 - 适用场景](#建造者-适用场景)
* [建造者 - 优点](#建造者-优点)
* [建造者 - 缺点](#建造者-缺点)
* [建造者-建造者模式和工厂模式的区别?](#建造者-建造者模式和工厂模式的区别?)
* [建造者 - coding](#建造者-coding)
### 单例模式
* [单例 - 定义与类型](#单例-定义与类型)
* [单例 - 适用场景](#单例-适用场景)
* [单例 - 优点](#单例-优点)
* [单例 - 缺点](#单例-缺点)
* [单例 - 重点](#单例-重点)
* [单例 - 相关设计模式](#单例-相关设计模式)
* [单例 - coding](#单例-coding)
* [单例 - 序列化破坏单例模式原理解析及解决方案](#单例-序列化破坏单例模式原理解析及解决方案)
* [单例 - 反射攻击解决方案及原理分析](#单例-反射攻击解决方案及原理分析)








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
* 代码说明: 高层模块Geely不依赖具体的课程的实现.现在Geely需要上的课程是java和前端, 如果需要拓展新的课程, 直接实现课程的接口就可以了. Geely和课程都不用动.
* 核心思想就是面向接口编程.
* Spring的依赖注入, 控制反转就是这样的, 具体可以体会一下, @Autowird注解就是这个意思.
### 单一职责原则
* 定义: 不要存在多于一个导致类变更的原因
* 定义解释: 对于一个class有职责1和2, 需求变更时, 职责1的改变可能会影响职责2, 那这个就是不符合单一职责原则的. 所以职责1和职责2要分开由不同的class来负责.
* 一个类/ 接口/ 方法只负责一项职责
* 优点: 降低类的复杂度、提高类的可读性、提高系统的可维护性、降低变更引起的风险
* coding: com.design.principle.singleresponsibility
* Bird相关类是为了说明类级别上的单一职责原则
* ICourse相关类是为了说明接口级别上的单一职责原则
* Method相关类是为了说明方法级别上的单一职责原则
* 实际开发中, 接口和方法一定要遵循单一职责原则. 类级别可以根据项目的不同情况做调整. 因为如果类过多的话会导致类的爆炸.
### 接口隔离原则
* 定义: 用多个专门的接口, 而不使用单一的总接口, 客户端不应该依赖它不需要的接口
* 一个类对一个类的依赖, 应该建立在最小的接口上
* 建立单一的接口, 不要建立庞大臃肿的接口
* 尽量细化接口, 接口中的方法尽量少
* 注意适度原则, 一定要适度, 接口细化时要根据情况进行适度, 如果过于细的话会增加编程的复杂度.
* 优点: 符合我们常说的高内聚低耦合的设计思想, 从而使得类具有很好的可读性, 可拓展性和可维护性.
* coding: com.design.principle.interfacesegregation
* 和单一职责原则的区别: 单一职责原则指的是类, 接口, 方法的职责是单一的. 强调的是职责. 接口隔离原则主要约束的是接口, 针对程序整体框架的构建.
### 迪米特原则
* 定义: 一个对象应该对其他对象保持最少的了解. 又叫做最少知道原则.
* 尽量降低类与类之间的耦合
* 优点: 降低类之间的耦合
* 强调只和朋友交流, 不和陌生人说话
* 朋友: 出现在成员变量、方法的输入、输出参数中的类称为成员朋友类, 而出现在方法体内部的类不属于朋友类.
* coding: com.design.principle.demeter
* 代码说明: Boss让leader去查询课程. 如果按照第一种写法的话, Boss和不是朋友的Course产生了关联. 按照迪米特法则可采用第二种写法. Leader和课程产生关联.
### 里式替换原则
* 定义: 如果对每一个类型为T1的对象o1, 都有类型为T2的对象o2, 使得以T1定义的所有程序P在所有的对象o1都替换成o2时, 程序P的行为没有发生变化, 那么类型T2是类型T1的子类型.
* 定义拓展: 一个软件实体如果适用一个父类的话, 那一定适用于其子类, 所有引用父类的地方必须能透明地使用其子类的对象, 子类能够替换父类对象, 而程序逻辑不变.
* 引申意义: 子类可以拓展父类的功能, 但不能改变父类原有的功能.
* 含义1: 子类可以实现父类的抽象方法, 但不能覆盖父类的非抽象方法.
* 含义2: 子类中可以增加自己特有的方法.
* 含义3: 当子类的方法重载(*)父类的方法时, 方法的前置条件(即方法的输入/入参)要比父类方法的输入参数更宽松.
* 含义4: 当子类的方法实现父类的方法时(重写/重载或实现抽象方法), 方法的后置条件(即方法的输出/返回值)要比父类更严格或者相等.
* 优点1: 约束继承泛滥, 是开闭原则的一种体现.(继承的时候, 要考虑父类是否合适.比如人类有生娃的方法, 机器人继承人类的时候无法实现生娃的方法, 就不合适了)
* 优点2: 加强程序的健壮性, 同时变更时也可以做到非常好的兼容性, 提高程序的维护性, 拓展性. 降低需求变更时引入的风险.
* coding: com.design.principle.liskovSubstitution
* 代码说明: 里式替换原则说的是父类替换为子类的时候, 程序的行为应该是不变的. 但是在正方形继承长方形这个例子, 不符合里式替换原则.
* 解决办法是: ①创建一个新的类, 解除长方形和正方形的关系. ②正方形里面引用长方形. 
 ### 合成(组合)/聚合复用原则
* 定义: 尽量使用对象组合/聚合, 而不是继承关系达到软件复用的目的
* 聚合has-A, 组合contains-A, 继承is-A
* 优点:可以使系统更加灵活, 降低类与类之间的耦合度, 一个类的变化对其他类造成的影响相对较小.
* 何时使用合成/聚合、继承
* coding: com.design.principle.compositionaggregation
* 重构数据库连接代码, 对拓展开放, 对修改关闭.
## 简单工厂
### 简单工厂-定义与类型
* 定义: 由一个工厂对象决定创建出哪一种产品类的实例
* 类型: 创建型, 但不属于GOF23种设计模式
### 简单工厂-适用场景
* 工厂类负责创建的对象比较少
* 客户端(应用层)只知道传入工厂类的参数, 对于如何创建对象(逻辑)不关心
### 简单工厂-优点
* 只需要传入一个正确的参数, 就可以获取你所需要的对象, 而无须知道其创建细节
### 简单工厂-缺点
* 工厂类的职责相对过重, 增加新的产品需要修改工厂类的判断逻辑, 违背开闭原则
### 简单工厂-coding
* coding: com.design.pattern.creational.simplefactory
* VideoFactory是工厂, 缺点就是如果新加其他课程, 需要修改VideoFactory的判断逻辑. 修改就会带来风险.
* 以上问题的解决办法是: 反射获取类信息. 直接传入class文件.
## 工厂方法
### 工厂方法-定义与类型
* 定义: 定义一个创建对象的接口, 但让实现这个接口的类来决定实例化哪个类. 工厂方法让类的实例化推迟到子类中进行.
* 类型: 创建型
### 工厂方法-适用场景
* 创建对象需要大量重复的代码
* 客户端(应用层)不依赖于产品类实例如何被创建、实现等细节
* 一个类通过其子类来指定创建哪个对象
### 工厂方法-优点
* 用户只需要关心所需产品对应的工厂, 无须关心创建细节
* 加入新产品符合开闭原则, 提高拓展性
### 工厂方法-缺点
* 类的个数容易过多, 增加复杂度
* 增加了系统的抽象性和理解难度
### 工厂方法-coding
* coding: com.design.pattern.creational.factorymethod
* VideoFactory是抽象类, 他的子类, 规定产生哪一种类的视频. 应用层使用的时候只是创建子类的工厂. 其他的过程是不管的. 拓展的时候, 直接创建子类工厂就行.
### 工厂方法-源码解读
* Collection类的iterator接口就是一个工厂方法
* URLStreamHandlerFactory
* LoggerFactory
## 抽象工厂
### 抽象工厂-定义与类型
* 定义: 抽象工厂模式提供一个创建一系列相关或互相依赖对象的接口
* 无须指定它们具体的类
* 类型: 创建型
### 抽象工厂-适用场景
* 客户端(应用层)不依赖于产品类实例如何被创建、实现等细节
* 强调一系列相关的产品对象(属于同一产品族)一起使用创建对象需要大量重复的代码
* 提供一个产品类的库, 所有的产品以同样的接口出现, 从而客户端不依赖于具体实现
### 抽象工厂-优点
* 具体产品在应用层代码隔离, 无须关心创建细节
* 将一系列的产品族统一到一起创建
### 抽象工厂-缺点
* 规定了所有可能被创建的产品集合, 产品族中拓展新的产品困难, 需要修改抽象工厂的接口
* 增加了系统的抽象性和理解难度
### 抽象工厂-产品等级结构与产品族
![Image text](https://github.com/Fanxx7201/designPattern/blob/master/src/main/resources/pics/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82-%E4%BA%A7%E5%93%81%E7%AD%89%E7%BA%A7%E7%BB%93%E6%9E%84%E4%B8%8E%E4%BA%A7%E5%93%81%E6%97%8F.png)
* 工厂方法针对的是产品等级结构, 抽象工厂方法针对产品族.
* 产品族: 比如说美的公司, 生产了冰箱, 洗衣机, 风扇等
* 产品等级结构: 比如冰箱等级, 有各个公司生产的冰箱. 海尔的, 美的的, 格力的等等属于一个产品等级结构
### 抽象工厂-coding
* 场景: 一门课程, 比如说java课程, 不应该只有视频, 还有手记等等. 在工厂方法中, 一个视频就是一个课程. 但是在这个新的场景中, 视频+ 手记才是一个课程.如果用工厂方法的方式来做, 可能会导致类爆炸.
* 现有代码中, 已经有了java工厂和python工厂, 此时如果需要新增算法课程, 需要写一个算法的课程, 实现课程工厂类. 写一个video和一个article就可以了. 其他的都不用改变.
* 应用层: Test类. 应用层代码和具体的课程和手记都是解耦的.
## 建造者
### 建造者-定义与类型
* 定义: 将一个复杂对象的构建与它的表示分离, 使得同样的构建过程可以创建不同的表示.
* 用户只需要指定需要建造的类型就可以得到他们, 建造过程及细节不需要知道
* 类型: 创建型
### 建造者-适用场景
* 如果一个对象有非常复杂的内部结构(很多属性)
* 想把复杂对象的创建和使用分离
### 建造者-优点
* 封装性好, 创建和使用分离
* 扩展性好、建造类之间独立、一定程度上解耦
### 建造者-缺点
* 产生多余的Builder对象
* 产品内部发生变化, 建造者都要修改, 成本较大
### 建造者-建造者模式和工厂模式的区别?
* 建造者模式更注重于方法的调用顺序, 工厂模式注重于创建产品
* 创建对象的粒度不同. 建造者模式可以创建复杂的产品, 由各种复杂的部件组成. 工厂模式创建出来的都是一样的.
* 关注点不同. 工厂模式创建出产品就行, 但是建造者模式不仅是创建产品, 还需要指定产品的具体部件.
### 建造者-coding
* 

## 单例
### 单例-定义与类型
* 定义: 保证一个类仅有一个实例, 并提供一个全局访问点
* 类型: 创建型
### 单例-适用场景
* 想确保任何情况下都绝对只有一个实例
### 单例-优点
* 在内存里只有一个实例, 减少了内存开销
* 可以避免对资源的多重占用
* 设置全局访问点, 严格控制访问(对外不让你new出来, 只能通过方法去获取实例)
### 单例-缺点
* 没有接口, 拓展困难
### 单例-重点
* 私有构造器
* 线程安全
* 延迟加载(使用它的时候再创建)
* 序列化和反序列化安全
* 反射
### 单例-相关设计模式
* 单例模式和工厂模式
* 单例模式和享元模式
### 单例-coding
* 懒汉式coding: LazySingleton + T
* DoubleCheck双重检查: LazyDoubleCheckSingleton
* 单例设计模式-静态内部类-基于类初始化的延迟加载解决方案以及原理解析: StaticInnerClassSingleton(再看一下这里.......)
> JVM在类的初始化阶段(class被加载后, 类被线程使用之前), 在类的初始化中间, JVM会去加载一个锁. 这个锁可以同步多个线程对一个类的初始化.  
> 线程0是构造线程, 线程1是看不见2,3的重排序的.
* 饿汉式coding: HungrySingleton
> 优点: 代码简单  
> 缺点: 没有延迟加载的效果. 如果这个类从始至终都没有用过, 就造成了内存的浪费.  
> 饿汉和懒汉式的区别: 最大的区别就是延迟加载.
### 单例 - 序列化破坏单例模式原理解析及解决方案
* coding: 见Test类
### 单例 - 反射攻击解决方案及原理分析