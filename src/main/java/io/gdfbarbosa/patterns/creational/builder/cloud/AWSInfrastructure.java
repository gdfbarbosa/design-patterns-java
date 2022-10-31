package io.gdfbarbosa.patterns.creational.builder.cloud;

public class AWSInfrastructure implements CloudInfrastructure {
    private int bytes;
    private int cores;
    private int nodes;

    @Override
    public String getProviderName() {
        return "AWS";
    }

    @Override
    public String getStorageName() {
        return "Amazon S3";
    }

    @Override
    public String getComputeName() {
        return "Amazon EC2";
    }

    @Override
    public String getKubernetesName() {
        return "Amazon ECS";
    }

    @Override
    public int getStorageVolume() {
        return this.bytes;
    }

    @Override
    public int getComputeCores() {
        return this.cores;
    }

    @Override
    public int getKubernetesNodes() {
        return this.nodes;
    }

    @Override
    public void addStorage(int bytes) {
        this.bytes = bytes;
    }

    @Override
    public void addCompute(int cores) {
        this.cores = cores;
    }

    @Override
    public void addKubernetes(int nodes) {
        this.nodes = nodes;
    }
}
