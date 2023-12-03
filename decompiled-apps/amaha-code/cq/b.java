package cq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ho.o;
import java.util.ArrayList;
import java.util.Iterator;
import nn.v0;
/* compiled from: ActivityListFragment.java */
/* loaded from: classes2.dex */
public class b extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f11891x = 0;

    /* renamed from: u  reason: collision with root package name */
    public LinearLayout f11892u;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f11893v;

    /* renamed from: w  reason: collision with root package name */
    public ImageView f11894w;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_activities_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f11892u = (LinearLayout) view.findViewById(R.id.ll_relaxation);
        this.f11893v = (LinearLayout) view.findViewById(R.id.ll_physical);
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f11894w = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f11894w.setOnClickListener(new v0(27, this));
        ArrayList<GoalType> activities = Constants.getActivities(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        LayoutInflater layoutInflater = (LayoutInflater) requireActivity().getSystemService("layout_inflater");
        Iterator<GoalType> it = activities.iterator();
        while (it.hasNext()) {
            GoalType next = it.next();
            LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.row_activity_list, (ViewGroup) null);
            ((AppCompatImageView) linearLayout.findViewById(R.id.icon)).setImageResource(next.getOffline_icon());
            ((RobertoTextView) linearLayout.findViewById(R.id.text)).setText(next.getText2());
            linearLayout.setOnClickListener(new o(this, 11, next));
            if (next.getType().equals("physical_activity")) {
                this.f11893v.addView(linearLayout);
            } else if (next.getType().equals(Constants.GOAL_TYPE_RELAXATION_ACTIVITY)) {
                this.f11892u.addView(linearLayout);
            }
        }
    }
}
