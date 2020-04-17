package basics;

public class Student {

	private int stuid;
	private String sname;
	private String course;
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", sname=" + sname + ", course=" + course + "]";
	}
	
}
