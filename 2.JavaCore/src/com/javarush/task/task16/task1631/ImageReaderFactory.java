package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {
        if (imageTypes == ImageTypes.BMP) {
            BmpReader bmpReader = new BmpReader();
            return bmpReader;
        }
        else if (imageTypes == ImageTypes.PNG) {
            PngReader pngReader = new PngReader();
            return  pngReader;
        }
        else if (imageTypes == ImageTypes.JPG) {
            JpgReader jpgReader = new JpgReader();
            return  jpgReader;
        }
        else {
            throw new IllegalArgumentException();
        }

    }
}
