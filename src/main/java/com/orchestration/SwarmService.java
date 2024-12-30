package com.orchestration;

public class SwarmService {
    private String serviceId;
    private String serviceName;
    private int replicas;
    private double cpuUsage;
    private double memoryUsage;
    private ServiceStatus status;

    public SwarmService(String serviceId, String serviceName, int replicas) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.replicas = replicas;
        this.status = ServiceStatus.RUNNING;
    }

    // Getters and setters
    public String getServiceId() { return serviceId; }
    public String getServiceName() { return serviceName; }
    public int getReplicas() { return replicas; }
    public void setReplicas(int replicas) { this.replicas = replicas; }
    public double getCpuUsage() { return cpuUsage; }
    public double getMemoryUsage() { return memoryUsage; }
    public void updateMetrics(double cpu, double memory) {
        this.cpuUsage = cpu;
        this.memoryUsage = memory;
    }
}