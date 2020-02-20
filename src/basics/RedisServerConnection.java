package basics;

import redis.clients.jedis.Jedis;

public class RedisServerConnection {

	public static void main(String[] args) {
		
		Jedis jedis = RedisUtils.getConnection();
		
		System.out.println("Connection to the server established.");
		
		System.out.println("Server is running : " + jedis.ping());
	}
	
}
