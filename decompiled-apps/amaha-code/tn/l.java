package tn;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerActivity;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerFragmentListener;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerListener;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.r;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import s1.s;
/* compiled from: TrackerLogInputFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltn/l;", "Lrr/b;", "Lcom/theinnerhour/b2b/components/multiTracker/model/MultiTrackerFragmentListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class l extends rr.b implements MultiTrackerFragmentListener {

    /* renamed from: v  reason: collision with root package name */
    public MultiTrackerListener f33378v;

    /* renamed from: w  reason: collision with root package name */
    public s f33379w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f33380x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f33377u = LogHelper.INSTANCE.makeLogTag("TrackerLogInputFragment");

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        super.onAttach(context);
        if (context instanceof MultiTrackerListener) {
            this.f33378v = (MultiTrackerListener) context;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        if ((!gv.n.B0(r0)) == true) goto L13;
     */
    @Override // com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerFragmentListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onButtonClick() {
        boolean z10;
        MultiTrackerActivity multiTrackerActivity;
        s sVar;
        RobertoEditText robertoEditText;
        Editable text;
        String obj;
        String obj2;
        MultiTrackerListener multiTrackerListener;
        RobertoEditText robertoEditText2;
        Editable text2;
        String obj3;
        s sVar2 = this.f33379w;
        if (sVar2 != null && (robertoEditText2 = (RobertoEditText) sVar2.f31226x) != null && (text2 = robertoEditText2.getText()) != null && (obj3 = text2.toString()) != null && (r0 = r.i1(obj3).toString()) != null) {
            z10 = true;
        }
        z10 = false;
        if (z10 && (sVar = this.f33379w) != null && (robertoEditText = (RobertoEditText) sVar.f31226x) != null && (text = robertoEditText.getText()) != null && (obj = text.toString()) != null && (obj2 = r.i1(obj).toString()) != null && (multiTrackerListener = this.f33378v) != null) {
            multiTrackerListener.setLogNotes(obj2);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("mood", requireActivity().getIntent().getIntExtra("mood", 0));
        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        MultiTrackerListener multiTrackerListener2 = this.f33378v;
        kotlin.jvm.internal.i.d(multiTrackerListener2);
        bundle.putBoolean("isOnboarding", multiTrackerListener2.getTutorialFlag());
        p requireActivity = requireActivity();
        String str = null;
        if (requireActivity instanceof MultiTrackerActivity) {
            multiTrackerActivity = (MultiTrackerActivity) requireActivity;
        } else {
            multiTrackerActivity = null;
        }
        if (multiTrackerActivity != null) {
            str = multiTrackerActivity.H;
        }
        bundle.putString("source", str);
        gk.a.b(bundle, "new_tracker_log_main_cta");
        p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
        ((rr.a) activity).n0();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_tracker_log_input, (ViewGroup) null, false);
        int i6 = R.id.trackerEmotionCloudTitle;
        RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.trackerEmotionCloudTitle, inflate);
        if (robertoTextView != null) {
            i6 = R.id.trackerLogInputEditText;
            RobertoEditText robertoEditText = (RobertoEditText) hc.d.w(R.id.trackerLogInputEditText, inflate);
            if (robertoEditText != null) {
                s sVar = new s(26, (ConstraintLayout) inflate, robertoTextView, robertoEditText);
                this.f33379w = sVar;
                switch (26) {
                    case 25:
                        return (ConstraintLayout) sVar.f31224v;
                    default:
                        return (ConstraintLayout) sVar.f31224v;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f33379w = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f33380x.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            MultiTrackerListener multiTrackerListener = this.f33378v;
            if (multiTrackerListener != null) {
                String string = getString(R.string.multiTrackerNotesDoneCTA);
                kotlin.jvm.internal.i.f(string, "getString(R.string.multiTrackerNotesDoneCTA)");
                multiTrackerListener.setCtaText(string);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33377u, e10);
        }
    }
}
