package le1.rijks.presentation.ui.main;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import le1.rijks.R;
import le1.rijks.domain.entities.WorkOfArt;

public class MainActivity extends AppCompatActivity implements MainContract.View{
    private TextView textView;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= findViewById(R.id.text_view);

        presenter = ViewModelProviders.of(this).get(MainPresenter.class);
        presenter.setContractView(this);
        presenter.loadWorkOfArt();
    }

    @Override
    public void onWorkOfArtLoaded(WorkOfArt workOfArt) {
        textView.setText(workOfArt.toString());
    }

    @Override
    public void onWorkOfArtLoadingError(String message) {
        textView.setText(message);
    }
}
