package main.java.spittr.data;

import main.java.spittr.Spittle;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by try on 2015/9/22.
 */
@Repository
public class JdbcSpittleRepository implements SpittleRepository
{
    @Override
    public List<Spittle> findSpittles(long max, int count)
    {
        return null;
    }

    @Override
    public Spittle findOne(long id)
    {
        return null;
    }
}
