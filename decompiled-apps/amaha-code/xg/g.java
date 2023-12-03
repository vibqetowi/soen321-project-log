package xg;

import android.content.Context;
import ih.p;
import qg.w;
import sg.k;
/* compiled from: EventHandler.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final p f37768a;

    /* renamed from: b  reason: collision with root package name */
    public int f37769b;

    /* renamed from: c  reason: collision with root package name */
    public final String f37770c;

    public g(p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f37768a = sdkInstance;
        this.f37770c = "Core_EventHandler";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:7|(1:10)|11|12|13|(1:15)(3:22|23|(1:25)(2:26|(1:28)(5:29|30|(5:32|(1:34)(1:41)|35|(1:37)(1:40)|(1:39))|42|(1:44)(2:45|(1:47)(3:48|(1:50)(1:57)|(1:52)(2:53|(1:55)(1:56)))))))|16|(1:21)(2:18|19)))|60|(1:10)|11|12|13|(0)(0)|16|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f2, code lost:
        r4.f20105d.a(1, r0, new sg.l(r2));
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[Catch: Exception -> 0x00f1, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f1, blocks: (B:15:0x0039, B:18:0x004c, B:21:0x0052, B:22:0x005c, B:24:0x0066, B:25:0x0070, B:28:0x0077, B:32:0x0080, B:37:0x0097, B:31:0x007e, B:38:0x00a3, B:40:0x00a7, B:41:0x00b0, B:43:0x00b4, B:44:0x00c0, B:49:0x00d9, B:50:0x00e5, B:53:0x00ee), top: B:62:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, ih.i iVar) {
        boolean z10;
        Context context2;
        p pVar;
        yh.a aVar;
        boolean z11;
        long j10;
        boolean z12;
        ch.a aVar2 = ch.c.f5286a;
        p sdkInstance = this.f37768a;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        ch.a aVar3 = ch.c.f5286a;
        if (aVar3 != null) {
            th.a aVar4 = sdkInstance.f20104c;
            if (aVar4.f33011b.f25749u && aVar4.f33010a) {
                z10 = true;
                if (z10 && aVar3 != null) {
                    aVar3.c(context, iVar, sdkInstance);
                }
                w.f29578a.getClass();
                sg.a a10 = w.a(context, sdkInstance);
                context2 = a10.f31519a;
                pVar = a10.f31520b;
                hh.g.b(pVar.f20105d, 0, new sg.e(a10, iVar), 3);
                if (!di.b.u(context2, pVar)) {
                    boolean z13 = iVar.f20092e;
                    hh.g gVar = pVar.f20105d;
                    if (!z13) {
                        hh.g.b(gVar, 0, new sg.f(a10), 3);
                    } else if (kotlin.jvm.internal.i.b("EVENT_ACTION_USER_ATTRIBUTE", iVar.f20088a)) {
                        hh.g.b(gVar, 0, new sg.g(a10), 3);
                    } else {
                        boolean z14 = a10.f31523e;
                        kotlin.jvm.internal.h hVar = a10.f31522d;
                        if (!z14) {
                            jh.b bVar = a10.f31524g;
                            if (bVar == null) {
                                j10 = 0;
                            } else {
                                j10 = bVar.f22033d;
                            }
                            long j11 = pVar.f20104c.f33013d.f15848a;
                            long currentTimeMillis = System.currentTimeMillis();
                            hVar.getClass();
                            if (j10 + j11 < currentTimeMillis) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                hh.g.b(gVar, 0, new sg.h(a10), 3);
                                a10.a(context2, null);
                            }
                        }
                        if (hc.d.A) {
                            hh.g.b(gVar, 0, new sg.i(a10), 3);
                        } else {
                            jh.b bVar2 = a10.f31524g;
                            if (bVar2 == null) {
                                hh.g.b(gVar, 0, new sg.j(a10), 3);
                                a10.a(context2, null);
                            } else {
                                long j12 = bVar2.f22033d;
                                long j13 = pVar.f20104c.f33013d.f15848a;
                                long currentTimeMillis2 = System.currentTimeMillis();
                                hVar.getClass();
                                if (j12 + j13 < currentTimeMillis2) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    hh.g.b(gVar, 0, new k(a10), 3);
                                    a10.a(context2, null);
                                } else {
                                    long currentTimeMillis3 = System.currentTimeMillis();
                                    jh.b bVar3 = a10.f31524g;
                                    if (bVar3 != null) {
                                        bVar3.f22033d = currentTimeMillis3;
                                    }
                                }
                            }
                        }
                    }
                }
                aVar = yh.c.f38625a;
                if (aVar == null) {
                    aVar.d();
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (z10) {
            aVar3.c(context, iVar, sdkInstance);
        }
        w.f29578a.getClass();
        sg.a a102 = w.a(context, sdkInstance);
        context2 = a102.f31519a;
        pVar = a102.f31520b;
        hh.g.b(pVar.f20105d, 0, new sg.e(a102, iVar), 3);
        if (!di.b.u(context2, pVar)) {
        }
        aVar = yh.c.f38625a;
        if (aVar == null) {
        }
    }
}
