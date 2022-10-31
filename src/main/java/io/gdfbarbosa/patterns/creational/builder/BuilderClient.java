package io.gdfbarbosa.patterns.creational.builder;

import io.gdfbarbosa.patterns.creational.builder.builder.AwsInfraBuilder;
import io.gdfbarbosa.patterns.creational.builder.builder.AzureInfraBuilder;
import io.gdfbarbosa.patterns.creational.builder.builder.GcpInfraBuilder;
import io.gdfbarbosa.patterns.creational.builder.cloud.CloudInfrastructure;

public class BuilderClient {
    public static void main(String[] args) {
        CloudInfrastructureDirector director = new CloudInfrastructureDirector();
        CloudInfrastructure infra = null;
        if (args[0].equals("aws")) {
            infra = director.createInfraAWS(new AwsInfraBuilder());
        } else if (args[0].equals("gcp")) {
            infra = director.createInfraGCP(new GcpInfraBuilder());
        } else if (args[0].equals("azure")) {
            infra = director.createInfraAzure(new AzureInfraBuilder());
        }
        System.out.println("Provider = " + infra.getProviderName());
        System.out.println(infra.getComputeName() + " number of cores: " + infra.getComputeCores());
        System.out.println(infra.getStorageName() + " volume: " + infra.getStorageVolume());
        System.out.println(infra.getKubernetesName() + " number of nodes: " + infra.getKubernetesNodes());
    }
}
