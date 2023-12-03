package ll;

import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import hs.i;
import java.util.HashMap;
import kotlin.jvm.internal.k;
/* compiled from: B2BOverrideExperimentChecker.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f24407a = !defpackage.b.u(SessionManager.KEY_USERTYPE, "patient");

    /* renamed from: b  reason: collision with root package name */
    public final i f24408b = sp.b.O(C0387a.f24409u);

    /* compiled from: B2BOverrideExperimentChecker.kt */
    /* renamed from: ll.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0387a extends k implements ss.a<Boolean> {

        /* renamed from: u  reason: collision with root package name */
        public static final C0387a f24409u = new C0387a();

        public C0387a() {
            super(0);
        }

        @Override // ss.a
        public final Boolean invoke() {
            return Boolean.valueOf(ApplicationPersistence.getInstance().getBooleanValue("b2b_experiment_check", false));
        }
    }

    public final hs.f<String, Boolean> a() {
        Object obj;
        boolean z10;
        HashMap<String, Object> appConfig;
        User user = FirebasePersistence.getInstance().getUser();
        String str = null;
        if (user != null && (appConfig = user.getAppConfig()) != null) {
            obj = appConfig.get(Constants.JOURNAL_EXPERIMENT);
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        }
        if (str == null) {
            str = "default";
        }
        if (this.f24407a && !((Boolean) this.f24408b.getValue()).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new hs.f<>(str, Boolean.valueOf(z10));
    }

    public final hs.f<String, Boolean> b() {
        Object obj;
        boolean z10;
        HashMap<String, Object> appConfig;
        User user = FirebasePersistence.getInstance().getUser();
        String str = null;
        if (user != null && (appConfig = user.getAppConfig()) != null) {
            obj = appConfig.get(Constants.LIBRARY_EXPERIMENT_V3);
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        }
        if (str == null) {
            str = "default";
        }
        if (this.f24407a && !((Boolean) this.f24408b.getValue()).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new hs.f<>(str, Boolean.valueOf(z10));
    }
}
