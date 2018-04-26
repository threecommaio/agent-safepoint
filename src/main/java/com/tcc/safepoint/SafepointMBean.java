package com.tcc.safepoint;

public interface SafepointMBean {

    public long getSafepointSyncTime();
    public long getTotalSafepointTime();
    public long getSafepointCount();

}