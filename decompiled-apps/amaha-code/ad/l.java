package ad;

import android.content.Context;
import android.content.SharedPreferences;
import v9.o;
/* compiled from: StorageHelper.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final dm.e f517b = new dm.e(l.class.getSimpleName());

    /* renamed from: a  reason: collision with root package name */
    public final hd.l<SharedPreferences> f518a;

    public l(Context context, String str) {
        o.h(context);
        o.e(str);
        this.f518a = new hd.l<>(new k(context, String.format("com.google.firebase.appcheck.store.%s", str), 0));
    }
}
