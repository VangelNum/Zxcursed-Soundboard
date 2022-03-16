package com.zxcursedsoundboard.apk

import android.app.DownloadManager
import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import android.media.SoundPool
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView


class MainActivity : AppCompatActivity() {
    lateinit var mAdView: AdView
    private var soundId2 = 1
    private var soundId3 = 1
    private var soundId4 = 1
    private var soundId5 = 1
    private lateinit var Media6: MediaPlayer
    private var soundId7 = 1
    private var soundId8 = 1
    private var soundId9 = 1
    private var soundId10 = 1
    private lateinit var Media11: MediaPlayer
    private var soundId12 = 1
    private var soundId13 = 1
    private lateinit var Media14: MediaPlayer
    private var soundId15 = 1
    private var soundId16 = 1
    private var soundId17 = 1
    private var soundId18 = 1
    private lateinit var Media19: MediaPlayer
    private lateinit var Media20: MediaPlayer
    private var soundId21 = 1
    private var soundId22 = 1
    private var soundId23 = 1
    private var soundId24 = 1
    private lateinit var Media25: MediaPlayer
    private lateinit var Media26: MediaPlayer
    private lateinit var Media27: MediaPlayer
    private lateinit var Media28: MediaPlayer
    private var soundId29 = 1
    private var soundId30 = 1
    private var soundId31 = 1
    private var soundId32 = 1
    private var soundId33 = 1
    private var soundId34 = 1
    private var soundId35 = 1
    private var soundId36 = 1
    private var soundId37 = 1
    private lateinit var Media38: MediaPlayer
    private var soundId39 = 1
    private var soundId40 = 1
    private var soundId41 = 1
    private var soundId42 = 1
    private lateinit var Media43: MediaPlayer
    private var soundId44 = 1
    private var soundId45 = 1
    private var soundId46 = 1
    private var soundId47 = 1
    private var soundId48 = 1
    private var soundId49 = 1
    private var soundId50 = 1
    private var soundId51 = 1
    private var soundId52 = 1
    private var soundId53 = 1
    private var soundId54 = 1
    private var soundId55 = 1
    private var soundId56 = 1
    private var soundId57 = 1
    private lateinit var Media58: MediaPlayer
    private lateinit var Media59: MediaPlayer
    private lateinit var Media60: MediaPlayer
    private lateinit var Media61: MediaPlayer
    private lateinit var Media62: MediaPlayer
    private lateinit var Media63: MediaPlayer
    private lateinit var Media64: MediaPlayer
    private lateinit var Media65: MediaPlayer
    private lateinit var Media66: MediaPlayer
    private lateinit var Media67: MediaPlayer
    private lateinit var Media68: MediaPlayer
    private lateinit var Media69: MediaPlayer

    private var url: String = ""

    private var mInterstitialAd: InterstitialAd? = null

    private var counterAd: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val b2 = findViewById<Button>(R.id.button2)  // кнопки
        val b3 = findViewById<Button>(R.id.button3)
        val b4 = findViewById<Button>(R.id.button4)
        val b5 = findViewById<Button>(R.id.button5)
        val b6 = findViewById<Button>(R.id.button6)
        val b7 = findViewById<Button>(R.id.button7)
        val b8 = findViewById<Button>(R.id.button8)
        val b9 = findViewById<Button>(R.id.button9)
        val b10 = findViewById<Button>(R.id.button10)
        val b11 = findViewById<Button>(R.id.button11)
        val b12 = findViewById<Button>(R.id.button12)
        val b13 = findViewById<Button>(R.id.button13)
        val b14 = findViewById<Button>(R.id.button14)
        val b15 = findViewById<Button>(R.id.button15)
        val b16 = findViewById<Button>(R.id.button16)
        val b17 = findViewById<Button>(R.id.button17)
        val b18 = findViewById<Button>(R.id.button18)
        val b19 = findViewById<Button>(R.id.button19)
        val b20 = findViewById<Button>(R.id.button20)
        val b21 = findViewById<Button>(R.id.button21)
        val b22 = findViewById<Button>(R.id.button22)
        val b23 = findViewById<Button>(R.id.button23)
        val b24 = findViewById<Button>(R.id.button24)
        val b25 = findViewById<Button>(R.id.button25)
        val b26 = findViewById<Button>(R.id.button26)
        val b27 = findViewById<Button>(R.id.button27)
        val b28 = findViewById<Button>(R.id.button28)
        val b29 = findViewById<Button>(R.id.button29)
        val b30 = findViewById<Button>(R.id.button30)
        val b31 = findViewById<Button>(R.id.button31)
        val b32 = findViewById<Button>(R.id.button32)
        val b33 = findViewById<Button>(R.id.button33)
        val b34 = findViewById<Button>(R.id.button34)
        val b35 = findViewById<Button>(R.id.button35)
        val b36 = findViewById<Button>(R.id.button36)
        val b37 = findViewById<Button>(R.id.button37)
        val b38 = findViewById<Button>(R.id.button38)
        val b39 = findViewById<Button>(R.id.button39)
        val b40 = findViewById<Button>(R.id.button40)
        val b41 = findViewById<Button>(R.id.button41)
        val b42 = findViewById<Button>(R.id.button42)
        val b43 = findViewById<Button>(R.id.button43)
        val b44 = findViewById<Button>(R.id.button44)
        val b45 = findViewById<Button>(R.id.button45)
        val b46 = findViewById<Button>(R.id.button46)
        val b47 = findViewById<Button>(R.id.button47)
        val b48 = findViewById<Button>(R.id.button48)
        val b49 = findViewById<Button>(R.id.button49)
        val b50 = findViewById<Button>(R.id.button50)
        val b51 = findViewById<Button>(R.id.button51)
        val b52 = findViewById<Button>(R.id.button52)
        val b53 = findViewById<Button>(R.id.button53)
        val b54 = findViewById<Button>(R.id.button54)
        val b55 = findViewById<Button>(R.id.button55)
        val b56 = findViewById<Button>(R.id.button56)
        val b57 = findViewById<Button>(R.id.button57)
        val b58 = findViewById<Button>(R.id.button58)
        val b59 = findViewById<Button>(R.id.button59)
        val b60 = findViewById<Button>(R.id.button60)
        val b61 = findViewById<Button>(R.id.button61)
        val b62 = findViewById<Button>(R.id.button62)
        val b63 = findViewById<Button>(R.id.button63)
        val b64 = findViewById<Button>(R.id.button64)
        val b65 = findViewById<Button>(R.id.button65)
        val b66 = findViewById<Button>(R.id.button66)
        val b67 = findViewById<Button>(R.id.button67)
        val b68 = findViewById<Button>(R.id.button68)
        val b69 = findViewById<Button>(R.id.button69)

        val tex: TextView = findViewById(R.id.textView3)  //СТРОКИ
        val tex2: TextView = findViewById(R.id.textView4)
        val text: TextView = findViewById(R.id.textView2)
        val text5: TextView = findViewById(R.id.textView5)
        val text6: TextView = findViewById(R.id.textView6)
        val cl: ConstraintLayout = findViewById(R.id.layout_root)

        val Image3 = findViewById<ImageView>(R.id.imageView3)  // флай
        val Image = findViewById<ImageView>(R.id.imageView)   // курсед
        val Image4 = findViewById<ImageView>(R.id.imageView4) //улиточка
        val Image5 = findViewById<ImageView>(R.id.imageView5) // ангел
        val Image233 = findViewById<ImageView>(R.id.imageView6)   //кнопочка меню
        val imagecontact = findViewById<ImageView>(R.id.imageViewcontact)

        fun clear() {
            b2.visibility = View.GONE
            b3.visibility = View.GONE
            b4.visibility = View.GONE
            b5.visibility = View.GONE
            b6.visibility = View.GONE
            b7.visibility = View.GONE
            b8.visibility = View.GONE
            b9.visibility = View.GONE
            b10.visibility = View.GONE
            b11.visibility = View.GONE
            b12.visibility = View.GONE
            b13.visibility = View.GONE
            b14.visibility = View.GONE
            b15.visibility = View.GONE
            b16.visibility = View.GONE
            b17.visibility = View.GONE
            b18.visibility = View.GONE
            b19.visibility = View.GONE
            b20.visibility = View.GONE
            b21.visibility = View.GONE
            b22.visibility = View.GONE
            b23.visibility = View.GONE
            b24.visibility = View.GONE
            b25.visibility = View.GONE
            b26.visibility = View.GONE
            b27.visibility = View.GONE
            b28.visibility = View.GONE
            b29.visibility = View.GONE
            b30.visibility = View.GONE
            b31.visibility = View.GONE
            b32.visibility = View.GONE
            b33.visibility = View.GONE
            b34.visibility = View.GONE
            b35.visibility = View.GONE
            b36.visibility = View.GONE
            b37.visibility = View.GONE
            b38.visibility = View.GONE
            b39.visibility = View.GONE
            b40.visibility = View.GONE
            b41.visibility = View.GONE
            b42.visibility = View.GONE
            b43.visibility = View.GONE
            b44.visibility = View.GONE
            b45.visibility = View.GONE
            b46.visibility = View.GONE
            b47.visibility = View.GONE
            b48.visibility = View.GONE
            b49.visibility = View.GONE
            b50.visibility = View.GONE
            b51.visibility = View.GONE
            b52.visibility = View.GONE
            b53.visibility = View.GONE
            b54.visibility = View.GONE
            b55.visibility = View.GONE
            b56.visibility = View.GONE
            b57.visibility = View.GONE
            b58.visibility = View.GONE
        }

        fun divier ()
        {
            val div = findViewById<View>(R.id.divider).setVisibility(View.GONE)
            val div2 = findViewById<View>(R.id.divider2).setVisibility(View.GONE)
            val div3 = findViewById<View>(R.id.divider3).setVisibility(View.GONE)
            val div4 = findViewById<View>(R.id.divider4).setVisibility(View.GONE)
        }

        val simpleVideoView = findViewById<VideoView>(R.id.videoView)
        simpleVideoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.video2))
        simpleVideoView.requestFocus()
        simpleVideoView.start()
        simpleVideoView.setOnCompletionListener {
            simpleVideoView.visibility = View.GONE
            b2.visibility = View.VISIBLE
            b3.visibility = View.VISIBLE
            b4.visibility = View.VISIBLE
            b5.visibility = View.VISIBLE
            b6.visibility = View.VISIBLE
            b7.visibility = View.VISIBLE
            b8.visibility = View.VISIBLE
            b9.visibility = View.VISIBLE
            b10.visibility = View.VISIBLE
            b11.visibility = View.VISIBLE
            b14.visibility = View.VISIBLE
            b15.visibility = View.VISIBLE
            b16.visibility = View.VISIBLE
            b24.visibility = View.VISIBLE
            b35.visibility = View.VISIBLE
            b36.visibility = View.VISIBLE
            b37.visibility = View.VISIBLE
            b38.visibility = View.VISIBLE
            b39.visibility = View.VISIBLE
            b40.visibility = View.VISIBLE
            b41.visibility = View.VISIBLE
            b42.visibility = View.VISIBLE
            Image.visibility = View.VISIBLE
            Image3.visibility = View.VISIBLE
            Image4.visibility = View.VISIBLE
            Image5.visibility = View.VISIBLE
            Image233.visibility = View.VISIBLE
            cl.setBackgroundResource(R.drawable.photo11)

            val Card = findViewById<CardView>(R.id.card228)
            Card.visibility = View.VISIBLE
            val Card2 = findViewById<CardView>(R.id.card2)
            Card2.visibility = View.VISIBLE
            val Stop2 = findViewById<ImageView>(R.id.imageView2)
            Stop2.visibility = View.VISIBLE

            mAdView = findViewById(R.id.adView228)
            val adRequest = AdRequest.Builder().build()
            mAdView.loadAd(adRequest)
        }

        loadInterAd()


        soundId2 = mSoundPool.load(this, R.raw.cursed2, 1)
        soundId3 = mSoundPool.load(this, R.raw.cursed3, 1)
        soundId4 = mSoundPool.load(this, R.raw.cursed4, 1)
        soundId5 = mSoundPool.load(this, R.raw.cursed5, 1)
        Media6 = MediaPlayer.create(this, R.raw.cursed6)
        soundId7 = mSoundPool.load(this, R.raw.cursed7, 1)
        soundId8 = mSoundPool.load(this, R.raw.cursed8, 1)
        soundId9 = mSoundPool.load(this, R.raw.cursed9, 1)
        soundId10 = mSoundPool.load(this, R.raw.cursed10, 1)
        Media11 = MediaPlayer.create(this, R.raw.cursed11)
        soundId12 = mSoundPool.load(this, R.raw.cursed12, 1)
        soundId13 = mSoundPool.load(this, R.raw.cursed13, 1)
        Media14 = MediaPlayer.create(this, R.raw.cursed14)
        soundId15 = mSoundPool.load(this, R.raw.cursed15, 1)
        soundId16 = mSoundPool.load(this, R.raw.cursed16, 1)
        soundId17 = mSoundPool.load(this, R.raw.cursed17, 1)
        soundId18 = mSoundPool.load(this, R.raw.cursed18, 1)
        Media19 = MediaPlayer.create(this, R.raw.cursed19)
        Media20 = MediaPlayer.create(this, R.raw.cursed20)
        soundId21 = mSoundPool.load(this, R.raw.cursed21, 1)
        soundId22 = mSoundPool.load(this, R.raw.cursed22, 1)
        soundId23 = mSoundPool.load(this, R.raw.cursed23, 1)
        soundId24 = mSoundPool.load(this, R.raw.cursed24, 1)
        Media25 = MediaPlayer.create(this, R.raw.cursed25)
        Media26 = MediaPlayer.create(this, R.raw.cursed26)
        Media27 = MediaPlayer.create(this, R.raw.cursed27)
        Media28 = MediaPlayer.create(this, R.raw.cursed28)
        soundId29 = mSoundPool.load(this, R.raw.cursed29, 1)
        soundId30 = mSoundPool.load(this, R.raw.cursed30, 1)
        soundId31 = mSoundPool.load(this, R.raw.cursed31, 1)
        soundId32 = mSoundPool.load(this, R.raw.cursed32, 1)
        soundId33 = mSoundPool.load(this, R.raw.cursed33, 1)
        soundId34 = mSoundPool.load(this, R.raw.cursed34, 1)
        soundId35 = mSoundPool.load(this, R.raw.cursed35, 1)
        soundId36 = mSoundPool.load(this, R.raw.cursed36, 1)
        soundId37 = mSoundPool.load(this, R.raw.cursed37, 1)
        Media38 = MediaPlayer.create(this, R.raw.cursed38)
        soundId39 = mSoundPool.load(this, R.raw.cursed39, 1)
        soundId40 = mSoundPool.load(this, R.raw.cursed40, 1)
        soundId41 = mSoundPool.load(this, R.raw.cursed41, 1)
        soundId42 = mSoundPool.load(this, R.raw.cursed42, 1)
        Media43 = MediaPlayer.create(this, R.raw.cursed43)
        soundId44 = mSoundPool.load(this, R.raw.cursed44, 1)
        soundId45 = mSoundPool.load(this, R.raw.cursed45, 1)
        soundId46 = mSoundPool.load(this, R.raw.cursed46, 1)
        soundId47 = mSoundPool.load(this, R.raw.cursed47, 1)
        soundId48 = mSoundPool.load(this, R.raw.cursed48, 1)
        soundId49 = mSoundPool.load(this, R.raw.cursed49, 1)
        soundId50 = mSoundPool.load(this, R.raw.cursed50, 1)
        soundId51 = mSoundPool.load(this, R.raw.cursed51, 1)
        soundId52 = mSoundPool.load(this, R.raw.cursed52, 1)
        soundId53 = mSoundPool.load(this, R.raw.cursed53, 1)
        soundId54 = mSoundPool.load(this, R.raw.cursed54, 1)
        soundId55 = mSoundPool.load(this, R.raw.cursed55, 1)
        soundId56 = mSoundPool.load(this, R.raw.cursed56, 1)
        soundId57 = mSoundPool.load(this, R.raw.cursed57, 1)
        Media58 = MediaPlayer.create(this, R.raw.cursed58)
        Media59 = MediaPlayer.create(this, R.raw.cursed59)
        Media60 = MediaPlayer.create(this, R.raw.cursed60)
        Media61 = MediaPlayer.create(this, R.raw.cursed61)
        Media62 = MediaPlayer.create(this, R.raw.cursed62)
        Media63 = MediaPlayer.create(this, R.raw.cursed63)
        Media64 = MediaPlayer.create(this, R.raw.cursed64)
        Media65 = MediaPlayer.create(this, R.raw.cursed65)
        Media66 = MediaPlayer.create(this, R.raw.cursed66)
        Media67 = MediaPlayer.create(this, R.raw.cursed67)
        Media68 = MediaPlayer.create(this, R.raw.cursed68)
        Media69 = MediaPlayer.create(this, R.raw.cursed69)


        fun clear2() {   //после контактов
            tex2.visibility = View.GONE
            tex.visibility = View.GONE
            text.visibility = View.GONE
            imagecontact.visibility = View.GONE
            text5.visibility = View.GONE
            text6.visibility = View.GONE
        }


        Image3.setOnClickListener {  // флай
            clear2()
            Ad1()
            divier()
            b2.visibility = View.GONE
            b3.visibility = View.GONE
            b4.visibility = View.GONE
            b5.visibility = View.GONE
            b6.visibility = View.GONE
            b7.visibility = View.GONE
            b8.visibility = View.GONE
            b9.visibility = View.GONE
            b10.visibility = View.GONE
            b11.visibility = View.GONE
            b12.visibility = View.GONE
            b13.visibility = View.GONE
            b14.visibility = View.GONE
            b15.visibility = View.GONE
            b16.visibility = View.GONE
            b24.visibility = View.GONE
            b35.visibility = View.GONE
            b36.visibility = View.GONE
            b37.visibility = View.GONE
            b38.visibility = View.GONE
            b39.visibility = View.GONE
            b40.visibility = View.GONE
            b41.visibility = View.GONE
            b42.visibility = View.GONE
            b43.visibility = View.GONE
            b44.visibility = View.GONE
            b45.visibility = View.GONE
            b46.visibility = View.GONE
            b47.visibility = View.GONE
            b48.visibility = View.GONE
            b49.visibility = View.GONE
            b50.visibility = View.GONE
            b51.visibility = View.GONE
            b52.visibility = View.GONE
            b53.visibility = View.GONE
            b54.visibility = View.GONE
            b55.visibility = View.GONE
            b56.visibility = View.GONE
            b57.visibility = View.GONE
            b58.visibility = View.GONE
            b59.visibility = View.GONE
            b60.visibility = View.GONE
            b61.visibility = View.GONE
            b62.visibility = View.GONE
            b63.visibility = View.GONE
            b64.visibility = View.GONE
            b65.visibility = View.GONE
            b66.visibility = View.GONE
            b67.visibility = View.GONE
            b68.visibility = View.GONE
            b69.visibility = View.GONE
            b17.visibility = View.VISIBLE
            b18.visibility = View.VISIBLE
            b19.visibility = View.VISIBLE
            b20.visibility = View.VISIBLE
            b21.visibility = View.VISIBLE
            b22.visibility = View.VISIBLE
            b23.visibility = View.VISIBLE
            b25.visibility = View.VISIBLE
            b26.visibility = View.VISIBLE
            b27.visibility = View.VISIBLE
            b28.visibility = View.VISIBLE
            b29.visibility = View.VISIBLE
            b30.visibility = View.VISIBLE
            b31.visibility = View.VISIBLE
            b32.visibility = View.VISIBLE
            b33.visibility = View.VISIBLE
            b34.visibility = View.VISIBLE
            var div3 = findViewById<View>(R.id.divider3).setVisibility(View.VISIBLE)
            cl.setBackgroundResource(R.drawable.photo4)
        }
        b2.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b2)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 ->
                        download(2)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b2.setOnClickListener {
            mSoundPool.play(soundId2, 1F, 1F, 1, 0, 1F)
        }

        b3.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b3)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 ->
                        download(3)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b3.setOnClickListener {
            mSoundPool.play(soundId3, 1F, 1F, 1, 0, 1F)
        }

        b4.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b4)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(4)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b4.setOnClickListener {
            mSoundPool.play(soundId4, 1F, 1F, 1, 0, 1F)
        }

        b5.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b5)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(5)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b5.setOnClickListener {
            mSoundPool.play(soundId5, 1F, 1F, 1, 0, 1F)
        }

        b6.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b6)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(6)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b6.setOnClickListener {
            Media6.start()
        }

        b7.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b7)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(7)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b7.setOnClickListener {
            mSoundPool.play(soundId7, 1F, 1F, 1, 0, 1F)
        }

        b8.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b8)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(8)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b8.setOnClickListener {
            mSoundPool.play(soundId8, 1F, 1F, 1, 0, 1F)
        }

        b9.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b9)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(9)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b9.setOnClickListener {
            mSoundPool.play(soundId9, 1F, 1F, 1, 0, 1F)
        }

        b10.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b10)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(10)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b10.setOnClickListener {
            mSoundPool.play(soundId10, 1F, 1F, 1, 0, 1F)
        }

        b11.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b11)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(11)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b11.setOnClickListener {
            Media11.start()
        }

        b12.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b12)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(12)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b12.setOnClickListener {
            mSoundPool.play(soundId12, 1F, 1F, 1, 0, 1F)
        }

        b13.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b13)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(13)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b13.setOnClickListener {
            mSoundPool.play(soundId13, 1F, 1F, 1, 0, 1F)
        }

        b14.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b14)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(14)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b14.setOnClickListener {
            Media14.start()
        }

        b15.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b15)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(15)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b15.setOnClickListener {
            mSoundPool.play(soundId15, 1F, 1F, 1, 0, 1F)
        }

        b16.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b16)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(16)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b16.setOnClickListener {
            mSoundPool.play(soundId16, 1F, 1F, 1, 0, 1F)
        }

        b17.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b17)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(17)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b17.setOnClickListener {
            mSoundPool.play(soundId17, 1F, 1F, 1, 0, 1F)
        }

        b18.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b18)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(18)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b18.setOnClickListener {
            mSoundPool.play(soundId18, 1F, 1F, 1, 0, 1F)
        }

        b19.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b19)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(19)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b19.setOnClickListener {
            Media19.start()
        }

        b20.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b20)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(20)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b20.setOnClickListener {
            Media20.start()
        }

        b21.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b21)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(21)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b21.setOnClickListener {
            mSoundPool.play(soundId21, 1F, 1F, 1, 0, 1F)
        }

        b22.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b22)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(22)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b22.setOnClickListener {
            mSoundPool.play(soundId22, 1F, 1F, 1, 0, 1F)
        }

        b23.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b23)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(23)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b23.setOnClickListener {
            mSoundPool.play(soundId23, 1F, 1F, 1, 0, 1F)
        }

        b24.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b24)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(24)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b24.setOnClickListener {
            mSoundPool.play(soundId24, 1F, 1F, 1, 0, 1F)
        }

        b25.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b25)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(25)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b25.setOnClickListener {
            Media25.start()
        }

        b26.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b26)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(26)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b26.setOnClickListener {
            Media26.start()
        }

        b27.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b27)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(27)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b27.setOnClickListener {
            Media27.start()
        }

        b28.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b28)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(28)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b28.setOnClickListener {
            Media28.start()
        }

        b29.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b29)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(29)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b29.setOnClickListener {
            mSoundPool.play(soundId29, 1F, 1F, 1, 0, 1F)
        }

        b30.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b30)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(30)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b30.setOnClickListener {
            mSoundPool.play(soundId30, 1F, 1F, 1, 0, 1F)
        }

        b31.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b31)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(31)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b31.setOnClickListener {
            mSoundPool.play(soundId31, 1F, 1F, 1, 0, 1F)
        }

        b32.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b32)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(32)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b32.setOnClickListener {
            mSoundPool.play(soundId32, 1F, 1F, 1, 0, 1F)
        }

        b33.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b33)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(33)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b33.setOnClickListener {
            mSoundPool.play(soundId33, 1F, 1F, 1, 0, 1F)
        }

        b34.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b34)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(34)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b34.setOnClickListener {
            mSoundPool.play(soundId34, 1F, 1F, 1, 0, 1F)
        }

        b35.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b35)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(35)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b35.setOnClickListener {
            mSoundPool.play(soundId35, 1F, 1F, 1, 0, 1F)
        }

        b36.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b36)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(36)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b36.setOnClickListener {
            mSoundPool.play(soundId36, 1F, 1F, 1, 0, 1F)
        }

        b37.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b37)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(37)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b37.setOnClickListener {
            mSoundPool.play(soundId37, 1F, 1F, 1, 0, 1F)
        }

        b38.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b38)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(38)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b38.setOnClickListener {
            Media38.start()
        }

        b39.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b39)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(39)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b39.setOnClickListener {
            mSoundPool.play(soundId39, 1F, 1F, 1, 0, 1F)
        }

        b40.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b40)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(40)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b40.setOnClickListener {
            mSoundPool.play(soundId40, 1F, 1F, 1, 0, 1F)
        }

        b41.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b41)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(41)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b41.setOnClickListener {
            mSoundPool.play(soundId41, 1F, 1F, 1, 0, 1F)
        }

        b42.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b42)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(42)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b42.setOnClickListener {
            mSoundPool.play(soundId42, 1F, 1F, 1, 0, 1F)
        }

        b43.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b43)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(43)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b43.setOnClickListener {
            Media43.start()
        }

        b44.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b44)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(44)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b44.setOnClickListener {
            mSoundPool.play(soundId44, 1F, 1F, 1, 0, 1F)
        }

        b45.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b45)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(45)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b45.setOnClickListener {
            mSoundPool.play(soundId45, 1F, 1F, 1, 0, 1F)
        }

        b46.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b46)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(46)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b46.setOnClickListener {
            mSoundPool.play(soundId46, 1F, 1F, 1, 0, 1F)
        }

        b47.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b47)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(47)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b47.setOnClickListener {
            mSoundPool.play(soundId47, 1F, 1F, 1, 0, 1F)
        }

        b48.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b48)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(48)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b48.setOnClickListener {
            mSoundPool.play(soundId48, 1F, 1F, 1, 0, 1F)
        }

        b49.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b49)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(49)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b49.setOnClickListener {
            mSoundPool.play(soundId49, 1F, 1F, 1, 0, 1F)
        }

        b50.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b50)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(50)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b50.setOnClickListener {
            mSoundPool.play(soundId50, 1F, 1F, 1, 0, 1F)
        }

        b51.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b51)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(51)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b51.setOnClickListener {
            mSoundPool.play(soundId51, 1F, 1F, 1, 0, 1F)
        }

        b52.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b52)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(52)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b52.setOnClickListener {
            mSoundPool.play(soundId52, 1F, 1F, 1, 0, 1F)
        }

        b53.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b53)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(53)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b53.setOnClickListener {
            mSoundPool.play(soundId53, 1F, 1F, 1, 0, 1F)
        }

        b54.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b54)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(54)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b54.setOnClickListener {
            mSoundPool.play(soundId54, 1F, 1F, 1, 0, 1F)
        }

        b55.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b55)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(55)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b55.setOnClickListener {
            mSoundPool.play(soundId55, 1F, 1F, 1, 0, 1F)
        }

        b56.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b56)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(56)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b56.setOnClickListener {
            mSoundPool.play(soundId56, 1F, 1F, 1, 0, 1F)
        }

        b57.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b57)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(57)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b57.setOnClickListener {
            mSoundPool.play(soundId57, 1F, 1F, 1, 0, 1F)
        }

        b58.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b58)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(58)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b58.setOnClickListener {
            Media58.start()
        }

        b59.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b59)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(59)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b59.setOnClickListener {
            Media59.start()
        }

        b60.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b60)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(60)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b60.setOnClickListener {
            Media60.start()
        }

        b61.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b61)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(61)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b61.setOnClickListener {
            Media61.start()
        }

        b62.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b62)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(62)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b62.setOnClickListener {
            Media62.start()
        }

        b63.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b63)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(63)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b63.setOnClickListener {
            Media63.start()
        }

        b64.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b64)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(64)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b64.setOnClickListener {
            Media64.start()
        }

        b65.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b65)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(65)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b65.setOnClickListener {
            Media65.start()
        }

        b66.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b66)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(66)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b66.setOnClickListener {
            Media66.start()
        }

        b67.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b67)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(67)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b67.setOnClickListener {
            Media67.start()
        }

        b68.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b68)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(68)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b68.setOnClickListener {
            Media68.start()
        }
        b69.setOnLongClickListener {
            val popupMenu = PopupMenu(this, b69)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> download(69)
                }
                true
            }
            popupMenu.show()
            return@setOnLongClickListener true
        }
        b69.setOnClickListener {
            Media69.start()
        }


        Image.setOnClickListener {  // курсед
            clear2()
            divier()
            b12.visibility = View.GONE
            b13.visibility = View.GONE
            b17.visibility = View.GONE
            b18.visibility = View.GONE
            b19.visibility = View.GONE
            b20.visibility = View.GONE
            b21.visibility = View.GONE
            b22.visibility = View.GONE
            b23.visibility = View.GONE
            b25.visibility = View.GONE
            b26.visibility = View.GONE
            b27.visibility = View.GONE
            b28.visibility = View.GONE
            b29.visibility = View.GONE
            b30.visibility = View.GONE
            b31.visibility = View.GONE
            b32.visibility = View.GONE
            b33.visibility = View.GONE
            b34.visibility = View.GONE
            b43.visibility = View.GONE
            b44.visibility = View.GONE
            b45.visibility = View.GONE
            b46.visibility = View.GONE
            b47.visibility = View.GONE
            b48.visibility = View.GONE
            b49.visibility = View.GONE
            b50.visibility = View.GONE
            b51.visibility = View.GONE
            b52.visibility = View.GONE
            b53.visibility = View.GONE
            b54.visibility = View.GONE
            b55.visibility = View.GONE
            b56.visibility = View.GONE
            b57.visibility = View.GONE
            b58.visibility = View.GONE
            b59.visibility = View.GONE
            b60.visibility = View.GONE
            b61.visibility = View.GONE
            b62.visibility = View.GONE
            b63.visibility = View.GONE
            b64.visibility = View.GONE
            b65.visibility = View.GONE
            b66.visibility = View.GONE
            b67.visibility = View.GONE
            b68.visibility = View.GONE
            b69.visibility = View.GONE
            b2.visibility = View.VISIBLE
            b3.visibility = View.VISIBLE
            b4.visibility = View.VISIBLE
            b5.visibility = View.VISIBLE
            b6.visibility = View.VISIBLE
            b7.visibility = View.VISIBLE
            b8.visibility = View.VISIBLE
            b9.visibility = View.VISIBLE
            b10.visibility = View.VISIBLE
            b11.visibility = View.VISIBLE
            b14.visibility = View.VISIBLE
            b15.visibility = View.VISIBLE
            b16.visibility = View.VISIBLE
            b24.visibility = View.VISIBLE
            b35.visibility = View.VISIBLE
            b36.visibility = View.VISIBLE
            b37.visibility = View.VISIBLE
            b38.visibility = View.VISIBLE
            b39.visibility = View.VISIBLE
            b40.visibility = View.VISIBLE
            b41.visibility = View.VISIBLE
            b42.visibility = View.VISIBLE
            var div2 = findViewById<View>(R.id.divider2).setVisibility(View.VISIBLE)
            cl.setBackgroundResource(R.drawable.photo11)
            Ad1()
        }
        Image4.setOnClickListener {  //улиточка
            Ad1()
            clear2()
            divier()
            b2.visibility = View.GONE
            b3.visibility = View.GONE
            b4.visibility = View.GONE
            b5.visibility = View.GONE
            b6.visibility = View.GONE
            b7.visibility = View.GONE
            b8.visibility = View.GONE
            b9.visibility = View.GONE
            b10.visibility = View.GONE
            b11.visibility = View.GONE
            b14.visibility = View.GONE
            b15.visibility = View.GONE
            b16.visibility = View.GONE
            b17.visibility = View.GONE
            b18.visibility = View.GONE
            b19.visibility = View.GONE
            b20.visibility = View.GONE
            b21.visibility = View.GONE
            b22.visibility = View.GONE
            b23.visibility = View.GONE
            b24.visibility = View.GONE
            b25.visibility = View.GONE
            b26.visibility = View.GONE
            b27.visibility = View.GONE
            b28.visibility = View.GONE
            b29.visibility = View.GONE
            b30.visibility = View.GONE
            b31.visibility = View.GONE
            b32.visibility = View.GONE
            b33.visibility = View.GONE
            b34.visibility = View.GONE
            b35.visibility = View.GONE
            b36.visibility = View.GONE
            b37.visibility = View.GONE
            b38.visibility = View.GONE
            b39.visibility = View.GONE
            b40.visibility = View.GONE
            b41.visibility = View.GONE
            b42.visibility = View.GONE
            b59.visibility = View.GONE
            b60.visibility = View.GONE
            b61.visibility = View.GONE
            b62.visibility = View.GONE
            b63.visibility = View.GONE
            b64.visibility = View.GONE
            b65.visibility = View.GONE
            b66.visibility = View.GONE
            b67.visibility = View.GONE
            b68.visibility = View.GONE
            b69.visibility = View.GONE
            b12.visibility = View.VISIBLE
            b13.visibility = View.VISIBLE
            b43.visibility = View.VISIBLE
            b44.visibility = View.VISIBLE
            b45.visibility = View.VISIBLE
            b46.visibility = View.VISIBLE
            b47.visibility = View.VISIBLE
            b48.visibility = View.VISIBLE
            b49.visibility = View.VISIBLE
            b50.visibility = View.VISIBLE
            b51.visibility = View.VISIBLE
            b52.visibility = View.VISIBLE
            b53.visibility = View.VISIBLE
            b54.visibility = View.VISIBLE
            b55.visibility = View.VISIBLE
            b56.visibility = View.VISIBLE
            b57.visibility = View.VISIBLE
            b58.visibility = View.VISIBLE
            var div = findViewById<View>(R.id.divider).setVisibility(View.VISIBLE)
            cl.setBackgroundResource(R.drawable.photo13)
        }




        Image5.setOnClickListener {  // ангел
            Ad1()
            clear()
            clear2()
            divier()
            b59.visibility = View.VISIBLE
            b60.visibility = View.VISIBLE
            b61.visibility = View.VISIBLE
            b62.visibility = View.VISIBLE
            b63.visibility = View.VISIBLE
            b64.visibility = View.VISIBLE
            b65.visibility = View.VISIBLE
            b66.visibility = View.VISIBLE
            b67.visibility = View.VISIBLE
            b68.visibility = View.VISIBLE
            b69.visibility = View.VISIBLE
            var div4 = findViewById<View>(R.id.divider4).setVisibility(View.VISIBLE)
            cl.setBackgroundResource(R.drawable.photo18)

        }


        val stop = findViewById<ImageView>(R.id.imageView2) //знак вопроса
        stop.setOnClickListener {
            stop1()
        }


        tex.setOnClickListener {
            val Uri:Uri = Uri.parse("https://vk.com/vangelnum")
            val browser: Intent = Intent(Intent.ACTION_VIEW, Uri);
            startActivity(browser)
        }
        text6.setOnClickListener {
            val Uri:Uri = Uri.parse("https://www.twitch.tv/zxcursed")
            val browser: Intent = Intent(Intent.ACTION_VIEW, Uri);
            startActivity(browser)
        }

        tex2.setOnClickListener{

            val mailto = "mailto:vangelnum@gmail.com" +
                    "?cc=" +
                    "&subject=" + Uri.encode("Zxcursed Sounboard")
            val emailIntent = Intent(Intent.ACTION_SENDTO)
            emailIntent.data = Uri.parse(mailto)
            startActivity(emailIntent)

        }

        Image233.setOnClickListener { //кнопочка меню
            val popupMenu = PopupMenu(this, Image233)
            popupMenu.menuInflater.inflate(R.menu.check, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action1 -> {
                        val sendIntent: Intent = Intent().apply {
                            action = Intent.ACTION_SEND
                            putExtra(Intent.EXTRA_TITLE, "Спасибо за то, что поделился приложением! ❤")
                            putExtra(Intent.EXTRA_TEXT, "ПРСОТО ЧТО ТО С ЧЕМ ТО ЭТО ЛУЧШЕЕ ЧТО Я ВИДЕЛ В СВОЕЙ ЖИЗНИ СТАвлю ЛАЙК Ю. НЕТ ТЫЩУ ЛАЙКОВ !!111?: https://play.google.com/store/apps/details?id=com.zxcursedsoundboard.apk")
                            type = "text/plain"
                        }
                        startActivity(Intent.createChooser(sendIntent, "Share images..."))
                    }
                    R.id.action2 -> {
                        cl.setBackgroundColor(Color.parseColor("#ffffff"))
                        clear()
                        divier()
                        b59.visibility = View.GONE
                        b60.visibility = View.GONE
                        b61.visibility = View.GONE
                        b62.visibility = View.GONE
                        b63.visibility = View.GONE
                        b64.visibility = View.GONE
                        b65.visibility = View.GONE
                        b66.visibility = View.GONE
                        b67.visibility = View.GONE
                        b68.visibility = View.GONE
                        b69.visibility = View.GONE

                        tex2.visibility = View.VISIBLE
                        tex.visibility = View.VISIBLE
                        text.visibility = View.VISIBLE
                        imagecontact.visibility = View.VISIBLE
                        text5.visibility = View.VISIBLE
                        text6.visibility = View.VISIBLE
                    }
                    R.id.action3 -> {
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("market://details?id=com.zxcursedsoundboard.apk")
                            )
                        )
                    }
                    R.id.action4 -> {
                        val simpleVideoView = findViewById<VideoView>(R.id.videoView2)
                        divier()
                        simpleVideoView.visibility = View.VISIBLE
                        simpleVideoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.videoplayback))
                        simpleVideoView.requestFocus()
                        simpleVideoView.start()
                        simpleVideoView.setOnCompletionListener {
                            simpleVideoView.visibility = View.GONE
                        }
                    }
                }
                true
            }
            popupMenu.show()
            return@setOnClickListener
        }

    }

    override fun onPause() {
        super.onPause()
        stop1()
    }

    override fun onStop() {
        super.onStop()
        stop1()
    }


    private fun stop1() {
        mSoundPool.autoPause()
        Media6.stop()
        Media6.prepare()
        Media11.stop()
        Media11.prepare()
        Media14.stop()
        Media14.prepare()
        Media19.stop()
        Media19.prepare()
        Media20.stop()
        Media20.prepare()
        Media25.stop()
        Media25.prepare()
        Media26.stop()
        Media26.prepare()
        Media27.stop()
        Media27.prepare()
        Media28.stop()
        Media28.prepare()
        Media38.stop()
        Media38.prepare()
        Media43.stop()
        Media43.prepare()
        Media58.stop()
        Media58.prepare()
        Media59.stop()
        Media59.prepare()
        Media60.stop()
        Media60.prepare()
        Media61.stop()
        Media61.prepare()
        Media62.stop()
        Media62.prepare()
        Media63.stop()
        Media63.prepare()
        Media64.stop()
        Media64.prepare()
        Media65.stop()
        Media65.prepare()
        Media66.stop()
        Media66.prepare()
        Media67.stop()
        Media67.prepare()
        Media68.stop()
        Media68.prepare()
        Media69.stop()
        Media69.prepare()
    }

    private val mSoundPool = SoundPool.Builder()
        .setMaxStreams(5)
        .build()

    private fun loadInterAd() {                                  //реклама
        var adRequest = AdRequest.Builder().build()
        InterstitialAd.load(
            this,
            "ca-app-pub-3940256099942544/1033173712",
            adRequest,
            object : InterstitialAdLoadCallback() {
                override fun onAdFailedToLoad(adError: LoadAdError) {
                    mInterstitialAd = null
                }

                override fun onAdLoaded(interstitialAd: InterstitialAd) {
                    mInterstitialAd = interstitialAd
                }
            })
    }

    private fun showInterAd() {
        if (mInterstitialAd != null) {
            mInterstitialAd?.show(this)
        }
    }

    private fun Ad1() {
        counterAd++
        if ((counterAd % 2 != 0) and (counterAd != 1)) {
            loadInterAd()
        }
        if (counterAd % 2 == 0) {
            showInterAd()
        }
    }

    private fun download(x: Int) {
        if (x == 2) {
            val url =
                "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/1lYhaW-rrnroeA"
            val request = DownloadManager.Request(Uri.parse(url))
                .setTitle("Пивка бахнул")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 3) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/WC5Ax2n_7IhXHw"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Всем молчать")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 4) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/9lhUu6VHkw-XtA"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Трахает")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 5) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/gy-O4dXFpXhpCw"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Пикапер")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 6) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/990tsnu-jYPCDw"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Лут")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 7) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/jb1zwCOQdviGSQ"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Мадмуазель")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 8) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/jlKJdK_UNs9U4w"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Что это")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 9) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/N3hz-J4A1zoQCQ"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Спасибо")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 10) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/FjHszVTHslnftg"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Денег нет")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 11) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/cXIrWJPxNDQ2tg"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Минус")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 12) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/aGgQ40CCQXTW1g"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Учи меня")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 13) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/y_PpwZEhIHR6ZQ"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Ну пожалуйста")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 14) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/sHICBg02SBdSMw"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Анекдот")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 15) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/UhWg8nuwNb0b6Q"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("дырки в сыре")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 16) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/one1yK07x_ODhw"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("байбекайся")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 17) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/tegFWnGJ7vPT2w"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("флай молодец")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 18) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/vXDPdrKzMT9ilw"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("0 смертей")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 19) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/vKVGgzj0JCG2gg"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("флай кушает")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 20) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/go7QLV-k7S3VkA"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("трон стоит")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 21) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/NqMTIQCl8bjG7A"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("нереальный байбек")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 22) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/60sO7feCjtM-EA"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("байбек флая")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 23) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/SzYQoNOFdpoLkg"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("апм флая")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 24) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/tDs8oVb3iENTww"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("смех курседа")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 25) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/RcVz3JRHmzt_ew"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("паузит")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 26) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/MBnzwLtgLt1Y8w"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("макфлури")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 27) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/dmiEP6OGaDQV2w"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("ставку проверил")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 28) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/V1HyBjpEhzf_vg"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("идеальная игра от флая")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 29) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/6-tfOZPQuCX60Q"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("сын")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 30) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/oBjCCP32lo4chg"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("самый сильный саппорт")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 31) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/QtLm1WJX7g1whA"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("39/40 кв")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 32) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/j4AeNwo01-G9gQ"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("люди кикаются ")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 33) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/eaLnatA_boVIJw"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("суперневажно на игру")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 34) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/juj3v705e2iZ-Q"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("ALWAYSWANNAALTTAB")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 35) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/8MU6ax_xAsopjQ"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("это ты 0-10")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 36) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/y-IhIFdtDqhUCQ"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Мамонт")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 37) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/7miNN3B8nQWLzw"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Героябы")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 38) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/NAP0uU6dNOBIrw"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("жена")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 39) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/zDKJmh2xZXmNRA"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("он рад")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 40) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/YQMfEUTY4g406g"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("ты самый лучший сф")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 41) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/VX4T-qOTVuAzUw"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Денди")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 42) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/PRvpvob4obuVkQ"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("5звезд")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 43) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/1LP83LPQtxwLTQ"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Бруда")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 44) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/ZI9prUSVX2psNw"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Спою")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 45) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/O8F3bGNXb_7u2g"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("не за что")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 46) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/zkk_IL4ALKTaWw"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("мама")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 47) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/MDgulrxfgw500A"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("убили")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 48) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/YvFtsPupk6g-hQ"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("аккаунт")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 49) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/y2bUa9KDmzTv9g"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("как хочешь")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 50) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/nG13rPaYIuZHKg"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("роспись")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 51) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/-_R2gqsDyfkzgw"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("хлеб")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 52) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/AmRc3prTej4e_g"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("крошка")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 53) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/H2WofFE01sC1jA"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("что будет")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 54) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/JoWGJiVfyj6lKA"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("что ты сказал")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 55) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/TV7kMdMhDNiJtw"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("ясно")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 56) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/ciNmoO1ZSOGCFQ"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("стесняюсь")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 57) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/io6eI1kXsraolg"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("читать не умею")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 58) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/TenBqnBGgedxyA"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("аккаунт")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 59) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/s6CJG8Ixs_QEUg"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("inmymind")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 60) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/60sFXr5P-NrzYQ"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("закат")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 61) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/B4vX2zYKr2Wffw"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("CS")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 62) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/4uzESrHti_rCUw"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Симплдимпл")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 63) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/uKCn2C4y6gp3ug"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("Колым")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 64) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/k6FR6bBGlaFwIQ"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("перемотка")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 65) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/RBp-yWs-IDKWLQ"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("улитка")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 66) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/X1Kl4wgZ2GKW5A"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("сыночек")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 67) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/_wJ1xDvN-hNJwA"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("сороконожка")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 68) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/B3ktHaLusbKFhw"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("кальмар")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }
        if (x == 69) {
            url = "https://getfile.dokpub.com/yandex/get/https://disk.yandex.ru/d/P4WrRT7lC-0_xA"
            val request = DownloadManager.Request(Uri.parse(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setTitle("анекдот про онлайн")
                .setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
            val manager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
        }


    }
}