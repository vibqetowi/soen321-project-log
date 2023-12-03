package u1;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import hs.k;
import is.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import s1.a0;
import s1.f;
import s1.g0;
import s1.u;
/* compiled from: FragmentNavigator.kt */
@g0.b("fragment")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lu1/c;", "Ls1/g0;", "Lu1/c$a;", "a", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class c extends g0<a> {

    /* renamed from: c  reason: collision with root package name */
    public final Context f33755c;

    /* renamed from: d  reason: collision with root package name */
    public final y f33756d;

    /* renamed from: e  reason: collision with root package name */
    public final int f33757e;
    public final LinkedHashSet f = new LinkedHashSet();

    /* compiled from: FragmentNavigator.kt */
    /* loaded from: classes.dex */
    public static class a extends u {
        public String E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g0<? extends a> fragmentNavigator) {
            super(fragmentNavigator);
            i.g(fragmentNavigator, "fragmentNavigator");
        }

        @Override // s1.u
        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a) || !super.equals(obj) || !i.b(this.E, ((a) obj).E)) {
                return false;
            }
            return true;
        }

        @Override // s1.u
        public final int hashCode() {
            int i6;
            int hashCode = super.hashCode() * 31;
            String str = this.E;
            if (str != null) {
                i6 = str.hashCode();
            } else {
                i6 = 0;
            }
            return hashCode + i6;
        }

        @Override // s1.u
        public final void t(Context context, AttributeSet attributeSet) {
            i.g(context, "context");
            super.t(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, b0.c0);
            i.f(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.E = string;
            }
            k kVar = k.f19476a;
            obtainAttributes.recycle();
        }

        @Override // s1.u
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.E;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            String sb3 = sb2.toString();
            i.f(sb3, "sb.toString()");
            return sb3;
        }
    }

    public c(Context context, y yVar, int i6) {
        this.f33755c = context;
        this.f33756d = yVar;
        this.f33757e = i6;
    }

    @Override // s1.g0
    public final a a() {
        return new a(this);
    }

    @Override // s1.g0
    public final void d(List list, a0 a0Var) {
        boolean z10;
        y yVar = this.f33756d;
        if (yVar.T()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            boolean isEmpty = ((List) b().f31184e.getValue()).isEmpty();
            if (a0Var != null && !isEmpty && a0Var.f31071b && this.f.remove(fVar.f31119z)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                yVar.w(new y.p(fVar.f31119z), false);
                b().d(fVar);
            } else {
                androidx.fragment.app.a k10 = k(fVar, a0Var);
                if (!isEmpty) {
                    k10.d(fVar.f31119z);
                }
                k10.j();
                b().d(fVar);
            }
        }
    }

    @Override // s1.g0
    public final void f(f fVar) {
        y yVar = this.f33756d;
        if (yVar.T()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        androidx.fragment.app.a k10 = k(fVar, null);
        if (((List) b().f31184e.getValue()).size() > 1) {
            String str = fVar.f31119z;
            yVar.X(str);
            k10.d(str);
        }
        k10.j();
        b().b(fVar);
    }

    @Override // s1.g0
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f;
            linkedHashSet.clear();
            q.R1(stringArrayList, linkedHashSet);
        }
    }

    @Override // s1.g0
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return ca.a.s(new hs.f("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // s1.g0
    public final void i(f popUpTo, boolean z10) {
        i.g(popUpTo, "popUpTo");
        y yVar = this.f33756d;
        if (yVar.T()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        if (z10) {
            List list = (List) b().f31184e.getValue();
            f fVar = (f) is.u.g2(list);
            for (f fVar2 : is.u.w2(list.subList(list.indexOf(popUpTo), list.size()))) {
                if (i.b(fVar2, fVar)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + fVar2);
                } else {
                    yVar.w(new y.q(fVar2.f31119z), false);
                    this.f.add(fVar2.f31119z);
                }
            }
        } else {
            yVar.X(popUpTo.f31119z);
        }
        b().c(popUpTo, z10);
    }

    public final androidx.fragment.app.a k(f fVar, a0 a0Var) {
        int i6;
        int i10;
        int i11;
        int i12;
        String str = ((a) fVar.f31115v).E;
        if (str != null) {
            int i13 = 0;
            char charAt = str.charAt(0);
            Context context = this.f33755c;
            if (charAt == '.') {
                str = context.getPackageName() + str;
            }
            y yVar = this.f33756d;
            t K = yVar.K();
            context.getClassLoader();
            Fragment a10 = K.a(str);
            i.f(a10, "fragmentManager.fragment…t.classLoader, className)");
            a10.setArguments(fVar.f31116w);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
            if (a0Var != null) {
                i6 = a0Var.f;
            } else {
                i6 = -1;
            }
            if (a0Var != null) {
                i10 = a0Var.f31075g;
            } else {
                i10 = -1;
            }
            if (a0Var != null) {
                i11 = a0Var.f31076h;
            } else {
                i11 = -1;
            }
            if (a0Var != null) {
                i12 = a0Var.f31077i;
            } else {
                i12 = -1;
            }
            if (i6 != -1 || i10 != -1 || i11 != -1 || i12 != -1) {
                if (i6 == -1) {
                    i6 = 0;
                }
                if (i10 == -1) {
                    i10 = 0;
                }
                if (i11 == -1) {
                    i11 = 0;
                }
                if (i12 != -1) {
                    i13 = i12;
                }
                aVar.h(i6, i10, i11, i13);
            }
            aVar.f(this.f33757e, a10, null);
            aVar.q(a10);
            aVar.f2205p = true;
            return aVar;
        }
        throw new IllegalStateException("Fragment class was not set".toString());
    }
}
