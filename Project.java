package finalWork;

public class Project {
	String college;
	int ID;
	String projectID;
	String name;
	int beginTime;
	int endTime;
	double money;
	String from;
	Project(String college,int ID,String projectID,String name,int beginTime,int endTime,double money,String from){
		this.college = college;
		this.ID=ID;
		this.projectID=projectID;
		this.name=name;
		this.beginTime=beginTime;
		this.endTime=endTime;
		this.money=money;
		this.from=from;
	}
	Project(){
		
	}
}