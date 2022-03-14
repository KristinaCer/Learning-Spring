package com.xml_config.engine_analysis;

public class PetrolEngine extends Engine {
    @Override
    public int getPerformance() {
        return (this.getTorque() * this.getRpm())/5252;
    }
}
