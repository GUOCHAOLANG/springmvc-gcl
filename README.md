# springmvc-gcl
A springmvc+mysql learning examples

There is no use of maven.just use the jar package,to build a basic springmvc project.where the connection to the mysql database.
Made a basic login function.Here refer to the other developers of the project,to achieve their own again.
Here's their own learning and recording.

The first step,use Eclipse to create a Dynamic Web Project.

The second step,adding the required jar package.

The third step,configure the spring configuration file
E.g:
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
    xmlns:tx="http://www.springframework.org/schema/tx" xmlns:aop="http://www.springframework.org/schema/aop"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
         http://www.springframework.org/schema/beans/spring-beans-4.0.xsd
         http://www.springframework.org/schema/context
         http://www.springframework.org/schema/context/spring-context-4.0.xsd
         http://www.springframework.org/schema/tx
         http://www.springframework.org/schema/tx/spring-tx-4.0.xsd
         http://www.springframework.org/schema/aop
         http://www.springframework.org/schema/aop/spring-aop-4.0.xsd">
        
        <!--自动扫描的包名  -->
        <context:component-scan base-package="com.action"></context:component-scan>
        <!-- 默认的注解映射的支持 -->
        <!-- <mvc:annotation-driven /> -->
        <!--视图解释类  -->
        <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        	<property name="prefix" value="/WEB-INF/jsp/" />
        	<!--可为空，方便实现自己的依据扩展名来选择视图解释类的逻辑  -->
        	<property name="suffix" value=".jsp" />
        </bean>
</beans>

The fourth step,configuration web.xml.
Here to note the prefix of the spring configuration file name and servlet-name the same.This is the default(xxx-servlet.xml)


