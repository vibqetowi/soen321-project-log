package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/theinnerhour/b2b/model/ProsAndConsModel;", "Ljava/io/Serializable;", "text", "", "value", "", "(Ljava/lang/String;I)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getValue", "()I", "setValue", "(I)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ProsAndConsModel implements Serializable {
    private String text;
    private int value;

    public ProsAndConsModel(String text, int i6) {
        i.g(text, "text");
        this.text = text;
        this.value = i6;
    }

    public final String getText() {
        return this.text;
    }

    public final int getValue() {
        return this.value;
    }

    public final void setText(String str) {
        i.g(str, "<set-?>");
        this.text = str;
    }

    public final void setValue(int i6) {
        this.value = i6;
    }
}
