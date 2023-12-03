package u1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c0;
import androidx.fragment.app.n;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import androidx.lifecycle.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import s1.a0;
import s1.f;
import s1.g0;
import s1.h;
import s1.i;
import s1.u;
/* compiled from: DialogFragmentNavigator.kt */
@g0.b("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lu1/b;", "Ls1/g0;", "Lu1/b$a;", "a", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b extends g0<a> {

    /* renamed from: c  reason: collision with root package name */
    public final Context f33752c;

    /* renamed from: d  reason: collision with root package name */
    public final y f33753d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet f33754e = new LinkedHashSet();
    public final h f = new h(1, this);

    /* compiled from: DialogFragmentNavigator.kt */
    /* loaded from: classes.dex */
    public static class a extends u implements s1.c {
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
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, b0.f23447b0);
            i.f(obtainAttributes, "context.resources.obtain…ntNavigator\n            )");
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.E = string;
            }
            obtainAttributes.recycle();
        }
    }

    public b(Context context, y yVar) {
        this.f33752c = context;
        this.f33753d = yVar;
    }

    @Override // s1.g0
    public final a a() {
        return new a(this);
    }

    @Override // s1.g0
    public final void d(List list, a0 a0Var) {
        y yVar = this.f33753d;
        if (yVar.T()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            a aVar = (a) fVar.f31115v;
            String str = aVar.E;
            if (str != null) {
                char charAt = str.charAt(0);
                Context context = this.f33752c;
                if (charAt == '.') {
                    str = context.getPackageName() + str;
                }
                t K = yVar.K();
                context.getClassLoader();
                Fragment a10 = K.a(str);
                i.f(a10, "fragmentManager.fragment…ader, className\n        )");
                if (n.class.isAssignableFrom(a10.getClass())) {
                    n nVar = (n) a10;
                    nVar.setArguments(fVar.f31116w);
                    nVar.getLifecycle().a(this.f);
                    nVar.show(yVar, fVar.f31119z);
                    b().d(fVar);
                } else {
                    StringBuilder sb2 = new StringBuilder("Dialog destination ");
                    String str2 = aVar.E;
                    if (str2 != null) {
                        throw new IllegalArgumentException(r1.b0.b(sb2, str2, " is not an instance of DialogFragment").toString());
                    }
                    throw new IllegalStateException("DialogFragment class was not set".toString());
                }
            } else {
                throw new IllegalStateException("DialogFragment class was not set".toString());
            }
        }
    }

    @Override // s1.g0
    public final void e(i.a aVar) {
        j lifecycle;
        super.e(aVar);
        Iterator it = ((List) aVar.f31184e.getValue()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            y yVar = this.f33753d;
            if (hasNext) {
                f fVar = (f) it.next();
                n nVar = (n) yVar.F(fVar.f31119z);
                if (nVar != null && (lifecycle = nVar.getLifecycle()) != null) {
                    lifecycle.a(this.f);
                } else {
                    this.f33754e.add(fVar.f31119z);
                }
            } else {
                yVar.f2318o.add(new c0() { // from class: u1.a
                    @Override // androidx.fragment.app.c0
                    public final void a(y yVar2, Fragment childFragment) {
                        b this$0 = b.this;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        kotlin.jvm.internal.i.g(childFragment, "childFragment");
                        LinkedHashSet linkedHashSet = this$0.f33754e;
                        String tag = childFragment.getTag();
                        kotlin.jvm.internal.c0.a(linkedHashSet);
                        if (linkedHashSet.remove(tag)) {
                            childFragment.getLifecycle().a(this$0.f);
                        }
                    }
                });
                return;
            }
        }
    }

    @Override // s1.g0
    public final void i(f popUpTo, boolean z10) {
        kotlin.jvm.internal.i.g(popUpTo, "popUpTo");
        y yVar = this.f33753d;
        if (yVar.T()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().f31184e.getValue();
        for (f fVar : is.u.w2(list.subList(list.indexOf(popUpTo), list.size()))) {
            Fragment F = yVar.F(fVar.f31119z);
            if (F != null) {
                F.getLifecycle().c(this.f);
                ((n) F).dismiss();
            }
        }
        b().c(popUpTo, z10);
    }
}
