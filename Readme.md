# 简介
演示 spring security web 基本用法

## 运行
`mvn clean install `
部署war 
访问 http://localhost:8080/security1/login 登录 ，用户名 tom 密码 123456
登录成功后访问 http://localhost:8080/security1/user/info 查看用户

## 关键点
1. web.xml filter
2. spring-servlet.xml <security:http>....


