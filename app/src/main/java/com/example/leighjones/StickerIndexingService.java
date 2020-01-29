package com.example.leighjones;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;

import com.google.android.gms.tasks.Task;
import com.google.firebase.appindexing.FirebaseAppIndex;
import com.google.firebase.appindexing.builders.Indexables;
import com.google.firebase.appindexing.builders.StickerBuilder;
import com.google.firebase.appindexing.builders.StickerPackBuilder;

public class StickerIndexingService extends JobIntentService {
    String leighJonesImageUri = Uri.
            parse("android.resource://com.example.leighjones/drawable/newest").
            toString();
    private static final int UNIQUE_JOB_ID = 42;

    @Override
    protected void onHandleWork(@NonNull Intent intent) {

        StickerBuilder leighJonesSticker = Indexables.stickerBuilder()
                .setName("leighJones")
                .setUrl("mystickers://sticker/smiley")
                .setImage(leighJonesImageUri )
                .setDescription("Melissa smiling!")
                .setKeywords("leighJones","sticker")
                .setIsPartOf(Indexables.stickerPackBuilder().setName("leighJones"));


        StickerPackBuilder stickerPackBuilder = Indexables.stickerPackBuilder()
                .setName("leighJones")
                .setUrl("mystickers://sticker/pack/melissa")
                .setHasSticker(leighJonesSticker);


        Task<Void> update = FirebaseAppIndex.getInstance().update(
                stickerPackBuilder.build(),leighJonesSticker.build());
    }

    public static void enqueueWork (Context context){
        enqueueWork(context,StickerIndexingService.class,UNIQUE_JOB_ID, new Intent());
    }



}
