package ii;

import android.content.Context;
import fj.e;
import hh.g;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: MoEFireBaseHelper.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static a f20110b;

    /* renamed from: a  reason: collision with root package name */
    public final String f20111a = "FCM_6.2.0_MoEFireBaseHelper";

    /* compiled from: MoEFireBaseHelper.kt */
    /* renamed from: ii.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0302a extends k implements ss.a<String> {
        public C0302a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" passPushPayload() : ", a.this.f20111a);
        }
    }

    public final void a(Context context, Map<String, String> map) {
        e eVar;
        try {
            e eVar2 = e.f15075b;
            if (eVar2 == null) {
                synchronized (e.class) {
                    eVar = e.f15075b;
                    if (eVar == null) {
                        eVar = new e();
                    }
                    e.f15075b = eVar;
                }
                eVar2 = eVar;
            }
            eVar2.f(context, map);
        } catch (Exception e10) {
            hh.a aVar = g.f17610d;
            g.a.a(1, e10, new C0302a());
        }
    }
}
