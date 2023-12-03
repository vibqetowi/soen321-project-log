package ql;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: PersistentStorage.kt */
/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f29706c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static volatile e0 f29707d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29708a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f29709b;

    /* compiled from: PersistentStorage.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    public e0(Context context) {
        this.f29708a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("audio", 0);
        kotlin.jvm.internal.i.f(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f29709b = sharedPreferences;
    }
}
