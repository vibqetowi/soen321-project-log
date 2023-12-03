package com.google.firebase.storage;

import android.util.Log;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.UpdateMetadataNetworkRequest;
import org.json.JSONException;
/* loaded from: classes.dex */
class UpdateMetadataTask implements Runnable {
    private static final String TAG = "UpdateMetadataTask";
    private final StorageMetadata mNewMetadata;
    private final ya.i<StorageMetadata> mPendingResult;
    private StorageMetadata mResultMetadata = null;
    private ExponentialBackoffSender mSender;
    private final StorageReference mStorageRef;

    public UpdateMetadataTask(StorageReference storageReference, ya.i<StorageMetadata> iVar, StorageMetadata storageMetadata) {
        this.mStorageRef = storageReference;
        this.mPendingResult = iVar;
        this.mNewMetadata = storageMetadata;
        FirebaseStorage storage = storageReference.getStorage();
        sc.e app = storage.getApp();
        app.b();
        this.mSender = new ExponentialBackoffSender(app.f31432a, storage.getAuthProvider(), storage.getAppCheckProvider(), storage.getMaxOperationRetryTimeMillis());
    }

    @Override // java.lang.Runnable
    public void run() {
        UpdateMetadataNetworkRequest updateMetadataNetworkRequest = new UpdateMetadataNetworkRequest(this.mStorageRef.getStorageReferenceUri(), this.mStorageRef.getApp(), this.mNewMetadata.createJSONObject());
        this.mSender.sendWithExponentialBackoff(updateMetadataNetworkRequest);
        if (updateMetadataNetworkRequest.isResultSuccess()) {
            try {
                this.mResultMetadata = new StorageMetadata.Builder(updateMetadataNetworkRequest.getResultBody(), this.mStorageRef).build();
            } catch (JSONException e10) {
                Log.e(TAG, "Unable to parse a valid JSON object from resulting metadata:" + updateMetadataNetworkRequest.getRawResult(), e10);
                this.mPendingResult.a(StorageException.fromException(e10));
                return;
            }
        }
        ya.i<StorageMetadata> iVar = this.mPendingResult;
        if (iVar != null) {
            updateMetadataNetworkRequest.completeTask(iVar, this.mResultMetadata);
        }
    }
}
