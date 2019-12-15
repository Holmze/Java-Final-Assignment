package finalWork;

import java.util.LinkedList;

import finalWork.College;

public class School {
	String name  = "∏£÷›¥Û—ß";
	LinkedList<College> CollegeList = new LinkedList<College>();
	void addCollege(String name) {
		College col = new College(name);
		CollegeList.add(col);
	}
	String getCollageInfomation(School fzu) {
		String s = fzu.CollegeList.getFirst().getCollegeName()+" "+fzu.CollegeList.getFirst().getProjectCount()+" "+fzu.CollegeList.getFirst().getMoneyCount();
		fzu.CollegeList.removeFirst();
		s+="\r\n";
		return s;
	}
}
