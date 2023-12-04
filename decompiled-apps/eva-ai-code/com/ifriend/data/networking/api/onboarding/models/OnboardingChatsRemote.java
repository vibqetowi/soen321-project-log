package com.ifriend.data.networking.api.onboarding.models;

import com.google.gson.annotations.SerializedName;
import com.ifriend.domain.config.ConfigKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingChatsRootRemote.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0006\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ifriend/data/networking/api/onboarding/models/OnboardingChatsRemote;", "", "chatId", "", "isSelected", "", "isDefaultSelected", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getChatId", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/ifriend/data/networking/api/onboarding/models/OnboardingChatsRemote;", "equals", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingChatsRemote {
    @SerializedName(ConfigKeys.CLIENT_ID)
    private final String chatId;
    @SerializedName("isDefaultSelected")
    private final Boolean isDefaultSelected;
    @SerializedName("isSelected")
    private final Boolean isSelected;

    public static /* synthetic */ OnboardingChatsRemote copy$default(OnboardingChatsRemote onboardingChatsRemote, String str, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingChatsRemote.chatId;
        }
        if ((i & 2) != 0) {
            bool = onboardingChatsRemote.isSelected;
        }
        if ((i & 4) != 0) {
            bool2 = onboardingChatsRemote.isDefaultSelected;
        }
        return onboardingChatsRemote.copy(str, bool, bool2);
    }

    public final String component1() {
        return this.chatId;
    }

    public final Boolean component2() {
        return this.isSelected;
    }

    public final Boolean component3() {
        return this.isDefaultSelected;
    }

    public final OnboardingChatsRemote copy(String str, Boolean bool, Boolean bool2) {
        return new OnboardingChatsRemote(str, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnboardingChatsRemote) {
            OnboardingChatsRemote onboardingChatsRemote = (OnboardingChatsRemote) obj;
            return Intrinsics.areEqual(this.chatId, onboardingChatsRemote.chatId) && Intrinsics.areEqual(this.isSelected, onboardingChatsRemote.isSelected) && Intrinsics.areEqual(this.isDefaultSelected, onboardingChatsRemote.isDefaultSelected);
        }
        return false;
    }

    public int hashCode() {
        String str = this.chatId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isSelected;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDefaultSelected;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        String str = this.chatId;
        Boolean bool = this.isSelected;
        Boolean bool2 = this.isDefaultSelected;
        return "OnboardingChatsRemote(chatId=" + str + ", isSelected=" + bool + ", isDefaultSelected=" + bool2 + ")";
    }

    public OnboardingChatsRemote(String str, Boolean bool, Boolean bool2) {
        this.chatId = str;
        this.isSelected = bool;
        this.isDefaultSelected = bool2;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public final Boolean isDefaultSelected() {
        return this.isDefaultSelected;
    }
}
