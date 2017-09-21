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

访问[http://peer1:8761/](http://peer1:8761/)，[http://peer2:8762/](http://peer2:8762/)

## service-user-demo

本地测试时：

```
java -jar service-user-demo-0.0.1-SNAPSHOT.jar
```

访问[http://localhost:8000/1](http://localhost:8000/1)

## consumer-user-ribbon-demo

本地测试时：

```
java -jar consumer-user-ribbon-demo-0.0.1-SNAPSHOT.jar
```

访问[http://localhost:8010/ribbon/1](http://localhost:8010/ribbon/1)

## consumer-user-feign-demo

本地测试时：

```
java -jar consumer-user-feign-demo-0.0.1-SNAPSHOT.jar
```

访问[http://localhost:8020/feign/1](http://localhost:8020/feign/1)

## consumer-user-ribbon-demo-with-hystrix

本地测试时：

```
java -jar consumer-user-ribbon-demo-with-hystrix-0.0.1-SNAPSHOT.jar
```

访问[http://localhost:8011/ribbon/1](http://localhost:8011/ribbon/1)

## consumer-user-feign-demo-with-hystrix

本地测试时：

```
java -jar consumer-user-feign-demo-with-hystrix-0.0.1-SNAPSHOT.jar
```

访问[http://localhost:8021/feign/1](http://localhost:8021/feign/1)

## config-server

本地测试时：

```
java -jar config-server-0.0.1-SNAPSHOT.jar 
```

访问[http://localhost:8040/test-dev.properties](http://localhost:8040/test-dev.properties)