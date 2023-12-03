package com.google.firebase.remoteconfig;
/* loaded from: classes.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: u  reason: collision with root package name */
    public final int f9806u;

    public FirebaseRemoteConfigServerException(int i6, String str) {
        super(str);
        this.f9806u = i6;
    }

    public FirebaseRemoteConfigServerException(int i6, String str, FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        super(str, firebaseRemoteConfigServerException);
        this.f9806u = i6;
    }
}
