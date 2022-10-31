package io.gdfbarbosa.patterns.creational.builder;

import io.gdfbarbosa.patterns.creational.builder.cloud.CloudInfrastructure;

public interface InfrastructureBuilder {
    InfrastructureBuilder addStorage(int bytes);
    InfrastructureBuilder addCompute(int cores);
    InfrastructureBuilder addKubernetes(int nodes);
    CloudInfrastructure build();
}
