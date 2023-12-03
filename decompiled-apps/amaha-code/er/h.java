package er;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SleepTimeTableActivity;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.List;
/* compiled from: SleepDropDownResultFragment.java */
/* loaded from: classes2.dex */
public class h extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f14497x = 0;

    /* renamed from: u  reason: collision with root package name */
    public ImageView f14498u;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f14499v;

    /* renamed from: w  reason: collision with root package name */
    public HashMap<String, Boolean> f14500w = new HashMap<>();

    /* compiled from: SleepDropDownResultFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((SleepTimeTableActivity) h.this.getActivity()).t0();
        }
    }

    /* compiled from: SleepDropDownResultFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            h.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_drop_down_result, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        HashMap<String, Boolean> hashMap = ((SleepTimeTableActivity) getActivity()).A;
        this.f14500w = hashMap;
        if (hashMap.size() == 0) {
            if (getArguments().getBoolean("back_pressed", false)) {
                getActivity().onBackPressed();
            } else {
                ((rr.a) getActivity()).t0();
            }
        }
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new a());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f14498u = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f14498u.setOnClickListener(new b());
        this.f14499v = (LinearLayout) view.findViewById(R.id.ll_goals);
        List<GoalType> goals = Constants.getGoals(FirebasePersistence.getInstance().getUser().getCurrentCourse(), true, Constants.GOAL_TYPE_HABIT, Constants.GOAL_SUB_TYPE_TIME_TABLE);
        LayoutInflater layoutInflater = (LayoutInflater) getActivity().getSystemService("layout_inflater");
        for (GoalType goalType : goals) {
            if (this.f14500w.containsKey(goalType.getGoalId())) {
                View inflate = layoutInflater.inflate(R.layout.row_text_clickable, (ViewGroup) null);
                ((RobertoTextView) inflate.findViewById(R.id.goalText)).setText(goalType.getGoalName());
                ((AppCompatImageView) inflate.findViewById(R.id.infoImage)).setOnClickListener(new i(this, goalType));
                this.f14499v.addView(inflate);
            }
        }
    }
}
