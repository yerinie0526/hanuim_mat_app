package ddwu.mobile.final_project.a2020haniumproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //깃 허브 실험 채연이에오

        //채연아...잘지냈니 그동안...(별)

        //아닐껄... 조만간 만나자 언니...(눈물)
    }
    public void onClick(View v) {
        Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show();
    }
}