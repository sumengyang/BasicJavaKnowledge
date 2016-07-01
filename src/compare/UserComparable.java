package compare;

/*
 * 	ǿ�ж�ʵ������ÿ����Ķ��������������ʵ�ִ˽ӿڵĶ����б������飩
 * 	����ͨ��Collections.sort��Arrays.sort�����Զ�����
	�ӿڷ�����

 	@return �ö���С�ڡ����ڻ����ָ������o���ֱ𷵻ظ������������������  
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
	 * ���Է���
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
