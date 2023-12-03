package hr;

import com.theinnerhour.b2b.utils.AudioHelper;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p9 implements androidx.lifecycle.x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18979a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ss.l f18980b;

    public /* synthetic */ p9(int i6, ss.l lVar) {
        this.f18979a = i6;
        this.f18980b = lVar;
    }

    @Override // androidx.lifecycle.x
    public final void a(Object obj) {
        int i6 = this.f18979a;
        ss.l tmp0 = this.f18980b;
        switch (i6) {
            case 0:
                int i10 = q9.f19040z;
                kotlin.jvm.internal.i.g(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 1:
                int i11 = q9.f19040z;
                kotlin.jvm.internal.i.g(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 2:
                int i12 = aa.A;
                kotlin.jvm.internal.i.g(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 3:
                kotlin.jvm.internal.i.g(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 4:
                kotlin.jvm.internal.i.g(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            default:
                AudioHelper.a(tmp0, (androidx.work.u) obj);
                return;
        }
    }
}
