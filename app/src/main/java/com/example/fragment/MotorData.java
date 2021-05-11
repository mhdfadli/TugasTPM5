package com.example.fragment;

import java.util.ArrayList;

public class MotorData {
    private static String[] motorNames = {
            "Yamaha Aerox",
            "Yamaha Hybride",
            "Yamaha Nmax",
            "Honda pcx",
            "Honda Pespa",
            "Honda Pespa R",
            "Honda Sprint",
            "Yamaha Tmax",
            "Honda Vario",
            "Yamaha Xmax"
    };

    private static String[] motorDetails = {
            "Yamaha Aerox adalah skuter pabrikan yang diproduksi oleh Yamaha sejak tahun 1997",
            "Motor hybrid merupakan kombinasi antara penggunaan mesin konvensional dengan dinamo atau motor listrik untuk menggerakkan motor",
            "Yamaha Nmax ABS merupakan pilihan terbaik skuter matik masa kini dengan fitur dan teknologi canggih",
            "Honda PCX 150 adalah motor keluaran Honda yang ditujukan bagi segmen motor premium skutik",
            "Vespa adalah merek sepeda motor jenis skuter yang berasal dari Italia",
            "Vespa adalah merek sepeda motor jenis skuter yang berasal dari Italia",
            "Sprint adalah salah satu model yang mencerminkan brand Vespa",
            "TMax adalah Yamaha maxi terbesar yang ada saat ini. Roda belakang dibekali disk brake. Wajar karena tenaganya mencapai 45 ps",
            "Vario 110 masih dijual hingga 29 Maret 2014, sebelum Vario 110 FI launching pada bulan Maret 2014",
            "Yamaha X max merupakan produk dari jajaran Yamaha Maxi. Yamaha X max memiliki berbagai keunggulan terbaik sebagai skuter matik favorit yang nyaman"

    };

    private static int[] motorImages = {
            R.drawable.aerox,
            R.drawable.hybride,
            R.drawable.nmax,
            R.drawable.pcx,
            R.drawable.pespa,
            R.drawable.putih,
            R.drawable.sprint,
            R.drawable.tmax,
            R.drawable.vario,
            R.drawable.xmax

    };

    static ArrayList<MotorModel> getListData(){
        ArrayList<MotorModel> list = new ArrayList<>();
        for (int position = 0; position < motorNames.length; position++){
           MotorModel motormodel = new MotorModel();
           motormodel.setName(motorNames[position]);
           motormodel.setDetail(motorDetails[position]);
           motormodel.setPhoto(motorImages[position]);
           list.add(motormodel);
        }
        return list;
    }
}
