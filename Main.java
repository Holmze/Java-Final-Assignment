package finalWork;

import finalWork.ReadFile;
import java.io.File;
import finalWork.GetFile;
import finalWork.WriteFile;

public class Main{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//String[] year = {"2006","2007","2008"};
		File file = new File("D:\\Java\\FinalWork\\src\\txtdata");
		GetFile getfile = new GetFile(file);
		String[] year = getfile.getYear();
		for(int i=0;i<getfile.getFileCount();i++) {
			AThread a = new AThread();
			a.run(year[i]);
		}
	}

}
class AThread extends Thread{
	public void run(String year) {
		String path = "D:\\Java\\FinalWork\\src\\txtdata\\"+year+"年新立项目表.txt";
		ReadFile rf = new ReadFile();
		WriteFile wf = new WriteFile();
		wf.Write(rf.Read(path),year);
		try {
			sleep(5);
		}catch(InterruptedException e) {
		}
	}
}
