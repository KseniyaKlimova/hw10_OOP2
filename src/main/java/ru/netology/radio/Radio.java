package ru.netology.radio;

public class Radio {
    private int quantityOfStations = 10;
    private final int minStation = 0;
    private int maxStation = quantityOfStations - 1;
    private int currentStation;
    private int currentVolume;
    private final int maxVolume = 100;
    private final int minVolume = 0;

    public Radio(int quantityOfStations) {
        this.quantityOfStations = quantityOfStations;
        maxStation = quantityOfStations - 1;
    }

    public Radio() {

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            newCurrentStation = 0;
        }

        if (newCurrentStation < minStation) {
            newCurrentStation = maxStation;
        }

        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }

        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume;
        }

        currentVolume = newCurrentVolume;

    }

    public void increaseStation() {
        int target = currentStation + 1;
        setCurrentStation(target);
    }

    public void decreaseStation() {
        int target = currentStation - 1;
        setCurrentStation(target);
    }

    public void setToLastStation() {
        currentStation = maxStation;
    }

    public void setToMinStation() {
        currentStation = minStation;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

}
