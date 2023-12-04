package com.ifriend.data.networking.api.onboarding.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingChatsRootRemote.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ifriend/data/networking/api/onboarding/models/OnboardingChatsRootRemote;", "", "chats", "", "Lcom/ifriend/data/networking/api/onboarding/models/OnboardingChatsRemote;", "(Ljava/util/List;)V", "getChats", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingChatsRootRemote {
    @SerializedName("bots")
    private final List<OnboardingChatsRemote> chats;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnboardingChatsRootRemote copy$default(OnboardingChatsRootRemote onboardingChatsRootRemote, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = onboardingChatsRootRemote.chats;
        }
        return onboardingChatsRootRemote.copy(list);
    }

    public final List<OnboardingChatsRemote> component1() {
        return this.chats;
    }

    public final OnboardingChatsRootRemote copy(List<OnboardingChatsRemote> list) {
        return new OnboardingChatsRootRemote(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnboardingChatsRootRemote) && Intrinsics.areEqual(this.chats, ((OnboardingChatsRootRemote) obj).chats);
    }

    public int hashCode() {
        List<OnboardingChatsRemote> list = this.chats;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<OnboardingChatsRemote> list = this.chats;
        return "OnboardingChatsRootRemote(chats=" + list + ")";
    }

    public OnboardingChatsRootRemote(List<OnboardingChatsRemote> list) {
        this.chats = list;
    }

    public final List<OnboardingChatsRemote> getChats() {
        return this.chats;
    }
}
