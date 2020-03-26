package com.example.utsproject

import android.content.Intent
import android.graphics.Paint.UNDERLINE_TEXT_FLAG
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.daftar_detail.*

class DetailData : AppCompatActivity() {
    val listlink = ArrayList<UrlJurusan>()
    val listdatalink = arrayOf(
        "http://tekindustri.upnjatim.ac.id/",
        "http://tekkimia.upnjatim.ac.id/",
        "http://teksipil.upnjatim.ac.id/",
        "http://tekpangan.upnjatim.ac.id/",
        "http://teklingk.upnjatim.ac.id/",
        "http://akuntansi.upnjatim.ac.id/",
        "http://manajemen.upnjatim.ac.id/",
        "http://ekbang.upnjatim.ac.id/",
        "https://adbis.upnjatim.ac.id/",
        "http://adneg.upnjatim.ac.id/",
        "https://github.com/annisawibowo",
        "http://ilkom.upnjatim.ac.id/",
        "http://hubint.upnjatim.ac.id/",
        "http://arsitektur.upnjatim.ac.id/",
        "http://dkv.upnjatim.ac.id/",
        "http://agrotek.upnjatim.ac.id/",
        "https://agribis.upnjatim.ac.id/",
        "https://if.upnjatim.ac.id/",
        "http://sisfo.upnjatim.ac.id/"

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.daftar_detail)


        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)){

            var gambarfk = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT,0)
            var namafk = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var deskfk = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var deskkk = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)
            var link = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_CC)

            gambarfakdel.setImageResource(gambarfk)
            nama_f.text = namafk
            deskrip_f.text = deskfk
            deksdel.text = deskkk


            if (namafk=="Fakultas Ilmu Komputer") {

                setTitle(namafk)
                nama_f.setPaintFlags(UNDERLINE_TEXT_FLAG)
                nama_f.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }

                imageButton3.visibility = View.GONE
                imageButton4.visibility = View.GONE
                imageButton5.visibility = View.GONE

                imageButton.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[17])
                    startActivity(showDetailActivityIntent)


                }
                imageButton2.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[18])
                    startActivity(showDetailActivityIntent)

                }
            }
            if(namafk=="Fakultas Teknik"){
                setTitle(namafk)
                nama_f.setPaintFlags(UNDERLINE_TEXT_FLAG)
                nama_f.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }


                imageButton.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[1])
                    startActivity(showDetailActivityIntent)


                }
                imageButton2.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[0])
                    startActivity(showDetailActivityIntent)

                }
                imageButton3.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[2])
                    startActivity(showDetailActivityIntent)
                }
                imageButton4.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[4])
                    startActivity(showDetailActivityIntent)
                }
                imageButton5.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[3])
                    startActivity(showDetailActivityIntent)
                }


            }
            if (namafk=="Fakultas Ekonomi dan Bisnis"){
                setTitle(namafk)
                nama_f.setPaintFlags(UNDERLINE_TEXT_FLAG)
                nama_f.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }


                imageButton4.visibility = View.GONE
                imageButton5.visibility = View.GONE

                imageButton.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[7])
                    startActivity(showDetailActivityIntent)



                }
                imageButton2.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[5])
                    startActivity(showDetailActivityIntent)

                }
                imageButton3.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[6])
                    startActivity(showDetailActivityIntent)
                }

            }
            if (namafk=="Fakultas Pertanian"){
                setTitle(namafk)
                nama_f.setPaintFlags(UNDERLINE_TEXT_FLAG)
                nama_f.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }
                imageButton3.visibility = View.GONE
                imageButton4.visibility = View.GONE
                imageButton5.visibility = View.GONE
                imageButton.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[15])
                    startActivity(showDetailActivityIntent)


                }
                imageButton2.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[16])
                    startActivity(showDetailActivityIntent)

                }


            }
            if (namafk=="Fakultas Hukum"){
                setTitle(namafk)
                nama_f.setPaintFlags(UNDERLINE_TEXT_FLAG)
                nama_f.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }
                imageButton.visibility = View.GONE
                imageButton3.visibility = View.GONE
                imageButton4.visibility = View.GONE
                imageButton5.visibility = View.GONE
                imageButton2.visibility = View.GONE



            }
            if(namafk=="Fakultas Ilmu Sosial dan Politik"){
                setTitle(namafk)
                nama_f.setPaintFlags(UNDERLINE_TEXT_FLAG)
                nama_f.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }

                imageButton.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[8])
                    startActivity(showDetailActivityIntent)

                }
                imageButton2.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[9])
                    startActivity(showDetailActivityIntent)

                }
                imageButton3.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[11])
                    startActivity(showDetailActivityIntent)
                }
                imageButton4.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[12])
                    startActivity(showDetailActivityIntent)
                }
                imageButton5.visibility = View.GONE


            }
            if (namafk=="Fakultas Arsitektur dan Desain") {
                setTitle(namafk)
                nama_f.setPaintFlags(UNDERLINE_TEXT_FLAG)

                nama_f.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }

                imageButton3.visibility = View.GONE
                imageButton4.visibility = View.GONE
                imageButton5.visibility = View.GONE

                imageButton.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[13])
                    startActivity(showDetailActivityIntent)

                }
                imageButton2.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[14])
                    startActivity(showDetailActivityIntent)

                }
            }
            if (namafk=="faknama") {
                setTitle(namafk)

                imageButton3.visibility = View.GONE
                imageButton4.visibility = View.GONE
                imageButton5.visibility = View.GONE
                imageButton.visibility = View.GONE
                imageButton2.visibility = View.GONE
                deksdel.text = link
                deksdel.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Webviewbro::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)

                }
            }
        }
    }
}