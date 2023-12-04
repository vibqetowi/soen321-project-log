package com.ifriend.domain.logic.onboarding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: OnboardingChatInfo.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ifriend/domain/logic/onboarding/OnboardingChatInfo;", "", "chatId", "", "isSelected", "", "isDefaultSelected", "(Ljava/lang/String;ZZ)V", "getChatId", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingChatInfo {
    private final String chatId;
    private final boolean isDefaultSelected;
    private final boolean isSelected;

    public static /* synthetic */ OnboardingChatInfo copy$default(OnboardingChatInfo onboardingChatInfo, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingChatInfo.chatId;
        }
        if ((i & 2) != 0) {
            z = onboardingChatInfo.isSelected;
        }
        if ((i & 4) != 0) {
            z2 = onboardingChatInfo.isDefaultSelected;
        }
        return onboardingChatInfo.copy(str, z, z2);
    }

    public final String component1() {
        return this.chatId;
    }

    public final boolean component2() {
        return this.isSelected;
    }

    public final boolean component3() {
        return this.isDefaultSelected;
    }

    public final OnboardingChatInfo copy(String chatId, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new OnboardingChatInfo(chatId, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnboardingChatInfo) {
            OnboardingChatInfo onboardingChatInfo = (OnboardingChatInfo) obj;
            return Intrinsics.areEqual(this.chatId, onboardingChatInfo.chatId) && this.isSelected == onboardingChatInfo.isSelected && this.isDefaultSelected == onboardingChatInfo.isDefaultSelected;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.chatId.hashCode() * 31;
        boolean z = this.isSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isDefaultSelected;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.chatId;
        boolean z = this.isSelected;
        boolean z2 = this.isDefaultSelected;
        return "OnboardingChatInfo(chatId=" + str + ", isSelected=" + z + ", isDefaultSelected=" + z2 + ")";
    }

    public OnboardingChatInfo(String chatId, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.chatId = chatId;
        this.isSelected = z;
        this.isDefaultSelected = z2;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isDefaultSelected() {
        return this.isDefaultSelected;
    }
}
