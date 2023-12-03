package com.theinnerhour.b2b.utils;

import android.content.Context;
import com.appsflyer.R;
import com.theinnerhour.b2b.MyApplication;
import dw.z;
import kotlin.Metadata;
import lv.s;
import org.json.JSONObject;
/* compiled from: CustomRetrofitCallback.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/theinnerhour/b2b/utils/CustomRetrofitCallback;", "T", "Ldw/d;", "Ldw/b;", "call", "Ldw/z;", "response", "Lhs/k;", "onResponse", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface CustomRetrofitCallback<T> extends dw.d<T> {

    /* compiled from: CustomRetrofitCallback.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static <T> void onResponse(CustomRetrofitCallback<T> customRetrofitCallback, dw.b<T> call, z<T> response) {
            z<T> zVar;
            T t3;
            String obj;
            boolean z10;
            s sVar;
            kotlin.jvm.internal.i.g(call, "call");
            kotlin.jvm.internal.i.g(response, "response");
            try {
                String str = null;
                if (response.a()) {
                    zVar = response;
                } else {
                    zVar = null;
                }
                if (zVar != null && (sVar = zVar.f13695a.f24588z) != null) {
                    SessionManager.getInstance().saveHeaders(sVar.g("access-token"), sVar.g(SessionManager.KEY_CLIENT), sVar.g("Content-Type"), sVar.g(SessionManager.KEY_EXPIRY), sVar.g(SessionManager.KEY_UID), sVar.g("fb-token"));
                }
                if (!response.a() && response.f13695a.f24586x == 401 && !ca.a.k("https://api.theinnerhour.com/v1/authenticate/sign_in", "https://api.theinnerhour.com/v1/authenticate/", "https://api.theinnerhour.com/v1/authenticate/sign_out").contains(call.s().f24751a.f24693i)) {
                    gk.a.b(null, "app_401_logout ");
                    Utils utils = Utils.INSTANCE;
                    Context applicationContext = MyApplication.V.a().getApplicationContext();
                    kotlin.jvm.internal.i.f(applicationContext, "MyApplication.instance.applicationContext");
                    utils.logout(applicationContext, null, null);
                }
                if (response.a() && kotlin.jvm.internal.i.b(call.s().f24751a.f24693i, "https://api.theinnerhour.com/v1/giveaccesstoken") && (t3 = response.f13696b) != null && (obj = t3.toString()) != null) {
                    try {
                        String tt2 = new JSONObject(obj).optString("serialtoken", "");
                        kotlin.jvm.internal.i.f(tt2, "tt");
                        if (tt2.length() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            str = tt2;
                        }
                        if (str != null) {
                            MyApplication.V.a().O = str;
                            hs.k kVar = hs.k.f19476a;
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e("RetrofitTokenStore", e10);
                        hs.k kVar2 = hs.k.f19476a;
                    }
                }
            } catch (Exception e11) {
                LogHelper.INSTANCE.e("RetrofitCallback", e11);
            }
        }
    }

    @Override // dw.d
    /* synthetic */ void onFailure(dw.b<T> bVar, Throwable th2);

    @Override // dw.d
    void onResponse(dw.b<T> bVar, z<T> zVar);
}
