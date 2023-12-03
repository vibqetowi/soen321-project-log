package s1;

import android.util.Log;
import androidx.lifecycle.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements androidx.lifecycle.n {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f31131u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f31132v;

    public /* synthetic */ h(int i6, Object obj) {
        this.f31131u = i6;
        this.f31132v = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db A[ORIG_RETURN, RETURN] */
    @Override // androidx.lifecycle.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(androidx.lifecycle.p pVar, j.b bVar) {
        Object obj;
        int i6 = this.f31131u;
        boolean z10 = true;
        Object obj2 = this.f31132v;
        switch (i6) {
            case 0:
                i this$0 = (i) obj2;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.f31151q = bVar.d();
                if (this$0.f31138c != null) {
                    Iterator<f> it = this$0.f31141g.iterator();
                    while (it.hasNext()) {
                        f next = it.next();
                        next.getClass();
                        next.f31117x = bVar.d();
                        next.b();
                    }
                    return;
                }
                return;
            case 1:
                u1.b this$02 = (u1.b) obj2;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                if (bVar == j.b.ON_CREATE) {
                    androidx.fragment.app.n nVar = (androidx.fragment.app.n) pVar;
                    Iterable<f> iterable = (Iterable) this$02.b().f31184e.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        for (f fVar : iterable) {
                            if (kotlin.jvm.internal.i.b(fVar.f31119z, nVar.getTag())) {
                                if (z10) {
                                    nVar.dismiss();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
                    }
                } else if (bVar == j.b.ON_STOP) {
                    androidx.fragment.app.n nVar2 = (androidx.fragment.app.n) pVar;
                    if (!nVar2.requireDialog().isShowing()) {
                        List list = (List) this$02.b().f31184e.getValue();
                        ListIterator listIterator = list.listIterator(list.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                obj = listIterator.previous();
                                if (kotlin.jvm.internal.i.b(((f) obj).f31119z, nVar2.getTag())) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        if (obj != null) {
                            f fVar2 = (f) obj;
                            if (!kotlin.jvm.internal.i.b(is.u.p2(list), fVar2)) {
                                Log.i("DialogFragmentNavigator", "Dialog " + nVar2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                            }
                            this$02.i(fVar2, false);
                            return;
                        }
                        throw new IllegalStateException(("Dialog " + nVar2 + " has already been popped off of the Navigation back stack").toString());
                    }
                    return;
                } else {
                    return;
                }
                break;
            default:
                a2.a this$03 = (a2.a) obj2;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                if (bVar == j.b.ON_START) {
                    this$03.f = true;
                    return;
                } else if (bVar == j.b.ON_STOP) {
                    this$03.f = false;
                    return;
                } else {
                    return;
                }
        }
    }
}
