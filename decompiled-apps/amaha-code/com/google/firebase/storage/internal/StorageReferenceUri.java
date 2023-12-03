package com.google.firebase.storage.internal;

import android.net.Uri;
import com.google.firebase.storage.network.NetworkRequest;
import com.theinnerhour.b2b.utils.Constants;
import zd.a;
/* loaded from: classes.dex */
public class StorageReferenceUri {
    private final Uri gsUri;
    private final Uri httpBaseUri;
    private final Uri httpUri;

    public StorageReferenceUri(Uri uri) {
        this(uri, null);
    }

    public Uri getGsUri() {
        return this.gsUri;
    }

    public Uri getHttpBaseUri() {
        return this.httpBaseUri;
    }

    public Uri getHttpUri() {
        return this.httpUri;
    }

    public StorageReferenceUri(Uri uri, a aVar) {
        Uri parse;
        this.gsUri = uri;
        if (aVar == null) {
            parse = NetworkRequest.PROD_BASE_URL;
        } else {
            parse = Uri.parse("http://" + aVar.f39363a + ":" + aVar.f39364b + "/v0");
        }
        this.httpBaseUri = parse;
        Uri.Builder appendEncodedPath = parse.buildUpon().appendPath(Constants.ONBOARDING_VARIANT).appendEncodedPath(uri.getAuthority());
        String normalizeSlashes = Slashes.normalizeSlashes(uri.getPath());
        if (normalizeSlashes.length() > 0 && !"/".equals(normalizeSlashes)) {
            appendEncodedPath = appendEncodedPath.appendPath("o").appendPath(normalizeSlashes);
        }
        this.httpUri = appendEncodedPath.build();
    }
}
