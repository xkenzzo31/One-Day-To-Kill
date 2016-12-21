package fr.wildcodeschool.apprenti.odtk;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by chantome on 16/12/2016.
 */

public class Scene13 extends AppCompatActivity {
    public final static String HERO = "fr.wildcodeschool.apprenti.odtk.HERO";
    private SparseArray<DialogueModel> listDialog = new SparseArray<DialogueModel>();
    private TextView text,name;
    private int clic=0;
    Button btnA,btnB;
    private HeroModel hero = new HeroModel();
    TextView question;
    RelativeLayout choice;
    ImageView life;

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

        scenetitle.setText("Scene1-3");
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

        listDialog.put(0,new DialogueModel(" ","Marcus désespérer tente malgré la mise en garde de contacter la police"));
        listDialog.put(1,new DialogueModel("Agent de police","Commissariat de ParadiseCity, que puis-je faire pour vous ?"));
        listDialog.put(2,new DialogueModel("Marcus","Ma femme à été enlever ce matin pendant mon absence !!!"));
        listDialog.put(3,new DialogueModel("Agent de police","Monsieur gardez votre calme, quel est le nom de votre femme ?"));
        listDialog.put(4,new DialogueModel("Marcus","Elle s’appelle Mylène Gaviria"));
        listDialog.put(5,new DialogueModel("Agent de police","Vous avez une idée de qui aurait pu faire ca ?"));
        listDialog.put(6,new DialogueModel("Marcus","Non dans cette ville cela pourrait être n’import qui…"));
        listDialog.put(7,new DialogueModel("Agent de police","Très bien monsieur, nous lançons les recherches le plus vite possible nous vous recontacteront quand on aura du nouveau."));
        listDialog.put(8,new DialogueModel("Marcus","Merci aurevoir"));
        listDialog.put(9,new DialogueModel(" ","Quelques minute plus tard, pendant que marcus désespéré pleure la disparition de sa femme…"));
        listDialog.put(10,new DialogueModel(" ","Son téléphone sonne"));
        listDialog.put(11,new DialogueModel("Marcus"," Allo ?"));
        listDialog.put(12,new DialogueModel("Tony","Salut fils..j’ai reçu un appel du commissaire gordon qui m’a parler de se qui est arrivé à Mylène. Je penses savoir celui qui est derrière tout ca. Un coup de ce fils de pute de Marcano.\u2028Crois moi il ne va pas s’en tirer comme ca, je vais lui montrer qui c’est Tony. Aux quatre coins de la ville on va l’retrouver, éparpillé par petits bouts façon puzzle…\u2028Tiens le coup mon garcon..et ne fait surtout pas le con."));
        listDialog.put(13,new DialogueModel(" ","Juste après l’appel, marcus revois une photo de sa femme avec un doigt en moins..avec pour message : on t’as dit de ne prévenir personne…\n"));



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

                    hero.setWommenLife(9);
                    life.setImageResource(R.drawable.finger2);

                    bulle.setVisibility(View.GONE);
                    next.setVisibility(View.GONE);

                    Intent intent = new Intent(Scene13.this, Scene2.class);
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

    }
}
