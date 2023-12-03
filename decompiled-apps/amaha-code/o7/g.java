package o7;

import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.source.d;
import com.google.android.exoplayer2.source.n;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements nc.m {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f27197u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f27198v;

    public /* synthetic */ g(int i6, Object obj) {
        this.f27197u = i6;
        this.f27198v = obj;
    }

    @Override // nc.m
    public final Object get() {
        int i6 = this.f27197u;
        Object obj = this.f27198v;
        switch (i6) {
            case 0:
                return (w) obj;
            case 1:
                c9.s sVar = ((j.b) obj).f6517b;
                sVar.getClass();
                return new p7.n(sVar);
            case 2:
                return Boolean.valueOf(((com.google.android.exoplayer2.m) obj).T);
            case 3:
                try {
                    return (o8.i) ((Class) obj).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
            default:
                d.a aVar = (d.a) obj;
                return new n.b(aVar.f6862a, aVar.f6863b);
        }
    }
}
