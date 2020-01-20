import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
        HttpInvokerTest remoteService = (HttpInvokerTest) context.getBean("remoteService");
        String clientTest = remoteService.getTestPo("测试下clientTest");
        System.out.println(clientTest);
    }
}
