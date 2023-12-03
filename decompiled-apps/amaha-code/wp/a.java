package wp;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.f;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: DomainBottomSheetFragment.kt */
/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f37019y = 0;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<hs.f<String, String>> f37020u;

    /* renamed from: v  reason: collision with root package name */
    public final InterfaceC0620a f37021v;

    /* renamed from: w  reason: collision with root package name */
    public final String f37022w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f37023x;

    /* compiled from: DomainBottomSheetFragment.kt */
    /* renamed from: wp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0620a {
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
            aVar.f37021v.d(slug);
            return hs.k.f19476a;
        }
    }

    public a(ArrayList<hs.f<String, String>> courseList, InterfaceC0620a optionClickListener) {
        i.g(courseList, "courseList");
        i.g(optionClickListener, "optionClickListener");
        this.f37023x = new LinkedHashMap();
        this.f37020u = courseList;
        this.f37021v = optionClickListener;
        this.f37022w = LogHelper.INSTANCE.makeLogTag(a.class);
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f37023x;
        Integer valueOf = Integer.valueOf((int) R.id.domainRecyclerView);
        View view = (View) linkedHashMap.get(valueOf);
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(R.id.domainRecyclerView)) != null) {
                linkedHashMap.put(valueOf, findViewById);
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
        eVar.setOnShowListener(new il.l(2));
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
        this.f37023x.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((RecyclerView) _$_findCachedViewById(R.id.domainRecyclerView)).setAdapter(new up.a(this.f37020u, new b()));
            ((RecyclerView) _$_findCachedViewById(R.id.domainRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f37022w, e10);
        }
    }
}
