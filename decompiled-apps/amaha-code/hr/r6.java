package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SimpleItemTouchVerticalDragHelperCallback;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ek.k1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ScreenS22Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/r6;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class r6 extends rr.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: x  reason: collision with root package name */
    public androidx.recyclerview.widget.k f19091x;

    /* renamed from: y  reason: collision with root package name */
    public ek.k1 f19092y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f19093z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19088u = LogHelper.INSTANCE.makeLogTag(r6.class);

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<String> f19089v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public HashMap<String, String> f19090w = new HashMap<>();

    /* compiled from: ScreenS22Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements kr.c {
        public a() {
        }

        @Override // kr.c
        public final void a(k1.a aVar) {
            androidx.recyclerview.widget.k kVar = r6.this.f19091x;
            if (kVar != null) {
                kVar.t(aVar);
            } else {
                kotlin.jvm.internal.i.q("touchHelper");
                throw null;
            }
        }
    }

    @Override // rr.b
    public final boolean I() {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        if (((TemplateActivity) activity).getIntent().hasExtra("source")) {
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (r1.b0.c((TemplateActivity) activity2, "source", "goals")) {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity3).Q = true;
                androidx.fragment.app.p activity4 = getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (!kotlin.jvm.internal.i.b(((TemplateActivity) activity4).B0(), "s12c")) {
                    androidx.fragment.app.p activity5 = getActivity();
                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (!kotlin.jvm.internal.i.b(((TemplateActivity) activity5).B0(), "s12-c")) {
                        androidx.fragment.app.p activity6 = getActivity();
                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        Goal y02 = ((TemplateActivity) activity6).y0();
                        kotlin.jvm.internal.i.d(y02);
                        if (kotlin.jvm.internal.i.b(y02.getGoalId(), "xe7jcogqngzLjogc87oW")) {
                            androidx.fragment.app.p activity7 = getActivity();
                            kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            HashMap<String, Object> hashMap = ((TemplateActivity) activity7).F;
                            androidx.fragment.app.p activity8 = getActivity();
                            kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            Object obj = ((TemplateActivity) activity8).F.get("result_3_initial_val");
                            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                            hashMap.put("list", (ArrayList) obj);
                        }
                        androidx.fragment.app.p activity9 = getActivity();
                        kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        ((TemplateActivity) activity9).J0();
                        return false;
                    }
                }
                androidx.fragment.app.p activity10 = getActivity();
                kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity10).s0(new t8());
                return false;
            }
        }
        return true;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19093z;
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
        return inflater.inflate(R.layout.fragment_screen_s22, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19093z.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091 A[Catch: Exception -> 0x024f, TRY_ENTER, TryCatch #0 {Exception -> 0x024f, blocks: (B:3:0x000e, B:6:0x0039, B:8:0x003f, B:11:0x0046, B:12:0x004a, B:14:0x0053, B:18:0x0067, B:30:0x008b, B:33:0x0091, B:35:0x0097, B:39:0x00b7, B:41:0x00bd, B:44:0x00c4, B:45:0x00ec, B:36:0x00a3, B:38:0x00a9, B:21:0x0071, B:24:0x0079, B:27:0x0083, B:46:0x0114, B:49:0x011e, B:51:0x0122, B:53:0x0128, B:55:0x013c, B:58:0x014e, B:60:0x0154, B:64:0x0187, B:61:0x0162, B:63:0x016b, B:54:0x0132, B:65:0x01b9, B:68:0x01de, B:70:0x01f9, B:71:0x0247, B:72:0x024a, B:73:0x024b, B:74:0x024e), top: B:78:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9 A[Catch: Exception -> 0x024f, TryCatch #0 {Exception -> 0x024f, blocks: (B:3:0x000e, B:6:0x0039, B:8:0x003f, B:11:0x0046, B:12:0x004a, B:14:0x0053, B:18:0x0067, B:30:0x008b, B:33:0x0091, B:35:0x0097, B:39:0x00b7, B:41:0x00bd, B:44:0x00c4, B:45:0x00ec, B:36:0x00a3, B:38:0x00a9, B:21:0x0071, B:24:0x0079, B:27:0x0083, B:46:0x0114, B:49:0x011e, B:51:0x0122, B:53:0x0128, B:55:0x013c, B:58:0x014e, B:60:0x0154, B:64:0x0187, B:61:0x0162, B:63:0x016b, B:54:0x0132, B:65:0x01b9, B:68:0x01de, B:70:0x01f9, B:71:0x0247, B:72:0x024a, B:73:0x024b, B:74:0x024e), top: B:78:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd A[Catch: Exception -> 0x024f, TryCatch #0 {Exception -> 0x024f, blocks: (B:3:0x000e, B:6:0x0039, B:8:0x003f, B:11:0x0046, B:12:0x004a, B:14:0x0053, B:18:0x0067, B:30:0x008b, B:33:0x0091, B:35:0x0097, B:39:0x00b7, B:41:0x00bd, B:44:0x00c4, B:45:0x00ec, B:36:0x00a3, B:38:0x00a9, B:21:0x0071, B:24:0x0079, B:27:0x0083, B:46:0x0114, B:49:0x011e, B:51:0x0122, B:53:0x0128, B:55:0x013c, B:58:0x014e, B:60:0x0154, B:64:0x0187, B:61:0x0162, B:63:0x016b, B:54:0x0132, B:65:0x01b9, B:68:0x01de, B:70:0x01f9, B:71:0x0247, B:72:0x024a, B:73:0x024b, B:74:0x024e), top: B:78:0x000e }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<String> paramsMapToList;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            HashMap<String, Object> A0 = ((TemplateActivity) activity).A0();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            final TemplateActivity templateActivity = (TemplateActivity) activity2;
            final String B0 = templateActivity.B0();
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity3).Q) {
                if (!kotlin.jvm.internal.i.b(B0, "s12c") && !kotlin.jvm.internal.i.b(B0, "s12-c")) {
                    templateActivity.J0();
                    return;
                }
                templateActivity.s0(new t8());
                return;
            }
            int hashCode = B0.hashCode();
            HashMap<String, Object> hashMap = templateActivity.F;
            switch (hashCode) {
                case 112115:
                    if (B0.equals("s22")) {
                        if (templateActivity.J && hashMap.containsKey("s22_user_list")) {
                            Object obj = hashMap.get("s22_user_list");
                            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                            paramsMapToList = (ArrayList) obj;
                        } else {
                            paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s22_heading_list"));
                        }
                        this.f19089v = paramsMapToList;
                        ArrayList<String> paramsMapToList2 = UtilFunKt.paramsMapToList(A0.get("s22_descriptioin_list"));
                        if (templateActivity.J && hashMap.containsKey("heading_desc_map")) {
                            Object obj2 = hashMap.get("heading_desc_map");
                            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
                            this.f19090w = (HashMap) obj2;
                        } else {
                            int size = this.f19089v.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                HashMap<String, String> hashMap2 = this.f19090w;
                                String str = this.f19089v.get(i6);
                                kotlin.jvm.internal.i.f(str, "recyclerList[i]");
                                String str2 = paramsMapToList2.get(i6);
                                kotlin.jvm.internal.i.f(str2, "descList[i]");
                                hashMap2.put(str, str2);
                            }
                        }
                        hashMap.put("list_heading", this.f19089v);
                        hashMap.put("heading_desc_map", this.f19090w);
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvS22Header)).setText(UtilFunKt.paramsMapToString(A0.get("s22_heading")));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS22Button)).setText(UtilFunKt.paramsMapToString(A0.get("s22_btn_text")));
                        break;
                    } else {
                        break;
                    }
                    break;
                case 3474703:
                    if (!B0.equals("s12c")) {
                        break;
                    }
                    if (!templateActivity.J && hashMap.containsKey("s22b_user_list")) {
                        Object obj3 = hashMap.get("s22b_user_list");
                        kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                        this.f19089v = (ArrayList) obj3;
                    } else if (hashMap.containsKey("list")) {
                        Object obj4 = hashMap.get("list");
                        kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                        ArrayList<String> arrayList = (ArrayList) obj4;
                        this.f19089v = arrayList;
                        hashMap.put("s22b_user_list", arrayList);
                    }
                    if (!kotlin.jvm.internal.i.b(B0, "s12-c") && !kotlin.jvm.internal.i.b(B0, "s12c")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvS22Header)).setText(UtilFunKt.paramsMapToString(A0.get("s22b_heading")));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS22Button)).setText(UtilFunKt.paramsMapToString(A0.get("s22b_btn_text")));
                        break;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS22Header)).setText(UtilFunKt.paramsMapToString(A0.get("s22c_heading")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS22Button)).setText(UtilFunKt.paramsMapToString(A0.get("s22c_btn_text")));
                    break;
                case 3475663:
                    if (!B0.equals("s22b")) {
                        break;
                    }
                    if (!templateActivity.J) {
                        break;
                    }
                    if (hashMap.containsKey("list")) {
                    }
                    if (!kotlin.jvm.internal.i.b(B0, "s12-c")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvS22Header)).setText(UtilFunKt.paramsMapToString(A0.get("s22b_heading")));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS22Button)).setText(UtilFunKt.paramsMapToString(A0.get("s22b_btn_text")));
                        break;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS22Header)).setText(UtilFunKt.paramsMapToString(A0.get("s22c_heading")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS22Button)).setText(UtilFunKt.paramsMapToString(A0.get("s22c_btn_text")));
                    break;
                case 107714218:
                    if (!B0.equals("s12-c")) {
                        break;
                    }
                    if (!templateActivity.J) {
                    }
                    if (hashMap.containsKey("list")) {
                    }
                    if (!kotlin.jvm.internal.i.b(B0, "s12-c")) {
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS22Header)).setText(UtilFunKt.paramsMapToString(A0.get("s22c_heading")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS22Button)).setText(UtilFunKt.paramsMapToString(A0.get("s22c_btn_text")));
                    break;
                case 107744008:
                    if (!B0.equals("s22-b")) {
                        break;
                    }
                    if (!templateActivity.J) {
                    }
                    if (hashMap.containsKey("list")) {
                    }
                    if (!kotlin.jvm.internal.i.b(B0, "s12-c")) {
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS22Header)).setText(UtilFunKt.paramsMapToString(A0.get("s22c_heading")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS22Button)).setText(UtilFunKt.paramsMapToString(A0.get("s22c_btn_text")));
                    break;
            }
            a aVar = new a();
            androidx.fragment.app.p activity4 = getActivity();
            kotlin.jvm.internal.i.d(activity4);
            this.f19092y = new ek.k1(aVar, activity4, this.f19089v);
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvS22List);
            ek.k1 k1Var = this.f19092y;
            if (k1Var != null) {
                recyclerView.setAdapter(k1Var);
                ((RecyclerView) _$_findCachedViewById(R.id.rvS22List)).setLayoutManager(new LinearLayoutManager(getActivity()));
                ek.k1 k1Var2 = this.f19092y;
                if (k1Var2 != null) {
                    androidx.recyclerview.widget.k kVar = new androidx.recyclerview.widget.k(new SimpleItemTouchVerticalDragHelperCallback(k1Var2));
                    this.f19091x = kVar;
                    kVar.i((RecyclerView) _$_findCachedViewById(R.id.rvS22List));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS22Button)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.q6

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ r6 f19021v;

                        {
                            this.f19021v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i10 = r4;
                            String slug = B0;
                            TemplateActivity act = templateActivity;
                            r6 this$0 = this.f19021v;
                            switch (i10) {
                                case 0:
                                    int i11 = r6.A;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(act, "$act");
                                    kotlin.jvm.internal.i.g(slug, "$slug");
                                    try {
                                        int size2 = this$0.f19089v.size();
                                        HashMap<String, Object> hashMap3 = act.F;
                                        if (size2 < 2) {
                                            hashMap3.put("list", this$0.f19089v);
                                        } else {
                                            List<String> subList = this$0.f19089v.subList(0, 2);
                                            kotlin.jvm.internal.i.f(subList, "recyclerList.subList(0, 2)");
                                            hashMap3.put("list", is.u.I2(subList));
                                        }
                                        hashMap3.put("s22_user_list", this$0.f19089v);
                                        hashMap3.put("heading_desc_map", this$0.f19090w);
                                        if (!kotlin.jvm.internal.i.b(slug, "s12c") && !kotlin.jvm.internal.i.b(slug, "s12-c")) {
                                            act.t0();
                                            return;
                                        }
                                        act.s0(new t8());
                                        return;
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(this$0.f19088u, "exception", e10);
                                        return;
                                    }
                                default:
                                    int i12 = r6.A;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(act, "$act");
                                    kotlin.jvm.internal.i.g(slug, "$slug");
                                    androidx.fragment.app.p activity5 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    if (((TemplateActivity) activity5).getIntent().hasExtra("source") && r1.b0.c(act, "source", "goals")) {
                                        androidx.fragment.app.p activity6 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        ((TemplateActivity) activity6).Q = true;
                                        if (!kotlin.jvm.internal.i.b(slug, "s12c") && !kotlin.jvm.internal.i.b(slug, "s12-c")) {
                                            Goal y02 = act.y0();
                                            kotlin.jvm.internal.i.d(y02);
                                            if (kotlin.jvm.internal.i.b(y02.getGoalId(), "xe7jcogqngzLjogc87oW")) {
                                                HashMap<String, Object> hashMap4 = act.F;
                                                Object obj5 = hashMap4.get("result_3_initial_val");
                                                kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                                                hashMap4.put("list", (ArrayList) obj5);
                                            }
                                            act.J0();
                                            return;
                                        }
                                        act.s0(new t8());
                                        return;
                                    }
                                    act.onBackPressed();
                                    return;
                            }
                        }
                    });
                    ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                    ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                    ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.q6

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ r6 f19021v;

                        {
                            this.f19021v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i10 = r4;
                            String slug = B0;
                            TemplateActivity act = templateActivity;
                            r6 this$0 = this.f19021v;
                            switch (i10) {
                                case 0:
                                    int i11 = r6.A;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(act, "$act");
                                    kotlin.jvm.internal.i.g(slug, "$slug");
                                    try {
                                        int size2 = this$0.f19089v.size();
                                        HashMap<String, Object> hashMap3 = act.F;
                                        if (size2 < 2) {
                                            hashMap3.put("list", this$0.f19089v);
                                        } else {
                                            List<String> subList = this$0.f19089v.subList(0, 2);
                                            kotlin.jvm.internal.i.f(subList, "recyclerList.subList(0, 2)");
                                            hashMap3.put("list", is.u.I2(subList));
                                        }
                                        hashMap3.put("s22_user_list", this$0.f19089v);
                                        hashMap3.put("heading_desc_map", this$0.f19090w);
                                        if (!kotlin.jvm.internal.i.b(slug, "s12c") && !kotlin.jvm.internal.i.b(slug, "s12-c")) {
                                            act.t0();
                                            return;
                                        }
                                        act.s0(new t8());
                                        return;
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(this$0.f19088u, "exception", e10);
                                        return;
                                    }
                                default:
                                    int i12 = r6.A;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(act, "$act");
                                    kotlin.jvm.internal.i.g(slug, "$slug");
                                    androidx.fragment.app.p activity5 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    if (((TemplateActivity) activity5).getIntent().hasExtra("source") && r1.b0.c(act, "source", "goals")) {
                                        androidx.fragment.app.p activity6 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        ((TemplateActivity) activity6).Q = true;
                                        if (!kotlin.jvm.internal.i.b(slug, "s12c") && !kotlin.jvm.internal.i.b(slug, "s12-c")) {
                                            Goal y02 = act.y0();
                                            kotlin.jvm.internal.i.d(y02);
                                            if (kotlin.jvm.internal.i.b(y02.getGoalId(), "xe7jcogqngzLjogc87oW")) {
                                                HashMap<String, Object> hashMap4 = act.F;
                                                Object obj5 = hashMap4.get("result_3_initial_val");
                                                kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                                                hashMap4.put("list", (ArrayList) obj5);
                                            }
                                            act.J0();
                                            return;
                                        }
                                        act.s0(new t8());
                                        return;
                                    }
                                    act.onBackPressed();
                                    return;
                            }
                        }
                    });
                    return;
                }
                kotlin.jvm.internal.i.q("adapter");
                throw null;
            }
            kotlin.jvm.internal.i.q("adapter");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19088u, "exception in on view created", e10);
        }
    }
}
