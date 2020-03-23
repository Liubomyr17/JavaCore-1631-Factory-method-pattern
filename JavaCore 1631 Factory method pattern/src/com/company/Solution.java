package com.company;

/*

1631 Factory method pattern
1. Look carefully at what classes you have.
2. In separate files in the common package, create the JpgReader, PngReader, BmpReader classes that implement the ImageReader interface.
3. In a separate file in the main package, create the ImageReaderFactory class with one method.
3.1. Think what it should be called.
3.2. Think about what modifiers this method should have.
4. This method should:
4.1. For each value from ImageTypes, return the corresponding Reader, for example, for ImageTypes.JPG - JpgReader;
4.2. If an invalid parameter is passed, then throw an IllegalArgumentException ("Unknown picture type") exception.

Requirements:
1. Create a JpgReader class in the common package that implements the ImageReader interface.
2. Create a PngReader class in the common package that implements the ImageReader interface.
3. Create a class BmpReader in the common package that implements the ImageReader interface.
4. Create a public class ImageReaderFactory.
5. Add the public static getImageReader method with the ImageTypes parameter to the ImageReaderFactory class.
6. The getImageReader method should create and return a suitable Reader.
7. The getImageReader method must throw an IllegalArgumentException if an invalid parameter is passed.



 */


public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}

class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageTypes)
    {
        if (imageTypes == ImageTypes.JPG) return new JpgReader();
        if (imageTypes == ImageTypes.BMP) return new BmpReader();
        if (imageTypes == ImageTypes.PNG) return new PngReader();
        else throw new IllegalArgumentException("Неизвестный тип картинки");
    }

}

interface ImageReader {
}

class BmpReader implements ImageReader {
}

class JpgReader implements ImageReader {
}

class PngReader implements ImageReader {
}

enum ImageTypes {
    BMP,
    JPG,
    PNG
}




