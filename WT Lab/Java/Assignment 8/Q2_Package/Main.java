/* 
	2) Define two packages as – General and Marketing. In General package
	define a class “Employee‟ with data members as empid(protected),
	ename(private) and a public method as earnings() which calculate total
	earnings as
		earnings = basic + DA (80% of basic) + HRA (15% of basic)
	In Marketing package define a class „sales‟ which is extending from
	“Employee‟ class and has a method tallowance() which calculates
	Travelling Allowance as 5% of total earning. Write the programs to find out
	total earning of a sales person for the given basic salary amount and print
	along with the emp id.
*/

import Marketing.Sales;
public class Main {
	public static void main(String[] args) {
		Sales salesPerson = new Sales(509, "Aritra Pal", 50000.0);
        salesPerson.displayTotalEarnings();
	}
}
	