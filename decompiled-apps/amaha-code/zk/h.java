package zk;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import gv.r;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import w5.i0;
/* compiled from: ConditionSelectionV2ActivityIntroFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzk/h;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class h extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f39441w = 0;

    /* renamed from: u  reason: collision with root package name */
    public al.b f39442u;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f39443v = new LinkedHashMap();

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f39443v;
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
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        if (context instanceof al.b) {
            this.f39442u = (al.b) context;
        }
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_condition_selection_v2_activity_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f39443v.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r4 == null) goto L30;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String obj;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        User user = FirebasePersistence.getInstance().getUser();
        rr.a aVar = null;
        if (user != null && (obj = user.getFirstName()) != null) {
            if (n.B0(obj)) {
                obj = null;
            }
        }
        String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
        kotlin.jvm.internal.i.f(stringValue, "getInstance().getStringV…ionManager.KEY_FIRSTNAME)");
        obj = r.i1(stringValue).toString();
        n.F0(obj, " ", " ");
        if (ApplicationPersistence.getInstance().getBooleanValue("a3_intro_skip", false)) {
            p requireActivity = requireActivity();
            if (requireActivity instanceof rr.a) {
                aVar = (rr.a) requireActivity;
            }
            if (aVar != null) {
                aVar.t0();
                return;
            }
            return;
        }
        ApplicationPersistence.getInstance().setBooleanValue("a3_intro_skip", true);
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.csaIntroHeader);
        if (robertoTextView != null) {
            robertoTextView.setText(getString(R.string.csaVbIntroHeader, obj));
        }
        ((RobertoTextView) _$_findCachedViewById(R.id.csaIntroBody1)).setText(getString(R.string.csaVbA3IntroBody1));
        ((RobertoTextView) _$_findCachedViewById(R.id.csaIntroBody2)).setText(getString(R.string.csaVbA3IntroBody2));
        RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.csaIntroCta);
        if (robertoButton != null) {
            robertoButton.setText(getString(R.string.telecommunicationsPackageCta));
        }
        RobertoButton robertoButton2 = (RobertoButton) _$_findCachedViewById(R.id.csaIntroCta);
        if (robertoButton2 != null) {
            robertoButton2.setOnClickListener(new i0(21, this));
        }
    }
}
