package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;
/* compiled from: WorkInfo.java */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f3339a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3340b;

    /* renamed from: c  reason: collision with root package name */
    public final d f3341c;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f3342d;

    /* renamed from: e  reason: collision with root package name */
    public final d f3343e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3344g;

    /* compiled from: WorkInfo.java */
    /* loaded from: classes.dex */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean d() {
            if (this != SUCCEEDED && this != FAILED && this != CANCELLED) {
                return false;
            }
            return true;
        }
    }

    public u(UUID uuid, a aVar, d dVar, List<String> list, d dVar2, int i6, int i10) {
        this.f3339a = uuid;
        this.f3340b = aVar;
        this.f3341c = dVar;
        this.f3342d = new HashSet(list);
        this.f3343e = dVar2;
        this.f = i6;
        this.f3344g = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f != uVar.f || this.f3344g != uVar.f3344g || !this.f3339a.equals(uVar.f3339a) || this.f3340b != uVar.f3340b || !this.f3341c.equals(uVar.f3341c) || !this.f3342d.equals(uVar.f3342d)) {
            return false;
        }
        return this.f3343e.equals(uVar.f3343e);
    }

    public final int hashCode() {
        int hashCode = this.f3340b.hashCode();
        int hashCode2 = this.f3341c.hashCode();
        int hashCode3 = this.f3342d.hashCode();
        return ((((this.f3343e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f3339a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.f3344g;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.f3339a + "', mState=" + this.f3340b + ", mOutputData=" + this.f3341c + ", mTags=" + this.f3342d + ", mProgress=" + this.f3343e + '}';
    }
}
