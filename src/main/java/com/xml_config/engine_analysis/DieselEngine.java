package com.xml_config.engine_analysis;

public class DieselEngine extends Engine {
    @Override
    public int getPerformance() {
        return (this.getTorque()*this.getRpm())/63025;
    }
}
