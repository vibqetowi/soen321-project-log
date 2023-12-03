package li;

import ad.h;
import ah.e;
import android.content.Context;
import hh.g;
import ih.p;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import mi.d1;
import mi.e1;
import mi.f1;
import mi.g1;
import mi.h1;
import mi.i1;
import mi.j1;
import mi.t1;
import mi.y0;
import qg.g0;
/* compiled from: MoEInAppHelper.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static a f24376b;

    /* renamed from: a  reason: collision with root package name */
    public final String f24377a = "InApp_6.5.0_MoEInAppHelper";

    /* compiled from: MoEInAppHelper.kt */
    /* renamed from: li.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0384a {
        public static a a() {
            a aVar;
            a aVar2 = a.f24376b;
            if (aVar2 == null) {
                synchronized (a.class) {
                    aVar = a.f24376b;
                    if (aVar == null) {
                        aVar = new a();
                    }
                    a.f24376b = aVar;
                }
                return aVar;
            }
            return aVar2;
        }
    }

    /* compiled from: MoEInAppHelper.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" showInApp() : Instance not initialised, cannot process further", a.this.f24377a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[Catch: Exception -> 0x0094, TRY_ENTER, TryCatch #0 {Exception -> 0x0094, blocks: (B:3:0x0011, B:17:0x0046, B:18:0x004f, B:21:0x0068, B:24:0x0073, B:26:0x0077, B:27:0x0082, B:6:0x002e, B:10:0x0037), top: B:32:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[Catch: Exception -> 0x0094, TryCatch #0 {Exception -> 0x0094, blocks: (B:3:0x0011, B:17:0x0046, B:18:0x004f, B:21:0x0068, B:24:0x0073, B:26:0x0077, B:27:0x0082, B:6:0x002e, B:10:0x0037), top: B:32:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, p pVar) {
        boolean z10;
        i1.f25206a.getClass();
        h1 b10 = i1.b(pVar);
        p pVar2 = b10.f25197a;
        i.g(context, "context");
        try {
            g.b(pVar2.f20105d, 0, new d1(b10), 3);
            h hVar = i1.a(pVar2).f35175h;
            String c10 = j1.c();
            int d10 = t1.d(context);
            if (hVar != null) {
                int i6 = hVar.f504a;
                String str = hVar.f505b;
                if ((str != null || i6 != -1) && (!i.b(str, c10) || i6 != d10)) {
                    z10 = false;
                    g gVar = pVar2.f20105d;
                    if (z10) {
                        g.b(gVar, 0, new e1(b10), 3);
                        return;
                    }
                    i1.a(pVar2).f35175h = new h(j1.c(), t1.d(context), 4);
                    if (!j1.f && i1.d(context, pVar2).F()) {
                        if (!b10.f25199c) {
                            g.b(gVar, 0, new f1(b10), 3);
                            b10.f25201e = true;
                            return;
                        }
                        pVar2.f20106e.a(new e("INAPP_SHOW_TASK", true, new y0(context, pVar2, 0)));
                        return;
                    }
                    return;
                }
            }
            z10 = true;
            g gVar2 = pVar2.f20105d;
            if (z10) {
            }
        } catch (Exception e10) {
            pVar2.f20105d.a(1, e10, new g1(b10));
        }
    }

    public final void a(Context context) {
        i.g(context, "context");
        p pVar = g0.f29558c;
        if (pVar == null) {
            hh.a aVar = g.f17610d;
            g.a.b(0, new b(), 3);
            return;
        }
        b(context, pVar);
    }
}
