package main.java.spittr;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Date;

/**
 * Created by try on 2015/9/17.
 */
public class Spittle
{
    private final long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longitude;

    public Spittle( String message, Date time)
    {
        this(0, message, time, null, null);
    }

    public Spittle(long id, String message, Date time, Double longitude, Double latitude)
    {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.time = time;
        this.message = message;
    }

    public long getId()
    {
        return id;
    }

    public String getMessage()
    {
        return message;
    }

    public Date getTime()
    {
        return time;
    }

    public Double getLatitude()
    {
        return latitude;
    }

    public Double getLongitude()
    {
        return longitude;
    }

    @Override
    public boolean equals(Object obj)
    {
        return EqualsBuilder.reflectionEquals(this, obj, new String[]{"id", "time"});
    }

    @Override
    public int hashCode()
    {
        return HashCodeBuilder.reflectionHashCode(this, new String[]{"id", "time"});
    }
}
