package le;

import java.util.HashSet;
import java.util.Set;
/* compiled from: FieldMask.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final d f24211b = new d(new HashSet());

    /* renamed from: a  reason: collision with root package name */
    public final Set<ke.m> f24212a;

    public d(Set<ke.m> set) {
        this.f24212a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f24212a.equals(((d) obj).f24212a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24212a.hashCode();
    }

    public final String toString() {
        return "FieldMask{mask=" + this.f24212a.toString() + "}";
    }
}
