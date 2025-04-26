package com.zeynepgltn.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
            var sehir = "Istanbul"
            val ulke = "Turkiye"
            var sokakAdi = "Istiklal Caddesi"
            val postaKodu = "34000"

            var email = "ornek@email.com"
            val meslek = "Yazilim Muhendisi"
            var musteriAdi = "Ahmet Yilmaz"
            val dogumGunu = "15.05.1990"
            var maas = 15000
            val medeniDurum = "Evli"

            var stokMiktari = 250
            val urunYorum = "Cok memnun kaldim"
            var urunAdi = "Akilli Telefon"
            val urunPuani = 4

            var odemeTarihi = "25.04.2025"
            val odeme = 1299.99
            var siparisAdeti = 3
            val indirimMiktari = 250.50
            var takipKodu = "TR123456789"

            var arabaModeli = "Toyota Corolla"
            val odaSayisi = 4
            var otobusHatti = "500T"

            val enlem = 41
            var boylam = 29
            val ekranBoyutu = "6.7 inc"
            var agirlik = 0.189
            val kalanDakika = 45

            var marka = "Samsung"
            val muzikAdi = "Bohemian Rhapsody"
            var videoSuresi = 4.25
            val resimAdi = "manzara.jpg"
            var dosyaFormati = "PDF"

            val renk = "Mavi"
            var renkKodu = "#0000FF"

            var telefonModeli = "Galaxy S21"
            val bakiye = 2500.75
            var kitapAdi = "Suc ve Ceza"
            val yayinlamaTarihi = "10.03.2022"
            var ulusalGun = "29 Ekim"
            val tatilGunu = "Pazar"
            var rezervasyonTarihi = "15.07.2025"
            val kuponSuresi = 30
            var kuponKodu = "INDIRIM20"
            val faturaAdresi = "Bahcelievler Mah. Ankara"
            var telefon = "+90 555 123 4567"


            println("Şehir: $sehir")
            println("Ülke: $ulke")
            println("Telefon: $telefon")
            println("Posta Kodu: $postaKodu")
            println("Email: $email")
            println("Meslek: $meslek")
            println("Stok Miktarı: $stokMiktari")
            println("Müşteri Adı: $musteriAdi")
            println("Bakiye: $bakiye")
            println("Doğum Günü: $dogumGunu")
            println("Maaş: $maas")
            println("Medeni Durum: $medeniDurum")
            println("Ürün Yorum: $urunYorum")
            println("Ödeme Tarihi: $odemeTarihi")
            println("Ödeme: $odeme")
            println("Sipariş Adeti: $siparisAdeti")
            println("Araba Modeli: $arabaModeli")
            println("Kitap Adı: $kitapAdi")
            println("Yayınlama Tarihi: $yayinlamaTarihi")
            println("İndirim Miktarı: $indirimMiktari")
            println("Oda Sayısı: $odaSayisi")
            println("Enlem: $enlem")
            println("Boylam: $boylam")
            println("Ürün Adı: $urunAdi")
            println("Yemek Fiyatı: ${85.50}")
            println("Marka: $marka")
            println("Müzik Adı: $muzikAdi")
            println("Video Süresi: $videoSuresi")
            println("Ürün Puanı: $urunPuani")
            println("Resim Adı: $resimAdi")
            println("Dosya Formatı: $dosyaFormati")
            println("Renk: $renk")
            println("Renk Kodu: $renkKodu")
            println("Telefon Modeli: $telefonModeli")
            println("Ekran Boyutu: $ekranBoyutu")
            println("Ağırlık: $agirlik")
            println("Ulusal Gün: $ulusalGun")
            println("Tatil Günü: $tatilGunu")
            println("Rezervasyon Tarihi: $rezervasyonTarihi")
            println("Sokak Adı: $sokakAdi")
            println("Otobüs Hattı: $otobusHatti")
            println("Kalan Dakika: $kalanDakika")
            println("Takip Kodu: $takipKodu")
            println("Kupon Süresi: $kuponSuresi")
            println("Kupon Kodu: $kuponKodu")
            println("Fatura Adresi: $faturaAdresi")
    }
}