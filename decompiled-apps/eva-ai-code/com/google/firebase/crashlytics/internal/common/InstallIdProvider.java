package com.google.firebase.crashlytics.internal.common;
/* loaded from: classes7.dex */
public interface InstallIdProvider {
    InstallIds getInstallIds();

    /* loaded from: classes7.dex */
    public static abstract class InstallIds {
        public abstract String getCrashlyticsInstallId();

        public abstract String getFirebaseInstallationId();

        public static InstallIds createWithoutFid(String str) {
            return create(str, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static InstallIds create(String str, String str2) {
            return new AutoValue_InstallIdProvider_InstallIds(str, str2);
        }
    }
}
