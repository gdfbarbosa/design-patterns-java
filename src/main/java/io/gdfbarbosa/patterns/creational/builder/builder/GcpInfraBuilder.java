package io.gdfbarbosa.patterns.creational.builder.builder;

import io.gdfbarbosa.patterns.creational.builder.InfrastructureBuilder;
import io.gdfbarbosa.patterns.creational.builder.cloud.CloudInfrastructure;
import io.gdfbarbosa.patterns.creational.builder.cloud.GCPInfrastructure;

public class GcpInfraBuilder implements InfrastructureBuilder {
    private final GCPInfrastructure infrastructure;

    public GcpInfraBuilder() {
        this.infrastructure = new GCPInfrastructure();
    }

    @Override
    public InfrastructureBuilder addStorage(int cores) {
        this.infrastructure.addStorage(cores);
        return this;
    }

    @Override
    public InfrastructureBuilder addCompute(int cores) {
        this.infrastructure.addCompute(cores);
        return this;
    }

    @Override
    public InfrastructureBuilder addKubernetes(int nodes) {
        this.infrastructure.addKubernetes(nodes);
        return this;
    }

    @Override
    public CloudInfrastructure build() {
        return this.infrastructure;
    }
}
