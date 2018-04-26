package com.tcc.safepoint;

import java.lang.instrument.Instrumentation;
import java.lang.management.ManagementFactory;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;


public class SafepointAgent {

    public static void premain(String args, Instrumentation inst) throws MalformedObjectNameException, InstanceAlreadyExistsException, MBeanRegistrationException, NotCompliantMBeanException {
        System.out.println("Registered Safepoint Agent successfully");

        //Get the MBean server
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        //register the MBean
        Safepoint mBean = new Safepoint();
        ObjectName name = new ObjectName("com.tcc.safepoint.agent:type=Safepoint");
        mbs.registerMBean(mBean, name);
    }

}
