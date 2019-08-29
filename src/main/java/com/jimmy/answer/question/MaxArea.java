package com.jimmy.answer.question;

/**
 * <h3>workspace</h3>
 * <p></p>
 *
 * @author : fanjm
 * @date : 2019-08-29 15:14
 */
public class MaxArea {

    public int maxArea(int[] height) {

        int area = 0;
        int temp;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int min = Math.min(height[i], height[j]);
                temp = min * (j - i);
                area = Math.max(area, temp);
            }
        }
        return area;
    }
}
