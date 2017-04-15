package amqp;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class Util {
//	public final static String QUEUE_NAME_WORKERS = "durable_queue_fairDispatcher";
	public final static String RABBIT_MQSERVER = "localhost";
	public final static String ACCOUNT = "spring";
	public final static String PASSWORD = "123456";
	public static CachingConnectionFactory cachingConnectionFactory;
	
	public static class QUEUE_NAME{
		// Consumers - backend (distributed system design)
		public static final String CHANNEL_TO_BACKEND_QUEUE01 = "CHANNEL_TO_BACKEND_QUEUE01";
//		public static final String CHANNEL_TO_BACKEND_QUEUE02 = "CHANNEL_TO_BACKEND_QUEUE02";
		
		// Consumers - channel
		public static final String BACKEND_TO_WEBCHAT_QUEUE = "BACKEND_TO_WEBCHAT_QUEUE";
		public static final String BACKEND_TO_LINE_QUEUE = "BACKEND_TO_LINE_QUEUE";
		public static final String BACKEND_TO_WECHAT_QUEUE = "BACKEND_TO_WECHAT_QUEUE";
		public static final String BACKEND_TO_VOICE_QUEUE = "BACKEND_TO_VOICE_QUEUE";
	}
	
	
//	private static CachingConnectionFactory getCachingConnectionFactory(){
//		if (cachingConnectionFactory == null){
//			Util.cachingConnectionFactory = new CachingConnectionFactory();
//			Util.cachingConnectionFactory.setUsername("spring");
//			Util.cachingConnectionFactory.setPassword("123456");
//		}
//		return Util.cachingConnectionFactory;
//	}
	
//	public static AmqpTemplate getAmqpTemplate(){
//		return new RabbitTemplate(Util.getCachingConnectionFactory());
//	}
	
	
//	public static enum EXCHANGE_TYPE {
//		FANOUT, DIRECT;
//		
//		public String getV(){
//			return this.name().toLowerCase();
//		}
//	};
}
