package amqp.consumer;

import java.io.UnsupportedEncodingException;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.Exchange;

import amqp.Util.QUEUE_NAME;
import static amqp.Util.*;

@Component 
public class ChannelConsumers {
        
    /** BACKEND -> CHANNEL **/
    @RabbitListener(queues = QUEUE_NAME.BACKEND_TO_WEBCHAT_QUEUE)
    public void process_BACKEND_TO_WEBCHAT_QUEUE(String data) throws UnsupportedEncodingException {
    	// 有byte - string 轉換問題
    	System.out.println("process_BACKEND_TO_WEBCHAT_QUEUE() called - [x] Received -  data: " + data);
//    	String words = new String(data.getBytes(), "UTF-8");
//    	System.out.println("words: " + words);
    }    
    
    @RabbitListener(queues = QUEUE_NAME.BACKEND_TO_LINE_QUEUE)
    public void process_BACKEND_TO_LINE_QUEUE(String data) throws UnsupportedEncodingException {
    	// 有byte - string 轉換問題
    	System.out.println("process_BACKEND_TO_LINE_QUEUE() called - [x] Received -  data: " + data);
//    	String words = new String(data.getBytes(), "UTF-8");
//    	System.out.println("words: " + words);
    }

    @RabbitListener(queues = QUEUE_NAME.BACKEND_TO_WECHAT_QUEUE)
    public void process_BACKEND_TO_WECHAT_QUEUE(String data) throws UnsupportedEncodingException {
    	// 有byte - string 轉換問題
    	System.out.println("process_BACKEND_TO_WECHAT_QUEUE() called - [x] Received -  data: " + data);
//    	String words = new String(data.getBytes(), "UTF-8");
//    	System.out.println("words: " + words);
    }

    @RabbitListener(queues = QUEUE_NAME.BACKEND_TO_VOICE_QUEUE)
    public void process_BACKEND_TO_VOICE_QUEUE(String data) throws UnsupportedEncodingException {
    	// 有byte - string 轉換問題
    	System.out.println("process_BACKEND_TO_VOICE_QUEUE() called - [x] Received -  data: " + data);
//    	String words = new String(data.getBytes(), "UTF-8");
//    	System.out.println("words: " + words);
    } 

    
    
}
