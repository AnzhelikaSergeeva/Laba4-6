package com.company;

import java.awt.*;
import java.awt.image.BufferedImage;

public class JImageDisplay extends javax.swing.JComponent{
    private BufferedImage bufferedImage;

    public JImageDisplay(int width, int height){
        bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        this.setPreferredSize(new Dimension(width, height));
    }

    public void paintComponent(Graphics g){
        g.drawImage (bufferedImage, 0, 0, bufferedImage.getWidth(),
                bufferedImage.getHeight(), null);
    }

    public void clearImage (){
        for (int x = 0; x < bufferedImage.getWidth(); x++){
            for (int y = 0; y < bufferedImage.getHeight(); y++) {
                bufferedImage.setRGB(x, y, Color.BLACK.getRGB());
            }
        }
    }

    public void drawPixel (int x, int y, int rgbColor){
        bufferedImage.setRGB(x, y, rgbColor);
    }

    public BufferedImage getImage() {
        return bufferedImage;
    }
}
