package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult28Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ScreenLog28Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/q;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class q extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f18981x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f18984w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18982u = LogHelper.INSTANCE.makeLogTag(q.class);

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18983v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new b(this), new c(this), new d(this));

    /* compiled from: ScreenLog28Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<List<? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ TemplateActivity f18986v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TemplateActivity templateActivity) {
            super(1);
            this.f18986v = templateActivity;
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends HashMap<String, Object>> list) {
            List<? extends HashMap<String, Object>> list2 = list;
            if (list2 != null) {
                ArrayList<ScreenResult28Model> result28MapListToObject = UtilFunKt.result28MapListToObject(list2);
                boolean z10 = !result28MapListToObject.isEmpty();
                q qVar = q.this;
                if (z10) {
                    ((RecyclerView) qVar._$_findCachedViewById(R.id.log28RecyclerView)).setLayoutManager(new LinearLayoutManager(qVar.getContext(), 1, false));
                    ((RecyclerView) qVar._$_findCachedViewById(R.id.log28RecyclerView)).setAdapter(new ek.i0(result28MapListToObject, this.f18986v));
                    ((TextView) qVar._$_findCachedViewById(R.id.nullText)).setVisibility(8);
                    qVar._$_findCachedViewById(R.id.separator).setVisibility(0);
                } else {
                    ((TextView) qVar._$_findCachedViewById(R.id.nullText)).setVisibility(0);
                    qVar._$_findCachedViewById(R.id.separator).setVisibility(8);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18987u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f18987u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18987u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18988u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18988u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18988u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18989u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18989u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18989u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18984w;
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
        return inflater.inflate(R.layout.fragment_screen_log28, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f18983v.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f18984w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String label;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            ((RobertoTextView) _$_findCachedViewById(R.id.question)).setText(templateActivity.z0());
            if (templateActivity.W) {
                fm.a aVar = (fm.a) this.f18983v.getValue();
                TemplateModel templateModel = templateActivity.f10547y;
                if (templateModel != null && (label = templateModel.getLabel()) != null) {
                    aVar.f15180n0.e(getViewLifecycleOwner(), new pp.b(17, new a(templateActivity)));
                    aVar.n(label);
                }
            } else {
                Goal y02 = templateActivity.y0();
                if (y02 != null && y02.getData().containsKey("result_28")) {
                    ArrayList<ScreenResult28Model> result28MapListToObject = UtilFunKt.result28MapListToObject(y02.getData().get("result_28"));
                    ((RecyclerView) _$_findCachedViewById(R.id.log28RecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                    ((RecyclerView) _$_findCachedViewById(R.id.log28RecyclerView)).setAdapter(new ek.i0(result28MapListToObject, templateActivity));
                    ((TextView) _$_findCachedViewById(R.id.nullText)).setVisibility(8);
                    _$_findCachedViewById(R.id.separator).setVisibility(0);
                } else {
                    ((TextView) _$_findCachedViewById(R.id.nullText)).setVisibility(0);
                    _$_findCachedViewById(R.id.separator).setVisibility(8);
                }
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new hr.a(templateActivity, 21));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18982u, "Exception", e10);
        }
    }
}
