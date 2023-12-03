package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.GetMetadataNetworkRequest;
import org.json.JSONObject;
import v9.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class GetDownloadUrlTask implements Runnable {
    private static final String DOWNLOAD_TOKENS_KEY = "downloadTokens";
    private static final String TAG = "GetMetadataTask";
    private ya.i<Uri> pendingResult;
    private ExponentialBackoffSender sender;
    private StorageReference storageRef;

    public GetDownloadUrlTask(StorageReference storageReference, ya.i<Uri> iVar) {
        o.h(storageReference);
        o.h(iVar);
        this.storageRef = storageReference;
        this.pendingResult = iVar;
        if (!storageReference.getRoot().getName().equals(storageReference.getName())) {
            FirebaseStorage storage = this.storageRef.getStorage();
            sc.e app = storage.getApp();
            app.b();
            this.sender = new ExponentialBackoffSender(app.f31432a, storage.getAuthProvider(), storage.getAppCheckProvider(), storage.getMaxOperationRetryTimeMillis());
            return;
        }
        throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
    }

    private Uri extractDownloadUrl(JSONObject jSONObject) {
        String optString = jSONObject.optString(DOWNLOAD_TOKENS_KEY);
        if (!TextUtils.isEmpty(optString)) {
            String str = optString.split(",", -1)[0];
            Uri.Builder buildUpon = this.storageRef.getStorageReferenceUri().getHttpUri().buildUpon();
            buildUpon.appendQueryParameter("alt", "media");
            buildUpon.appendQueryParameter("token", str);
            return buildUpon.build();
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        Uri uri;
        GetMetadataNetworkRequest getMetadataNetworkRequest = new GetMetadataNetworkRequest(this.storageRef.getStorageReferenceUri(), this.storageRef.getApp());
        this.sender.sendWithExponentialBackoff(getMetadataNetworkRequest);
        if (getMetadataNetworkRequest.isResultSuccess()) {
            uri = extractDownloadUrl(getMetadataNetworkRequest.getResultBody());
        } else {
            uri = null;
        }
        ya.i<Uri> iVar = this.pendingResult;
        if (iVar != null) {
            getMetadataNetworkRequest.completeTask(iVar, uri);
        }
    }
}
