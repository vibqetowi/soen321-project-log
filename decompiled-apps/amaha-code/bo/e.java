package bo;

import am.w;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.onboarding.model.MatchingFlowModel;
import com.theinnerhour.b2b.components.onboarding.model.MatchingFlowUserResponseModel;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.CenterZoomLayoutManager;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import is.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.y;
import ss.l;
import ta.v;
/* compiled from: NewOnBoardingMatchingResultFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbo/e;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e extends rr.b {
    public static final /* synthetic */ int C = 0;
    public final androidx.activity.result.c<Intent> A;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4568w;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4570y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4571z;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f4566u = LogHelper.INSTANCE.makeLogTag("NewOnBoardingMatchingResult");

    /* renamed from: v  reason: collision with root package name */
    public final m0 f4567v = b0.j(this, y.a(eo.f.class), new c(this), new d(this), new C0087e(this));

    /* renamed from: x  reason: collision with root package name */
    public String f4569x = "therapist";

    /* compiled from: NewOnBoardingMatchingResultFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements l<SingleUseEvent<? extends ArrayList<TherapistPackagesModel>>, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ eo.f f4572u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ e f4573v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(eo.f fVar, e eVar) {
            super(1);
            this.f4572u = fVar;
            this.f4573v = eVar;
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends ArrayList<TherapistPackagesModel>> singleUseEvent) {
            hs.k kVar;
            String str;
            ArrayList<TherapistPackagesModel> contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            e eVar = this.f4573v;
            if (contentIfNotHandled != null) {
                ArrayList arrayList = new ArrayList(is.i.H1(contentIfNotHandled, 10));
                for (TherapistPackagesModel therapistPackagesModel : contentIfNotHandled) {
                    arrayList.add(therapistPackagesModel.getFirstname() + ' ' + therapistPackagesModel.getLastname());
                }
                ArrayList<String> arrayList2 = new ArrayList<>(arrayList);
                Log.d("MatchingTag", arrayList2.toString());
                String str2 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                if (eVar.f4568w) {
                    str = "therapy";
                } else {
                    str = "psychiatry";
                }
                bundle.putString("flow", str);
                bundle.putString("source", "app_onboarding_matching");
                bundle.putStringArrayList("matches", arrayList2);
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(bundle, "setpref_results_show");
                ArrayList arrayList3 = new ArrayList(u.E2(contentIfNotHandled, 5));
                boolean z10 = eVar.f4568w;
                try {
                    RecyclerView recyclerView = (RecyclerView) eVar._$_findCachedViewById(R.id.rvMatchingQuestionResponseContainer);
                    if (recyclerView != null) {
                        recyclerView.setLayoutManager(new CenterZoomLayoutManager(eVar.requireActivity(), 1, false, 1.0E-4f, 0.0f, null, 48, null));
                    }
                    RecyclerView recyclerView2 = (RecyclerView) eVar._$_findCachedViewById(R.id.rvMatchingQuestionResponseContainer);
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter(new ao.b(arrayList3, z10, new bo.c(eVar, z10), new bo.d(eVar, z10)));
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(eVar.f4566u, e10);
                }
                this.f4572u.getClass();
                eVar.O(false, false);
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                int i6 = e.C;
                eVar.O(true, true);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NewOnBoardingMatchingResultFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements l<SingleUseEvent<? extends Boolean>, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
            Boolean contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            if (contentIfNotHandled != null && contentIfNotHandled.booleanValue()) {
                int i6 = e.C;
                e.this.O(true, true);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f4575u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f4575u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f4575u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f4576u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f4576u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f4576u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* renamed from: bo.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0087e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f4577u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0087e(Fragment fragment) {
            super(0);
            this.f4577u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f4577u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public e() {
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new w(25, this));
        kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…e(TAG, e)\n        }\n    }");
        this.A = registerForActivityResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x029a A[Catch: Exception -> 0x0296, TRY_LEAVE, TryCatch #4 {Exception -> 0x0296, blocks: (B:90:0x025b, B:94:0x0262, B:99:0x0270, B:103:0x029a), top: B:169:0x025b }] */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc A[Catch: Exception -> 0x02ab, TryCatch #2 {Exception -> 0x02ab, blocks: (B:18:0x0061, B:19:0x006c, B:21:0x0072, B:23:0x0085, B:25:0x0090, B:26:0x00a1, B:28:0x00a7, B:30:0x00b8, B:34:0x00e7, B:36:0x00fc, B:37:0x010b, B:39:0x0111, B:41:0x0120, B:43:0x012e, B:45:0x0134, B:47:0x0141, B:49:0x0147, B:51:0x0152, B:53:0x0158, B:55:0x0165, B:56:0x0174, B:58:0x017a, B:60:0x0189, B:64:0x019c, B:66:0x01ac, B:68:0x01b2, B:70:0x01ba, B:72:0x01c0, B:74:0x01c6, B:76:0x01ed, B:77:0x01fc, B:79:0x0202, B:81:0x0211, B:83:0x021f, B:84:0x022e, B:86:0x0234, B:88:0x0243), top: B:165:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012e A[Catch: Exception -> 0x02ab, TryCatch #2 {Exception -> 0x02ab, blocks: (B:18:0x0061, B:19:0x006c, B:21:0x0072, B:23:0x0085, B:25:0x0090, B:26:0x00a1, B:28:0x00a7, B:30:0x00b8, B:34:0x00e7, B:36:0x00fc, B:37:0x010b, B:39:0x0111, B:41:0x0120, B:43:0x012e, B:45:0x0134, B:47:0x0141, B:49:0x0147, B:51:0x0152, B:53:0x0158, B:55:0x0165, B:56:0x0174, B:58:0x017a, B:60:0x0189, B:64:0x019c, B:66:0x01ac, B:68:0x01b2, B:70:0x01ba, B:72:0x01c0, B:74:0x01c6, B:76:0x01ed, B:77:0x01fc, B:79:0x0202, B:81:0x0211, B:83:0x021f, B:84:0x022e, B:86:0x0234, B:88:0x0243), top: B:165:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141 A[Catch: Exception -> 0x02ab, TryCatch #2 {Exception -> 0x02ab, blocks: (B:18:0x0061, B:19:0x006c, B:21:0x0072, B:23:0x0085, B:25:0x0090, B:26:0x00a1, B:28:0x00a7, B:30:0x00b8, B:34:0x00e7, B:36:0x00fc, B:37:0x010b, B:39:0x0111, B:41:0x0120, B:43:0x012e, B:45:0x0134, B:47:0x0141, B:49:0x0147, B:51:0x0152, B:53:0x0158, B:55:0x0165, B:56:0x0174, B:58:0x017a, B:60:0x0189, B:64:0x019c, B:66:0x01ac, B:68:0x01b2, B:70:0x01ba, B:72:0x01c0, B:74:0x01c6, B:76:0x01ed, B:77:0x01fc, B:79:0x0202, B:81:0x0211, B:83:0x021f, B:84:0x022e, B:86:0x0234, B:88:0x0243), top: B:165:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0152 A[Catch: Exception -> 0x02ab, TryCatch #2 {Exception -> 0x02ab, blocks: (B:18:0x0061, B:19:0x006c, B:21:0x0072, B:23:0x0085, B:25:0x0090, B:26:0x00a1, B:28:0x00a7, B:30:0x00b8, B:34:0x00e7, B:36:0x00fc, B:37:0x010b, B:39:0x0111, B:41:0x0120, B:43:0x012e, B:45:0x0134, B:47:0x0141, B:49:0x0147, B:51:0x0152, B:53:0x0158, B:55:0x0165, B:56:0x0174, B:58:0x017a, B:60:0x0189, B:64:0x019c, B:66:0x01ac, B:68:0x01b2, B:70:0x01ba, B:72:0x01c0, B:74:0x01c6, B:76:0x01ed, B:77:0x01fc, B:79:0x0202, B:81:0x0211, B:83:0x021f, B:84:0x022e, B:86:0x0234, B:88:0x0243), top: B:165:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165 A[Catch: Exception -> 0x02ab, TryCatch #2 {Exception -> 0x02ab, blocks: (B:18:0x0061, B:19:0x006c, B:21:0x0072, B:23:0x0085, B:25:0x0090, B:26:0x00a1, B:28:0x00a7, B:30:0x00b8, B:34:0x00e7, B:36:0x00fc, B:37:0x010b, B:39:0x0111, B:41:0x0120, B:43:0x012e, B:45:0x0134, B:47:0x0141, B:49:0x0147, B:51:0x0152, B:53:0x0158, B:55:0x0165, B:56:0x0174, B:58:0x017a, B:60:0x0189, B:64:0x019c, B:66:0x01ac, B:68:0x01b2, B:70:0x01ba, B:72:0x01c0, B:74:0x01c6, B:76:0x01ed, B:77:0x01fc, B:79:0x0202, B:81:0x0211, B:83:0x021f, B:84:0x022e, B:86:0x0234, B:88:0x0243), top: B:165:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0270 A[Catch: Exception -> 0x0296, TryCatch #4 {Exception -> 0x0296, blocks: (B:90:0x025b, B:94:0x0262, B:99:0x0270, B:103:0x029a), top: B:169:0x025b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        String str;
        hs.j<String, String, Integer> jVar;
        String str2;
        hs.j<String, String, Integer> jVar2;
        String str3;
        String str4;
        ArrayList arrayList;
        eo.f fVar;
        ArrayList arrayList2;
        MatchingFlowModel matchingFlowModel;
        List<hs.j<String, String, Integer>> list;
        ArrayList<String> arrayList3;
        hs.j<String, String, Integer> jVar3;
        String str5;
        hs.j<String, String, Integer> jVar4;
        String str6;
        hs.j<String, String, Integer> jVar5;
        String str7;
        List<hs.j<String, String, Integer>> list2;
        ArrayList<String> arrayList4;
        String str8;
        hs.j<String, String, Integer> jVar6;
        e eVar;
        eo.f fVar2;
        MatchingFlowUserResponseModel matchingFlowUserResponseModel;
        String str9;
        hs.j<String, String, Integer> jVar7;
        String str10;
        ArrayList<String> arrayList5;
        ArrayList<String> arrayList6;
        String str11;
        eo.f fVar3;
        MatchingFlowUserResponseModel matchingFlowUserResponseModel2;
        ArrayList<String> arrayList7;
        String str12;
        String str13;
        String str14;
        String str15;
        hs.j<String, String, Integer> jVar8;
        ArrayList<String> arrayList8;
        String str16;
        boolean z10 = this.f4568w;
        String str17 = "therapy";
        String str18 = this.f4566u;
        if (z10) {
            try {
                eo.f K = K();
                K.getClass();
                hs.j<String, String, Integer> jVar9 = K().B;
                if (jVar9 != null) {
                    try {
                        String str19 = jVar9.f19474v;
                        if (str19 != null && (jVar = K().A) != null && (str2 = jVar.f19474v) != null && (jVar2 = K.C) != null) {
                            str3 = "off";
                            List<hs.j<String, String, Integer>> list3 = K().f14444y;
                            if (list3 != null) {
                                str4 = "psychiatry";
                                str = str18;
                                try {
                                    arrayList = new ArrayList(is.i.H1(list3, 10));
                                    Iterator<T> it = list3.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add((String) ((hs.j) it.next()).f19474v);
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    LogHelper.INSTANCE.e(str, e);
                                    return;
                                }
                            } else {
                                str4 = "psychiatry";
                                str = str18;
                                arrayList = null;
                            }
                            kotlin.jvm.internal.i.e(arrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                            List<hs.j<String, String, Integer>> list4 = K().f14445z;
                            if (list4 != null) {
                                fVar = K;
                                arrayList2 = new ArrayList(is.i.H1(list4, 10));
                                Iterator<T> it2 = list4.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add((String) ((hs.j) it2.next()).f19474v);
                                }
                            } else {
                                fVar = K;
                                arrayList2 = null;
                            }
                            kotlin.jvm.internal.i.e(arrayList2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                            matchingFlowModel = new MatchingFlowModel(str19, str2, arrayList, arrayList2, K().D, jVar2.f19474v, 5, "app");
                            String str20 = gk.a.f16573a;
                            Bundle bundle = new Bundle();
                            bundle.putString("flow", "therapy");
                            bundle.putString("source", "app_onboarding_matching");
                            list = K().f14444y;
                            if (list == null) {
                                arrayList3 = new ArrayList<>(is.i.H1(list, 10));
                                Iterator<T> it3 = list.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add((String) ((hs.j) it3.next()).f19474v);
                                }
                            } else {
                                arrayList3 = null;
                            }
                            kotlin.jvm.internal.i.e(arrayList3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                            bundle.putStringArrayList("filter_concern", arrayList3);
                            jVar3 = K().A;
                            if (jVar3 == null) {
                                str5 = jVar3.f19474v;
                            } else {
                                str5 = null;
                            }
                            bundle.putString("filter_cq1", str5);
                            jVar4 = K().B;
                            if (jVar4 == null) {
                                str6 = jVar4.f19474v;
                            } else {
                                str6 = null;
                            }
                            bundle.putString("filter_cq2", str6);
                            jVar5 = K().C;
                            if (jVar5 == null) {
                                str7 = jVar5.f19474v;
                            } else {
                                str7 = null;
                            }
                            bundle.putString("filter_age", str7);
                            list2 = K().f14445z;
                            if (list2 == null) {
                                arrayList4 = new ArrayList<>(is.i.H1(list2, 10));
                                Iterator<T> it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    arrayList4.add((String) ((hs.j) it4.next()).f19474v);
                                }
                            } else {
                                arrayList4 = null;
                            }
                            kotlin.jvm.internal.i.e(arrayList4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                            bundle.putStringArrayList("filter_lang", arrayList4);
                            if (!K().D) {
                                str8 = "on";
                            } else {
                                str8 = str3;
                            }
                            bundle.putString("filter_24h_availability", str8);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(bundle, "setpref_flow_complete");
                            jVar6 = K().B;
                            if (jVar6 == null && (str9 = jVar6.f19474v) != null && (jVar7 = K().A) != null && (str10 = jVar7.f19474v) != null) {
                                fVar2 = fVar;
                                hs.j<String, String, Integer> jVar10 = fVar2.C;
                                if (jVar10 != null) {
                                    matchingFlowUserResponseModel = new MatchingFlowUserResponseModel(null, null, null, null, false, null, null, 127, null);
                                    matchingFlowUserResponseModel.setDifficulty(str9);
                                    matchingFlowUserResponseModel.setDuration(str10);
                                    List<hs.j<String, String, Integer>> list5 = K().f14444y;
                                    if (list5 != null) {
                                        arrayList5 = new ArrayList<>(is.i.H1(list5, 10));
                                        Iterator<T> it5 = list5.iterator();
                                        while (it5.hasNext()) {
                                            arrayList5.add((String) ((hs.j) it5.next()).f19474v);
                                        }
                                    } else {
                                        arrayList5 = null;
                                    }
                                    kotlin.jvm.internal.i.e(arrayList5, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                    matchingFlowUserResponseModel.setExpertise(arrayList5);
                                    List<hs.j<String, String, Integer>> list6 = K().f14445z;
                                    if (list6 != null) {
                                        arrayList6 = new ArrayList<>(is.i.H1(list6, 10));
                                        Iterator<T> it6 = list6.iterator();
                                        while (it6.hasNext()) {
                                            arrayList6.add((String) ((hs.j) it6.next()).f19474v);
                                        }
                                    } else {
                                        arrayList6 = null;
                                    }
                                    kotlin.jvm.internal.i.e(arrayList6, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                    matchingFlowUserResponseModel.setLanguages(arrayList6);
                                    matchingFlowUserResponseModel.setNeedImmediately(K().D);
                                    matchingFlowUserResponseModel.setUserAge(jVar10.f19474v);
                                    eVar = this;
                                    try {
                                        if (!eVar.f4568w) {
                                            str17 = str4;
                                        }
                                        matchingFlowUserResponseModel.setOnBoardingType(str17);
                                        if (matchingFlowModel != null) {
                                            ((LottieAnimationView) eVar._$_findCachedViewById(R.id.loaderView)).j();
                                            ((LottieAnimationView) eVar._$_findCachedViewById(R.id.loaderView)).setRepeatCount(-1);
                                            v.H(kc.f.H(fVar2), null, 0, new eo.d(fVar2, matchingFlowModel, false, null), 3);
                                        }
                                        if (matchingFlowUserResponseModel != null) {
                                            v.H(kc.f.H(fVar2), null, 0, new eo.e(fVar2, matchingFlowUserResponseModel, null), 3);
                                            return;
                                        }
                                        return;
                                    } catch (Exception e11) {
                                        e = e11;
                                        LogHelper.INSTANCE.e(str, e);
                                        return;
                                    }
                                }
                                eVar = this;
                            } else {
                                eVar = this;
                                fVar2 = fVar;
                            }
                            matchingFlowUserResponseModel = null;
                            if (matchingFlowModel != null) {
                            }
                            if (matchingFlowUserResponseModel != null) {
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        str = str18;
                        LogHelper.INSTANCE.e(str, e);
                        return;
                    }
                }
                fVar = K;
                str4 = "psychiatry";
                str = str18;
                str3 = "off";
                matchingFlowModel = null;
                String str202 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                bundle2.putString("flow", "therapy");
                bundle2.putString("source", "app_onboarding_matching");
                list = K().f14444y;
                if (list == null) {
                }
                kotlin.jvm.internal.i.e(arrayList3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                bundle2.putStringArrayList("filter_concern", arrayList3);
                jVar3 = K().A;
                if (jVar3 == null) {
                }
                bundle2.putString("filter_cq1", str5);
                jVar4 = K().B;
                if (jVar4 == null) {
                }
                bundle2.putString("filter_cq2", str6);
                jVar5 = K().C;
                if (jVar5 == null) {
                }
                bundle2.putString("filter_age", str7);
                list2 = K().f14445z;
                if (list2 == null) {
                }
                kotlin.jvm.internal.i.e(arrayList4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                bundle2.putStringArrayList("filter_lang", arrayList4);
                if (!K().D) {
                }
                bundle2.putString("filter_24h_availability", str8);
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(bundle2, "setpref_flow_complete");
                jVar6 = K().B;
                if (jVar6 == null) {
                }
                eVar = this;
                fVar2 = fVar;
                matchingFlowUserResponseModel = null;
                if (matchingFlowModel != null) {
                }
                if (matchingFlowUserResponseModel != null) {
                }
            } catch (Exception e13) {
                e = e13;
                str = str18;
            }
        } else {
            try {
                eo.f K2 = K();
                ((LottieAnimationView) _$_findCachedViewById(R.id.loaderView)).j();
                ((LottieAnimationView) _$_findCachedViewById(R.id.loaderView)).setRepeatCount(-1);
                K2.getClass();
                str11 = str18;
                try {
                    v.H(kc.f.H(K2), null, 0, new eo.b(K2, true, null), 3);
                    hs.j<String, String, Integer> jVar11 = K().A;
                    if (jVar11 != null && (str15 = jVar11.f19474v) != null && (jVar8 = K2.C) != null) {
                        matchingFlowUserResponseModel2 = new MatchingFlowUserResponseModel(null, null, null, null, false, null, null, 127, null);
                        matchingFlowUserResponseModel2.setDifficulty("");
                        matchingFlowUserResponseModel2.setDuration(str15);
                        List<hs.j<String, String, Integer>> list7 = K().f14444y;
                        if (list7 != null) {
                            fVar3 = K2;
                            arrayList8 = new ArrayList<>(is.i.H1(list7, 10));
                            Iterator<T> it7 = list7.iterator();
                            while (it7.hasNext()) {
                                arrayList8.add((String) ((hs.j) it7.next()).f19474v);
                            }
                        } else {
                            fVar3 = K2;
                            arrayList8 = null;
                        }
                        kotlin.jvm.internal.i.e(arrayList8, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                        matchingFlowUserResponseModel2.setExpertise(arrayList8);
                        matchingFlowUserResponseModel2.setLanguages(new ArrayList<>());
                        matchingFlowUserResponseModel2.setNeedImmediately(K().D);
                        matchingFlowUserResponseModel2.setUserAge(jVar8.f19474v);
                        if (this.f4568w) {
                            str16 = "therapy";
                        } else {
                            str16 = "psychiatry";
                        }
                        matchingFlowUserResponseModel2.setOnBoardingType(str16);
                    } else {
                        fVar3 = K2;
                        matchingFlowUserResponseModel2 = null;
                    }
                    String str21 = gk.a.f16573a;
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("flow", "psychiatry");
                    bundle3.putString("source", "app_onboarding_matching");
                    List<hs.j<String, String, Integer>> list8 = K().f14444y;
                    if (list8 != null) {
                        arrayList7 = new ArrayList<>(is.i.H1(list8, 10));
                        Iterator<T> it8 = list8.iterator();
                        while (it8.hasNext()) {
                            arrayList7.add((String) ((hs.j) it8.next()).f19474v);
                        }
                    } else {
                        arrayList7 = null;
                    }
                    kotlin.jvm.internal.i.e(arrayList7, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    bundle3.putStringArrayList("filter_concern", arrayList7);
                    hs.j<String, String, Integer> jVar12 = K().A;
                    if (jVar12 != null) {
                        str12 = jVar12.f19474v;
                    } else {
                        str12 = null;
                    }
                    bundle3.putString("filter_cq1", str12);
                    hs.j<String, String, Integer> jVar13 = K().C;
                    if (jVar13 != null) {
                        str13 = jVar13.f19474v;
                    } else {
                        str13 = null;
                    }
                    bundle3.putString("filter_age", str13);
                    if (K().D) {
                        str14 = "on";
                    } else {
                        str14 = "off";
                    }
                    bundle3.putString("filter_24h_availability", str14);
                    hs.k kVar3 = hs.k.f19476a;
                    gk.a.b(bundle3, "setpref_flow_complete");
                    if (matchingFlowUserResponseModel2 != null) {
                        v.H(kc.f.H(fVar3), null, 0, new eo.e(fVar3, matchingFlowUserResponseModel2, null), 3);
                    }
                } catch (Exception e14) {
                    e = e14;
                    LogHelper.INSTANCE.e(str11, e);
                }
            } catch (Exception e15) {
                e = e15;
                str11 = str18;
            }
        }
    }

    public final eo.f K() {
        return (eo.f) this.f4567v.getValue();
    }

    public final void M() {
        try {
            eo.f K = K();
            K.F.e(getViewLifecycleOwner(), new nn.k(14, new a(K, this)));
            K.G.e(getViewLifecycleOwner(), new nn.k(15, new b()));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4566u, e10);
        }
    }

    public final void O(boolean z10, boolean z11) {
        String str;
        try {
            if (z10 && z11) {
                String str2 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                if (this.f4568w) {
                    str = "therapy";
                } else {
                    str = "psychiatry";
                }
                bundle.putString("flow", str);
                bundle.putString("source", "app_onboarding_matching");
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "onboarding_matching_fetch_failure");
                this.f4571z = false;
                ((LottieAnimationView) _$_findCachedViewById(R.id.loaderView)).g();
                ((Group) _$_findCachedViewById(R.id.groupLoader)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingResultTryAgain)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvMRMatchingTitle)).setText(requireActivity().getString(R.string.on_boarding_matching_failed_loader_title));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvMRMatchingDescription)).setText(requireActivity().getString(R.string.on_boarding_matching_failed_loader_description, this.f4569x));
            } else if (z10) {
                this.f4571z = false;
                ((LottieAnimationView) _$_findCachedViewById(R.id.loaderView)).j();
                ((LottieAnimationView) _$_findCachedViewById(R.id.loaderView)).setRepeatCount(-1);
                ((Group) _$_findCachedViewById(R.id.groupLoader)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingResultTryAgain)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvMRMatchingTitle)).setText(requireActivity().getString(R.string.on_boarding_matching_loader_title));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvMRMatchingDescription)).setText(requireActivity().getString(R.string.on_boarding_matching_loader_description, this.f4569x));
            } else {
                this.f4571z = true;
                ((Group) _$_findCachedViewById(R.id.groupLoader)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingResultTryAgain)).setVisibility(8);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4566u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.B;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_new_on_boarding_matching_result, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.B.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        String str;
        kotlin.jvm.internal.i.g(view, "view");
        try {
            super.onViewCreated(view, bundle);
            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
            firebasePersistence.getUser().setCurrentCourseName(Constants.COURSE_GENERIC);
            firebasePersistence.getUser().setCurrentCourse(UtilsKt.getCourseId(Constants.COURSE_GENERIC));
            firebasePersistence.updateUserOnFirebase();
            Bundle arguments = getArguments();
            if (arguments != null && arguments.getBoolean("isTherapist", false)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f4568w = z10;
            if (z10) {
                str = "therapist";
            } else {
                str = "psychiatrist";
            }
            this.f4569x = str;
            ((RobertoTextView) _$_findCachedViewById(R.id.tvMRMatchingDescription)).setText(requireActivity().getString(R.string.on_boarding_matching_loader_description, this.f4569x));
            M();
            if (this.f4568w) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionText)).setText(getString(R.string.on_boarding_result_recommended_therapist));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionSubText)).setText(getString(R.string.on_boarding_result_recommended_therapist_des));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionFooter)).setText(getString(R.string.on_boarding_result_explore_therapist));
                J();
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionText)).setText(getString(R.string.on_boarding_result_recommended_psychiatrist));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionSubText)).setText(getString(R.string.on_boarding_result_recommended_psychiatrist_des));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionFooter)).setText(getString(R.string.on_boarding_result_explore_psychiatrist));
                J();
            }
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivMatchingQuestionBack)).setOnClickListener(new bo.b(this, 0));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionFooter)).setOnClickListener(DebouncedOnClickListener.wrap(new bo.b(this, 1)));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingResultTryAgain)).setOnClickListener(new bo.b(this, 2));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4566u, e10);
        }
    }
}
