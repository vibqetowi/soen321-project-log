package yl;

import com.theinnerhour.b2b.components.telecommunications.model.CenterLocationInfo;
import com.theinnerhour.b2b.components.telecommunications.model.CenterLocationModel;
import com.theinnerhour.b2b.components.telecommunications.model.RegionalOfflineCenterLocationsListModel;
import com.theinnerhour.b2b.persistence.LocationInterface;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
import gv.n;
import gv.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import ls.h;
import or.m;
/* compiled from: ExpertCareRepository.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f38679a = LogHelper.INSTANCE.makeLogTag("ExpertCareRepository");

    /* compiled from: ExpertCareRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a implements CustomRetrofitCallback<RegionalOfflineCenterLocationsListModel> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<String> f38680u;

        public a(h hVar) {
            this.f38680u = hVar;
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onFailure(dw.b<RegionalOfflineCenterLocationsListModel> call, Throwable t3) {
            i.g(call, "call");
            i.g(t3, "t");
            this.f38680u.resumeWith(null);
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00cf A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00f8 A[EDGE_INSN: B:70:0x00f8->B:53:0x00f8 ?: BREAK  , SYNTHETIC] */
        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onResponse(dw.b<RegionalOfflineCenterLocationsListModel> call, z<RegionalOfflineCenterLocationsListModel> response) {
            boolean z10;
            CenterLocationModel centerLocationModel;
            CenterLocationInfo locationInfo;
            List<CenterLocationModel> locationList;
            Object obj;
            Float valueOf;
            String longitude;
            Float valueOf2;
            boolean z11;
            List<CenterLocationModel> locationList2;
            i.g(call, "call");
            i.g(response, "response");
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            boolean a10 = response.a();
            ls.d<String> dVar = this.f38680u;
            String str = null;
            if (a10) {
                RegionalOfflineCenterLocationsListModel regionalOfflineCenterLocationsListModel = response.f13696b;
                if (regionalOfflineCenterLocationsListModel != null && (locationList2 = regionalOfflineCenterLocationsListModel.getLocationList()) != null && (!locationList2.isEmpty())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    List<String> Z0 = r.Z0(LocationPersistence.INSTANCE.getCurrentLocation(), new char[]{','});
                    ArrayList arrayList = new ArrayList(is.i.H1(Z0, 10));
                    for (String str2 : Z0) {
                        arrayList.add(Float.valueOf(Float.parseFloat(str2)));
                    }
                    if (arrayList.size() == 2) {
                        float floatValue = ((Number) arrayList.get(0)).floatValue();
                        float floatValue2 = ((Number) arrayList.get(1)).floatValue();
                        if (regionalOfflineCenterLocationsListModel != null && (locationList = regionalOfflineCenterLocationsListModel.getLocationList()) != null) {
                            Iterator<T> it = locationList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    CenterLocationModel centerLocationModel2 = (CenterLocationModel) obj;
                                    String latitude = centerLocationModel2.getLatitude();
                                    if (latitude != null) {
                                        if (gv.h.f16952a.b(latitude)) {
                                            valueOf = Float.valueOf(Float.parseFloat(latitude));
                                            longitude = centerLocationModel2.getLongitude();
                                            if (longitude != null) {
                                                if (gv.h.f16952a.b(longitude)) {
                                                    valueOf2 = Float.valueOf(Float.parseFloat(longitude));
                                                    if (valueOf == null && valueOf2 != null && Math.abs(floatValue - valueOf.floatValue()) <= 0.25d && Math.abs(floatValue2 - valueOf2.floatValue()) <= 0.25d) {
                                                        z11 = true;
                                                        continue;
                                                    } else {
                                                        z11 = false;
                                                        continue;
                                                    }
                                                    if (z11) {
                                                        break;
                                                    }
                                                }
                                            }
                                            valueOf2 = null;
                                            if (valueOf == null) {
                                            }
                                            z11 = false;
                                            continue;
                                            if (z11) {
                                            }
                                        }
                                    }
                                    valueOf = null;
                                    longitude = centerLocationModel2.getLongitude();
                                    if (longitude != null) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf == null) {
                                    }
                                    z11 = false;
                                    continue;
                                    if (z11) {
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            centerLocationModel = (CenterLocationModel) obj;
                        } else {
                            centerLocationModel = null;
                        }
                        if (centerLocationModel != null && (locationInfo = centerLocationModel.getLocationInfo()) != null) {
                            str = locationInfo.getCity();
                        }
                        dVar.resumeWith(str);
                        return;
                    }
                    dVar.resumeWith(null);
                    return;
                }
                dVar.resumeWith(null);
                return;
            }
            dVar.resumeWith(null);
        }
    }

    /* compiled from: ExpertCareRepository.kt */
    /* renamed from: yl.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0655b implements LocationInterface {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<String> f38681a;

        public C0655b(h hVar) {
            this.f38681a = hVar;
        }

        @Override // com.theinnerhour.b2b.persistence.LocationInterface
        public final void locationFetchFailure() {
            this.f38681a.resumeWith(null);
        }

        @Override // com.theinnerhour.b2b.persistence.LocationInterface
        public final void locationFetchSuccess() {
            LocationPersistence locationPersistence = LocationPersistence.INSTANCE;
            boolean z10 = !n.B0(locationPersistence.getCurrentState());
            ls.d<String> dVar = this.f38681a;
            if (z10) {
                dVar.resumeWith(locationPersistence.getCurrentState());
            } else {
                dVar.resumeWith(null);
            }
        }
    }

    public static Object a(String str, ls.d dVar) {
        h hVar = new h(ca.a.G0(dVar));
        ((m) nr.b.a(m.class)).d("https://api.theinnerhour.com/v1/customers/ih_clinics", str).I(new a(hVar));
        return hVar.b();
    }

    public static Object b(ls.d dVar) {
        h hVar = new h(ca.a.G0(dVar));
        LocationPersistence locationPersistence = LocationPersistence.INSTANCE;
        if (n.B0(locationPersistence.getCurrentState())) {
            if (n.B0(locationPersistence.getCurrentCountry())) {
                locationPersistence.fetchLocationInfo(new C0655b(hVar));
            } else {
                hVar.resumeWith(null);
            }
        } else {
            hVar.resumeWith(locationPersistence.getCurrentState());
        }
        return hVar.b();
    }
}
