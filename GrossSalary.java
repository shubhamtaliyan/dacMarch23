class GrossSalary {
	public static void main(String args[]) {
		double ba=10000.8989, ta=5600.6776, da=0.14*ba, pet=7000.34435, td=0.0176*da, gs;
		System.out.println("Your basic is: "+ba);
		System.out.println("Your TA is: "+ta);
		System.out.println("Your DA is: "+da);
		System.out.println("Your Petrol allowance is: "+pet);
		System.out.println("Your Tax Deduction is: "+td);
		gs=ba+ta+da+pet-td;
		System.out.println("Your Gross Salary is: "+gs);
		}
    }