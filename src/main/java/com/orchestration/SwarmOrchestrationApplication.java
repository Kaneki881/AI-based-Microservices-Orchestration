package com.orchestration;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SwarmOrchestrationApplication {
    public static void main(String[] args) {
        SwarmOrchestrator orchestrator = new SwarmOrchestrator();
        
        // Start monitoring thread
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(() -> {
            try {
                orchestrator.monitorServices();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, 0, 30, TimeUnit.SECONDS);
    }
}