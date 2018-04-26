# ThreeComma Safepoint Agent
https://www.threecomma.io/

This java agent can be used using `-javaagent:agent-safepoint.jar` to expose safepoint stats from `sun.management.ManagementFactoryHelper.getHotspotRuntimeMBean()`. These metrics are unfortunately not exported through JMX with Java 8.

This is really useful in production systems where you need to monitor STW (stop-the-world) pauses (`-XX:+PrintGCApplicationStoppedTime`).

* getSafepointSyncTime()
* getTotalSafepointTime()
* getSafepointCount()

The need arose when we realized Java 8 did not export Safepoint stats through JMX. So we wrote this to use with JMX exporter (https://github.com/prometheus/jmx_exporter).
