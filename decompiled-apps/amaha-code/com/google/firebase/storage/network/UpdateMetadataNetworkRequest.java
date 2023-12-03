package com.google.firebase.storage.network;

import com.google.firebase.storage.internal.StorageReferenceUri;
import org.json.JSONObject;
import sc.e;
/* loaded from: classes.dex */
public class UpdateMetadataNetworkRequest extends NetworkRequest {
    private final JSONObject metadata;

    public UpdateMetadataNetworkRequest(StorageReferenceUri storageReferenceUri, e eVar, JSONObject jSONObject) {
        super(storageReferenceUri, eVar);
        this.metadata = jSONObject;
        setCustomHeader("X-HTTP-Method-Override", "PATCH");
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public String getAction() {
        return "PUT";
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public JSONObject getOutputJSON() {
        return this.metadata;
    }
}
