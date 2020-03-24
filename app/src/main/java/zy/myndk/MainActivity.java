 package zy.myndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final  JniUtil jniUtil = new JniUtil();
        final EditText numberA = (EditText) findViewById(R.id.number_a);
        final EditText numberB = (EditText) findViewById(R.id.number_b);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = numberA.getText().toString();
                String b = numberB.getText().toString();
                /* 判空 */
                if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(b)) {
                    /* 使用本地方法 */
                    int result = jniUtil.add(Integer.parseInt(a), Integer.parseInt(b));
                    Toast.makeText(MainActivity.this,
                            "" + result,
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,
                            "cannot be empty",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
