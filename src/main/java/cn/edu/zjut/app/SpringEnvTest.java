package cn.edu.zjut.app;

import cn.edu.zjut.bean.IItem;
import cn.edu.zjut.bean.IItemOrder;
import cn.edu.zjut.bean.ItemOrder;
import cn.edu.zjut.bean.ShoppingCart;
import cn.edu.zjut.event.EmailEvent;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.util.*;

public class SpringEnvTest
{
    public static void main(String[] args)
    {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

//        IItem item1 = (IItem) ctx.getBean("item1");
//        System.out.println(item1.getItemID());
//        System.out.println(item1.getTitle());
//        System.out.println(item1.getDescription());
//        System.out.println(item1.getCost());
//        IItem item2 = (IItem) ctx.getBean("item2");
//        System.out.println(item2.getItemID());
//        System.out.println(item2.getTitle());
//        System.out.println(item2.getDescription());
//        System.out.println(item2.getCost());

//        System.out.println("getBean(item1)---1");
//        IItem item11 = (IItem) ctx.getBean("item1");
//        System.out.println("getBean(item1)---2");
//        IItem item12 = (IItem) ctx.getBean("item1");
//        System.out.println("getBean(item2)---1");
//        IItem item21 = (IItem) ctx.getBean("item2");
//        System.out.println("getBean(item2)---2");
//        IItem item22 = (IItem) ctx.getBean("item2");

//        IItemOrder itemorder1 = (IItemOrder)ctx.getBean("itemOrder1");

//        IItemOrder itemorder2 = (IItemOrder)ctx.getBean("itemOrder2");

//        IItemOrder itemorder1 = (IItemOrder) ctx.getBean("itemOrder1");
//        System.out.println("书名：" + itemorder1.getItem().getTitle());
//        System.out.println("数量：" + itemorder1.getNumItems());
//        IItemOrder itemorder2 = (IItemOrder) ctx.getBean("itemOrder2");
//        System.out.println("书名：" + itemorder2.getItem().getTitle());
//        System.out.println("数量：" + itemorder2.getNumItems());

//        ShoppingCart shoppingCart = (ShoppingCart) ctx.getBean("shoppingcart");
//        List<ItemOrder> list = shoppingCart.getItemsOrdered();
//        for (ItemOrder itemorder : list)
//        {
//            System.out.println("书名：" + itemorder.getItem().getTitle());
//            System.out.println("数量：" + itemorder.getNumItems());
//        }

//        ShoppingCart shoppingCart = (ShoppingCart) ctx.getBean("shoppingcart");
//        Map<String, ItemOrder> list = shoppingCart.getItemsOrdered();
//        Iterator it = list.keySet().iterator();
//        while (it.hasNext())
//        {
//            String key = (String) it.next();
//            ItemOrder itemorder = list.get(key);
//            System.out.println("key = " + key);
//            System.out.println("书名：" + itemorder.getItem().getTitle());
//            System.out.println("数量：" + itemorder.getNumItems());
//        }

//        ClassPathResource res = new ClassPathResource("applicationContext.xml");
//        XmlBeanFactory factory = new XmlBeanFactory(res);
//        IItemOrder itemorder1 = (IItemOrder) factory.getBean("itemOrder1");

//        ApplicationContext ctx = new ClassPathXmlApplicationContext( "applicationContext.xml");
//        IItemOrder itemorder1 = (IItemOrder) ctx.getBean("itemOrder1");

//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Object[] objects = new Object[]{"HelloWorld", new Date()};
////        String message = ctx.getMessage("HelloWorld", objects, Locale.CHINA);
//        String message = ctx.getMessage("HelloWorld", objects, Locale.US);
//        System.out.println(message);

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmailEvent ele = new EmailEvent("hello", "spring_test@zjut.edu.cn", "this is a test");
        ctx.publishEvent(ele);
    }
}