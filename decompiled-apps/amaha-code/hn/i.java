package hn;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import org.json.JSONObject;
/* compiled from: LoginSignupReworkRepository.kt */
/* loaded from: classes2.dex */
public final class i implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j<hs.f<Boolean, String>> f17875u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ b f17876v;

    public i(kotlinx.coroutines.k kVar, b bVar) {
        this.f17875u = kVar;
        this.f17876v = bVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        kotlinx.coroutines.j<hs.f<Boolean, String>> jVar = this.f17875u;
        if (jVar.a()) {
            jVar.resumeWith(new hs.f(Boolean.FALSE, "Something went wrong"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d A[Catch: Exception -> 0x006a, TryCatch #0 {Exception -> 0x006a, blocks: (B:3:0x0011, B:5:0x0018, B:7:0x001e, B:8:0x0029, B:10:0x002f, B:12:0x0033, B:14:0x0039, B:16:0x003f, B:28:0x0063, B:23:0x004d, B:25:0x005a), top: B:35:0x0011 }] */
    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
        String str;
        boolean z10;
        kotlinx.coroutines.j<hs.f<Boolean, String>> jVar = this.f17875u;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        try {
            String str2 = null;
            if (response.a()) {
                if (jVar.a()) {
                    jVar.resumeWith(new hs.f(Boolean.TRUE, null));
                }
            } else if (jVar.a()) {
                lv.e0 e0Var = response.f13697c;
                if (e0Var != null) {
                    str = e0Var.h();
                } else {
                    str = null;
                }
                Boolean bool = Boolean.FALSE;
                if (str != null && str.length() != 0) {
                    z10 = false;
                    if (!z10) {
                        JSONObject optJSONObject = new JSONObject(str).optJSONObject("status");
                        if (optJSONObject != null) {
                            str2 = optJSONObject.optString("message");
                        }
                        if (str2 == null) {
                        }
                        jVar.resumeWith(new hs.f(bool, str2));
                    }
                    str2 = "Something went wrong";
                    jVar.resumeWith(new hs.f(bool, str2));
                }
                z10 = true;
                if (!z10) {
                }
                str2 = "Something went wrong";
                jVar.resumeWith(new hs.f(bool, str2));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17876v.f17789a, "exception", e10);
            if (jVar.a()) {
                jVar.resumeWith(new hs.f(Boolean.FALSE, "Something went wrong"));
            }
        }
    }
}
