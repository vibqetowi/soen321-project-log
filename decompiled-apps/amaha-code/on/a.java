package on;

import e4.l;
import kotlin.jvm.internal.i;
import org.json.JSONObject;
import ss.q;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements l.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f27684u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ q f27685v;

    public /* synthetic */ a(q qVar, int i6) {
        this.f27684u = i6;
        this.f27685v = qVar;
    }

    @Override // e4.l.b
    public final void a(Object obj) {
        int i6 = this.f27684u;
        q onLoad = this.f27685v;
        switch (i6) {
            case 0:
                i.g(onLoad, "$onLoad");
                onLoad.invoke(Boolean.TRUE, (JSONObject) obj, null);
                return;
            default:
                i.g(onLoad, "$onLoad");
                onLoad.invoke(Boolean.TRUE, (JSONObject) obj, null);
                return;
        }
    }
}
