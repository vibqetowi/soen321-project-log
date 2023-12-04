package com.ifriend.presentation.features.profile.header.model;

import com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatHeaderUiState.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0002\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\u0081\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fHÆ\u0001J\u0013\u0010/\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0007HÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017¨\u00063"}, d2 = {"Lcom/ifriend/presentation/features/profile/header/model/ChatHeaderUiState;", "", "animatedAvatarState", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState;", "title", "", "unreadMessagesCount", "", "lvlProgress", "", "lvlLabel", "isVisibleLvlProgress", "", "balanceLabel", "isVisibleBackButton", "isVisibleMenuButton", "isVisibleMenuIndicator", "isVisibleUpdateIndicator", "isVisibleVerified", "(Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState;Ljava/lang/String;IFLjava/lang/String;ZLjava/lang/String;ZZZZZ)V", "getAnimatedAvatarState", "()Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState;", "getBalanceLabel", "()Ljava/lang/String;", "()Z", "isVisibleUnreadIndicator", "getLvlLabel", "getLvlProgress", "()F", "getTitle", "getUnreadMessagesCount", "()I", "unreadMessagesLabel", "getUnreadMessagesLabel", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatHeaderUiState {
    public static final int $stable = 8;
    private final AnimatedAvatarViewState animatedAvatarState;
    private final String balanceLabel;
    private final boolean isVisibleBackButton;
    private final boolean isVisibleLvlProgress;
    private final boolean isVisibleMenuButton;
    private final boolean isVisibleMenuIndicator;
    private final boolean isVisibleUnreadIndicator;
    private final boolean isVisibleUpdateIndicator;
    private final boolean isVisibleVerified;
    private final String lvlLabel;
    private final float lvlProgress;
    private final String title;
    private final int unreadMessagesCount;
    private final String unreadMessagesLabel;

    public ChatHeaderUiState() {
        this(null, null, 0, 0.0f, null, false, null, false, false, false, false, false, 4095, null);
    }

    public final AnimatedAvatarViewState component1() {
        return this.animatedAvatarState;
    }

    public final boolean component10() {
        return this.isVisibleMenuIndicator;
    }

    public final boolean component11() {
        return this.isVisibleUpdateIndicator;
    }

    public final boolean component12() {
        return this.isVisibleVerified;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.unreadMessagesCount;
    }

    public final float component4() {
        return this.lvlProgress;
    }

    public final String component5() {
        return this.lvlLabel;
    }

    public final boolean component6() {
        return this.isVisibleLvlProgress;
    }

    public final String component7() {
        return this.balanceLabel;
    }

    public final boolean component8() {
        return this.isVisibleBackButton;
    }

    public final boolean component9() {
        return this.isVisibleMenuButton;
    }

    public final ChatHeaderUiState copy(AnimatedAvatarViewState animatedAvatarState, String title, int i, float f, String lvlLabel, boolean z, String balanceLabel, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(animatedAvatarState, "animatedAvatarState");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(lvlLabel, "lvlLabel");
        Intrinsics.checkNotNullParameter(balanceLabel, "balanceLabel");
        return new ChatHeaderUiState(animatedAvatarState, title, i, f, lvlLabel, z, balanceLabel, z2, z3, z4, z5, z6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatHeaderUiState) {
            ChatHeaderUiState chatHeaderUiState = (ChatHeaderUiState) obj;
            return Intrinsics.areEqual(this.animatedAvatarState, chatHeaderUiState.animatedAvatarState) && Intrinsics.areEqual(this.title, chatHeaderUiState.title) && this.unreadMessagesCount == chatHeaderUiState.unreadMessagesCount && Float.compare(this.lvlProgress, chatHeaderUiState.lvlProgress) == 0 && Intrinsics.areEqual(this.lvlLabel, chatHeaderUiState.lvlLabel) && this.isVisibleLvlProgress == chatHeaderUiState.isVisibleLvlProgress && Intrinsics.areEqual(this.balanceLabel, chatHeaderUiState.balanceLabel) && this.isVisibleBackButton == chatHeaderUiState.isVisibleBackButton && this.isVisibleMenuButton == chatHeaderUiState.isVisibleMenuButton && this.isVisibleMenuIndicator == chatHeaderUiState.isVisibleMenuIndicator && this.isVisibleUpdateIndicator == chatHeaderUiState.isVisibleUpdateIndicator && this.isVisibleVerified == chatHeaderUiState.isVisibleVerified;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.animatedAvatarState.hashCode() * 31) + this.title.hashCode()) * 31) + this.unreadMessagesCount) * 31) + Float.floatToIntBits(this.lvlProgress)) * 31) + this.lvlLabel.hashCode()) * 31;
        boolean z = this.isVisibleLvlProgress;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.balanceLabel.hashCode()) * 31;
        boolean z2 = this.isVisibleBackButton;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z3 = this.isVisibleMenuButton;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z4 = this.isVisibleMenuIndicator;
        int i6 = z4;
        if (z4 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z5 = this.isVisibleUpdateIndicator;
        int i8 = z5;
        if (z5 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        boolean z6 = this.isVisibleVerified;
        return i9 + (z6 ? 1 : z6 ? 1 : 0);
    }

    public String toString() {
        AnimatedAvatarViewState animatedAvatarViewState = this.animatedAvatarState;
        String str = this.title;
        int i = this.unreadMessagesCount;
        float f = this.lvlProgress;
        String str2 = this.lvlLabel;
        boolean z = this.isVisibleLvlProgress;
        String str3 = this.balanceLabel;
        boolean z2 = this.isVisibleBackButton;
        boolean z3 = this.isVisibleMenuButton;
        boolean z4 = this.isVisibleMenuIndicator;
        boolean z5 = this.isVisibleUpdateIndicator;
        boolean z6 = this.isVisibleVerified;
        return "ChatHeaderUiState(animatedAvatarState=" + animatedAvatarViewState + ", title=" + str + ", unreadMessagesCount=" + i + ", lvlProgress=" + f + ", lvlLabel=" + str2 + ", isVisibleLvlProgress=" + z + ", balanceLabel=" + str3 + ", isVisibleBackButton=" + z2 + ", isVisibleMenuButton=" + z3 + ", isVisibleMenuIndicator=" + z4 + ", isVisibleUpdateIndicator=" + z5 + ", isVisibleVerified=" + z6 + ")";
    }

    public ChatHeaderUiState(AnimatedAvatarViewState animatedAvatarState, String title, int i, float f, String lvlLabel, boolean z, String balanceLabel, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(animatedAvatarState, "animatedAvatarState");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(lvlLabel, "lvlLabel");
        Intrinsics.checkNotNullParameter(balanceLabel, "balanceLabel");
        this.animatedAvatarState = animatedAvatarState;
        this.title = title;
        this.unreadMessagesCount = i;
        this.lvlProgress = f;
        this.lvlLabel = lvlLabel;
        this.isVisibleLvlProgress = z;
        this.balanceLabel = balanceLabel;
        this.isVisibleBackButton = z2;
        this.isVisibleMenuButton = z3;
        this.isVisibleMenuIndicator = z4;
        this.isVisibleUpdateIndicator = z5;
        this.isVisibleVerified = z6;
        this.unreadMessagesLabel = String.valueOf(i);
        this.isVisibleUnreadIndicator = i > 0;
    }

    public /* synthetic */ ChatHeaderUiState(AnimatedAvatarViewState animatedAvatarViewState, String str, int i, float f, String str2, boolean z, String str3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? AnimatedAvatarViewState.Companion.empty() : animatedAvatarViewState, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? 0.0f : f, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? false : z, (i2 & 64) == 0 ? str3 : "", (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? false : z4, (i2 & 1024) != 0 ? false : z5, (i2 & 2048) == 0 ? z6 : false);
    }

    public final AnimatedAvatarViewState getAnimatedAvatarState() {
        return this.animatedAvatarState;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getUnreadMessagesCount() {
        return this.unreadMessagesCount;
    }

    public final float getLvlProgress() {
        return this.lvlProgress;
    }

    public final String getLvlLabel() {
        return this.lvlLabel;
    }

    public final boolean isVisibleLvlProgress() {
        return this.isVisibleLvlProgress;
    }

    public final String getBalanceLabel() {
        return this.balanceLabel;
    }

    public final boolean isVisibleBackButton() {
        return this.isVisibleBackButton;
    }

    public final boolean isVisibleMenuButton() {
        return this.isVisibleMenuButton;
    }

    public final boolean isVisibleMenuIndicator() {
        return this.isVisibleMenuIndicator;
    }

    public final boolean isVisibleUpdateIndicator() {
        return this.isVisibleUpdateIndicator;
    }

    public final boolean isVisibleVerified() {
        return this.isVisibleVerified;
    }

    public final String getUnreadMessagesLabel() {
        return this.unreadMessagesLabel;
    }

    public final boolean isVisibleUnreadIndicator() {
        return this.isVisibleUnreadIndicator;
    }
}
