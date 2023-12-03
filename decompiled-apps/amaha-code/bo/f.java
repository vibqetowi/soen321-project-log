package bo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import gv.r;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import nn.v0;
/* compiled from: NewOnboardingInfoScreenWelcomeFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbo/f;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class f extends Fragment {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f4578w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f4580v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f4579u = LogHelper.INSTANCE.makeLogTag("NewOnboardingInfoWelcome");

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f4580v;
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
        return inflater.inflate(R.layout.fragment_condition_selection_v2_activity_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f4580v.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r3 == null) goto L27;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String obj;
        kotlin.jvm.internal.i.g(view, "view");
        try {
            super.onViewCreated(view, bundle);
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null && (obj = user.getFirstName()) != null) {
                if (n.B0(obj)) {
                    obj = null;
                }
            }
            String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
            kotlin.jvm.internal.i.f(stringValue, "getInstance().getStringV…ionManager.KEY_FIRSTNAME)");
            obj = r.i1(stringValue).toString();
            String F0 = n.F0(obj, " ", " ");
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.csaIntroHeader);
            if (robertoTextView != null) {
                robertoTextView.setText(getString(R.string.csaVbIntroHeader, F0));
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.csaIntroBody1)).setText(getString(R.string.csaVbA3IntroBody1));
            ((RobertoTextView) _$_findCachedViewById(R.id.csaIntroBody2)).setText(getString(R.string.csaVbA3IntroBody2));
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.csaIntroCta);
            if (robertoButton != null) {
                robertoButton.setText(getString(R.string.telecommunicationsPackageCta));
            }
            RobertoButton robertoButton2 = (RobertoButton) _$_findCachedViewById(R.id.csaIntroCta);
            if (robertoButton2 != null) {
                robertoButton2.setOnClickListener(new v0(6, this));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4579u, e10);
        }
    }
}
