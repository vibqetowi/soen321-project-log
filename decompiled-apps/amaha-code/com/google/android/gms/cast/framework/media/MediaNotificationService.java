package com.google.android.gms.cast.framework.media;

import aa.g;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.appcompat.widget.l;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import f0.o;
import f0.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k9.i;
import l9.a;
import m9.c;
import m9.c0;
import m9.d0;
import m9.e;
import m9.e0;
import m9.f;
import m9.z;
import p9.b;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public class MediaNotificationService extends Service {
    public static final b K = new b("MediaNotificationService");
    public static c0 L;
    public long A;
    public n9.b B;
    public m9.b C;
    public Resources D;
    public e0 E;
    public l F;
    public NotificationManager G;
    public Notification H;
    public a I;

    /* renamed from: u  reason: collision with root package name */
    public f f7278u;

    /* renamed from: v  reason: collision with root package name */
    public c f7279v;

    /* renamed from: w  reason: collision with root package name */
    public ComponentName f7280w;

    /* renamed from: x  reason: collision with root package name */
    public ComponentName f7281x;

    /* renamed from: z  reason: collision with root package name */
    public int[] f7283z;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList f7282y = new ArrayList();
    public final d0 J = new d0(this);

    public static List<e> a(z zVar) {
        try {
            return zVar.h();
        } catch (RemoteException e10) {
            K.c("Unable to call %s on %s.", e10, "getNotificationActions", z.class.getSimpleName());
            return null;
        }
    }

    public static int[] b(z zVar) {
        try {
            return zVar.i();
        } catch (RemoteException e10) {
            K.c("Unable to call %s on %s.", e10, "getCompactViewActionIndices", z.class.getSimpleName());
            return null;
        }
    }

    public final void c() {
        Bitmap bitmap;
        PendingIntent broadcast;
        int[] iArr;
        o d10;
        IconCompat b10;
        f0.d0[] d0VarArr;
        f0.d0[] d0VarArr2;
        if (this.E == null) {
            return;
        }
        l lVar = this.F;
        if (lVar == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) lVar.f1472w;
        }
        t tVar = new t(this, "cast_media_notification");
        tVar.h(bitmap);
        tVar.D.icon = this.f7278u.f24980y;
        tVar.e(this.E.f24971d);
        tVar.d(this.D.getString(this.f7278u.M, this.E.f24972e));
        tVar.g(2, true);
        tVar.f14666k = false;
        tVar.f14677w = 1;
        ComponentName componentName = this.f7281x;
        if (componentName == null) {
            broadcast = null;
        } else {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            broadcast = PendingIntent.getBroadcast(this, 1, intent, com.google.android.gms.internal.cast.e.f7516a | 134217728);
        }
        if (broadcast != null) {
            tVar.f14662g = broadcast;
        }
        z zVar = this.f7278u.Z;
        b bVar = K;
        if (zVar != null) {
            Log.i(bVar.f28035a, bVar.f("actionsProvider != null", new Object[0]));
            int[] b11 = b(zVar);
            if (b11 == null) {
                iArr = null;
            } else {
                iArr = (int[]) b11.clone();
            }
            this.f7283z = iArr;
            List<e> a10 = a(zVar);
            this.f7282y = new ArrayList();
            if (a10 != null) {
                for (e eVar : a10) {
                    String str = eVar.f24965u;
                    boolean equals = str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                    String str2 = eVar.f24965u;
                    if (!equals && !str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) && !str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) && !str.equals(MediaIntentReceiver.ACTION_FORWARD) && !str.equals(MediaIntentReceiver.ACTION_REWIND) && !str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) && !str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        Intent intent2 = new Intent(str2);
                        intent2.setComponent(this.f7280w);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 0, intent2, com.google.android.gms.internal.cast.e.f7516a);
                        int i6 = eVar.f24966v;
                        if (i6 == 0) {
                            b10 = null;
                        } else {
                            b10 = IconCompat.b(null, "", i6);
                        }
                        Bundle bundle = new Bundle();
                        CharSequence c10 = t.c(eVar.f24967w);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        if (arrayList.isEmpty()) {
                            d0VarArr = null;
                        } else {
                            d0VarArr = (f0.d0[]) arrayList.toArray(new f0.d0[arrayList.size()]);
                        }
                        if (arrayList2.isEmpty()) {
                            d0VarArr2 = null;
                        } else {
                            d0VarArr2 = (f0.d0[]) arrayList2.toArray(new f0.d0[arrayList2.size()]);
                        }
                        d10 = new o(b10, c10, broadcast2, bundle, d0VarArr2, d0VarArr, true, 0, true, false, false);
                    } else {
                        d10 = d(str2);
                    }
                    if (d10 != null) {
                        this.f7282y.add(d10);
                    }
                }
            }
        } else {
            Log.i(bVar.f28035a, bVar.f("actionsProvider == null", new Object[0]));
            this.f7282y = new ArrayList();
            Iterator it = this.f7278u.f24976u.iterator();
            while (it.hasNext()) {
                o d11 = d((String) it.next());
                if (d11 != null) {
                    this.f7282y.add(d11);
                }
            }
            int[] iArr2 = this.f7278u.f24977v;
            this.f7283z = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
        }
        Iterator it2 = this.f7282y.iterator();
        while (it2.hasNext()) {
            o oVar = (o) it2.next();
            if (oVar != null) {
                tVar.f14658b.add(oVar);
            }
        }
        p1.b bVar2 = new p1.b();
        int[] iArr3 = this.f7283z;
        if (iArr3 != null) {
            bVar2.f27867e = iArr3;
        }
        MediaSessionCompat.Token token = this.E.f24968a;
        if (token != null) {
            bVar2.f = token;
        }
        tVar.j(bVar2);
        Notification b12 = tVar.b();
        this.H = b12;
        startForeground(1, b12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final o d(String str) {
        char c10;
        int i6;
        int i10;
        IconCompat b10;
        f0.d0[] d0VarArr;
        PendingIntent pendingIntent;
        IconCompat b11;
        f0.d0[] d0VarArr2;
        PendingIntent pendingIntent2;
        IconCompat b12;
        f0.d0[] d0VarArr3;
        int i11;
        IconCompat b13;
        f0.d0[] d0VarArr4;
        int i12;
        IconCompat b14;
        f0.d0[] d0VarArr5;
        IconCompat b15;
        f0.d0[] d0VarArr6;
        IconCompat b16;
        f0.d0[] d0VarArr7;
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        f0.d0[] d0VarArr8 = null;
        switch (c10) {
            case 0:
                e0 e0Var = this.E;
                if (e0Var.f24970c == 2) {
                    f fVar = this.f7278u;
                    i6 = fVar.f24981z;
                    i10 = fVar.N;
                } else {
                    f fVar2 = this.f7278u;
                    i6 = fVar2.A;
                    i10 = fVar2.O;
                }
                boolean z10 = e0Var.f24969b;
                if (!z10) {
                    i6 = this.f7278u.B;
                }
                if (!z10) {
                    i10 = this.f7278u.P;
                }
                Intent intent = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                intent.setComponent(this.f7280w);
                PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, intent, com.google.android.gms.internal.cast.e.f7516a);
                String string = this.D.getString(i10);
                if (i6 == 0) {
                    b10 = null;
                } else {
                    b10 = IconCompat.b(null, "", i6);
                }
                Bundle bundle = new Bundle();
                CharSequence c11 = t.c(string);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.isEmpty()) {
                    d0VarArr = null;
                } else {
                    d0VarArr = (f0.d0[]) arrayList.toArray(new f0.d0[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    d0VarArr8 = (f0.d0[]) arrayList2.toArray(new f0.d0[arrayList2.size()]);
                }
                return new o(b10, c11, broadcast, bundle, d0VarArr8, d0VarArr, true, 0, true, false, false);
            case 1:
                if (this.E.f) {
                    Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                    intent2.setComponent(this.f7280w);
                    pendingIntent = PendingIntent.getBroadcast(this, 0, intent2, com.google.android.gms.internal.cast.e.f7516a);
                } else {
                    pendingIntent = null;
                }
                f fVar3 = this.f7278u;
                int i13 = fVar3.C;
                String string2 = this.D.getString(fVar3.Q);
                if (i13 == 0) {
                    b11 = null;
                } else {
                    b11 = IconCompat.b(null, "", i13);
                }
                Bundle bundle2 = new Bundle();
                CharSequence c12 = t.c(string2);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (arrayList3.isEmpty()) {
                    d0VarArr2 = null;
                } else {
                    d0VarArr2 = (f0.d0[]) arrayList3.toArray(new f0.d0[arrayList3.size()]);
                }
                if (!arrayList4.isEmpty()) {
                    d0VarArr8 = (f0.d0[]) arrayList4.toArray(new f0.d0[arrayList4.size()]);
                }
                return new o(b11, c12, pendingIntent, bundle2, d0VarArr8, d0VarArr2, true, 0, true, false, false);
            case 2:
                if (this.E.f24973g) {
                    Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                    intent3.setComponent(this.f7280w);
                    pendingIntent2 = PendingIntent.getBroadcast(this, 0, intent3, com.google.android.gms.internal.cast.e.f7516a);
                } else {
                    pendingIntent2 = null;
                }
                f fVar4 = this.f7278u;
                int i14 = fVar4.D;
                String string3 = this.D.getString(fVar4.R);
                if (i14 == 0) {
                    b12 = null;
                } else {
                    b12 = IconCompat.b(null, "", i14);
                }
                Bundle bundle3 = new Bundle();
                CharSequence c13 = t.c(string3);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                if (arrayList5.isEmpty()) {
                    d0VarArr3 = null;
                } else {
                    d0VarArr3 = (f0.d0[]) arrayList5.toArray(new f0.d0[arrayList5.size()]);
                }
                if (!arrayList6.isEmpty()) {
                    d0VarArr8 = (f0.d0[]) arrayList6.toArray(new f0.d0[arrayList6.size()]);
                }
                return new o(b12, c13, pendingIntent2, bundle3, d0VarArr8, d0VarArr3, true, 0, true, false, false);
            case 3:
                long j10 = this.A;
                Intent intent4 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                intent4.setComponent(this.f7280w);
                intent4.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j10);
                PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 0, intent4, com.google.android.gms.internal.cast.e.f7516a | 134217728);
                f fVar5 = this.f7278u;
                int i15 = fVar5.E;
                if (j10 == 10000) {
                    i15 = fVar5.F;
                    i11 = fVar5.T;
                } else if (j10 == 30000) {
                    i15 = fVar5.G;
                    i11 = fVar5.U;
                } else {
                    i11 = fVar5.S;
                }
                String string4 = this.D.getString(i11);
                if (i15 == 0) {
                    b13 = null;
                } else {
                    b13 = IconCompat.b(null, "", i15);
                }
                Bundle bundle4 = new Bundle();
                CharSequence c14 = t.c(string4);
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                if (arrayList7.isEmpty()) {
                    d0VarArr4 = null;
                } else {
                    d0VarArr4 = (f0.d0[]) arrayList7.toArray(new f0.d0[arrayList7.size()]);
                }
                if (!arrayList8.isEmpty()) {
                    d0VarArr8 = (f0.d0[]) arrayList8.toArray(new f0.d0[arrayList8.size()]);
                }
                return new o(b13, c14, broadcast2, bundle4, d0VarArr8, d0VarArr4, true, 0, true, false, false);
            case 4:
                long j11 = this.A;
                Intent intent5 = new Intent(MediaIntentReceiver.ACTION_REWIND);
                intent5.setComponent(this.f7280w);
                intent5.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j11);
                PendingIntent broadcast3 = PendingIntent.getBroadcast(this, 0, intent5, com.google.android.gms.internal.cast.e.f7516a | 134217728);
                f fVar6 = this.f7278u;
                int i16 = fVar6.H;
                if (j11 == 10000) {
                    i16 = fVar6.I;
                    i12 = fVar6.W;
                } else if (j11 == 30000) {
                    i16 = fVar6.J;
                    i12 = fVar6.X;
                } else {
                    i12 = fVar6.V;
                }
                String string5 = this.D.getString(i12);
                if (i16 == 0) {
                    b14 = null;
                } else {
                    b14 = IconCompat.b(null, "", i16);
                }
                Bundle bundle5 = new Bundle();
                CharSequence c15 = t.c(string5);
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                if (arrayList9.isEmpty()) {
                    d0VarArr5 = null;
                } else {
                    d0VarArr5 = (f0.d0[]) arrayList9.toArray(new f0.d0[arrayList9.size()]);
                }
                if (!arrayList10.isEmpty()) {
                    d0VarArr8 = (f0.d0[]) arrayList10.toArray(new f0.d0[arrayList10.size()]);
                }
                return new o(b14, c15, broadcast3, bundle5, d0VarArr8, d0VarArr5, true, 0, true, false, false);
            case 5:
                Intent intent6 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                intent6.setComponent(this.f7280w);
                PendingIntent broadcast4 = PendingIntent.getBroadcast(this, 0, intent6, com.google.android.gms.internal.cast.e.f7516a);
                f fVar7 = this.f7278u;
                int i17 = fVar7.K;
                String string6 = this.D.getString(fVar7.Y);
                if (i17 == 0) {
                    b15 = null;
                } else {
                    b15 = IconCompat.b(null, "", i17);
                }
                Bundle bundle6 = new Bundle();
                CharSequence c16 = t.c(string6);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                if (arrayList11.isEmpty()) {
                    d0VarArr6 = null;
                } else {
                    d0VarArr6 = (f0.d0[]) arrayList11.toArray(new f0.d0[arrayList11.size()]);
                }
                if (!arrayList12.isEmpty()) {
                    d0VarArr8 = (f0.d0[]) arrayList12.toArray(new f0.d0[arrayList12.size()]);
                }
                return new o(b15, c16, broadcast4, bundle6, d0VarArr8, d0VarArr6, true, 0, true, false, false);
            case 6:
                Intent intent7 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                intent7.setComponent(this.f7280w);
                PendingIntent broadcast5 = PendingIntent.getBroadcast(this, 0, intent7, 0);
                f fVar8 = this.f7278u;
                int i18 = fVar8.K;
                String string7 = this.D.getString(fVar8.Y, "");
                if (i18 == 0) {
                    b16 = null;
                } else {
                    b16 = IconCompat.b(null, "", i18);
                }
                Bundle bundle7 = new Bundle();
                CharSequence c17 = t.c(string7);
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = new ArrayList();
                if (arrayList13.isEmpty()) {
                    d0VarArr7 = null;
                } else {
                    d0VarArr7 = (f0.d0[]) arrayList13.toArray(new f0.d0[arrayList13.size()]);
                }
                if (!arrayList14.isEmpty()) {
                    d0VarArr8 = (f0.d0[]) arrayList14.toArray(new f0.d0[arrayList14.size()]);
                }
                return new o(b16, c17, broadcast5, bundle7, d0VarArr8, d0VarArr7, true, 0, true, false, false);
            default:
                K.d("Action: %s is not a pre-defined action.", str);
                return null;
        }
    }

    @Override // android.app.Service
    @RecentlyNullable
    public final IBinder onBind(@RecentlyNonNull Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.G = (NotificationManager) getSystemService("notification");
        a a10 = a.a(this);
        this.I = a10;
        a10.getClass();
        v9.o.d("Must be called from the main thread.");
        m9.a aVar = a10.f24152e.f24160z;
        v9.o.h(aVar);
        f fVar = aVar.f24942x;
        v9.o.h(fVar);
        this.f7278u = fVar;
        this.f7279v = aVar.f0();
        this.D = getResources();
        this.f7280w = new ComponentName(getApplicationContext(), aVar.f24939u);
        if (!TextUtils.isEmpty(this.f7278u.f24979x)) {
            this.f7281x = new ComponentName(getApplicationContext(), this.f7278u.f24979x);
        } else {
            this.f7281x = null;
        }
        f fVar2 = this.f7278u;
        this.A = fVar2.f24978w;
        int dimensionPixelSize = this.D.getDimensionPixelSize(fVar2.L);
        this.C = new m9.b(1, dimensionPixelSize, dimensionPixelSize);
        this.B = new n9.b(getApplicationContext(), this.C);
        ComponentName componentName = this.f7281x;
        if (componentName != null) {
            registerReceiver(this.J, new IntentFilter(componentName.flattenToString()));
        }
        if (!g.a()) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", "Cast", 2);
        notificationChannel.setShowBadge(false);
        this.G.createNotificationChannel(notificationChannel);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        n9.b bVar = this.B;
        if (bVar != null) {
            bVar.b();
            bVar.f25952e = null;
        }
        if (this.f7281x != null) {
            try {
                unregisterReceiver(this.J);
            } catch (IllegalArgumentException e10) {
                K.c("Unregistering trampoline BroadcastReceiver failed", e10, new Object[0]);
            }
        }
        L = null;
        this.G.cancel(1);
    }

    @Override // android.app.Service
    public final int onStartCommand(@RecentlyNonNull Intent intent, int i6, int i10) {
        boolean z10;
        boolean z11;
        u9.a aVar;
        e0 e0Var;
        MediaInfo mediaInfo = (MediaInfo) intent.getParcelableExtra("extra_media_info");
        v9.o.h(mediaInfo);
        i iVar = mediaInfo.f7262x;
        v9.o.h(iVar);
        int intExtra = intent.getIntExtra("extra_remote_media_client_player_state", 0);
        CastDevice castDevice = (CastDevice) intent.getParcelableExtra("extra_cast_device");
        v9.o.h(castDevice);
        if (intExtra == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = mediaInfo.f7260v;
        String f02 = iVar.f0("com.google.android.gms.cast.metadata.TITLE");
        String str = castDevice.f7250x;
        boolean booleanExtra = intent.getBooleanExtra("extra_can_skip_next", false);
        boolean booleanExtra2 = intent.getBooleanExtra("extra_can_skip_prev", false);
        e0 e0Var2 = new e0(z10, i11, f02, str, (MediaSessionCompat.Token) intent.getParcelableExtra("extra_media_session_token"), booleanExtra, booleanExtra2);
        if (intent.getBooleanExtra("extra_media_notification_force_update", false) || (e0Var = this.E) == null || z10 != e0Var.f24969b || i11 != e0Var.f24970c || !p9.a.e(f02, e0Var.f24971d) || !p9.a.e(str, e0Var.f24972e) || booleanExtra != e0Var.f || booleanExtra2 != e0Var.f24973g) {
            this.E = e0Var2;
            c();
        }
        if (this.f7279v != null) {
            int i12 = this.C.f24945u;
            aVar = c.a(iVar);
        } else {
            List<u9.a> list = iVar.f23145u;
            if (list != null && !list.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                aVar = list.get(0);
            } else {
                aVar = null;
            }
        }
        l lVar = new l(aVar);
        l lVar2 = this.F;
        if (lVar2 == null || !p9.a.e((Uri) lVar.f1471v, (Uri) lVar2.f1471v)) {
            n9.b bVar = this.B;
            bVar.f25952e = new l(this, lVar, 14);
            bVar.a((Uri) lVar.f1471v);
        }
        startForeground(1, this.H);
        L = new c0(i10, 0, this);
        return 2;
    }
}
