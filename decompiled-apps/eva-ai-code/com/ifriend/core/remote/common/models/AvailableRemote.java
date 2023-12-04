package com.ifriend.core.remote.common.models;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AvailableRemote.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/ifriend/core/remote/common/models/AvailableRemote;", "", "isAvailable", "", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/ifriend/core/remote/common/models/AvailableRemote;", "equals", "other", "hashCode", "", "toString", "", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvailableRemote {
    @SerializedName("available")
    private final Boolean isAvailable;

    public AvailableRemote() {
        this(null, 1, null);
    }

    public static /* synthetic */ AvailableRemote copy$default(AvailableRemote availableRemote, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = availableRemote.isAvailable;
        }
        return availableRemote.copy(bool);
    }

    public final Boolean component1() {
        return this.isAvailable;
    }

    public final AvailableRemote copy(Boolean bool) {
        return new AvailableRemote(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AvailableRemote) && Intrinsics.areEqual(this.isAvailable, ((AvailableRemote) obj).isAvailable);
    }

    public int hashCode() {
        Boolean bool = this.isAvailable;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        Boolean bool = this.isAvailable;
        return "AvailableRemote(isAvailable=" + bool + ")";
    }

    public AvailableRemote(Boolean bool) {
        this.isAvailable = bool;
    }

    public /* synthetic */ AvailableRemote(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }

    public final Boolean isAvailable() {
        return this.isAvailable;
    }
}
