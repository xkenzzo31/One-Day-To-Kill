package fr.wildcodeschool.apprenti.odtk;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by chantome on 16/12/2016.
 */

public class SceneIntroActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game);

        final RelativeLayout info = (RelativeLayout)findViewById(R.id.info);
        TextView intro = (TextView) findViewById(R.id.intro);
        ImageButton next = (ImageButton)findViewById(R.id.next);

        info.setVisibility(View.GONE);

        intro.setText("A ParadiseCity il règne un climat tendu entre deux mafia qui se partagent la ville depuis des années.\u2028Tony le chef de la mafia du quartier Est à la main mise sur le marché de la drogue et Marcano chef du quartier West détient celui des armes.\u2028Marcano souhaite s’approprié le territoire de de son rival, et pour ce faire il organise  l’enlèvement de la femme du fils de son ennemi pour le retourner contre lui…\n" +
                "\n" +
                "Le jeudi 15 décembre, Marcus, fils de Tony, rentre de son jogging matinale et tombe sur son appartement ravager…\n");

        intro.setVisibility(View.VISIBLE);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SceneIntroActivity.this, Scene1.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
