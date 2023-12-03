package of;

import android.util.Log;
import androidx.emoji2.text.g;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONException;
import ya.v;
/* compiled from: ConfigGetParameterHandler.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f27448e;
    public static final Pattern f;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f27449a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Executor f27450b;

    /* renamed from: c  reason: collision with root package name */
    public final b f27451c;

    /* renamed from: d  reason: collision with root package name */
    public final b f27452d;

    static {
        Charset.forName("UTF-8");
        f27448e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public d(Executor executor, b bVar, b bVar2) {
        this.f27450b = executor;
        this.f27451c = bVar;
        this.f27452d = bVar2;
    }

    public static c c(b bVar) {
        synchronized (bVar) {
            v vVar = bVar.f27441c;
            if (vVar != null && vVar.isSuccessful()) {
                return (c) bVar.f27441c.getResult();
            }
            try {
                return (c) b.a(bVar.b(), TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e10);
                return null;
            }
        }
    }

    public static HashSet d(b bVar) {
        HashSet hashSet = new HashSet();
        c c10 = c(bVar);
        if (c10 == null) {
            return hashSet;
        }
        Iterator<String> keys = c10.f27444b.keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    public static String e(b bVar, String str) {
        c c10 = c(bVar);
        if (c10 == null) {
            return null;
        }
        try {
            return c10.f27444b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void f(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public final void a(nf.e eVar) {
        synchronized (this.f27449a) {
            this.f27449a.add(eVar);
        }
    }

    public final void b(c cVar, String str) {
        if (cVar == null) {
            return;
        }
        synchronized (this.f27449a) {
            Iterator it = this.f27449a.iterator();
            while (it.hasNext()) {
                this.f27450b.execute(new g(19, (aa.b) it.next(), str, cVar));
            }
        }
    }
}
