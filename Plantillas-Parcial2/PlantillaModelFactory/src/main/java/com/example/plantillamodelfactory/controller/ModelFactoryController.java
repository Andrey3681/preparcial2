package com.example.plantillamodelfactory.controller;

import com.example.plantillamodelfactory.controller.services.IModelFactory;

public class ModelFactoryController implements IModelFactory {
    private static class SingletonHolder {
        private final static ModelFactoryController eINSTANCE;

        static {
            try {
                eINSTANCE = new ModelFactoryController();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }//me llama al model factory

    public ModelFactoryController(){

    }
}
