package im;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.components.inAppFunneling.model.InAppPromptData;
import com.theinnerhour.b2b.components.inAppFunneling.model.InAppPromptModel;
import com.theinnerhour.b2b.components.telecommunications.model.MatchedCompletedProviderListModel;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
import com.theinnerhour.b2b.network.model.PsychiatristDetailHolderModel;
import com.theinnerhour.b2b.network.model.TherapistDetailHolderModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import dw.z;
import hs.f;
import hs.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ls.h;
import lv.c0;
import lv.v;
import or.m;
import org.json.JSONArray;
import org.json.JSONObject;
import ss.p;
/* compiled from: InAppPromptRepository.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f20393a = LogHelper.INSTANCE.makeLogTag("InAppPromptRepository");

    /* compiled from: InAppPromptRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a implements CustomRetrofitCallback<MatchedCompletedProviderListModel> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ls.d<ArrayList<TherapistPackagesModel>> f20395v;

        public a(h hVar) {
            this.f20395v = hVar;
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onFailure(dw.b<MatchedCompletedProviderListModel> call, Throwable t3) {
            c cVar = c.this;
            i.g(call, "call");
            i.g(t3, "t");
            try {
                LogHelper.INSTANCE.e(cVar.f20393a, t3);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(cVar.f20393a, e10);
            }
            this.f20395v.resumeWith(null);
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onResponse(dw.b<MatchedCompletedProviderListModel> call, z<MatchedCompletedProviderListModel> response) {
            k kVar;
            c cVar = c.this;
            ls.d<ArrayList<TherapistPackagesModel>> dVar = this.f20395v;
            i.g(call, "call");
            i.g(response, "response");
            try {
                CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
                if (response.a()) {
                    MatchedCompletedProviderListModel matchedCompletedProviderListModel = response.f13696b;
                    if (matchedCompletedProviderListModel != null) {
                        dVar.resumeWith(matchedCompletedProviderListModel.getList());
                        kVar = k.f19476a;
                    } else {
                        kVar = null;
                    }
                    if (kVar == null) {
                        dVar.resumeWith(null);
                        return;
                    }
                    return;
                }
                LogHelper.INSTANCE.e(cVar.f20393a, "fetchProviderList response isSuccessful false");
                dVar.resumeWith(null);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(cVar.f20393a, e10);
                dVar.resumeWith(null);
            }
        }
    }

    /* compiled from: InAppPromptRepository.kt */
    /* loaded from: classes2.dex */
    public static final class b implements CustomRetrofitCallback<TherapistDetailHolderModel> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<ProviderDetailHolderModel> f20396u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f20397v;

        public b(String str, h hVar) {
            this.f20396u = hVar;
            this.f20397v = str;
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onFailure(dw.b<TherapistDetailHolderModel> call, Throwable t3) {
            i.g(call, "call");
            i.g(t3, "t");
            this.f20396u.resumeWith(null);
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onResponse(dw.b<TherapistDetailHolderModel> call, z<TherapistDetailHolderModel> response) {
            ProviderDetailHolderModel therapist;
            i.g(call, "call");
            i.g(response, "response");
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            boolean a10 = response.a();
            ProviderDetailHolderModel providerDetailHolderModel = null;
            ls.d<ProviderDetailHolderModel> dVar = this.f20396u;
            if (a10) {
                TherapistDetailHolderModel therapistDetailHolderModel = response.f13696b;
                if (therapistDetailHolderModel != null && (therapist = therapistDetailHolderModel.getTherapist()) != null) {
                    therapist.setProviderType(this.f20397v);
                    providerDetailHolderModel = therapist;
                }
                dVar.resumeWith(providerDetailHolderModel);
                return;
            }
            dVar.resumeWith(null);
        }
    }

    /* compiled from: InAppPromptRepository.kt */
    /* renamed from: im.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0305c implements CustomRetrofitCallback<PsychiatristDetailHolderModel> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<ProviderDetailHolderModel> f20398u;

        public C0305c(h hVar) {
            this.f20398u = hVar;
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onFailure(dw.b<PsychiatristDetailHolderModel> call, Throwable t3) {
            i.g(call, "call");
            i.g(t3, "t");
            this.f20398u.resumeWith(null);
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onResponse(dw.b<PsychiatristDetailHolderModel> call, z<PsychiatristDetailHolderModel> response) {
            ProviderDetailHolderModel psychiatrist;
            i.g(call, "call");
            i.g(response, "response");
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            boolean a10 = response.a();
            ProviderDetailHolderModel providerDetailHolderModel = null;
            ls.d<ProviderDetailHolderModel> dVar = this.f20398u;
            if (a10) {
                PsychiatristDetailHolderModel psychiatristDetailHolderModel = response.f13696b;
                if (psychiatristDetailHolderModel != null && (psychiatrist = psychiatristDetailHolderModel.getPsychiatrist()) != null) {
                    psychiatrist.setProviderType("psychiatrist");
                    providerDetailHolderModel = psychiatrist;
                }
                dVar.resumeWith(providerDetailHolderModel);
                return;
            }
            dVar.resumeWith(null);
        }
    }

    /* compiled from: InAppPromptRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.inAppFunneling.repositories.InAppPromptRepository", f = "InAppPromptRepository.kt", l = {R.styleable.AppCompatTheme_dropdownListPreferredItemHeight}, m = "updateInAppPrompt")
    /* loaded from: classes2.dex */
    public static final class d extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public c f20399u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f20400v;

        /* renamed from: x  reason: collision with root package name */
        public int f20402x;

        public d(ls.d<? super d> dVar) {
            super(dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f20400v = obj;
            this.f20402x |= LinearLayoutManager.INVALID_OFFSET;
            return c.this.d(null, this);
        }
    }

    /* compiled from: InAppPromptRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.inAppFunneling.repositories.InAppPromptRepository$updateInAppPrompt$3", f = "InAppPromptRepository.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends ns.i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ List<f<String, String>> f20403u;

        /* compiled from: InAppPromptRepository.kt */
        /* loaded from: classes2.dex */
        public static final class a implements ValueEventListener {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ List<f<String, String>> f20404u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ DatabaseReference f20405v;

            public a(List<f<String, String>> list, DatabaseReference databaseReference) {
                this.f20404u = list;
                this.f20405v = databaseReference;
            }

            @Override // com.google.firebase.database.ValueEventListener
            public final void onCancelled(DatabaseError error) {
                i.g(error, "error");
            }

            @Override // com.google.firebase.database.ValueEventListener
            public final void onDataChange(DataSnapshot snapshot) {
                Object obj;
                ArrayList<InAppPromptData> promptList;
                i.g(snapshot, "snapshot");
                if (snapshot.exists()) {
                    ArrayList<InAppPromptData> arrayList = new ArrayList<>();
                    InAppPromptModel inAppPromptModel = (InAppPromptModel) snapshot.getValue(InAppPromptModel.class);
                    if (inAppPromptModel != null && (promptList = inAppPromptModel.getPromptList()) != null) {
                        arrayList.addAll(promptList);
                    }
                    Iterator<T> it = this.f20404u.iterator();
                    while (true) {
                        obj = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        f fVar = (f) it.next();
                        if (fVar.f19465v != 0) {
                            Iterator<T> it2 = arrayList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Object next = it2.next();
                                if (i.b(((InAppPromptData) next).getSlug(), fVar.f19464u)) {
                                    obj = next;
                                    break;
                                }
                            }
                            InAppPromptData inAppPromptData = (InAppPromptData) obj;
                            if (inAppPromptData != null) {
                                B b10 = fVar.f19465v;
                                i.d(b10);
                                inAppPromptData.setStatus((String) b10);
                            }
                        }
                    }
                    Iterator<T> it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        List<String> source = ((InAppPromptData) next2).getSource();
                        boolean z10 = false;
                        if (source != null && (!source.isEmpty())) {
                            z10 = true;
                            continue;
                        }
                        if (z10) {
                            obj = next2;
                            break;
                        }
                    }
                    InAppPromptData inAppPromptData2 = (InAppPromptData) obj;
                    if (inAppPromptData2 != null) {
                        inAppPromptData2.setSource(inAppPromptData2.getDistinctSourceList());
                    }
                    if (inAppPromptModel != null) {
                        inAppPromptModel.setPromptList(arrayList);
                    }
                    this.f20405v.setValue(inAppPromptModel);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<f<String, String>> list, ls.d<? super e> dVar) {
            super(2, dVar);
            this.f20403u = list;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new e(this.f20403u, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((e) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String j02;
            sp.b.d0(obj);
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference(Constants.FIREBASE_USER_IN_APP_FUNNELING_NODE.concat(j02));
                i.f(reference, "getInstance().getReferen…APP_FUNNELING_NODE}$uid\")");
                reference.addListenerForSingleValueEvent(new a(this.f20403u, reference));
                return k.f19476a;
            }
            return k.f19476a;
        }
    }

    public static final long a(c cVar) {
        if (ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_DATE) == 0) {
            ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DATE, Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
        }
        return TimeUnit.DAYS.convert(Utils.INSTANCE.getTodayCalendar().getTimeInMillis() - ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_DATE), TimeUnit.MILLISECONDS);
    }

    public static Object c(String str, String str2, ls.d dVar) {
        h hVar = new h(ca.a.G0(dVar));
        if (str != null && str2 != null) {
            m mVar = (m) nr.b.a(m.class);
            if (!i.b(str, "therapist") && !i.b(str, "couplestherapist")) {
                mVar.e("https://api.theinnerhour.com/v1/psychiatrist/publicprofile/".concat(str2)).I(new C0305c(hVar));
            } else {
                mVar.g("https://api.theinnerhour.com/v1/therapist/publicprofile/".concat(str2)).I(new b(str, hVar));
            }
        } else {
            hVar.resumeWith(null);
        }
        return hVar.b();
    }

    public final Object b(ArrayList<String> arrayList, ls.d<? super ArrayList<TherapistPackagesModel>> dVar) {
        h hVar = new h(ca.a.G0(dVar));
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String str : arrayList) {
            jSONArray.put(str);
        }
        jSONObject.put("custom_uuids", jSONArray);
        String jSONObject2 = jSONObject.toString();
        i.f(jSONObject2, "payload.toString()");
        Pattern pattern = v.f24702d;
        ((co.b) nr.b.a(co.b.class)).b("https://api.theinnerhour.com/v1/search/v2/therapists", c0.a.a(jSONObject2, v.a.b("application/json; charset=utf-8"))).I(new a(hVar));
        return hVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List<f<String, String>> list, ls.d<? super k> dVar) {
        d dVar2;
        int i6;
        Exception e10;
        c cVar;
        boolean z10;
        boolean z11;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f20402x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar2.f20402x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar2.f20400v;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = dVar2.f20402x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        cVar = dVar2.f20399u;
                        try {
                            sp.b.d0(obj);
                        } catch (Exception e11) {
                            e10 = e11;
                            LogHelper.INSTANCE.e(cVar.f20393a, e10);
                            return k.f19476a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    try {
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                z10 = false;
                                if (((f) it.next()).f19465v != 0) {
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
                        z10 = true;
                        if (!z10 && !list.isEmpty()) {
                            kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
                            e eVar = new e(list, null);
                            dVar2.f20399u = this;
                            dVar2.f20402x = 1;
                            if (ta.v.S(bVar, eVar, dVar2) == aVar) {
                                return aVar;
                            }
                        }
                        return k.f19476a;
                    } catch (Exception e12) {
                        e10 = e12;
                        cVar = this;
                        LogHelper.INSTANCE.e(cVar.f20393a, e10);
                        return k.f19476a;
                    }
                }
                return k.f19476a;
            }
        }
        dVar2 = new d(dVar);
        Object obj2 = dVar2.f20400v;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = dVar2.f20402x;
        if (i6 == 0) {
        }
        return k.f19476a;
    }
}
