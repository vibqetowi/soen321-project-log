package com.ifriend.domain.storage;

import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: NeuronsCostsStorage.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ifriend/domain/storage/NeuronsCosts;", "", "messageCost", "", "avatarCost", "avatarsCount", "(III)V", "getAvatarCost", "()I", "getAvatarsCount", "getMessageCost", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NeuronsCosts {
    private final int avatarCost;
    private final int avatarsCount;
    private final int messageCost;

    public static /* synthetic */ NeuronsCosts copy$default(NeuronsCosts neuronsCosts, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = neuronsCosts.messageCost;
        }
        if ((i4 & 2) != 0) {
            i2 = neuronsCosts.avatarCost;
        }
        if ((i4 & 4) != 0) {
            i3 = neuronsCosts.avatarsCount;
        }
        return neuronsCosts.copy(i, i2, i3);
    }

    public final int component1() {
        return this.messageCost;
    }

    public final int component2() {
        return this.avatarCost;
    }

    public final int component3() {
        return this.avatarsCount;
    }

    public final NeuronsCosts copy(int i, int i2, int i3) {
        return new NeuronsCosts(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NeuronsCosts) {
            NeuronsCosts neuronsCosts = (NeuronsCosts) obj;
            return this.messageCost == neuronsCosts.messageCost && this.avatarCost == neuronsCosts.avatarCost && this.avatarsCount == neuronsCosts.avatarsCount;
        }
        return false;
    }

    public int hashCode() {
        return (((this.messageCost * 31) + this.avatarCost) * 31) + this.avatarsCount;
    }

    public String toString() {
        int i = this.messageCost;
        int i2 = this.avatarCost;
        int i3 = this.avatarsCount;
        return "NeuronsCosts(messageCost=" + i + ", avatarCost=" + i2 + ", avatarsCount=" + i3 + ")";
    }

    public NeuronsCosts(int i, int i2, int i3) {
        this.messageCost = i;
        this.avatarCost = i2;
        this.avatarsCount = i3;
    }

    public final int getAvatarCost() {
        return this.avatarCost;
    }

    public final int getAvatarsCount() {
        return this.avatarsCount;
    }

    public final int getMessageCost() {
        return this.messageCost;
    }
}
