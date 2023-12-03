package jl;

import android.content.pm.PackageInfo;
import android.os.Build;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.regex.Pattern;
import lv.c0;
import lv.v;
import org.json.JSONObject;
/* compiled from: NotV4FeedbackRepository.kt */
/* loaded from: classes2.dex */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f22352a = LogHelper.INSTANCE.makeLogTag("NotV4FeedbackRepository");

    public final Object a(int i6, String str, ls.d dVar) {
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("rating", i6);
            jSONObject2.put(str, true);
            hs.k kVar = hs.k.f19476a;
            String jSONObject3 = jSONObject.put("feedback", jSONObject2).toString();
            kotlin.jvm.internal.i.f(jSONObject3, "feedbackJson.toString()");
            Pattern pattern = lv.v.f24702d;
            ((or.b) nr.b.a(or.b.class)).b("https://api.theinnerhour.com/v1/employeefeedback", c0.a.a(jSONObject3, v.a.b("application/json; charset=utf-8"))).I(new r1(hVar, this));
        } catch (Exception e10) {
            hVar.resumeWith(Boolean.FALSE);
            LogHelper.INSTANCE.e(this.f22352a, e10);
        }
        return hVar.b();
    }

    public final Object b(String str, PackageInfo packageInfo, ls.d dVar) {
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedbackDetails", "feedback: " + str + " \n rating: " + FirebasePersistence.getInstance().getUser().getAppFeedback().getTopMenuFeedback());
            jSONObject.put("userName", SessionManager.getInstance().getStringValue(SessionManager.KEY_UID));
            jSONObject.put("versionName", packageInfo.versionName);
            jSONObject.put("versionCode", String.valueOf(h0.a.a(packageInfo)));
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("product", Build.PRODUCT);
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.i.f(jSONObject2, "feedbackJson.toString()");
            Pattern pattern = lv.v.f24702d;
            ((or.b) nr.b.a(or.b.class)).a("https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback", c0.a.a(jSONObject2, v.a.b("application/json; charset=utf-8"))).I(new s1(hVar, this));
        } catch (Exception e10) {
            hVar.resumeWith(Boolean.FALSE);
            LogHelper.INSTANCE.e(this.f22352a, e10);
        }
        return hVar.b();
    }
}
