package finalWork;

import finalWork.Project;
import java.util.*;

public class College {
	String CollegeName;
	LinkedList<Project> ProjectList = new LinkedList<Project>();
	int ProjectCount = 0;
	double MoneyCount = 0;
	College(String name){
		this.CollegeName = name;
	}
	String getCollegeName() {
		return this.CollegeName;
	}
	int getProjectCount() {
		return this.ProjectCount;
	}
	double getMoneyCount() {
		return this.MoneyCount;
	}
	void addProject(Project p) {
		ProjectList.add(p);
		ProjectCount++;
		this.MoneyCount +=p.money;
	}
}