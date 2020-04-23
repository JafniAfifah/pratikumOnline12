package com.example.modul11.api

import android.provider.ContactsContract
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<ContactsContract.CommonDataKinds.Photo>>
}