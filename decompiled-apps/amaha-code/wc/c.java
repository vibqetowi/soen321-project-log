package wc;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.w0;
import com.theinnerhour.b2b.utils.SessionManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import v9.o;
import wc.a;
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile c f36679c;

    /* renamed from: a  reason: collision with root package name */
    public final sa.a f36680a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f36681b;

    public c(sa.a aVar) {
        o.h(aVar);
        this.f36680a = aVar;
        this.f36681b = new ConcurrentHashMap();
    }

    @Override // wc.a
    public final Map<String, Object> a(boolean z10) {
        return this.f36680a.f31379a.f(null, null, z10);
    }

    @Override // wc.a
    public final void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (!xc.a.c(str) || !xc.a.b(bundle2, str2) || !xc.a.a(str, str2, bundle2)) {
            return;
        }
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle2.putLong("_r", 1L);
        }
        j1 j1Var = this.f36680a.f31379a;
        j1Var.getClass();
        j1Var.b(new d1(j1Var, str, str2, bundle2, true));
    }

    @Override // wc.a
    public final int c(String str) {
        return this.f36680a.f31379a.c(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (r3 == null) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(a.b bVar) {
        boolean z10;
        String str;
        String str2;
        String str3;
        Throwable th2;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        HashSet hashSet = xc.a.f37721a;
        String str4 = bVar.f36665a;
        if (str4 != null && !str4.isEmpty()) {
            Object obj = bVar.f36667c;
            if (obj != null) {
                Object obj2 = null;
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            objectOutputStream.writeObject(obj);
                            objectOutputStream.flush();
                            objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                        } catch (Throwable th3) {
                            th2 = th3;
                            objectInputStream = null;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        objectInputStream = null;
                        objectOutputStream = null;
                    }
                    try {
                        Object readObject = objectInputStream.readObject();
                        objectOutputStream.close();
                        objectInputStream.close();
                        obj2 = readObject;
                    } catch (Throwable th5) {
                        th2 = th5;
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        throw th2;
                    }
                } catch (IOException | ClassNotFoundException unused) {
                }
            }
            if (xc.a.c(str4) && xc.a.d(str4, bVar.f36666b) && (((str = bVar.f36674k) == null || (xc.a.b(bVar.f36675l, str) && xc.a.a(str4, bVar.f36674k, bVar.f36675l))) && (((str2 = bVar.f36671h) == null || (xc.a.b(bVar.f36672i, str2) && xc.a.a(str4, bVar.f36671h, bVar.f36672i))) && ((str3 = bVar.f) == null || (xc.a.b(bVar.f36670g, str3) && xc.a.a(str4, bVar.f, bVar.f36670g)))))) {
                z10 = true;
                if (z10) {
                    return;
                }
                Bundle bundle = new Bundle();
                String str5 = bVar.f36665a;
                if (str5 != null) {
                    bundle.putString("origin", str5);
                }
                String str6 = bVar.f36666b;
                if (str6 != null) {
                    bundle.putString(SessionManager.KEY_NAME, str6);
                }
                Object obj3 = bVar.f36667c;
                if (obj3 != null) {
                    f6.b.Z0(bundle, obj3);
                }
                String str7 = bVar.f36668d;
                if (str7 != null) {
                    bundle.putString("trigger_event_name", str7);
                }
                bundle.putLong("trigger_timeout", bVar.f36669e);
                String str8 = bVar.f;
                if (str8 != null) {
                    bundle.putString("timed_out_event_name", str8);
                }
                Bundle bundle2 = bVar.f36670g;
                if (bundle2 != null) {
                    bundle.putBundle("timed_out_event_params", bundle2);
                }
                String str9 = bVar.f36671h;
                if (str9 != null) {
                    bundle.putString("triggered_event_name", str9);
                }
                Bundle bundle3 = bVar.f36672i;
                if (bundle3 != null) {
                    bundle.putBundle("triggered_event_params", bundle3);
                }
                bundle.putLong("time_to_live", bVar.f36673j);
                String str10 = bVar.f36674k;
                if (str10 != null) {
                    bundle.putString("expired_event_name", str10);
                }
                Bundle bundle4 = bVar.f36675l;
                if (bundle4 != null) {
                    bundle.putBundle("expired_event_params", bundle4);
                }
                bundle.putLong("creation_timestamp", bVar.f36676m);
                bundle.putBoolean("active", bVar.f36677n);
                bundle.putLong("triggered_timestamp", bVar.f36678o);
                j1 j1Var = this.f36680a.f31379a;
                j1Var.getClass();
                j1Var.b(new v0(j1Var, bundle, 0));
                return;
            }
        }
        z10 = false;
        if (z10) {
        }
    }

    @Override // wc.a
    public final void e(String str) {
        j1 j1Var = this.f36680a.f31379a;
        j1Var.getClass();
        j1Var.b(new w0(j1Var, str, null, null, 0));
    }

    @Override // wc.a
    public final b f(String str, jd.c cVar) {
        boolean z10;
        Object obj;
        if (!xc.a.c(str)) {
            return null;
        }
        boolean isEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.f36681b;
        if (!isEmpty && concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        boolean equals = "fiam".equals(str);
        sa.a aVar = this.f36680a;
        if (equals) {
            obj = new xc.c(aVar, cVar);
        } else if ("clx".equals(str)) {
            obj = new xc.e(aVar, cVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        concurrentHashMap.put(str, obj);
        return new b();
    }

    @Override // wc.a
    public final ArrayList g(String str) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f36680a.f31379a.e(str, "")) {
            HashSet hashSet = xc.a.f37721a;
            o.h(bundle);
            a.b bVar = new a.b();
            String str2 = (String) f6.b.W0(bundle, "origin", String.class, null);
            o.h(str2);
            bVar.f36665a = str2;
            String str3 = (String) f6.b.W0(bundle, SessionManager.KEY_NAME, String.class, null);
            o.h(str3);
            bVar.f36666b = str3;
            bVar.f36667c = f6.b.W0(bundle, "value", Object.class, null);
            bVar.f36668d = (String) f6.b.W0(bundle, "trigger_event_name", String.class, null);
            bVar.f36669e = ((Long) f6.b.W0(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            bVar.f = (String) f6.b.W0(bundle, "timed_out_event_name", String.class, null);
            bVar.f36670g = (Bundle) f6.b.W0(bundle, "timed_out_event_params", Bundle.class, null);
            bVar.f36671h = (String) f6.b.W0(bundle, "triggered_event_name", String.class, null);
            bVar.f36672i = (Bundle) f6.b.W0(bundle, "triggered_event_params", Bundle.class, null);
            bVar.f36673j = ((Long) f6.b.W0(bundle, "time_to_live", Long.class, 0L)).longValue();
            bVar.f36674k = (String) f6.b.W0(bundle, "expired_event_name", String.class, null);
            bVar.f36675l = (Bundle) f6.b.W0(bundle, "expired_event_params", Bundle.class, null);
            bVar.f36677n = ((Boolean) f6.b.W0(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            bVar.f36676m = ((Long) f6.b.W0(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            bVar.f36678o = ((Long) f6.b.W0(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // wc.a
    public final void h(String str) {
        if (!xc.a.c("fcm") || !xc.a.d("fcm", "_ln")) {
            return;
        }
        j1 j1Var = this.f36680a.f31379a;
        j1Var.getClass();
        j1Var.b(new a1(j1Var, "fcm", "_ln", (Object) str, true));
    }
}
