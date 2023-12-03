package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResult26Model;", "Ljava/io/Serializable;", "date", "", "(J)V", "age", "", "getAge", "()Ljava/lang/Integer;", "setAge", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDate", "()J", "setDate", "sleepTime", "", "getSleepTime", "()Ljava/lang/String;", "setSleepTime", "(Ljava/lang/String;)V", "text", "getText", "setText", "wakeUpTime", "getWakeUpTime", "setWakeUpTime", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResult26Model implements Serializable {
    private Integer age;
    private long date;
    private String sleepTime;
    private String text;
    private String wakeUpTime;

    public ScreenResult26Model(long j10) {
        this.date = j10;
    }

    public final Integer getAge() {
        return this.age;
    }

    public final long getDate() {
        return this.date;
    }

    public final String getSleepTime() {
        return this.sleepTime;
    }

    public final String getText() {
        return this.text;
    }

    public final String getWakeUpTime() {
        return this.wakeUpTime;
    }

    public final void setAge(Integer num) {
        this.age = num;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setSleepTime(String str) {
        this.sleepTime = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setWakeUpTime(String str) {
        this.wakeUpTime = str;
    }
}
