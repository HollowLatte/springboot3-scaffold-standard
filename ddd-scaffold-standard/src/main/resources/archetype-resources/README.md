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

## 模块关系

* 所有模块可依赖 types 通用模块
* domain 不可直接依赖 infrastructure；但 infrastructure 需依赖 domain
* adapter 不可直接依赖 infrastructure；但其他模块基本都可引用
* start 只可依赖 adapter ；其他模块都不可依赖