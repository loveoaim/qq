package com.scienjus.smartqq.model;

import lombok.Data;

/**
 * 字体
 * @author ScienJus
 * @date 15/12/19.
 */
@Data
public class Font {

    public static final Font DEFAULT_FONT = defaultFont();

    private static Font defaultFont() {
        Font font = new Font();
        font.setColor("000000");
        font.setStyle(new int[]{0, 0, 0});
        font.setName("宋体");
        font.setSize(10);
        return font;
    }

    private int[] style;

    private String color;

    private String name;

    private int size;

    /**
     * style.
     *
     * @return  the style
     */
    public int[] getStyle() {
        return style;
    }

    /**
     * style.
     *
     * @param   style    the style to set
     */
    public void setStyle(int[] style) {
        this.style = style;
    }

    /**
     * color.
     *
     * @return  the color
     */
    public String getColor() {
        return color;
    }

    /**
     * color.
     *
     * @param   color    the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * name.
     *
     * @return  the name
     */
    public String getName() {
        return name;
    }

    /**
     * name.
     *
     * @param   name    the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * size.
     *
     * @return  the size
     */
    public int getSize() {
        return size;
    }

    /**
     * size.
     *
     * @param   size    the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * defaultFont.
     *
     * @return  the defaultFont
     */
    public static Font getDefaultFont() {
        return DEFAULT_FONT;
    }

}
