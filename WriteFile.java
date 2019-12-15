package finalWork;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
public class WriteFile {

	public void Write(School fzu,String year) {
		try {
			OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream("D:\\Java\\FinalWork\\src\\result\\"+year+"统计结果"+".txt"),StandardCharsets.UTF_8);
	        BufferedWriter writer=new BufferedWriter(write);          
	        while(!fzu.CollegeList.isEmpty()) {
				String info = fzu.getCollageInfomation(fzu);
				writer.write(info);
			}
			writer.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}