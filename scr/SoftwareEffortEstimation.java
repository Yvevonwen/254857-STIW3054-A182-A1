import java.util.Scanner;

public class SoftwareEffortEstimation{

	public static void main(String[] args) {
		user();
	}
		public static void user() {
		try {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int quality,quality1;
		int totalPoint=0,totalUseCase = 0, totalExperienceFactor=0; 
		int t1,t8,t,e1,e2,e3,e4,e5,e6,e7,e8;
		double totalManH=0,totalrate1=0 , totalrate2=0 , totalrate3=0 ,total1=0,total2=0,totalE1=0,totalE2=0,totalE3=0,totalE4=0,totalE5=0,totalE6=0,totalE7=0,totalE8=0;
		double ER;
		System.out.println("	Table 1. Weighting Actors for Complexity");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("|    Actor Type   |                Description             |  Weight Factor |");
		System.out.println("|-----------------|----------------------------------------|----------------|");
		System.out.println("|1.    Simple     |                Defined API             |        1       |");
		System.out.println("|2.   Average     |Interactive or Protocol driven interface|        2       |");
		System.out.println("|3.   Complex     |         Graphical User Interface       |        3       |");
		System.out.println("-----------------------------------------------------------------------------");
		
				
		for (int i=1;i<=3;i++) {
		System.out.print("Please enter quality for "+ i +" actor type:");
		quality = sc.nextInt();	
		int subTotal = quality * i;
		totalPoint = totalPoint + subTotal;		
		}
		System.out.println("Total Actor Point = "+ totalPoint);
		
		System.out.println("	Table 2. Weighting Use Case for Complexity");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("|   Use Case Type   |             Description           |  Weight Factor |");
		System.out.println("|-------------------|-----------------------------------|----------------|");
		System.out.println("|1.     Simple      |      3 or fewer transactions      |        5       |");
		System.out.println("|2.    Average      |         4 to 7 transactions       |       10       |");
		System.out.println("|3.    Complex      |      Greater than 7 transaction   |       15       |");
		System.out.println("--------------------------------------------------------------------------");
		for (int m=1;m<=3;m++) {
			System.out.print("Please enter quality for "+ m +" use case:");
			quality1 = sc.nextInt();		
			int subTtl = quality1 * (m*5);
			totalUseCase = totalUseCase + subTtl;
		}
		
		int UUCP = totalPoint + totalUseCase;
		System.out.println("Total Use Cases   = "+ totalUseCase);
		System.out.println("UUCP              = "+ UUCP);
		
		System.out.println("\n\t\t	Table 3. Weighting Technical Factors");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println(" Technical Factor |\t\tFator Description\t\t\t\t|");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("         T1       |\tMusthave a distributed solution\t\t\t\t|");
		System.out.println("         T2       |\tMust repond to specific performance objectives\t\t|");
		System.out.println("         T3       |\tMust meet end-user effieciency desires\t\t\t|");
		System.out.println("         T4       |\tComplex internal processing\t\t\t\t|");
		System.out.println("         T5       |\tCode must be reusable\t\t\t\t\t|");
		System.out.println("         T6       |\tMust be easy to install\t\t\t\t\t|");
		System.out.println("         T7       |\tMust be easy to use    \t\t\t\t\t|");
		System.out.println("         T8       |\tMust be portable     \t\t\t\t\t|");
		System.out.println("         T9       |\tMust be easy to change\t\t\t\t\t| ");
		System.out.println("        T10       |\tMust allow concurrent users\t\t\t\t|");
		System.out.println("        T11       |\tIncludes special security features\t\t\t|");
		System.out.println("        T12       |\tMust provide direct access for 3rd parties\t\t|");
		System.out.println("        T13       |\tRequires special user training facilities\t\t|");
		
		do {
		System.out.printf("Please enter project rating for T1 (0-5):");
		t1 = sc.nextInt();
		total1 = t1*2;
			}while (t1<0 || t1>5);	
			
		for (int m=1;m<5;m++) {
		do {
		System.out.printf("Please enter project rating for T%d (0-5):",m+1);
		 t = sc.nextInt();
		totalrate1 = totalrate1 + (t*1);
			}while (t<0 || t>5);
		}
				
		for (int n=1;n<3;n++) {
		do {
		System.out.printf("Please enter project rating for T%d (0-5):",n+5);
		 t = sc.nextInt();
		totalrate2 = totalrate2 + (t*0.5);
			}while (t<0 || t>5);
		}
		
		do {
			System.out.printf("Please enter project rating for T8 (0-5):");
			t8 = sc.nextInt();
			total2 = t8*2;
				}while (t8<0 || t8>5);	
		
		for (int x=1;x<6;x++) {
			do {
			System.out.printf("Please enter project rating for T%d (0-5):",x+8);
			 t = sc.nextInt();
			totalrate3 = totalrate3 + (t*1);
				}while (t<0 || t>5);
			}
		
		double tFactor = total1 + totalrate1 + totalrate2 + total2 + totalrate3 ;
		double TCF = (0.01*tFactor)+0.6;
		double SzUC = UUCP * TCF;
		System.out.println("Total T factor = "+Math.round(tFactor));
		System.out.println("Technical Complexity Factor = "+TCF+" TCF");
		System.out.println("The size of software(Use Case) = "+SzUC);
		
		System.out.println("\n\t\t	Table 4. Weighting Experience Factors");
		System.out.println("-------------------------------------------------------------------");
		System.out.println(" Experience Factor |\t\tFator Description\t\t|");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("         E1        |\tFamiliar with FPT software process\t| ");
		System.out.println("         E2        |\tApplication experience\t\t\t|");
		System.out.println("         E3        |\tParadigm experience (OO)\t\t|");
		System.out.println("         E4        |\tLead analyst capability\t\t\t| ");
		System.out.println("         E5        |\tMotivation\t\t\t\t| ");
		System.out.println("         E6        |\tStable Requirements\t\t\t|");
		System.out.println("         E7        |\tPart-time workers\t\t\t|");
		System.out.println("         E8        |\tDifficulty of programming language\t|");
		
		do {
			System.out.printf("Please enter project rating for E1 (0-5):");
			e1 = sc.nextInt();
			totalE1 = e1*1;
				}while (e1<0 || e1>5);	
		do {
			System.out.printf("Please enter project rating for E2 (0-5):");
			e2 = sc.nextInt();
			totalE2 = e2*0.5;
				}while (e2<0 || e2>5);	
		do {
			System.out.printf("Please enter project rating for E3 (0-5):");
			e3 = sc.nextInt();
			totalE3 = e3*1;
				}while (e3<0 || e3>5);	
		do {
			System.out.printf("Please enter project rating for E4 (0-5):");
			e4 = sc.nextInt();
			totalE4 = e4*0.5;
				}while (e4<0 || e4>5);	
		do {
			System.out.printf("Please enter project rating for E5 (0-5):");
			e5 = sc.nextInt();
			totalE5 = e5*0;
				}while (e5<0 || e5>5);	
		do {
			System.out.printf("Please enter project rating for E6 (0-5):");
			e6 = sc.nextInt();
			totalE6 = e6*2;
				}while (e6<0 || e6>5);	
		do {
			System.out.printf("Please enter project rating for E7 (0-5):");
			e7 = sc.nextInt();
			totalE7 = e7*-1;
				}while (e7<0 || e7>5);	
		do {
			System.out.printf("Please enter project rating for E8 (0-5):");
			e8 = sc.nextInt();
			totalE8 = e8*-1;
				}while (e8<0 || e8>5);	
		
		double eFactor = totalE1+totalE2+totalE3+totalE4+totalE5+totalE6+totalE7+totalE8;
		double EF = 1.4-(0.03*eFactor);
		double UCP = SzUC * EF;
		
		System.out.println("Total E Factor    = "+Math.round(eFactor));
		System.out.println("Experience Factor = "+EF);
		System.out.println("Use Case Points   = "+UCP);
		
		int count=0;
		if (e1<3) {
			count++;}
		if (e2<3) {
			count++;}
		if (e3<3) {
			count++;}
		if (e4<3) {
			count++;}
		if (e5<3) {
			count++;}
		if (e6<3) {
			count++;}
		if (e7>=3) {
			count++;}
		if (e8>=3) {
			count++;}
		
		if(count<=2){
			ER = 20.0;
			totalManH = ER*UCP;}
		else if(count>=3 && count<=4) {
			ER = 28.0;
			totalManH = ER*UCP;}
		else {
			System.out.println("The project team so that the numbers fall at least below 5");
		}	
		System.out.printf("Total man-hours(ER) = %.3f\n man-hours",totalManH);
		System.out.println("Enter Risk Coefficients in %:");
		double coefficients = sc.nextDouble();
		double adjustedManH = ((1.0+(coefficients/100) )* totalManH);
		System.out.printf("Adjusted man-hours = %.2f (adjusted man-hour)\n",adjustedManH);	
		System.out.println("Table 5 Weighting Reports for Complexity");
		System.out.println("------------------------");
		System.out.println("|  Report Type | Quality");
		System.out.printf("|     Simple   |   ");
		int qntyS = sc.nextInt();
		System.out.printf("|    Average   |   ");
		int qntyA = sc.nextInt();
		System.out.printf("|    Complex   |   ");
		int qntyC = sc.nextInt();	
		double totalReport = (qntyS*12)+(qntyA*20)+(qntyC*40);
		System.out.println("Total Report Man-hour Estimate : "+Math.round(totalReport));
		double totalMan = adjustedManH + totalReport;
		System.out.printf("The Total man-hours for the project = %.2f total man-hours",totalMan);
		}catch(Exception e) {
			System.out.println("Invalid input!Please enter number only!");
		}
	}		
	}	

		


