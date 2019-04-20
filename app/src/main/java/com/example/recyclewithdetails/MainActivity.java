package com.example.recyclewithdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode List";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> gambarUrls = new ArrayList<>();
    private ArrayList<String> penjelasan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        gambarUrls.add("http://static.bmdstatic.com/pk/product/medium/YAMAHA-Gitar-Akustik-[FX-310]-SKU00113566_0-20140328220000.jpg");
        mNames.add("Gitar");
        mDesc.add("Gitar Akustic");
        penjelasan.add("Gitar akustik adalah gitar yang didesain dengan badan yang berlubang bagian tengahnya. Lubang tersebut digunakan untuk menggemakan suara saat dawai dipetik, karena gitar akustik dimainkan tanpa menggunakan tenaga listrik atau manual. Kedua, adalah gitar elektrik yaitu gitar yang dimainkan dengan bantuan aliran listrik untuk mendukung suaranya. ");

        gambarUrls.add("https://www.audiopro.id/~img/yamaha_pacifica_pac611hfm_800x800-a0b4b-3037_573.jpg");
        mNames.add("Gitar");
        mDesc.add("Gitar Elektrik");
        penjelasan.add("Gitar listrik adalah sejenis gitar yang menggunakan beberapa pickup untuk mengubah bunyi atau getaran dari string gitar menjadi arus listrik yang akan dikuatkan kembali dengan menggunakan seperangkat amplifier dan loud speaker.");

        gambarUrls.add("https://i2.wp.com/hargakatalog.id/wp-content/uploads/2018/12/Gitar-Ukulele-Bass.png?resize=650%2C654&ssl=1");
        mNames.add("Ukulele");
        mDesc.add("Ukulele");
        penjelasan.add("Ukulele adalah alat musik petik sejenis gitar berukuran kecil, sekitar 20 inci, dan merupakan alat musik asli Hawai ditemukan sekitar tahun 1879. Sedangkan alat musik itu sendiri diperkirakan datangnya dari kepulauan Hawai kurang lebih pada abad ke 16. ");

        gambarUrls.add("http://2.bp.blogspot.com/-T3OnbLRKRJ0/VObmdvWpjXI/AAAAAAAAF-w/3AOcwkkS3E0/s1600/piano.jpg");
        mNames.add("Piano");
        mDesc.add("Piano");
        penjelasan.add("Piano adalah alat musik yang dimainkan dengan jari-jemari tangan. Pemain piano disebut pianis. Piano adalah salah jenis alat musik yang populer di dunia. alat musik piano juga dapat dikategorikan sebagai alat musik tertua dan juga memiliki harga yang cukup mahal. Mungkin memang benar, alat musik piano jarang kita temui kecuali di tempat-tempat tertentu, itu karena dilihat dari harga piano yang cukup mahal. Bagi sebagian orang mungkin belum mengetahui perkembangan dan sejarah alat musik piano.");

        gambarUrls.add("https://pbs.twimg.com/media/C3x0kchVcAA4TVS.jpg");
        mNames.add("Drum");
        mDesc.add("Drum");
        penjelasan.add("Drum adalah kelompok alat musik perkusi yang terdiri dari kulit yang direntangkan dan dipukul dengan tangan atau sebuah batang. Selain kulit, drum juga digunakan dari bahan lain, misalnya plastik.");

        gambarUrls.add("https://my-live-02.slatic.net/original/8f82273012f6ca9130c95667db2e0001.jpg");
        mNames.add("Bass");
        mDesc.add("Bass Electrik");
        penjelasan.add("Bass atau Bas adalah jenis suara terendah penyanyi pria, biasanya mempunyai jangkauan dari nada E2 sampai E4. Walaupun demikian, beberapa penyanyi yang nada rendahnya bisa sangat ekstrem, bisa mencapai nada C2.");

        gambarUrls.add("https://4.bp.blogspot.com/-qmeN0JB1OsE/WGsXD0gFPRI/AAAAAAAAEsM/4Ll_UEFEwN8T55IhoLeqgjrO9XHOyeHawCLcB/s1600/Harga%2BBiola.jpg");
        mNames.add("Biola");
        mDesc.add("Biola");
        penjelasan.add("Biola adalah sebuah alat musik dawai yang dimainkan dengan cara digesek. Biola memiliki empat senar (G-D-A-E) yang disetel berbeda satu sama lain dengan interval sempurna kelima. Nada yang paling rendah adalah G. Di antara keluarga biola, yaitu dengan biola alto, cello dan double bass atau kontra bass, biola memiliki nada yang tertinggi. Alat musik dawai yang lainnya, bas, secara teknis masuk ke dalam keluarga viol. Kertas musik untuk biola hampir selalu menggunakan atau ditulis pada kunci G.");

        gambarUrls.add("https://cajondg.com/wp-content/uploads/2018/01/26DrumBox.png");
        mNames.add("Cajon");
        mDesc.add("Drum Box");
        penjelasan.add("Cajón (pengucapan bahasa Spanyol: [kaˈxon] (ka-hone), \"peti\" atau \"kotak berlubang\") adalah alat musik perkusi berbentuk kotak bersisi enam yang dimainkan dengan menepuk sisi-sisinya dengan tangan, jari, atau berbagai alat lain seperti stik atau sikat (drum).");





        initRecyclerView();

    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, mNames, gambarUrls, mDesc, penjelasan);
        recyclerView.setAdapter(adapter);
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames, gambarUrls, mDesc, penjelasan);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridActivity adapter = new GridActivity(this, mNames, gambarUrls, mDesc, penjelasan);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Mode List");
                showRecyleList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode Card View");
                initRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}