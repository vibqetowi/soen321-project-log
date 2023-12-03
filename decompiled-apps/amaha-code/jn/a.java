package jn;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kn.a;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: DomainBottomSheetFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljn/a;", "Lcom/google/android/material/bottomsheet/f;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends com.google.android.material.bottomsheet.f {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f22475x = 0;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<hs.f<String, String>> f22476u;

    /* renamed from: v  reason: collision with root package name */
    public final InterfaceC0336a f22477v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f22478w;

    /* compiled from: DomainBottomSheetFragment.kt */
    /* renamed from: jn.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0336a {
        void d(String str);
    }

    /* compiled from: DomainBottomSheetFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<String, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(String str) {
            String slug = str;
            i.g(slug, "slug");
            a aVar = a.this;
            ((RecyclerView) aVar._$_findCachedViewById(R.id.domainRecyclerView)).h0(0);
            InterfaceC0336a interfaceC0336a = aVar.f22477v;
            if (interfaceC0336a != null) {
                interfaceC0336a.d(slug);
            }
            return hs.k.f19476a;
        }
    }

    public a() {
        this.f22478w = new LinkedHashMap();
        this.f22476u = new ArrayList<>();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f22478w;
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

    @Override // com.google.android.material.bottomsheet.f, g.s, androidx.fragment.app.n
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        i.e(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.e eVar = (com.google.android.material.bottomsheet.e) onCreateDialog;
        eVar.setOnShowListener(new il.l(1));
        return eVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_domain_bottom_sheet, viewGroup, false);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f22478w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i6;
        Object obj;
        boolean z10;
        HashMap<String, Object> appConfig;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        Serializable serializable = requireArguments().getSerializable("logType");
        i.e(serializable, "null cannot be cast to non-null type com.theinnerhour.b2b.components.logs.utils.LogUtils.LogType");
        a.EnumC0358a enumC0358a = (a.EnumC0358a) serializable;
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.domainTextView);
        a.EnumC0358a enumC0358a2 = a.EnumC0358a.MAIN_PLAN_LOGS;
        if (enumC0358a == enumC0358a2) {
            i6 = R.string.logsBottomSheetPlanTitle;
        } else {
            i6 = R.string.logsBottomSheetAdditionalTitle;
        }
        robertoTextView.setText(getString(i6));
        User user = FirebasePersistence.getInstance().getUser();
        Context context = null;
        if (user != null && (appConfig = user.getAppConfig()) != null) {
            obj = appConfig.get(Constants.DASHBOARD_LIBRARY_EXPERIMENT);
        } else {
            obj = null;
        }
        if (getContext() != null) {
            context = getContext();
        }
        Context context2 = context;
        ArrayList<hs.f<String, String>> arrayList = this.f22476u;
        com.bumptech.glide.f g5 = Glide.g(requireContext());
        i.f(g5, "with(requireContext())");
        if (enumC0358a != enumC0358a2 && obj != null && !i.b(obj, "default")) {
            z10 = true;
        } else {
            z10 = false;
        }
        ((RecyclerView) _$_findCachedViewById(R.id.domainRecyclerView)).setAdapter(new in.a(context2, arrayList, enumC0358a, g5, z10, new b()));
        ((RecyclerView) _$_findCachedViewById(R.id.domainRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ArrayList<hs.f<String, String>> courseList, InterfaceC0336a optionClickListener) {
        this();
        i.g(courseList, "courseList");
        i.g(optionClickListener, "optionClickListener");
        this.f22476u = courseList;
        this.f22477v = optionClickListener;
    }
}
