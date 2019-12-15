package finalWork;

import java.io.*;
import java.nio.charset.StandardCharsets;
import finalWork.Project;
import finalWork.School;

public class ReadFile {
	//String path = "D:\\Java\\JavaLesson\\src\\2006年新立项目表.txt";
	public School Read(String path) {
		School fzu = new School();
		try {
			InputStreamReader inf = new InputStreamReader(new FileInputStream(path),StandardCharsets.UTF_8);
			BufferedReader bf = new BufferedReader(inf);
			String str=bf.readLine();
			while((str=bf.readLine())!=null) {
				String[] strArray = str.split("	");
				String college=null;
				if(strArray.length==6) {
					System.out.println("=="+strArray[0]+"==");
					int ID=Integer.parseInt(strArray[0]);
					String projectID=strArray[1];
					String name = strArray[2];
					String[] time = new String[2];
					time = strArray[3].split("-");
					int beginTime=Integer.parseInt(time[0]);
					int endTime=Integer.parseInt(time[1]);
					double money = Double.parseDouble(strArray[4]);
					String from = strArray[5];
					Project pro=new Project(college,ID,projectID,name,beginTime,endTime,money,from);
					fzu.CollegeList.getLast().addProject(pro);
				}
				else {
					college = str;
					System.out.println(college);
					fzu.addCollege(college);
				}
				
			}			
			bf.close();
		}catch(IOException e){
			System.out.println(e.toString());
		}
		return fzu;
	}
}