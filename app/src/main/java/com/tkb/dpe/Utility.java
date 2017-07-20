package com.tkb.dpe;

import java.util.ArrayList;

/**
 * Created by tarun on 7/21/17.
 */

public class Utility {
    private static final String strategyPattern = "STRATEGY";
    private static final String observerPattern = "OBSERVER";
    private static final String simpleFactoryPattern = "SIMPLE FACTORY";
    private static final String abstractFactoryPattern = "ABSTRACT FACTORY";
    private static final String singletonPattern = "SINGLETON";

    public static ArrayList<PatternDataModel> patternDataList = new ArrayList<PatternDataModel>() {{
        add(getPattern(strategyPattern));
        add(getPattern(observerPattern));
        add(getPattern(simpleFactoryPattern));
        add(getPattern(abstractFactoryPattern));
        add(getPattern(singletonPattern));
    }};
    private static PatternDataModel getPattern(String pattern){
        PatternDataModel patternDataModel = new PatternDataModel();
        patternDataModel.setNameOfThePatter(pattern);
        return patternDataModel;
    }
}
