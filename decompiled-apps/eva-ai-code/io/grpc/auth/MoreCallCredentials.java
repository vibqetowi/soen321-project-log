package io.grpc.auth;

import com.google.auth.Credentials;
import io.grpc.CallCredentials;
/* loaded from: classes4.dex */
public final class MoreCallCredentials {
    public static CallCredentials from(Credentials credentials) {
        return new GoogleAuthLibraryCallCredentials(credentials);
    }

    private MoreCallCredentials() {
    }
}
