package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import javax.annotation.Nonnull;
/* loaded from: classes7.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    private final int httpStatusCode;

    public FirebaseRemoteConfigServerException(int i, String str) {
        super(str);
        this.httpStatusCode = i;
    }

    public FirebaseRemoteConfigServerException(int i, String str, Throwable th) {
        super(str, th);
        this.httpStatusCode = i;
    }

    public FirebaseRemoteConfigServerException(String str, @Nonnull FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.httpStatusCode = -1;
    }

    public FirebaseRemoteConfigServerException(int i, String str, @Nonnull FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.httpStatusCode = i;
    }

    public FirebaseRemoteConfigServerException(String str, Throwable th, FirebaseRemoteConfigException.Code code) {
        super(str, th, code);
        this.httpStatusCode = -1;
    }

    public FirebaseRemoteConfigServerException(int i, String str, Throwable th, FirebaseRemoteConfigException.Code code) {
        super(str, th, code);
        this.httpStatusCode = i;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }
}
