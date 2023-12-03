package com.google.firebase.storage.network;

import android.net.Uri;
import com.google.firebase.storage.internal.StorageReferenceUri;
import sc.e;
/* loaded from: classes.dex */
public class ResumableUploadQueryRequest extends ResumableNetworkRequest {
    private final Uri uploadURL;

    public ResumableUploadQueryRequest(StorageReferenceUri storageReferenceUri, e eVar, Uri uri) {
        super(storageReferenceUri, eVar);
        this.uploadURL = uri;
        super.setCustomHeader("X-Goog-Upload-Protocol", "resumable");
        super.setCustomHeader("X-Goog-Upload-Command", "query");
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public String getAction() {
        return "POST";
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public Uri getURL() {
        return this.uploadURL;
    }
}
