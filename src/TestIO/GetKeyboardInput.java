package TestIO;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GetKeyboardInput {
	public static void main(String args[]) throws IOException {
		// test1();
		// test2();
		test3();
	}

	private static void test1() throws IOException {
		System.out.println("please enter a char:");
		char i = (char) System.in.read();
		System.out.println("your char is :" + i);
	}

	private static void test2() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		System.out.println("Enter your value:");
		str = br.readLine();
		System.out.println("your value is : " + str);
	}

	private static void test3() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������������");
		String name = sc.nextLine();
		System.out.println("������������䣺");
		int age = sc.nextInt();
		System.out.println("��������Ĺ��ʣ�");
		float salary = sc.nextFloat();
		System.out.println("�����Ϣ���£�");
		System.out.println("������" + name + "\n" + "���䣺" + age + "\n" + "���ʣ�"
				+ salary);
		sc.close();
	}

}
// public static void main(String [] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println(�������������������);
// String name = sc.nextLine();
// System.out.println(��������������䣺��);
// int age = sc.nextInt();
// System.out.println(����������Ĺ��ʣ���);
// float salary = sc.nextFloat();
// System.out.println(�������Ϣ���£���);
// System.out.println(����������+name+��\n��+�����䣺��+age+��\n��+�����ʣ���+salary);
// }