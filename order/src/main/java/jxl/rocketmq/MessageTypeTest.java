package jxl.rocketmq;

import jxl.OrderApplication;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试消息类型
 *
 * @author jiangxinlin
 * @create 2021-12-28-10:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderApplication.class)
public class MessageTypeTest {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    //同步发送 参数，top 消息体 超时时间
    @Test
    public void testSyncSend(){
       SendResult result =  rocketMQTemplate.syncSend("test-topic-1:tag","这是一条同步消息",10000);
        System.out.println(result);
    }
    //异步消息 参数，top 消息体 超时时间  不会等回调后在发消息，处理完后再回调
    @Test
    public void testAsyncSend() throws InterruptedException{
         rocketMQTemplate.asyncSend("test-topic-1", "这是一条异步消息", new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                System.out.println(sendResult);
            }

            @Override
            public void onException(Throwable throwable) {
                System.out.println(throwable);
            }
        });
        System.out.println("===================");
        Thread.sleep(300000000);
    }
    //单向消息 参数，top 消息体 超时时间  不会等回调后在发消息，处理完后再回调
    @Test
    public void testNeoSend(){
        for (int i = 0; i < 10; i++) {
            rocketMQTemplate.sendOneWay("test-topic-1", "这是一条单向消息");
        }

    }
    //单向顺序消息 参数，top 消息体 超时时间，发送到哪个mq中  不会等回调后在发消息，处理完后再回调
    @Test
    public void testNeoOrderSend(){
        for (int i = 0; i < 10; i++) {
            rocketMQTemplate.sendOneWayOrderly("test-topic-1", "这是一条单向消息","xx");
        }

    }
}

