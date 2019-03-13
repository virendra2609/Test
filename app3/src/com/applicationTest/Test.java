package com.applicationTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.viren.practice.CustomerBean;

public class Test {

	public static void main(String[] args) {
        Resource resource=new ClassPathResource("beans.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        CustomerBean bean=(CustomerBean)factory.getBean("custBean");
        CustomerBean bean1=(CustomerBean)factory.getBean("custBean");
        CustomerBean bean2=(CustomerBean)factory.getBean("custBean");
        System.out.println(bean);
        System.out.println(bean1);
        System.out.println(bean2);
	}

}
