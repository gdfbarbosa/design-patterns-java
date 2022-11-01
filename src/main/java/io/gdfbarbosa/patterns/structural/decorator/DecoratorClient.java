package io.gdfbarbosa.patterns.structural.decorator;

import io.gdfbarbosa.patterns.structural.decorator.datasource.*;

import java.io.IOException;

public class DecoratorClient {
    public static void main(String[] args) throws IOException {
        String salaryRecords = "Name,Salary\nGuilherme B.,460000\nEiffel Tower,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("/tmp/out/OutputDemo.txt")));
        // reads file, encrypts and them compress it
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("/tmp/out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
