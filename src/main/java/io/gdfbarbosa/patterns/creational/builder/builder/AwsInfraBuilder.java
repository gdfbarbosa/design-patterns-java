package io.gdfbarbosa.patterns.creational.builder.builder;

import io.gdfbarbosa.patterns.creational.builder.InfrastructureBuilder;
import io.gdfbarbosa.patterns.creational.builder.cloud.AWSInfrastructure;
import io.gdfbarbosa.patterns.creational.builder.cloud.CloudInfrastructure;

public class AwsInfraBuilder implements InfrastructureBuilder {
    private final AWSInfrastructure infrastructure;

    public AwsInfraBuilder() {
        this.infrastructure = new AWSInfrastructure();
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
