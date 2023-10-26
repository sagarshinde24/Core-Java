package com.company;             
// get method  = returns the variable value                             
// set method  = sets the value.
// read-only (if you only use the get method), or write-only (if you only use the set method)    

public class SchoolTest { 
	private String schoolName;
	private String principle;
	private int noofStudent;
	private int noofClass;
	private int Attendence;
	
	public String getschoolName() {
		return schoolName;
	}
	public String getprinciple() {
		return principle;
	}
	public int getnoofStudent() {
		return noofStudent;
	}
	public void setnoofStudent(int noofStudent) {                            //*
		this.noofStudent = noofStudent;
	}
	public int getnoofClass() {
		return noofClass;
	}
	public int setnoofClass( int noofClass) {
		return this.noofClass = noofClass;                     //*
	}
	public int setnAttendence( int Attendence) {
		return this.Attendence = Attendence;
	}
	SchoolTest(String schoolName, String principle, int noofStudent, int noofClass, int Attendence){
    this.schoolName = schoolName;
    this.principle = principle;
	this.noofStudent = noofStudent;
	this.noofClass = noofClass;
	this.Attendence = Attendence;
	}
	public void schoolDetails(){
		System.out.println("******** SCHOOL DETAILS ********");
		System.out.println("SchoolDrive name : "+schoolName);
		System.out.println("principle : "+principle);
		System.out.println("noofStudent : "+noofStudent);
		System.out.println("noofClass : "+noofClass);
		System.out.println("Attendence : "+Attendence);	
	}
class SchoolDrive{
    public static void main(String[] args) {
	  SchoolTest abc = new SchoolTest("sagarschool","abbbcd",5000,100,2000);
      abc.schoolDetails();
      abc.getnoofClass();
      
	}  
   }
}
