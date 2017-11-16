package io.mindloops.ooptraining.labtwo;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Excercise2Test {

//    @Test
//    public void given_different_engines_with_same_attributes_modeled_differently() {
//        Engine regularEngine = new Engine(150);
//        ElectricEngine electricEngine = new ElectricEngine(150, 2000);
//        DieselEngine dieselEngine = new DieselEngine(150);
//
//        List engines = new ArrayList();
//        engines.add(regularEngine);
//        engines.add(electricEngine);
//        engines.add(dieselEngine);
//
//        for(Object engine : engines) {
//            // Because the engines are different classses (do not have inheritance)
//            // you need to use the instanceof to determine what class it is
//            // for now the most important to remember is that if you do not use
//            // OO concepts as inheritance this will be the resulting code...
//            if(engine instanceof Engine) {
//                assertTrue(((Engine) engine).getHorsepower() == 150);
//            } else if (engine instanceof DieselEngine) {
//                assertTrue(((DieselEngine) engine).getHorsepower() == 150);
//            } else if(engine instanceof ElectricEngine) {
//                assertTrue(((ElectricEngine) engine).getHorsepower() == 150);
//            } else {
//                throw new IllegalStateException("unknow class!");
//            }
//        }
//    }
//
//    @Test
//    public void given_three_different_classes_have_same_parent_then_code_less_clutter() {
//        Engine regularEngine = new Engine(150);
//        ElectricEngine electricEngine = new ElectricEngine(150, 2000);
//        DieselEngine dieselEngine = new DieselEngine(150);
//
//        List engines = new ArrayList();
//        engines.add(regularEngine);
//        engines.add(electricEngine);
//        engines.add(dieselEngine);
//
//        for(Object engine : engines) {
//            if(engine instanceof Engine) {
//                assertTrue(getEngine(engine).getHorsepower() == 150);
//            }
//        }
//    }
//
//    private Engine getEngine(Object engine) {
//        return (Engine)engine;
//    }

}
