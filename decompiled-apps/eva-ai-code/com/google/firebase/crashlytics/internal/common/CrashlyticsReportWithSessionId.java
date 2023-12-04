package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;
/* loaded from: classes7.dex */
public abstract class CrashlyticsReportWithSessionId {
    public abstract CrashlyticsReport getReport();

    public abstract File getReportFile();

    public abstract String getSessionId();

    public static CrashlyticsReportWithSessionId create(CrashlyticsReport crashlyticsReport, String str, File file) {
        return new AutoValue_CrashlyticsReportWithSessionId(crashlyticsReport, str, file);
    }
}
