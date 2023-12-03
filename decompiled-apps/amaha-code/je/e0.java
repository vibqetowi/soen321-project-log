package je;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements oe.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21816a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g0 f21817b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ oe.c f21818c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Map f21819d;

    public /* synthetic */ e0(g0 g0Var, oe.c cVar, HashMap hashMap, int i6) {
        this.f21816a = i6;
        this.f21817b = g0Var;
        this.f21818c = cVar;
        this.f21819d = hashMap;
    }

    @Override // oe.d
    public final void accept(Object obj) {
        int i6 = this.f21816a;
        Map<ke.i, le.j> map = this.f21819d;
        oe.c cVar = this.f21818c;
        g0 g0Var = this.f21817b;
        switch (i6) {
            case 0:
                g0Var.h(cVar, map, (Cursor) obj);
                return;
            case 1:
                g0Var.h(cVar, map, (Cursor) obj);
                return;
            default:
                g0Var.h(cVar, map, (Cursor) obj);
                return;
        }
    }
}
