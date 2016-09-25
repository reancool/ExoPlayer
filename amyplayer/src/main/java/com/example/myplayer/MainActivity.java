package com.example.myplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.apkfuns.logutils.LogUtils;
import com.example.myplayer.myplayer.MyPlayerActivity;

import java.io.IOException;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;

import static com.example.myplayer.DemoApplication.getClient;
import static com.example.myplayer.utils.Config.baseUrl;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.go_player)
    Button goPlayer;
    @Bind(R.id.button2)
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    private void tomactTest() {


        final Request request = new Request.Builder()
                .url(baseUrl+"fortest/lesson1/subtitles.json")       //url在调试软件中能获取到json数据，所以不是地址写错的问题
                .build();

        Call call = getClient().newCall(request);


        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                String jsonString = response.body().string();

            }
        });
    }

    @OnClick({R.id.go_player, R.id.button2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.go_player:
                Intent itent=new Intent(this,SampleChooserActivity.class);
                startActivity(itent);
                finish();
                break;
            case R.id.button2:
//                tomactTest();
                Intent itent2=new Intent(this,MyPlayerActivity.class);
                startActivity(itent2);
                finish();
                break;
        }
    }
}
