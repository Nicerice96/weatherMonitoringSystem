public interface notifyWeather {

    void Attach(deviceObserver device);

    void Detach(deviceObserver device);

    void NotifyObseervers();
}
