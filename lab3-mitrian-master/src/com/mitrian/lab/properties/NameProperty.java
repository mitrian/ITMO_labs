package com.mitrian.lab.properties;

import java.util.Objects;

public class NameProperty implements EntityProperty
{
	private String name;

	public NameProperty(String name)
	{
		this.name = name;
	}

	@Override
	public void setProperty(Object property)
	{
		if (property instanceof String)
			setProperty((String) property);
	}

	protected void setProperty(String property)
	{
		name = property;
	}

	@Override
	public Object getProperty()
	{
		return name;
	}

	@Override
	public String toString()
	{
		return name;
	}

	@Override
	public int hashCode()
	{
		return Objects.hashCode(this) + Objects.hashCode(name);
	}

	@Override
	public boolean equals(Object o)
	{
		if (o instanceof NameProperty np)
			return hashCode() == np.hashCode();

		return false;
	}
}
