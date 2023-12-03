package r1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r1.g;
import r1.l;
/* compiled from: RegisteredMediaRouteProvider.java */
/* loaded from: classes.dex */
public final class a0 extends r1.g implements ServiceConnection {
    public static final boolean K = Log.isLoggable("MediaRouteProviderProxy", 3);
    public final ComponentName C;
    public final d D;
    public final ArrayList<c> E;
    public boolean F;
    public boolean G;
    public a H;
    public boolean I;
    public b J;

    /* compiled from: RegisteredMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public final class a implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        public final Messenger f30187a;

        /* renamed from: b  reason: collision with root package name */
        public final e f30188b;

        /* renamed from: c  reason: collision with root package name */
        public final Messenger f30189c;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public int f30192g;

        /* renamed from: d  reason: collision with root package name */
        public int f30190d = 1;

        /* renamed from: e  reason: collision with root package name */
        public int f30191e = 1;

        /* renamed from: h  reason: collision with root package name */
        public final SparseArray<l.c> f30193h = new SparseArray<>();

        /* compiled from: RegisteredMediaRouteProvider.java */
        /* renamed from: r1.a0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0512a implements Runnable {
            public RunnableC0512a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                a0 a0Var = a0.this;
                if (a0Var.H == aVar) {
                    if (a0.K) {
                        Log.d("MediaRouteProviderProxy", a0Var + ": Service connection died");
                    }
                    a0Var.t();
                }
            }
        }

        public a(Messenger messenger) {
            this.f30187a = messenger;
            e eVar = new e(this);
            this.f30188b = eVar;
            this.f30189c = new Messenger(eVar);
        }

        public final void a(int i6) {
            int i10 = this.f30190d;
            this.f30190d = i10 + 1;
            b(5, i10, i6, null, null);
        }

        public final boolean b(int i6, int i10, int i11, Bundle bundle, Bundle bundle2) {
            Message obtain = Message.obtain();
            obtain.what = i6;
            obtain.arg1 = i10;
            obtain.arg2 = i11;
            obtain.obj = bundle;
            obtain.setData(bundle2);
            obtain.replyTo = this.f30189c;
            try {
                this.f30187a.send(obtain);
                return true;
            } catch (DeadObjectException unused) {
                return false;
            } catch (RemoteException e10) {
                if (i6 != 2) {
                    Log.e("MediaRouteProviderProxy", "Could not send message to service.", e10);
                    return false;
                }
                return false;
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            a0.this.D.post(new RunnableC0512a());
        }

        public final void c(int i6, int i10) {
            Bundle k10 = defpackage.c.k("volume", i10);
            int i11 = this.f30190d;
            this.f30190d = i11 + 1;
            b(7, i11, i6, null, k10);
        }

        public final void d(int i6, int i10) {
            Bundle k10 = defpackage.c.k("volume", i10);
            int i11 = this.f30190d;
            this.f30190d = i11 + 1;
            b(8, i11, i6, null, k10);
        }
    }

    /* compiled from: RegisteredMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: RegisteredMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(a aVar);

        int b();

        void c();
    }

    /* compiled from: RegisteredMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static final class d extends Handler {
    }

    /* compiled from: RegisteredMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static final class e extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<a> f30196a;

        public e(a aVar) {
            this.f30196a = new WeakReference<>(aVar);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            r1.e eVar;
            r1.e eVar2;
            g.b.a aVar;
            a aVar2 = this.f30196a.get();
            if (aVar2 != null) {
                int i6 = message.what;
                int i10 = message.arg1;
                int i11 = message.arg2;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                SparseArray<l.c> sparseArray = aVar2.f30193h;
                int i12 = 0;
                String str = null;
                c cVar = null;
                c cVar2 = null;
                a0 a0Var = a0.this;
                switch (i6) {
                    case 0:
                        if (i10 == aVar2.f30192g) {
                            aVar2.f30192g = 0;
                            if (a0Var.H == aVar2) {
                                if (a0.K) {
                                    Log.d("MediaRouteProviderProxy", a0Var + ": Service connection error - Registration failed");
                                }
                                a0Var.w();
                            }
                        }
                        l.c cVar3 = sparseArray.get(i10);
                        if (cVar3 != null) {
                            sparseArray.remove(i10);
                            cVar3.a(null, null);
                        }
                        i12 = 1;
                        break;
                    case 1:
                        i12 = 1;
                        break;
                    case 2:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle = (Bundle) obj;
                            if (aVar2.f == 0 && i10 == aVar2.f30192g && i11 >= 1) {
                                aVar2.f30192g = 0;
                                aVar2.f = i11;
                                a0Var.u(aVar2, j.a(bundle));
                                if (a0Var.H == aVar2) {
                                    a0Var.I = true;
                                    ArrayList<c> arrayList = a0Var.E;
                                    int size = arrayList.size();
                                    while (i12 < size) {
                                        arrayList.get(i12).a(a0Var.H);
                                        i12++;
                                    }
                                    r1.f fVar = a0Var.f30262y;
                                    if (fVar != null) {
                                        a aVar3 = a0Var.H;
                                        int i13 = aVar3.f30190d;
                                        aVar3.f30190d = i13 + 1;
                                        aVar3.b(10, i13, 0, fVar.f30256a, null);
                                    }
                                }
                                i12 = 1;
                                break;
                            }
                        }
                        break;
                    case 3:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle2 = (Bundle) obj;
                            l.c cVar4 = sparseArray.get(i10);
                            if (cVar4 != null) {
                                sparseArray.remove(i10);
                                cVar4.b(bundle2);
                                i12 = 1;
                                break;
                            }
                        }
                        break;
                    case 4:
                        if (obj == null || (obj instanceof Bundle)) {
                            if (peekData != null) {
                                str = peekData.getString("error");
                            }
                            Bundle bundle3 = (Bundle) obj;
                            l.c cVar5 = sparseArray.get(i10);
                            if (cVar5 != null) {
                                sparseArray.remove(i10);
                                cVar5.a(str, bundle3);
                                i12 = 1;
                                break;
                            }
                        }
                        break;
                    case 5:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle4 = (Bundle) obj;
                            if (aVar2.f != 0) {
                                a0Var.u(aVar2, j.a(bundle4));
                                i12 = 1;
                                break;
                            }
                        }
                        break;
                    case 6:
                        if (obj instanceof Bundle) {
                            Bundle bundle5 = (Bundle) obj;
                            l.c cVar6 = sparseArray.get(i10);
                            if (bundle5 != null && bundle5.containsKey("routeId")) {
                                sparseArray.remove(i10);
                                cVar6.b(bundle5);
                                break;
                            } else {
                                cVar6.a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                break;
                            }
                        } else {
                            Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                            break;
                        }
                        break;
                    case 7:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle6 = (Bundle) obj;
                            if (aVar2.f != 0) {
                                Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                if (bundle7 != null) {
                                    eVar = new r1.e(bundle7);
                                } else {
                                    eVar = null;
                                }
                                ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = parcelableArrayList.iterator();
                                while (it.hasNext()) {
                                    Bundle bundle8 = (Bundle) it.next();
                                    if (bundle8 == null) {
                                        aVar = null;
                                    } else {
                                        Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                        if (bundle9 != null) {
                                            eVar2 = new r1.e(bundle9);
                                        } else {
                                            eVar2 = null;
                                        }
                                        aVar = new g.b.a(eVar2, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                    }
                                    arrayList2.add(aVar);
                                }
                                if (a0Var.H == aVar2) {
                                    if (a0.K) {
                                        Log.d("MediaRouteProviderProxy", a0Var + ": DynamicRouteDescriptors changed, descriptors=" + arrayList2);
                                    }
                                    Iterator<c> it2 = a0Var.E.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            c next = it2.next();
                                            if (next.b() == i11) {
                                                cVar2 = next;
                                            }
                                        }
                                    }
                                    if (cVar2 instanceof f) {
                                        ((f) cVar2).l(eVar, arrayList2);
                                    }
                                }
                                i12 = 1;
                                break;
                            }
                        }
                        break;
                    case 8:
                        if (a0Var.H == aVar2) {
                            ArrayList<c> arrayList3 = a0Var.E;
                            Iterator<c> it3 = arrayList3.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    c next2 = it3.next();
                                    if (next2.b() == i11) {
                                        cVar = next2;
                                    }
                                }
                            }
                            b bVar = a0Var.J;
                            if (bVar != null && (cVar instanceof g.e)) {
                                g.e eVar3 = (g.e) cVar;
                                l.d dVar = (l.d) ((c0) ((dd.a) bVar).f12813v).f30216b;
                                if (dVar.r == eVar3) {
                                    dVar.j(dVar.c(), 2);
                                }
                            }
                            arrayList3.remove(cVar);
                            cVar.c();
                            a0Var.x();
                            break;
                        }
                        break;
                }
                if (i12 == 0 && a0.K) {
                    Log.d("MediaRouteProviderProxy", "Unhandled message from server: " + message);
                }
            }
        }
    }

    /* compiled from: RegisteredMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public final class f extends g.b implements c {
        public final String f;

        /* renamed from: g  reason: collision with root package name */
        public String f30197g;

        /* renamed from: h  reason: collision with root package name */
        public String f30198h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f30199i;

        /* renamed from: k  reason: collision with root package name */
        public int f30201k;

        /* renamed from: l  reason: collision with root package name */
        public a f30202l;

        /* renamed from: j  reason: collision with root package name */
        public int f30200j = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f30203m = -1;

        /* compiled from: RegisteredMediaRouteProvider.java */
        /* loaded from: classes.dex */
        public class a extends l.c {
            public a() {
            }

            @Override // r1.l.c
            public final void a(String str, Bundle bundle) {
                Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
            }

            @Override // r1.l.c
            public final void b(Bundle bundle) {
                String string = bundle.getString("groupableTitle");
                f fVar = f.this;
                fVar.f30197g = string;
                fVar.f30198h = bundle.getString("transferableTitle");
            }
        }

        public f(String str) {
            this.f = str;
        }

        @Override // r1.a0.c
        public final void a(a aVar) {
            a aVar2 = new a();
            this.f30202l = aVar;
            int i6 = aVar.f30191e;
            aVar.f30191e = i6 + 1;
            int i10 = aVar.f30190d;
            aVar.f30190d = i10 + 1;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", this.f);
            aVar.b(11, i10, i6, null, bundle);
            aVar.f30193h.put(i10, aVar2);
            this.f30203m = i6;
            if (this.f30199i) {
                aVar.a(i6);
                int i11 = this.f30200j;
                if (i11 >= 0) {
                    aVar.c(this.f30203m, i11);
                    this.f30200j = -1;
                }
                int i12 = this.f30201k;
                if (i12 != 0) {
                    aVar.d(this.f30203m, i12);
                    this.f30201k = 0;
                }
            }
        }

        @Override // r1.a0.c
        public final int b() {
            return this.f30203m;
        }

        @Override // r1.a0.c
        public final void c() {
            a aVar = this.f30202l;
            if (aVar != null) {
                int i6 = this.f30203m;
                int i10 = aVar.f30190d;
                aVar.f30190d = i10 + 1;
                aVar.b(4, i10, i6, null, null);
                this.f30202l = null;
                this.f30203m = 0;
            }
        }

        @Override // r1.g.e
        public final void d() {
            a0 a0Var = a0.this;
            a0Var.E.remove(this);
            c();
            a0Var.x();
        }

        @Override // r1.g.e
        public final void e() {
            this.f30199i = true;
            a aVar = this.f30202l;
            if (aVar != null) {
                aVar.a(this.f30203m);
            }
        }

        @Override // r1.g.e
        public final void f(int i6) {
            a aVar = this.f30202l;
            if (aVar != null) {
                aVar.c(this.f30203m, i6);
                return;
            }
            this.f30200j = i6;
            this.f30201k = 0;
        }

        @Override // r1.g.e
        public final void g() {
            h(0);
        }

        @Override // r1.g.e
        public final void h(int i6) {
            this.f30199i = false;
            a aVar = this.f30202l;
            if (aVar != null) {
                int i10 = this.f30203m;
                Bundle k10 = defpackage.c.k("unselectReason", i6);
                int i11 = aVar.f30190d;
                aVar.f30190d = i11 + 1;
                aVar.b(6, i11, i10, null, k10);
            }
        }

        @Override // r1.g.e
        public final void i(int i6) {
            a aVar = this.f30202l;
            if (aVar != null) {
                aVar.d(this.f30203m, i6);
            } else {
                this.f30201k += i6;
            }
        }

        @Override // r1.g.b
        public final String j() {
            return this.f30197g;
        }

        @Override // r1.g.b
        public final String k() {
            return this.f30198h;
        }

        @Override // r1.g.b
        public final void m(String str) {
            a aVar = this.f30202l;
            if (aVar != null) {
                int i6 = this.f30203m;
                Bundle a10 = b0.a("memberRouteId", str);
                int i10 = aVar.f30190d;
                aVar.f30190d = i10 + 1;
                aVar.b(12, i10, i6, null, a10);
            }
        }

        @Override // r1.g.b
        public final void n(String str) {
            a aVar = this.f30202l;
            if (aVar != null) {
                int i6 = this.f30203m;
                Bundle a10 = b0.a("memberRouteId", str);
                int i10 = aVar.f30190d;
                aVar.f30190d = i10 + 1;
                aVar.b(13, i10, i6, null, a10);
            }
        }

        @Override // r1.g.b
        public final void o(List<String> list) {
            a aVar = this.f30202l;
            if (aVar != null) {
                int i6 = this.f30203m;
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
                int i10 = aVar.f30190d;
                aVar.f30190d = i10 + 1;
                aVar.b(14, i10, i6, null, bundle);
            }
        }
    }

    /* compiled from: RegisteredMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public final class g extends g.e implements c {

        /* renamed from: a  reason: collision with root package name */
        public final String f30206a;

        /* renamed from: b  reason: collision with root package name */
        public final String f30207b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f30208c;

        /* renamed from: d  reason: collision with root package name */
        public int f30209d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f30210e;
        public a f;

        /* renamed from: g  reason: collision with root package name */
        public int f30211g;

        public g(String str, String str2) {
            this.f30206a = str;
            this.f30207b = str2;
        }

        @Override // r1.a0.c
        public final void a(a aVar) {
            this.f = aVar;
            int i6 = aVar.f30191e;
            aVar.f30191e = i6 + 1;
            Bundle bundle = new Bundle();
            bundle.putString("routeId", this.f30206a);
            bundle.putString("routeGroupId", this.f30207b);
            int i10 = aVar.f30190d;
            aVar.f30190d = i10 + 1;
            aVar.b(3, i10, i6, null, bundle);
            this.f30211g = i6;
            if (this.f30208c) {
                aVar.a(i6);
                int i11 = this.f30209d;
                if (i11 >= 0) {
                    aVar.c(this.f30211g, i11);
                    this.f30209d = -1;
                }
                int i12 = this.f30210e;
                if (i12 != 0) {
                    aVar.d(this.f30211g, i12);
                    this.f30210e = 0;
                }
            }
        }

        @Override // r1.a0.c
        public final int b() {
            return this.f30211g;
        }

        @Override // r1.a0.c
        public final void c() {
            a aVar = this.f;
            if (aVar != null) {
                int i6 = this.f30211g;
                int i10 = aVar.f30190d;
                aVar.f30190d = i10 + 1;
                aVar.b(4, i10, i6, null, null);
                this.f = null;
                this.f30211g = 0;
            }
        }

        @Override // r1.g.e
        public final void d() {
            a0 a0Var = a0.this;
            a0Var.E.remove(this);
            c();
            a0Var.x();
        }

        @Override // r1.g.e
        public final void e() {
            this.f30208c = true;
            a aVar = this.f;
            if (aVar != null) {
                aVar.a(this.f30211g);
            }
        }

        @Override // r1.g.e
        public final void f(int i6) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.c(this.f30211g, i6);
                return;
            }
            this.f30209d = i6;
            this.f30210e = 0;
        }

        @Override // r1.g.e
        public final void g() {
            h(0);
        }

        @Override // r1.g.e
        public final void h(int i6) {
            this.f30208c = false;
            a aVar = this.f;
            if (aVar != null) {
                int i10 = this.f30211g;
                Bundle k10 = defpackage.c.k("unselectReason", i6);
                int i11 = aVar.f30190d;
                aVar.f30190d = i11 + 1;
                aVar.b(6, i11, i10, null, k10);
            }
        }

        @Override // r1.g.e
        public final void i(int i6) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.d(this.f30211g, i6);
            } else {
                this.f30210e += i6;
            }
        }
    }

    public a0(Context context, ComponentName componentName) {
        super(context, new g.d(componentName));
        this.E = new ArrayList<>();
        this.C = componentName;
        this.D = new d();
    }

    @Override // r1.g
    public final g.b l(String str) {
        if (str != null) {
            j jVar = this.A;
            if (jVar != null) {
                List<r1.e> list = jVar.f30284a;
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    if (list.get(i6).d().equals(str)) {
                        f fVar = new f(str);
                        this.E.add(fVar);
                        if (this.I) {
                            fVar.a(this.H);
                        }
                        x();
                        return fVar;
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    @Override // r1.g
    public final g.e m(String str) {
        if (str != null) {
            return s(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // r1.g
    public final g.e n(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return s(str, str2);
            }
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // r1.g
    public final void o(r1.f fVar) {
        Bundle bundle;
        if (this.I) {
            a aVar = this.H;
            int i6 = aVar.f30190d;
            aVar.f30190d = i6 + 1;
            if (fVar != null) {
                bundle = fVar.f30256a;
            } else {
                bundle = null;
            }
            aVar.b(10, i6, 0, bundle, null);
        }
        x();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Messenger messenger;
        boolean z10;
        boolean z11 = K;
        if (z11) {
            Log.d("MediaRouteProviderProxy", this + ": Connected");
        }
        if (this.G) {
            t();
            if (iBinder != null) {
                messenger = new Messenger(iBinder);
            } else {
                messenger = null;
            }
            boolean z12 = false;
            if (messenger != null) {
                if (messenger.getBinder() != null) {
                    z10 = true;
                    if (!z10) {
                        a aVar = new a(messenger);
                        int i6 = aVar.f30190d;
                        aVar.f30190d = i6 + 1;
                        aVar.f30192g = i6;
                        if (aVar.b(1, i6, 4, null, null)) {
                            try {
                                aVar.f30187a.getBinder().linkToDeath(aVar, 0);
                                z12 = true;
                            } catch (RemoteException unused) {
                                aVar.binderDied();
                            }
                        }
                        if (z12) {
                            this.H = aVar;
                            return;
                        } else if (z11) {
                            Log.d("MediaRouteProviderProxy", this + ": Registration failed");
                            return;
                        } else {
                            return;
                        }
                    }
                    Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
                    return;
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (K) {
            Log.d("MediaRouteProviderProxy", this + ": Service disconnected");
        }
        t();
    }

    public final void r() {
        int i6;
        if (!this.G) {
            boolean z10 = K;
            if (z10) {
                Log.d("MediaRouteProviderProxy", this + ": Binding");
            }
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.C);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i6 = 4097;
                } else {
                    i6 = 1;
                }
                boolean bindService = this.f30258u.bindService(intent, this, i6);
                this.G = bindService;
                if (!bindService && z10) {
                    Log.d("MediaRouteProviderProxy", this + ": Bind failed");
                }
            } catch (SecurityException e10) {
                if (z10) {
                    Log.d("MediaRouteProviderProxy", this + ": Bind failed", e10);
                }
            }
        }
    }

    public final g s(String str, String str2) {
        j jVar = this.A;
        if (jVar != null) {
            List<r1.e> list = jVar.f30284a;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (list.get(i6).d().equals(str)) {
                    g gVar = new g(str, str2);
                    this.E.add(gVar);
                    if (this.I) {
                        gVar.a(this.H);
                    }
                    x();
                    return gVar;
                }
            }
            return null;
        }
        return null;
    }

    public final void t() {
        if (this.H != null) {
            p(null);
            this.I = false;
            ArrayList<c> arrayList = this.E;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.get(i6).c();
            }
            a aVar = this.H;
            aVar.b(2, 0, 0, null, null);
            aVar.f30188b.f30196a.clear();
            aVar.f30187a.getBinder().unlinkToDeath(aVar, 0);
            a0.this.D.post(new z(aVar));
            this.H = null;
        }
    }

    public final String toString() {
        return "Service connection " + this.C.flattenToShortString();
    }

    public final void u(a aVar, j jVar) {
        if (this.H == aVar) {
            if (K) {
                Log.d("MediaRouteProviderProxy", this + ": Descriptor changed, descriptor=" + jVar);
            }
            p(jVar);
        }
    }

    public final void v() {
        if (!this.F) {
            if (K) {
                Log.d("MediaRouteProviderProxy", this + ": Starting");
            }
            this.F = true;
            x();
        }
    }

    public final void w() {
        if (this.G) {
            if (K) {
                Log.d("MediaRouteProviderProxy", this + ": Unbinding");
            }
            this.G = false;
            t();
            try {
                this.f30258u.unbindService(this);
            } catch (IllegalArgumentException e10) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r2.E.isEmpty() == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x() {
        boolean z10;
        if (this.F) {
            z10 = true;
            if (this.f30262y == null) {
            }
            if (!z10) {
                r();
                return;
            } else {
                w();
                return;
            }
        }
        z10 = false;
        if (!z10) {
        }
    }
}
