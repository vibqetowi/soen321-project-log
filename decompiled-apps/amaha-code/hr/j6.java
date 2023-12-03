package hr;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.HorizontalPickerLayoutManager;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ek.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS19Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/j6;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j6 extends rr.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<String> f18620v;

    /* renamed from: w  reason: collision with root package name */
    public TemplateActivity f18621w;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f18623y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f18624z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18619u = LogHelper.INSTANCE.makeLogTag(j6.class);

    /* renamed from: x  reason: collision with root package name */
    public HashMap<String, Object> f18622x = new HashMap<>();

    /* compiled from: ScreenS19Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements HorizontalPickerLayoutManager.OnItemSelectedListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HashMap<String, Object> f18625a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ j6 f18626b;

        public a(HashMap<String, Object> hashMap, j6 j6Var) {
            this.f18625a = hashMap;
            this.f18626b = j6Var;
        }

        @Override // com.theinnerhour.b2b.utils.HorizontalPickerLayoutManager.OnItemSelectedListener
        public final void onItemSelected(int i6) {
            if (i6 != -1) {
                ArrayList<String> arrayList = this.f18626b.f18623y;
                if (arrayList != null) {
                    String str = arrayList.get(i6);
                    kotlin.jvm.internal.i.f(str, "looplist[layoutPosition]");
                    this.f18625a.put("loops", str);
                    return;
                }
                kotlin.jvm.internal.i.q("looplist");
                throw null;
            }
        }
    }

    /* compiled from: ScreenS19Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements l.a {
        public b() {
        }

        @Override // ek.l.a
        public final void a(View view) {
            int i6;
            kotlin.jvm.internal.i.g(view, "view");
            j6 j6Var = j6.this;
            RecyclerView recyclerView = (RecyclerView) j6Var._$_findCachedViewById(R.id.s19HorizontalPickerRv);
            ((RecyclerView) j6Var._$_findCachedViewById(R.id.s19HorizontalPickerRv)).getClass();
            RecyclerView.c0 L = RecyclerView.L(view);
            if (L != null) {
                i6 = L.h();
            } else {
                i6 = -1;
            }
            recyclerView.l0(i6);
        }
    }

    /* compiled from: ScreenS19Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            j6 j6Var = j6.this;
            RecyclerView recyclerView = (RecyclerView) j6Var._$_findCachedViewById(R.id.s19HorizontalPickerRv);
            if (recyclerView != null) {
                recyclerView.l0(0);
            }
            ((RecyclerView) j6Var._$_findCachedViewById(R.id.s19HorizontalPickerRv)).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public final TemplateActivity J() {
        TemplateActivity templateActivity = this.f18621w;
        if (templateActivity != null) {
            return templateActivity;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final void K() {
        HashMap<String, Object> hashMap = J().F;
        ArrayList<String> arrayList = this.f18623y;
        if (arrayList != null) {
            String str = arrayList.get(0);
            kotlin.jvm.internal.i.f(str, "looplist[0]");
            hashMap.put("loops", str);
            UiUtils.Companion companion = UiUtils.Companion;
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            Context requireContext2 = requireContext();
            kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
            int screenWidth = (companion.getScreenWidth(requireContext) / 2) - companion.dpToPx(requireContext2, 40);
            ((RecyclerView) _$_findCachedViewById(R.id.s19HorizontalPickerRv)).setPadding(screenWidth, 0, screenWidth, 0);
            HorizontalPickerLayoutManager horizontalPickerLayoutManager = new HorizontalPickerLayoutManager(getContext());
            horizontalPickerLayoutManager.setCallback(new a(hashMap, this));
            ((RecyclerView) _$_findCachedViewById(R.id.s19HorizontalPickerRv)).setLayoutManager(horizontalPickerLayoutManager);
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.s19HorizontalPickerRv);
            ek.l lVar = new ek.l();
            ArrayList<String> arrayList2 = this.f18620v;
            if (arrayList2 != null) {
                ArrayList<String> arrayList3 = lVar.f14197x;
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
                lVar.i();
                lVar.f14198y = new b();
                recyclerView.setAdapter(lVar);
                ((RecyclerView) _$_findCachedViewById(R.id.s19HorizontalPickerRv)).getViewTreeObserver().addOnGlobalLayoutListener(new c());
                return;
            }
            kotlin.jvm.internal.i.q("durationList");
            throw null;
        }
        kotlin.jvm.internal.i.q("looplist");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18624z;
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
        return inflater.inflate(R.layout.fragment_screen_s19, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18624z.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            this.f18621w = (TemplateActivity) activity;
            this.f18622x = J().A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.s19Title)).setText(UtilFunKt.paramsMapToString(this.f18622x.get("s19_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.s19Subtitle)).setText(UtilFunKt.paramsMapToString(this.f18622x.get("s19_description")));
            ((RobertoButton) _$_findCachedViewById(R.id.s19Button)).setText(UtilFunKt.paramsMapToString(this.f18622x.get("s19_button")));
            ((RobertoButton) _$_findCachedViewById(R.id.s19Button)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.i6

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ j6 f18584v;

                {
                    this.f18584v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    j6 this$0 = this.f18584v;
                    switch (i6) {
                        case 0:
                            int i10 = j6.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity2).t0();
                            return;
                        case 1:
                            int i11 = j6.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity3).onBackPressed();
                            return;
                        default:
                            int i12 = j6.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (this$0.J().getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.J().getIntent().getStringExtra("source"), "goals")) {
                                this$0.J().J0();
                                return;
                            }
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity4).t0();
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_arrow_back);
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.i6

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ j6 f18584v;

                {
                    this.f18584v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    j6 this$0 = this.f18584v;
                    switch (i6) {
                        case 0:
                            int i10 = j6.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity2).t0();
                            return;
                        case 1:
                            int i11 = j6.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity3).onBackPressed();
                            return;
                        default:
                            int i12 = j6.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (this$0.J().getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.J().getIntent().getStringExtra("source"), "goals")) {
                                this$0.J().J0();
                                return;
                            }
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity4).t0();
                            return;
                    }
                }
            });
            this.f18620v = UtilFunKt.paramsMapToList(this.f18622x.get("s19_timer_list"));
            this.f18623y = UtilFunKt.paramsMapToList(this.f18622x.get("s19_timer_loop_list"));
            K();
            ((RobertoButton) _$_findCachedViewById(R.id.s19Button)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.i6

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ j6 f18584v;

                {
                    this.f18584v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    j6 this$0 = this.f18584v;
                    switch (i6) {
                        case 0:
                            int i10 = j6.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity2).t0();
                            return;
                        case 1:
                            int i11 = j6.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity3).onBackPressed();
                            return;
                        default:
                            int i12 = j6.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (this$0.J().getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.J().getIntent().getStringExtra("source"), "goals")) {
                                this$0.J().J0();
                                return;
                            }
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity4).t0();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18619u, e10);
        }
    }
}
