package com.google.firebase.storage.network;

import android.net.Uri;
import com.google.firebase.storage.internal.StorageReferenceUri;
import sc.e;
/* loaded from: classes.dex */
public class ResumableUploadByteRequest extends ResumableNetworkRequest {
    private final int bytesToWrite;
    private final byte[] chunk;
    private final boolean isFinal;
    private final long offset;
    private final Uri uploadURL;

    public ResumableUploadByteRequest(StorageReferenceUri storageReferenceUri, e eVar, Uri uri, byte[] bArr, long j10, int i6, boolean z10) {
        super(storageReferenceUri, eVar);
        if (bArr == null && i6 != -1) {
            this.mException = new IllegalArgumentException("contentType is null or empty");
        }
        if (j10 < 0) {
            this.mException = new IllegalArgumentException("offset cannot be negative");
        }
        this.bytesToWrite = i6;
        this.uploadURL = uri;
        this.chunk = i6 <= 0 ? null : bArr;
        this.offset = j10;
        this.isFinal = z10;
        super.setCustomHeader("X-Goog-Upload-Protocol", "resumable");
        if (z10 && i6 > 0) {
            super.setCustomHeader("X-Goog-Upload-Command", "upload, finalize");
        } else if (z10) {
            super.setCustomHeader("X-Goog-Upload-Command", "finalize");
        } else {
            super.setCustomHeader("X-Goog-Upload-Command", "upload");
        }
        super.setCustomHeader("X-Goog-Upload-Offset", Long.toString(j10));
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public String getAction() {
        return "POST";
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public byte[] getOutputRaw() {
        return this.chunk;
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public int getOutputRawSize() {
        int i6 = this.bytesToWrite;
        if (i6 <= 0) {
            return 0;
        }
        return i6;
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public Uri getURL() {
        return this.uploadURL;
    }
}
