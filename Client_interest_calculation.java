package client_interest;
import java.io.PrintStream;
import find_simple_interest.Simple_Interest_Calculation;
import find_compound_interest.Compound_Interest_Calculation;
import java.util.Scanner;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
public class Client_interest_calculation
{
static
{
PrintStream my_out=new PrintStream(new FileOutputStream(FileDescriptor.out));
Scanner sc=new Scanner(System.in);

double principal,rate_of_interest,time;
int choice,x=1,enter=0;

while(x!=0)
{
my_out.print("Enter the principal\n");
principal=sc.nextDouble();
my_out.print("Enter the time\n");
time=sc.nextDouble();
my_out.print("Enter rate of interest\n");
rate_of_interest=sc.nextDouble();
Simple_Interest_Calculation s=new Simple_Interest_Calculation(principal,rate_of_interest,time);
Compound_Interest_Calculation c=new Compound_Interest_Calculation(principal,rate_of_interest,time);
my_out.print("1.Simple Interest\n");
my_out.print("2.Compound Interest\n");
my_out.print("Enter choice\n");
choice=sc.nextInt();
if(choice==1)
{
my_out.print("Simple Interest is\n");
my_out.print(s.simple_interest());
my_out.print("\n");
my_out.print("Do you want to continue.1 for yes 0 for no");
enter=sc.nextInt();
if(enter!=1)
{
my_out.print("Stopped");
break;
}
}
else if(choice==2)
{
my_out.print("Compound Interest is\n");
my_out.print(c.compound_interest());
my_out.print("\n");
my_out.print("Do you want to continue.1 for yes 0 for no");
enter=sc.nextInt();
if(enter!=1)
{
my_out.print("Stopped");
break;
}
}
else
{
my_out.print("Wrong choice");
x=0;
}
}
System.exit(0);
}
}