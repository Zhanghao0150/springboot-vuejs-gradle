
# 开发环境
node v16.13.1
ide visual studio code/IntelliJ IDEA Community/eclipse/android studio
java 11

# 修改jar包文件名
.\build.gradle

```
bootJar{
	baseName = "demo"
	version = "1.0.0"
}
```

# gradle脚本
- 编译jar

```
.\gradlew assemble
```
jar，输出路径：build\demo1.0.0.jar
