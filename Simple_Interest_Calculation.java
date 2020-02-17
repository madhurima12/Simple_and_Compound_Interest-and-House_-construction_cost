package find_simple_interest;
import client_interest.Client_interest_calculation;
interface Interest
{
public abstract double simple_interest();
}
public class Simple_Interest_Calculation extends Client_interest_calculation implements Interest
{
public double principal,rate_of_interest,time;
public Simple_Interest_Calculation(double principal,double rate_of_interest,double time)
{
this.principal=principal;
this.rate_of_interest=rate_of_interest;
this.time=time;
}
public double simple_interest()
{
return ((principal*rate_of_interest*time))/100;
}
}