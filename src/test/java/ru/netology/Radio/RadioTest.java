package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextStation() {
        Radio radio = new Radio(); //создаем новый экзампляр класса
        assertEquals(0, radio.getCurrentStationNumber());
        radio.setCurrentStationNumber(3); //присваеваем текущее значение
        radio.next(); //вызываем метод
        int resultStationNumber = radio.getCurrentStationNumber(); //ФР
        assertEquals(4, resultStationNumber); //проверка
    }

    @Test
    void nextStationMax() {
        Radio radio = new Radio(); //создаем новый экзампляр класса
        assertEquals(0, radio.getCurrentStationNumber());
        radio.setCurrentStationNumber(9); //присваеваем текущее значение
        radio.next(); //вызываем метод
        int resultStationNumber = radio.getCurrentStationNumber(); //ФР
        assertEquals(0, resultStationNumber); //проверка
    }

    @Test
    void prevStation() {
        Radio radio = new Radio(); //создаем новый экзампляр класса
        assertEquals(0, radio.getCurrentStationNumber());
        radio.setCurrentStationNumber(9); //присваеваем текущее значение
        radio.prev(); //вызываем метод
        int resultStationNumber = radio.getCurrentStationNumber(); //ФР
        assertEquals(8, resultStationNumber); //проверка
    }

    @Test
    void prevStationMin() {
        Radio radio = new Radio(); //создаем новый экзампляр класса
        assertEquals(0, radio.getCurrentStationNumber()); // проверка с 0
        radio.setCurrentStationNumber(0); //присваеваем текущее значение
        radio.prev(); //вызываем метод
        int resultStationNumber = radio.getCurrentStationNumber(); //ФР
        assertEquals(9, resultStationNumber); //проверка
    }

    @Test
    void moreVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getSoundVolume());
        radio.setSoundVolume(5);
        radio.more();
        int resultVolume = radio.getSoundVolume();
        assertEquals(6, resultVolume);
    }

    @Test
    void moreVolumeMax() {
        Radio radio = new Radio();
        assertEquals(0, radio.getSoundVolume());
        radio.setSoundVolume(10);
        radio.more();
        int resultVolume = radio.getSoundVolume();
        assertEquals(10, resultVolume);
    }

    @Test
    void lessenVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getSoundVolume());
        radio.setSoundVolume(10);
        radio.lessen();
        int resultVolume = radio.getSoundVolume();
        assertEquals(9, resultVolume);
    }

    @Test
    void lessenVolumeMin() {
        Radio radio = new Radio();
        assertEquals(0, radio.getSoundVolume());
        radio.setSoundVolume(0);
        radio.lessen();
        int resultVolume = radio.getSoundVolume();
        assertEquals(0, resultVolume);
    }
}