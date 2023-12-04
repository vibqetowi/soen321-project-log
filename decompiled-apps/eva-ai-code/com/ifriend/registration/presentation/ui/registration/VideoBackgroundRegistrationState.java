package com.ifriend.registration.presentation.ui.registration;

import com.ifriend.ui.base.mvvm.BaseState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: VideoBackgroundRegistrationState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationState;", "Lcom/ifriend/ui/base/mvvm/BaseState;", "isNeedToShowAllOptions", "", "showLoading", "showUI", "(ZZZ)V", "()Z", "getShowLoading", "getShowUI", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoBackgroundRegistrationState extends BaseState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean isNeedToShowAllOptions;
    private final boolean showLoading;
    private final boolean showUI;

    public static /* synthetic */ VideoBackgroundRegistrationState copy$default(VideoBackgroundRegistrationState videoBackgroundRegistrationState, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = videoBackgroundRegistrationState.isNeedToShowAllOptions;
        }
        if ((i & 2) != 0) {
            z2 = videoBackgroundRegistrationState.showLoading;
        }
        if ((i & 4) != 0) {
            z3 = videoBackgroundRegistrationState.showUI;
        }
        return videoBackgroundRegistrationState.copy(z, z2, z3);
    }

    public final boolean component1() {
        return this.isNeedToShowAllOptions;
    }

    public final boolean component2() {
        return this.showLoading;
    }

    public final boolean component3() {
        return this.showUI;
    }

    public final VideoBackgroundRegistrationState copy(boolean z, boolean z2, boolean z3) {
        return new VideoBackgroundRegistrationState(z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoBackgroundRegistrationState) {
            VideoBackgroundRegistrationState videoBackgroundRegistrationState = (VideoBackgroundRegistrationState) obj;
            return this.isNeedToShowAllOptions == videoBackgroundRegistrationState.isNeedToShowAllOptions && this.showLoading == videoBackgroundRegistrationState.showLoading && this.showUI == videoBackgroundRegistrationState.showUI;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.isNeedToShowAllOptions;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.showLoading;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.showUI;
        return i3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.isNeedToShowAllOptions;
        boolean z2 = this.showLoading;
        boolean z3 = this.showUI;
        return "VideoBackgroundRegistrationState(isNeedToShowAllOptions=" + z + ", showLoading=" + z2 + ", showUI=" + z3 + ")";
    }

    public final boolean isNeedToShowAllOptions() {
        return this.isNeedToShowAllOptions;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final boolean getShowUI() {
        return this.showUI;
    }

    /* compiled from: VideoBackgroundRegistrationState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationState$Companion;", "", "()V", "initial", "Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationState;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VideoBackgroundRegistrationState initial() {
            return new VideoBackgroundRegistrationState(false, false, false);
        }
    }

    public VideoBackgroundRegistrationState(boolean z, boolean z2, boolean z3) {
        this.isNeedToShowAllOptions = z;
        this.showLoading = z2;
        this.showUI = z3;
    }
}
