package io.gdfbarbosa.patterns.creational.builder.cloud;

public interface CloudInfrastructure {
    String getProviderName();
    String getStorageName();
    String getComputeName();
    String getKubernetesName();

    int getStorageVolume();
    int getComputeCores();
    int getKubernetesNodes();

    void addStorage(int bytes);
    void addCompute(int cores);
    void addKubernetes(int nodes);
}
