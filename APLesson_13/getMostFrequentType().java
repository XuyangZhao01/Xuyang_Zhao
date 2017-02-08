public getMostFrequentType()
{
	int cars = 0;
	int figures = 0;
	
	for (toy:toys)
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
	if (figures>cars)
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