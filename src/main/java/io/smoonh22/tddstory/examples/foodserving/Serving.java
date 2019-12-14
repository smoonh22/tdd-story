package io.smoonh22.tddstory.examples.foodserving;

public class Serving {
    public boolean doServe(ICook cook) {
        if (cook.isFinished()) {
            // TODO 고객에게 서빙하는 로직
            Food food =cook.getFood();
            //....
            return true;
        }
        return false;
    }
}
