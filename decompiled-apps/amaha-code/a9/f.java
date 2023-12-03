package a9;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.w;
import com.theinnerhour.b2b.R;
import d9.q;
import f0.o;
import f0.t;
import f0.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o8.p;
/* compiled from: PlayerNotificationManager.java */
/* loaded from: classes.dex */
public final class f {
    public static int G;
    public final boolean A;
    public int B;
    public final int C;
    public final int D;
    public final boolean E;
    public final String F;

    /* renamed from: a  reason: collision with root package name */
    public final Context f389a;

    /* renamed from: b  reason: collision with root package name */
    public final String f390b;

    /* renamed from: c  reason: collision with root package name */
    public final int f391c;

    /* renamed from: d  reason: collision with root package name */
    public final b f392d;

    /* renamed from: e  reason: collision with root package name */
    public final d f393e;
    public final Handler f;

    /* renamed from: g  reason: collision with root package name */
    public final y f394g;

    /* renamed from: h  reason: collision with root package name */
    public final IntentFilter f395h;

    /* renamed from: i  reason: collision with root package name */
    public final e f396i;

    /* renamed from: j  reason: collision with root package name */
    public final c f397j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap f398k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, o> f399l;

    /* renamed from: m  reason: collision with root package name */
    public final PendingIntent f400m;

    /* renamed from: n  reason: collision with root package name */
    public final int f401n;

    /* renamed from: o  reason: collision with root package name */
    public t f402o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f403p;

    /* renamed from: q  reason: collision with root package name */
    public w f404q;
    public boolean r;

    /* renamed from: s  reason: collision with root package name */
    public int f405s;

    /* renamed from: t  reason: collision with root package name */
    public MediaSessionCompat.Token f406t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f407u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f408v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f409w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f410x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f411y;

    /* renamed from: z  reason: collision with root package name */
    public final int f412z;

    /* compiled from: PlayerNotificationManager.java */
    /* loaded from: classes.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f413a;

        public a(int i6) {
            this.f413a = i6;
        }
    }

    /* compiled from: PlayerNotificationManager.java */
    /* loaded from: classes.dex */
    public interface b {
        PendingIntent a(w wVar);

        CharSequence b(w wVar);

        void c();

        CharSequence d(w wVar);

        Bitmap e(w wVar, a aVar);
    }

    /* compiled from: PlayerNotificationManager.java */
    /* loaded from: classes.dex */
    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            f fVar = f.this;
            w wVar = fVar.f404q;
            if (wVar != null && fVar.r && intent.getIntExtra("INSTANCE_ID", fVar.f401n) == fVar.f401n) {
                String action = intent.getAction();
                if ("com.google.android.exoplayer.play".equals(action)) {
                    if (wVar.p() == 1) {
                        wVar.l();
                    } else if (wVar.p() == 4) {
                        wVar.A(wVar.K());
                    }
                    wVar.q();
                } else if ("com.google.android.exoplayer.pause".equals(action)) {
                    wVar.pause();
                } else if ("com.google.android.exoplayer.prev".equals(action)) {
                    wVar.y();
                } else if ("com.google.android.exoplayer.rewind".equals(action)) {
                    wVar.X();
                } else if ("com.google.android.exoplayer.ffwd".equals(action)) {
                    wVar.V();
                } else if ("com.google.android.exoplayer.next".equals(action)) {
                    wVar.U();
                } else if ("com.google.android.exoplayer.stop".equals(action)) {
                    wVar.m(true);
                } else if ("com.google.android.exoplayer.dismiss".equals(action)) {
                    fVar.e(true);
                } else if (action != null) {
                    fVar.getClass();
                }
            }
        }
    }

    /* compiled from: PlayerNotificationManager.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(int i6, Notification notification, boolean z10);

        void b();
    }

    public f(Context context, String str, int i6, b bVar, d dVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Context applicationContext = context.getApplicationContext();
        this.f389a = applicationContext;
        this.f390b = str;
        this.f391c = i6;
        this.f392d = bVar;
        this.f393e = dVar;
        this.B = i10;
        this.F = null;
        int i18 = G;
        G = i18 + 1;
        this.f401n = i18;
        Looper mainLooper = Looper.getMainLooper();
        a9.e eVar = new a9.e(0, this);
        int i19 = c9.w.f5205a;
        this.f = new Handler(mainLooper, eVar);
        this.f394g = new y(applicationContext);
        this.f396i = new e();
        this.f397j = new c();
        this.f395h = new IntentFilter();
        this.f407u = true;
        this.f408v = true;
        this.f411y = true;
        this.f409w = true;
        this.f410x = true;
        this.A = true;
        this.E = true;
        this.D = -1;
        this.f412z = 1;
        this.C = 1;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.exoplayer.play", new o(i11, applicationContext.getString(R.string.exo_controls_play_description), a(applicationContext, "com.google.android.exoplayer.play", i18)));
        hashMap.put("com.google.android.exoplayer.pause", new o(i12, applicationContext.getString(R.string.exo_controls_pause_description), a(applicationContext, "com.google.android.exoplayer.pause", i18)));
        hashMap.put("com.google.android.exoplayer.stop", new o(i13, applicationContext.getString(R.string.exo_controls_stop_description), a(applicationContext, "com.google.android.exoplayer.stop", i18)));
        hashMap.put("com.google.android.exoplayer.rewind", new o(i14, applicationContext.getString(R.string.exo_controls_rewind_description), a(applicationContext, "com.google.android.exoplayer.rewind", i18)));
        hashMap.put("com.google.android.exoplayer.ffwd", new o(i15, applicationContext.getString(R.string.exo_controls_fastforward_description), a(applicationContext, "com.google.android.exoplayer.ffwd", i18)));
        hashMap.put("com.google.android.exoplayer.prev", new o(i16, applicationContext.getString(R.string.exo_controls_previous_description), a(applicationContext, "com.google.android.exoplayer.prev", i18)));
        hashMap.put("com.google.android.exoplayer.next", new o(i17, applicationContext.getString(R.string.exo_controls_next_description), a(applicationContext, "com.google.android.exoplayer.next", i18)));
        this.f398k = hashMap;
        for (String str2 : hashMap.keySet()) {
            this.f395h.addAction(str2);
        }
        Map<String, o> emptyMap = Collections.emptyMap();
        this.f399l = emptyMap;
        for (String str3 : emptyMap.keySet()) {
            this.f395h.addAction(str3);
        }
        this.f400m = a(applicationContext, "com.google.android.exoplayer.dismiss", this.f401n);
        this.f395h.addAction("com.google.android.exoplayer.dismiss");
    }

    public static PendingIntent a(Context context, String str, int i6) {
        int i10;
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra("INSTANCE_ID", i6);
        if (c9.w.f5205a >= 23) {
            i10 = 201326592;
        } else {
            i10 = 134217728;
        }
        return PendingIntent.getBroadcast(context, i6, intent, i10);
    }

    public final void b() {
        if (this.r) {
            Handler handler = this.f;
            if (!handler.hasMessages(0)) {
                handler.sendEmptyMessage(0);
            }
        }
    }

    public final void c(w wVar) {
        boolean z10;
        boolean z11 = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        if (wVar != null && wVar.R() != Looper.getMainLooper()) {
            z11 = false;
        }
        sc.b.q(z11);
        w wVar2 = this.f404q;
        if (wVar2 == wVar) {
            return;
        }
        e eVar = this.f396i;
        if (wVar2 != null) {
            wVar2.v(eVar);
            if (wVar == null) {
                e(false);
            }
        }
        this.f404q = wVar;
        if (wVar != null) {
            wVar.E(eVar);
            Handler handler = this.f;
            if (!handler.hasMessages(0)) {
                handler.sendEmptyMessage(0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(w wVar, Bitmap bitmap) {
        boolean z10;
        boolean z11;
        int i6;
        Bitmap bitmap2;
        String str;
        o oVar;
        boolean z12;
        boolean z13;
        int p10 = wVar.p();
        boolean z14 = false;
        if ((p10 == 2 || p10 == 3) && wVar.h()) {
            z10 = true;
        } else {
            z10 = false;
        }
        t tVar = this.f402o;
        int p11 = wVar.p();
        Context context = this.f389a;
        if (p11 == 1 && wVar.Q().q()) {
            this.f403p = null;
            tVar = null;
        } else {
            boolean L = wVar.L(7);
            boolean L2 = wVar.L(11);
            boolean L3 = wVar.L(12);
            boolean L4 = wVar.L(9);
            ArrayList arrayList = new ArrayList();
            if (this.f407u && L) {
                arrayList.add("com.google.android.exoplayer.prev");
            }
            if (this.f409w && L2) {
                arrayList.add("com.google.android.exoplayer.rewind");
            }
            if (this.f411y) {
                if (wVar.p() != 4 && wVar.p() != 1 && wVar.h()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    arrayList.add("com.google.android.exoplayer.pause");
                } else {
                    arrayList.add("com.google.android.exoplayer.play");
                }
            }
            if (this.f410x && L3) {
                arrayList.add("com.google.android.exoplayer.ffwd");
            }
            if (this.f408v && L4) {
                arrayList.add("com.google.android.exoplayer.next");
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                String str2 = (String) arrayList.get(i10);
                HashMap hashMap = this.f398k;
                if (hashMap.containsKey(str2)) {
                    oVar = (o) hashMap.get(str2);
                } else {
                    oVar = this.f399l.get(str2);
                }
                if (oVar != null) {
                    arrayList2.add(oVar);
                }
            }
            if (tVar == null || !arrayList2.equals(this.f403p)) {
                tVar = new t(context, this.f390b);
                this.f403p = arrayList2;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    o oVar2 = (o) arrayList2.get(i11);
                    if (oVar2 != null) {
                        tVar.f14658b.add(oVar2);
                    }
                }
            }
            p1.b bVar = new p1.b();
            MediaSessionCompat.Token token = this.f406t;
            if (token != null) {
                bVar.f = token;
            }
            int indexOf = arrayList.indexOf("com.google.android.exoplayer.pause");
            int indexOf2 = arrayList.indexOf("com.google.android.exoplayer.play");
            int[] iArr = new int[3];
            if (wVar.p() != 4 && wVar.p() != 1 && wVar.h()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (indexOf != -1 && z11) {
                iArr[0] = indexOf;
            } else if (indexOf2 != -1 && !z11) {
                iArr[0] = indexOf2;
            } else {
                i6 = 0;
                bVar.f27867e = Arrays.copyOf(iArr, i6);
                PendingIntent pendingIntent = this.f400m;
                tVar.j(bVar);
                Notification notification = tVar.D;
                notification.deleteIntent = pendingIntent;
                tVar.A = this.f412z;
                tVar.g(2, z10);
                tVar.f14676v = 0;
                tVar.r = this.A;
                tVar.f14673s = true;
                notification.icon = this.B;
                tVar.f14677w = this.C;
                tVar.f14665j = this.D;
                tVar.f(0);
                if (c9.w.f5205a < 21 && this.E && wVar.isPlaying() && !wVar.b() && !wVar.N() && wVar.c().f7195u == 1.0f) {
                    notification.when = System.currentTimeMillis() - wVar.D();
                    tVar.f14666k = true;
                    tVar.f14667l = true;
                } else {
                    tVar.f14666k = false;
                    tVar.f14667l = false;
                }
                b bVar2 = this.f392d;
                tVar.e(bVar2.b(wVar));
                tVar.d(bVar2.d(wVar));
                bVar2.c();
                tVar.k(null);
                if (bitmap != null) {
                    int i12 = this.f405s + 1;
                    this.f405s = i12;
                    bitmap2 = bVar2.e(wVar, new a(i12));
                } else {
                    bitmap2 = bitmap;
                }
                tVar.h(bitmap2);
                tVar.f14662g = bVar2.a(wVar);
                str = this.F;
                if (str != null) {
                    tVar.f14670o = str;
                }
                tVar.g(8, true);
            }
            i6 = 1;
            bVar.f27867e = Arrays.copyOf(iArr, i6);
            PendingIntent pendingIntent2 = this.f400m;
            tVar.j(bVar);
            Notification notification2 = tVar.D;
            notification2.deleteIntent = pendingIntent2;
            tVar.A = this.f412z;
            tVar.g(2, z10);
            tVar.f14676v = 0;
            tVar.r = this.A;
            tVar.f14673s = true;
            notification2.icon = this.B;
            tVar.f14677w = this.C;
            tVar.f14665j = this.D;
            tVar.f(0);
            if (c9.w.f5205a < 21) {
            }
            tVar.f14666k = false;
            tVar.f14667l = false;
            b bVar22 = this.f392d;
            tVar.e(bVar22.b(wVar));
            tVar.d(bVar22.d(wVar));
            bVar22.c();
            tVar.k(null);
            if (bitmap != null) {
            }
            tVar.h(bitmap2);
            tVar.f14662g = bVar22.a(wVar);
            str = this.F;
            if (str != null) {
            }
            tVar.g(8, true);
        }
        this.f402o = tVar;
        if (tVar == null) {
            e(false);
            return;
        }
        Notification b10 = tVar.b();
        y yVar = this.f394g;
        yVar.getClass();
        Bundle bundle = b10.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            z13 = true;
        } else {
            z13 = false;
        }
        int i13 = this.f391c;
        NotificationManager notificationManager = yVar.f14697b;
        if (z13) {
            y.a aVar = new y.a(yVar.f14696a.getPackageName(), i13, b10);
            synchronized (y.f) {
                if (y.f14695g == null) {
                    y.f14695g = new y.c(yVar.f14696a.getApplicationContext());
                }
                y.f14695g.f14705v.obtainMessage(0, aVar).sendToTarget();
            }
            notificationManager.cancel(null, i13);
        } else {
            notificationManager.notify(null, i13, b10);
        }
        if (!this.r) {
            context.registerReceiver(this.f397j, this.f395h);
        }
        d dVar = this.f393e;
        if (dVar != null) {
            dVar.a(i13, b10, (z10 || !this.r) ? true : true);
        }
        this.r = true;
    }

    public final void e(boolean z10) {
        if (this.r) {
            this.r = false;
            this.f.removeMessages(0);
            this.f394g.f14697b.cancel(null, this.f391c);
            this.f389a.unregisterReceiver(this.f397j);
            d dVar = this.f393e;
            if (dVar != null) {
                dVar.b();
            }
        }
    }

    /* compiled from: PlayerNotificationManager.java */
    /* loaded from: classes.dex */
    public class e implements w.d {
        public e() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final void D(w wVar, w.c cVar) {
            if (cVar.b(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                Handler handler = f.this.f;
                if (!handler.hasMessages(0)) {
                    handler.sendEmptyMessage(0);
                }
            }
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void N() {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void T() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void b() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void d0() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void e() {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void f() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void i() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void A(r rVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void C(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void L(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void a(g8.a aVar) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void c(q qVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void f0(v vVar) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void g(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void h(List list) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void i0(q7.d dVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void l(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void l0(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void q(ExoPlaybackException exoPlaybackException) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void r(f0 f0Var) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void s(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void t(w.a aVar) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void w(float f) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void x(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void y(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void G(p pVar, z8.h hVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void R(com.google.android.exoplayer2.q qVar, int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void V(int i6, boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void e0(int i6, int i10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void v(int i6, boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void z(int i6, w.e eVar, w.e eVar2) {
        }
    }
}
