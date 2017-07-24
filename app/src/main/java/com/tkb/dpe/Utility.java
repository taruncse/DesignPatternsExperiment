package com.tkb.dpe;

import java.util.ArrayList;

/**
 * Created by tarun on 7/21/17.
 */

public class Utility {



    private enum enumData{
        STRATEGY,OBSERVER,SIMPLE_FACTORY,ABSTRACT_FACTORY,SINGLETON,PROTOTYPE,BUILDER,REFLECTION,DECORATOR
    }

    public static ArrayList<PatternDataModel> getPatterns(){
        ArrayList<PatternDataModel>patternDataList = new ArrayList<>();
        for (enumData aData : enumData.values()){
            PatternDataModel patternDataModel = new PatternDataModel();
            patternDataModel.setNameOfThePatter(aData.name());
            patternDataList.add(patternDataModel);
        }

        return patternDataList;
    }
}
