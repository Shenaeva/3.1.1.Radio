package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextStationAndVolume() {
        Radio radio = new Radio(3,10);
        radio.next();
        radio.more();
        assertEquals(4, radio.getCurrentStationNumber());
        assertEquals(11, radio.getSoundVolume());
    }

    @Test
    void nextStationMaxAndMoreVolumeMax() {
        Radio radio = new Radio(10,100);
        radio.next();
        radio.more();
        assertEquals(0, radio.getCurrentStationNumber());
        assertEquals(100, radio.getSoundVolume());
    }

    @Test
    void prevStationAndVolumeMax() {
        Radio radio = new Radio(9,101);
        radio.prev();
        radio.lessen();
        assertEquals(8, radio.getCurrentStationNumber());
        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    void prevStationMinAndLessenVolume() {
        Radio radio = new Radio(0,99);
        radio.prev();
        radio.lessen();
        assertEquals(10, radio.getCurrentStationNumber());
        assertEquals(98, radio.getSoundVolume());
    }

    @Test
    void moreVolumeAndPrevStation() {
        Radio radio = new Radio(7,77);
        radio.prev();
        radio.more();
        assertEquals(6, radio.getCurrentStationNumber());
        assertEquals(78, radio.getSoundVolume());
    }

    @Test
    void moreVolumeMaxAndPrevStation() {
        Radio radio = new Radio(7,100);
        radio.prev();
        radio.more();
        assertEquals(6, radio.getCurrentStationNumber());
        assertEquals(100, radio.getSoundVolume());
    }

    @Test
    void lessenVolume() {
        Radio radio = new Radio(10, 10);
        radio.next();
        radio.lessen();
        assertEquals(0,radio.getCurrentStationNumber());
        assertEquals(9, radio.getSoundVolume());
    }

    @Test
    void lessenVolumeMinAndNextStation() {
        Radio radio = new Radio(0,0);
        radio.next();
        radio.lessen();
        assertEquals(1, radio.getCurrentStationNumber());
        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    void lessenVolumeMinAndPrevStation() {
        Radio radio = new Radio(10,-1);
        radio.prev();
        radio.lessen();
        assertEquals(9, radio.getCurrentStationNumber());
        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    void setCurrentStationAndLessenVolume(){
        Radio radio = new Radio(7,70);
        assertEquals(7, radio.getCurrentStationNumber());
        assertEquals(70, radio.getSoundVolume());
    }

    @Test
    void setCurrentStationMaxAndLessenVolume(){
        Radio radio = new Radio(11,101);
        assertEquals(0, radio.getCurrentStationNumber());
        assertEquals(0, radio.getSoundVolume());
    }


    @Test
    void setCurrentStationMinAndLessenVolume() {
        Radio radio = new Radio(-1, -1);
        assertEquals(0, radio.getCurrentStationNumber());
        assertEquals(0, radio.getSoundVolume());
    }

}