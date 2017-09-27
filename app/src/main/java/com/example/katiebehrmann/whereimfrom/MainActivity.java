package com.example.katiebehrmann.whereimfrom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView from;
    private ImageView fromImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        from = (TextView) findViewById(R.id.where_im_from_text);
        fromImage = (ImageView) findViewById(R.id.where_im_from_image);
    }

    public void randomizeFrom() {
        String from1 = "I’m from a gentle father \n" +
                "\t(a fucking pushover)\n" +
                "An unapologetic mother \n" +
                "\t(so damn boisterous)";

        String from2 = "From kiddie pools and hot tubs and lawn decor and economy sedans\n" +
                "From the Taco Bell parking lot";

        String from3 = "From early Whole Foods adopters";

        String from4 = "The Jewish family, exoticized in our\n" +
                "demure, blonde, Christian, midwest suburb";

        String from5 = "From no holds barred/totally unashamed/squarely sex-positive/\n" +
                "let’s get you birth control/sexual liberation/power/agency\n" +
                "\tthank thank thank god, I’m so lucky";

        String from6 = "From well-intended neoliberal guilt\n" +
                "\tBut growing toward a more actionable politic\n" +
                "\t\t(Thank you, friends, for calling me out)";

        String from7 = "I’m from following the rules\n" +
                "Purely out of anxiety";

        String from8 = "From cutting a rug\n" +
                "At the Bar Mitzvah\n" +
                "At the Wedding\n" +
                "At the Work Function\n" +
                "On the Subway Platform\n" +
                "On the Bike\n" +
                "Oh you’re embarrassed?\n" +
                "I’m embarrassed for you: there's Motown playing";

        String from9 = "I’m from yes, always yes\n" +
                "Yes I’ll help you\n" +
                "Yes I’ll try this\n" +
                "Yes I’ll attend that\n" +
                "Yes I’ll try to learn to say no";

        String from10 = "From hairy armpits but painted nails\n" +
                " And unabashed technicolor\n" +
                "Jeremy Scott by way of Salvation Army\n" +
                "Donna Karan by way of Goodwill";
    }
}
