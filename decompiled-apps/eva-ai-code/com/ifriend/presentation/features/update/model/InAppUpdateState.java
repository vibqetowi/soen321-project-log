package com.ifriend.presentation.features.update.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: InAppUpdateState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ifriend/presentation/features/update/model/InAppUpdateState;", "", "isVisible", "", "canClose", "isVisibleSnackbar", "(ZZZ)V", "getCanClose", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InAppUpdateState {
    public static final int $stable = 0;
    private final boolean canClose;
    private final boolean isVisible;
    private final boolean isVisibleSnackbar;

    public InAppUpdateState() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ InAppUpdateState copy$default(InAppUpdateState inAppUpdateState, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = inAppUpdateState.isVisible;
        }
        if ((i & 2) != 0) {
            z2 = inAppUpdateState.canClose;
        }
        if ((i & 4) != 0) {
            z3 = inAppUpdateState.isVisibleSnackbar;
        }
        return inAppUpdateState.copy(z, z2, z3);
    }

    public final boolean component1() {
        return this.isVisible;
    }

    public final boolean component2() {
        return this.canClose;
    }

    public final boolean component3() {
        return this.isVisibleSnackbar;
    }

    public final InAppUpdateState copy(boolean z, boolean z2, boolean z3) {
        return new InAppUpdateState(z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InAppUpdateState) {
            InAppUpdateState inAppUpdateState = (InAppUpdateState) obj;
            return this.isVisible == inAppUpdateState.isVisible && this.canClose == inAppUpdateState.canClose && this.isVisibleSnackbar == inAppUpdateState.isVisibleSnackbar;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.isVisible;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.canClose;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.isVisibleSnackbar;
        return i3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.isVisible;
        boolean z2 = this.canClose;
        boolean z3 = this.isVisibleSnackbar;
        return "InAppUpdateState(isVisible=" + z + ", canClose=" + z2 + ", isVisibleSnackbar=" + z3 + ")";
    }

    public InAppUpdateState(boolean z, boolean z2, boolean z3) {
        this.isVisible = z;
        this.canClose = z2;
        this.isVisibleSnackbar = z3;
    }

    public /* synthetic */ InAppUpdateState(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final boolean getCanClose() {
        return this.canClose;
    }

    public final boolean isVisibleSnackbar() {
        return this.isVisibleSnackbar;
    }
}
