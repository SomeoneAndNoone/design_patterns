//package head_first_design_patterns.compound.patterns;
//
//import head_first_design_patterns.compound.Quackable;
//import head_first_design_patterns.compound.geese.Goose;
//
//import java.util.Observer;
//
//public class GooseAdapter implements Quackable {
//    Observable observable;
//    Goose goose;
//
//    public GooseAdapter(Goose goose){
//        this.goose = goose;
//        observable = new Observable(this);
//    }
//
//    @Override
//    public void quack() {
//        goose.honk();
//        notifyObservers();
//    }
//
//    @Override
//    public void registerObserver(Observer observer) {
//        observable.registerObserver(observer);
//    }
//
//    @Override
//    public void notifyObservers() {
//        observable.notifyObservers();
//    }
//}
