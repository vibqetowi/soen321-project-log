package com.theinnerhour.b2b.components.onboarding.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: MatchingResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/theinnerhour/b2b/components/onboarding/model/Couple;", "", "minimumFee", "", "displayText", "offeringCouple", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getDisplayText", "()Ljava/lang/String;", "setDisplayText", "(Ljava/lang/String;)V", "getMinimumFee", "setMinimumFee", "getOfferingCouple", "()Ljava/lang/Boolean;", "setOfferingCouple", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/theinnerhour/b2b/components/onboarding/model/Couple;", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class Couple {
    @b("display_text")
    private String displayText;
    @b("minimum_fee")
    private String minimumFee;
    @b("offering_couple")
    private Boolean offeringCouple;

    public Couple() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Couple copy$default(Couple couple, String str, String str2, Boolean bool, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = couple.minimumFee;
        }
        if ((i6 & 2) != 0) {
            str2 = couple.displayText;
        }
        if ((i6 & 4) != 0) {
            bool = couple.offeringCouple;
        }
        return couple.copy(str, str2, bool);
    }

    public final String component1() {
        return this.minimumFee;
    }

    public final String component2() {
        return this.displayText;
    }

    public final Boolean component3() {
        return this.offeringCouple;
    }

    public final Couple copy(String str, String str2, Boolean bool) {
        return new Couple(str, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Couple)) {
            return false;
        }
        Couple couple = (Couple) obj;
        if (i.b(this.minimumFee, couple.minimumFee) && i.b(this.displayText, couple.displayText) && i.b(this.offeringCouple, couple.offeringCouple)) {
            return true;
        }
        return false;
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public final String getMinimumFee() {
        return this.minimumFee;
    }

    public final Boolean getOfferingCouple() {
        return this.offeringCouple;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.minimumFee;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.displayText;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Boolean bool = this.offeringCouple;
        if (bool != null) {
            i6 = bool.hashCode();
        }
        return i11 + i6;
    }

    public final void setDisplayText(String str) {
        this.displayText = str;
    }

    public final void setMinimumFee(String str) {
        this.minimumFee = str;
    }

    public final void setOfferingCouple(Boolean bool) {
        this.offeringCouple = bool;
    }

    public String toString() {
        return "Couple(minimumFee=" + this.minimumFee + ", displayText=" + this.displayText + ", offeringCouple=" + this.offeringCouple + ')';
    }

    public Couple(String str, String str2, Boolean bool) {
        this.minimumFee = str;
        this.displayText = str2;
        this.offeringCouple = bool;
    }

    public /* synthetic */ Couple(String str, String str2, Boolean bool, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : str2, (i6 & 4) != 0 ? null : bool);
    }
}
