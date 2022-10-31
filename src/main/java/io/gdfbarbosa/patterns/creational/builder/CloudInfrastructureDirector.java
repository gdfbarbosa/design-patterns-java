package io.gdfbarbosa.patterns.creational.builder;

import io.gdfbarbosa.patterns.creational.builder.cloud.CloudInfrastructure;

public class CloudInfrastructureDirector {
    public CloudInfrastructure createInfraAWS(InfrastructureBuilder builder) {
        return builder
                .addCompute(10)
                .addStorage(5)
                .addKubernetes(3)
                .build();
    }

    public CloudInfrastructure createInfraGCP(InfrastructureBuilder builder) {
        return builder
                .addCompute(7)
                .addStorage(2)
                .addKubernetes(2)
                .build();
    }

    public CloudInfrastructure createInfraAzure(InfrastructureBuilder builder) {
        return builder
                .addCompute(20)
                .addStorage(10)
                .addKubernetes(6)
                .build();
    }
}
