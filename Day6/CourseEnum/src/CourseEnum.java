
public enum CourseEnum {
	DAC("Diploma in Advanced Computing"),
	DESD("Embedded Systems and Design"),
	DVLSI("Very Large Scale Integration");
	
	private String values;
	private CourseEnum(String str) {
		this.values = str;
	}
	
	public String getValue() {
		return this.values;
	}
}