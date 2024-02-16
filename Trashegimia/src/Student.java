/**
 * 
 * enum eshte shkurtim i enumerator dhe perdoret per te krijuar nje liste me
 * konstante
 * enum emriEnumerator {lista e konstanteve te ndara me presje}
 * @author User
 *
 */
enum Status { VITIPARE, VITIDYTE, BACHELOR, MASTER};

public class Student extends Person {
 private Status status;
 
 public Student(String emri, String adresa, String telefoni, String email, Status status) {
	 
	 super(emri, adresa, telefoni,email);
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
	 return super.toString() + String.format("Statusi i studentit %s\n", status.name());
 }
}
