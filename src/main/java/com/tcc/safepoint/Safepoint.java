package com.tcc.safepoint;

public class Safepoint implements SafepointMBean {
    sun.management.HotspotRuntimeMBean runtime =
            sun.management.ManagementFactoryHelper.getHotspotRuntimeMBean();

    @Override
    public long getSafepointSyncTime() {
        return runtime.getSafepointSyncTime();
    }

    @Override
    public long getTotalSafepointTime() {
        return runtime.getTotalSafepointTime();
    }

    @Override
    public long getSafepointCount() {
        return runtime.getSafepointCount();
    }
}
