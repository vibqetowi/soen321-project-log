package l9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.cast.framework.zzar;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.internal.cast.k1;
import com.google.android.gms.internal.cast.o2;
import com.google.android.gms.internal.cast.v0;
import com.google.android.gms.internal.cast.z1;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final p9.b f24145h = new p9.b("CastContext");

    /* renamed from: i  reason: collision with root package name */
    public static final Object f24146i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static a f24147j;

    /* renamed from: a  reason: collision with root package name */
    public final Context f24148a;

    /* renamed from: b  reason: collision with root package name */
    public final h0 f24149b;

    /* renamed from: c  reason: collision with root package name */
    public final f f24150c;

    /* renamed from: d  reason: collision with root package name */
    public final d0 f24151d;

    /* renamed from: e  reason: collision with root package name */
    public final b f24152e;
    public final List<g> f;

    /* renamed from: g  reason: collision with root package name */
    public o2 f24153g;

    public a(Context context, b bVar, List<g> list, com.google.android.gms.internal.cast.c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f24148a = applicationContext;
        this.f24152e = bVar;
        this.f = list;
        if (!TextUtils.isEmpty(bVar.f24155u)) {
            this.f24153g = new o2(applicationContext, bVar, cVar);
        } else {
            this.f24153g = null;
        }
        HashMap hashMap = new HashMap();
        o2 o2Var = this.f24153g;
        if (o2Var != null) {
            hashMap.put(o2Var.f24180b, o2Var.f24181c);
        }
        if (list != null) {
            for (g gVar : list) {
                v9.o.i(gVar, "Additional SessionProvider must not be null.");
                String str = gVar.f24180b;
                v9.o.f("Category for SessionProvider must not be null or empty string.", str);
                v9.o.a(String.format("SessionProvider for category %s already added", str), !hashMap.containsKey(str));
                hashMap.put(str, gVar.f24181c);
            }
        }
        try {
            Context context2 = this.f24148a;
            h0 b02 = k1.a(context2).b0(new da.b(context2.getApplicationContext()), bVar, cVar, hashMap);
            this.f24149b = b02;
            try {
                this.f24151d = new d0(b02.i());
                try {
                    r h10 = b02.h();
                    Context context3 = this.f24148a;
                    this.f24150c = new f(h10, context3);
                    new p9.s(context3);
                    v9.o.f("The log tag cannot be null or empty.", "PrecacheManager");
                    p9.s sVar = new p9.s(this.f24148a);
                    p.a aVar = new p.a();
                    aVar.f7418a = new p9.p(sVar, new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}, 0);
                    aVar.f7420c = new s9.d[]{k9.x.f23194b};
                    aVar.f7419b = false;
                    aVar.f7421d = 8425;
                    sVar.b(0, aVar.a()).addOnSuccessListener(new ya.f(this) { // from class: l9.h

                        /* renamed from: b  reason: collision with root package name */
                        public final a f24184b;

                        {
                            this.f24184b = this;
                        }

                        @Override // ya.f
                        public final void onSuccess(Object obj) {
                            switch (r2) {
                                case 0:
                                    final a aVar2 = this.f24184b;
                                    Bundle bundle = (Bundle) obj;
                                    aVar2.getClass();
                                    boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED");
                                    boolean z11 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED");
                                    if (!z10) {
                                        if (z11) {
                                            z11 = true;
                                        } else {
                                            return;
                                        }
                                    }
                                    String packageName = aVar2.f24148a.getPackageName();
                                    String format = String.format(Locale.ROOT, "%s.%s", aVar2.f24148a.getPackageName(), "client_cast_analytics_data");
                                    d7.w.b(aVar2.f24148a);
                                    d7.u a10 = d7.w.a().c(b7.a.f3950e).a("CAST_SENDER_SDK", new a7.b("proto"), f6.b.H);
                                    long j10 = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE");
                                    final SharedPreferences sharedPreferences = aVar2.f24148a.getApplicationContext().getSharedPreferences(format, 0);
                                    final com.google.android.gms.internal.cast.h hVar = new com.google.android.gms.internal.cast.h(sharedPreferences, a10, j10);
                                    if (z10) {
                                        p9.s sVar2 = new p9.s(aVar2.f24148a);
                                        p.a aVar3 = new p.a();
                                        aVar3.f7418a = new p9.p(sVar2, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, 1);
                                        aVar3.f7420c = new s9.d[]{k9.x.f23195c};
                                        aVar3.f7419b = false;
                                        aVar3.f7421d = 8426;
                                        sVar2.b(0, aVar3.a()).addOnSuccessListener(new ya.f(aVar2, hVar, sharedPreferences) { // from class: l9.x

                                            /* renamed from: a  reason: collision with root package name */
                                            public final a f24192a;

                                            /* renamed from: b  reason: collision with root package name */
                                            public final com.google.android.gms.internal.cast.h f24193b;

                                            /* renamed from: c  reason: collision with root package name */
                                            public final SharedPreferences f24194c;

                                            {
                                                this.f24192a = aVar2;
                                                this.f24193b = hVar;
                                                this.f24194c = sharedPreferences;
                                            }

                                            @Override // ya.f
                                            public final void onSuccess(Object obj2) {
                                                a aVar4 = this.f24192a;
                                                f fVar = aVar4.f24150c;
                                                v9.o.h(fVar);
                                                g.x xVar = new g.x(new com.google.android.gms.internal.cast.a0(this.f24194c, this.f24193b, (Bundle) obj2, aVar4.f24148a.getPackageName()));
                                                v9.o.d("Must be called from the main thread.");
                                                try {
                                                    fVar.f24177a.C1(new v(xVar));
                                                } catch (RemoteException e10) {
                                                    f.f24176c.a("Unable to call %s on %s.", e10, "addSessionManagerListener", r.class.getSimpleName());
                                                }
                                            }
                                        });
                                    }
                                    if (z11) {
                                        p9.b bVar2 = v0.f7652i;
                                        synchronized (v0.class) {
                                            if (v0.f7654k == null) {
                                                v0.f7654k = new v0(sharedPreferences, hVar, packageName);
                                            }
                                        }
                                        v0.a(com.google.android.gms.internal.cast.d0.CAST_CONTEXT);
                                        return;
                                    }
                                    return;
                                default:
                                    this.f24184b.getClass();
                                    z1.a((Bundle) obj, "com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES");
                                    return;
                            }
                        }
                    });
                    p9.s sVar2 = new p9.s(this.f24148a);
                    p.a aVar2 = new p.a();
                    aVar2.f7418a = new p9.p(sVar2, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, 2);
                    aVar2.f7420c = new s9.d[]{k9.x.f23196d};
                    aVar2.f7419b = false;
                    aVar2.f7421d = 8427;
                    sVar2.b(0, aVar2.a()).addOnSuccessListener(new ya.f(this) { // from class: l9.h

                        /* renamed from: b  reason: collision with root package name */
                        public final a f24184b;

                        {
                            this.f24184b = this;
                        }

                        @Override // ya.f
                        public final void onSuccess(Object obj) {
                            switch (r2) {
                                case 0:
                                    final a aVar22 = this.f24184b;
                                    Bundle bundle = (Bundle) obj;
                                    aVar22.getClass();
                                    boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED");
                                    boolean z11 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED");
                                    if (!z10) {
                                        if (z11) {
                                            z11 = true;
                                        } else {
                                            return;
                                        }
                                    }
                                    String packageName = aVar22.f24148a.getPackageName();
                                    String format = String.format(Locale.ROOT, "%s.%s", aVar22.f24148a.getPackageName(), "client_cast_analytics_data");
                                    d7.w.b(aVar22.f24148a);
                                    d7.u a10 = d7.w.a().c(b7.a.f3950e).a("CAST_SENDER_SDK", new a7.b("proto"), f6.b.H);
                                    long j10 = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE");
                                    final SharedPreferences sharedPreferences = aVar22.f24148a.getApplicationContext().getSharedPreferences(format, 0);
                                    final com.google.android.gms.internal.cast.h hVar = new com.google.android.gms.internal.cast.h(sharedPreferences, a10, j10);
                                    if (z10) {
                                        p9.s sVar22 = new p9.s(aVar22.f24148a);
                                        p.a aVar3 = new p.a();
                                        aVar3.f7418a = new p9.p(sVar22, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, 1);
                                        aVar3.f7420c = new s9.d[]{k9.x.f23195c};
                                        aVar3.f7419b = false;
                                        aVar3.f7421d = 8426;
                                        sVar22.b(0, aVar3.a()).addOnSuccessListener(new ya.f(aVar22, hVar, sharedPreferences) { // from class: l9.x

                                            /* renamed from: a  reason: collision with root package name */
                                            public final a f24192a;

                                            /* renamed from: b  reason: collision with root package name */
                                            public final com.google.android.gms.internal.cast.h f24193b;

                                            /* renamed from: c  reason: collision with root package name */
                                            public final SharedPreferences f24194c;

                                            {
                                                this.f24192a = aVar22;
                                                this.f24193b = hVar;
                                                this.f24194c = sharedPreferences;
                                            }

                                            @Override // ya.f
                                            public final void onSuccess(Object obj2) {
                                                a aVar4 = this.f24192a;
                                                f fVar = aVar4.f24150c;
                                                v9.o.h(fVar);
                                                g.x xVar = new g.x(new com.google.android.gms.internal.cast.a0(this.f24194c, this.f24193b, (Bundle) obj2, aVar4.f24148a.getPackageName()));
                                                v9.o.d("Must be called from the main thread.");
                                                try {
                                                    fVar.f24177a.C1(new v(xVar));
                                                } catch (RemoteException e10) {
                                                    f.f24176c.a("Unable to call %s on %s.", e10, "addSessionManagerListener", r.class.getSimpleName());
                                                }
                                            }
                                        });
                                    }
                                    if (z11) {
                                        p9.b bVar2 = v0.f7652i;
                                        synchronized (v0.class) {
                                            if (v0.f7654k == null) {
                                                v0.f7654k = new v0(sharedPreferences, hVar, packageName);
                                            }
                                        }
                                        v0.a(com.google.android.gms.internal.cast.d0.CAST_CONTEXT);
                                        return;
                                    }
                                    return;
                                default:
                                    this.f24184b.getClass();
                                    z1.a((Bundle) obj, "com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES");
                                    return;
                            }
                        }
                    });
                } catch (RemoteException e10) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e10);
                }
            } catch (RemoteException e11) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e11);
            }
        } catch (RemoteException e12) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e12);
        }
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull Context context) {
        v9.o.d("Must be called from the main thread.");
        if (f24147j == null) {
            synchronized (f24146i) {
                if (f24147j == null) {
                    d b10 = b(context.getApplicationContext());
                    b castOptions = b10.getCastOptions(context.getApplicationContext());
                    try {
                        f24147j = new a(context, castOptions, b10.getAdditionalSessionProviders(context.getApplicationContext()), new com.google.android.gms.internal.cast.c(r1.l.c(context), castOptions));
                    } catch (zzar e10) {
                        throw new RuntimeException(e10);
                    }
                }
            }
        }
        return f24147j;
    }

    public static d b(Context context) {
        try {
            Bundle bundle = ca.c.a(context).a(128, context.getPackageName()).metaData;
            if (bundle == null) {
                f24145h.d("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (d) Class.forName(string).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e10) {
            throw new IllegalStateException("Failed to initialize CastContext.", e10);
        }
    }
}
