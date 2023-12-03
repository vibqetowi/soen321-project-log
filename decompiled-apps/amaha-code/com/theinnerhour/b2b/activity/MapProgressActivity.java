package com.theinnerhour.b2b.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.t1;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g.j;
import g.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public class MapProgressActivity extends rr.a {
    public LinearLayout C;

    /* renamed from: w  reason: collision with root package name */
    public final String[] f10440w = {"Assess Your Stress", "Amaha Stress-Busters", "De-Stress and Relax", "Your Happiness Goals", "Positive Thinking", "Understand the Stress Cycle", "Take the Stress Quiz", "Work on Your Goals"};

    /* renamed from: x  reason: collision with root package name */
    public final String[] f10441x = {"Assess Your Sleep", "Your Sleep Goals", "Activities for Good Sleep", "Causes of Poor Sleep", "Sleep-Bed Connect", "Calming Your Mind", "Take the Sleep Quiz", "Your Body Clock"};

    /* renamed from: y  reason: collision with root package name */
    public final String[] f10442y = {"Assess Your Mood", "Amaha Mood Boosters", "Your Happiness Tasks", "Your Happiness Goals", "Work on Your Thoughts", "Mind and Body", "Take the Mood Quiz", "Work on Your Goals"};

    /* renamed from: z  reason: collision with root package name */
    public final String[] f10443z = {"Assess Your Happiness", "Your Happiness Tasks", "Amaha Happiness Journal", "Your Happiness Goals", "Creating Happiness", "Practising Mindfulness", "Work on Your Thoughts", "Work on Your Goals"};
    public final String[] A = {"Assess Your Worry", "Amaha Worry Relievers", "Your Happiness Goals", "Tips for Problem Solving", "Work on Your Thoughts", "Understand the Worry Cycle", "Take the Worry Quiz", "Work on Your Goals"};
    public final String[] B = {"Is Your Anger a Problem?", "Amaha Anger Relief Tools", "Your Happiness Goals", "Problem Solving for Anger Management", "Work on Your Thoughts", "Understand the Anger Cycle", "Take the Anger Management Quiz", "Work on Your Goals"};
    public final String D = "is_first";

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MapProgressActivity.this.n0();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MapProgressActivity.this.n0();
        }
    }

    static {
        w.a aVar = j.f16054u;
        int i6 = t1.f1560a;
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        n0();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str = this.D;
        super.onCreate(bundle);
        setContentView(R.layout.activity_map_progress);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_orange));
        this.C = (LinearLayout) findViewById(R.id.ll_milestone);
        ((RobertoButton) findViewById(R.id.ll_map_bottom)).setOnClickListener(new a());
        ((ImageView) findViewById(R.id.header_arrow_back)).setOnClickListener(new b());
        try {
            String currentCourse = FirebasePersistence.getInstance().getUser().getCurrentCourse();
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            boolean booleanValue = applicationPersistence.getBooleanValue(str + currentCourse);
            ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
            applicationPersistence2.setBooleanValue(str + currentCourse, false);
            if (booleanValue) {
                ((RobertoTextView) findViewById(R.id.descTxt)).setText("Here is your personalised journey for the next 4 weeks.");
            } else {
                ((RobertoTextView) findViewById(R.id.descTxt)).setText("You have made some good progress! Here's what you've completed so far.");
            }
            u0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("mapprogressactivity", "exception in oncreate", e10);
            n0();
        }
        Bundle bundle2 = new Bundle();
        if (FirebasePersistence.getInstance().getUser() != null && defpackage.b.g() != null) {
            d.m(bundle2, "course");
        }
        gk.a.b(bundle2, "course_progress");
    }

    public final void u0() {
        Object valueOf;
        Object valueOf2;
        Course courseById = FirebasePersistence.getInstance().getCourseById(c.n());
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
        List arrayList = new ArrayList();
        if (courseById.getCourseName().equals(Constants.COURSE_STRESS)) {
            arrayList = Arrays.asList(this.f10440w);
        } else if (courseById.getCourseName().equals(Constants.COURSE_SLEEP)) {
            arrayList = Arrays.asList(this.f10441x);
        } else if (courseById.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
            arrayList = Arrays.asList(this.f10442y);
        } else if (courseById.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
            arrayList = Arrays.asList(this.f10443z);
        } else if (courseById.getCourseName().equals(Constants.COURSE_WORRY)) {
            arrayList = Arrays.asList(this.A);
        } else if (courseById.getCourseName().equals(Constants.COURSE_ANGER)) {
            arrayList = Arrays.asList(this.B);
        }
        Iterator<CourseDayModel> it = courseById.getPlan().iterator();
        boolean z10 = true;
        int i6 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            CourseDayModel next = it.next();
            if (next.isMilestone()) {
                LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.map_progress_row_1, (ViewGroup) null);
                LinearLayout linearLayout2 = (LinearLayout) layoutInflater.inflate(R.layout.map_progress_row_2, (ViewGroup) null);
                RobertoTextView robertoTextView = (RobertoTextView) linearLayout.findViewById(R.id.progress_day);
                if (z10) {
                    StringBuilder sb2 = new StringBuilder("Day ");
                    if (next.getPosition() < 10) {
                        valueOf2 = "0" + next.getPosition();
                    } else {
                        valueOf2 = Integer.valueOf(next.getPosition());
                    }
                    sb2.append(valueOf2);
                    robertoTextView.setText(sb2.toString());
                    robertoTextView.setVisibility(i6);
                    z10 = false;
                } else if (next.getPosition() >= courseById.getPlan().size()) {
                    StringBuilder sb3 = new StringBuilder("Day ");
                    if (next.getPosition() < 10) {
                        valueOf = "0" + next.getPosition();
                    } else {
                        valueOf = Integer.valueOf(next.getPosition());
                    }
                    sb3.append(valueOf);
                    robertoTextView.setText(sb3.toString());
                    i6 = 0;
                    robertoTextView.setVisibility(0);
                } else {
                    i6 = 0;
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) linearLayout.findViewById(R.id.progress_indicator);
                RobertoTextView robertoTextView2 = (RobertoTextView) linearLayout.findViewById(R.id.progress_text);
                if (i10 < arrayList.size()) {
                    robertoTextView2.setText((CharSequence) arrayList.get(i10));
                    i10++;
                }
                if (next.getPosition() <= courseById.getCoursePosition()) {
                    if (next.isCompleted()) {
                        appCompatImageView.setImageResource(R.drawable.ic_check_circle);
                        appCompatImageView.setColorFilter(Utils.INSTANCE.checkBuildBeforesetColor(R.color.tracker_orange, this));
                    } else {
                        appCompatImageView.setImageResource(R.drawable.ic_chevron_circle_right);
                        appCompatImageView.setColorFilter(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorRed, this));
                    }
                }
                this.C.addView(linearLayout);
                if (i10 < arrayList.size()) {
                    this.C.addView(linearLayout2);
                }
            }
        }
    }
}
