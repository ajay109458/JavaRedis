package basics;

import redis.clients.jedis.Jedis;

public class RedisStringStore {

	public static void main(String[] args) {
		
		Jedis jedis = RedisUtils.getConnection();
		
		jedis.set("myfirstKey", "myfirstValue");
		
		System.out.println("Getting value for the key : " + jedis.get("myfirstKey"));
		
	}
	
}
