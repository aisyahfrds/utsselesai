package com.example.utsproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createdataupn()
        rv_list.layoutManager = LinearLayoutManager(this)
        rv_list.setHasFixedSize(true)
        rv_list.adapter = DataAdapter(data,{upnItem : upnlengkap -> upnItemClicked(upnItem) })

    }
    private fun upnItemClicked(upnItem : upnlengkap){
        val showDetailActivityIntent = Intent (this, DetailData::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, upnItem.foto)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, upnItem.name)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, upnItem.konten)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, upnItem.kontendetail)
        showDetailActivityIntent.putExtra(Intent.EXTRA_CC,upnItem.urllink)
        startActivity(showDetailActivityIntent)
    }
    private fun createdataupn() : List<upnlengkap>{
        val rvlist = ArrayList<upnlengkap>()
        rvlist.add(upnlengkap(R.drawable.feb2,
            "Fakultas Ekonomi dan Bisnis",
            "Fakultas Ekonomi dan Bisnis\n"+
                    "merupakan salah satu dari 7\n"+
                    "Fakultas 'Veteran' Jawa Timur.\n"+"Dimana semua program studi yang ada\n" +
                    "memiliki akredetasi A"+
                    " Yang terdiri dari program\n"+
                    "studi: ","http://febis.upnjatim.ac.id/",
            "1.     Ekonomi Pembangunan\n"+
                    "2.     Akuntansi\n"+"3.     Manajemen")
        )
        rvlist.add(upnlengkap(R.drawable.fp2,
            "Fakultas Pertanian",
            "Fakultas Pertanian \n" +
                    "UPN \"Veteran\" Jawa Timur \n" +
                    "berdiri sejak tahun 1968, \n" +
                    "Memiliki jurusan dengan akreditasi \"A\"\n" +
                    "Fakultas Pertanian selalu dan \n" +
                    "terus meningkatkan kinerja atau\n" +
                    "visi dan misi serta memprioritaskan\n" +
                    "pelayanan, administrasi, \n" +
                    "manajemen kelembagaan, \n" +
                    "serta peningkatan kualitas \n" +
                    "sarana dan prasarananya.\n"+" Yang terdiri dari program studi: ","http://faperta.upnjatim.ac.id/",
            "1.     Agroteknologi\n"+
                    "2.     Agribisnis")

        )
        rvlist.add(upnlengkap(R.drawable.ft,
            "Fakultas Teknik",
            "Fakultas Teknik\n"+
                    "merupakan salah satu dari 7\n"+
                    "Fakultas 'Veteran' Jawa\n"+
                    "Timur. Yang terdiri dari program\n"+
                    "studi: ","http://ft.upnjatim.ac.id/",
            "1.     Teknik Kimia\n"+
                    "2.     Teknik Industri\n"+
                    "3.     Teknik Sipil\n"+
                    "4.     Teknik Lingkungan\n"+
                    "5.     Teknologi Pangan")
        )
        rvlist.add(upnlengkap(R.drawable.fik,
            "Fakultas Ilmu Komputer",
            "Fakultas Ilmu Komputer\n"+
                    "merupakan salah satu dari 7\n"+
                    "Fakultas 'Veteran' Jawa\n"+
                    "Timur. Yang terdiri dari program\n"+
                    "studi: ","http://fik.upnjatim.ac.id/",
            "1.     Teknik Informatika\n"+
                    "2.     Sistem Informasi")
        )

        rvlist.add(upnlengkap(R.drawable.fh,
            "Fakultas Hukum",
            "Fakultas Hukum\n"+
                    "Komitmen menciptakan lulusan Fakultas Hukum\n" +
                    "yang berkualitas diwujudkan Rektor UPN “Veteran” \n" +
                    "Jatim dengan pembentukan Pusbankum \n" +
                    "(Pusat Studi Pengembangan dan Advokat Hukum) \n" +
                    "UPN Veteran Jatim. Pusbankum dalam implementasinya\n" +
                    "melibatkan peran serta aktif mahasiswa \n" +
                    "Fakultas Hukum dengan bimbingan dosen Fakultas Hukum.\n" +
                    "Disinilah peranan mahasiswa untuk melakukan \n" +
                    "pendampingan dan konsultasi hukum kepada \n" +
                    "masyarakat untuk mengasah dan mempertajam \n" +
                    "nilai kepakaran mahasiswa dalam \n" +
                    "pelaksanaan Tri Dharma Perguruan Tinggi \n"+" Yang terdiri dari program studi: ","http://fhukum.upnjatim.ac.id/",
            "1.     Ilmu Hukum")

        )
        rvlist.add(upnlengkap(R.drawable.fad,
            "Fakultas Arsitektur dan Desain",
            "Fakultas Arsitektur dan Desain\n"+
                    "sebagai fakultas baru \n" +
                    "di jajaran UPN “Veteran” Jawa Timur \n" +
                    "mempunyai tugas dan wewenang \n" +
                    "untuk melestarikan, mengembangkan, \n" +
                    "menyebarluaskan, dan menggali ilmu pengetahuan, \n" +
                    "teknologi, dan seni, serta berfungsi \n" +
                    "mengembangkan kualitas sumberdaya manusia, \n" +
                    "baik di kalangan tenaga pendidik, \n" +
                    "tenaga kependidikan dan mahasiswa.\n"+" Yang terdiri dari program studi: ","http://fad.upnjatim.ac.id/",
            "1.     Arsitektur\n"+
                    "2.     Desain Komunikasi Visual")

        )
        rvlist.add(upnlengkap(R.drawable.fisip2,
            "Fakultas Ilmu Sosial dan Politik",
            "Keberadaan Fakultas Ilmu Sosial \n" +
                    "dan Ilmu Politik diawali dengan berdirinya \n" +
                    "Fakultas Ilmu Administrasi Negara \n" +
                    "dan Administrasi Niaga.\n" +
                    "Satu tahun kemudian Fakultas \n" +
                    "Ilmu Administrasi membuka \n" +
                    "satu jurusan baru yaitu jurusan \n" +
                    "Ilmu Komunikasi pada tahun ajaran 1994/1995. \n" +
                    "Dalam perkembangan Pergantian nama Fakultas\n" +
                    " Ilmu Administrasi UPN”Veteran” Jawa Timur \n" +
                    "menjadi Fakultas Ilmu Sosial dan Ilmu Politik.\n"+" Yang terdiri dari program studi: ","http://fisip.upnjatim.ac.id/",
            "1.     Administrasi Bisnis\n"+
                    "2.     Administrasi Negara\n"+
                    "3.     Ilmu Komunikasi\n"+
                    "4.     Hubungan International")
        )
        rvlist.add(upnlengkap(R.drawable.fotoq,
            "Data Diri",
            "NAMA       \n" +
                    "Aisyah Firdausi Rahma\n" +
                    "TTL     \n" +
                    "Surabaya, 11 Juni 1998\n" +
                    "ALAMAT     \n" +
                    "Gubeng Kertajaya VIIG/10, Surabaya\n" +
                    "EMAIL  \n" +
                    "aisyahfirdausi73gmail.com\n" +
                    "PENDIDIKAN \n" +
                    "SD Al-Muslim     \n" +
                    "SMP Al-Muslim   \n" +
                    "SMAMDA Surabaya    \n" +
                    "Fakultas Ilmu Komputer UPN V Jatim\n","https://github.com/aisyahfrds",
            "")
        )

        return rvlist



    }
}
