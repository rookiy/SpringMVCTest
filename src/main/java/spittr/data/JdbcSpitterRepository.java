package main.java.spittr.data;

import main.java.spittr.Spitter;
import org.springframework.stereotype.Repository;

/**
 * Created by try on 2015/9/22.
 */
@Repository
public class JdbcSpitterRepository implements SpitterRepository
{
    @Override
    public Spitter save(Spitter spitter)
    {
        return null;
    }

    @Override
    public Spitter findByUsername(String username)
    {
        return null;
    }
}
