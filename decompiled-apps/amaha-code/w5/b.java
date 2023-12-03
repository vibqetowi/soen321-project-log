package w5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: BoltsMeasurementEventListener.kt */
/* loaded from: classes.dex */
public final class b extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    public static b f36435b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f36436a;

    /* compiled from: BoltsMeasurementEventListener.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Context context) {
            if (b.a() != null) {
                b.a();
                return;
            }
            b bVar = new b(context);
            if (!b6.a.b(b.class)) {
                try {
                    if (!b6.a.b(bVar)) {
                        n1.a a10 = n1.a.a(bVar.f36436a);
                        kotlin.jvm.internal.i.f(a10, "getInstance(applicationContext)");
                        a10.b(bVar, new IntentFilter("com.parse.bolts.measurement_event"));
                    }
                } catch (Throwable th2) {
                    b6.a.a(b.class, th2);
                }
            }
            if (!b6.a.b(b.class)) {
                try {
                    b.f36435b = bVar;
                } catch (Throwable th3) {
                    b6.a.a(b.class, th3);
                }
            }
            b.a();
        }
    }

    public b(Context context) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.i.f(applicationContext, "context.applicationContext");
        this.f36436a = applicationContext;
    }

    public static final /* synthetic */ b a() {
        if (b6.a.b(b.class)) {
            return null;
        }
        try {
            return f36435b;
        } catch (Throwable th2) {
            b6.a.a(b.class, th2);
            return null;
        }
    }

    public final void finalize() {
        if (b6.a.b(this)) {
            return;
        }
        try {
            if (!b6.a.b(this)) {
                n1.a a10 = n1.a.a(this.f36436a);
                kotlin.jvm.internal.i.f(a10, "getInstance(applicationContext)");
                a10.d(this);
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        Bundle bundleExtra;
        if (b6.a.b(this)) {
            return;
        }
        try {
            Set<String> set = null;
            i5.i iVar = new i5.i(context, (String) null);
            if (intent == null) {
                stringExtra = null;
            } else {
                stringExtra = intent.getStringExtra("event_name");
            }
            String n10 = kotlin.jvm.internal.i.n(stringExtra, "bf_");
            if (intent == null) {
                bundleExtra = null;
            } else {
                bundleExtra = intent.getBundleExtra("event_args");
            }
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                set = bundleExtra.keySet();
            }
            if (set != null) {
                for (String key : set) {
                    kotlin.jvm.internal.i.f(key, "key");
                    Pattern compile = Pattern.compile("[^0-9a-zA-Z _-]");
                    kotlin.jvm.internal.i.f(compile, "compile(pattern)");
                    String replaceAll = compile.matcher(key).replaceAll("-");
                    kotlin.jvm.internal.i.f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                    Pattern compile2 = Pattern.compile("^[ -]*");
                    kotlin.jvm.internal.i.f(compile2, "compile(pattern)");
                    String replaceAll2 = compile2.matcher(replaceAll).replaceAll("");
                    kotlin.jvm.internal.i.f(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
                    Pattern compile3 = Pattern.compile("[ -]*$");
                    kotlin.jvm.internal.i.f(compile3, "compile(pattern)");
                    String replaceAll3 = compile3.matcher(replaceAll2).replaceAll("");
                    kotlin.jvm.internal.i.f(replaceAll3, "nativePattern.matcher(in…).replaceAll(replacement)");
                    bundle.putString(replaceAll3, (String) bundleExtra.get(key));
                }
            }
            h5.p pVar = h5.p.f17269a;
            if (h5.g0.b()) {
                iVar.d(bundle, n10);
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
