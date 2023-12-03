package dq;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ek.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: PleasuarableActivitySelectionFragment.java */
/* loaded from: classes2.dex */
public class h extends rr.b implements e.a {

    /* renamed from: u  reason: collision with root package name */
    public ek.e f13223u;

    /* renamed from: v  reason: collision with root package name */
    public final HashSet<String> f13224v = new HashSet<>();

    /* renamed from: w  reason: collision with root package name */
    public RobertoTextView f13225w;

    /* compiled from: PleasuarableActivitySelectionFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            h.this.getActivity().finish();
        }
    }

    /* compiled from: PleasuarableActivitySelectionFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((rr.a) h.this.getActivity()).t0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_mastery_activity_selection, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        try {
            ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
            UiUtils.Companion companion = UiUtils.Companion;
            companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
            ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new b());
            this.f13225w = (RobertoTextView) view.findViewById(R.id.activityEmpty);
            ((RobertoTextView) view.findViewById(R.id.header)).setText("Search for a pleasurable task that you would like to begin with.");
            Dialog dialog = companion.getDialog(R.layout.row_textview, getActivity());
            RobertoTextView robertoTextView = (RobertoTextView) dialog.findViewById(R.id.text);
            robertoTextView.setText("It is important to engage in these tasks on a regular basis to fully benefit from them.\n\n\nWe will help you track your activities.");
            robertoTextView.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorWhite, getActivity()));
            dialog.setCancelable(true);
            dialog.show();
            String currentCourse = FirebasePersistence.getInstance().getUser().getCurrentCourse();
            List<GoalType> goals = Constants.getGoals(currentCourse, true, "activity_scheduling", Constants.GOAL_SUB_TYPE_PLEASUREABLE);
            HashMap hashMap = new HashMap();
            for (GoalType goalType : goals) {
                hashMap.put(goalType.getGoalId(), goalType);
            }
            Iterator<Goal> it = FirebasePersistence.getInstance().getUserGoals(currentCourse).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                HashSet<String> hashSet = this.f13224v;
                if (hasNext) {
                    Goal next = it.next();
                    if (hashMap.containsKey(next.getGoalId()) && next.isVisible()) {
                        hashSet.add(next.getGoalId());
                    }
                } else {
                    this.f13223u = new ek.e(getActivity(), hashSet, goals, this);
                    u(goals.size());
                    RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                    recyclerView.setItemAnimator(new androidx.recyclerview.widget.c());
                    recyclerView.setAdapter(this.f13223u);
                    ((RobertoEditText) view.findViewById(R.id.search)).addTextChangedListener(new c());
                    return;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("pleasurableactivity", "exception in on view created ", e10);
        }
    }

    @Override // ek.e.a
    public final void u(int i6) {
        if (i6 > 0) {
            this.f13225w.setVisibility(8);
        } else {
            this.f13225w.setVisibility(0);
        }
    }

    /* compiled from: PleasuarableActivitySelectionFragment.java */
    /* loaded from: classes2.dex */
    public class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            ek.e eVar = h.this.f13223u;
            if (eVar != null) {
                eVar.v(charSequence);
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}
