package pl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.data.NewDynamicActivityScreenDataClass;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: N7AScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpl/t0;", "Landroidx/fragment/app/n;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class t0 extends androidx.fragment.app.n {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f28634x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f28637w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f28635u = LogHelper.INSTANCE.makeLogTag("N7AScreenFragment");

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f28636v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(ql.t.class), new a(this), new b(this), new c(this));

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f28638u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f28638u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f28638u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f28639u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f28639u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f28639u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f28640u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f28640u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f28640u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [is.w] */
    public final void F() {
        HashMap<String, Object> hashMap;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        String str;
        Object obj7;
        ?? r02;
        try {
            NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass = ((ql.t) this.f28636v.getValue()).N;
            ArrayList<HashMap> arrayList = null;
            if (newDynamicActivityScreenDataClass != null) {
                hashMap = newDynamicActivityScreenDataClass.getData();
            } else {
                hashMap = null;
            }
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN7AScreenNavBarHeader);
            if (hashMap != null) {
                obj = hashMap.get("heading");
            } else {
                obj = null;
            }
            robertoTextView.setText((String) obj);
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN7AScreenTitle);
            if (hashMap != null) {
                obj2 = hashMap.get("title");
            } else {
                obj2 = null;
            }
            robertoTextView2.setText((String) obj2);
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvN7AScreenDescription);
            if (hashMap != null) {
                obj3 = hashMap.get("description");
            } else {
                obj3 = null;
            }
            robertoTextView3.setText((String) obj3);
            RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvN7AScreenStart);
            if (hashMap != null) {
                obj4 = hashMap.get("start");
            } else {
                obj4 = null;
            }
            robertoTextView4.setText((String) obj4);
            RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvN7AScreenEnd);
            if (hashMap != null) {
                obj5 = hashMap.get("end");
            } else {
                obj5 = null;
            }
            robertoTextView5.setText((String) obj5);
            com.bumptech.glide.e<Bitmap> a10 = Glide.i(requireActivity()).a();
            if (hashMap != null) {
                obj6 = hashMap.get("image");
            } else {
                obj6 = null;
            }
            if (obj6 instanceof String) {
                str = (String) obj6;
            } else {
                str = null;
            }
            a10.Z = str;
            a10.f5953b0 = true;
            a10.B((AppCompatImageView) _$_findCachedViewById(R.id.ivN7AScreen));
            if (hashMap != null) {
                obj7 = hashMap.get("steps");
            } else {
                obj7 = null;
            }
            if (obj7 instanceof ArrayList) {
                arrayList = (ArrayList) obj7;
            }
            if (arrayList != null) {
                r02 = new ArrayList();
                for (HashMap hashMap2 : arrayList) {
                    String str2 = (String) hashMap2.get("step_title");
                    if (str2 != null) {
                        r02.add(str2);
                    }
                }
            } else {
                r02 = is.w.f20676u;
            }
            ((RecyclerView) _$_findCachedViewById(R.id.rvN7AScreenListView)).setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
            ((RecyclerView) _$_findCachedViewById(R.id.rvN7AScreenListView)).setAdapter(new ol.q(r02));
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivN7AScreenNavBarInfoButton);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new ol.k(7, this));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f28635u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f28637w;
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

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 16974125);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_n7_a_screen, viewGroup, false);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f28637w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            F();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f28635u, e10);
        }
    }
}
