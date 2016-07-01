package compare;
/*
 *	一个类实现了Camparable接口则表明这个类的对象之间是可以相互比较的，
	这个类对象组成的集合就可以直接使用sort方法排序。
	Comparator可以看成一种算法的实现，将算法和数据分离，Comparator也可以在下面两种环境下使用：
	1、类的设计师没有考虑到比较问题而没有实现Comparable，可以通过Comparator来实现排序而不必改变对象本身
	2、可以使用多种排序标准，比如升序、降序等
*/

import java.util.Arrays;
import java.util.Comparator;

public class UserComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		return ((UserComparable) o1).getAge() - ((UserComparable) o2).getAge();
	}

	/**
	 * 测试方法
	 */
	public static void main(String[] args) {
		UserComparable[] UserComparables = new UserComparable[] {
				new UserComparable("a", 30), new UserComparable("b", 20) };
		Arrays.sort(UserComparables, new UserComparator());
		for (int i = 0; i < UserComparables.length; i++) {
			UserComparable UserComparable = UserComparables[i];
			System.out.println(UserComparable.getId() + " "
					+ UserComparable.getAge());
		}
	}

}