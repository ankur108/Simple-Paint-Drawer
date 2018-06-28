package creatingRGBColourPreview;

import java.awt.Image;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Malik
 */
public class RGBColourPreviewBeanInfo extends SimpleBeanInfo {

    public PropertyDescriptor[] getPropertyDescriptor() {
        try {
            PropertyDescriptor r = new PropertyDescriptor("RGB", RGBColourPreview.class, "getRGB", "setRGB");

            PropertyDescriptor[] pds = new PropertyDescriptor[]{r};
            return pds;
        } catch (IntrospectionException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Image getIcon(int iconKind) {
        switch (iconKind) {
            case BeanInfo.ICON_COLOR_16x16:
                return loadImage("RGBPreviewiicon.jpg");
            case BeanInfo.ICON_COLOR_32x32:
                return loadImage("RGBPreviewicon_big.jpg");
        }
        return null;
    }
}
