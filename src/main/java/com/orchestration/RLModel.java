package com.orchestration;

public class RLModel {
    public String predictAction(double cpuUsage, double memoryUsage) {
        if (cpuUsage > 80 || memoryUsage > 80) {
            return "SCALE_UP";
        } else if (cpuUsage < 20 && memoryUsage < 20) {
            return "SCALE_DOWN";
        }
        return "MAINTAIN";
    }
}