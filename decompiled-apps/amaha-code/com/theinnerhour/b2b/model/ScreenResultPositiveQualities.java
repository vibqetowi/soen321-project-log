package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResultPositiveQualities;", "Ljava/io/Serializable;", "date", "", "(J)V", "getDate", "()J", "setDate", "placeOne", "", "getPlaceOne", "()Ljava/lang/String;", "setPlaceOne", "(Ljava/lang/String;)V", "placeTwo", "getPlaceTwo", "setPlaceTwo", "qualityOne", "getQualityOne", "setQualityOne", "qualityTwo", "getQualityTwo", "setQualityTwo", "taskOne", "getTaskOne", "setTaskOne", "taskTwo", "getTaskTwo", "setTaskTwo", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResultPositiveQualities implements Serializable {
    private long date;
    private String placeOne;
    private String placeTwo;
    private String qualityOne;
    private String qualityTwo;
    private String taskOne;
    private String taskTwo;

    public ScreenResultPositiveQualities(long j10) {
        this.date = j10;
    }

    public final long getDate() {
        return this.date;
    }

    public final String getPlaceOne() {
        return this.placeOne;
    }

    public final String getPlaceTwo() {
        return this.placeTwo;
    }

    public final String getQualityOne() {
        return this.qualityOne;
    }

    public final String getQualityTwo() {
        return this.qualityTwo;
    }

    public final String getTaskOne() {
        return this.taskOne;
    }

    public final String getTaskTwo() {
        return this.taskTwo;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setPlaceOne(String str) {
        this.placeOne = str;
    }

    public final void setPlaceTwo(String str) {
        this.placeTwo = str;
    }

    public final void setQualityOne(String str) {
        this.qualityOne = str;
    }

    public final void setQualityTwo(String str) {
        this.qualityTwo = str;
    }

    public final void setTaskOne(String str) {
        this.taskOne = str;
    }

    public final void setTaskTwo(String str) {
        this.taskTwo = str;
    }
}
