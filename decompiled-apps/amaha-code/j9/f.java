package j9;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Semaphore;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes.dex */
public final class f extends m1.a {

    /* renamed from: j  reason: collision with root package name */
    public final Semaphore f21760j;

    /* renamed from: k  reason: collision with root package name */
    public final Set f21761k;

    public f(Context context, Set set) {
        super(context);
        this.f21760j = new Semaphore(0);
        this.f21761k = set;
    }
}
