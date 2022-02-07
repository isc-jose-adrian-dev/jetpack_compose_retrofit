package com.jarov.mobile.jetpack_compose.data.retrofit

import com.jarov.mobile.jetpack_compose.data.models.Album
import retrofit2.Response
import retrofit2.http.GET

interface AlbumService {
    @GET("/albums")
    suspend fun getAlbums() : Response<Album>
}