package com.google.firebase.storage.network;

import com.google.firebase.storage.internal.StorageReferenceUri;
import sc.e;
/* loaded from: classes.dex */
public class GetMetadataNetworkRequest extends NetworkRequest {
    public GetMetadataNetworkRequest(StorageReferenceUri storageReferenceUri, e eVar) {
        super(storageReferenceUri, eVar);
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public String getAction() {
        return "GET";
    }
}
