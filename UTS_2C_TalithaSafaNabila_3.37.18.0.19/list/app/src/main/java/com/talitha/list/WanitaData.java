package com.talitha.list;

import java.util.ArrayList;

public class WanitaData {
    public static String [] [] data = new String[][] {
            {"0","Angela Merkel",
                    "adalah politikus dan mantan ilmuwan peneliti Jerman yang menjabat sebagai Kanselir Jerman sejak 2005 dan Ketua Persatuan Demokrat Kristen (CDU) sejak 2000. " +
                            "Merkel adalah perempuan pertama yang memegang kedua jabatan tersebut." , "https://i.postimg.cc/d1tZHMnM/angela-merkel.jpg"},
            {"1","Theresa May",
                    "adalah seorang politikus Britania yang menjabat sebagai Perdana Menteri Britania Raya dan Pemimpin Partai Konservatif dari tahun 2016 hingga 2019. . " +
                    "May menjabat sebagai Menteri Dalam Negeri dari tahun 2010 hingga 2016 dan menjadi Anggota Parlemen dari daerah pemilihan Maidenhead sejak tahun 1997." +
                    "Secara ideologis, ia mengidentifikasi dirinya sebagai konservatif sebangsa.", "https://i.postimg.cc/0Q0RNFqN/Theresa-May.jpg"},
            {"2","Christine Lagarde",
                    "adalah pengacara dan politikus Prancis yang saat ini menjabat sebagai Direktur Pelaksana dan Ketua Dana Moneter Internasional (IMF)." +
                    "Lagarde memegang jabatan ini sejak 5 Juli 2011." +
                    "Ia sebelumnya memegang beberapa jabatan menteri senior pemerintah Prancis, yaitu Menteri Ekonomi, Keuangan, dan Pekerjaan, Menteri Pertanian dan Perikanan, dan Menteri Perdagangan di kabinet Dominique de Villepin.", "https://i.postimg.cc/vZtW3vMV/Christine-Lagarde.jpg"},
            {"3","Mary Barra",
                    "Ia telah memegang posisi CEO sejak 15 Januari 2014, dan ia adalah CEO wanita pertama dari pembuat mobil global utama." +
                    "Pada 10 Desember 2013, GM menamainya untuk menggantikan Dan Akerson sebagai chief executive officer , dan sebelum itu, Barra menjabat sebagai wakil presiden eksekutif Pengembangan Produk Global, Pembelian, dan Rantai Pasokan di General Motors ." , "https://i.postimg.cc/RVqyrNqh/Mary-Barra.jpg"},
            {"4","Abigail Johnson",
                    "adalah seorang pengusaha wanita miliarder Amerika." +
                    "Sejak 2014, Johnson telah menjadi presiden dan chief executive officer dari perusahaan investasi Amerika Fidelity Investments (FMR), [6] dan ketua perusahaan saudara internasional Fidelity International (FIL)." +
                    "Pada Maret 2013, keluarga Johnson memiliki 49% saham di perusahaan, dengan Johnson sendiri memegang sekitar 24,5%.", "https://i.postimg.cc/Yjc1ynh1/Abigail-Johnson.jpg"},
    };
    public static ArrayList<Wanita> getListData(){
        ArrayList<Wanita> list = new ArrayList<>();
        for (String[] WanitaDuniaData : data) {
            Wanita wanita = new Wanita();
            wanita.setId(Integer.parseInt(WanitaDuniaData[0]));
            wanita.setName(WanitaDuniaData[1]);
            wanita.setDescription(WanitaDuniaData[2]);
            wanita.setPhoto(WanitaDuniaData[3]);
            list.add(wanita);
        }
        return list;
    }
}
