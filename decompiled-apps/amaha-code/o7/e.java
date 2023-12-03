package o7;

import android.content.Context;
import b9.k;
import com.google.common.collect.l0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements nc.m {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f27195u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Context f27196v;

    public /* synthetic */ e(Context context, int i6) {
        this.f27195u = i6;
        this.f27196v = context;
    }

    @Override // nc.m
    public final Object get() {
        b9.k kVar;
        switch (this.f27195u) {
            case 0:
                return new d(this.f27196v);
            case 1:
                return new com.google.android.exoplayer2.source.d(this.f27196v, new u7.f());
            case 2:
                return new z8.c(this.f27196v);
            case 3:
                Context context = this.f27196v;
                l0 l0Var = b9.k.f4144n;
                synchronized (b9.k.class) {
                    if (b9.k.f4149t == null) {
                        k.a aVar = new k.a(context);
                        b9.k.f4149t = new b9.k(aVar.f4162a, aVar.f4163b, aVar.f4164c, aVar.f4165d, aVar.f4166e);
                    }
                    kVar = b9.k.f4149t;
                }
                return kVar;
            default:
                return new com.google.android.exoplayer2.source.d(this.f27196v, new u7.f());
        }
    }
}
