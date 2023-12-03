package com.google.firebase.storage.network;

import com.google.firebase.storage.internal.StorageReferenceUri;
import sc.e;
/* loaded from: classes.dex */
public class DeleteNetworkRequest extends NetworkRequest {
    public DeleteNetworkRequest(StorageReferenceUri storageReferenceUri, e eVar) {
        super(storageReferenceUri, eVar);
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public String getAction() {
        return "DELETE";
    }
}
