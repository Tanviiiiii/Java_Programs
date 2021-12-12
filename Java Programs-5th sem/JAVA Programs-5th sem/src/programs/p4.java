package programs;

public class p4 {
	String name;
	int rollno;
	String adr;

	public static void main(String[] args) {
		p4 p = new p4();
		p4 pp = new p4();
		p.name = "tanvi";
		p.rollno = 19;
		p.adr = "amity university";

		pp.name = "sara";
		pp.rollno = 12;
		pp.adr = "amity university";

		System.out.println("name\t rollno\t address");
		System.out.println(p.name + "\t" + p.rollno + "\t" + p.adr);
		System.out.println(pp.name + "\t" + pp.rollno + "\t" + pp.adr);

	}

}
