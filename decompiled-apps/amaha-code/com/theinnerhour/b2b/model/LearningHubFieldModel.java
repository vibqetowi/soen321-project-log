package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/theinnerhour/b2b/model/LearningHubFieldModel;", "Ljava/io/Serializable;", "()V", "data_title", "", "getData_title", "()Ljava/lang/String;", "setData_title", "(Ljava/lang/String;)V", "data_type", "getData_type", "setData_type", "value", "", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class LearningHubFieldModel implements Serializable {
    private String data_title;
    private String data_type;
    private Object value;

    public final String getData_title() {
        return this.data_title;
    }

    public final String getData_type() {
        return this.data_type;
    }

    public final Object getValue() {
        return this.value;
    }

    public final void setData_title(String str) {
        this.data_title = str;
    }

    public final void setData_type(String str) {
        this.data_type = str;
    }

    public final void setValue(Object obj) {
        this.value = obj;
    }
}
