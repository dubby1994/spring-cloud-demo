# dubby

dubby的Spring Cloud


## eureka

本地测试时：

修改hosts文件：

```
127.0.0.1       peer1
127.0.0.1       peer2
```

```
java -jar eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
```

```
java -jar eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
```

## service-user-demo

本地测试时：

修改hosts文件：

```
127.0.0.1       discovery
```

```
java -jar service-user-demo-0.0.1-SNAPSHOT.jar
```