package dl;

import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class y1 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public static final y1 f13136u = new y1();

    public y1() {
        super(1);
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        Boolean it = bool;
        kotlin.jvm.internal.i.f(it, "it");
        if (it.booleanValue()) {
            ApplicationPersistence.getInstance().setLongValue(Constants.FETCH_LIBRARY_CONTENT_ON_DB_TIME, Utils.INSTANCE.getTodayTimeInSeconds());
        }
        return hs.k.f19476a;
    }
}
