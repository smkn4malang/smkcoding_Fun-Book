package com.company.bijix.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<book> listbook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listbook = new ArrayList<>();

        listbook.add(new book("Setinggi Bintang","Rio S Pambudi", "Ada selembar kertas berisi sebaris pesan. Tanpa nama. Tanpa keterangan.\n" +
                "\n" +
                "Rino tak ingin memedulikan pesan itu. Ada banyak hal lain yang menuntut perhatiannya di sekolah. Dia tidak ingin melanggar peraturan, dan lebih dari itu, ingin menyelamatkan dirinya sendiri baik dalam acara yang akan datang maupun dalam pencarian jati diri. Tapi pesan itu, bagaimana pun, tidak bisa ia abaikan begitu saja.\n" +
                "\n" +
                "Antara Rino dengan pesan rahasianya, Heru dengan puisi-puisinya, Alfian dengan Faisal—semuanya pun dimulai", R.drawable.cover1));


        listbook.add(new book("Matahari","Tere Liye", "Namanya Ali, 15 tahun, kelas X. Jika saja orangtuanya mengizinkan, seharusnya dia sudah duduk di tingkat akhir ilmu fisika program doktor di universitas ternama. Ali tidak menyukai sekolahnya, guru-gurunya, teman-teman sekelasnya. Semua membosankan baginya. Tapi sejak dia mengetahui ada yang aneh pada diriku dan Seli, teman sekelasnya, hidupnya yang membosankan berubah seru. Aku bisa menghilang, dan Seli bisa mengeluarkan petir. Ali sendiri punya rahasia kecil. Dia bisa berubah menjadi beruang raksasa. Kami bertiga kemudian bertualang ke tempat-tempat menakjubkan. Namanya Ali. Dia tahu sejak dulu dunia ini tidak sesederhana yang dilihat orang. Dan di atas segalanya, dia akhirnya tahu persahabatan adalah hal yang paling utama.", R.drawable.cover9));


        listbook.add(new book("Bulan","Tere Liye", "Namanya Seli, usianya 15 tahun, kelas sepuluh. Dia sama seperti remaja yang lain. Menyukai hal yang sama, mendengarkan lagu-lagu yang sama, pergi ke gerai fast food, menonton serial drama, film, dan hal-hal yang disukai remaja.\n" +
                "\n" +
                "Tetapi ada sebuah rahasia kecil Seli yang tidak pernah diketahui siapa pun. Sesuatu yang dia simpan sendiri sejak kecil. Sesuatu yang menakjubkan dengan tangannya.\n" +
                "\n" +
                "Namanya Seli. Dan tangannya bisa mengeluarkan petir.", R.drawable.cover3));


        listbook.add(new book("Hujan","Tere Liye", "“Bagian terbaik dari jatuh cinta adalah perasaan itu sendiri, Kamu pernah merasakan rasa sukanya, sesuatu yang sulit dilukiskan kuas sang pelukis, sulit disulam menjadi puisi oleh pujangga, tidak bisa dijelaskan oleh mesin paling canggih sekalipun. Bagian terbaik dari jatuh cinta bukan tentang memiliki. Jadi, kenapa kamu sakit hati setelahnya? Kecewa? Marah? Benci? Cemburu? Jangan-jangan karena kamu tidak pernah paham betapa indahnya jatuh cinta.”\n" +
                "― Tere Liye, Hujan", R.drawable.cover4));


        listbook.add(new book("Laskar Pelangi","Andrea Hirata", "Cerita dari sebuah daerah di Belitung, yakni di SD Muhammadiyah. Saat itu menjadi saat yang menegangkan bagi anak-anak yang ingin bersekolah di SD Muhammadiyah. Kesembilan murid yakni, Ikal, Lintang, Sahara, A Kiong, Syahdan, Kucai, Borek, Trapani tengah gelisah lantaran SD Muhammadiyah akan ditutup jika murid yang bersekolah tidak genap menjadi 10. Mereka semua sangat cemas. SD Muhammadiyah adalah SD islam tertua di Belitung, sehingga jika ditutup juga akan kasihan pada keluarga tidak mampu yang ingin menyekolahkan anak-anak mereka. Di sinilah anak-anak yang kurang beruntung dari segi materi ini berada. ", R.drawable.cover5));


        listbook.add(new book("Negri 5 Menara","Ahmad Fuadi", "Pesan dari Masa Silam\n" +
                "Washington DC, Desember 2003, jam 16.00\n" +
                "\n" +
                "Iseng saja aku mendekat ke jendela kaca dan menyentuh\n" +
                "permukaannya dengan ujung telunjuk kananku. Hawa dingin\n" +
                "segera menjalari wajah dan lengan kananku. Dari balik kerai\n" +
                "tipis di lantai empat ini, salju tampak turun menggumpalgumpal\n" +
                "seperti kapas yang dituang dari langit. Ketukanketukan\n" +
                "halus terdengar setiap gumpal salju menyentuh kaca\n" +
                "di depanku. Matahari sore menggantung condong ke barat\n" +
                "berbentuk piring putih susu.\n" +
                "\n" +
                "Tidak jauh, tampak The Capitol, gedung parlemen Amerika\n" +
                "Serikat yang anggun putih gading, bergaya klasik dengan\n" +
                "tonggak-tonggak besar. Kubah raksasanya yang berundakundak\n" +
                "semakin memutih ditaburi salju, bagai mengenakan\n" +
                "kopiah haji. Di depan gedung ini, hamparan pohon american\n" +
                "elm yang biasanya rimbun kini tinggal dahan-dahan tanpa\n" +
                "daun yang dibalut serbuk es. Sudah 3 jam salju turun. Tanah\n" +
                "bagai dilingkupi permadani putih. Jalan raya yang lebar-lebar\n" +
                "mulai dipadati mobil karyawan yang beringsut-ingsut pulang.\n" +
                "Berbaris seperti semut. Lampu rem yang hidup-mati-hidupmati\n" +
                "memantul merah di salju. Sirine polisi—atau ambulans—\n" +
                "sekali-sekali menggertak diselingi bunyi klakson.\n" +
                "\n" +
                "Udara hangat yang berbau agak hangus dan kering\n" +
                "menderu-deru keluar dari alat pemanas di ujung ruangan.\n" +
                "Mesin ini menggeram-geram karena bekerja maksimal. Walau\n" +
                "begitu, badan setelan melayuku tetap menggigil melawan\n" +
                "suhu yang anjlok sejak beberapa jam lalu. Televisi di ujung\n" +
                "ruang kantor menayangkan Weather Channel yang mencatat\n" +
                "suhu di luar minus 2 derajat celcius. Lebih dingin dari secawan\n" +
                "es tebak di Pasar Ateh, Bukittinggi.", R.drawable.cover6));


        listbook.add(new book("Hafalan Sholat Delisah ","Tere Liye", "Delisa anak perempuan yang bermata hijau, bening dan umurnya baru mencecah lima tahun. Dia hidup dalam keluarganya yang sebegitu, dia cuba menghafal bacaan dalam solat dengan bantuan ibu dan kakaknya.\n" +
                "\n" +
                "Namun Tuhan lebih tahu apa yang lebih baik untuk hamba-Nya. Tsunami datang melumatka senyuman pada wajah Delisa. Tsunami mengambil segala-galanya, keluarga juga kaki kecilnya. Yang tersisa, hanya dia dan ayahnya, dan dalam keadaan sebegitu apakah Delisa mampu tetap tersenyum seperti dahulu dan menyudahkan hafalannya?", R.drawable.cover7));


        listbook.add(new book("Perahu Kertas","Dewi Lestari", "Amsterdam, Juni 1999\n" +
                " Tidak ada alasan untuk meninggalkan Amsterdam pada musim panas. Inilah masa terbaik untuk bersepeda di sekitar Leidseplein dan Dam Square sambil menikmati sinar matahari yang merupakan surga tahunan bagi warga kota.\n" +
                "\n" +
                "Ia masih ingin duduk di pinggir pantai Blomendahl berbekal kanvas dan alat lukis, atau menikmati koffie verkeerd di salah satu kafe di 9 Straatjes dari pagi hingga sore bersama buku sketsanya.\n" +
                "\n" +
                " Sambil mengosongkan baris terakhir bukunya dari rak yang bergantung di samping tempat tidur, pertanyaan yang sama seminggu terakhir ini berulang dalam kepalanya:umurku baru jalan delapan belas, tapi kenapa aku merasa terlalu lelah untuk semua ini?", R.drawable.cover8));



        listbook.add(new book("Matahari","Tere Liye", "Namanya Ali, 15 tahun, kelas X. Jika saja orangtuanya mengizinkan, seharusnya dia sudah duduk di tingkat akhir ilmu fisika program doktor di universitas ternama. Ali tidak menyukai sekolahnya, guru-gurunya, teman-teman sekelasnya. Semua membosankan baginya. Tapi sejak dia mengetahui ada yang aneh pada diriku dan Seli, teman sekelasnya, hidupnya yang membosankan berubah seru. Aku bisa menghilang, dan Seli bisa mengeluarkan petir. Ali sendiri punya rahasia kecil. Dia bisa berubah menjadi beruang raksasa. Kami bertiga kemudian bertualang ke tempat-tempat menakjubkan. Namanya Ali. Dia tahu sejak dulu dunia ini tidak sesederhana yang dilihat orang. Dan di atas segalanya, dia akhirnya tahu persahabatan adalah hal yang paling utama.", R.drawable.cover9));



        listbook.add(new book("Bintang","Tere Liye", "*Novel “BINTANG”\n" +
                "Kami pulang terlambat sekali setelah bertemu dengan Miss Selena di ruangan guru BP sekolah. Bertiga, menumpang angkutan umum berwarna kuning. Hanya kami isi angkot itu.\n" +
                "\n" +
                "Ali terlihat bersungut-sungut, dia masih tidak terima Miss Selena melarang kami menggunakan Buku Kehidupan untuk membuka portal dunia paralel.\n" +
                "\n" +
                "Pukul dua siang, di luar kendaraan terasa panas. Ali membuka jendela angkot lebar-lebar. Gerah. Jalanan macet, berisik suara klakson sesekali meningkahi suasana. Di perempatan depan, bertambah pula masalah kami. Dua orang laki-laki dewasa, mungkin usianya sekitar tiga puluh tahun, dengan pakaian semrawut, rambut berantakan, naik ke atas angkutan. Mereka sepertinya preman kota yang belakangan sering mengganggu penumpang kendaraan umum.\n" +
                "\n" +
                "Seli berbisik, bilang apakah kami sebaiknya bergegas turun. Dua penumpang ini menatap kami tajam, mengancam. Belum sempat aku menyetujui pendapat Seli, dua preman itu telah beranjak duduk, membuat kami terpojok di bagian belakang angkot. Mengunci kami, tidak bisa kemana-mana. Salah-satu dari mereka berbisik kasar mengancam.\n" +
                "\n" +
                "“Keluarkan uang kalian.”\n" +
                "\n" +
                "Aku terdiam, menelan ludah. Seli pias, memegang lenganku. Ali justeru nyengir lebar, balik bertanya, “Eh, kalian serius mau memalak kami?”\n" +
                "\n" +
                "Dua preman itu tentu saja serius. Mereka mengacungkan pisau ke arah kami. Sementara sopir angkot sepertinya tidak tahu apa yang terjadi di belakang, dia sibuk nyelip kesana-kemari di tengah macet.\n" +
                "\n" +
                "“Serahkan uang kalian!” Preman itu mendesak.\n" +
                "\n" +
                "Ali kali ini tertawa kecil, “Ini benar-benar menarik, setelah tadi menyebalkan di sekolah, sekarang sebuah kejutan. Maksudku, ada ribuan kendaraan umum di kota ini, kalian harus naik angkot ini, lantas menodong Raib dan Seli? Kalian apes sekali.”\n" +
                "\n" +
                "Aku menyikut Ali, menyuruhnya diam. Si Biang Kerok ini selalu saja santai dalam banyak hal.\n" +
                "\n" +
                "“Tapi ini benar loh, Ra. Mereka sial sekali. Bukan maksudku karena kita tidak bawa uang sama sekali. Melainkan mereka tidak tahu sedang menodong siapa.” Ali tetap tertawa.\n" +
                "\n" +
                "Dua preman itu nampak marah melihat tawa Ali yang menyepelekan, mereka mengacungkan pisau lebih dekat. Hanya lima senti dari wajahku. Seli menjerit ngeri. “Tutup mulutmu, anak ingusan, serahkan uang atau aku lukai temanmu, hah!”\n" +
                "\n" +
                "Splash. Aku tidak punya pilihan. Aku telah memegang lengan Seli dan Ali. Tubuh kami menghilang, untuk sesaat splash, kami bertiga telah muncul di belakang sebuah bangunan yang sepi. Aku memutuskan melakukan teknik teleportasi. Darurat. Kami memang dilarang menggunakan kekuatan kami sembarangan, tapi dengan dua pisau mengancam, menghindari keributan bisa dikecualikan.\n" +
                "\n" +
                "“Ini tidak seru, Ra!” Ali langsung protes saat kami muncul, “Kamu harusnya mengirim pukulan salju berdentum ke dua preman tadi.”\n" +
                "\n" +
                "Apanya yang tidak seru, aku melotot. Telat menghilang sedetik, bisa panjang urusan di angkot tadi. Pukulan berdentum. Itu ide buruk. Kami akan jadi tontonan satu kota.\n" +
                "\n" +
                "“Dan kamu seharusnya menyambar mereka dengan petir, Seli! Bukan malah ketakutan.” Ali sekarang menoleh. Wajah Seli masih pias, berpegangan kepadaku.\n" +
                "\n" +
                "Sementara di angkot, dua ratus meter dari lokasi kami sekarang, dua preman itu sedang sibuk meraba-raba kursi dan dinding angkot, tangan mereka menggapai-gapai udara kosong. Wajah mereka bingung. “Coy, kemana mereka?” Temannya bertanya gugup. “Aku tidak tahu. Tadi masih di sana kan, Coy?” “Tidak ada, mereka menghilang…. Jangan-jangan.” “Jangan-jangan apa?” Temannya menimpali. “Jangan-jangan mereka mahkluk jejadian.” Dua preman itu terdiam, saling tatap, lantas bergegas lompat turun dari angkot. Lari secepat mungkin.\n" +
                "\n" +
                "*Novel “BINTANG”, Tere Liye", R.drawable.cover10));



        listbook.add(new book("Bumi","Tere Liye", "Namaku Raib, usiaku 15 tahun, kelas sepuluh. Aku anak perempuan seperti kalian, adik-adik kalian, tetangga kalian. Aku punya dua kucing, namanya si Putih dan si Hitam. Mama dan papaku menyenangkan. Guru-guru di sekolahku seru. Teman-temanku baik dan kompak.\n" +
                "\n" +
                "Aku sama seperti remaja kebanyakan, kecuali satu hal. Sesuatu yang kusimpan sendiri sejak kecil. Sesuatu yang menakjubkan.\n" +
                "\n" +
                "Namaku, Raib. Dan aku bisa menghilang.", R.drawable.cover11));


        listbook.add(new book("Sabtu Bersama Bapak","Adhitya Mulya", "Jakarta, desember 1991. pada suatu malam yang terasa lebih ringan dari malam-malam sebelumnya bagi seorang pria paruh baya yang juga seorang kepala keluarga. tampaknya fase denial, anger, bargaining, dan depression sudah ia lewati ,lalu fase acceptance mulai dialami oleh pria itu.\n" +
                "\n" +
                "didalam kamar tidur, gunawan garnida pria berusia 38 tahun asal bandung, menatap kearah lensa handycam. alat itu baru saja di beli dua hari yang lalu, bersama tripod. dia sendiri masih belajar mengoperasikanya. yang penting saat ini, dia tahu letak tombol 'recording' dan 'stop'. dia membetulkan posisi duduk dikursi, memastikan agar dirinya aman.\n" +
                "\n" +
                "Itje Garnida istrinya, wanita berusia 35 tahun yang berasal dari kota kembang juga, masuk ke kamar.\n" +
                "\"anak-anak sudah tidur, say..?\"\n" +
                "\"udah kang.\"\n" +
                "\"oke saya mulai yah.\"\n" +
                "sang istri mengangguk. dia duduk di pinggir tempat tidur. gunawan tampak ragu.\n" +
                "\"kamu grogi ga kalau ada saya?\" tanya itje.\n" +
                "\"nggak, gak apa-apa.\"\n" +
                "gunawan memeriksa setting waktu dalam handycam itu dan memastikan tanggalnya benar.", R.drawable.cover12));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recycler_view);
        RecycleViewAdapter myAdapter = new RecycleViewAdapter(this,listbook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}
