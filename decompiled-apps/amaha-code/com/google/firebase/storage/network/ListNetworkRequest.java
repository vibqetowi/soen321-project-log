package com.google.firebase.storage.network;

import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.storage.internal.StorageReferenceUri;
import java.util.HashMap;
import java.util.Map;
import sc.e;
/* loaded from: classes.dex */
public class ListNetworkRequest extends NetworkRequest {
    private final Integer maxPageSize;
    private final String nextPageToken;

    public ListNetworkRequest(StorageReferenceUri storageReferenceUri, e eVar, Integer num, String str) {
        super(storageReferenceUri, eVar);
        this.maxPageSize = num;
        this.nextPageToken = str;
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public String getAction() {
        return "GET";
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public Map<String, String> getQueryParameters() {
        HashMap hashMap = new HashMap();
        String pathWithoutBucket = getPathWithoutBucket();
        if (!pathWithoutBucket.isEmpty()) {
            hashMap.put("prefix", pathWithoutBucket.concat("/"));
        }
        hashMap.put("delimiter", "/");
        Integer num = this.maxPageSize;
        if (num != null) {
            hashMap.put("maxResults", Integer.toString(num.intValue()));
        }
        if (!TextUtils.isEmpty(this.nextPageToken)) {
            hashMap.put("pageToken", this.nextPageToken);
        }
        return hashMap;
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public Uri getURL() {
        String authority = getStorageReferenceUri().getGsUri().getAuthority();
        return Uri.parse(getStorageReferenceUri().getHttpBaseUri() + "/b/" + authority + "/o");
    }
}
