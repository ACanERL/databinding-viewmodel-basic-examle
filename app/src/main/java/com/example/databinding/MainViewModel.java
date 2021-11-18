package com.example.databinding;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private String sonuc="0";
    public String getSonuc() {
        return sonuc;
    }
    public void setSonuc(String sonuc) {
        this.sonuc = sonuc;
    }
    public void Toplama(String sayi1,String sayi2){
         int sayi_1=Integer.parseInt(sayi1);
         int sayi_2=Integer.parseInt(sayi2);
         int toplam=sayi_1+sayi_2;
         sonuc=String.valueOf(toplam);
    }
    public void Carpma(String sayi1,String sayi2){
         int sayi_1=Integer.parseInt(sayi1);
          int sayi_2=Integer.parseInt(sayi2);
          int carpim=sayi_1*sayi_2;
          sonuc=String.valueOf(carpim);

    }
}
