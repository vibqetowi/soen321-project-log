package com.ifriend.domain.models.experiments.common;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: FeatureToggleChatIds.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/ifriend/domain/models/experiments/common/FeatureToggleChatIds;", "", "chatIds", "", "", "include", "", "(Ljava/util/List;Z)V", "getChatIds", "()Ljava/util/List;", "getInclude", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureToggleChatIds {
    private final List<String> chatIds;
    private final boolean include;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeatureToggleChatIds copy$default(FeatureToggleChatIds featureToggleChatIds, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = featureToggleChatIds.chatIds;
        }
        if ((i & 2) != 0) {
            z = featureToggleChatIds.include;
        }
        return featureToggleChatIds.copy(list, z);
    }

    public final List<String> component1() {
        return this.chatIds;
    }

    public final boolean component2() {
        return this.include;
    }

    public final FeatureToggleChatIds copy(List<String> chatIds, boolean z) {
        Intrinsics.checkNotNullParameter(chatIds, "chatIds");
        return new FeatureToggleChatIds(chatIds, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FeatureToggleChatIds) {
            FeatureToggleChatIds featureToggleChatIds = (FeatureToggleChatIds) obj;
            return Intrinsics.areEqual(this.chatIds, featureToggleChatIds.chatIds) && this.include == featureToggleChatIds.include;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.chatIds.hashCode() * 31;
        boolean z = this.include;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        List<String> list = this.chatIds;
        boolean z = this.include;
        return "FeatureToggleChatIds(chatIds=" + list + ", include=" + z + ")";
    }

    public FeatureToggleChatIds(List<String> chatIds, boolean z) {
        Intrinsics.checkNotNullParameter(chatIds, "chatIds");
        this.chatIds = chatIds;
        this.include = z;
    }

    public final List<String> getChatIds() {
        return this.chatIds;
    }

    public final boolean getInclude() {
        return this.include;
    }
}
