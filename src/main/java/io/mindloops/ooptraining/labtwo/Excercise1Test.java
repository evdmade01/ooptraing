package io.mindloops.ooptraining.labtwo;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class Excercise1Test {

//    @Test
//    public void given_a_car_and_engine_all_fields_are_encapsulated() {
//        assertTrue(determineIfFieldsOfClassArePrivate(Engine.class));
//        assertTrue(determineIfFieldsOfClassArePrivate(Car.class));
//    }
//
//    @Test
//    public void given_a_car_when_horsepower_is_requested_it_can_be_done_through_the_car() {
//        Engine engine = new Engine(150);
//        Car car = new Car();
//        car.setEngine(engine);
//
//        assertTrue(car.getHorsepower() == 150);
//        assertTrue(isMethodGetEngineRemovedFromCar());
//    }

//    private boolean determineIfFieldsOfClassArePrivate(Class classToInspect) {
//        final Field[] fields = classToInspect.getDeclaredFields();
//        for(Field field : fields) {
//            if(!Modifier.isPrivate(field.getModifiers())) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private boolean isMethodGetEngineRemovedFromCar() {
//        try {
//            Car.class.getDeclaredMethod("getEngine");
//        } catch(NoSuchMethodException ex) {
//            return true;
//        }
//        return false;
//    }

}
