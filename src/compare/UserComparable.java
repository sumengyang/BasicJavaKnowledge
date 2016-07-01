package compare;

/*
 * 	强行对实现它的每个类的对象进行整体排序，实现此接口的对象列表（和数组）
 * 	可以通过Collections.sort或Arrays.sort进行自动排序。
	接口方法：

 	@return 该对象小于、等于或大于指定对象o，分别返回负整数、零或正整数。  
	int compareTo(Object o);
*/ 
import java.util.Arrays;

public class UserComparable implements Comparable {

	private String id;
	private int age;

	public UserComparable(String id, int age) {
		this.id = id;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int compareTo(Object o) {
		return this.age - ((UserComparable) o).getAge();
	}

	/**
	 * 测试方法
	 */
	public static void main(String[] args) {
		UserComparable[] users = new UserComparable[] {
				new UserComparable("a", 30), new UserComparable("b", 20) };
		Arrays.sort(users);
		for (int i = 0; i < users.length; i++) {
			UserComparable user = users[i];
			System.out.println(user.getId() + " " + user.getAge());
		}
	}

}
