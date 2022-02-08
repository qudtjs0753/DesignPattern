package Behavioral.StrategyPattern;

/**
 * @Author: kbs
 */


class WatchMovieInNetflix implements WatchMovieStrategy {
    @Override
    public void watch(){
        System.out.println("영화를 넷플릭스에서 볼거에요.");
    }
}

class WatchMovieInWatcha implements WatchMovieStrategy {
    @Override
    public void watch(){
        System.out.println("영화를 왓챠에서 볼거에요.");
    }
}

class WatchMovieInCinema implements WatchMovieStrategy {
    @Override
    public void watch(){
        System.out.println("영화는 영화관에서 팝콘먹으면서 봐야죠;");
    }
}

public class Consumer {
    private WatchMovieStrategy watchMovieStrategy;

    public Consumer(WatchMovieStrategy watchMovieStrategy){
        this.watchMovieStrategy = watchMovieStrategy;
    }

    public void changeStrategy(WatchMovieStrategy watchMovieStrategy){
        this.watchMovieStrategy = watchMovieStrategy;
    }

    public void executePlan(){
        this.watchMovieStrategy.watch();
    }
}

class SelectStrategy {
    public static void main(String[] args) {
        System.out.println("영화보자. 어떻게?");
        Consumer person = new Consumer(new WatchMovieInNetflix());
        person.executePlan();
        person.changeStrategy(new WatchMovieInCinema());
        person.executePlan();
    }
}
