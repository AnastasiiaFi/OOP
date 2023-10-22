package HW2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehavior, QueueBehaviour{
    private final List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " Пришел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        for (Actor actor : actorList){
            System.out.println(actor.getName()+ " Вышел из магазина");
            queue.remove(actor);
        }

    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " Встал в очередь");
        this.queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " Сделал заказ");
            }
        }

    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " Получил заказ");
            }
        }

    }

    @Override
    public void releaseFromQueue() {
        List<Actor> actorList = new ArrayList<>();
        for ( Actor actor : queue){
            if (actor.isTakeOrder()){
                actorList.add(actor);
                System.out.println(actor.getName()+ " Готов выходить");
            }
        }
        releaseFromMarket(actorList);

    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
}
