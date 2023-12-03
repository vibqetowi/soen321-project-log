package jn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p;
import androidx.lifecycle.o0;
import cn.e1;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.logs.model.LogModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fm.j0;
import java.util.LinkedHashMap;
import java.util.List;
import jl.a0;
import jl.b0;
import jl.y;
import jl.z;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import pl.w0;
import ss.l;
import ta.v;
/* compiled from: ScreenLogListForLibraryFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljn/c;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c extends rr.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f22501y = 0;

    /* renamed from: v  reason: collision with root package name */
    public a0 f22503v;

    /* renamed from: w  reason: collision with root package name */
    public fm.a f22504w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f22505x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f22502u = LogHelper.INSTANCE.makeLogTag("ScreenLogListForLibraryFragment");

    /* compiled from: ScreenLogListForLibraryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<List<? extends LogModel>, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends LogModel> list) {
            String str;
            List<? extends LogModel> it = list;
            i.f(it, "it");
            int i6 = c.f22501y;
            c cVar = c.this;
            cVar.getClass();
            try {
                ((LinearLayout) cVar._$_findCachedViewById(R.id.goalsLinearLayout)).removeAllViews();
                if (it.isEmpty()) {
                    ((ConstraintLayout) cVar._$_findCachedViewById(R.id.logListNullState)).setVisibility(0);
                    ((RobertoTextView) cVar._$_findCachedViewById(R.id.logListSubTitle)).setVisibility(8);
                } else {
                    ((ConstraintLayout) cVar._$_findCachedViewById(R.id.logListNullState)).setVisibility(8);
                    ((RobertoTextView) cVar._$_findCachedViewById(R.id.logListSubTitle)).setVisibility(0);
                    for (LogModel logModel : it) {
                        View inflate = cVar.getLayoutInflater().inflate(R.layout.row_log_list_item, (ViewGroup) ((LinearLayout) cVar._$_findCachedViewById(R.id.goalsLinearLayout)), false);
                        RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.logListRowTitle);
                        if (logModel != null) {
                            str = logModel.getTitle();
                        } else {
                            str = null;
                        }
                        robertoTextView.setText(str);
                        inflate.setOnClickListener(new w0(logModel, 24, cVar));
                        ((LinearLayout) cVar._$_findCachedViewById(R.id.goalsLinearLayout)).addView(inflate);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(cVar.f22502u, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenLogListForLibraryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<List<? extends FirestoreGoal>, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends FirestoreGoal> list) {
            String j02;
            List<? extends FirestoreGoal> it = list;
            a0 a0Var = c.this.f22503v;
            if (a0Var != null) {
                i.f(it, "it");
                try {
                    fd.f fVar = FirebaseAuth.getInstance().f;
                    if (fVar != null && (j02 = fVar.j0()) != null) {
                        v.H(kc.f.H(a0Var), null, 0, new y(it, a0Var, j02, null), 3);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(a0Var.f22080y, "exception", e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f22505x;
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
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p requireActivity = requireActivity();
        i.f(requireActivity, "requireActivity()");
        this.f22503v = (a0) new o0(requireActivity, new b0(new e1(), 0)).a(a0.class);
        if (sp.b.K()) {
            p requireActivity2 = requireActivity();
            i.f(requireActivity2, "requireActivity()");
            fm.a aVar = (fm.a) new o0(requireActivity2, new kk.c(MyApplication.V.a(), new j0())).a(fm.a.class);
            i.g(aVar, "<set-?>");
            this.f22504w = aVar;
            aVar.k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_screen_log_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f22505x.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String j02;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            a0 a0Var = this.f22503v;
            if (a0Var != null) {
                a0Var.A.e(getViewLifecycleOwner(), new gn.l(8, new a()));
                if (!sp.b.K()) {
                    try {
                        fd.f fVar = FirebaseAuth.getInstance().f;
                        if (fVar != null && (j02 = fVar.j0()) != null) {
                            v.H(kc.f.H(a0Var), null, 0, new z(a0Var, j02, null), 3);
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(a0Var.f22080y, "exception", e10);
                    }
                }
            }
            if (sp.b.K()) {
                fm.a aVar = this.f22504w;
                if (aVar != null) {
                    aVar.R.e(getViewLifecycleOwner(), new gn.l(9, new b()));
                } else {
                    i.q("fireStoreGoalsViewModel");
                    throw null;
                }
            }
            ((AppCompatImageView) _$_findCachedViewById(R.id.btnBackLogList)).setOnClickListener(new ol.k(27, this));
            ((RobertoTextView) _$_findCachedViewById(R.id.logListTitle)).setText(getString(R.string.activityLibraryLogTitle));
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.f22502u, e11);
        }
    }
}
