package ArrayListObjectBased;

public class Student {
	
	int rollno;
	String name;
	String course;
	float mark;
	String passorfail;
	
	public Student(int rollno, String name, String course, float mark) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.mark = mark;
		this.passorfail = null;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public float getMark() {
		return mark;
	}

	public String getPassorfail() {
		return passorfail;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}

	public void setPassorfail(String passorfail) {
		this.passorfail = passorfail;
	}
	
	@Override
	public String toString() {
		return "Roll No : " + rollno + " | Student Name : " + name + " | Course : " + course + " | StudentMark : "
				+ mark + " | Pass or Fail : " + passorfail;
	}
}
