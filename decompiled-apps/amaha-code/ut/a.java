package ut;

import gt.v0;
import is.h0;
import java.util.Set;
import kotlin.jvm.internal.i;
import v.h;
import wu.i0;
import wu.u;
/* compiled from: JavaTypeAttributes.kt */
/* loaded from: classes2.dex */
public final class a extends u {

    /* renamed from: a  reason: collision with root package name */
    public final int f34507a;

    /* renamed from: b  reason: collision with root package name */
    public final int f34508b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f34509c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f34510d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<v0> f34511e;
    public final i0 f;

    public /* synthetic */ a(int i6, boolean z10, boolean z11, Set set, int i10) {
        this(i6, (i10 & 2) != 0 ? 1 : 0, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : set, null);
    }

    public static a e(a aVar, int i6, boolean z10, Set set, i0 i0Var, int i10) {
        int i11;
        boolean z11;
        if ((i10 & 1) != 0) {
            i11 = aVar.f34507a;
        } else {
            i11 = 0;
        }
        if ((i10 & 2) != 0) {
            i6 = aVar.f34508b;
        }
        int i12 = i6;
        if ((i10 & 4) != 0) {
            z10 = aVar.f34509c;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = aVar.f34510d;
        } else {
            z11 = false;
        }
        if ((i10 & 16) != 0) {
            set = aVar.f34511e;
        }
        Set set2 = set;
        if ((i10 & 32) != 0) {
            i0Var = aVar.f;
        }
        aVar.getClass();
        defpackage.d.j(i11, "howThisTypeIsUsed");
        defpackage.d.j(i12, "flexibility");
        return new a(i11, i12, z12, z11, set2, i0Var);
    }

    @Override // wu.u
    public final i0 a() {
        return this.f;
    }

    @Override // wu.u
    public final int b() {
        return this.f34507a;
    }

    @Override // wu.u
    public final Set<v0> c() {
        return this.f34511e;
    }

    @Override // wu.u
    public final u d(v0 v0Var) {
        Set l12;
        Set<v0> set = this.f34511e;
        if (set != null) {
            l12 = h0.H1(set, v0Var);
        } else {
            l12 = ca.a.l1(v0Var);
        }
        return e(this, 0, false, l12, null, 47);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!i.b(aVar.f, this.f) || aVar.f34507a != this.f34507a || aVar.f34508b != this.f34508b || aVar.f34509c != this.f34509c || aVar.f34510d != this.f34510d) {
            return false;
        }
        return true;
    }

    public final a f(int i6) {
        defpackage.d.j(i6, "flexibility");
        return e(this, i6, false, null, null, 61);
    }

    @Override // wu.u
    public final int hashCode() {
        int i6;
        i0 i0Var = this.f;
        if (i0Var != null) {
            i6 = i0Var.hashCode();
        } else {
            i6 = 0;
        }
        int d10 = h.d(this.f34507a) + (i6 * 31) + i6;
        int d11 = h.d(this.f34508b) + (d10 * 31) + d10;
        int i10 = (d11 * 31) + (this.f34509c ? 1 : 0) + d11;
        return (i10 * 31) + (this.f34510d ? 1 : 0) + i10;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + ri.e.k(this.f34507a) + ", flexibility=" + pl.a.l(this.f34508b) + ", isRaw=" + this.f34509c + ", isForAnnotationParameter=" + this.f34510d + ", visitedTypeParameters=" + this.f34511e + ", defaultType=" + this.f + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;Ljava/lang/Object;ZZLjava/util/Set<+Lgt/v0;>;Lwu/i0;)V */
    public a(int i6, int i10, boolean z10, boolean z11, Set set, i0 i0Var) {
        super(i6, set, i0Var);
        defpackage.d.j(i6, "howThisTypeIsUsed");
        defpackage.d.j(i10, "flexibility");
        this.f34507a = i6;
        this.f34508b = i10;
        this.f34509c = z10;
        this.f34510d = z11;
        this.f34511e = set;
        this.f = i0Var;
    }
}
