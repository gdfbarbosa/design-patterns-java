package io.gdfbarbosa.patterns.creational.builder.cloud;

public class AzureInfrastructure implements CloudInfrastructure {
    private int bytes;
    private int cores;
    private int nodes;

    @Override
    public String getProviderName() {
        return "Azure";
    }

    @Override
    public String getStorageName() {
        return "Blob Storage";
    }

    @Override
    public String getComputeName() {
        return "Azure Compute Instance";
    }

    @Override
    public String getKubernetesName() {
        return "AKS";
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
