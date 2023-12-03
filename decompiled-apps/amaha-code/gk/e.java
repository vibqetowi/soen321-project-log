package gk;

import com.bugsnag.android.internal.ImmutableConfigKt;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.jvm.internal.i;
/* compiled from: MixpanelUtils.kt */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f16584a = LogHelper.INSTANCE.makeLogTag("MixpanelUtils");

    /* renamed from: b  reason: collision with root package name */
    public final gv.e f16585b = new gv.e("@ihtest.com|@theinnerhour.com|@amahahealth.com");

    public final boolean a() {
        boolean z10;
        String userName;
        try {
            if (ca.a.k("staging", "preProd").contains(ImmutableConfigKt.RELEASE_STAGE_PRODUCTION)) {
                return false;
            }
            if (FirebaseAuth.getInstance().f != null) {
                User user = FirebasePersistence.getInstance().getUser();
                gv.e eVar = this.f16585b;
                if (user != null && (userName = user.getUserName()) != null && eVar.a(userName)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return false;
                }
                String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_UID);
                i.f(stringValue, "getInstance().getStringV…e(SessionManager.KEY_UID)");
                if (eVar.a(stringValue)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f16584a, e10);
            return false;
        }
    }
}
