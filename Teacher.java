package class5;

public class Teacher {
	private String name;
	private String gender;
	private int Phone;
	private String university;
	
	Teacher(){
		}
	
	public Teacher(String name, String gender, int phone, String university) {
        this.name = name;
		this.gender = gender;
		Phone = phone;
		this.university = university;
	}
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	
	
	

}
