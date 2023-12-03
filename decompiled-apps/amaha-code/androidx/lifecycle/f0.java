package androidx.lifecycle;

import a2.a;
import android.os.Bundle;
import java.util.Map;
/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class f0 implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final a2.a f2404a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2405b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f2406c;

    /* renamed from: d  reason: collision with root package name */
    public final hs.i f2407d;

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<g0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ r0 f2408u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r0 r0Var) {
            super(0);
            this.f2408u = r0Var;
        }

        @Override // ss.a
        public final g0 invoke() {
            return e0.c(this.f2408u);
        }
    }

    public f0(a2.a savedStateRegistry, r0 viewModelStoreOwner) {
        kotlin.jvm.internal.i.g(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.i.g(viewModelStoreOwner, "viewModelStoreOwner");
        this.f2404a = savedStateRegistry;
        this.f2407d = sp.b.O(new a(viewModelStoreOwner));
    }

    @Override // a2.a.b
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2406c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((g0) this.f2407d.getValue()).f2409x.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a10 = ((d0) entry.getValue()).f2399e.a();
            if (!kotlin.jvm.internal.i.b(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f2405b = false;
        return bundle;
    }
}
