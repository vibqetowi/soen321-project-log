package l5;

import android.hardware.SensorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: CodelessManager.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static SensorManager f24061c;

    /* renamed from: d  reason: collision with root package name */
    public static e f24062d;

    /* renamed from: e  reason: collision with root package name */
    public static String f24063e;

    /* renamed from: h  reason: collision with root package name */
    public static volatile boolean f24065h;

    /* renamed from: a  reason: collision with root package name */
    public static final b f24059a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final f f24060b = new f();
    public static final AtomicBoolean f = new AtomicBoolean(true);

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicBoolean f24064g = new AtomicBoolean(false);

    public static final String a() {
        if (b6.a.b(b.class)) {
            return null;
        }
        try {
            if (f24063e == null) {
                f24063e = UUID.randomUUID().toString();
            }
            String str = f24063e;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th2) {
            b6.a.a(b.class, th2);
            return null;
        }
    }
}
