package chapter3.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class PayrollManager {
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	private Printer printer;

	public void writeEmployeePay() {
		Iterator<Employee> iter = employees.iterator();

		while (iter.hasNext()) {
			Employee curEmp = iter.next();
			printer.print(curEmp.calculatePay());
		}
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
}
