package com.burakguvendiren.firstprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Hello  World")

        //değişkenler ve sabitler
        //Integer

        println("-----Int-----")


        println(5 * 10)
        val a = 5
        val b = 10
        println(a * b)
        var old = 60
        println(old * 10 / 7)
        old = 60
        println(old * 5 / 8)

        val x = 5
        val y = 20

        println(x + y)


        // camelCase
        // snake_case

        val yasSonucu = old * x
        println(yasSonucu)

        //Tanımlama (Defining)
        val benimIntegerim: Int

        //Başlatma, Değerini Atama (Initializing, Inilitiazation)
        benimIntegerim = 5
        var yeniInteger: Int = 20
        println(benimIntegerim / 2)

        //Long
        println("-----Int-----")

        var myLong: Long = 100
        myLong = 30000000
        println(myLong)

        //Double & Float
        println("-----Double & Float-----")
        val pi = 3.14
        println(pi * 2)

        val floatPi: Float = 3.14f
        println(floatPi * 2)
        val yeniDouble = 5.0
        println(yeniDouble / 2)


        //String - Metin
        println("-----String - Metin-----")

        val benimString = "Benim Yeni Metnim"
        println(benimString.length)

        val isim = "Burak"
        val soyisim = "Güvendiren"
        val tamisim = isim + " " + soyisim
        println(tamisim)

        val yeniBirString: String
        yeniBirString = "10"

        val baskaBirString = "20"
        println(yeniBirString + baskaBirString)

        //boolean
        println("-----Boolean-----")

        var benimBoolean = true
        benimBoolean = false

        // < -> küçüktür
        // > -> büyüktür
        // == -> eşittir
        // != -> eşit değildir
        // >= -> büyük eşittir
        // && -> ve
        // || -> veya

        println(3 == 5)
        println(4 != 4)

        //Veri Tipi Dönüştürme
        println("-----Donusturme-----")

        val benimInt = 10
        val benimLongaCevrilenInt = benimInt.toLong()
        println(benimLongaCevrilenInt)

        val kullaniciGirdisi = "50"
        val kullaniciInt = kullaniciGirdisi.toInt()
        println(kullaniciInt / 2)

        //Koleksiyonlar

        //Array - Dizi
        println("-----Dizi-----")
        val stringOrnegi = "Burak"
        val benimDizim = arrayOf(stringOrnegi,"Güvendiren","Marcus","Aurelius","Stoa")

        //index
        println(benimDizim[0])
        println(benimDizim.get(1))
        println(benimDizim.get(2))
        benimDizim[2] = "Stoic"
        println(benimDizim.get(2))
        benimDizim.set(3, "Seneca")
        println(benimDizim[3])

        val numaraDizisi = doubleArrayOf(1.0,2.0,3.5)
        println(numaraDizisi.get(2))

        val karisikDizi = arrayOf("Burak",24,16.5,true,false)
        println(karisikDizi.get(3))

        //ArrayList - Listeler

        println("-----ArrayList-----")

        val isimListesi = arrayListOf<String>("Burak","Güvendiren","Marcus")

        println(isimListesi[0])
        println(isimListesi[1])

        isimListesi.add("Seneca")
        isimListesi.add("Aurelius")
        println(isimListesi.get(4))

        val karisikArrayList = arrayListOf<Any>()
        karisikArrayList.add("Burak")
        karisikArrayList.add("5")
        karisikArrayList.add("true")
        println(karisikArrayList)

        val intArrayList = ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(20)
        println(intArrayList.get(1))

        //Set

        println("-----Set-----")

        val ornekDizi = arrayOf(7,8,9,9,9,8,10)
        println("index 2: $(ornekDizi[2]")
        println("index 3: $(ornekDizi[3]")

        println(ornekDizi.size)

        val benimSet = setOf<Int>(7,8,9,9,9,8,10)
        println(benimSet.size)

        //For Each
        benimSet.forEach {
            println(it)
        }

        val digerSet = HashSet<String>()
        digerSet.add("Burak")
        digerSet.add("Burak")
        digerSet.add("Burak")
        digerSet.add("Güvendiren")

        digerSet.forEach {
            println(it)
        }

        //Map

        println("-----Map-----")

        //Anahtar Kelime - Değer ( Key - Value Pairing )

        val yemekDizisi = arrayOf("Elma","Et","Tavuk")
        val kaloriDizisi = arrayOf(100,300,200)
        println("${yemekDizisi[0]}'nın kalorisi: ${kaloriDizisi[0]}")

        val yemekKaloriMap = hashMapOf<String, Int>()
        yemekKaloriMap.put("Elma", 100)
        yemekKaloriMap.put("Et",300)
        yemekKaloriMap.put("Tavuk",200)
        println(yemekKaloriMap.get("Et"))

        val benimMapim = HashMap<String, String>( )
        benimMapim.put("Örnek", "Değer")

        val yeniMap = hashMapOf<String, Int>("Burak" to 40,"Örnek" to 50)
        println(yeniMap.get("Örnek"))

        //Math Transactions

        println("-----Math Transactions-----")

        var sayi = 8
        println(sayi)
        sayi = sayi + 1
        println(sayi)
        sayi++
        println(sayi)
        sayi--
        println(sayi)

        var digerSayi = 10
        println(digerSayi > sayi)

        // && -> VE
        // || -> VEYA

        println(digerSayi > sayi && 2 > 3)
        println(digerSayi > sayi || 2 > 3)

        //Remainder - Kalanı Bulmak
        println(10%2)

        //If Kontrolleri

        println("-----If Statements (If Kontrolleri)-----")

        val skor = 20
        if (skor < 10 ) {
            println("Oyunu Kaybettin!")
        } else if (skor >= 10 && skor < 20) {
            println("Skorun 10 ve 20 arasında, çok iyi skor aldın")
        } else if (skor >= 20 && skor < 30) {
            println("Skorun 20 ve 30 arasında, rekor kırıyorsun")
        } else {
            println("Skorun 30'un üstünde, efsane oynadın")
        }







    }


    }