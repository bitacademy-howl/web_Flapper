package com.flapper.test;


import com.flapper.test.BeanClassInterface.BeanIsClassification;
import com.flapper.test.BeanClassInterface.MyBeanInterface;


import org.springframework.context.support.ClassPathXmlApplicationContext;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import com.flapper.test.byBeanAnnotation.MyBeanConfiguration;


public class app {
	
	public static  void main(String[] args) {
		
		// Bean XML 파일을 이용한 bean의 활용 ////////////////////////////////////////////////
		ApplicationContext app1 = new ClassPathXmlApplicationContext("bean.xml");
		
		MyBeanInterface beanObj1 = (MyBeanInterface)app1.getBean("testBean");
		BeanIsClassification beanObj2 = (BeanIsClassification)app1.getBean("beanObj");
		
		System.out.println(beanObj1);
		System.out.printf("%s %s", beanObj1, beanObj2);
		///////////////////////////////////////////////////////////////////////////////
		
		// annotabion에 의한 Bean 제어 ////////////////////////////////////////////////////
		ApplicationContext app2 = new AnnotationConfigApplicationContext(MyBeanConfiguration.class);
		MyBeanInterface bean2 = (MyBeanInterface)app2.getBean(MyBeanInterface.class);
		System.out.println(bean2);

		
//		BeanContext beans = null;
//		beans.add(beanObj2);
//		System.out.printf("%s %s", beans, beans.getBeanContext());
	}
}
