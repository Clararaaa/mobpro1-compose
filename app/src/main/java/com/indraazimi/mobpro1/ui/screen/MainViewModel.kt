/*
 * Copyright (c) 2026 Indra Azimi. All rights reserved.
 *
 * Dibuat untuk buku berjudul "Pemrograman Android Dasar".
 * Dilarang melakukan penggandaan dan atau komersialisasi,
 * sebagian atau seluruh bagian, baik cetak maupun elektronik
 * terhadap project ini tanpa izin pemilik hak cipta.
 */

package com.indraazimi.mobpro1.ui.screen

import androidx.lifecycle.ViewModel
import com.indraazimi.mobpro1.model.Catatan

class MainViewModel : ViewModel() {

    val data = listOf(
        Catatan(
            1,
            "Kuliah Mobpro 23 Feb",
            "Kuliah hari pertama. Ternyata keren juga yang mau dipelajari.",
            "2026-02-23 12:34:56"
        ),
        Catatan(
            2,
            "Kuliah Mobpro 25 Feb",
            "Praktikum pertama: running modul, Alhamdulillah hari ini lancar.",
            "2026-02-25 12:34:56"
        ),
        Catatan(
            3,
            "Kuliah Mobpro 02 Mar",
            "Kuliah hari kedua. Ternyata cukup mudah di pahami",
            "2026-03-02 12:34:56"
        ),
        Catatan(
            4,
            "Kuliah Mobpro 04 Mar",
            "Praktikum Kedua. Sangat lancar dan semakin semangat untuk belajar",
            "2026-03-04 12:34:56"
        ),
        Catatan(
            5,
            "Kuliah Mobpro 09 Mar",
            "Kuliah selanjutnya. Banyak hal baru yang dipelajari",
            "2026-03-09 12:34:56"
        ),
        Catatan(
            6,
            "Kuliah Mobpro 11 Maret",
            "Praktikum kali ini membuat aplikasi Galeri Hewan.." +
            "Klik tombol lanjut, maka foto dan nama hewannya berubah.",
            "2026-03-11 12:34:56"
        ),
        Catatan(
            7,
            "Kuliah Mobpro 30 Mar",
            "Kuliah hari ini. Ternyata semakin asik",
            "2026-03-30 12:34:56"
        ),
        Catatan(
            8,
            "Kuliah Mobpro 01 April",
            "Praktikum kali ini membuat aplikasi perhitungan BMI",
            "2026-04-01 12:34:56"
        )
    )

    fun getCatatan(id: Long): Catatan? {
        return data.find { it.id == id}
    }
}