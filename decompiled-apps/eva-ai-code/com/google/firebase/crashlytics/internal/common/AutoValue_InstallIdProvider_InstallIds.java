package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.InstallIdProvider;
/* loaded from: classes7.dex */
final class AutoValue_InstallIdProvider_InstallIds extends InstallIdProvider.InstallIds {
    private final String crashlyticsInstallId;
    private final String firebaseInstallationId;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_InstallIdProvider_InstallIds(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.crashlyticsInstallId = str;
        this.firebaseInstallationId = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public String getCrashlyticsInstallId() {
        return this.crashlyticsInstallId;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.crashlyticsInstallId + ", firebaseInstallationId=" + this.firebaseInstallationId + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallIdProvider.InstallIds) {
            InstallIdProvider.InstallIds installIds = (InstallIdProvider.InstallIds) obj;
            if (this.crashlyticsInstallId.equals(installIds.getCrashlyticsInstallId())) {
                String str = this.firebaseInstallationId;
                if (str == null) {
                    if (installIds.getFirebaseInstallationId() == null) {
                        return true;
                    }
                } else if (str.equals(installIds.getFirebaseInstallationId())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.crashlyticsInstallId.hashCode() ^ 1000003) * 1000003;
        String str = this.firebaseInstallationId;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }
}
