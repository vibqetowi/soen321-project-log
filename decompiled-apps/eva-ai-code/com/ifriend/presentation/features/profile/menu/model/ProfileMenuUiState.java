package com.ifriend.presentation.features.profile.menu.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ProfileMenuUiState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003JO\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/ifriend/presentation/features/profile/menu/model/ProfileMenuUiState;", "", "isMenuVisible", "", "isConfirmEmailVisible", "isNeuronsItemVisible", "isUpgradeVisible", "isEditBotVisible", "botName", "", "neuronsCount", "(ZZZZZLjava/lang/String;Ljava/lang/String;)V", "getBotName", "()Ljava/lang/String;", "()Z", "getNeuronsCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileMenuUiState {
    public static final int $stable = 0;
    private final String botName;
    private final boolean isConfirmEmailVisible;
    private final boolean isEditBotVisible;
    private final boolean isMenuVisible;
    private final boolean isNeuronsItemVisible;
    private final boolean isUpgradeVisible;
    private final String neuronsCount;

    public ProfileMenuUiState() {
        this(false, false, false, false, false, null, null, 127, null);
    }

    public static /* synthetic */ ProfileMenuUiState copy$default(ProfileMenuUiState profileMenuUiState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = profileMenuUiState.isMenuVisible;
        }
        if ((i & 2) != 0) {
            z2 = profileMenuUiState.isConfirmEmailVisible;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = profileMenuUiState.isNeuronsItemVisible;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = profileMenuUiState.isUpgradeVisible;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            z5 = profileMenuUiState.isEditBotVisible;
        }
        boolean z9 = z5;
        if ((i & 32) != 0) {
            str = profileMenuUiState.botName;
        }
        String str3 = str;
        if ((i & 64) != 0) {
            str2 = profileMenuUiState.neuronsCount;
        }
        return profileMenuUiState.copy(z, z6, z7, z8, z9, str3, str2);
    }

    public final boolean component1() {
        return this.isMenuVisible;
    }

    public final boolean component2() {
        return this.isConfirmEmailVisible;
    }

    public final boolean component3() {
        return this.isNeuronsItemVisible;
    }

    public final boolean component4() {
        return this.isUpgradeVisible;
    }

    public final boolean component5() {
        return this.isEditBotVisible;
    }

    public final String component6() {
        return this.botName;
    }

    public final String component7() {
        return this.neuronsCount;
    }

    public final ProfileMenuUiState copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String botName, String neuronsCount) {
        Intrinsics.checkNotNullParameter(botName, "botName");
        Intrinsics.checkNotNullParameter(neuronsCount, "neuronsCount");
        return new ProfileMenuUiState(z, z2, z3, z4, z5, botName, neuronsCount);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProfileMenuUiState) {
            ProfileMenuUiState profileMenuUiState = (ProfileMenuUiState) obj;
            return this.isMenuVisible == profileMenuUiState.isMenuVisible && this.isConfirmEmailVisible == profileMenuUiState.isConfirmEmailVisible && this.isNeuronsItemVisible == profileMenuUiState.isNeuronsItemVisible && this.isUpgradeVisible == profileMenuUiState.isUpgradeVisible && this.isEditBotVisible == profileMenuUiState.isEditBotVisible && Intrinsics.areEqual(this.botName, profileMenuUiState.botName) && Intrinsics.areEqual(this.neuronsCount, profileMenuUiState.neuronsCount);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public int hashCode() {
        boolean z = this.isMenuVisible;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.isConfirmEmailVisible;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.isNeuronsItemVisible;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.isUpgradeVisible;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z2 = this.isEditBotVisible;
        return ((((i7 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.botName.hashCode()) * 31) + this.neuronsCount.hashCode();
    }

    public String toString() {
        boolean z = this.isMenuVisible;
        boolean z2 = this.isConfirmEmailVisible;
        boolean z3 = this.isNeuronsItemVisible;
        boolean z4 = this.isUpgradeVisible;
        boolean z5 = this.isEditBotVisible;
        String str = this.botName;
        String str2 = this.neuronsCount;
        return "ProfileMenuUiState(isMenuVisible=" + z + ", isConfirmEmailVisible=" + z2 + ", isNeuronsItemVisible=" + z3 + ", isUpgradeVisible=" + z4 + ", isEditBotVisible=" + z5 + ", botName=" + str + ", neuronsCount=" + str2 + ")";
    }

    public ProfileMenuUiState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String botName, String neuronsCount) {
        Intrinsics.checkNotNullParameter(botName, "botName");
        Intrinsics.checkNotNullParameter(neuronsCount, "neuronsCount");
        this.isMenuVisible = z;
        this.isConfirmEmailVisible = z2;
        this.isNeuronsItemVisible = z3;
        this.isUpgradeVisible = z4;
        this.isEditBotVisible = z5;
        this.botName = botName;
        this.neuronsCount = neuronsCount;
    }

    public /* synthetic */ ProfileMenuUiState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? true : z4, (i & 16) == 0 ? z5 : false, (i & 32) != 0 ? "" : str, (i & 64) != 0 ? "" : str2);
    }

    public final boolean isMenuVisible() {
        return this.isMenuVisible;
    }

    public final boolean isConfirmEmailVisible() {
        return this.isConfirmEmailVisible;
    }

    public final boolean isNeuronsItemVisible() {
        return this.isNeuronsItemVisible;
    }

    public final boolean isUpgradeVisible() {
        return this.isUpgradeVisible;
    }

    public final boolean isEditBotVisible() {
        return this.isEditBotVisible;
    }

    public final String getBotName() {
        return this.botName;
    }

    public final String getNeuronsCount() {
        return this.neuronsCount;
    }
}
