package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
/* loaded from: classes2.dex */
public class YesNoAssessmentActivity extends androidx.appcompat.app.c {

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f10573x;

    /* renamed from: v  reason: collision with root package name */
    public String f10571v = Constants.SCREEN_ENDURING_ASSESSMENT;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f10572w = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    public int f10574y = 0;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            YesNoAssessmentActivity.this.finish();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            YesNoAssessmentActivity yesNoAssessmentActivity = YesNoAssessmentActivity.this;
            int i6 = yesNoAssessmentActivity.f10574y + 1;
            yesNoAssessmentActivity.f10574y = i6;
            if (i6 < yesNoAssessmentActivity.f10572w.size()) {
                yesNoAssessmentActivity.n0();
                return;
            }
            yesNoAssessmentActivity.setResult(-1, new Intent());
            yesNoAssessmentActivity.finish();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            YesNoAssessmentActivity yesNoAssessmentActivity = YesNoAssessmentActivity.this;
            int i6 = yesNoAssessmentActivity.f10574y + 1;
            yesNoAssessmentActivity.f10574y = i6;
            if (i6 < yesNoAssessmentActivity.f10572w.size()) {
                yesNoAssessmentActivity.n0();
                return;
            }
            yesNoAssessmentActivity.setResult(-1, new Intent());
            yesNoAssessmentActivity.finish();
        }
    }

    public final void n0() {
        int i6 = this.f10574y;
        ArrayList arrayList = this.f10572w;
        if (i6 < arrayList.size()) {
            this.f10573x.setText((CharSequence) arrayList.get(this.f10574y));
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        super.onCreate(bundle);
        List<Goal> userGoals = FirebasePersistence.getInstance().getUserGoals();
        TreeMap treeMap = new TreeMap();
        for (Goal goal : userGoals) {
            treeMap.put(goal.getmLastAdded(), goal);
        }
        ArrayList arrayList = new ArrayList();
        for (Goal goal2 : treeMap.descendingMap().values()) {
            arrayList.add(goal2);
        }
        HashMap<String, GoalType> goalsHashMap = Constants.getGoalsHashMap();
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                Goal goal3 = (Goal) it.next();
                GoalType goalType = goalsHashMap.get(goal3.getGoalId());
                if (goalType != null && (goalType.getType().equals(Constants.GOAL_TYPE_HABIT) || goalType.getType().equals("physical_activity") || goalType.getType().equals(Constants.GOAL_TYPE_RELAXATION_ACTIVITY))) {
                    if (goal3.isVisible()) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            Toast.makeText(this, "No Goals", 0).show();
        }
        setContentView(R.layout.activity_yes_no_assessment);
        this.f10573x = (RobertoTextView) findViewById(R.id.ques);
        ((ImageView) findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
        String string = getIntent().getExtras().getString(Constants.API_COURSE_LINK, Constants.SCREEN_ENDURING_ASSESSMENT);
        this.f10571v = string;
        boolean equals = string.equals(Constants.SCREEN_ENDURING_ASSESSMENT);
        ArrayList arrayList2 = this.f10572w;
        if (equals) {
            arrayList2.add("Did the selected behaviour(s) help you?");
            arrayList2.add("Would you like to continue tracking behaviours and add more goals?");
        } else if (this.f10571v.equals(Constants.SCREEN_THOUGHTS_ASSESSMENT)) {
            arrayList2.add("Did the selected thinking pattern help you?");
            arrayList2.add("Would you like to continue  tracking your thinking pattern?");
        }
        ((LinearLayout) findViewById(R.id.ll_right)).setOnClickListener(new b());
        ((LinearLayout) findViewById(R.id.ll_wrong)).setOnClickListener(new c());
        n0();
    }
}
