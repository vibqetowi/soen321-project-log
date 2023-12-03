package com.theinnerhour.b2b.components.telecommunications.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import tf.b;
/* compiled from: StripDetailsModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/StripDetailsModel;", "Ljava/io/Serializable;", "()V", "discountStrip", "", "getDiscountStrip", "()Ljava/lang/String;", "setDiscountStrip", "(Ljava/lang/String;)V", "tagStrip", "getTagStrip", "setTagStrip", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class StripDetailsModel implements Serializable {
    @b("discount_strip")
    private String discountStrip;
    @b("tag_strip")
    private String tagStrip;

    public final String getDiscountStrip() {
        return this.discountStrip;
    }

    public final String getTagStrip() {
        return this.tagStrip;
    }

    public final void setDiscountStrip(String str) {
        this.discountStrip = str;
    }

    public final void setTagStrip(String str) {
        this.tagStrip = str;
    }
}
