package sg.MemorableQuotes;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Shahzaib Gill on 12/31/2014.
 */
public class ColorWheel {

    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7", // light gray
            "#862b54", // maroon
            "#cec2e5", // light pink/purple
            "#57515d", // charcoal
            "#3c5664", // navy blue
            "#cf641e", // dark orange
            "#088da5", // teal
            "#bdaf80", // beige
            "#b08563", // brown
            "#ffc6c3", // baby pink
            "#4b6d37", // dark green
            "#a51842", // lipstick red
            "#4b3832", // dark brown walnut
            "#854442", // brick
            "#52bf90", // light jade
            "#49ab81", // medium jade
            "#317256", // dark jade
            "#6497b1", // sea blue
    };

    public int getColor() {


        // The button was clicked so update the color label with a new color
        String color = "";

        // Randomly select a color by constructing new random generator
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
