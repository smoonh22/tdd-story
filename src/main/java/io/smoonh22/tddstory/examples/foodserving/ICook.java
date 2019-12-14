package io.smoonh22.tddstory.examples.foodserving;

public interface ICook {
    public boolean prepare();
    public boolean cook();
    public boolean isFinished();
    public Food getFood();
}
