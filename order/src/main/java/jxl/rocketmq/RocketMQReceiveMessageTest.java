package jxl.rocketmq;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

/**
 * 接收消息
 *
 * @author jiangxinlin
 * @create 2021-12-28-9:34
 */
public class RocketMQReceiveMessageTest {
    public static void main(String[] args) throws MQClientException {
        //1.创建消费者，设置组
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("myconsumer-group");
        //2.设置地址
        consumer.setNamesrvAddr("192.168.56.105:9876");
        //3.订阅主题标签
        consumer.subscribe("title","*");

        //4.接收消息
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                //消费逻辑
                System.out.println("message=>>>>"+list);
                //返回消费成功状态
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
        //5.启动消费者
        consumer.start();
    }
}
