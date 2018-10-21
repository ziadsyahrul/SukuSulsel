package com.ziadsyahrul.sukusulsel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    //TODO 1 mengenerate butterknife untuk recycleview
    @BindView(R.id.my_recycler_view)
    RecyclerView myRecyclerView;

    //TODO 2 membuat variable array untuk menampung data nama,detail dan gambar dari String Array pada
    String[] namaSuku;
    String[] detailSuku;
    int[] gambarSuku;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        //TODO 3 Mengisi variable array dari folder -> Strings,drawable
        namaSuku = getResources().getStringArray(R.array.name_suku);
        detailSuku = getResources().getStringArray(R.array.detail_suku);
        gambarSuku = new int[]{R.drawable.suku_bugis,R.drawable.suku_mandar,R.drawable.toraja, R.drawable.suku_bentong,R.drawable.suku_duri,R.drawable.suku_enrekang,R.drawable.suku_konjo_pegunungan,R.drawable.suku_konjo_pesisir,R.drawable.suku_luwu,R.drawable.suku_kajang};

        //TODO 4 Membuat object adpater dan mengirim data nama,detail dan gambar ke adapter
        Adapter adapter = new Adapter(RecycleActivity.this,gambarSuku,namaSuku,detailSuku);
        //TODO 5 Mensetting recyclerview dan mengeset recycleview dengan adapter
        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecyclerView.setAdapter(adapter);

    }
}

