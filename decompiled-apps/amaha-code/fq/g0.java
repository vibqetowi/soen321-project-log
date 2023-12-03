package fq;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T8Activity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticS25Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/g0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g0 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f15712w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f15714v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15713u = LogHelper.INSTANCE.makeLogTag(g0.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15714v;
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
        return inflater.inflate(R.layout.fragment_static_s25, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15714v.clear();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
            T8Activity t8Activity = (T8Activity) activity;
            ((RobertoTextView) _$_findCachedViewById(R.id.textView25)).setText("Note 3 good things that happened today");
            ((RobertoEditText) _$_findCachedViewById(R.id.editText1)).setHint("Take a moment to reflect");
            ((RobertoEditText) _$_findCachedViewById(R.id.editText2)).setHint("Look out for the positives");
            ((RobertoEditText) _$_findCachedViewById(R.id.editText3)).setHint("Even tiny good things matter!");
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText("SKIP");
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText("NEXT");
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            ?? arrayList = new ArrayList();
            xVar.f23469u = arrayList;
            arrayList.add("Spending quality time with a loved one");
            ((ArrayList) xVar.f23469u).add("Eating a nice meal in the day");
            ((ArrayList) xVar.f23469u).add("Connecting with a friend after a long time");
            ((ArrayList) xVar.f23469u).add("Having a relatively easy commute to and from work");
            ((ArrayList) xVar.f23469u).add("Getting complimented by a colleague or friend");
            ((ArrayList) xVar.f23469u).add("Getting the chance to play with your pet");
            ((ArrayList) xVar.f23469u).add("Taking the time to exercise");
            ((ArrayList) xVar.f23469u).add("Experiencing pleasant weather that made the day better");
            ArrayList arrayList2 = new ArrayList();
            if ((!arrayList2.isEmpty()) && arrayList2.size() >= 3) {
                ((RobertoEditText) _$_findCachedViewById(R.id.editText1)).setText((CharSequence) arrayList2.get(0));
                ((RobertoEditText) _$_findCachedViewById(R.id.editText2)).setText((CharSequence) arrayList2.get(1));
                ((RobertoEditText) _$_findCachedViewById(R.id.editText3)).setText((CharSequence) arrayList2.get(2));
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.f0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g0 f15705v;

                {
                    this.f15705v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    g0 this$0 = this.f15705v;
                    switch (i6) {
                        case 0:
                            int i10 = g0.f15712w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity2).t0();
                            return;
                        default:
                            int i11 = g0.f15712w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new s(this$0, 1);
                            a1Var.b();
                            return;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new nn.g(8, this, xVar, t8Activity));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.f0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g0 f15705v;

                {
                    this.f15705v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    g0 this$0 = this.f15705v;
                    switch (i6) {
                        case 0:
                            int i10 = g0.f15712w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity2).t0();
                            return;
                        default:
                            int i11 = g0.f15712w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new s(this$0, 1);
                            a1Var.b();
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new r(t8Activity, 1));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setOnClickListener(new r(t8Activity, 2));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15713u, "exception in on view created", e10);
        }
    }
}
