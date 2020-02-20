package basics;

import java.util.List;

import redis.clients.jedis.Jedis;

public class RedisListExample {

	public static void main(String[] args) {
		Jedis jedis = RedisUtils.getConnection();
		
		String key = "name";
		
		jedis.lpush(key, "Ajay");
		jedis.lpush(key, "Ashish");
		jedis.lpush(key, "Arjun");
		
		List<String> vals = jedis.lrange(key, 0, 2);
		
		vals.forEach((val) -> System.out.println(val));
	}
	
}
