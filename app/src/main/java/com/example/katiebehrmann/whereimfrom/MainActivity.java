package com.example.katiebehrmann.whereimfrom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

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

    public void randomizeFrom(View view) {

        Random random = new Random();
        int n = random.nextInt(12) + 1;
        int q = random.nextInt(13) + 1;
        String from1 = "I’m from a gentle father \n" +
                "\t(a fucking pushover)\n" +
                "An unapologetic mother \n" +
                "\t(so damn boisterous)";

        String from2 = "From kiddie pools and hot tubs and lawn decor and economy sedans,\n\n" +
                "From the Taco Bell parking lot";

        String from3 = "From early Whole Foods adopters";

        String from4 = "The Jewish family, exoticized in our\n" +
                "demure, blonde, Christian, midwest suburb";

        String from5 = "From no holds barred/totally unashamed/squarely sex-positive/\n" +
                "let’s get you birth control/sexual liberation/power/agency\n" +
                "\n" + "\n" +
                "\tthank thank thank god, I’m so lucky";

        String from6 = "From well-intended neoliberal guilt\n\n" +
                "\tBut growing toward a more actionable politic\n\n" +
                "\t\t(Thank you, friends, for calling me out)";

        String from7 = "I’m from following the rules\n\n" +
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

        String from11 = "From unimaginable pain\n" +
                "unimaginable love\n\n" +
                "just like you";

        String from12 = "Natural scholastic excellence\n" +
                "scientific intrigue\n" +
                "and a horrible imposter syndrome";
        if (n == 1) {
            from.setText(from1);
        }
        if (n == 2) {
            from.setText(from2);
        }
        if (n == 3) {
            from.setText(from3);
        }
        if (n == 4) {
            from.setText(from4);
        }
        if (n == 5) {
            from.setText(from5);
        }
        if (n == 6) {
            from.setText(from6);
        }
        if (n == 7) {
            from.setText(from7);
        }
        if (n == 8) {
            from.setText(from8);
        }
        if (n == 9) {
            from.setText(from9);
        }
        if (n == 10) {
            from.setText(from10);
        }
        if (n == 11) {
            from.setText(from11);
        }
        if (n == 12) {
            from.setText(from12);
        }

        if (q == 1) {
            fromImage.setImageResource(R.drawable.batmitzvah);
        }
        if (q == 2) {
            fromImage.setImageResource(R.drawable.butt);
        }
        if (q == 3) {
            fromImage.setImageResource(R.drawable.christianfamily);
        }
        if (q == 4) {
            fromImage.setImageResource(R.drawable.dadcar);
        }
        if (q == 5) {
            fromImage.setImageResource(R.drawable.dogbeach);
        }
        if (q == 6) {
            fromImage.setImageResource(R.drawable.dressup);
        }
        if (q == 7) {
            fromImage.setImageResource(R.drawable.earlyqueer);
        }
        if (q == 8) {
            fromImage.setImageResource(R.drawable.family);
        }
        if (q == 9) {
            fromImage.setImageResource(R.drawable.momdog);
        }
        if (q == 10) {
            fromImage.setImageResource(R.drawable.nickelodeon);
        }
        if (q == 11) {
            fromImage.setImageResource(R.drawable.streetview);
        }
        if (q == 12) {
            fromImage.setImageResource(R.drawable.stripmall);
        }
        if (q == 13) {
            fromImage.setImageResource(R.drawable.thrift);
        }

    }
}
