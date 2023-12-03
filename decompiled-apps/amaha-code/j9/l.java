package j9;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final y9.a f21764a = new y9.a("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f21764a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static void b(Context context) {
        m.a(context).b();
        Iterator<com.google.android.gms.common.api.c> it = com.google.android.gms.common.api.c.a().iterator();
        if (!it.hasNext()) {
            synchronized (com.google.android.gms.common.api.internal.f.K) {
                com.google.android.gms.common.api.internal.f fVar = com.google.android.gms.common.api.internal.f.L;
                if (fVar != null) {
                    fVar.C.incrementAndGet();
                    ka.d dVar = fVar.G;
                    dVar.sendMessageAtFrontOfQueue(dVar.obtainMessage(10));
                }
            }
            return;
        }
        it.next().getClass();
        throw new UnsupportedOperationException();
    }
}
