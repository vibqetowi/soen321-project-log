package com.ifriend.ui.theme;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AppElevations.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0012\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\b\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J \u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Lcom/ifriend/ui/theme/AppElevations;", "", "card", "Landroidx/compose/ui/unit/Dp;", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCard-D9Ej5fM", "()F", "F", "component1", "component1-D9Ej5fM", "copy", "copy-0680j_4", "(F)Lcom/ifriend/ui/theme/AppElevations;", "equals", "", "other", "hashCode", "", "toString", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppElevations {
    public static final int $stable = 0;
    private final float card;

    public /* synthetic */ AppElevations(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* renamed from: copy-0680j_4$default  reason: not valid java name */
    public static /* synthetic */ AppElevations m7179copy0680j_4$default(AppElevations appElevations, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = appElevations.card;
        }
        return appElevations.m7181copy0680j_4(f);
    }

    /* renamed from: component1-D9Ej5fM  reason: not valid java name */
    public final float m7180component1D9Ej5fM() {
        return this.card;
    }

    /* renamed from: copy-0680j_4  reason: not valid java name */
    public final AppElevations m7181copy0680j_4(float f) {
        return new AppElevations(f, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppElevations) && Dp.m5612equalsimpl0(this.card, ((AppElevations) obj).card);
    }

    public int hashCode() {
        return Dp.m5613hashCodeimpl(this.card);
    }

    public String toString() {
        String m5618toStringimpl = Dp.m5618toStringimpl(this.card);
        return "AppElevations(card=" + m5618toStringimpl + ")";
    }

    private AppElevations(float f) {
        this.card = f;
    }

    /* renamed from: getCard-D9Ej5fM  reason: not valid java name */
    public final float m7182getCardD9Ej5fM() {
        return this.card;
    }

    public /* synthetic */ AppElevations(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.m5607constructorimpl(0) : f, null);
    }
}
