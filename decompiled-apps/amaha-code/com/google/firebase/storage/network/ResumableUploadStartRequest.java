package com.google.firebase.storage.network;

import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.storage.internal.StorageReferenceUri;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import sc.e;
/* loaded from: classes.dex */
public class ResumableUploadStartRequest extends ResumableNetworkRequest {
    private final String contentType;
    private final JSONObject metadata;

    public ResumableUploadStartRequest(StorageReferenceUri storageReferenceUri, e eVar, JSONObject jSONObject, String str) {
        super(storageReferenceUri, eVar);
        this.metadata = jSONObject;
        this.contentType = str;
        if (TextUtils.isEmpty(str)) {
            this.mException = new IllegalArgumentException("mContentType is null or empty");
        }
        super.setCustomHeader("X-Goog-Upload-Protocol", "resumable");
        super.setCustomHeader("X-Goog-Upload-Command", "start");
        super.setCustomHeader("X-Goog-Upload-Header-Content-Type", str);
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public String getAction() {
        return "POST";
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public JSONObject getOutputJSON() {
        return this.metadata;
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public Map<String, String> getQueryParameters() {
        HashMap hashMap = new HashMap();
        hashMap.put(SessionManager.KEY_NAME, getPathWithoutBucket());
        hashMap.put("uploadType", "resumable");
        return hashMap;
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public Uri getURL() {
        String authority = getStorageReferenceUri().getGsUri().getAuthority();
        Uri.Builder buildUpon = getStorageReferenceUri().getHttpBaseUri().buildUpon();
        buildUpon.appendPath(Constants.ONBOARDING_VARIANT);
        buildUpon.appendPath(authority);
        buildUpon.appendPath("o");
        return buildUpon.build();
    }
}
