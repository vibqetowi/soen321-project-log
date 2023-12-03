package ug;

import android.content.Context;
import org.json.JSONObject;
import qg.w;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f34098u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ b f34099v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Context f34100w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ih.a f34101x;

    public /* synthetic */ a(b bVar, Context context, ih.a aVar, int i6) {
        this.f34098u = i6;
        this.f34099v = bVar;
        this.f34100w = context;
        this.f34101x = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062 A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:6:0x0028, B:9:0x003a, B:12:0x0041, B:14:0x0045, B:16:0x0049, B:18:0x004d, B:20:0x0051, B:22:0x0055, B:31:0x0062, B:43:0x0097, B:44:0x00a0, B:34:0x007d, B:36:0x0085), top: B:96:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097 A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #1 {all -> 0x005c, blocks: (B:6:0x0028, B:9:0x003a, B:12:0x0041, B:14:0x0045, B:16:0x0049, B:18:0x004d, B:20:0x0051, B:22:0x0055, B:31:0x0062, B:43:0x0097, B:44:0x00a0, B:34:0x007d, B:36:0x0085), top: B:96:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #1 {all -> 0x005c, blocks: (B:6:0x0028, B:9:0x003a, B:12:0x0041, B:14:0x0045, B:16:0x0049, B:18:0x004d, B:20:0x0051, B:22:0x0055, B:31:0x0062, B:43:0x0097, B:44:0x00a0, B:34:0x007d, B:36:0x0085), top: B:96:0x0028 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        int i6 = this.f34098u;
        ih.a attribute = this.f34101x;
        Context context = this.f34100w;
        b this$0 = this.f34099v;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(context, "$context");
                kotlin.jvm.internal.i.g(attribute, "$attribute");
                Object obj = attribute.f20047b;
                zg.j jVar = new zg.j(this$0.f34102a);
                ih.p pVar = jVar.f39383a;
                try {
                    hh.g.b(pVar.f20105d, 0, new zg.c(jVar, attribute), 3);
                    if (l.e(context, pVar)) {
                        z12 = ((obj instanceof String) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double)) ? true : true;
                        hh.g gVar = pVar.f20105d;
                        if (!z12) {
                            hh.g.b(gVar, 2, new zg.d(jVar), 2);
                            return;
                        }
                        mh.a aVar = new mh.a(System.currentTimeMillis(), attribute.f20046a, obj.toString(), defpackage.b.y(zg.j.a(obj)));
                        w.f29578a.getClass();
                        uh.b f = w.f(context, pVar);
                        String g02 = f.g0();
                        if (g02 == null) {
                            jVar.c(context, attribute);
                            return;
                        } else if (kotlin.jvm.internal.i.b(g02, aVar.f25054b)) {
                            hh.g.b(gVar, 2, new zg.e(jVar), 2);
                            return;
                        } else {
                            if (!new kotlin.jvm.internal.h().M(aVar.f25054b, pVar.f20104c.f33012c.f28432h)) {
                                hh.g.b(gVar, 2, new zg.f(jVar, aVar), 2);
                                return;
                            }
                            f.f34156b.b0(aVar);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(attribute.f20046a, obj);
                            jSONObject.put("USER_ID_MODIFIED_FROM", g02);
                            l.f(context, new ih.i(jSONObject, "EVENT_ACTION_USER_ATTRIBUTE"), pVar);
                            return;
                        }
                    }
                    return;
                } catch (Exception e10) {
                    pVar.f20105d.a(1, e10, new zg.g(jVar));
                    return;
                }
            case 1:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(context, "$context");
                kotlin.jvm.internal.i.g(attribute, "$attribute");
                new zg.j(this$0.f34102a).c(context, attribute);
                return;
            case 2:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(context, "$context");
                kotlin.jvm.internal.i.g(attribute, "$attribute");
                wg.e eVar = this$0.f34105d;
                ih.p pVar2 = eVar.f36695a;
                String str = attribute.f20046a;
                Object obj2 = attribute.f20047b;
                try {
                    hh.g.b(pVar2.f20105d, 0, new wg.a(eVar, attribute), 3);
                    if (l.e(context, pVar2) && attribute.f20048c == 4) {
                        if (!(obj2 instanceof String) && !(obj2 instanceof Integer) && !(obj2 instanceof Long) && !(obj2 instanceof Double) && !(obj2 instanceof Float) && !(obj2 instanceof Boolean)) {
                            z10 = false;
                            if (!z10) {
                                ih.e eVar2 = new ih.e(str, obj2.toString(), 0);
                                String str2 = eVar2.f20078b;
                                w.f29578a.getClass();
                                uh.b f2 = w.f(context, pVar2);
                                ih.e B = f2.B(str2);
                                if (B != null && kotlin.jvm.internal.i.b(str2, B.f20078b) && kotlin.jvm.internal.i.b(eVar2.f20079c, B.f20079c)) {
                                    z11 = false;
                                    hh.g gVar2 = pVar2.f20105d;
                                    if (z11) {
                                        hh.g.b(gVar2, 0, new wg.b(eVar), 3);
                                        return;
                                    }
                                    hh.g.b(gVar2, 0, new wg.c(eVar), 3);
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put(str, obj2);
                                    l.f(context, new ih.i(jSONObject2, "EVENT_ACTION_DEVICE_ATTRIBUTE"), pVar2);
                                    f2.f34156b.X(eVar2);
                                    return;
                                }
                                z11 = true;
                                hh.g gVar22 = pVar2.f20105d;
                                if (z11) {
                                }
                            } else {
                                return;
                            }
                        }
                        z10 = true;
                        if (!z10) {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    pVar2.f20105d.a(1, th2, new wg.d(eVar));
                    return;
                }
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(context, "$context");
                kotlin.jvm.internal.i.g(attribute, "$attribute");
                zg.j jVar2 = new zg.j(this$0.f34102a);
                Object obj3 = attribute.f20047b;
                if (!(((obj3 instanceof String) || (obj3 instanceof Integer) || (obj3 instanceof Long) || (obj3 instanceof Double)) ? true : true)) {
                    hh.g.b(jVar2.f39383a.f20105d, 2, new zg.h(jVar2), 2);
                    return;
                } else {
                    jVar2.c(context, attribute);
                    return;
                }
        }
    }
}
