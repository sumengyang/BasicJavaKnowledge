package TestIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class fileCount {
	public static void main(String[] args) {
		int count = 0;
		InputStream streamReader = null;
		byte[] b = new byte[10000];
		int i = 0;
		try {
			long time = System.nanoTime();
			System.out.println("��ȡ�ļ���ʼʱ��Ϊ" + time*1e-9 + "s");
			long currentTime = System.currentTimeMillis();
			System.out.println("��ǰʱ��Ϊ" + System.currentTimeMillis()*1e-3 + "s");
			streamReader = new FileInputStream(new File(
					"d:/jar/files/linux.pdf"));// 1.png/win7IIS.doc
			 while (streamReader.read() != -1)
			 i = i + streamReader.read(b);
//			while (streamReader.read() != -1)
//				i++;
			System.out.println("�ļ�����Ϊ��" + i + "�ֽ�");
			time = System.nanoTime() - time;
			System.out.println("��ȡ�ļ�ʱ��Ϊ" + time*1e-9 + "s");
			System.out.println("��ǰʱ��Ϊ" + System.currentTimeMillis()*1e-3 + "s");
			System.out.println("��ǰʱ��Ϊ" + (System.currentTimeMillis()-currentTime)*1e-3 + "s");
		} catch (final Exception e) {
			e.printStackTrace();
		} finally {
			try {
				streamReader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
