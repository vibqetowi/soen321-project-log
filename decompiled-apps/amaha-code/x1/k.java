package x1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import x1.f;
import x1.g;
import x1.h;
/* compiled from: MultiInstanceInvalidationClient.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final String f37500a;

    /* renamed from: b  reason: collision with root package name */
    public final h f37501b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f37502c;

    /* renamed from: d  reason: collision with root package name */
    public int f37503d;

    /* renamed from: e  reason: collision with root package name */
    public h.c f37504e;
    public g f;

    /* renamed from: g  reason: collision with root package name */
    public final b f37505g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f37506h;

    /* renamed from: i  reason: collision with root package name */
    public final j f37507i;

    /* renamed from: j  reason: collision with root package name */
    public final j f37508j;

    /* compiled from: MultiInstanceInvalidationClient.kt */
    /* loaded from: classes.dex */
    public static final class a extends h.c {
        public a(String[] strArr) {
            super(strArr);
        }

        @Override // x1.h.c
        public final void a(Set<String> tables) {
            kotlin.jvm.internal.i.g(tables, "tables");
            k kVar = k.this;
            if (kVar.f37506h.get()) {
                return;
            }
            try {
                g gVar = kVar.f;
                if (gVar != null) {
                    int i6 = kVar.f37503d;
                    Object[] array = tables.toArray(new String[0]);
                    kotlin.jvm.internal.i.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    gVar.o1((String[]) array, i6);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.kt */
    /* loaded from: classes.dex */
    public static final class b extends f.a {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int f37510b = 0;

        public b() {
        }

        @Override // x1.f
        public final void c0(String[] tables) {
            kotlin.jvm.internal.i.g(tables, "tables");
            k kVar = k.this;
            kVar.f37502c.execute(new g.v(kVar, 5, tables));
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.kt */
    /* loaded from: classes.dex */
    public static final class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName name, IBinder service) {
            g c0630a;
            kotlin.jvm.internal.i.g(name, "name");
            kotlin.jvm.internal.i.g(service, "service");
            int i6 = g.a.f37470a;
            IInterface queryLocalInterface = service.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof g)) {
                c0630a = (g) queryLocalInterface;
            } else {
                c0630a = new g.a.C0630a(service);
            }
            k kVar = k.this;
            kVar.f = c0630a;
            kVar.f37502c.execute(kVar.f37507i);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName name) {
            kotlin.jvm.internal.i.g(name, "name");
            k kVar = k.this;
            kVar.f37502c.execute(kVar.f37508j);
            kVar.f = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x1.j] */
    /* JADX WARN: Type inference failed for: r0v1, types: [x1.j] */
    public k(Context context, String str, Intent intent, h hVar, Executor executor) {
        this.f37500a = str;
        this.f37501b = hVar;
        this.f37502c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f37505g = new b();
        this.f37506h = new AtomicBoolean(false);
        c cVar = new c();
        this.f37507i = new Runnable(this) { // from class: x1.j

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ k f37499v;

            {
                this.f37499v = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = r2;
                k this$0 = this.f37499v;
                switch (i6) {
                    case 0:
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            g gVar = this$0.f;
                            if (gVar != null) {
                                this$0.f37503d = gVar.N1(this$0.f37505g, this$0.f37500a);
                                h hVar2 = this$0.f37501b;
                                h.c cVar2 = this$0.f37504e;
                                if (cVar2 != null) {
                                    hVar2.a(cVar2);
                                    return;
                                } else {
                                    kotlin.jvm.internal.i.q("observer");
                                    throw null;
                                }
                            }
                            return;
                        } catch (RemoteException e10) {
                            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
                            return;
                        }
                    default:
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        h.c cVar3 = this$0.f37504e;
                        if (cVar3 != null) {
                            this$0.f37501b.c(cVar3);
                            return;
                        } else {
                            kotlin.jvm.internal.i.q("observer");
                            throw null;
                        }
                }
            }
        };
        this.f37508j = new Runnable(this) { // from class: x1.j

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ k f37499v;

            {
                this.f37499v = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = r2;
                k this$0 = this.f37499v;
                switch (i6) {
                    case 0:
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            g gVar = this$0.f;
                            if (gVar != null) {
                                this$0.f37503d = gVar.N1(this$0.f37505g, this$0.f37500a);
                                h hVar2 = this$0.f37501b;
                                h.c cVar2 = this$0.f37504e;
                                if (cVar2 != null) {
                                    hVar2.a(cVar2);
                                    return;
                                } else {
                                    kotlin.jvm.internal.i.q("observer");
                                    throw null;
                                }
                            }
                            return;
                        } catch (RemoteException e10) {
                            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
                            return;
                        }
                    default:
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        h.c cVar3 = this$0.f37504e;
                        if (cVar3 != null) {
                            this$0.f37501b.c(cVar3);
                            return;
                        } else {
                            kotlin.jvm.internal.i.q("observer");
                            throw null;
                        }
                }
            }
        };
        Object[] array = hVar.f37476d.keySet().toArray(new String[0]);
        kotlin.jvm.internal.i.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f37504e = new a((String[]) array);
        applicationContext.bindService(intent, cVar, 1);
    }
}
