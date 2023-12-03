package gr;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.p;
import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SymptomsActivity;
import com.theinnerhour.b2b.model.SleepCauseSummaryModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: StressCausesSummaryFragment.java */
/* loaded from: classes2.dex */
public class c extends rr.b {

    /* renamed from: y  reason: collision with root package name */
    public static final HashSet<Integer> f16711y = new HashSet<>();

    /* renamed from: z  reason: collision with root package name */
    public static final HashSet<String> f16712z = new HashSet<>();

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<SleepCauseSummaryModel> f16713u;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f16714v;

    /* renamed from: w  reason: collision with root package name */
    public TextView[] f16715w;

    /* renamed from: x  reason: collision with root package name */
    public ViewPager f16716x;

    /* compiled from: StressCausesSummaryFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c.this.getActivity().finish();
        }
    }

    /* compiled from: StressCausesSummaryFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c.this.getActivity().finish();
        }
    }

    /* compiled from: StressCausesSummaryFragment.java */
    /* renamed from: gr.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0260c implements View.OnClickListener {
        public View$OnClickListenerC0260c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((SymptomsActivity) c.this.getActivity()).o0();
        }
    }

    /* compiled from: StressCausesSummaryFragment.java */
    /* loaded from: classes2.dex */
    public class d extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f16720c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<SleepCauseSummaryModel> f16721d;

        public d(p pVar, ArrayList arrayList) {
            this.f16721d = new ArrayList<>();
            this.f16720c = pVar;
            this.f16721d = arrayList;
        }

        @Override // k2.a
        public final void e(ViewGroup viewGroup, int i6, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // k2.a
        public final int g() {
            return this.f16721d.size();
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup viewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(this.f16720c).inflate(R.layout.fragment_stress_impact, viewGroup, false);
            ArrayList<SleepCauseSummaryModel> arrayList = this.f16721d;
            ((RobertoTextView) viewGroup2.findViewById(R.id.title)).setText(arrayList.get(i6).getPopupTitleText());
            ((RobertoTextView) viewGroup2.findViewById(R.id.desc)).setText(arrayList.get(i6).getPopupInfoText());
            viewGroup.addView(viewGroup2);
            return viewGroup2;
        }

        @Override // k2.a
        public final boolean j(View view, Object obj) {
            if (view == obj) {
                return true;
            }
            return false;
        }
    }

    public final void J(int i6, int i10) {
        TextView[] textViewArr;
        this.f16715w = new TextView[i10];
        this.f16714v.removeAllViews();
        int i11 = 0;
        while (true) {
            textViewArr = this.f16715w;
            if (i11 >= textViewArr.length) {
                break;
            }
            textViewArr[i11] = new TextView(getContext());
            this.f16715w[i11].setText(Html.fromHtml("&#x25cf;"));
            this.f16715w[i11].setPadding(0, 0, 6, 0);
            this.f16715w[i11].setTextSize(2, 15.0f);
            this.f16715w[i11].setTextColor(getResources().getColor(R.color.gray_background));
            this.f16714v.addView(this.f16715w[i11]);
            i11++;
        }
        if (textViewArr.length > 0) {
            textViewArr[i6].setTextColor(getResources().getColor(R.color.taupeGray));
            this.f16715w[i6].setAlpha(0.8f);
            this.f16715w[i6].setPadding(0, 0, 6, 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stresssymptom_summary, viewGroup, false);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.sleepCauseLinear);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
        this.f16716x = (ViewPager) view.findViewById(R.id.viewpager);
        this.f16714v = (LinearLayout) view.findViewById(R.id.layoutDots);
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new b());
        ((RobertoButton) view.findViewById(R.id.ll_submit)).setOnClickListener(new View$OnClickListenerC0260c());
        this.f16713u = new ArrayList<>();
        Iterator<Integer> it = f16711y.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next.intValue() == 1) {
                this.f16713u.add(new SleepCauseSummaryModel("Difficulty Remembering Things", "When your brain is focussed on dealing with stress, it is less able to process, store and recall information from memory.", "Difficulty Remembering Things", Integer.valueOf((int) R.drawable.ic_difficulty_remembering_things)));
            } else if (next.intValue() == 2) {
                this.f16713u.add(new SleepCauseSummaryModel("Difficulty Thinking Clearly", "When stressed, your body uses its energy to either fight or run away from the situation, making it difficult to think clearly or make rational decisions.", "Difficulty Thinking Clearly", Integer.valueOf((int) R.drawable.ic_difficulty_thinking_clearly)));
            } else if (next.intValue() == 3) {
                this.f16713u.add(new SleepCauseSummaryModel("Negative Thinking", "During times of stress, you might think of other situations in which you have been stressed. This gives rise to negative thinking patterns.", "Negative Thoughts", Integer.valueOf((int) R.drawable.difficult_to_remmember)));
            } else if (next.intValue() == 4) {
                this.f16713u.add(new SleepCauseSummaryModel("Difficulty Concentrating", "When stressed, your brain's resources are focussed on negative thoughts, which makes it difficult for you to focus on problem solving and decision making.", "Difficulty Concentrating", Integer.valueOf((int) R.drawable.ic_difficulty_concentrating)));
            } else if (next.intValue() == 5) {
                this.f16713u.add(new SleepCauseSummaryModel("Rapid Thinking", "When stressed about something, you might often have speeding thoughts that are blown out of proportion, draining your energy and overwhelming you.", "Racing Thoughts", Integer.valueOf((int) R.drawable.ic_racing_thoughts)));
            } else if (next.intValue() == 6) {
                this.f16713u.add(new SleepCauseSummaryModel("Difficulty Sleeping", "Stress makes your body alert and unable to relax, resulting in sleeping difficulties.", "Difficulty Sleeping", Integer.valueOf((int) R.drawable.ic_difficulty_sleeping)));
            } else if (next.intValue() == 7) {
                this.f16713u.add(new SleepCauseSummaryModel("Body Aches", "A common response to stress is the tightening of muscles and increased production and build-up of lactic acid, a chemical that causes you to feel pain.", "Body Aches", Integer.valueOf((int) R.drawable.ic_body_aches)));
            } else if (next.intValue() == 8) {
                this.f16713u.add(new SleepCauseSummaryModel("Increased Heart Rate, Shortness of Breath and Sweating", "Stress leads to release of adrenaline, which prepares you to face the situation by means of various physiological changes in the body.", "Increased Heart Rate, Shortness of Breath and Sweating", Integer.valueOf((int) R.drawable.ic_increased_heart_rate)));
            } else if (next.intValue() == 9) {
                this.f16713u.add(new SleepCauseSummaryModel("Heart Problems", "Prolonged exposure to stressful situations can contribute to health problems such as high blood pressure and, in some cases, cardiovascular diseases.", "Heart Conditions", Integer.valueOf((int) R.drawable.ic_heart_problems)));
            } else if (next.intValue() == 10) {
                this.f16713u.add(new SleepCauseSummaryModel("Skin Conditions", "Stress leads to the production of stress harmone cortisol, making your skin produce more oil and increasing the possibility of skin problems like acne.", "Skin Conditions", Integer.valueOf((int) R.drawable.difficult_to_remmember)));
            } else if (next.intValue() == 11) {
                this.f16713u.add(new SleepCauseSummaryModel("Reduced Immunity", "When continually exposed to stress, your body has few resources left to protect itself from illnesses and diseases.", "Reduced Immunity", Integer.valueOf((int) R.drawable.ic_reduced_immunity)));
            } else if (next.intValue() == 12) {
                this.f16713u.add(new SleepCauseSummaryModel("Sexual Problems and Difficulties", "Stress can hamper your sexual functioning, leading to erectile dysfunction and low sperm count in men and irregular periods and/or menstrual cramps in women.", "Sexual Problems", Integer.valueOf((int) R.drawable.ic_sexual_problems)));
            } else if (next.intValue() == 13) {
                this.f16713u.add(new SleepCauseSummaryModel("Stomach Problems", "When stressed, your brain conserves energy by slowing digestion, often leading to nausea, diarrhoea, indigestion, muscle cramps and acidity.", "Stomach Problems", Integer.valueOf((int) R.drawable.ic_stomach_problems)));
            } else if (next.intValue() == 14) {
                this.f16713u.add(new SleepCauseSummaryModel("Sadness", "Too much stress over time causes imbalances in the levels of cortisol and other brain chemicals, causing you to feel sad.", "Sadness", Integer.valueOf((int) R.drawable.ic_feeling_sad)));
            } else if (next.intValue() == 15) {
                this.f16713u.add(new SleepCauseSummaryModel("Worry and Nervousness", "In response to stress, your body can become alert and anxious. This can leave you feeling constantly worried.", "Worry and Nervousness", Integer.valueOf((int) R.drawable.ic_feeling_worried)));
            } else if (next.intValue() == 16) {
                this.f16713u.add(new SleepCauseSummaryModel("Anger and Frustration", "When you feel stressed, you experience a lack of control. This may cause you to let out your anger in an unhealthy way.", "Anger and Frustration", Integer.valueOf((int) R.drawable.ic_feeling_angry)));
            } else if (next.intValue() == 17) {
                this.f16713u.add(new SleepCauseSummaryModel("Feeling Tired", "Stress drains your energy and is responsible for a number of changes in the body, which, over time, can lead to tiredness and fatigue.", "Feeling Tired", Integer.valueOf((int) R.drawable.ic_feeling_tired)));
            }
        }
        this.f16716x.setAdapter(new d(getActivity(), this.f16713u));
        this.f16716x.b(new e(this.f16713u.size()));
        J(0, this.f16713u.size());
        HashSet hashSet = new HashSet();
        for (int i6 = 0; i6 < this.f16713u.size(); i6++) {
            hashSet.add(this.f16713u.get(i6).getTitleText());
        }
        hashSet.addAll(FirebasePersistence.getInstance().getUser().getStress().getStressSymptoms());
        FirebasePersistence.getInstance().getUser().getStress().getStressSymptoms().clear();
        FirebasePersistence.getInstance().getUser().getStress().getStressSymptoms().addAll(hashSet);
        FirebasePersistence.getInstance().updateUserOnFirebase();
    }

    /* compiled from: StressCausesSummaryFragment.java */
    /* loaded from: classes2.dex */
    public class e implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f16722a;

        public e(int i6) {
            this.f16722a = 0;
            this.f16722a = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            HashSet<Integer> hashSet = c.f16711y;
            c.this.J(i6, this.f16722a);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
