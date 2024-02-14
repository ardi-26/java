
enum Status {VITIPARE, VITIDYTE, BACHELOR, MASTER};


public class Student extends Person {
private Status status;
 
/**
 * 
 */
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

/**
 * @param emri
 * @param adresa
 * @param telefoni
 * @param email
 * @param status
 */
public Student(String emri, String adresa, String telefoni, String email, Status status) {
	super(emri, adresa, telefoni, email);
	this.status = status;
}

/**
 * @return the status
 */
public Status getStatus() {
	return status;
}

/**
 * @param status the status to set
 */
public void setStatus(Status status) {
	this.status = status;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return String.format("%sStatusi: %s\n",super.toString(), this.getStatus().name());
};



}
