package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/theinnerhour/b2b/model/CompassionLetterStorageModel;", "Ljava/io/Serializable;", "date", "", "fileName", "", "downloadUrl", "(JLjava/lang/String;Ljava/lang/String;)V", "getDate", "()J", "setDate", "(J)V", "getDownloadUrl", "()Ljava/lang/String;", "setDownloadUrl", "(Ljava/lang/String;)V", "getFileName", "setFileName", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class CompassionLetterStorageModel implements Serializable {
    private long date;
    private String downloadUrl;
    private String fileName;

    public CompassionLetterStorageModel(long j10, String fileName, String downloadUrl) {
        i.g(fileName, "fileName");
        i.g(downloadUrl, "downloadUrl");
        this.date = j10;
        this.fileName = fileName;
        this.downloadUrl = downloadUrl;
    }

    public final long getDate() {
        return this.date;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setDownloadUrl(String str) {
        i.g(str, "<set-?>");
        this.downloadUrl = str;
    }

    public final void setFileName(String str) {
        i.g(str, "<set-?>");
        this.fileName = str;
    }
}
