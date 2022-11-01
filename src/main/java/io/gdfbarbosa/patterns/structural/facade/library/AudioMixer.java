package io.gdfbarbosa.patterns.structural.facade.library;

import io.gdfbarbosa.patterns.structural.facade.VideoFile;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("/tmp/youtubevideo.mp4");
    }
}