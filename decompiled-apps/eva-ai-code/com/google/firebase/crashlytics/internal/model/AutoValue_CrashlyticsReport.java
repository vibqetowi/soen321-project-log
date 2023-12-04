package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes7.dex */
final class AutoValue_CrashlyticsReport extends CrashlyticsReport {
    private final CrashlyticsReport.ApplicationExitInfo appExitInfo;
    private final String buildVersion;
    private final String displayVersion;
    private final String firebaseInstallationId;
    private final String gmpAppId;
    private final String installationUuid;
    private final CrashlyticsReport.FilesPayload ndkPayload;
    private final int platform;
    private final String sdkVersion;
    private final CrashlyticsReport.Session session;

    private AutoValue_CrashlyticsReport(String str, String str2, int i, String str3, String str4, String str5, String str6, CrashlyticsReport.Session session, CrashlyticsReport.FilesPayload filesPayload, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        this.sdkVersion = str;
        this.gmpAppId = str2;
        this.platform = i;
        this.installationUuid = str3;
        this.firebaseInstallationId = str4;
        this.buildVersion = str5;
        this.displayVersion = str6;
        this.session = session;
        this.ndkPayload = filesPayload;
        this.appExitInfo = applicationExitInfo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getGmpAppId() {
        return this.gmpAppId;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public int getPlatform() {
        return this.platform;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getInstallationUuid() {
        return this.installationUuid;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getBuildVersion() {
        return this.buildVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getDisplayVersion() {
        return this.displayVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public CrashlyticsReport.Session getSession() {
        return this.session;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public CrashlyticsReport.FilesPayload getNdkPayload() {
        return this.ndkPayload;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public CrashlyticsReport.ApplicationExitInfo getAppExitInfo() {
        return this.appExitInfo;
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.sdkVersion + ", gmpAppId=" + this.gmpAppId + ", platform=" + this.platform + ", installationUuid=" + this.installationUuid + ", firebaseInstallationId=" + this.firebaseInstallationId + ", buildVersion=" + this.buildVersion + ", displayVersion=" + this.displayVersion + ", session=" + this.session + ", ndkPayload=" + this.ndkPayload + ", appExitInfo=" + this.appExitInfo + "}";
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session session;
        CrashlyticsReport.FilesPayload filesPayload;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport) {
            CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
            if (this.sdkVersion.equals(crashlyticsReport.getSdkVersion()) && this.gmpAppId.equals(crashlyticsReport.getGmpAppId()) && this.platform == crashlyticsReport.getPlatform() && this.installationUuid.equals(crashlyticsReport.getInstallationUuid()) && ((str = this.firebaseInstallationId) != null ? str.equals(crashlyticsReport.getFirebaseInstallationId()) : crashlyticsReport.getFirebaseInstallationId() == null) && this.buildVersion.equals(crashlyticsReport.getBuildVersion()) && this.displayVersion.equals(crashlyticsReport.getDisplayVersion()) && ((session = this.session) != null ? session.equals(crashlyticsReport.getSession()) : crashlyticsReport.getSession() == null) && ((filesPayload = this.ndkPayload) != null ? filesPayload.equals(crashlyticsReport.getNdkPayload()) : crashlyticsReport.getNdkPayload() == null)) {
                CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.appExitInfo;
                if (applicationExitInfo == null) {
                    if (crashlyticsReport.getAppExitInfo() == null) {
                        return true;
                    }
                } else if (applicationExitInfo.equals(crashlyticsReport.getAppExitInfo())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((this.sdkVersion.hashCode() ^ 1000003) * 1000003) ^ this.gmpAppId.hashCode()) * 1000003) ^ this.platform) * 1000003) ^ this.installationUuid.hashCode()) * 1000003;
        String str = this.firebaseInstallationId;
        int hashCode2 = (((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.buildVersion.hashCode()) * 1000003) ^ this.displayVersion.hashCode()) * 1000003;
        CrashlyticsReport.Session session = this.session;
        int hashCode3 = (hashCode2 ^ (session == null ? 0 : session.hashCode())) * 1000003;
        CrashlyticsReport.FilesPayload filesPayload = this.ndkPayload;
        int hashCode4 = (hashCode3 ^ (filesPayload == null ? 0 : filesPayload.hashCode())) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.appExitInfo;
        return hashCode4 ^ (applicationExitInfo != null ? applicationExitInfo.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    protected CrashlyticsReport.Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class Builder extends CrashlyticsReport.Builder {
        private CrashlyticsReport.ApplicationExitInfo appExitInfo;
        private String buildVersion;
        private String displayVersion;
        private String firebaseInstallationId;
        private String gmpAppId;
        private String installationUuid;
        private CrashlyticsReport.FilesPayload ndkPayload;
        private Integer platform;
        private String sdkVersion;
        private CrashlyticsReport.Session session;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(CrashlyticsReport crashlyticsReport) {
            this.sdkVersion = crashlyticsReport.getSdkVersion();
            this.gmpAppId = crashlyticsReport.getGmpAppId();
            this.platform = Integer.valueOf(crashlyticsReport.getPlatform());
            this.installationUuid = crashlyticsReport.getInstallationUuid();
            this.firebaseInstallationId = crashlyticsReport.getFirebaseInstallationId();
            this.buildVersion = crashlyticsReport.getBuildVersion();
            this.displayVersion = crashlyticsReport.getDisplayVersion();
            this.session = crashlyticsReport.getSession();
            this.ndkPayload = crashlyticsReport.getNdkPayload();
            this.appExitInfo = crashlyticsReport.getAppExitInfo();
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setSdkVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.sdkVersion = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setGmpAppId(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.gmpAppId = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setPlatform(int i) {
            this.platform = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setInstallationUuid(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.installationUuid = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setFirebaseInstallationId(String str) {
            this.firebaseInstallationId = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setBuildVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.buildVersion = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setDisplayVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.displayVersion = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setSession(CrashlyticsReport.Session session) {
            this.session = session;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setNdkPayload(CrashlyticsReport.FilesPayload filesPayload) {
            this.ndkPayload = filesPayload;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setAppExitInfo(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.appExitInfo = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport build() {
            String str = this.sdkVersion == null ? " sdkVersion" : "";
            if (this.gmpAppId == null) {
                str = str + " gmpAppId";
            }
            if (this.platform == null) {
                str = str + " platform";
            }
            if (this.installationUuid == null) {
                str = str + " installationUuid";
            }
            if (this.buildVersion == null) {
                str = str + " buildVersion";
            }
            if (this.displayVersion == null) {
                str = str + " displayVersion";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_CrashlyticsReport(this.sdkVersion, this.gmpAppId, this.platform.intValue(), this.installationUuid, this.firebaseInstallationId, this.buildVersion, this.displayVersion, this.session, this.ndkPayload, this.appExitInfo);
        }
    }
}
