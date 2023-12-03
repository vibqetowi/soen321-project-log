package jp;

import android.os.Bundle;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationInterface;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.DefaultDispatcherProvider;
import com.theinnerhour.b2b.utils.DispatcherProvider;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import dw.z;
import gv.n;
import hs.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import ls.h;
import nf.c;
import or.l;
import org.json.JSONObject;
import r1.b0;
import sf.m;
/* compiled from: SplashScreenRepository.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final DispatcherProvider f22534a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22535b;

    /* compiled from: SplashScreenRepository.kt */
    /* renamed from: jp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0339a<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nf.b f22536a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f22537b;

        public C0339a(nf.b bVar, a aVar, h hVar) {
            this.f22536a = bVar;
            this.f22537b = hVar;
        }

        @Override // ya.d
        public final void a(ya.h<Boolean> it) {
            boolean z10;
            i.g(it, "it");
            boolean isSuccessful = it.isSuccessful();
            boolean z11 = true;
            ls.d<Boolean> dVar = this.f22537b;
            if (isSuccessful) {
                nf.b bVar = this.f22536a;
                bVar.a();
                if (i.b(ApplicationPersistence.getInstance().getStringValue(Constants.LOGIN_SCREEN_EXPERIMENT), "") && LocationPersistence.INSTANCE.isIndianUser()) {
                    ApplicationPersistence.getInstance().setStringValue(Constants.LOGIN_SCREEN_EXPERIMENT, bVar.f(Constants.LOGIN_SCREEN_EXPERIMENT));
                }
                String stringValue = ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT);
                if (stringValue != null && !n.B0(stringValue)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    Boolean ENABLE_ONBOARDING_VARIANT = Constants.ENABLE_ONBOARDING_VARIANT;
                    i.f(ENABLE_ONBOARDING_VARIANT, "ENABLE_ONBOARDING_VARIANT");
                    if (ENABLE_ONBOARDING_VARIANT.booleanValue()) {
                        ApplicationPersistence.getInstance().setStringValue(Constants.ONBOARDING_EXPERIMENT, Constants.ONBOARDING_VARIANT);
                    } else if (FirebaseAuth.getInstance().f != null) {
                        ApplicationPersistence.getInstance().setStringValue(Constants.ONBOARDING_EXPERIMENT, Constants.ONBOARDING_VARIANT);
                    } else {
                        ApplicationPersistence.getInstance().setStringValue(Constants.ONBOARDING_EXPERIMENT, Constants.ONBOARDING_VARIANT);
                    }
                    String str = gk.a.f16573a;
                    Bundle a10 = b0.a("variant", Constants.ONBOARDING_VARIANT);
                    k kVar = k.f19476a;
                    gk.a.b(a10, Constants.ONBOARDING_EXPERIMENT_EVENT);
                }
                ApplicationPersistence.getInstance().setBooleanValue(Constants.A3_ONBOARDING_EXPERIMENT, bVar.d(Constants.A3_ONBOARDING_EXPERIMENT));
                ApplicationPersistence.getInstance().setBooleanValue(Constants.COMMUNITIES_ENABLED, bVar.d(Constants.COMMUNITIES_ENABLED));
                ApplicationPersistence.getInstance().setBooleanValue(Constants.PROVIDER_INITIAL_DISCOUNT, bVar.d(Constants.PROVIDER_INITIAL_DISCOUNT));
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    if (!FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP)) {
                        HashMap<String, Object> appConfig = user.getAppConfig();
                        i.f(appConfig, "appConfig");
                        appConfig.put(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP, Boolean.valueOf(bVar.d(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP)));
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    }
                } else {
                    ApplicationPersistence.getInstance().setBooleanValue(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP, bVar.d(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP));
                }
                ApplicationPersistence.getInstance().setBooleanValue(Constants.OFFLINE_CARD_EXPERT_CARE, bVar.d(Constants.OFFLINE_CARD_EXPERT_CARE));
                dVar.resumeWith(Boolean.TRUE);
                return;
            }
            String stringValue2 = ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT);
            if (stringValue2 != null && !n.B0(stringValue2)) {
                z11 = false;
            }
            if (z11) {
                Boolean ENABLE_ONBOARDING_VARIANT2 = Constants.ENABLE_ONBOARDING_VARIANT;
                i.f(ENABLE_ONBOARDING_VARIANT2, "ENABLE_ONBOARDING_VARIANT");
                if (ENABLE_ONBOARDING_VARIANT2.booleanValue()) {
                    ApplicationPersistence.getInstance().setStringValue(Constants.ONBOARDING_EXPERIMENT, Constants.ONBOARDING_VARIANT);
                } else {
                    ApplicationPersistence.getInstance().setStringValue(Constants.ONBOARDING_EXPERIMENT, Constants.ONBOARDING_VARIANT);
                }
            }
            dVar.resumeWith(Boolean.TRUE);
        }
    }

    /* compiled from: SplashScreenRepository.kt */
    /* loaded from: classes2.dex */
    public static final class b implements ya.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f22538a;

        public b(h hVar) {
            this.f22538a = hVar;
        }

        @Override // ya.c
        public final void b() {
            boolean z10;
            String stringValue = ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT);
            if (stringValue != null && !n.B0(stringValue)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                Boolean ENABLE_ONBOARDING_VARIANT = Constants.ENABLE_ONBOARDING_VARIANT;
                i.f(ENABLE_ONBOARDING_VARIANT, "ENABLE_ONBOARDING_VARIANT");
                if (ENABLE_ONBOARDING_VARIANT.booleanValue()) {
                    ApplicationPersistence.getInstance().setStringValue(Constants.ONBOARDING_EXPERIMENT, Constants.ONBOARDING_VARIANT);
                } else {
                    ApplicationPersistence.getInstance().setStringValue(Constants.ONBOARDING_EXPERIMENT, Constants.ONBOARDING_VARIANT);
                }
            }
            this.f22538a.resumeWith(Boolean.TRUE);
        }
    }

    /* compiled from: SplashScreenRepository.kt */
    /* loaded from: classes2.dex */
    public static final class c implements LocationInterface {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f22539a;

        public c(h hVar) {
            this.f22539a = hVar;
        }

        @Override // com.theinnerhour.b2b.persistence.LocationInterface
        public final void locationFetchFailure() {
            this.f22539a.resumeWith(Boolean.TRUE);
        }

        @Override // com.theinnerhour.b2b.persistence.LocationInterface
        public final void locationFetchSuccess() {
            this.f22539a.resumeWith(Boolean.TRUE);
        }
    }

    /* compiled from: SplashScreenRepository.kt */
    /* loaded from: classes2.dex */
    public static final class d implements CustomRetrofitCallback<m> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f22540u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ a f22541v;

        public d(a aVar, h hVar) {
            this.f22540u = hVar;
            this.f22541v = aVar;
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onFailure(dw.b<m> call, Throwable t3) {
            i.g(call, "call");
            i.g(t3, "t");
            this.f22540u.resumeWith(Boolean.FALSE);
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onResponse(dw.b<m> call, z<m> response) {
            ls.d<Boolean> dVar = this.f22540u;
            i.g(call, "call");
            i.g(response, "response");
            try {
                CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
                if (response.a()) {
                    Utils.parseLoginResponse$default(Utils.INSTANCE, new JSONObject(String.valueOf(response.f13696b)), false, 2, null);
                    dVar.resumeWith(Boolean.TRUE);
                } else {
                    dVar.resumeWith(Boolean.FALSE);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f22541v.f22535b, e10);
                dVar.resumeWith(Boolean.FALSE);
            }
        }
    }

    public a() {
        this(0);
    }

    public static final int a(a aVar, ArrayList arrayList) {
        aVar.getClass();
        Iterator it = arrayList.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            CourseDayModelV1 courseDayModelV1 = (CourseDayModelV1) it.next();
            if (courseDayModelV1.getStart_date() == 0) {
                break;
            }
            i6 = courseDayModelV1.getPosition();
        }
        return i6;
    }

    public static Object c(ls.d dVar) {
        h hVar = new h(ca.a.G0(dVar));
        try {
            LocationPersistence.INSTANCE.fetchLocationInfo(new c(hVar));
        } catch (Exception unused) {
            hVar.resumeWith(Boolean.FALSE);
        }
        return hVar.b();
    }

    public final Object b(ls.d<? super Boolean> dVar) {
        boolean z10;
        h hVar = new h(ca.a.G0(dVar));
        try {
            nf.b e10 = nf.b.e();
            i.f(e10, "getInstance()");
            e10.g(new nf.c(new c.a()));
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.A3_ONBOARDING_EXPERIMENT, Boolean.TRUE);
            Boolean bool = Boolean.FALSE;
            hashMap.put(Constants.COMMUNITIES_ENABLED, bool);
            hashMap.put(Constants.PROVIDER_INITIAL_DISCOUNT, bool);
            hashMap.put(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP, bool);
            e10.h(hashMap);
            e10.b().addOnCompleteListener(new C0339a(e10, this, hVar)).addOnCanceledListener(new b(hVar));
        } catch (Exception e11) {
            String stringValue = ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT);
            if (stringValue != null && !n.B0(stringValue)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                Boolean ENABLE_ONBOARDING_VARIANT = Constants.ENABLE_ONBOARDING_VARIANT;
                i.f(ENABLE_ONBOARDING_VARIANT, "ENABLE_ONBOARDING_VARIANT");
                if (ENABLE_ONBOARDING_VARIANT.booleanValue()) {
                    ApplicationPersistence.getInstance().setStringValue(Constants.ONBOARDING_EXPERIMENT, Constants.ONBOARDING_VARIANT);
                } else {
                    ApplicationPersistence.getInstance().setStringValue(Constants.ONBOARDING_EXPERIMENT, Constants.ONBOARDING_VARIANT);
                }
            }
            hVar.resumeWith(Boolean.TRUE);
            LogHelper.INSTANCE.e(this.f22535b, e11);
        }
        return hVar.b();
    }

    public final Object d(ls.d<? super Boolean> dVar) {
        h hVar = new h(ca.a.G0(dVar));
        ((l) nr.b.a(l.class)).b("https://api.theinnerhour.com/v1/refresh_token").I(new d(this, hVar));
        return hVar.b();
    }

    public a(int i6) {
        this.f22534a = new DefaultDispatcherProvider();
        this.f22535b = LogHelper.INSTANCE.makeLogTag("SplashScreenRepository");
    }
}
