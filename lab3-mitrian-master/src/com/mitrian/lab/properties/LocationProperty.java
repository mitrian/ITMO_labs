package com.mitrian.lab.properties;

import java.util.Objects;

public class LocationProperty implements EntityProperty
{
	private String location;

	public LocationProperty(String location)
	{
		this.location = location;
	}

	@Override
	public Object getProperty()
	{
		return location;
	}

	@Override
	public void setProperty(Object property)
	{
		if (property instanceof String)
			setProperty((String) property);
	}

	protected void setProperty(String property)
	{
		location = property;
	}

	@Override
	public String toString()
	{
		return "[" + location + "]";
	}

	@Override
	public int hashCode()
	{
		return Objects.hashCode(this) + Objects.hashCode(location);
	}

	@Override
	public boolean equals(Object o)
	{
		if (o instanceof NameProperty lp)
			return hashCode() == lp.hashCode();

		return false;
	}
}
