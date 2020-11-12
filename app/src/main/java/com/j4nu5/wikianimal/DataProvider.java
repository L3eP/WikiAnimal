package com.j4nu5.wikianimal;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.j4nu5.wikianimal.model.Anjing;
import com.j4nu5.wikianimal.model.Hewan;
import com.j4nu5.wikianimal.model.Tikus;
import com.j4nu5.wikianimal.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Tikus> initDataTikus(Context ctx) {
        List<Tikus> tikuses = new ArrayList<>();
        tikuses.add(new Tikus("Celurut", "Asia",
                "bertubuh kecil yang berpenampilan mirip mencit/tikus kecil dan tergolong dalam famili Soricidae.", R.drawable.rat_celutut));
        tikuses.add(new Tikus("Mencit", "Asia",
                " Mencit mudah dijumpai di rumah-rumah dan dikenal sebagai hewan pengganggu karena kebiasaannya menggigiti mebel dan barang-barang kecil lainnya, serta bersarang di sudut-sudut lemari.  ", R.drawable.rat_mencit));
        tikuses.add(new Tikus("Tikus rumah", "Asia",
                "Warnanya biasanya hitam atau coklat terang, meskipun sekarang ada yang dibiakkan dengan warna putih atau loreng. Ukurannya biasanya 15–20 cm dengan ekor ± 20 cm. Hewan ini nokturnal dan pemakan segala, tetapi menyukai bulir-bulir ", R.drawable.rat_rumah));
        tikuses.add(new Tikus("Tikus got", "Asia",
                "salah satu spesies yang umum dijumpai di perkotaan. Hasil seleksi terhadap hewan ini banyak digunakan sebagai hewan percobaan (dikenal sebagai tikus putih) dan sebagai hewan peliharaan (dengan warna bervariasi). ", R.drawable.rat_got));
        tikuses.add(new Tikus("Tikus sawah", "Asia",
                "berukuran sedang, cenderung lebih kecil daripada tikus got, dengan panjang 30-40cm (termasuk ekor). Warna rambut coklat kekuningan. Nama argentiventer berarti \"berperut keperakan\". Ekornya berwarna coklat.  ", R.drawable.rat_sawah));
        tikuses.add(new Tikus("Wirok", "Asia",
                "Berbulu Wirok mempunyai bulu-bulu yang pendek dan kasar, Kaki depannya mempunyai empat jari berkuku sedangkan belakang lima jari berkuku. Moncong tikus ini lebar dan pendek dan seakan-akan berbentuk bulat berbeda dengan tikus lain.", R.drawable.rat_wirok));
        return tikuses;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataTikus(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}

