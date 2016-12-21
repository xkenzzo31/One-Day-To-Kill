package fr.wildcodeschool.apprenti.odtk;

import android.content.Intent;
<<<<<<< HEAD
=======
import android.media.Image;
>>>>>>> 37c4cf7e38d09836e0b6ae7960e00cf55b0aa948
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;
import android.view.View;
<<<<<<< HEAD
=======
import android.view.Window;
import android.view.WindowManager;
>>>>>>> 37c4cf7e38d09836e0b6ae7960e00cf55b0aa948
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.Serializable;

/**
 * Created by chantome on 16/12/2016.
 */

public class Scene12 extends AppCompatActivity {
    public final static String HERO = "fr.wildcodeschool.apprenti.odtk.HERO";
    private SparseArray<DialogueModel> listDialog = new SparseArray<DialogueModel>();
    private TextView text,name;
    private int clic=0;
    Button btnA,btnB;
<<<<<<< HEAD
    final HeroModel hero = (HeroModel) getIntent().getSerializableExtra(Scene1.HERO);
=======
    private HeroModel hero = new HeroModel();
    TextView question;
    RelativeLayout choice;
    ImageView life;
>>>>>>> 37c4cf7e38d09836e0b6ae7960e00cf55b0aa948

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game);

        ImageView background = (ImageView)findViewById(R.id.scene_background);
        final ImageButton next = (ImageButton)findViewById(R.id.next);
        final RelativeLayout bulle = (RelativeLayout)findViewById(R.id.bulle);
        TextView scenetitle = (TextView)findViewById(R.id.scene);
        TextView lieu = (TextView)findViewById(R.id.setLieu);

        scenetitle.setText("Scene1-2");
        lieu.setText("Maison");

        name = (TextView)findViewById(R.id.name);
        text = (TextView)findViewById(R.id.talk);

        life = (ImageView)findViewById(R.id.lifeFiger);

        switch (hero.getWommenLife()){
            case 10:
                life.setImageResource(R.drawable.finger1);
                break;
            case 9:
                life.setImageResource(R.drawable.finger2);
                break;
            case 8:
                life.setImageResource(R.drawable.finger3);
                break;
            case 7:
                life.setImageResource(R.drawable.finger4);
                break;
            case 6:
                life.setImageResource(R.drawable.finger5);
                break;
            case 5:
                life.setImageResource(R.drawable.finger6);
                break;
            case 4:
                life.setImageResource(R.drawable.finger7);
                break;
            case 3:
                life.setImageResource(R.drawable.finger8);
                break;
            case 2:
                life.setImageResource(R.drawable.finger9);
                break;
            case 1:
                life.setImageResource(R.drawable.finger10);
                break;
        }

        ImageView gun = (ImageView)findViewById(R.id.imageFlingue);
        ImageView cut = (ImageView)findViewById(R.id.imageCouteau);
        ImageView bomb = (ImageView)findViewById(R.id.imageBombe);

        if (hero.isCut()){
            cut.setImageResource(R.drawable.couteau);
        }
        if (hero.isGun()){
            gun.setImageResource(R.drawable.flingue);
        }
        if (hero.isBomb()){
            bomb.setImageResource(R.drawable.bombe);
        }

        question = (TextView) findViewById(R.id.question);

        btnA = (Button)findViewById(R.id.btnA);
        btnB = (Button)findViewById(R.id.btnB);

        background.setImageResource(R.drawable.maison);

<<<<<<< HEAD
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Scene12.this, Scene2.class);
                Bundle mBundle = new Bundle();
                mBundle.putSerializable(HERO,hero);
                intent.putExtras(mBundle);
                startActivity(intent);
            }
        });
=======
        listDialog.put(0,new DialogueModel(" ","Marcus désespérer tente malgré la mise en garde de contacter son père"));
        listDialog.put(1,new DialogueModel(" ","Pas de réponse…"));

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clic < listDialog.size()){

                    String d_name = listDialog.get(clic).getPersonnageName();
                    String d_text = listDialog.get(clic).getText();

                    if(d_name == " "){
                        name.setText(d_name);
                        name.setVisibility(View.GONE);
                    }else{
                        name.setText(d_name+" : ");
                        name.setVisibility(View.VISIBLE);
                    }

                    text.setText(d_text);

                }

                if (clic == listDialog.size()){

                    choice  = (RelativeLayout)findViewById(R.id.choice);

                    bulle.setVisibility(View.GONE);

                    //Faire Intent
                    Intent intent = new Intent(Scene12.this, Scene14.class);
                    Bundle mBundle = new Bundle();
                    mBundle.putSerializable(HERO,hero);
                    intent.putExtras(mBundle);
                    startActivity(intent);
                    finish();

                }else{
                    bulle.setVisibility(View.VISIBLE);
                }

                clic++;
            }
        });

>>>>>>> 37c4cf7e38d09836e0b6ae7960e00cf55b0aa948
    }
}
