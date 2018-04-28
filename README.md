# Ngrams-Service

### 软件工程经济学第三次作业
### 框架；Spring Boot
### 日志工具：log4j2
### 构建工具：maven
#### 服务：随机生成文本
#### URL格式：localhost:8080/?value_n={}&word_num={}&filename={}

#### 本次作业使用spring security来进行用户验证，登录上述url，若没有登陆，则会自动重定向到登陆界面，本次作业实现了登陆界面，注册界面，注销操作等

#### 值得说明的是，在本次作业中，我将所有的用户都存在本地的mysql数据库上，任老师检查时由于数据库配置不同，无法运行，为了任老师检查作业，我设置了存储在内存里的两个用户：
+  username : admin password : admin role : admin 
+  username : user password : 123456 role : user
#### 任老师登录可直接使用这两个用户
