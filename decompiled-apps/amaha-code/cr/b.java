package cr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: SleepChecklistFragment.java */
/* loaded from: classes2.dex */
public class b extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public ImageView f11930u;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f11931v;

    /* compiled from: SleepChecklistFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((rr.a) b.this.getActivity()).t0();
        }
    }

    /* compiled from: SleepChecklistFragment.java */
    /* renamed from: cr.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0175b implements View.OnClickListener {
        public View$OnClickListenerC0175b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_sleep_checklist, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new a());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f11930u = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f11930u.setOnClickListener(new View$OnClickListenerC0175b());
        this.f11931v = (LinearLayout) view.findViewById(R.id.ll_checklist);
        String n10 = defpackage.c.n();
        List<GoalType> goals = Constants.getGoals(n10);
        HashMap hashMap = new HashMap();
        for (GoalType goalType : goals) {
            hashMap.put(goalType.getGoalId(), goalType);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = FirebasePersistence.getInstance().getUser().getSleep().getSleepCauses().iterator();
        while (it.hasNext()) {
            Iterator<String> it2 = ((GoalType) hashMap.get(it.next())).getLinkedGoals().iterator();
            while (it2.hasNext()) {
                GoalType goalType2 = (GoalType) hashMap.get(it2.next());
                if (goalType2.getType().equals("checklist")) {
                    arrayList.add(goalType2);
                }
            }
        }
        if (arrayList.size() == 0) {
            for (GoalType goalType3 : hashMap.values()) {
                if (goalType3.getType().equals("checklist")) {
                    arrayList.add(goalType3);
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Goal goal : FirebasePersistence.getInstance().getUserGoals(n10)) {
            hashMap2.put(goal.getGoalId(), goal);
        }
        LayoutInflater layoutInflater = (LayoutInflater) getActivity().getSystemService("layout_inflater");
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            GoalType goalType4 = (GoalType) it3.next();
            CardView cardView = (CardView) layoutInflater.inflate(R.layout.row_text_checkbox, (ViewGroup) null);
            ((RobertoTextView) cardView.findViewById(R.id.text)).setText(goalType4.getGoalName());
            CheckBox checkBox = (CheckBox) cardView.findViewById(R.id.check);
            if (hashMap2.containsKey(goalType4.getGoalId()) && ((Goal) hashMap2.get(goalType4.getGoalId())).isVisible()) {
                checkBox.setChecked(true);
            }
            checkBox.setOnCheckedChangeListener(new c(goalType4, n10));
            cardView.setOnClickListener(new d(checkBox, goalType4, n10));
            this.f11931v.addView(cardView);
        }
    }
}
