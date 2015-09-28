package tjs.co.in.groct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

/**
 * Created by Adnan Khan on 24-Sep-15.
 */
public class About_us extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        TextView textView = (TextView) findViewById(R.id.email_id);
        TextView textView1 = (TextView) findViewById(R.id.web_site);
        Linkify.addLinks(textView,Linkify.EMAIL_ADDRESSES);
        Linkify.addLinks(textView1,Linkify.WEB_URLS);
    }


}
