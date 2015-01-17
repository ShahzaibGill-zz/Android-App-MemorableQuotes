package sg.MemorableQuotes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

    private QuoteBook mQuoteBook = new QuoteBook();
    private ColorWheel mColorWheel = new ColorWheel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView quoteLabel = (TextView) findViewById(R.id.factTextView);
        final Button showQuoteButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String quote = mQuoteBook.getQuote();

                quoteLabel.setText(quote);

                int color =  mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showQuoteButton.setTextColor(color);


            }
        };
        showQuoteButton.setOnClickListener(listener);

    }
}
