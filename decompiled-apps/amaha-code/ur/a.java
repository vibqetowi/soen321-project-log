package ur;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import io.grpc.e;
import io.grpc.k;
import ne.o;
import tr.b0;
import tr.d0;
import tr.j;
/* compiled from: AndroidChannelBuilder.java */
/* loaded from: classes2.dex */
public final class a extends e<a> {

    /* renamed from: a  reason: collision with root package name */
    public final k<?> f34493a;

    /* renamed from: b  reason: collision with root package name */
    public Context f34494b;

    /* compiled from: AndroidChannelBuilder.java */
    /* renamed from: ur.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0582a extends b0 {

        /* renamed from: b  reason: collision with root package name */
        public final b0 f34495b;

        /* renamed from: c  reason: collision with root package name */
        public final Context f34496c;

        /* renamed from: d  reason: collision with root package name */
        public final ConnectivityManager f34497d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f34498e = new Object();
        public Runnable f;

        /* compiled from: AndroidChannelBuilder.java */
        /* renamed from: ur.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0583a implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ c f34499u;

            public RunnableC0583a(c cVar) {
                this.f34499u = cVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0582a.this.f34497d.unregisterNetworkCallback(this.f34499u);
            }
        }

        /* compiled from: AndroidChannelBuilder.java */
        /* renamed from: ur.a$a$b */
        /* loaded from: classes2.dex */
        public class b implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ d f34501u;

            public b(d dVar) {
                this.f34501u = dVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0582a.this.f34496c.unregisterReceiver(this.f34501u);
            }
        }

        /* compiled from: AndroidChannelBuilder.java */
        /* renamed from: ur.a$a$c */
        /* loaded from: classes2.dex */
        public class c extends ConnectivityManager.NetworkCallback {
            public c() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                C0582a.this.f34495b.D();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onBlockedStatusChanged(Network network, boolean z10) {
                if (!z10) {
                    C0582a.this.f34495b.D();
                }
            }
        }

        /* compiled from: AndroidChannelBuilder.java */
        /* renamed from: ur.a$a$d */
        /* loaded from: classes2.dex */
        public class d extends BroadcastReceiver {

            /* renamed from: a  reason: collision with root package name */
            public boolean f34504a = false;

            public d() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                boolean z10;
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z11 = this.f34504a;
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f34504a = z10;
                if (z10 && !z11) {
                    C0582a.this.f34495b.D();
                }
            }
        }

        public C0582a(b0 b0Var, Context context) {
            this.f34495b = b0Var;
            this.f34496c = context;
            if (context != null) {
                this.f34497d = (ConnectivityManager) context.getSystemService("connectivity");
                try {
                    H();
                    return;
                } catch (SecurityException e10) {
                    Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e10);
                    return;
                }
            }
            this.f34497d = null;
        }

        @Override // tr.b0
        public final void D() {
            this.f34495b.D();
        }

        @Override // tr.b0
        public final j E() {
            return this.f34495b.E();
        }

        @Override // tr.b0
        public final void F(j jVar, o oVar) {
            this.f34495b.F(jVar, oVar);
        }

        @Override // tr.b0
        public final b0 G() {
            synchronized (this.f34498e) {
                Runnable runnable = this.f;
                if (runnable != null) {
                    runnable.run();
                    this.f = null;
                }
            }
            return this.f34495b.G();
        }

        public final void H() {
            ConnectivityManager connectivityManager;
            if (Build.VERSION.SDK_INT >= 24 && (connectivityManager = this.f34497d) != null) {
                c cVar = new c();
                connectivityManager.registerDefaultNetworkCallback(cVar);
                this.f = new RunnableC0583a(cVar);
                return;
            }
            d dVar = new d();
            this.f34496c.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f = new b(dVar);
        }

        @Override // androidx.work.k
        public final String i() {
            return this.f34495b.i();
        }

        @Override // androidx.work.k
        public final <RequestT, ResponseT> tr.c<RequestT, ResponseT> w(d0<RequestT, ResponseT> d0Var, io.grpc.b bVar) {
            return this.f34495b.w(d0Var, bVar);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:14:0x0033
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            java.lang.String r0 = "AndroidChannelBuilder"
            java.lang.Class<wr.g> r1 = wr.g.class
            java.lang.Class<io.grpc.ManagedChannelProvider> r2 = io.grpc.ManagedChannelProvider.class
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.ClassCastException -> L2c
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L25
            java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch: java.lang.Exception -> L25
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L25
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Exception -> L25
            io.grpc.ManagedChannelProvider r1 = (io.grpc.ManagedChannelProvider) r1     // Catch: java.lang.Exception -> L25
            boolean r1 = r1.b()
            if (r1 != 0) goto L39
            java.lang.String r1 = "OkHttpChannelProvider.isAvailable() returned false"
            android.util.Log.w(r0, r1)
            goto L39
        L25:
            r1 = move-exception
            java.lang.String r2 = "Failed to construct OkHttpChannelProvider"
            android.util.Log.w(r0, r2, r1)
            goto L39
        L2c:
            r1 = move-exception
            java.lang.String r2 = "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider"
            android.util.Log.w(r0, r2, r1)
            goto L39
        L33:
            r1 = move-exception
            java.lang.String r2 = "Failed to find OkHttpChannelProvider"
            android.util.Log.w(r0, r2, r1)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ur.a.<clinit>():void");
    }

    public a(k<?> kVar) {
        this.f34493a = kVar;
    }

    @Override // io.grpc.k
    public final b0 a() {
        return new C0582a(this.f34493a.a(), this.f34494b);
    }
}
