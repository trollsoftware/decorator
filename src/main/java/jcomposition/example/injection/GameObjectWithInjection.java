package jcomposition.example.injection;

import jcomposition.example.Movable;

public class GameObjectWithInjection extends GameObjectWithInjectionBase {
    @Override
    protected void onInject(Composition composition) {

    }
//    private InjectionComponent injectionComponent;
//
//    @Override
//    protected void onInject(Composition composition) {
//        injectionComponent = DaggerInjectionComponent
//                .builder()
//                .movableModule(new Movable.MovableModule(composition))
//                .build();
//
//        injectionComponent.inject(composition);
//    }
}
