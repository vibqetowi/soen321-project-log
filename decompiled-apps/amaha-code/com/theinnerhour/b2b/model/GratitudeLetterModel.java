package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/theinnerhour/b2b/model/GratitudeLetterModel;", "Ljava/io/Serializable;", "()V", "date", "", "getDate", "()J", "setDate", "(J)V", "downloadUrl", "", "getDownloadUrl", "()Ljava/lang/String;", "setDownloadUrl", "(Ljava/lang/String;)V", "fileName", "getFileName", "setFileName", "image", "", "getImage", "()Z", "setImage", "(Z)V", "letter", "getLetter", "setLetter", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class GratitudeLetterModel implements Serializable {
    private long date;
    private String downloadUrl;
    private String fileName;
    private boolean image;
    private String letter;

    public final long getDate() {
        return this.date;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final boolean getImage() {
        return this.image;
    }

    public final String getLetter() {
        return this.letter;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public final void setFileName(String str) {
        this.fileName = str;
    }

    public final void setImage(boolean z10) {
        this.image = z10;
    }

    public final void setLetter(String str) {
        this.letter = str;
    }
}
