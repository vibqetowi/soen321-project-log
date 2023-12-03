package ml;

import androidx.work.r;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.service.BootReceiverNotificationWorkManager;
import com.theinnerhour.b2b.service.PostLoginNotificationWorkManager;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.Collections;
/* compiled from: V2DashboardViewModel.kt */
/* loaded from: classes2.dex */
public final class y extends androidx.lifecycle.l0 {
    public final androidx.lifecycle.w<String> A;
    public final hs.i B;
    public final androidx.lifecycle.w<Boolean> C;

    /* renamed from: x  reason: collision with root package name */
    public final u f25609x;

    /* renamed from: y  reason: collision with root package name */
    public final String f25610y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.w<Integer> f25611z;

    /* compiled from: V2DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<ml.a> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f25612u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final ml.a invoke() {
            return new ml.a();
        }
    }

    public y(u repository) {
        kotlin.jvm.internal.i.g(repository, "repository");
        this.f25609x = repository;
        this.f25610y = LogHelper.INSTANCE.makeLogTag("V2DashboardViewModel");
        this.f25611z = new androidx.lifecycle.w<>();
        this.A = new androidx.lifecycle.w<>();
        this.B = sp.b.O(a.f25612u);
        this.C = new androidx.lifecycle.w<>();
        if (!defpackage.b.u(SessionManager.KEY_USERTYPE, "patient") && LocationPersistence.INSTANCE.isIndianUser()) {
            ta.v.H(kc.f.H(this), null, 0, new z(this, null), 3);
        }
        try {
            if (ApplicationPersistence.getInstance().containsKey(PostLoginNotificationWorkManager.POST_LOGIN_NOTIFICATION_ATTEMPT) && ApplicationPersistence.getInstance().getIntValue(PostLoginNotificationWorkManager.POST_LOGIN_NOTIFICATION_ATTEMPT, 0) < 3) {
                n2.a0 e10 = n2.a0.e(MyApplication.V.a().getApplicationContext());
                e10.getClass();
                e10.c(Collections.singletonList(new r.a(PostLoginNotificationWorkManager.class).a())).M(Collections.singletonList(new r.a(BootReceiverNotificationWorkManager.class).a())).J();
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.f25610y, e11);
        }
    }

    public final void e() {
        try {
            ta.v.H(kc.f.H(this), null, 0, new b0(this, "https://api.theinnerhour.com/v1/communities/customers/get_group_info", null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f25610y, e10);
        }
    }
}
