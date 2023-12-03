package fq;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T8Activity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticResult1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/m;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class m extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f15758w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f15760v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15759u = LogHelper.INSTANCE.makeLogTag(m.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15760v;
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
        return inflater.inflate(R.layout.fragment_static_result1, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15760v.clear();
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
        T8Activity t8Activity = (T8Activity) activity;
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.f23469u = new ArrayList();
        ArrayList arrayList = new ArrayList();
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        try {
            uVar.f23466u = true;
            Object obj = t8Activity.B.get("list");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            xVar.f23469u = (ArrayList) obj;
            ((RobertoTextView) _$_findCachedViewById(R.id.textView9)).setText("Take a look at what you noted");
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText("EDIT");
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText("NEXT");
            arrayList.add("Good thing #1");
            arrayList.add("Good thing #2");
            arrayList.add("Good thing #3");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        Iterator it = ((ArrayList) xVar.f23469u).iterator();
        int i6 = 0;
        while (it.hasNext()) {
            int i10 = i6 + 1;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            View inflate = activity2.getLayoutInflater().inflate(R.layout.row_result1, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearlayout)), false);
            ((RobertoTextView) inflate.findViewById(R.id.textView1)).setText((CharSequence) arrayList.get(i6));
            ((RobertoTextView) inflate.findViewById(R.id.textView2)).setText((String) it.next());
            ((LinearLayout) _$_findCachedViewById(R.id.linearlayout)).addView(inflate);
            i6 = i10;
        }
        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.l

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ m f15753v;

            {
                this.f15753v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = r2;
                m this$0 = this.f15753v;
                switch (i11) {
                    case 0:
                        int i12 = m.f15758w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity3 = this$0.getActivity();
                        if (activity3 != null) {
                            activity3.onBackPressed();
                            return;
                        }
                        return;
                    case 1:
                        int i13 = m.f15758w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Context context = this$0.getContext();
                        kotlin.jvm.internal.i.d(context);
                        androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                        a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                        a1Var.f1346d = new am.w(29, this$0);
                        a1Var.b();
                        return;
                    default:
                        int i14 = m.f15758w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity4 = this$0.getActivity();
                        if (activity4 != null) {
                            activity4.onBackPressed();
                            return;
                        }
                        return;
                }
            }
        });
        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new tk.q((rr.b) this, (Object) xVar, uVar, (Object) t8Activity, 12));
        ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
        ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.l

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ m f15753v;

            {
                this.f15753v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = r2;
                m this$0 = this.f15753v;
                switch (i11) {
                    case 0:
                        int i12 = m.f15758w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity3 = this$0.getActivity();
                        if (activity3 != null) {
                            activity3.onBackPressed();
                            return;
                        }
                        return;
                    case 1:
                        int i13 = m.f15758w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Context context = this$0.getContext();
                        kotlin.jvm.internal.i.d(context);
                        androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                        a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                        a1Var.f1346d = new am.w(29, this$0);
                        a1Var.b();
                        return;
                    default:
                        int i14 = m.f15758w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity4 = this$0.getActivity();
                        if (activity4 != null) {
                            activity4.onBackPressed();
                            return;
                        }
                        return;
                }
            }
        });
        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.l

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ m f15753v;

            {
                this.f15753v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = r2;
                m this$0 = this.f15753v;
                switch (i11) {
                    case 0:
                        int i12 = m.f15758w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity3 = this$0.getActivity();
                        if (activity3 != null) {
                            activity3.onBackPressed();
                            return;
                        }
                        return;
                    case 1:
                        int i13 = m.f15758w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Context context = this$0.getContext();
                        kotlin.jvm.internal.i.d(context);
                        androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                        a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                        a1Var.f1346d = new am.w(29, this$0);
                        a1Var.b();
                        return;
                    default:
                        int i14 = m.f15758w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity4 = this$0.getActivity();
                        if (activity4 != null) {
                            activity4.onBackPressed();
                            return;
                        }
                        return;
                }
            }
        });
    }
}
