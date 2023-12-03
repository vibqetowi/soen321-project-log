package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SimpleItemTouchVerticalDragHelperCallback;
import ek.k1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS24Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/u6;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class u6 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f19243z = 0;

    /* renamed from: w  reason: collision with root package name */
    public androidx.recyclerview.widget.k f19246w;

    /* renamed from: x  reason: collision with root package name */
    public ek.k1 f19247x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f19248y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19244u = LogHelper.INSTANCE.makeLogTag(u6.class);

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<String> f19245v = new ArrayList<>();

    /* compiled from: ScreenS24Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements kr.c {
        public a() {
        }

        @Override // kr.c
        public final void a(k1.a aVar) {
            androidx.recyclerview.widget.k kVar = u6.this.f19246w;
            if (kVar != null) {
                kVar.t(aVar);
            } else {
                kotlin.jvm.internal.i.q("touchHelper");
                throw null;
            }
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19248y;
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
        return inflater.inflate(R.layout.fragment_screen_s24, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19248y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<String> arrayList;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Object obj = ((TemplateActivity) activity).A0().get("headings");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<java.util.HashMap<kotlin.String, kotlin.Any>>");
            Iterator it = ((ArrayList) obj).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = this.f19245v;
                if (!hasNext) {
                    break;
                }
                Object obj2 = ((HashMap) it.next()).get("list_key");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) obj2);
            }
            a aVar = new a();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            this.f19247x = new ek.k1(aVar, activity2, arrayList);
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.recyclerView);
            ek.k1 k1Var = this.f19247x;
            if (k1Var != null) {
                recyclerView.setAdapter(k1Var);
                ((RecyclerView) _$_findCachedViewById(R.id.recyclerView)).setLayoutManager(new LinearLayoutManager(getActivity()));
                ek.k1 k1Var2 = this.f19247x;
                if (k1Var2 != null) {
                    androidx.recyclerview.widget.k kVar = new androidx.recyclerview.widget.k(new SimpleItemTouchVerticalDragHelperCallback(k1Var2));
                    this.f19246w = kVar;
                    kVar.i((RecyclerView) _$_findCachedViewById(R.id.recyclerView));
                    ((Button) _$_findCachedViewById(R.id.button7)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.t6

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ u6 f19205v;

                        {
                            this.f19205v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i6 = r2;
                            u6 this$0 = this.f19205v;
                            switch (i6) {
                                case 0:
                                    int i10 = u6.f19243z;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity3).F.put("list", this$0.f19245v);
                                    androidx.fragment.app.p activity4 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                    ((rr.a) activity4).t0();
                                    return;
                                default:
                                    int i11 = u6.f19243z;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.fragment.app.p activity5 = this$0.getActivity();
                                    kotlin.jvm.internal.i.d(activity5);
                                    b.a aVar2 = new b.a(activity5);
                                    aVar2.setTitle("Enter your activity here");
                                    EditText editText = new EditText(this$0.getActivity());
                                    editText.setInputType(1);
                                    aVar2.setView(editText);
                                    aVar2.b("OK", new cm.h(editText, 2, this$0));
                                    aVar2.a("Cancel", new yi.d(17));
                                    aVar2.c();
                                    return;
                            }
                        }
                    });
                    ((Button) _$_findCachedViewById(R.id.button6)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.t6

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ u6 f19205v;

                        {
                            this.f19205v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i6 = r2;
                            u6 this$0 = this.f19205v;
                            switch (i6) {
                                case 0:
                                    int i10 = u6.f19243z;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity3).F.put("list", this$0.f19245v);
                                    androidx.fragment.app.p activity4 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                    ((rr.a) activity4).t0();
                                    return;
                                default:
                                    int i11 = u6.f19243z;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.fragment.app.p activity5 = this$0.getActivity();
                                    kotlin.jvm.internal.i.d(activity5);
                                    b.a aVar2 = new b.a(activity5);
                                    aVar2.setTitle("Enter your activity here");
                                    EditText editText = new EditText(this$0.getActivity());
                                    editText.setInputType(1);
                                    aVar2.setView(editText);
                                    aVar2.b("OK", new cm.h(editText, 2, this$0));
                                    aVar2.a("Cancel", new yi.d(17));
                                    aVar2.c();
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
            LogHelper.INSTANCE.e(this.f19244u, "exception in on view created", e10);
        }
    }
}
