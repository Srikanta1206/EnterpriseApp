package nit.AnnotationDriven1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.wish.WishMessageGenerator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
        WishMessageGenerator generator1=ctx.getBean("com.nt.wish.WishMessageGenerator#0", WishMessageGenerator.class);
        generator1.display();
    }
}
