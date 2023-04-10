package org.example;

public class Monitor {
    private int width = 3840;
    private int height = 1920;

// Nie można zmieniać wymiarów monitora, więc zostajemy przy domyślnych ustawieniach!!

//    public Monitor(int width, int height) {
//        this.width = width;
//        this.height = width;
//    }
    // ustawianie setera też jest niepotrzebne
//    public void setWidth(int width) {
//        this.width = width;
//    }

    public void setLowResolution(){
        width = 800;
        height = 600;
    }

    public void setHighResolution(){
        width = 3840;
        height = 1920;
    }

    public String getResolution() {
        return width + "x" + height;
    }
}
