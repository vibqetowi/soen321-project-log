package yt;

import eu.d;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: MemberSignature.kt */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final String f39056a;

    /* compiled from: MemberSignature.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static r a(eu.d dVar) {
            if (dVar instanceof d.b) {
                String name = dVar.c();
                String desc = dVar.b();
                kotlin.jvm.internal.i.g(name, "name");
                kotlin.jvm.internal.i.g(desc, "desc");
                return new r(name.concat(desc));
            } else if (dVar instanceof d.a) {
                String name2 = dVar.c();
                String desc2 = dVar.b();
                kotlin.jvm.internal.i.g(name2, "name");
                kotlin.jvm.internal.i.g(desc2, "desc");
                return new r(name2 + '#' + desc2);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public r(String str) {
        this.f39056a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r) && kotlin.jvm.internal.i.b(this.f39056a, ((r) obj).f39056a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39056a.hashCode();
    }

    public final String toString() {
        return v.g.c(new StringBuilder("MemberSignature(signature="), this.f39056a, ')');
    }
}
