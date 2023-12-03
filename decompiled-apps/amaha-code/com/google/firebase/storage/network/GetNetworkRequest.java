package com.google.firebase.storage.network;

import com.google.firebase.storage.internal.StorageReferenceUri;
import java.util.Collections;
import java.util.Map;
import sc.e;
/* loaded from: classes.dex */
public class GetNetworkRequest extends NetworkRequest {
    private static final String TAG = "GetNetworkRequest";

    public GetNetworkRequest(StorageReferenceUri storageReferenceUri, e eVar, long j10) {
        super(storageReferenceUri, eVar);
        if (j10 != 0) {
            super.setCustomHeader("Range", "bytes=" + j10 + "-");
        }
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public String getAction() {
        return "GET";
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public Map<String, String> getQueryParameters() {
        return Collections.singletonMap("alt", "media");
    }
}
