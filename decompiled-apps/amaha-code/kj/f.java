package kj;

import android.content.Context;
import android.os.Bundle;
import hh.g;
import kotlin.jvm.internal.k;
import n2.o;
/* compiled from: PermissionHandler.kt */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: PermissionHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f23368u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "PushBase_6.6.0_PermissionHandler onPermissionDenied() : ";
        }
    }

    /* compiled from: PermissionHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f23369u = new b();

        public b() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "PushBase_6.6.0_PermissionHandler onPermissionDenied() : ";
        }
    }

    /* compiled from: PermissionHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f23370u = new c();

        public c() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "PushBase_6.6.0_PermissionHandler onPermissionGranted() : ";
        }
    }

    /* compiled from: PermissionHandler.kt */
    /* loaded from: classes.dex */
    public static final class d extends k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final d f23371u = new d();

        public d() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "PushBase_6.6.0_PermissionHandler onPermissionGranted() : ";
        }
    }

    public static final void a(Context context, Bundle bundle) {
        kotlin.jvm.internal.i.g(context, "context");
        try {
            hh.a aVar = hh.g.f17610d;
            g.a.b(0, a.f23368u, 3);
            bh.b.a().submit(new o(context, false, bundle, 3));
        } catch (Throwable th2) {
            hh.a aVar2 = hh.g.f17610d;
            g.a.a(1, th2, b.f23369u);
        }
    }

    public static final void b(Context context, Bundle bundle) {
        fj.e eVar;
        kotlin.jvm.internal.i.g(context, "context");
        try {
            hh.a aVar = hh.g.f17610d;
            g.a.b(0, c.f23370u, 3);
            bh.b.a().submit(new o(context, true, bundle, 3));
            fj.e eVar2 = fj.e.f15075b;
            if (eVar2 == null) {
                synchronized (fj.e.class) {
                    eVar = fj.e.f15075b;
                    if (eVar == null) {
                        eVar = new fj.e();
                    }
                    fj.e.f15075b = eVar;
                }
                eVar2 = eVar;
            }
            eVar2.b(context);
        } catch (Throwable th2) {
            hh.a aVar2 = hh.g.f17610d;
            g.a.a(1, th2, d.f23371u);
        }
    }
}
