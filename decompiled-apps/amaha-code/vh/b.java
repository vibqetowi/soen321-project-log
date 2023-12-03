package vh;

import android.database.Cursor;
import ih.p;
import kotlinx.coroutines.e0;
import nd.z;
import t0.l0;
/* compiled from: KeyValueStore.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final v.c f35105a;

    /* renamed from: b  reason: collision with root package name */
    public final p f35106b;

    /* renamed from: c  reason: collision with root package name */
    public final String f35107c;

    /* renamed from: d  reason: collision with root package name */
    public final e0 f35108d;

    public b(v.c cVar, p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f35105a = cVar;
        this.f35106b = sdkInstance;
        this.f35107c = "Core_KeyValueStore";
        this.f35108d = new e0(10);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mh.e a() {
        Exception e10;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            cursor = this.f35105a.g("KEY_VALUE_STORE", new p0.f(l0.f32336u, new z("key = ? ", 11, new String[]{"remote_configuration"}), null, 0, 60));
            if (cursor != null) {
                try {
                    try {
                        if (cursor.moveToFirst()) {
                            this.f35108d.getClass();
                            mh.e r = e0.r(cursor);
                            cursor.close();
                            return r;
                        }
                    } catch (Exception e11) {
                        e10 = e11;
                        this.f35106b.f20105d.a(1, e10, new a(this));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    cursor2 = cursor;
                    th = th2;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Exception e12) {
            e10 = e12;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }
}
