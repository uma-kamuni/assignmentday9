import java.util.*;
interface EmpWageBuilder {
       public void computeEmpWage( CompanyEmpWage obj );
       public void computeEmpWage( EmployeeWage.CompanyEmpWage obj );
}

public class EmployeeWage implements EmpWageBuilder {
@@ -36,12 +36,10 @@ public void computeEmpWage(CompanyEmpWage companyEmpWage) {
           totalEmpHrs = totalEmpHrs + empHrs;
	   empDailyWage = empHrs * companyEmpWage.getEmpRatePerHour();
           empDailyMonthlyTotalWage.add( empDailyWage );
            System.out.println("Day:"+totalWorkingDays +" Wage is : "+empDailyWage );
	}
      	}
	   totalEmpWage=( totalEmpHrs * companyEmpWage.getEmpRatePerHour());
           empDailyMonthlyTotalWage.add( totalEmpWage );
           companyEmpWage.setTotalEmpWage( totalEmpWage );
           System.out.println("Employee Monthly Wage of " + companyEmpWage.getCompanyName() + " is " + companyEmpWage.getTotalEmpWage());
        }
	//Main Function
     public static void main(String[] args) {
@@ -50,20 +48,45 @@ public static void main(String[] args) {
	      //ArrayList of Multiple Companies Wage

             ArrayList<CompanyEmpWage> company = new ArrayList<CompanyEmpWage>();
              // assign value to object of Companyempwage
        while (true) {

	    System.out.println("Please Enter your choice to show Company Monthly Total Wage ");
            System.out.println("1:For Dmart");
            System.out.println("2:For Relience ");
            System.out.println("3:For Bigbazar");
            System.out.println("4:For Exit Computation");

            Scanner sobj = new Scanner(System.in);
            int choice = sobj.nextInt();
            switch (choice) {
              case 1:
              company.add( new CompanyEmpWage("Dmart", 40, 20, 100));
              emp.computeEmpWage(company.get(0));
	      System.out.println("Employee Total wage is: " + company.get(0).getTotalEmpWage());
	      System.out.println();
              company.add( new CompanyEmpWage("Relience", 30, 22, 120));
	      break;              
              case 2:
	      company.add( new CompanyEmpWage("Relience", 30, 22, 120));
       	      emp.computeEmpWage(company.get(1));
	      System.out.println("Employee Total wage is: " + company.get(1).getTotalEmpWage());
	      System.out.println();
	      break;
	      case 3:
              company.add( new CompanyEmpWage("BigBazar", 45, 18, 90));
              emp.computeEmpWage(company.get(2));
	      System.out.println("Employee Total wage is: " + company.get(2).getTotalEmpWage());
	      System.out.println();
    }
    	      break;
	      case 4:
              System.exit(0);
              default:
                    System.out.println("Invalid Choice");
                    System.exit(0);
            }
	}
}

   class CompanyEmpWage {
   public static class CompanyEmpWage {

	  public String companyName=" ";
          public int empRatePerHour=0;
@@ -101,4 +124,5 @@ public int getTotalEmpWage(){
        return totalEmpWage;
    }

  }
}
