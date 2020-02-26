package find_constructioncost_for_abovestandard;
import decide.Decide_construction_cost;
import customer_input.Customer_house_construction;
public class Construction_cost_for_abovestandard_material 
{
public int fully_automated_home, cost, material_standard,total_area_of_house;
public Construction_cost_for_abovestandard_material(int fully_automated_home,int cost,int material_standard,int total_area_of_house)
{
this.fully_automated_home=fully_automated_home;
this.cost=cost;
this.material_standard=material_standard;
this.total_area_of_house=total_area_of_house;
}
public int constructioncost_for_above_standard()
{
return cost*total_area_of_house;
}
}

