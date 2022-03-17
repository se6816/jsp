# jsp
springboot jsp 설정방식

pom.xml 추가해야할 의존성
```
<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
</dependency>
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
    <version>1.2</version>
</dependency>
```


yml 파일에 추가해야하는 것
```
spring:
  mvc:
    view:
      prefix: /WEB-INF/views/         
      suffix: .jsp
```
      
src 폴더 아래에 webapp 폴더 생성하고 그 아래에 prefix 경로대로 생성(/WEB-INF/views) 
