package bh;

import ad.h;
import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;
import pg.g;
/* compiled from: GlobalCache.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static h f4293b;

    /* renamed from: c  reason: collision with root package name */
    public static String f4294c;

    /* renamed from: a  reason: collision with root package name */
    public static final a f4292a = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashMap f4295d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final g f4296e = new g();

    public static h a(Context context) {
        h f;
        i.g(context, "context");
        h hVar = f4293b;
        if (hVar == null) {
            synchronized (a.class) {
                f = di.b.f(context);
                f4293b = f;
            }
            return f;
        }
        return hVar;
    }
}
