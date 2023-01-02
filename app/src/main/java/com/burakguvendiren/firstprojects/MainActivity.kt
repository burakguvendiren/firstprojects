package com.burakguvendiren.firstprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println ("Hello  World")

        //değişkenler ve sabitler
        //Integer

        println ("-----Int-----")


        println (5 * 10)
        var a = 5
        var b = 10
        println (a * b)
        var old = 60
        println (old * 10 / 7)
        old = 60
        println (old * 5 / 8)

        val x = 5
        val y = 20

        println(x+y)


        // camelCase
        // snake_case

        val yasSonucu = old * x
        println(yasSonucu)

        //Tanımlama (Defining)
        val benimIntegerim : Int

        //Başlatma, Değerini Atama (Initializing, Inilitiazation)
        benimIntegerim = 5
        var yeniInteger : Int = 20
        println(benimIntegerim / 2)

        //Long
        println ("-----Int-----")

        var myLong : Long = 100
        myLong = 30000000
        println(myLong)

        //Double & Float
        println ("-----Double & Float-----")
        val pi = 3.14
        println(pi*2)

        val floatPi : Float = 3.14f
        println(floatPi * 2)
        val yeniDouble = 5.0
        println(yeniDouble / 2)


        //String - Metin
        println ("-----String - Metin-----")

        val benimString = "Benim Yeni Metnim"
        println(benimString.length)

        val isim = "Burak"
        val soyisim = "Güvendiren"
        val tamisim = isim + " " + soyisim
        println(tamisim)

        val yeniBirString : String
        yeniBirString = "10"

        val baskaBirString = "20"
        println(yeniBirString+baskaBirString)

        //boolean
        println ("-----Boolean-----")

        var benimBoolean = true
        benimBoolean = false

        // < -> küçüktür
        // > -> büyüktür
        // == -> eşittir
        // != -> eşit değildir
        // >= -> büyük eşittir
        // && -> ve
        // || -> veya

        println(3<5)
        println(4!=4)

        //Veri Tipi Dönüştürme
        println ("-----Dönüştürme-----")

        val benimInt = 10
        val benimLongaCevrilenInt = benimInt.toLong()
        println(benimLongaCevrilenInt)

        val kullaniciGirdisi = "50"
        val kullaniciInt = kullaniciGirdisi.toInt()
        println(kullaniciInt / 2)



    }
}