package com.google.firebase.storage.network;

import com.google.firebase.storage.internal.StorageReferenceUri;
import sc.e;
/* loaded from: classes.dex */
abstract class ResumableNetworkRequest extends NetworkRequest {
    static final String COMMAND = "X-Goog-Upload-Command";
    static final String CONTENT_TYPE = "X-Goog-Upload-Header-Content-Type";
    static final String OFFSET = "X-Goog-Upload-Offset";
    static final String PROTOCOL = "X-Goog-Upload-Protocol";

    public ResumableNetworkRequest(StorageReferenceUri storageReferenceUri, e eVar) {
        super(storageReferenceUri, eVar);
    }
}
