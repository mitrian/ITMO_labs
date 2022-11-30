package com.mitrian.lab.properties;

import java.util.Objects;

public class MoodProperty implements EntityProperty
{

	private Mood mood;

	public MoodProperty(Mood mood)
	{
		this.mood = mood;
	}

	@Override
	public void setProperty(Object property)
	{
		if (property instanceof Mood)
			setProperty((Mood) property);
	}

	protected void setProperty(Mood property)
	{
		mood = property;
	}

	@Override
	public Object getProperty()
	{
		return mood.toString();
	}

	@Override
	public String toString()
	{
		return mood.toString();
	}

	@Override
	public int hashCode()
	{
		return Objects.hashCode(this) + Objects.hashCode(mood);
	}

	@Override
	public boolean equals(Object o)
	{
		if (o instanceof MoodProperty mp)
			return hashCode() == mp.hashCode();

		return false;
	}

}
