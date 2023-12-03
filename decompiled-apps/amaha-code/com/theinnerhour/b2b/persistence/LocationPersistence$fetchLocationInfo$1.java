package com.theinnerhour.b2b.persistence;

import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
import hs.k;
import java.util.Locale;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import ls.d;
import ns.e;
import ns.i;
import or.c;
import sf.m;
import sp.b;
import ss.p;
/* compiled from: LocationPersistence.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@e(c = "com.theinnerhour.b2b.persistence.LocationPersistence$fetchLocationInfo$1", f = "LocationPersistence.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LocationPersistence$fetchLocationInfo$1 extends i implements p<d0, d<? super k>, Object> {
    final /* synthetic */ LocationInterface $locationInterface;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationPersistence$fetchLocationInfo$1(LocationInterface locationInterface, d<? super LocationPersistence$fetchLocationInfo$1> dVar) {
        super(2, dVar);
        this.$locationInterface = locationInterface;
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        return new LocationPersistence$fetchLocationInfo$1(this.$locationInterface, dVar);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            b.d0(obj);
            try {
                dw.b<m> a10 = ((c) nr.b.a(c.class)).a("https://ipinfo.io/json");
                final LocationInterface locationInterface = this.$locationInterface;
                a10.I(new CustomRetrofitCallback<m>() { // from class: com.theinnerhour.b2b.persistence.LocationPersistence$fetchLocationInfo$1.1
                    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
                    public void onFailure(dw.b<m> call, Throwable t3) {
                        kotlin.jvm.internal.i.g(call, "call");
                        kotlin.jvm.internal.i.g(t3, "t");
                        LocationInterface locationInterface2 = LocationInterface.this;
                        if (locationInterface2 != null) {
                            locationInterface2.locationFetchFailure();
                        }
                    }

                    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
                    public void onResponse(dw.b<m> call, z<m> response) {
                        String str;
                        String str2;
                        String str3;
                        String m10;
                        kotlin.jvm.internal.i.g(call, "call");
                        kotlin.jvm.internal.i.g(response, "response");
                        try {
                            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
                            if (response.a()) {
                                m mVar = response.f13696b;
                                if (mVar != null) {
                                    uf.k<String, m> kVar = mVar.g().f31511u;
                                    LocationInterface locationInterface2 = LocationInterface.this;
                                    if (locationInterface2 != null) {
                                        locationInterface2.locationFetchSuccess();
                                    }
                                    LocationPersistence locationPersistence = LocationPersistence.INSTANCE;
                                    m mVar2 = kVar.get("country");
                                    String str4 = null;
                                    if (mVar2 != null) {
                                        str = mVar2.m();
                                    } else {
                                        str = null;
                                    }
                                    String str5 = "";
                                    if (str == null) {
                                        str = "";
                                    }
                                    locationPersistence.updatePreferences(LocationPersistence.CURRENT_COUNTRY, str);
                                    m mVar3 = kVar.get("region");
                                    if (mVar3 == null || (m10 = mVar3.m()) == null) {
                                        str2 = "";
                                    } else {
                                        Locale ENGLISH = Locale.ENGLISH;
                                        kotlin.jvm.internal.i.f(ENGLISH, "ENGLISH");
                                        str2 = m10.toLowerCase(ENGLISH);
                                        kotlin.jvm.internal.i.f(str2, "this as java.lang.String).toLowerCase(locale)");
                                    }
                                    locationPersistence.updatePreferences(LocationPersistence.CURRENT_STATE, str2);
                                    m mVar4 = kVar.get("loc");
                                    if (mVar4 != null) {
                                        str3 = mVar4.m();
                                    } else {
                                        str3 = null;
                                    }
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    locationPersistence.updatePreferences(LocationPersistence.CURRENT_LOCATION, str3);
                                    m mVar5 = kVar.get("country");
                                    if (mVar5 != null) {
                                        str4 = mVar5.m();
                                    }
                                    if (str4 != null) {
                                        str5 = str4;
                                    }
                                    if (kotlin.jvm.internal.i.b(str5, "IN")) {
                                        MyApplication.V.a().Q = true;
                                    }
                                    MyApplication.V.a().f();
                                    return;
                                }
                                LocationInterface locationInterface3 = LocationInterface.this;
                                if (locationInterface3 != null) {
                                    locationInterface3.locationFetchFailure();
                                    return;
                                }
                                return;
                            }
                            LocationInterface locationInterface4 = LocationInterface.this;
                            if (locationInterface4 != null) {
                                locationInterface4.locationFetchFailure();
                            }
                        } catch (Exception unused) {
                            LocationInterface locationInterface5 = LocationInterface.this;
                            if (locationInterface5 != null) {
                                locationInterface5.locationFetchFailure();
                            }
                        }
                    }
                });
            } catch (Exception e10) {
                LocationInterface locationInterface2 = this.$locationInterface;
                if (locationInterface2 != null) {
                    locationInterface2.locationFetchFailure();
                }
                LogHelper.INSTANCE.e("LocationPersistence", "error in sending fetchlocationinfo", e10);
            }
            return k.f19476a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, d<? super k> dVar) {
        return ((LocationPersistence$fetchLocationInfo$1) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }
}
