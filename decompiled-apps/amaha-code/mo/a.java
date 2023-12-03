package mo;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
import com.theinnerhour.b2b.utils.LogHelper;
import e4.l;
import is.f0;
import is.q;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.j;
import kotlinx.coroutines.k;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProDashboardRepository.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f25647a = LogHelper.INSTANCE.makeLogTag(a.class);

    /* renamed from: b  reason: collision with root package name */
    public final SimpleDateFormat f25648b = new SimpleDateFormat("dd/MM/yyyy");

    /* compiled from: ProDashboardRepository.kt */
    /* renamed from: mo.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0417a<T> implements l.b {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ v f25649u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ v f25650v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ j<hs.f<Integer, Integer>> f25651w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a f25652x;

        public C0417a(a aVar, v vVar, v vVar2, k kVar) {
            this.f25649u = vVar;
            this.f25650v = vVar2;
            this.f25651w = kVar;
            this.f25652x = aVar;
        }

        @Override // e4.l.b
        public final void a(Object obj) {
            boolean z10;
            JSONObject jSONObject = (JSONObject) obj;
            v vVar = this.f25649u;
            v vVar2 = this.f25650v;
            j<hs.f<Integer, Integer>> jVar = this.f25651w;
            try {
                if (jSONObject.has("assigned_assessments")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("assigned_assessments");
                    if (jSONArray.length() > 0) {
                        int length = jSONArray.length();
                        int length2 = jSONArray.length();
                        int i6 = 0;
                        for (int i10 = 0; i10 < length2; i10++) {
                            JSONObject jSONObject2 = (JSONObject) jSONArray.get(i10);
                            if (jSONObject2 != null) {
                                z10 = jSONObject2.optBoolean("assessment_complete");
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                i6++;
                            } else {
                                int i11 = -1;
                                if (vVar.f23467u == -1) {
                                    JSONObject jSONObject3 = (JSONObject) jSONArray.get(i10);
                                    if (jSONObject3 != null) {
                                        i11 = jSONObject3.optInt("assigned_assessment_id", -1);
                                    }
                                    vVar.f23467u = i11;
                                }
                            }
                        }
                        vVar2.f23467u = length - i6;
                    }
                }
                if (jVar.a()) {
                    jVar.resumeWith(new hs.f(Integer.valueOf(vVar2.f23467u), Integer.valueOf(vVar.f23467u)));
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f25652x.f25647a, e10);
                if (jVar.a()) {
                    jVar.resumeWith(new hs.f(Integer.valueOf(vVar2.f23467u), Integer.valueOf(vVar.f23467u)));
                }
            }
        }
    }

    /* compiled from: ProDashboardRepository.kt */
    /* loaded from: classes2.dex */
    public static final class b extends CustomVolleyErrorListener {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ j<hs.f<Integer, Integer>> f25654v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v f25655w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ v f25656x;

        public b(v vVar, v vVar2, k kVar) {
            this.f25654v = kVar;
            this.f25655w = vVar;
            this.f25656x = vVar2;
        }

        @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
        public final void onErrorResponse(VolleyError volleyError) {
            super.onErrorResponse(volleyError);
            LogHelper.INSTANCE.e(a.this.f25647a, (volleyError == null || (r4 = volleyError.getMessage()) == null) ? "error in requestAssessmentData" : "error in requestAssessmentData");
            j<hs.f<Integer, Integer>> jVar = this.f25654v;
            if (jVar.a()) {
                jVar.resumeWith(new hs.f(Integer.valueOf(this.f25655w.f23467u), Integer.valueOf(this.f25656x.f23467u)));
            }
        }
    }

    public final Object a(ls.d<? super hs.f<Integer, Integer>> dVar) {
        k kVar = new k(1, ca.a.G0(dVar));
        kVar.u();
        try {
            v vVar = new v();
            v vVar2 = new v();
            vVar2.f23467u = -1;
            VolleySingleton.getInstance().add(new CustomVolleyJsonObjectRequest(0, "https://api.theinnerhour.com/v1/get_pro_assessment", null, new C0417a(this, vVar2, vVar, kVar), new b(vVar, vVar2, kVar)));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f25647a, e10);
            if (kVar.a()) {
                kVar.resumeWith(new hs.f(new Integer(0), new Integer(-1)));
            }
        }
        return kVar.s();
    }

    public final Object b(ls.d<? super Boolean> dVar) {
        boolean z10 = true;
        k kVar = new k(1, ca.a.G0(dVar));
        kVar.u();
        User user = FirebasePersistence.getInstance().getUser();
        boolean z11 = false;
        if (user != null) {
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            ArrayList<MultiTrackerModel> userMoodListV3 = user.getUserMoodListV3();
            i.f(userMoodListV3, "userMoodListV3");
            f0 S1 = q.S1(userMoodListV3);
            if (!S1.isEmpty()) {
                Iterator<T> it = S1.iterator();
                while (it.hasNext()) {
                    SimpleDateFormat simpleDateFormat = this.f25648b;
                    if (i.b(simpleDateFormat.format(new Long(((MultiTrackerModel) it.next()).getDate().getTime() * 1000)), simpleDateFormat.format(new Long(timeInMillis)))) {
                        break;
                    }
                }
            }
            z10 = false;
            z11 = z10;
        }
        if (kVar.a()) {
            kVar.resumeWith(Boolean.valueOf(z11));
        }
        return kVar.s();
    }
}
