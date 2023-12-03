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
import com.theinnerhour.b2b.model.CompassionLetterModel;
import com.theinnerhour.b2b.model.CompassionLetterStorageModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GratitudeLetterModel;
import com.theinnerhour.b2b.model.ScreenResult11Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ScreenLog11Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/k;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f18644x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f18647w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18645u = LogHelper.INSTANCE.makeLogTag(k.class);

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18646v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new b(this), new c(this), new d(this));

    /* compiled from: ScreenLog11Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<List<? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ArrayList<GratitudeLetterModel> f18649v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ TemplateActivity f18650w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList<GratitudeLetterModel> arrayList, TemplateActivity templateActivity) {
            super(1);
            this.f18649v = arrayList;
            this.f18650w = templateActivity;
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends HashMap<String, Object>> list) {
            ArrayList<GratitudeLetterModel> arrayList;
            List<? extends HashMap<String, Object>> list2 = list;
            k kVar = k.this;
            if (list2 != null) {
                ScreenResult11Model gratitudeLetterMapToObject = UtilFunKt.gratitudeLetterMapToObject(list2.get(0));
                if (gratitudeLetterMapToObject.getGratitude_in_app_letter().isEmpty() && gratitudeLetterMapToObject.getGratitude_files().isEmpty()) {
                    ((TextView) kVar._$_findCachedViewById(R.id.nullText)).setVisibility(0);
                    kVar._$_findCachedViewById(R.id.separator).setVisibility(8);
                } else {
                    Iterator<CompassionLetterModel> it = gratitudeLetterMapToObject.getGratitude_in_app_letter().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        arrayList = this.f18649v;
                        if (!hasNext) {
                            break;
                        }
                        CompassionLetterModel next = it.next();
                        GratitudeLetterModel gratitudeLetterModel = new GratitudeLetterModel();
                        gratitudeLetterModel.setDate(next.getDate());
                        gratitudeLetterModel.setLetter(next.getLetter());
                        gratitudeLetterModel.setImage(false);
                        arrayList.add(gratitudeLetterModel);
                    }
                    Iterator<CompassionLetterStorageModel> it2 = gratitudeLetterMapToObject.getGratitude_files().iterator();
                    while (it2.hasNext()) {
                        CompassionLetterStorageModel next2 = it2.next();
                        GratitudeLetterModel gratitudeLetterModel2 = new GratitudeLetterModel();
                        gratitudeLetterModel2.setDate(next2.getDate());
                        gratitudeLetterModel2.setFileName(next2.getFileName());
                        gratitudeLetterModel2.setDownloadUrl(next2.getDownloadUrl());
                        gratitudeLetterModel2.setImage(true);
                        arrayList.add(gratitudeLetterModel2);
                    }
                    ((RecyclerView) kVar._$_findCachedViewById(R.id.log11RecyclerView)).setLayoutManager(new LinearLayoutManager(kVar.getContext(), 1, false));
                    ((RecyclerView) kVar._$_findCachedViewById(R.id.log11RecyclerView)).setAdapter(new ek.t(arrayList, this.f18650w));
                    ((TextView) kVar._$_findCachedViewById(R.id.nullText)).setVisibility(8);
                    kVar._$_findCachedViewById(R.id.separator).setVisibility(0);
                }
            } else {
                ((TextView) kVar._$_findCachedViewById(R.id.nullText)).setVisibility(0);
                kVar._$_findCachedViewById(R.id.separator).setVisibility(8);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18651u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f18651u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18651u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18652u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18652u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18652u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18653u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18653u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18653u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18647w;
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
        return inflater.inflate(R.layout.fragment_screen_log11, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f18646v.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f18647w.clear();
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
            ArrayList arrayList = new ArrayList();
            if (templateActivity.W) {
                fm.a aVar = (fm.a) this.f18646v.getValue();
                TemplateModel templateModel = templateActivity.f10547y;
                if (templateModel != null && (label = templateModel.getLabel()) != null) {
                    aVar.f15180n0.e(getViewLifecycleOwner(), new pp.b(11, new a(arrayList, templateActivity)));
                    aVar.n(label);
                }
            } else {
                Goal y02 = templateActivity.y0();
                if (y02 != null && y02.getData().containsKey("result_11")) {
                    ScreenResult11Model gratitudeLetterMapToObject = UtilFunKt.gratitudeLetterMapToObject(y02.getData().get("result_11"));
                    Iterator<CompassionLetterModel> it = gratitudeLetterMapToObject.getGratitude_in_app_letter().iterator();
                    while (it.hasNext()) {
                        CompassionLetterModel next = it.next();
                        GratitudeLetterModel gratitudeLetterModel = new GratitudeLetterModel();
                        gratitudeLetterModel.setDate(next.getDate());
                        gratitudeLetterModel.setLetter(next.getLetter());
                        gratitudeLetterModel.setImage(false);
                        arrayList.add(gratitudeLetterModel);
                    }
                    Iterator<CompassionLetterStorageModel> it2 = gratitudeLetterMapToObject.getGratitude_files().iterator();
                    while (it2.hasNext()) {
                        CompassionLetterStorageModel next2 = it2.next();
                        GratitudeLetterModel gratitudeLetterModel2 = new GratitudeLetterModel();
                        gratitudeLetterModel2.setDate(next2.getDate());
                        gratitudeLetterModel2.setFileName(next2.getFileName());
                        gratitudeLetterModel2.setDownloadUrl(next2.getDownloadUrl());
                        gratitudeLetterModel2.setImage(true);
                        arrayList.add(gratitudeLetterModel2);
                    }
                    ((RecyclerView) _$_findCachedViewById(R.id.log11RecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                    ((RecyclerView) _$_findCachedViewById(R.id.log11RecyclerView)).setAdapter(new ek.t(arrayList, templateActivity));
                    ((TextView) _$_findCachedViewById(R.id.nullText)).setVisibility(8);
                    _$_findCachedViewById(R.id.separator).setVisibility(0);
                } else {
                    ((TextView) _$_findCachedViewById(R.id.nullText)).setVisibility(0);
                    _$_findCachedViewById(R.id.separator).setVisibility(8);
                }
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new hr.a(templateActivity, 15));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18645u, "Exception", e10);
        }
    }
}
