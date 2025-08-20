package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }

        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }

        currentVolume = newCurrentVolume;

    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            newCurrentStation = 0;
        }

        if (newCurrentStation < 0) {
            newCurrentStation = 9;
        }

        currentStation = newCurrentStation;
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
        currentStation = 9;
    }

    public void setToMinStation() {
        currentStation = 0;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
