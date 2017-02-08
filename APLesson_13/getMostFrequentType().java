public getMostFrequentType()
{
	int cars = 0;
	int figures = 0;
	
	for (toy:toyList)
	{
		if (toy.equals ("Car"))
		{
			cars++;
		
		}
		else
		{
			figures++;
		}
	}
	if (cars>figures)
	{
		return "Cars";
	}
	else if (figures>cars)
	{
		return "Action Figures";
	}
	else
	{
		return "Equal amounts of action figures and cars!";
	}
}
public String toString()
{
	return toyList();
}
public getMostFrequentToy()
{
	String name = "name";
	int max =  int.MIN_VALUE ;
	for (toy:toyList)
	{
		if (max<count.toy)
		{
			max=count;
			name=name.toy;
		}
	}
	return name;
}