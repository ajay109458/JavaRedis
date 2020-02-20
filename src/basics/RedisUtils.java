package basics;

import redis.clients.jedis.Jedis;

public class RedisUtils {

	private static Jedis connection = null;
	
	public static Jedis getConnection() {
		if (connection == null) {
			connection = new Jedis("redis-15186.c74.us-east-1-4.ec2.cloud.redislabs.com", 15186);
			connection.auth("3dRoHC7RErJHDoFL83Lkcl810pAn9Nmd");
		}
		
		return connection;
	}
	
}
