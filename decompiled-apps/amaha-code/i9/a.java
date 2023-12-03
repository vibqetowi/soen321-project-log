package i9;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.b;
import com.google.android.gms.dynamite.DynamiteModule;
import kotlinx.coroutines.e0;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes.dex */
public final class a extends com.google.android.gms.common.api.b<GoogleSignInOptions> {

    /* renamed from: k  reason: collision with root package name */
    public static int f19916k = 1;

    public a(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, h9.a.f17345a, googleSignInOptions, new b.a(new e0(5), Looper.getMainLooper()));
    }

    public final synchronized int c() {
        int i6;
        i6 = f19916k;
        if (i6 == 1) {
            Context context = this.f7306a;
            s9.e eVar = s9.e.f31337d;
            int b10 = eVar.b(12451000, context);
            if (b10 == 0) {
                i6 = 4;
                f19916k = 4;
            } else if (eVar.a(context, null, b10) == null && DynamiteModule.a(context, "com.google.android.gms.auth.api.fallback") != 0) {
                i6 = 3;
                f19916k = 3;
            } else {
                i6 = 2;
                f19916k = 2;
            }
        }
        return i6;
    }
}
