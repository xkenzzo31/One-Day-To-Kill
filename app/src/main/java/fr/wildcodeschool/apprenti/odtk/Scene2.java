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

import static fr.wildcodeschool.apprenti.odtk.R.id.btnA;
import static fr.wildcodeschool.apprenti.odtk.R.id.btnB;

/**
 * Created by apprenti on 16/12/16.
 */

public class Scene2 extends AppCompatActivity {
    private SparseArray<DialogueModel> listDialog = new SparseArray<DialogueModel>();
    private TextView text,name;
    private int clic=0;
    private Button btnA,btnB,btnC;
    TextView question;
    private RelativeLayout choice;
    final HeroModel hero = (HeroModel) getIntent().getSerializableExtra(Scene1.HERO);
    public String d_name;
    public String d_text;
/**
 * Created by chantome on 16/12/2016.
 */

public class Scene2 extends AppCompatActivity {
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
        final HeroModel hero = (HeroModel) getIntent().getSerializableExtra(Scene1.HERO);
        ImageView background = (ImageView)findViewById(R.id.scene_background);
        final ImageButton next = (ImageButton)findViewById(R.id.next);
        final RelativeLayout bulle = (RelativeLayout)findViewById(R.id.bulle);
        name = (TextView)findViewById(R.id.name);
        text = (TextView)findViewById(R.id.talk);

        question = (TextView) findViewById(R.id.question);

        btnA = (Button)findViewById(R.id.btnA);
        btnB = (Button)findViewById(R.id.btnB);
        btnC = (Button)findViewById(R.id.btnC);
        background.setImageResource(R.drawable.maison);

        listDialog.put(0,new DialogueModel(" ","Marcus arrive rue sacraint, et se fait cagoules par surprise et se fait menoter, et durant le transport entends deux hommes parler de sa femme et d’un homme séquestré pour avoir trop parler. Ca va, derriere ? rire."));
        listDialog.put(1,new DialogueModel(" ","Marcus désorienté, se fait guider dans un bâtiment puis fouiller…"));
        listDialog.put(2,new DialogueModel("Trevor","Ha tu t’es cru malin, tu voulais faire quoi avec ca ? en reprenant les armes de Marcus..suivi dans crochet du droit.."));
        listDialog.put(3,new DialogueModel("Trevor","Mickel Vas y appel le boss"));
        listDialog.put(4,new DialogueModel("Marcus","Noooooon !Patate! "));
        listDialog.put(5,new DialogueModel("Trevor","Caaaalme mon petit on est à toi dans deux secondes."));
        listDialog.put(6,new DialogueModel("Mickel","oui, patron ? oui il n’a pas suivi les indications…oui…non…trés bien."));
        listDialog.put(7,new DialogueModel("Mickel","Bravo champion grace à toi ta petite femme à perdu deux doigts (de plus), si tu continu comme ca ton plaisir risque de s’amoindrir."));
        listDialog.put(8,new DialogueModel(" ","Pendant que Trevor retire la cagoule de la tête de Marcus."));
        listDialog.put(9,new DialogueModel("Trevor"," bon mon gars t’es ici pour une raison, et il va falloir que tu prenne la bonne décision. Tu vois ce mec ? Il te ressemble un peu, tu vois on lui a demander de faire quelque chose, et lui, il nous trahi. Tu vois en fait, cette pute boss pour ton père et tu vois, c’est toi qui va le tuer.\n" +
                "A moins que tu ne veuille pas revoir ta femme…\n" +
                "\n" +
                "Tu commence à comprendre ?"));
        listDialog.put(10,new DialogueModel("Marcus"," Crache au visage et se fais ruer de coups."));
        listDialog.put(11,new DialogueModel("Trevor"," Maintenant prends ta décision.."));
        listDialog.put(12,new DialogueModel("Trevor"," dernière chance !"));





        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(clic < listDialog.size()){
                    if(hero.isCut() == true || hero.isGun() == true && clic >= listDialog.indexOfKey(0)&& clic <= 11 ){
                        d_name = listDialog.get(clic).getPersonnageName();
                        d_text = listDialog.get(clic).getText();
                    }
                    if(listDialog.get(11).getText() == " Maintenant prends ta décision.."){
                        choice  = (RelativeLayout) findViewById(R.id.choice) ;

                        bulle.setVisibility(View.GONE);
                        next.setVisibility(View.GONE);


                        choice.setVisibility(View.VISIBLE);

                        question.setText("Tue le !");
                        btnA.setText("D'accors .. ");
                        btnB.setText("Non !");
                        btnC.setVisibility(View.GONE);
                        btnA.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                            }
                        });
                    }

                    name.setText(d_name);
                    text.setText(d_text);

                }

                if (clic == listDialog.size()){

                    choice  = (RelativeLayout) findViewById(R.id.choice) ;

                    bulle.setVisibility(View.GONE);
                    next.setVisibility(View.GONE);


                    choice.setVisibility(View.VISIBLE);

                        question.setText("Pourquoi ?");
                        btnA.setText("A");
                        btnB.setText("B");
                        btnC.setText("C");


                }else{
                    bulle.setVisibility(View.VISIBLE);
                }

                clic++;
            }
        });


    }

    }
}
