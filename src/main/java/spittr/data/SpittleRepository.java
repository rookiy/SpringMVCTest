package main.java.spittr.data;

import main.java.spittr.Spittle;

import java.util.List;

/**
 * Created by try on 2015/9/17.
 */
public interface SpittleRepository
{
    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(long id);
}
