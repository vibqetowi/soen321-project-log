package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResult23Model;", "Ljava/io/Serializable;", "date", "", "task", "", "state", "(JLjava/lang/String;J)V", "getDate", "()J", "setDate", "(J)V", "getState", "setState", "getTask", "()Ljava/lang/String;", "setTask", "(Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResult23Model implements Serializable {
    private long date;
    private long state;
    private String task;

    public ScreenResult23Model(long j10, String task, long j11) {
        i.g(task, "task");
        this.date = j10;
        this.task = task;
        this.state = j11;
    }

    public final long getDate() {
        return this.date;
    }

    public final long getState() {
        return this.state;
    }

    public final String getTask() {
        return this.task;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setState(long j10) {
        this.state = j10;
    }

    public final void setTask(String str) {
        i.g(str, "<set-?>");
        this.task = str;
    }
}
