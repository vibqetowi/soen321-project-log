package androidx.work;

import android.content.Context;
import androidx.work.b;
import java.util.Collections;
import java.util.List;
import n2.a0;
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements e2.b<v> {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3196a = q.f("WrkMgrInitializer");

    @Override // e2.b
    public final List<Class<? extends e2.b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // e2.b
    public final v b(Context context) {
        q.d().a(f3196a, "Initializing WorkManager with default configuration.");
        a0.g(context, new b(new b.a()));
        return a0.e(context);
    }
}
