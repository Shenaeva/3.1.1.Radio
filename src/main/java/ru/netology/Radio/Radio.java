package ru.netology.Radio;

public class Radio {
    private int minStationNumber;
    private int maxStationNumber = 9;
    private int currentStationNumber;
    private int minVolume;
    private int maxVolume = 10;
    private int soundVolume;

    /**
     * переключает радиостанцию вперед,
     * проверяет, если станция последняя по счету, то переключает на первую
     */
    public void next() {
        if (currentStationNumber == maxStationNumber) {
            currentStationNumber = minStationNumber;
        }
        else {
            currentStationNumber++;
            System.out.println(currentStationNumber);
        }
    }

    /**
     * переключает радиостанцию назад,
     * проверяет, если станция первая по счету, то переключает на последнюю
     */
    public void prev() {
        if (currentStationNumber == minStationNumber) {
            currentStationNumber = maxStationNumber;
        }
        else {
            currentStationNumber--;
            System.out.println(currentStationNumber);
        }
    }

    /**
     * прибавляет звук
     * проверяет, что если звук находится на максимуме, то изменения не происходят, если нет, то прибавляет
     */
    public void more() {
        if (soundVolume != maxVolume) {
            soundVolume++;
        }
        System.out.println(soundVolume);
    }

    /**
     * убавляет звук
     * проверяет, что если звук находится на минимуме, то изменения не происходят, если нет, то убавляет
     */
    public void lessen() {
        if (soundVolume != minVolume) {
            soundVolume--;
        }
        System.out.println(soundVolume);
    }

    //getters, setters
    public int getMinStationNumber() {
        return minStationNumber;
    }

    public void setMinStationNumber(int minStationNumber) {
        this.minStationNumber = minStationNumber;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public void setMaxStationNumber(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        this.currentStationNumber = currentStationNumber;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }
}
