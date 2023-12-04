package com.ifriend.ui.theme;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AppAnimationDuration.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/ifriend/ui/theme/AppAnimationDuration;", "", "short", "", "medium", "long", "extraLarge", "larger", "(IIIII)V", "getExtraLarge", "()I", "getLarger", "getLong", "getMedium", "getShort", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppAnimationDuration {
    public static final int $stable = 0;
    private final int extraLarge;
    private final int larger;

    /* renamed from: long  reason: not valid java name */
    private final int f133long;
    private final int medium;

    /* renamed from: short  reason: not valid java name */
    private final int f134short;

    public AppAnimationDuration() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ AppAnimationDuration copy$default(AppAnimationDuration appAnimationDuration, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = appAnimationDuration.f134short;
        }
        if ((i6 & 2) != 0) {
            i2 = appAnimationDuration.medium;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = appAnimationDuration.f133long;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = appAnimationDuration.extraLarge;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = appAnimationDuration.larger;
        }
        return appAnimationDuration.copy(i, i7, i8, i9, i5);
    }

    public final int component1() {
        return this.f134short;
    }

    public final int component2() {
        return this.medium;
    }

    public final int component3() {
        return this.f133long;
    }

    public final int component4() {
        return this.extraLarge;
    }

    public final int component5() {
        return this.larger;
    }

    public final AppAnimationDuration copy(int i, int i2, int i3, int i4, int i5) {
        return new AppAnimationDuration(i, i2, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppAnimationDuration) {
            AppAnimationDuration appAnimationDuration = (AppAnimationDuration) obj;
            return this.f134short == appAnimationDuration.f134short && this.medium == appAnimationDuration.medium && this.f133long == appAnimationDuration.f133long && this.extraLarge == appAnimationDuration.extraLarge && this.larger == appAnimationDuration.larger;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f134short * 31) + this.medium) * 31) + this.f133long) * 31) + this.extraLarge) * 31) + this.larger;
    }

    public String toString() {
        int i = this.f134short;
        int i2 = this.medium;
        int i3 = this.f133long;
        int i4 = this.extraLarge;
        int i5 = this.larger;
        return "AppAnimationDuration(short=" + i + ", medium=" + i2 + ", long=" + i3 + ", extraLarge=" + i4 + ", larger=" + i5 + ")";
    }

    public AppAnimationDuration(int i, int i2, int i3, int i4, int i5) {
        this.f134short = i;
        this.medium = i2;
        this.f133long = i3;
        this.extraLarge = i4;
        this.larger = i5;
    }

    public /* synthetic */ AppAnimationDuration(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 200 : i, (i6 & 2) != 0 ? 300 : i2, (i6 & 4) != 0 ? 500 : i3, (i6 & 8) != 0 ? 700 : i4, (i6 & 16) != 0 ? 1000 : i5);
    }

    public final int getShort() {
        return this.f134short;
    }

    public final int getMedium() {
        return this.medium;
    }

    public final int getLong() {
        return this.f133long;
    }

    public final int getExtraLarge() {
        return this.extraLarge;
    }

    public final int getLarger() {
        return this.larger;
    }
}
