package kq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.CopingActivity;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: StressRelaxingFragment.java */
/* loaded from: classes2.dex */
public class k extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f23807w = 0;

    /* renamed from: u  reason: collision with root package name */
    public ImageView f23808u;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f23809v;

    /* compiled from: StressRelaxingFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            k.this.getActivity().finish();
        }
    }

    /* compiled from: StressRelaxingFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            view.setVisibility(8);
            int i6 = k.f23807w;
            k.this.J(-1);
        }
    }

    /* compiled from: StressRelaxingFragment.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ GoalType f23812u;

        public c(GoalType goalType) {
            this.f23812u = goalType;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            GoalType goalType = this.f23812u;
            String goalId = goalType.getGoalId();
            String goalName = goalType.getGoalName();
            int i6 = k.f23807w;
            k kVar = k.this;
            kVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("activity_id", goalId);
            bundle.putString(Constants.COURSE_ID, ((CopingActivity) kVar.getActivity()).B);
            com.theinnerhour.b2b.fragment.coping.a aVar = new com.theinnerhour.b2b.fragment.coping.a();
            aVar.setArguments(bundle);
            ((CopingActivity) kVar.getActivity()).r0(aVar);
            Bundle bundle2 = new Bundle();
            if (FirebasePersistence.getInstance().getUser() != null && defpackage.b.g() != null) {
                defpackage.d.m(bundle2, "course");
            }
            bundle2.putString("area", ((CopingActivity) kVar.getActivity()).B);
            bundle2.putString(Constants.GOAL_ID, goalId);
            bundle2.putString(Constants.GOAL_NAME, goalName);
            gk.a.b(bundle2, "coping_goal_click");
        }
    }

    public final void J(int i6) {
        this.f23809v.removeAllViews();
        if (((CopingActivity) getActivity()).B == null || ((CopingActivity) getActivity()).B.equals("")) {
            getActivity().finish();
        }
        ArrayList<GoalType> copingActivities = Constants.getCopingActivities(((CopingActivity) getActivity()).B);
        LayoutInflater layoutInflater = (LayoutInflater) getActivity().getSystemService("layout_inflater");
        for (int i10 = 0; i10 < copingActivities.size(); i10++) {
            if (i6 == -1 || i6 > i10) {
                GoalType goalType = copingActivities.get(i10);
                LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.row_coping_activity, (ViewGroup) null);
                AppCompatImageView appCompatImageView = (AppCompatImageView) linearLayout.findViewById(R.id.icon);
                appCompatImageView.setImageResource(goalType.getOffline_icon());
                appCompatImageView.setColorFilter(getResources().getColor(R.color.tracker_orange));
                ((RobertoTextView) linearLayout.findViewById(R.id.text)).setText(goalType.getText2());
                linearLayout.setOnClickListener(new c(goalType));
                this.f23809v.addView(linearLayout);
            } else {
                return;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_stress_relaxing, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f23809v = (LinearLayout) view.findViewById(R.id.ll_activities);
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f23808u = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f23808u.setOnClickListener(new a());
        ((RobertoButton) view.findViewById(R.id.addMore)).setOnClickListener(new b());
        J(3);
    }
}
