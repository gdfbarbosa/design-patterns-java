package io.gdfbarbosa.patterns.structural.facade;

import java.io.File;

public class FacadeClient {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        System.out.println("Generated file: " + mp4Video.getAbsolutePath());
    }
}
