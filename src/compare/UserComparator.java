package compare;
/*
 *	һ����ʵ����Camparable�ӿ�����������Ķ���֮���ǿ����໥�Ƚϵģ�
	����������ɵļ��ϾͿ���ֱ��ʹ��sort��������
	Comparator���Կ���һ���㷨��ʵ�֣����㷨�����ݷ��룬ComparatorҲ�������������ֻ�����ʹ�ã�
	1��������ʦû�п��ǵ��Ƚ������û��ʵ��Comparable������ͨ��Comparator��ʵ����������ظı������
	2������ʹ�ö��������׼���������򡢽����
*/

import java.util.Arrays;
import java.util.Comparator;

public class UserComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		return ((UserComparable) o1).getAge() - ((UserComparable) o2).getAge();
	}

	/**
	 * ���Է���
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