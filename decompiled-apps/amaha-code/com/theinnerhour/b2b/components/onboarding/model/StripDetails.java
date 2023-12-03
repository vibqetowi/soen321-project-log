package com.theinnerhour.b2b.components.onboarding.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: MatchingResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/theinnerhour/b2b/components/onboarding/model/StripDetails;", "", "tagStrip", "", "discountStrip", "(Ljava/lang/String;Ljava/lang/String;)V", "getDiscountStrip", "()Ljava/lang/String;", "setDiscountStrip", "(Ljava/lang/String;)V", "getTagStrip", "setTagStrip", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class StripDetails {
    @b("discount_strip")
    private String discountStrip;
    @b("tag_strip")
    private String tagStrip;

    public StripDetails() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ StripDetails copy$default(StripDetails stripDetails, String str, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = stripDetails.tagStrip;
        }
        if ((i6 & 2) != 0) {
            str2 = stripDetails.discountStrip;
        }
        return stripDetails.copy(str, str2);
    }

    public final String component1() {
        return this.tagStrip;
    }

    public final String component2() {
        return this.discountStrip;
    }

    public final StripDetails copy(String str, String str2) {
        return new StripDetails(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StripDetails)) {
            return false;
        }
        StripDetails stripDetails = (StripDetails) obj;
        if (i.b(this.tagStrip, stripDetails.tagStrip) && i.b(this.discountStrip, stripDetails.discountStrip)) {
            return true;
        }
        return false;
    }

    public final String getDiscountStrip() {
        return this.discountStrip;
    }

    public final String getTagStrip() {
        return this.tagStrip;
    }

    public int hashCode() {
        int hashCode;
        String str = this.tagStrip;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.discountStrip;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return i10 + i6;
    }

    public final void setDiscountStrip(String str) {
        this.discountStrip = str;
    }

    public final void setTagStrip(String str) {
        this.tagStrip = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StripDetails(tagStrip=");
        sb2.append(this.tagStrip);
        sb2.append(", discountStrip=");
        return g.c(sb2, this.discountStrip, ')');
    }

    public StripDetails(String str, String str2) {
        this.tagStrip = str;
        this.discountStrip = str2;
    }

    public /* synthetic */ StripDetails(String str, String str2, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : str2);
    }
}
