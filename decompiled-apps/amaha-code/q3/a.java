package q3;

import android.content.SharedPreferences;
import kotlin.jvm.internal.i;
/* compiled from: AndroidKVS.kt */
/* loaded from: classes.dex */
public final class a implements b4.a {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f29120a;

    public a(SharedPreferences sharedPreferences) {
        this.f29120a = sharedPreferences;
    }

    @Override // b4.a
    public final long a(String key) {
        i.g(key, "key");
        return this.f29120a.getLong(key, 0L);
    }

    @Override // b4.a
    public final boolean b(long j10, String key) {
        i.g(key, "key");
        return this.f29120a.edit().putLong(key, j10).commit();
    }
}
