package com.google.firebase.database.core.persistence;

import com.google.firebase.database.core.view.QuerySpec;
/* loaded from: classes.dex */
public final class TrackedQuery {
    public final boolean active;
    public final boolean complete;

    /* renamed from: id  reason: collision with root package name */
    public final long f9601id;
    public final long lastUse;
    public final QuerySpec querySpec;

    public TrackedQuery(long j10, QuerySpec querySpec, long j11, boolean z10, boolean z11) {
        this.f9601id = j10;
        if (querySpec.loadsAllData() && !querySpec.isDefault()) {
            throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
        }
        this.querySpec = querySpec;
        this.lastUse = j11;
        this.complete = z10;
        this.active = z11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != TrackedQuery.class) {
            return false;
        }
        TrackedQuery trackedQuery = (TrackedQuery) obj;
        if (this.f9601id == trackedQuery.f9601id && this.querySpec.equals(trackedQuery.querySpec) && this.lastUse == trackedQuery.lastUse && this.complete == trackedQuery.complete && this.active == trackedQuery.active) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.querySpec.hashCode();
        int hashCode2 = Long.valueOf(this.lastUse).hashCode();
        int hashCode3 = Boolean.valueOf(this.complete).hashCode();
        return Boolean.valueOf(this.active).hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (Long.valueOf(this.f9601id).hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public TrackedQuery setActiveState(boolean z10) {
        return new TrackedQuery(this.f9601id, this.querySpec, this.lastUse, this.complete, z10);
    }

    public TrackedQuery setComplete() {
        return new TrackedQuery(this.f9601id, this.querySpec, this.lastUse, true, this.active);
    }

    public String toString() {
        return "TrackedQuery{id=" + this.f9601id + ", querySpec=" + this.querySpec + ", lastUse=" + this.lastUse + ", complete=" + this.complete + ", active=" + this.active + "}";
    }

    public TrackedQuery updateLastUse(long j10) {
        return new TrackedQuery(this.f9601id, this.querySpec, j10, this.complete, this.active);
    }
}
