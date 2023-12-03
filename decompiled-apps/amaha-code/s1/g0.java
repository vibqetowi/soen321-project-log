package s1;

import android.os.Bundle;
import fv.e;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import s1.i;
import s1.u;
/* compiled from: Navigator.kt */
/* loaded from: classes.dex */
public abstract class g0<D extends u> {

    /* renamed from: a  reason: collision with root package name */
    public j0 f31128a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f31129b;

    /* compiled from: Navigator.kt */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: Navigator.kt */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface b {
        String value();
    }

    /* compiled from: Navigator.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<b0, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f31130u = new c();

        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(b0 b0Var) {
            b0 navOptions = b0Var;
            kotlin.jvm.internal.i.g(navOptions, "$this$navOptions");
            navOptions.f31087b = true;
            return hs.k.f19476a;
        }
    }

    public abstract D a();

    public final j0 b() {
        j0 j0Var = this.f31128a;
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public void d(List list, a0 a0Var) {
        e.a aVar = new e.a(fv.t.C0(fv.t.G0(is.u.X1(list), new h0(this, a0Var)), fv.r.f15989u));
        while (aVar.hasNext()) {
            b().d((f) aVar.next());
        }
    }

    public void e(i.a aVar) {
        this.f31128a = aVar;
        this.f31129b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(f fVar) {
        u uVar = fVar.f31115v;
        if (!(uVar instanceof u)) {
            uVar = null;
        }
        if (uVar == null) {
            return;
        }
        c(uVar, null, kc.f.P(c.f31130u), null);
        b().b(fVar);
    }

    public Bundle h() {
        return null;
    }

    public void i(f popUpTo, boolean z10) {
        kotlin.jvm.internal.i.g(popUpTo, "popUpTo");
        List list = (List) b().f31184e.getValue();
        if (list.contains(popUpTo)) {
            ListIterator listIterator = list.listIterator(list.size());
            f fVar = null;
            while (j()) {
                fVar = (f) listIterator.previous();
                if (kotlin.jvm.internal.i.b(fVar, popUpTo)) {
                    break;
                }
            }
            if (fVar != null) {
                b().c(fVar, z10);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
    }

    public boolean j() {
        return true;
    }

    public void g(Bundle bundle) {
    }

    public u c(D d10, Bundle bundle, a0 a0Var, a aVar) {
        return d10;
    }
}
