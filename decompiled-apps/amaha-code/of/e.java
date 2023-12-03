package of;

import android.content.Context;
import java.util.HashMap;
/* compiled from: ConfigStorageClient.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f27453c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f27454a;

    /* renamed from: b  reason: collision with root package name */
    public final String f27455b;

    public e(Context context, String str) {
        this.f27454a = context;
        this.f27455b = str;
    }

    public final synchronized void a() {
        this.f27454a.deleteFile(this.f27455b);
    }
}
