package com.gupaoedu.yangzk.ZipUtil;


import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class TestFiles {
	public static void main(String[] args) {
		try {
		byte[] bytes = TestFiles.getBytes();
		//加密
		String encode = Base64Util.encode(bytes);
		System.out.println("encode"+encode);
		//解密
		byte[] decode = Base64Util.decode(encode);
		System.out.println("decode"+encode);
		ByteArrayInputStream bis = new ByteArrayInputStream(decode);
		ZipInputStream zip = new ZipInputStream(bis);
		/*InputStreamReader 	reader = new InputStreamReader(zip, "UTF-8");
		BufferedReader Bin = new BufferedReader(reader);*/
		BufferedInputStream Bin=new BufferedInputStream(zip);
		String Parent="D:\\gupaoedu_homework\\day01_desin_parent\\src\\test\\java\\com\\gupaoedu\\yangzk\\ZipUtil\\"; //输出路径（文件夹目录）
		File Fout=null;
		ZipEntry entry;

			while((entry = zip.getNextEntry())!=null && !entry.isDirectory()){
				Fout=new File(Parent,entry.getName());
				if(!Fout.exists()){
					(new File(Fout.getParent())).mkdirs();
				}
				FileOutputStream out=new FileOutputStream(Fout);
				BufferedOutputStream Bout=new BufferedOutputStream(out);
				int b;
				while((b=Bin.read())!=-1){
					Bout.write(b);
				}
				Bout.close();
				out.close();
				System.out.println(Fout+"解压成功");
			}
			Bin.close();
			zip.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}





	private static byte[] getBytes(){
		byte[] buffer = null;
		try {
			File file = new File("D:\\新建文本文档.zip");
			FileInputStream fis = new FileInputStream(file);
			ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
			byte[] b = new byte[1000];
			int n;
			while ((n = fis.read(b)) != -1) {
				bos.write(b, 0, n);
			}
			fis.close();
			bos.close();
			buffer = bos.toByteArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return buffer;
	}

}
