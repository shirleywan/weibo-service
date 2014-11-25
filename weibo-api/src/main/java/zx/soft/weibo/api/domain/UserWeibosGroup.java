package zx.soft.weibo.api.domain;

import java.util.Random;
import java.util.TreeMap;

/**
 * 用户发布的微博，按时间段统计结果
 * 
 * @author wanggang
 *
 */
public class UserWeibosGroup {

	// 增量结果
	private TreeMap<String, Integer> increment = new TreeMap<>();
	// 全量结果
	private TreeMap<String, Integer> allcount = new TreeMap<>();

	public UserWeibosGroup instance() {
		Random random = new Random();
		for (int i = 1; i <= 9; i++) {
			this.increment.put("2014-0" + i, random.nextInt(200));
			this.allcount.put("2014-0" + i, random.nextInt(200));
		}
		this.increment.put("2014-10", random.nextInt(100));
		this.allcount.put("2014-10", random.nextInt(100));
		return this;
	}

	public TreeMap<String, Integer> getIncrement() {
		return increment;
	}

	public void setIncrement(TreeMap<String, Integer> increment) {
		this.increment = increment;
	}

	public void setIncrement(String key, int value) {
		this.increment.put(key, value);
	}

	public TreeMap<String, Integer> getAllcount() {
		return allcount;
	}

	public void setAllcount(TreeMap<String, Integer> allcount) {
		this.allcount = allcount;
	}

	public void setAllcount(String key, int value) {
		this.allcount.put(key, value);
	}

}
