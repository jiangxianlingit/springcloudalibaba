package jxl.rocketmq;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

/**
 * 生产者
 *
 * @author jiangxinlin
 * @create 2021-12-28-9:05
 */
public class RocketMQMessageTest {
   //发送消息
    public static void main(String[] args) throws InterruptedException, RemotingException, MQClientException, MQBrokerException {
        //1.创建生产者，设置组
        DefaultMQProducer producer = new DefaultMQProducer("myproducter-group");
        //2.设置地址
        producer.setNamesrvAddr("192.168.56.105:9876");
        //3.启动
        producer.start();
        //4.构建消息体
        Message message =new Message("title","Blok test",("body test").getBytes());
        //4.发送消息 , 超时时间
         SendResult result = producer.send(message,10000);
        System.out.println(result);
        //5.关闭
        producer.shutdown();
    }
}
