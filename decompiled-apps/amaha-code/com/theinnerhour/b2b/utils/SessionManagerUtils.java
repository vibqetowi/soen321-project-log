package com.theinnerhour.b2b.utils;

import android.content.SharedPreferences;
import com.theinnerhour.b2b.components.login.model.EmailLoginResponseDataModel;
import kotlin.Metadata;
/* compiled from: SessionManagerUtils.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/theinnerhour/b2b/utils/SessionManagerUtils;", "", "Lcom/theinnerhour/b2b/components/login/model/EmailLoginResponseDataModel;", "data", "Lhs/k;", "parseLoginResponse", "Lcom/theinnerhour/b2b/utils/SessionManager;", "persistence", "Lcom/theinnerhour/b2b/utils/SessionManager;", "Landroid/content/SharedPreferences;", "pref$delegate", "Lhs/d;", "getPref", "()Landroid/content/SharedPreferences;", "pref", "Landroid/content/SharedPreferences$Editor;", "editor$delegate", "getEditor", "()Landroid/content/SharedPreferences$Editor;", "editor", "", "versionCode$delegate", "getVersionCode", "()Ljava/lang/String;", "versionCode", "<init>", "(Lcom/theinnerhour/b2b/utils/SessionManager;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SessionManagerUtils {
    private final hs.d editor$delegate;
    private final SessionManager persistence;
    private final hs.d pref$delegate;
    private final hs.d versionCode$delegate;

    public SessionManagerUtils(SessionManager persistence) {
        kotlin.jvm.internal.i.g(persistence, "persistence");
        this.persistence = persistence;
        this.pref$delegate = sp.b.O(new SessionManagerUtils$pref$2(this));
        this.editor$delegate = sp.b.O(new SessionManagerUtils$editor$2(this));
        this.versionCode$delegate = sp.b.O(SessionManagerUtils$versionCode$2.INSTANCE);
    }

    public final SharedPreferences.Editor getEditor() {
        Object value = this.editor$delegate.getValue();
        kotlin.jvm.internal.i.f(value, "<get-editor>(...)");
        return (SharedPreferences.Editor) value;
    }

    public final SharedPreferences getPref() {
        Object value = this.pref$delegate.getValue();
        kotlin.jvm.internal.i.f(value, "<get-pref>(...)");
        return (SharedPreferences) value;
    }

    public final String getVersionCode() {
        return (String) this.versionCode$delegate.getValue();
    }

    public final void parseLoginResponse(EmailLoginResponseDataModel data) {
        kotlin.jvm.internal.i.g(data, "data");
        SessionManager sessionManager = this.persistence;
        sessionManager.createLoginSession(data.getId(), data.getUid(), data.getUuid(), data.getImage(), data.getFirstName(), data.getLastName(), data.getUsertype(), "NA", "NA", data.getMobile(), data.getCountryCode(), data.getMobileVerified(), data.isVerified());
        sessionManager.setUserLoggedIn(true);
        String organisationName = data.getOrganisationName();
        if (organisationName != null) {
            sessionManager.setStringValue(SessionManager.KEY_ORGANISATION_NAME, organisationName);
        }
        String token = data.getToken();
        if (token != null) {
            sessionManager.setStringValue(SessionManager.KEY_FB_TOKEN, token);
        }
        String organisationId = data.getOrganisationId();
        if (organisationId != null) {
            sessionManager.setStringValue(SessionManager.KEY_ORGANISATION_ID, organisationId);
        }
        String myTherapist = data.getMyTherapist();
        if (myTherapist != null) {
            sessionManager.setStringValue(SessionManager.KEY_MYTHERAPIST, myTherapist);
        }
        String myCoupleTherapist = data.getMyCoupleTherapist();
        if (myCoupleTherapist != null) {
            sessionManager.setStringValue(SessionManager.KEY_MYCOUPLESTHERAPIST, myCoupleTherapist);
        }
        String myPsychiatrist = data.getMyPsychiatrist();
        if (myPsychiatrist != null) {
            sessionManager.setStringValue(SessionManager.KEY_MYPSYCHIATRIST, myPsychiatrist);
        }
        String alias = data.getAlias();
        if (alias != null) {
            sessionManager.setStringValue(SessionManager.ALIAS, alias);
        }
        Long partnerId = data.getPartnerId();
        if (partnerId != null) {
            sessionManager.setLongValue(SessionManager.KEY_PARTNER_ID, Long.valueOf(partnerId.longValue()));
        }
        sessionManager.setStringValue(SessionManager.KEY_PASS, "");
        sessionManager.setStringValue(SessionManager.KEY_EMAIL, "");
        String uuid = data.getUuid();
        if (uuid != null) {
            jd.e.a().c(uuid);
        }
    }
}
