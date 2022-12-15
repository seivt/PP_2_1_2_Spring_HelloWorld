import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                applicationContext.getBean("helloWorld", HelloWorld.class);
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                applicationContext.getBean("helloWorld", HelloWorld.class);
        System.out.println("Бины bean и bean2 указывают на один и тот же объект?\n Ответ:" +
                (bean == bean2));

        Cat cat = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println("Бины cat и cat2 указывают на один и тот же объект?\n Ответ:" +
                (cat == cat2));
    }
}