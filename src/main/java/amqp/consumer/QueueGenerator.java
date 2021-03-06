package amqp.consumer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import amqp.Util;

@Configuration
public class QueueGenerator {
	@Bean
	public Queue CHANNEL_TO_BACKEND_QUEUE01() {
    	System.out.println("CHANNEL_TO_BACKEND_QUEUE01() called");
		return new Queue(Util.QUEUE_NAME.CHANNEL_TO_BACKEND_QUEUE01);
	}	
	
	@Bean
	public Queue BACKEND_TO_WEBCHAT_QUEUE() {
    	System.out.println("BACKEND_TO_WEBCHAT_QUEUE() called");
		return new Queue(Util.QUEUE_NAME.BACKEND_TO_WEBCHAT_QUEUE);
	}	

	@Bean
    public Queue BACKEND_TO_LINE_QUEUE() {
    	System.out.println("BACKEND_TO_LINE_QUEUE() called");
        return new Queue(Util.QUEUE_NAME.BACKEND_TO_LINE_QUEUE);
    }	
        
    @Bean
    public Queue BACKEND_TO_WECHAT_QUEUE() {
    	System.out.println("BACKEND_TO_WECHAT_QUEUE() called");
    	return new Queue(Util.QUEUE_NAME.BACKEND_TO_WECHAT_QUEUE);
    }
    
    @Bean
    public Queue BACKEND_TO_VOICE_QUEUE() {
    	System.out.println("BACKEND_TO_VOICE_QUEUE() called");
    	return new Queue(Util.QUEUE_NAME.BACKEND_TO_VOICE_QUEUE);
    }
    
    
}
