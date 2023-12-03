package h5;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import h5.a;
import h5.f;
import h5.q;
import h5.t;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
/* compiled from: AccessTokenManager.kt */
/* loaded from: classes.dex */
public final class f {
    public static final a f = new a();

    /* renamed from: g  reason: collision with root package name */
    public static f f17213g;

    /* renamed from: a  reason: collision with root package name */
    public final n1.a f17214a;

    /* renamed from: b  reason: collision with root package name */
    public final h5.b f17215b;

    /* renamed from: c  reason: collision with root package name */
    public h5.a f17216c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f17217d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public Date f17218e = new Date(0);

    /* compiled from: AccessTokenManager.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final f a() {
            f fVar;
            f fVar2 = f.f17213g;
            if (fVar2 == null) {
                synchronized (this) {
                    fVar = f.f17213g;
                    if (fVar == null) {
                        n1.a a10 = n1.a.a(p.a());
                        kotlin.jvm.internal.i.f(a10, "getInstance(applicationContext)");
                        f fVar3 = new f(a10, new h5.b());
                        f.f17213g = fVar3;
                        fVar = fVar3;
                    }
                }
                return fVar;
            }
            return fVar2;
        }
    }

    /* compiled from: AccessTokenManager.kt */
    /* loaded from: classes.dex */
    public static final class b implements e {
        @Override // h5.f.e
        public final String a() {
            return "fb_extend_sso_token";
        }

        @Override // h5.f.e
        public final String b() {
            return "oauth/access_token";
        }
    }

    /* compiled from: AccessTokenManager.kt */
    /* loaded from: classes.dex */
    public static final class c implements e {
        @Override // h5.f.e
        public final String a() {
            return "ig_refresh_token";
        }

        @Override // h5.f.e
        public final String b() {
            return "refresh_access_token";
        }
    }

    /* compiled from: AccessTokenManager.kt */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public String f17219a;

        /* renamed from: b  reason: collision with root package name */
        public int f17220b;

        /* renamed from: c  reason: collision with root package name */
        public int f17221c;

        /* renamed from: d  reason: collision with root package name */
        public Long f17222d;

        /* renamed from: e  reason: collision with root package name */
        public String f17223e;
    }

    /* compiled from: AccessTokenManager.kt */
    /* loaded from: classes.dex */
    public interface e {
        String a();

        String b();
    }

    public f(n1.a aVar, h5.b bVar) {
        this.f17214a = aVar;
        this.f17215b = bVar;
    }

    public final void a() {
        e bVar;
        final h5.a aVar = this.f17216c;
        if (aVar == null || !this.f17217d.compareAndSet(false, true)) {
            return;
        }
        this.f17218e = new Date();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        final HashSet hashSet3 = new HashSet();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final d dVar = new d();
        q[] qVarArr = new q[2];
        h5.c cVar = new h5.c(atomicBoolean, hashSet, hashSet2, hashSet3, 0);
        Bundle a10 = r1.b0.a("fields", "permission,status");
        String str = q.f17287j;
        q g5 = q.c.g(aVar, "me/permissions", cVar);
        g5.f17293d = a10;
        v vVar = v.GET;
        g5.k(vVar);
        qVarArr[0] = g5;
        h5.d dVar2 = new h5.d(0, dVar);
        String str2 = aVar.E;
        if (str2 == null) {
            str2 = "facebook";
        }
        if (kotlin.jvm.internal.i.b(str2, "instagram")) {
            bVar = new c();
        } else {
            bVar = new b();
        }
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", bVar.a());
        bundle.putString("client_id", aVar.B);
        bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
        q g10 = q.c.g(aVar, bVar.b(), dVar2);
        g10.f17293d = bundle;
        g10.k(vVar);
        qVarArr[1] = g10;
        t tVar = new t(qVarArr);
        t.a aVar2 = new t.a() { // from class: h5.e
            @Override // h5.t.a
            public final void b(t tVar2) {
                String str3;
                f.a aVar3;
                Date date;
                a aVar4 = aVar;
                f.d refreshResult = f.d.this;
                kotlin.jvm.internal.i.g(refreshResult, "$refreshResult");
                AtomicBoolean permissionsCallSucceeded = atomicBoolean;
                kotlin.jvm.internal.i.g(permissionsCallSucceeded, "$permissionsCallSucceeded");
                Set<String> permissions = hashSet;
                kotlin.jvm.internal.i.g(permissions, "$permissions");
                Set<String> declinedPermissions = hashSet2;
                kotlin.jvm.internal.i.g(declinedPermissions, "$declinedPermissions");
                Set<String> expiredPermissions = hashSet3;
                kotlin.jvm.internal.i.g(expiredPermissions, "$expiredPermissions");
                f this$0 = this;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AtomicBoolean atomicBoolean2 = this$0.f17217d;
                String str4 = refreshResult.f17219a;
                int i6 = refreshResult.f17220b;
                Long l2 = refreshResult.f17222d;
                String str5 = refreshResult.f17223e;
                try {
                    f.a aVar5 = f.f;
                    if (aVar5.a().f17216c != null) {
                        a aVar6 = aVar5.a().f17216c;
                        if (aVar6 == null) {
                            str3 = null;
                        } else {
                            str3 = aVar6.C;
                        }
                        if (str3 == aVar4.C) {
                            if (!permissionsCallSucceeded.get() && str4 == null && i6 == 0) {
                                atomicBoolean2.set(false);
                                return;
                            }
                            Date date2 = aVar4.f17176u;
                            if (refreshResult.f17220b != 0) {
                                aVar3 = aVar5;
                                date2 = new Date(refreshResult.f17220b * 1000);
                            } else {
                                aVar3 = aVar5;
                                if (refreshResult.f17221c != 0) {
                                    date2 = new Date((refreshResult.f17221c * 1000) + new Date().getTime());
                                }
                            }
                            Date date3 = date2;
                            if (str4 == null) {
                                str4 = aVar4.f17180y;
                            }
                            String str6 = str4;
                            String str7 = aVar4.B;
                            String str8 = aVar4.C;
                            if (!permissionsCallSucceeded.get()) {
                                permissions = aVar4.f17177v;
                            }
                            Set<String> set = permissions;
                            if (!permissionsCallSucceeded.get()) {
                                declinedPermissions = aVar4.f17178w;
                            }
                            Set<String> set2 = declinedPermissions;
                            if (!permissionsCallSucceeded.get()) {
                                expiredPermissions = aVar4.f17179x;
                            }
                            Set<String> set3 = expiredPermissions;
                            g gVar = aVar4.f17181z;
                            Date date4 = new Date();
                            if (l2 != null) {
                                date = new Date(l2.longValue() * 1000);
                            } else {
                                date = aVar4.D;
                            }
                            Date date5 = date;
                            if (str5 == null) {
                                str5 = aVar4.E;
                            }
                            aVar3.a().c(new a(str6, str7, str8, set, set2, set3, gVar, date3, date4, date5, str5), true);
                        }
                    }
                } finally {
                    atomicBoolean2.set(false);
                }
            }
        };
        ArrayList arrayList = tVar.f17314x;
        if (!arrayList.contains(aVar2)) {
            arrayList.add(aVar2);
        }
        w5.f0.c(tVar);
        new s(tVar).executeOnExecutor(p.c(), new Void[0]);
    }

    public final void b(h5.a aVar, h5.a aVar2) {
        Intent intent = new Intent(p.a(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", aVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", aVar2);
        this.f17214a.c(intent);
    }

    public final void c(h5.a aVar, boolean z10) {
        Date date;
        PendingIntent broadcast;
        h5.a aVar2 = this.f17216c;
        this.f17216c = aVar;
        this.f17217d.set(false);
        this.f17218e = new Date(0L);
        if (z10) {
            h5.b bVar = this.f17215b;
            if (aVar != null) {
                bVar.getClass();
                try {
                    bVar.f17187a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", aVar.a().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                bVar.f17187a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                p pVar = p.f17269a;
                w5.e0 e0Var = w5.e0.f36453a;
                w5.e0.d(p.a());
            }
        }
        if (!w5.e0.a(aVar2, aVar)) {
            b(aVar2, aVar);
            Context a10 = p.a();
            Date date2 = h5.a.F;
            h5.a b10 = a.b.b();
            AlarmManager alarmManager = (AlarmManager) a10.getSystemService("alarm");
            if (a.b.c()) {
                if (b10 == null) {
                    date = null;
                } else {
                    date = b10.f17176u;
                }
                if (date != null && alarmManager != null) {
                    Intent intent = new Intent(a10, CurrentAccessTokenExpirationBroadcastReceiver.class);
                    intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                    if (Build.VERSION.SDK_INT >= 23) {
                        broadcast = PendingIntent.getBroadcast(a10, 0, intent, 67108864);
                    } else {
                        broadcast = PendingIntent.getBroadcast(a10, 0, intent, 0);
                    }
                    try {
                        alarmManager.set(1, b10.f17176u.getTime(), broadcast);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }
}
