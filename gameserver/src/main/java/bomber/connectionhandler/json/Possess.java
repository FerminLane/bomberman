package bomber.connectionhandler.json;

public class Possess {

    private Topic topic;
    private Integer data;

    public Possess() {
    }

    public Possess(Topic topic, Integer data) {
        this.topic = topic;
        this.data = data;
    }

    public Topic getTopic() {
        return topic;
    }

    public Integer getData() {
        return data;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public void setData(Integer data) {
        this.data = data;
    }
}