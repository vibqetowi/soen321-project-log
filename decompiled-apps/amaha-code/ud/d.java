package ud;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import nd.d0;
import org.json.JSONObject;
import s1.s;
import tr.r;
import ya.i;
/* compiled from: SettingsController.java */
/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f34010a;

    /* renamed from: b  reason: collision with root package name */
    public final g f34011b;

    /* renamed from: c  reason: collision with root package name */
    public final gd.d f34012c;

    /* renamed from: d  reason: collision with root package name */
    public final r f34013d;

    /* renamed from: e  reason: collision with root package name */
    public final gd.d f34014e;
    public final s f;

    /* renamed from: g  reason: collision with root package name */
    public final d0 f34015g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<b> f34016h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReference<i<b>> f34017i;

    public d(Context context, g gVar, r rVar, gd.d dVar, gd.d dVar2, s sVar, d0 d0Var) {
        AtomicReference<b> atomicReference = new AtomicReference<>();
        this.f34016h = atomicReference;
        this.f34017i = new AtomicReference<>(new i());
        this.f34010a = context;
        this.f34011b = gVar;
        this.f34013d = rVar;
        this.f34012c = dVar;
        this.f34014e = dVar2;
        this.f = sVar;
        this.f34015g = d0Var;
        atomicReference.set(a.b(rVar));
    }

    public static void c(JSONObject jSONObject, String str) {
        StringBuilder c10 = v.h.c(str);
        c10.append(jSONObject.toString());
        String sb2 = c10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }

    public final b a(int i6) {
        boolean z10;
        b bVar = null;
        try {
            if (!v.h.b(2, i6)) {
                JSONObject i10 = this.f34014e.i();
                if (i10 != null) {
                    b h10 = this.f34012c.h(i10);
                    if (h10 != null) {
                        c(i10, "Loaded cached settings: ");
                        this.f34013d.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!v.h.b(3, i6)) {
                            if (h10.f34002c < currentTimeMillis) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                                }
                            }
                        }
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            bVar = h10;
                        } catch (Exception e10) {
                            e = e10;
                            bVar = h10;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return bVar;
                        }
                    } else {
                        Log.e("FirebaseCrashlytics", "Failed to parse cached settings data.", null);
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return bVar;
    }

    public final b b() {
        return this.f34016h.get();
    }
}
