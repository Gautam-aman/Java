package pattern.Observer;

import java.util.ArrayList;
import java.util.List;

interface channel{
    public void subscribe(Subscriber subscriber);
    public void unsubscribe(Subscriber subscriber);
    public void notifySubs();
}

interface Subscriber{
    public void update();
}

class YTchannel implements channel{

    String name;
    String LatestVideo;

    List<Subscriber> subscribe;
    public YTchannel(String name){
        this.name = name;
        subscribe = new ArrayList<Subscriber>();

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatestVideo() {
        return LatestVideo;
    }

    public void setLatestVideo(String latestVideo) {
        LatestVideo = latestVideo;
    }

    public List<Subscriber> getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(List<Subscriber> subscribe) {
        this.subscribe = subscribe;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribe.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribe.remove(subscriber);
    }

    @Override
    public void notifySubs() {
for(Subscriber subscriber : subscribe){
    subscriber.update();
}
    }

    public void uploadvideo(String video){
        LatestVideo = video;
        notifySubs();
    }
}

class YTSubs implements Subscriber{
    YTchannel channel;
    String name;

    public YTSubs(YTchannel channel, String name){
        this.channel = channel;
        this.name = name;
    }

    @Override
    public void update() {
        channel.getLatestVideo();
        System.out.println(channel.getLatestVideo() + "Uploaded ");
        System.out.println("Updated");
    }
}

public class Main {
    public static void main(String[] args) {
        YTchannel Chan = new YTchannel("Aman");
        YTSubs Subs = new YTSubs(Chan , "Kishan");
        Chan.subscribe(Subs);
        Chan.uploadvideo("Kishan");

    }
}
