## 本地仓库使用

1. 安装脚手架到本地仓库：
    ```shell
    mvn clean install
    ```

2. 使用脚手架生成工程：
    ```shell
    mvn archetype:generate \
   -DarchetypeArtifactId=ddd-scaffold-standard \
   -DarchetypeGroupId=com.hollowlatte.archetypes \
   -DarchetypeVersion=1.0.0 \
   -DgroupId=com.hollowlatte.hello \
   -Dpackage=com.hollowlatte.demo \
   -DartifactId=hello-ddd-standard \
   -Dversion=0.0.1 \
   -DinteractiveMode=false \
   -DarchetypeCatalog=local
    ```
> 可以指定生成的工程的目录`-DoutputDirectory=/hello`

> 注意：通过IDEA快捷执行命令时，点击shell对应的箭头进行执行，这样才可以正常运行分隔多行的Maven命令，而不是mvn对应的箭头，该箭头只会执行mvn所在的那一行的命令，不会执行其他行。

> 修改命令后如果执行失败，如果命令是正确的，那么排除下换行符\的后面是不是多了空格

## 远程仓库使用

1. 上传脚手架：
   ```shell
   mvn clean deploy -DskipTests
   ```

2. 使用脚手架生成工程：
   ```shell
   mvn archetype:generate -DinteractiveMode=false -DarchetypeGroupId=com.hollowlatte.archetypes -DarchetypeArtifactId=springboot3-scaffold-lite -DarchetypeVersion=1.0.0 -DgroupId=com.hollowlatte -DartifactId=hellotest -Dversion=0.0.1 -DoutputDirectory=../
   ```

## 生成效果

如果不想生成工程，但是想测试生成效果怎么办？

由于Archetype插件进行install或package等操作时，会默认会进行集成测试IT，使用src/test/resources/projects/basic/archetype.properties配置文件中的配置进行生成测试，
生成的测试工程在target/projects/basic/project/test下。

所以可以通过这个测试工程来看生成效果