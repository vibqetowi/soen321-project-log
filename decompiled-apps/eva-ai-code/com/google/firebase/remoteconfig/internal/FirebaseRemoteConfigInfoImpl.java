package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
/* loaded from: classes7.dex */
public class FirebaseRemoteConfigInfoImpl implements FirebaseRemoteConfigInfo {
    private final FirebaseRemoteConfigSettings configSettings;
    private final int lastFetchStatus;
    private final long lastSuccessfulFetchTimeInMillis;

    private FirebaseRemoteConfigInfoImpl(long j, int i, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.lastSuccessfulFetchTimeInMillis = j;
        this.lastFetchStatus = i;
        this.configSettings = firebaseRemoteConfigSettings;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public long getFetchTimeMillis() {
        return this.lastSuccessfulFetchTimeInMillis;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public int getLastFetchStatus() {
        return this.lastFetchStatus;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public FirebaseRemoteConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    /* loaded from: classes7.dex */
    public static class Builder {
        private FirebaseRemoteConfigSettings builderConfigSettings;
        private int builderLastFetchStatus;
        private long builderLastSuccessfulFetchTimeInMillis;

        private Builder() {
        }

        public Builder withLastSuccessfulFetchTimeInMillis(long j) {
            this.builderLastSuccessfulFetchTimeInMillis = j;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder withLastFetchStatus(int i) {
            this.builderLastFetchStatus = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder withConfigSettings(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
            this.builderConfigSettings = firebaseRemoteConfigSettings;
            return this;
        }

        public FirebaseRemoteConfigInfoImpl build() {
            return new FirebaseRemoteConfigInfoImpl(this.builderLastSuccessfulFetchTimeInMillis, this.builderLastFetchStatus, this.builderConfigSettings);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Builder newBuilder() {
        return new Builder();
    }
}
