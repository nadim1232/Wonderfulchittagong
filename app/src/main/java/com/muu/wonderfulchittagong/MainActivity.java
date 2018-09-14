package com.muu.wonderfulchittagong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView content_list;
    String[] content_name;
    String[] content_type;
    String[] content_details;
    Integer imageID;
    String nameText;
    String details;
    String url;

    Integer[] content_Image={R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5,R.drawable.p6,R.drawable.p7,R.drawable.p8,R.drawable.p9,R.drawable.p10,R.drawable.p11,R.drawable.p12,R.drawable.p13,R.drawable.p14,R.drawable.p15,R.drawable.p16};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        content_list=findViewById(R.id.listViewID);
        content_name =getResources().getStringArray(R.array.content_name);
        content_type =getResources().getStringArray(R.array.content_type);
        content_details =getResources().getStringArray(R.array.content_details);


        Content_Adapter content_adapter= new Content_Adapter(this,content_name,content_type,content_Image);
        content_list.setAdapter(content_adapter);

        content_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                if(position==0) {
                    url="https://www.google.com/maps/place/Foy's+Lake/@22.3697727,91.789999,15.56z/data=!4m13!1m7!3m6!1s0x30acd9aa98405209:0xb103aae26078f9d2!2sFoy's+Lake!3b1!8m2!3d22.3721435!4d91.7929924!3m4!1s0x30acd9aa98405209:0xb103aae26078f9d2!8m2!3d22.3721435!4d91.7929924";
                    imageID = R.drawable.p1;
                    nameText = content_name[position];
                    details = content_details[position];
                    startActivity(new Intent(getApplicationContext(), item.class).putExtra("imageID", imageID).putExtra("content_name", nameText).putExtra("content_details", details).putExtra("url",url));
                }

                else if (position==1){
                    url="https://www.google.com/maps/place/Patenga+Sea+Beach/@22.2363779,91.7900896,16.17z/data=!4m5!3m4!1s0x30acde2c8d9eadf3:0xe8d981f0a04481dd!8m2!3d22.2352023!4d91.7913938";
                    imageID = R.drawable.p2;
                    nameText = content_name[position];
                    details = content_details[position];
                    startActivity(new Intent(getApplicationContext(), item.class).putExtra("imageID", imageID).putExtra("content_name", nameText).putExtra("content_details", details).putExtra("url",url));
                }

                else if (position==2){
                    url="https://www.google.com/maps/place/Ethnological+Museum/@22.3279928,91.8136425,17z/data=!4m5!3m4!1s0x30acd8b44a4e12f3:0xece2eb9728de5f2!8m2!3d22.3280425!4d91.8149961";
                    imageID = R.drawable.p3;
                    nameText = content_name[position];
                    details = content_details[position];
                    startActivity(new Intent(getApplicationContext(), item.class).putExtra("imageID", imageID).putExtra("content_name", nameText).putExtra("content_details", details).putExtra("url",url));
                }

                else if (position==3){
                    url="https://www.google.com/maps/place/Bayazid+Bostami+Mazar/@22.389313,91.8081699,17z/data=!4m5!3m4!1s0x30acd8417df66701:0xd7daffbe7e6212ac!8m2!3d22.3892039!4d91.8090497";
                    imageID = R.drawable.p4;
                    nameText = content_name[position];
                    details = content_details[position];
                    startActivity(new Intent(getApplicationContext(), item.class).putExtra("imageID", imageID).putExtra("content_name", nameText).putExtra("content_details", details).putExtra("url",url));
                }

                else if (position==4){
                    url="https://www.google.com/maps/place/Zia+Memorial+Museum/@22.3481422,91.8233229,17z/data=!4m5!3m4!1s0x30acd89864d937c7:0xff3dde3128a5e60b!8m2!3d22.3482315!4d91.8238808";
                    imageID = R.drawable.p5;
                    nameText = content_name[position];
                    details = content_details[position];
                    startActivity(new Intent(getApplicationContext(), item.class).putExtra("imageID", imageID).putExtra("content_name", nameText).putExtra("content_details", details).putExtra("url",url));
                }

                else if (position==5){
                    url="https://www.google.com/maps/place/Butterfly+Park+Bangladesh/@22.2403047,91.8150055,17z/data=!4m5!3m4!1s0x30acdfe61d081d09:0x58026f0bb6f76970!8m2!3d22.2403941!4d91.8165612";
                    imageID = R.drawable.p6;
                    nameText = content_name[position];
                    details = content_details[position];
                    startActivity(new Intent(getApplicationContext(), item.class).putExtra("imageID", imageID).putExtra("content_name", nameText).putExtra("content_details", details).putExtra("url",url));
                }

                else if (position==6){
                    url="https://www.google.com/maps/place/Shishu+Park/@22.3471949,91.8171959,15z/data=!4m8!1m2!2m1!1sShishu+Park!3m4!1s0x30acd8a28265ad23:0x3debd772fd91ba70!8m2!3d22.3475918!4d91.8240624";
                    imageID = R.drawable.p7;
                    nameText = content_name[position];
                    details = content_details[position];
                    startActivity(new Intent(getApplicationContext(), item.class).putExtra("imageID", imageID).putExtra("content_name", nameText).putExtra("content_details", details).putExtra("url",url));
                }

                else if (position==7){
                    url="https://www.google.com/maps/place/Chittagong+Zoo/@22.366524,91.7948779,17z/data=!4m5!3m4!1s0x30acd8fe9088eab1:0x8ea2ede378cf1f5b!8m2!3d22.3665439!4d91.7960473";
                    imageID = R.drawable.p8;
                    nameText = content_name[position];
                    details = content_details[position];
                    startActivity(new Intent(getApplicationContext(), item.class).putExtra("imageID", imageID).putExtra("content_name", nameText).putExtra("content_details", details).putExtra("url",url));
                }

                else if (position==8){
                    url="https://www.google.com/maps/place/Shadhinata+Complex/@22.3754467,91.8484916,17z/data=!4m5!3m4!1s0x30ad279f201d0c01:0x138512ec5c0fda32!8m2!3d22.3758039!4d91.8485989";
                    imageID = R.drawable.p9;
                    nameText = content_name[position];
                    details = content_details[position];
                    startActivity(new Intent(getApplicationContext(), item.class).putExtra("imageID", imageID).putExtra("content_name", nameText).putExtra("content_details", details).putExtra("url",url));
                }

                else if (position==9){
                    url="https://www.google.com/maps/place/Nazrul+Square,+DC+Hill/@22.3415955,91.8306063,17z/data=!4m5!3m4!1s0x30ad275f53f55957:0x1c895e7b5abd982d!8m2!3d22.3416749!4d91.8321405";
                    imageID = R.drawable.p10;
                    nameText = content_name[position];
                    details = content_details[position];
                    startActivity(new Intent(getApplicationContext(), item.class).putExtra("imageID", imageID).putExtra("content_name", nameText).putExtra("content_details", details).putExtra("url",url));
                }

                else if (position==10){
                    url="https://www.google.com/maps/place/Sunset+Point/@22.427544,91.7559993,17z/data=!4m5!3m4!1s0x30acd753b85d0103:0xfc170fcd208b9987!8m2!3d22.4276829!4d91.7574477";
                    imageID = R.drawable.p11;
                    nameText = content_name[position];
                    details = content_details[position];
                    startActivity(new Intent(getApplicationContext(), item.class).putExtra("imageID", imageID).putExtra("content_name", nameText).putExtra("content_details", details).putExtra("url",url));
                }

                else if (position==11){
                    url="https://www.google.com/maps/place/Cheragi+Pahar/@22.3439874,91.8329598,17z/data=!4m5!3m4!1s0x30ad275f05630d23:0x70a1e7797cbb4197!8m2!3d22.3437195!4d91.8336786";
                    imageID = R.drawable.p12;
                    nameText = content_name[position];
                    details = content_details[position];
                    startActivity(new Intent(getApplicationContext(), item.class).putExtra("imageID", imageID).putExtra("content_name", nameText).putExtra("content_details", details).putExtra("url",url));
                }

                else if (position==12){
                    url="https://www.google.com/maps/place/Sea+World+Resort/@22.3763838,91.7872578,17z/data=!4m5!3m4!1s0x30acd9abdcd25987:0x55eec4a29c3eebe4!8m2!3d22.3758778!4d91.7885667";
                    imageID = R.drawable.p13;
                    nameText = content_name[position];
                    details = content_details[position];
                    startActivity(new Intent(getApplicationContext(), item.class).putExtra("imageID", imageID).putExtra("content_name", nameText).putExtra("content_details", details).putExtra("url",url));
                }

                else if (position==13){
                    url="https://www.google.com/maps/place/CVASU+Anatomy+museum/@22.3633033,91.8028625,17z/data=!4m5!3m4!1s0x30acd8f0f024c501:0x38f7f01066b5fc12!8m2!3d22.3632239!4d91.8043109";
                    imageID = R.drawable.p14;
                    nameText = content_name[position];
                    details = content_details[position];
                    startActivity(new Intent(getApplicationContext(), item.class).putExtra("imageID", imageID).putExtra("content_name", nameText).putExtra("content_details", details).putExtra("url",url));
                }

                else if (position==14){
                    url="https://www.google.com/maps/place/Cafe+24/@22.4231988,91.7955482,17z/data=!4m5!3m4!1s0x30acd7813b69fa03:0x6cdeec0729dab407!8m2!3d22.4232087!4d91.7970395";
                    imageID = R.drawable.p15;
                    nameText = content_name[position];
                    details = content_details[position];
                    startActivity(new Intent(getApplicationContext(), item.class).putExtra("imageID", imageID).putExtra("content_name", nameText).putExtra("content_details", details).putExtra("url",url));
                }

                else if (position==15){
                    url="https://www.google.com/maps/place/Bhatiyari+Lake/@22.4288906,91.7604147,17z/data=!4m5!3m4!1s0x30acd7524b185685:0xa8ba806fcc222d48!8m2!3d22.4286328!4d91.7622171";
                    imageID = R.drawable.p16;
                    nameText = content_name[position];
                    details = content_details[position];
                    startActivity(new Intent(getApplicationContext(), item.class).putExtra("imageID", imageID).putExtra("content_name", nameText).putExtra("content_details", details).putExtra("url",url));
                }

                else if (position==16){
                    url="https://www.google.com/maps/place/Agrabad+Jamboree+Park/@22.3245122,91.8074092,17z/data=!4m12!1m6!3m5!1s0x30acd97c794ce563:0x258d19d3ac4751ac!2sAgrabad+Jamboree+Park!8m2!3d22.3245643!4d91.8087825!3m4!1s0x30acd97c794ce563:0x258d19d3ac4751ac!8m2!3d22.3245643!4d91.8087825";
                    imageID = R.drawable.p17;
                    nameText = content_name[position];
                    details = content_details[position];
                    startActivity(new Intent(getApplicationContext(), item.class).putExtra("imageID", imageID).putExtra("content_name", nameText).putExtra("content_details", details).putExtra("url",url));
                }


            }
        });

    }
}
