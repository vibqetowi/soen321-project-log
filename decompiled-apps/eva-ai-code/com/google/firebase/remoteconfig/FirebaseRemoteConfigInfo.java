package com.google.firebase.remoteconfig;
/* loaded from: classes7.dex */
public interface FirebaseRemoteConfigInfo {
    FirebaseRemoteConfigSettings getConfigSettings();

    long getFetchTimeMillis();

    int getLastFetchStatus();
}
