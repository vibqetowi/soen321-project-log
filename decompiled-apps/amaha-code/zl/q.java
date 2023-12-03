package zl;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import lv.c0;
import lv.v;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ExpertCareViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareViewModel$fetchProviderListing$1", f = "ExpertCareViewModel.kt", l = {R.styleable.AppCompatTheme_ratingBarStyleSmall}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f39578u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ v f39579v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f39580w;

    /* compiled from: ExpertCareViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareViewModel$fetchProviderListing$1$1", f = "ExpertCareViewModel.kt", l = {R.styleable.AppCompatTheme_searchViewStyle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f39581u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ v f39582v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f39583w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar, ls.d dVar, boolean z10) {
            super(2, dVar);
            this.f39582v = vVar;
            this.f39583w = z10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f39582v, dVar, this.f39583w);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
            if (r1.equals(com.theinnerhour.b2b.utils.Constants.COURSE_ANGER) == false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
            if (r1.equals(com.theinnerhour.b2b.utils.Constants.COURSE_DEPRESSION) == false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
            r8 = r9;
         */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            String str3;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f39581u;
            v vVar = this.f39582v;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                yl.b bVar = vVar.f39602x;
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str = user.getCurrentCourseName();
                } else {
                    str = null;
                }
                this.f39581u = 1;
                bVar.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                boolean z10 = this.f39583w;
                if (z10) {
                    str2 = "https://api.theinnerhour.com/v1/search/v2/therapists";
                } else {
                    str2 = "https://api.theinnerhour.com/v1/search/v2/psychiatrists";
                }
                JSONObject jSONObject = new JSONObject();
                if (z10) {
                    JSONArray jSONArray = new JSONArray();
                    String str4 = Constants.COURSE_STRESS;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -1617042330:
                                str3 = Constants.COURSE_DEPRESSION;
                                break;
                            case -891989580:
                                str.equals(Constants.COURSE_STRESS);
                                break;
                            case 92960775:
                                str3 = Constants.COURSE_ANGER;
                                break;
                            case 109522647:
                                if (str.equals(Constants.COURSE_SLEEP)) {
                                    str4 = "sleep-disturbances";
                                    break;
                                }
                                break;
                            case 113319009:
                                if (str.equals(Constants.COURSE_WORRY)) {
                                    str4 = "anxiety";
                                    break;
                                }
                                break;
                        }
                    }
                    jSONArray.put(str4);
                    jSONObject.put("expertise", jSONArray);
                }
                String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.i.f(jSONObject2, "payload.toString()");
                Pattern pattern = lv.v.f24702d;
                ((or.m) nr.b.a(or.m.class)).a(str2, c0.a.a(jSONObject2, v.a.b("application/json; charset=utf-8"))).I(new yl.a(bVar, hVar));
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            List<TherapistPackagesModel> list = (List) obj;
            if (list == null) {
                return null;
            }
            vVar.A.i(list);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(v vVar, ls.d dVar, boolean z10) {
        super(2, dVar);
        this.f39579v = vVar;
        this.f39580w = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new q(this.f39579v, dVar, this.f39580w);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((q) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f39578u;
        v vVar = this.f39579v;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
                a aVar2 = new a(vVar, null, this.f39580w);
                this.f39578u = 1;
                if (ta.v.S(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(vVar.D, e10);
        }
        return hs.k.f19476a;
    }
}
