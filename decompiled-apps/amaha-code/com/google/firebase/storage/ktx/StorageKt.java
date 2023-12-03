package com.google.firebase.storage.ktx;

import android.net.Uri;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.ListResult;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.StreamDownloadTask;
import com.google.firebase.storage.UploadTask;
import com.theinnerhour.b2b.utils.Constants;
import hs.k;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import sc.e;
import ss.l;
import ta.v;
/* compiled from: Storage.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00060\rR\u00020\u000eH\u0086\u0002\u001a\u0011\u0010\u0011\u001a\u00020\u000f*\u00060\rR\u00020\u000eH\u0086\u0002\u001a\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b*\u00060\rR\u00020\u000eH\u0086\u0002\u001a\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00060\rR\u00020\u000eH\u0086\u0002\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00060\u0015R\u00020\u0016H\u0086\u0002\u001a\u0011\u0010\u0011\u001a\u00020\u000f*\u00060\u0015R\u00020\u0016H\u0086\u0002\u001a\u0011\u0010\u0012\u001a\u00020\u0017*\u00060\u0015R\u00020\u0016H\u0086\u0002\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00060\u0018R\u00020\u0019H\u0086\u0002\u001a\u0011\u0010\u0011\u001a\u00020\u000f*\u00060\u0018R\u00020\u0019H\u0086\u0002\u001a\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\u00020\u001aH\u0086\u0002\u001a\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\u00020\u001aH\u0086\u0002\u001a\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u001aH\u0086\u0002\"\u0014\u0010\u001d\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \";\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%0$\"\u0012\b\u0000\u0010#*\f0!R\b\u0012\u0004\u0012\u00028\u00000\"*\b\u0012\u0004\u0012\u00028\u00000\"8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lxe/a;", "", Constants.NOTIFICATION_URL, "Lcom/google/firebase/storage/FirebaseStorage;", "storage", "Lsc/e;", "app", "Lkotlin/Function1;", "Lcom/google/firebase/storage/StorageMetadata$Builder;", "Lhs/k;", "init", "Lcom/google/firebase/storage/StorageMetadata;", "storageMetadata", "Lcom/google/firebase/storage/UploadTask$TaskSnapshot;", "Lcom/google/firebase/storage/UploadTask;", "", "component1", "component2", "component3", "Landroid/net/Uri;", "component4", "Lcom/google/firebase/storage/StreamDownloadTask$TaskSnapshot;", "Lcom/google/firebase/storage/StreamDownloadTask;", "Ljava/io/InputStream;", "Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;", "Lcom/google/firebase/storage/FileDownloadTask;", "Lcom/google/firebase/storage/ListResult;", "", "Lcom/google/firebase/storage/StorageReference;", "LIBRARY_NAME", "Ljava/lang/String;", "getStorage", "(Lxe/a;)Lcom/google/firebase/storage/FirebaseStorage;", "Lcom/google/firebase/storage/StorageTask$SnapshotBase;", "Lcom/google/firebase/storage/StorageTask;", "T", "Lkotlinx/coroutines/flow/d;", "Lcom/google/firebase/storage/ktx/TaskState;", "getTaskState", "(Lcom/google/firebase/storage/StorageTask;)Lkotlinx/coroutines/flow/d;", "taskState", "com.google.firebase-firebase-storage-ktx"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class StorageKt {
    public static final String LIBRARY_NAME = "fire-stg-ktx";

    public static final long component1(UploadTask.TaskSnapshot taskSnapshot) {
        i.g(taskSnapshot, "<this>");
        return taskSnapshot.getBytesTransferred();
    }

    public static final long component2(UploadTask.TaskSnapshot taskSnapshot) {
        i.g(taskSnapshot, "<this>");
        return taskSnapshot.getTotalByteCount();
    }

    public static final StorageMetadata component3(UploadTask.TaskSnapshot taskSnapshot) {
        i.g(taskSnapshot, "<this>");
        return taskSnapshot.getMetadata();
    }

    public static final Uri component4(UploadTask.TaskSnapshot taskSnapshot) {
        i.g(taskSnapshot, "<this>");
        return taskSnapshot.getUploadSessionUri();
    }

    public static final FirebaseStorage getStorage(xe.a aVar) {
        i.g(aVar, "<this>");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance();
        i.f(firebaseStorage, "getInstance()");
        return firebaseStorage;
    }

    public static final <T extends StorageTask<T>.SnapshotBase> kotlinx.coroutines.flow.d<TaskState<T>> getTaskState(StorageTask<T> storageTask) {
        i.g(storageTask, "<this>");
        return v.k(new StorageKt$taskState$1(storageTask, null));
    }

    public static final FirebaseStorage storage(xe.a aVar, String url) {
        i.g(aVar, "<this>");
        i.g(url, "url");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance(url);
        i.f(firebaseStorage, "getInstance(url)");
        return firebaseStorage;
    }

    public static final StorageMetadata storageMetadata(l<? super StorageMetadata.Builder, k> init) {
        i.g(init, "init");
        StorageMetadata.Builder builder = new StorageMetadata.Builder();
        init.invoke(builder);
        StorageMetadata build = builder.build();
        i.f(build, "builder.build()");
        return build;
    }

    public static final long component1(StreamDownloadTask.TaskSnapshot taskSnapshot) {
        i.g(taskSnapshot, "<this>");
        return taskSnapshot.getBytesTransferred();
    }

    public static final long component2(StreamDownloadTask.TaskSnapshot taskSnapshot) {
        i.g(taskSnapshot, "<this>");
        return taskSnapshot.getTotalByteCount();
    }

    public static final InputStream component3(StreamDownloadTask.TaskSnapshot taskSnapshot) {
        i.g(taskSnapshot, "<this>");
        InputStream stream = taskSnapshot.getStream();
        i.f(stream, "stream");
        return stream;
    }

    public static final FirebaseStorage storage(xe.a aVar, e app) {
        i.g(aVar, "<this>");
        i.g(app, "app");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance(app);
        i.f(firebaseStorage, "getInstance(app)");
        return firebaseStorage;
    }

    public static final long component1(FileDownloadTask.TaskSnapshot taskSnapshot) {
        i.g(taskSnapshot, "<this>");
        return taskSnapshot.getBytesTransferred();
    }

    public static final long component2(FileDownloadTask.TaskSnapshot taskSnapshot) {
        i.g(taskSnapshot, "<this>");
        return taskSnapshot.getTotalByteCount();
    }

    public static final String component3(ListResult listResult) {
        i.g(listResult, "<this>");
        return listResult.getPageToken();
    }

    public static final FirebaseStorage storage(xe.a aVar, e app, String url) {
        i.g(aVar, "<this>");
        i.g(app, "app");
        i.g(url, "url");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance(app, url);
        i.f(firebaseStorage, "getInstance(app, url)");
        return firebaseStorage;
    }

    public static final List<StorageReference> component1(ListResult listResult) {
        i.g(listResult, "<this>");
        List<StorageReference> items = listResult.getItems();
        i.f(items, "items");
        return items;
    }

    public static final List<StorageReference> component2(ListResult listResult) {
        i.g(listResult, "<this>");
        List<StorageReference> prefixes = listResult.getPrefixes();
        i.f(prefixes, "prefixes");
        return prefixes;
    }
}
