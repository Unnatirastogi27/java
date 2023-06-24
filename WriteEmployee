import java.util.Scanner;
import java.io.*;

class Employee {
	private int empNo;
	private String empName;
	private int empBasic;
	Employee(int empNo, String empName, int empBasic) {
		this.empNo = empNo;
		this.empName = empName;
		this.empBasic = empBasic;
	}
	
	int getEmpNo() {
		return this.empNo;
	} 
	
	void setEmpNo(int empNo) {
		this.empNo = empNo;
	}	
	
	String getEmpName() {
		return empName;
	}
	
	void setEmpName(String empName) {
		this.empName = empName;
	}
	
	int getEmpBasic() {
		return empBasic;
	}
	void setEmpBasic(int empBasic) {
		this.empBasic = empBasic;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empBasic=" + empBasic + "]";
	}
	
	
}
public class WriteEmployee {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter Employee's Details (EmpNo, EmpName, EmpBasic): ");
		int empNo = kb.nextInt();
		kb.nextLine();
		String empName = kb.nextLine();
		int empBasic = kb.nextInt();
		Employee e = new Employee(empNo, empName, empBasic);
		FileWriter fw = null;
		FileReader fr = null;
		int ch;
		try {
			sb.append("Employee [empNo=" +e.getEmpNo()+ ", empName=" +e.getEmpName()+ ", empBasic=" + e.getEmpBasic() + "]");
			fw = new FileWriter("emp.txt");
      fr = new FileReader(f);
			fw.write(sb.toString());
			while((ch = fr.read())!= -1){
				System.out.print((char)ch);
			}
		} catch(IOException io) {
			io.printStackTrace();
		}finally {
			try {
				fw.close();
				fr.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
	}

}
