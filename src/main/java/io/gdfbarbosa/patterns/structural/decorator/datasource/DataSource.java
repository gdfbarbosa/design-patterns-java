package io.gdfbarbosa.patterns.structural.decorator.datasource;

import java.io.IOException;

public interface DataSource {
    void writeData(String data) throws IOException;

    String readData();
}