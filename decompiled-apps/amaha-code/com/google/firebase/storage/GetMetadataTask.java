package com.google.firebase.storage;

import android.util.Log;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.GetMetadataNetworkRequest;
import org.json.JSONException;
import v9.o;
/* loaded from: classes.dex */
class GetMetadataTask implements Runnable {
    private static final String TAG = "GetMetadataTask";
    private ya.i<StorageMetadata> mPendingResult;
    private StorageMetadata mResultMetadata;
    private ExponentialBackoffSender mSender;
    private StorageReference mStorageRef;

    public GetMetadataTask(StorageReference storageReference, ya.i<StorageMetadata> iVar) {
        o.h(storageReference);
        o.h(iVar);
        this.mStorageRef = storageReference;
        this.mPendingResult = iVar;
        if (!storageReference.getRoot().getName().equals(storageReference.getName())) {
            FirebaseStorage storage = this.mStorageRef.getStorage();
            sc.e app = storage.getApp();
            app.b();
            this.mSender = new ExponentialBackoffSender(app.f31432a, storage.getAuthProvider(), storage.getAppCheckProvider(), storage.getMaxDownloadRetryTimeMillis());
            return;
        }
        throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
    }

    @Override // java.lang.Runnable
    public void run() {
        GetMetadataNetworkRequest getMetadataNetworkRequest = new GetMetadataNetworkRequest(this.mStorageRef.getStorageReferenceUri(), this.mStorageRef.getApp());
        this.mSender.sendWithExponentialBackoff(getMetadataNetworkRequest);
        if (getMetadataNetworkRequest.isResultSuccess()) {
            try {
                this.mResultMetadata = new StorageMetadata.Builder(getMetadataNetworkRequest.getResultBody(), this.mStorageRef).build();
            } catch (JSONException e10) {
                Log.e(TAG, "Unable to parse resulting metadata. " + getMetadataNetworkRequest.getRawResult(), e10);
                this.mPendingResult.a(StorageException.fromException(e10));
                return;
            }
        }
        ya.i<StorageMetadata> iVar = this.mPendingResult;
        if (iVar != null) {
            getMetadataNetworkRequest.completeTask(iVar, this.mResultMetadata);
        }
    }
}
