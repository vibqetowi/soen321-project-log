package com.google.firebase.storage;

import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.DeleteNetworkRequest;
import v9.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DeleteStorageTask implements Runnable {
    private static final String TAG = "DeleteStorageTask";
    private ya.i<Void> mPendingResult;
    private ExponentialBackoffSender mSender;
    private StorageReference mStorageRef;

    public DeleteStorageTask(StorageReference storageReference, ya.i<Void> iVar) {
        o.h(storageReference);
        o.h(iVar);
        this.mStorageRef = storageReference;
        this.mPendingResult = iVar;
        FirebaseStorage storage = storageReference.getStorage();
        sc.e app = storage.getApp();
        app.b();
        this.mSender = new ExponentialBackoffSender(app.f31432a, storage.getAuthProvider(), storage.getAppCheckProvider(), storage.getMaxDownloadRetryTimeMillis());
    }

    @Override // java.lang.Runnable
    public void run() {
        DeleteNetworkRequest deleteNetworkRequest = new DeleteNetworkRequest(this.mStorageRef.getStorageReferenceUri(), this.mStorageRef.getApp());
        this.mSender.sendWithExponentialBackoff(deleteNetworkRequest);
        deleteNetworkRequest.completeTask(this.mPendingResult, null);
    }
}
