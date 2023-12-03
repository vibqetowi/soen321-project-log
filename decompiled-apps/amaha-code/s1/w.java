package s1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import j$.util.Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import s1.u;
/* compiled from: NavGraph.kt */
/* loaded from: classes.dex */
public final class w extends u implements Iterable<u>, ts.a {
    public static final /* synthetic */ int I = 0;
    public final t.i<u> E;
    public int F;
    public String G;
    public String H;

    /* compiled from: NavGraph.kt */
    /* loaded from: classes.dex */
    public static final class a implements Iterator<u>, ts.a, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public int f31240u = -1;

        /* renamed from: v  reason: collision with root package name */
        public boolean f31241v;

        public a() {
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f31240u + 1 < w.this.E.f()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            if (hasNext()) {
                this.f31241v = true;
                t.i<u> iVar = w.this.E;
                int i6 = this.f31240u + 1;
                this.f31240u = i6;
                u h10 = iVar.h(i6);
                kotlin.jvm.internal.i.f(h10, "nodes.valueAt(++index)");
                return h10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            if (this.f31241v) {
                t.i<u> iVar = w.this.E;
                iVar.h(this.f31240u).f31229v = null;
                int i6 = this.f31240u;
                Object[] objArr = iVar.f32264w;
                Object obj = objArr[i6];
                Object obj2 = t.i.f32261y;
                if (obj != obj2) {
                    objArr[i6] = obj2;
                    iVar.f32262u = true;
                }
                this.f31240u = i6 - 1;
                this.f31241v = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(g0<? extends w> navGraphNavigator) {
        super(navGraphNavigator);
        kotlin.jvm.internal.i.g(navGraphNavigator, "navGraphNavigator");
        this.E = new t.i<>();
    }

    public final u C(String route, boolean z10) {
        w wVar;
        boolean z11;
        kotlin.jvm.internal.i.g(route, "route");
        u uVar = (u) this.E.d("android-app://androidx.navigation/".concat(route).hashCode(), null);
        if (uVar == null) {
            if (!z10 || (wVar = this.f31229v) == null) {
                return null;
            }
            if (gv.n.B0(route)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return null;
            }
            return wVar.C(route, true);
        }
        return uVar;
    }

    @Override // s1.u
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof w)) {
            t.i<u> iVar = this.E;
            ArrayList J0 = fv.t.J0(fv.k.u0(kotlin.jvm.internal.h.l0(iVar)));
            w wVar = (w) obj;
            t.i<u> iVar2 = wVar.E;
            t.j l02 = kotlin.jvm.internal.h.l0(iVar2);
            while (l02.hasNext()) {
                J0.remove((u) l02.next());
            }
            if (super.equals(obj) && iVar.f() == iVar2.f() && this.F == wVar.F && J0.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // s1.u
    public final int hashCode() {
        int i6 = this.F;
        t.i<u> iVar = this.E;
        int f = iVar.f();
        for (int i10 = 0; i10 < f; i10++) {
            if (iVar.f32262u) {
                iVar.c();
            }
            i6 = (((i6 * 31) + iVar.f32263v[i10]) * 31) + iVar.h(i10).hashCode();
        }
        return i6;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<u> iterator() {
        return new a();
    }

    @Override // s1.u
    public final u.b s(s sVar) {
        u.b s10 = super.s(sVar);
        ArrayList arrayList = new ArrayList();
        a aVar = new a();
        while (aVar.hasNext()) {
            u.b s11 = ((u) aVar.next()).s(sVar);
            if (s11 != null) {
                arrayList.add(s11);
            }
        }
        return (u.b) is.u.q2(is.k.R1(new u.b[]{s10, (u.b) is.u.q2(arrayList)}));
    }

    @Override // s1.u
    public final void t(Context context, AttributeSet attributeSet) {
        boolean z10;
        String valueOf;
        kotlin.jvm.internal.i.g(context, "context");
        super.t(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, kc.f.f23222l0);
        kotlin.jvm.internal.i.f(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        int resourceId = obtainAttributes.getResourceId(0, 0);
        if (resourceId != this.B) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.H != null) {
                this.F = 0;
                this.H = null;
            }
            this.F = resourceId;
            this.G = null;
            if (resourceId <= 16777215) {
                valueOf = String.valueOf(resourceId);
            } else {
                try {
                    valueOf = context.getResources().getResourceName(resourceId);
                } catch (Resources.NotFoundException unused) {
                    valueOf = String.valueOf(resourceId);
                }
                kotlin.jvm.internal.i.f(valueOf, "try {\n                co….toString()\n            }");
            }
            this.G = valueOf;
            hs.k kVar = hs.k.f19476a;
            obtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
    }

    @Override // s1.u
    public final String toString() {
        boolean z10;
        u uVar;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        String str = this.H;
        if (str != null && !gv.n.B0(str)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            uVar = C(str, true);
        } else {
            uVar = null;
        }
        if (uVar == null) {
            uVar = z(this.F, true);
        }
        sb2.append(" startDestination=");
        if (uVar == null) {
            String str2 = this.H;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                String str3 = this.G;
                if (str3 != null) {
                    sb2.append(str3);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.F));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(uVar.toString());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "sb.toString()");
        return sb3;
    }

    public final void v(u node) {
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.i.g(node, "node");
        int i6 = node.B;
        String str = node.C;
        boolean z12 = false;
        if (i6 == 0 && str == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            String str2 = this.C;
            if (str2 != null && !(!kotlin.jvm.internal.i.b(str, str2))) {
                throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
            }
            if (i6 != this.B) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                t.i<u> iVar = this.E;
                u uVar = (u) iVar.d(i6, null);
                if (uVar == node) {
                    return;
                }
                if (node.f31229v == null) {
                    z12 = true;
                }
                if (z12) {
                    if (uVar != null) {
                        uVar.f31229v = null;
                    }
                    node.f31229v = this;
                    iVar.e(node.B, node);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
            }
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
    }

    public final u z(int i6, boolean z10) {
        w wVar;
        u uVar = (u) this.E.d(i6, null);
        if (uVar == null) {
            if (!z10 || (wVar = this.f31229v) == null) {
                return null;
            }
            return wVar.z(i6, true);
        }
        return uVar;
    }
}
