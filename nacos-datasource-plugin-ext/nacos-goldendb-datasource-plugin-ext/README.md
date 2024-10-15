# Nacos数据库适配插件

## 一、注意事项

### 1.1、修改数据库配置文件

在application.properties文件中修改goldendb的配置信息：

```properties
spring.datasource.platform=goldendb
db.pool.config.driverClassName=com.goldendb.jdbc.Driver
db.url.0=jdbc:goldendb:loadbalance://x.x.x.x:8880,x.x.x.x:8880,x.x.x.x:8880/nacos?characterEncoding=utf8&connectTimeout=1000&socketTimeout=3000&autoReconnect=true&useUnicode=true&useSSL=false&serverTimezone=UTC
db.user.0=nacos
db.password.0=xxxx
```

### 1.2、修改插件的pom.xml

推荐修改为最新的版本
```xml
<dependency>
  <groupId>com.goldendb</groupId>
  <artifactId>gdb_mysql-connector-java</artifactId>
  <version>5.1.46.57</version>
</dependency>
```

### 1.3、表结构初始化

表结构和mysql版本一致
