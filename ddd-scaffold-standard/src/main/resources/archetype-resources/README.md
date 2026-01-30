# SpringBoot3 脚手架

多模块SpringBoot3脚手架

**环境：**

* JDK: 21
* SpringBoot: 3.4.5

**使用须知：**

* 可直接运行Application启动，无需依赖任何中间件
* 默认不开启Redis、DB连接，可以手动去除掉配置中的 `spring.autoconfigure.exclude` 开启连接

**打包：**

```shell
mvn clean package
```

## DDD 模块关系

* 所有模块可依赖 types 通用模块
* domain 不可直接依赖 infrastructure；但 infrastructure 需依赖 domain
* adapter 不可直接依赖 infrastructure；但其他模块基本都可引用
* start 只可依赖 adapter ；其他模块都不可依赖

## 模块作用

* types模块：通用模块
* adapter模块：提供外部交互的接口、MQ消费者、定时任务入口等
* app模块：应用层，编排业务流程。只有大型或复杂的系统才需要，简单、普通项目可以去掉该模块。
    * 若简单项目中保留app模块，在app中可以允许引入infrastructure，直接调用infrastructure层的能力，作为规范、高效之间的一种折中处理
* client模块：与外部交互有关的数据传输类等，如HTTP请求入参、响应结果，展示给前端的VO等
* domain模块：领域层，关注业务逻辑
* infrastructure模块：基础设施层，包含各种数据访问、消息发送、缓存操作、外部接口调用等操作。通过实现domain层的接口，给domain层提供各种能力
* start模块：只能有启动类以及各种配置文件。如application.yml、Mybatis Mapper文件等