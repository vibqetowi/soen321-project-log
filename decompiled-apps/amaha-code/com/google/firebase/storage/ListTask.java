package com.google.firebase.storage;

import android.util.Log;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.ListNetworkRequest;
import org.json.JSONException;
import v9.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ListTask implements Runnable {
    private static final String TAG = "ListTask";
    private final Integer maxResults;
    private final String pageToken;
    private final ya.i<ListResult> pendingResult;
    private final ExponentialBackoffSender sender;
    private final StorageReference storageRef;

    public ListTask(StorageReference storageReference, Integer num, String str, ya.i<ListResult> iVar) {
        o.h(storageReference);
        o.h(iVar);
        this.storageRef = storageReference;
        this.maxResults = num;
        this.pageToken = str;
        this.pendingResult = iVar;
        FirebaseStorage storage = storageReference.getStorage();
        sc.e app = storage.getApp();
        app.b();
        this.sender = new ExponentialBackoffSender(app.f31432a, storage.getAuthProvider(), storage.getAppCheckProvider(), storage.getMaxDownloadRetryTimeMillis());
    }

    @Override // java.lang.Runnable
    public void run() {
        ListResult fromJSON;
        ListNetworkRequest listNetworkRequest = new ListNetworkRequest(this.storageRef.getStorageReferenceUri(), this.storageRef.getApp(), this.maxResults, this.pageToken);
        this.sender.sendWithExponentialBackoff(listNetworkRequest);
        if (listNetworkRequest.isResultSuccess()) {
            try {
                fromJSON = ListResult.fromJSON(this.storageRef.getStorage(), listNetworkRequest.getResultBody());
            } catch (JSONException e10) {
                Log.e(TAG, "Unable to parse response body. " + listNetworkRequest.getRawResult(), e10);
                this.pendingResult.a(StorageException.fromException(e10));
                return;
            }
        } else {
            fromJSON = null;
        }
        ya.i<ListResult> iVar = this.pendingResult;
        if (iVar != null) {
            listNetworkRequest.completeTask(iVar, fromJSON);
        }
    }
}
