/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreatingRGBscrollbar;

import java.awt.Image;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 *
 * @author Malik
 */
public class RGBscrollbarBeanInfo extends SimpleBeanInfo {

    public PropertyDescriptor[] getPropertyDescriptor() {
        try {
            PropertyDescriptor r = new PropertyDescriptor("RGB", RGBscrollbar.class, "getRGB", "setRGB");
            PropertyDescriptor B = new PropertyDescriptor("brightness", RGBscrollbar.class, "getBrightness", "setBrightness");

            PropertyDescriptor[] pds = new PropertyDescriptor[]{r, B};
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
                return loadImage("RGBicon.jpg");
            case BeanInfo.ICON_COLOR_32x32:
                return loadImage("RGBicon_big.jpg");
        }
        return null;
    }
}
