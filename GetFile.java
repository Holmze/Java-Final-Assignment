package finalWork;

import java.io.File;

public class GetFile {
	File path;
	GetFile(File path){
		this.path=path;
	}
	String getFileName() {
		String fileName=null;
		File[] files=this.path.listFiles();
		for(File f:files) {
			if(f.isFile()) {
				fileName=f.getName();
			}
			else break;
		}
		return fileName;
	}
	int getFileCount() {
		int count=0;
		File[] files=this.path.listFiles();
		for(File f:files) {
			if(f.isFile()) {
				count++;
			}
			else break;
		}
		return count;
	}
	String[] getYear() {
		String[] year = new String[3];
		String fileName=null;
		File[] files=this.path.listFiles();
		int i=0;
		for(File f:files) {
			if(f.isFile()) {
				fileName=f.getName();
				year[i++] = fileName.substring(0, 4);
			}
			else break;
		}
		return year;
	}
}
