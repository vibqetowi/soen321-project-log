package ir;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.ThoughtsActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import j$.util.Objects;
/* compiled from: ThoughtsConditionFragment.java */
/* loaded from: classes2.dex */
public class f extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public String[] f20598u;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f20599v;

    /* compiled from: ThoughtsConditionFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f fVar = f.this;
            if (fVar.isAdded()) {
                fVar.requireActivity().finish();
            }
        }
    }

    /* compiled from: ThoughtsConditionFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String f20601u;

        public b(String str) {
            this.f20601u = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ThoughtsActivity.C = this.f20601u;
            ((ThoughtsActivity) f.this.requireActivity()).o0();
        }
    }

    public final void J() {
        try {
            if (isAdded()) {
                LayoutInflater layoutInflater = (LayoutInflater) requireActivity().getSystemService("layout_inflater");
                String[] strArr = this.f20598u;
                if (strArr != null) {
                    for (String str : strArr) {
                        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.row_text, (ViewGroup) null);
                        ((RobertoTextView) linearLayout.findViewById(R.id.text)).setText(str);
                        linearLayout.setOnClickListener(new b(str));
                        this.f20599v.addView(linearLayout);
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_thoughts_condition, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        char c10;
        try {
            super.onViewCreated(view, bundle);
            this.f20599v = (LinearLayout) view.findViewById(R.id.ll_condition);
            String courseName = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getCourseName();
            Objects.requireNonNull(courseName);
            switch (courseName.hashCode()) {
                case -2114782937:
                    if (courseName.equals(Constants.COURSE_HAPPINESS)) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1617042330:
                    if (courseName.equals(Constants.COURSE_DEPRESSION)) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -891989580:
                    if (courseName.equals(Constants.COURSE_STRESS)) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 92960775:
                    if (courseName.equals(Constants.COURSE_ANGER)) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 113319009:
                    if (courseName.equals(Constants.COURSE_WORRY)) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 == 4) {
                                this.f20598u = new String[]{"I can usually tell what someone is thinking about me.", Constants.THOUGHTS_ANGER_LABELLING_TEXT, "I usually blame situations and people for my problems.", Constants.THOUGHTS_OVERGENERALISATION_TEXT, "Things are always much worse for me than they might seem.", "I have clear rules for how things should be and I stick to them."};
                            }
                        } else {
                            this.f20598u = new String[]{"I can usually tell what someone is thinking about me.", Constants.THOUGHTS_FORTUNE_TELLING_TEXT, Constants.THOUGHTS_PERSONALISATION_TEXT, "I have clear rules for how things should be and I stick to them.", Constants.THOUGHTS_BLACK_AND_WHITE_THINKIING_TEXT, "Things are always much worse for me than they might seem."};
                        }
                    } else {
                        this.f20598u = new String[]{"I can usually tell what someone is thinking about me.", Constants.THOUGHTS_FORTUNE_TELLING_TEXT, Constants.THOUGHTS_PERSONALISATION_TEXT, "I have clear rules for how things should be and I stick to them.", Constants.THOUGHTS_BLACK_AND_WHITE_THINKIING_TEXT, "I usually blame situations and people for my problems."};
                    }
                } else {
                    this.f20598u = new String[]{"I can usually tell what someone is thinking about me.", Constants.THOUGHTS_FORTUNE_TELLING_TEXT, Constants.THOUGHTS_EMOTIONAL_REASONING_TEXT, Constants.THOUGHTS_OVERGENERALISATION_TEXT, Constants.THOUGHTS_DISCOUNTING_THE_POSITIVE_TEXT, "I have clear rules for how things should be and I stick to them.", Constants.THOUGHTS_PERSONALISATION_TEXT};
                }
            } else {
                this.f20598u = new String[]{"I can usually tell what someone is thinking about me.", Constants.THOUGHTS_FORTUNE_TELLING_TEXT, Constants.THOUGHTS_BLACK_AND_WHITE_THINKIING_TEXT, Constants.THOUGHTS_EMOTIONAL_REASONING_TEXT, "Things are always much worse for me than they might seem.", "I have clear rules for how things should be and I stick to them."};
            }
            J();
            ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }
}
