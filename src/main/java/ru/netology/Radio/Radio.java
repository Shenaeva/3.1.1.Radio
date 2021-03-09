package ru.netology.Radio;

public class Radio {
    private int minStationNumber;
    private int maxStationNumber = 10;
    private int currentStationNumber;
    private int minVolume;
    private int maxVolume = 100;
    private int soundVolume;

    public Radio(int currentStationNumber, int soundVolume) {
        if(currentStationNumber < minStationNumber) {
            return;
        }
        if (currentStationNumber > maxStationNumber) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
        if (soundVolume < minVolume) {
            return;
        }
        if (soundVolume > maxVolume) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public Radio() {
    }

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
    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        this.currentStationNumber = currentStationNumber;
        return;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
        return;
    }
}
