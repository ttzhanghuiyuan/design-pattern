# 中介者模式

# 定义

中介者模式（Mediator Pattern）是一种行为型设计模式，它定义了一个封装一组对象如何交互的对象。通过中介者模式，对象之间的交互被封装在一个中介对象中，从而减少对象之间的直接依赖和耦合。

# 结构

* 中介者（Mediator）：定义了一个接口用于与各个同事对象通信。
* 具体中介者（ConcreteMediator）：实现中介者接口，并协调各个同事对象的交互。
* 同事（Colleague）：定义了一个接口，用于与中介者通信。
* 具体同事（ConcreteColleague）：实现同事接口，并与中介者进行交互。

# 优点

* 解耦：中介者模式将对象之间的交互封装在一个中介对象中，减少了对象之间的直接依赖和耦合。
* 集中控制：通过中介者模式，可以集中控制对象之间的交互，使得交互更加简单和清晰。

# 注意事项

* 复杂性增加：中介者模式可能会导致中介者对象变得过于复杂，因此需要谨慎设计中介者对象的职责。
* 性能问题：在使用中介者模式时，需要注意性能问题，尤其是对于复杂的交互。