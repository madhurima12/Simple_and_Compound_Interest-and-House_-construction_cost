package find_compound_interest;
import client_interest.Client_interest_calculation;
import java.lang.Math;
interface Interest
{
public abstract double compound_interest();
}
public class Compound_Interest_Calculation implements Interest
{
public double principal,rate_of_interest,time;
public Compound_Interest_Calculation(double principal,double rate_of_interest,double time)
{
this.principal=principal;
this.rate_of_interest=rate_of_interest;
this.time=time;
}
public double compound_interest()
{
return principal*Math.pow((rate_of_interest/100),time);
}
}
