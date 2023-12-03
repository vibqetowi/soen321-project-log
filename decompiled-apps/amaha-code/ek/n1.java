package ek;

import android.content.Context;
import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SymptomsActivity;
import com.theinnerhour.b2b.model.SleepCauseModel;
import com.theinnerhour.b2b.utils.Constants;
import ek.o1;
import java.util.HashSet;
/* compiled from: StressCauseAdapter.java */
/* loaded from: classes2.dex */
public final class n1 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ SleepCauseModel f14228u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o1.a f14229v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ o1 f14230w;

    public n1(o1.a aVar, o1 o1Var, SleepCauseModel sleepCauseModel) {
        this.f14230w = o1Var;
        this.f14228u = sleepCauseModel;
        this.f14229v = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HashSet<String> hashSet = gr.c.f16712z;
        String obj = hashSet.toString();
        SleepCauseModel sleepCauseModel = this.f14228u;
        boolean contains = obj.contains(sleepCauseModel.getTitleText());
        o1 o1Var = this.f14230w;
        if (contains) {
            o1Var.A = true;
        } else {
            o1Var.A = false;
        }
        boolean equals = SymptomsActivity.B.equals(Constants.COURSE_DEPRESSION);
        o1.a aVar = this.f14229v;
        if (equals) {
            o1Var.getClass();
            String titleText = sleepCauseModel.getTitleText();
            boolean z10 = o1Var.A;
            Context context = o1Var.f14244y;
            if (z10) {
                aVar.f14246u.setTextColor(context.getResources().getColor(R.color.colorDarkGrey));
                aVar.f14249x.setBackground(context.getResources().getDrawable(R.drawable.circle_hollow_green));
                aVar.f14247v.setVisibility(4);
                o1Var.A = false;
                if (sleepCauseModel.getTitleText().equals("Difficulty Remembering Things")) {
                    gr.c.f16711y.remove(1);
                    hashSet.remove(titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Difficulty Paying Attention")) {
                    gr.c.f16711y.remove(2);
                    hashSet.remove(titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Difficulty Making Decisions")) {
                    gr.c.f16711y.remove(3);
                    hashSet.remove(titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Negative Thinking")) {
                    gr.c.f16711y.remove(4);
                    hashSet.remove(titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Changes in Appetite")) {
                    gr.c.f16711y.remove(5);
                    hashSet.remove(titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Changes in Weight")) {
                    gr.c.f16711y.remove(6);
                    hashSet.remove(titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Difficulty Sleeping")) {
                    gr.c.f16711y.remove(7);
                    hashSet.remove(titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Little Interest in Sexual Activities")) {
                    gr.c.f16711y.remove(8);
                    hashSet.remove(titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Feeling Tired")) {
                    gr.c.f16711y.remove(9);
                    hashSet.remove(titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Aches and Pains")) {
                    defpackage.e.q(10, gr.c.f16711y, hashSet, titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Feeling Hopeless")) {
                    defpackage.e.q(11, gr.c.f16711y, hashSet, titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Feeling Worthless")) {
                    defpackage.e.q(12, gr.c.f16711y, hashSet, titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Feeling Helpless")) {
                    defpackage.e.q(13, gr.c.f16711y, hashSet, titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Feeling Sad")) {
                    defpackage.e.q(14, gr.c.f16711y, hashSet, titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Feeling Angry or Irritable")) {
                    defpackage.e.q(15, gr.c.f16711y, hashSet, titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Feeling Guilty")) {
                    defpackage.e.q(16, gr.c.f16711y, hashSet, titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Little to No Social Interaction")) {
                    defpackage.e.q(17, gr.c.f16711y, hashSet, titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Poor Self Care")) {
                    defpackage.e.q(18, gr.c.f16711y, hashSet, titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("No Interest in Pleasurable Activities")) {
                    defpackage.e.q(19, gr.c.f16711y, hashSet, titleText);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Lowered Activity Levels")) {
                    defpackage.e.q(20, gr.c.f16711y, hashSet, titleText);
                    return;
                } else {
                    return;
                }
            }
            aVar.f14246u.setTextColor(context.getResources().getColor(R.color.colorDarkGrey));
            aVar.f14247v.setVisibility(0);
            aVar.f14249x.setBackground(context.getResources().getDrawable(R.drawable.concentric_circle_green));
            o1Var.A = true;
            if (sleepCauseModel.getTitleText().equals("Difficulty Remembering Things")) {
                gr.c.f16711y.add(1);
                hashSet.add(titleText);
            } else if (sleepCauseModel.getTitleText().equals("Difficulty Paying Attention")) {
                gr.c.f16711y.add(2);
                hashSet.add(titleText);
            } else if (sleepCauseModel.getTitleText().equals("Difficulty Making Decisions")) {
                gr.c.f16711y.add(3);
                hashSet.add(titleText);
            } else if (sleepCauseModel.getTitleText().equals("Negative Thinking")) {
                gr.c.f16711y.add(4);
                hashSet.add(titleText);
            } else if (sleepCauseModel.getTitleText().equals("Changes in Appetite")) {
                gr.c.f16711y.add(5);
                hashSet.add(titleText);
            } else if (sleepCauseModel.getTitleText().equals("Changes in Weight")) {
                gr.c.f16711y.add(6);
                hashSet.add(titleText);
            } else if (sleepCauseModel.getTitleText().equals("Difficulty Sleeping")) {
                gr.c.f16711y.add(7);
                hashSet.add(titleText);
            } else if (sleepCauseModel.getTitleText().equals("Little Interest in Sexual Activities")) {
                gr.c.f16711y.add(8);
                hashSet.add(titleText);
            } else if (sleepCauseModel.getTitleText().equals("Feeling Tired")) {
                gr.c.f16711y.add(9);
                hashSet.add(titleText);
            } else if (sleepCauseModel.getTitleText().equals("Aches and Pains")) {
                defpackage.d.l(10, gr.c.f16711y, hashSet, titleText);
            } else if (sleepCauseModel.getTitleText().equals("Feeling Hopeless")) {
                defpackage.d.l(11, gr.c.f16711y, hashSet, titleText);
            } else if (sleepCauseModel.getTitleText().equals("Feeling Worthless")) {
                defpackage.d.l(12, gr.c.f16711y, hashSet, titleText);
            } else if (sleepCauseModel.getTitleText().equals("Feeling Helpless")) {
                defpackage.d.l(13, gr.c.f16711y, hashSet, titleText);
            } else if (sleepCauseModel.getTitleText().equals("Feeling Sad")) {
                defpackage.d.l(14, gr.c.f16711y, hashSet, titleText);
            } else if (sleepCauseModel.getTitleText().equals("Feeling Angry or Irritable")) {
                defpackage.d.l(15, gr.c.f16711y, hashSet, titleText);
            } else if (sleepCauseModel.getTitleText().equals("Feeling Guilty")) {
                defpackage.d.l(16, gr.c.f16711y, hashSet, titleText);
            } else if (sleepCauseModel.getTitleText().equals("Little to No Social Interaction")) {
                defpackage.d.l(17, gr.c.f16711y, hashSet, titleText);
            } else if (sleepCauseModel.getTitleText().equals("Poor Self Care")) {
                defpackage.d.l(18, gr.c.f16711y, hashSet, titleText);
            } else if (sleepCauseModel.getTitleText().equals("No Interest in Pleasurable Activities")) {
                defpackage.d.l(19, gr.c.f16711y, hashSet, titleText);
            } else if (sleepCauseModel.getTitleText().equals("Lowered Activity Levels")) {
                defpackage.d.l(20, gr.c.f16711y, hashSet, titleText);
            }
        } else if (SymptomsActivity.B.equals(Constants.COURSE_STRESS)) {
            o1Var.getClass();
            String titleText2 = sleepCauseModel.getTitleText();
            boolean z11 = o1Var.A;
            Context context2 = o1Var.f14244y;
            if (z11) {
                aVar.f14246u.setTextColor(context2.getResources().getColor(R.color.colorDarkGrey));
                aVar.f14249x.setBackground(context2.getResources().getDrawable(R.drawable.circle_hollow_green));
                aVar.f14247v.setVisibility(4);
                o1Var.A = false;
                if (sleepCauseModel.getTitleText().equals("Difficulty Remembering Things")) {
                    gr.c.f16711y.remove(1);
                    hashSet.remove(titleText2);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Difficulty Thinking Clearly")) {
                    gr.c.f16711y.remove(2);
                    hashSet.remove(titleText2);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Negative Thinking")) {
                    gr.c.f16711y.remove(3);
                    hashSet.remove(titleText2);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Difficulty Concentrating")) {
                    gr.c.f16711y.remove(4);
                    hashSet.remove(titleText2);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Rapid Thinking")) {
                    gr.c.f16711y.remove(5);
                    hashSet.remove(titleText2);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Difficulty Sleeping")) {
                    gr.c.f16711y.remove(6);
                    hashSet.remove(titleText2);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Body Aches")) {
                    gr.c.f16711y.remove(7);
                    hashSet.remove(titleText2);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Increased Heart Rate, Shortness of Breath and Sweating")) {
                    gr.c.f16711y.remove(8);
                    hashSet.remove(titleText2);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Heart Problems")) {
                    gr.c.f16711y.remove(9);
                    hashSet.remove(titleText2);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Skin Conditions")) {
                    defpackage.e.q(10, gr.c.f16711y, hashSet, titleText2);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Reduced Immunity")) {
                    defpackage.e.q(11, gr.c.f16711y, hashSet, titleText2);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Sexual Problems and Difficulties")) {
                    defpackage.e.q(12, gr.c.f16711y, hashSet, titleText2);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Stomach Problems")) {
                    defpackage.e.q(13, gr.c.f16711y, hashSet, titleText2);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Sadness")) {
                    defpackage.e.q(14, gr.c.f16711y, hashSet, titleText2);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Worry and Nervousness")) {
                    defpackage.e.q(15, gr.c.f16711y, hashSet, titleText2);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Anger and Frustration")) {
                    defpackage.e.q(16, gr.c.f16711y, hashSet, titleText2);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Feeling Tired")) {
                    defpackage.e.q(17, gr.c.f16711y, hashSet, titleText2);
                    return;
                } else {
                    return;
                }
            }
            aVar.f14246u.setTextColor(context2.getResources().getColor(R.color.colorDarkGrey));
            aVar.f14247v.setVisibility(0);
            aVar.f14249x.setBackground(context2.getResources().getDrawable(R.drawable.concentric_circle_green));
            o1Var.A = true;
            if (sleepCauseModel.getTitleText().equals("Difficulty Remembering Things")) {
                gr.c.f16711y.add(1);
                hashSet.add(titleText2);
            } else if (sleepCauseModel.getTitleText().equals("Difficulty Thinking Clearly")) {
                gr.c.f16711y.add(2);
                hashSet.add(titleText2);
            } else if (sleepCauseModel.getTitleText().equals("Negative Thinking")) {
                gr.c.f16711y.add(3);
                hashSet.add(titleText2);
            } else if (sleepCauseModel.getTitleText().equals("Difficulty Concentrating")) {
                gr.c.f16711y.add(4);
                hashSet.add(titleText2);
            } else if (sleepCauseModel.getTitleText().equals("Rapid Thinking")) {
                gr.c.f16711y.add(5);
                hashSet.add(titleText2);
            } else if (sleepCauseModel.getTitleText().equals("Difficulty Sleeping")) {
                gr.c.f16711y.add(6);
                hashSet.add(titleText2);
            } else if (sleepCauseModel.getTitleText().equals("Body Aches")) {
                gr.c.f16711y.add(7);
                hashSet.add(titleText2);
            } else if (sleepCauseModel.getTitleText().equals("Increased Heart Rate, Shortness of Breath and Sweating")) {
                gr.c.f16711y.add(8);
                hashSet.add(titleText2);
            } else if (sleepCauseModel.getTitleText().equals("Heart Problems")) {
                gr.c.f16711y.add(9);
                hashSet.add(titleText2);
            } else if (sleepCauseModel.getTitleText().equals("Skin Conditions")) {
                defpackage.d.l(10, gr.c.f16711y, hashSet, titleText2);
            } else if (sleepCauseModel.getTitleText().equals("Reduced Immunity")) {
                defpackage.d.l(11, gr.c.f16711y, hashSet, titleText2);
            } else if (sleepCauseModel.getTitleText().equals("Sexual Problems and Difficulties")) {
                defpackage.d.l(12, gr.c.f16711y, hashSet, titleText2);
            } else if (sleepCauseModel.getTitleText().equals("Stomach Problems")) {
                defpackage.d.l(13, gr.c.f16711y, hashSet, titleText2);
            } else if (sleepCauseModel.getTitleText().equals("Sadness")) {
                defpackage.d.l(14, gr.c.f16711y, hashSet, titleText2);
            } else if (sleepCauseModel.getTitleText().equals("Worry and Nervousness")) {
                defpackage.d.l(15, gr.c.f16711y, hashSet, titleText2);
            } else if (sleepCauseModel.getTitleText().equals("Anger and Frustration")) {
                defpackage.d.l(16, gr.c.f16711y, hashSet, titleText2);
            } else if (sleepCauseModel.getTitleText().equals("Feeling Tired")) {
                defpackage.d.l(17, gr.c.f16711y, hashSet, titleText2);
            }
        } else if (SymptomsActivity.B.equals(Constants.COURSE_WORRY)) {
            o1Var.getClass();
            String titleText3 = sleepCauseModel.getTitleText();
            boolean z12 = o1Var.A;
            Context context3 = o1Var.f14244y;
            if (z12) {
                aVar.f14246u.setTextColor(context3.getResources().getColor(R.color.colorDarkGrey));
                aVar.f14249x.setBackground(context3.getResources().getDrawable(R.drawable.circle_hollow_green));
                aVar.f14247v.setVisibility(4);
                o1Var.A = false;
                if (sleepCauseModel.getTitleText().equals("Frustration and Irritability")) {
                    gr.c.f16711y.remove(1);
                    hashSet.remove(titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Excessive Worrying")) {
                    gr.c.f16711y.remove(2);
                    hashSet.remove(titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Sadness")) {
                    gr.c.f16711y.remove(3);
                    hashSet.remove(titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Heavy Breathing")) {
                    gr.c.f16711y.remove(4);
                    hashSet.remove(titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Racing Heart")) {
                    gr.c.f16711y.remove(5);
                    hashSet.remove(titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Tiredness")) {
                    gr.c.f16711y.remove(6);
                    hashSet.remove(titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Muscle Tension")) {
                    gr.c.f16711y.remove(7);
                    hashSet.remove(titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Disturbed Sleep Patterns")) {
                    gr.c.f16711y.remove(8);
                    hashSet.remove(titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Dizziness")) {
                    gr.c.f16711y.remove(9);
                    hashSet.remove(titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Headaches")) {
                    defpackage.e.q(10, gr.c.f16711y, hashSet, titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Trembling")) {
                    defpackage.e.q(11, gr.c.f16711y, hashSet, titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Frequent Urination")) {
                    defpackage.e.q(12, gr.c.f16711y, hashSet, titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Restlessness")) {
                    defpackage.e.q(13, gr.c.f16711y, hashSet, titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Getting Easily Frightened")) {
                    defpackage.e.q(14, gr.c.f16711y, hashSet, titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Procrastination")) {
                    defpackage.e.q(15, gr.c.f16711y, hashSet, titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Difficulty Making Decisions")) {
                    defpackage.e.q(16, gr.c.f16711y, hashSet, titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Difficulty Concentrating")) {
                    defpackage.e.q(17, gr.c.f16711y, hashSet, titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Inability to Recall Events")) {
                    defpackage.e.q(18, gr.c.f16711y, hashSet, titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Negative Thinking")) {
                    defpackage.e.q(19, gr.c.f16711y, hashSet, titleText3);
                    return;
                } else if (sleepCauseModel.getTitleText().equals("Thinking That You Worry Too Much")) {
                    defpackage.e.q(20, gr.c.f16711y, hashSet, titleText3);
                    return;
                } else {
                    return;
                }
            }
            aVar.f14246u.setTextColor(context3.getResources().getColor(R.color.colorDarkGrey));
            aVar.f14247v.setVisibility(0);
            aVar.f14249x.setBackground(context3.getResources().getDrawable(R.drawable.concentric_circle_green));
            o1Var.A = true;
            if (sleepCauseModel.getTitleText().equals("Frustration and Irritability")) {
                gr.c.f16711y.add(1);
                hashSet.add(titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Excessive Worrying")) {
                gr.c.f16711y.add(2);
                hashSet.add(titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Sadness")) {
                gr.c.f16711y.add(3);
                hashSet.add(titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Heavy Breathing")) {
                gr.c.f16711y.add(4);
                hashSet.add(titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Racing Heart")) {
                gr.c.f16711y.add(5);
                hashSet.add(titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Tiredness")) {
                gr.c.f16711y.add(6);
                hashSet.add(titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Muscle Tension")) {
                gr.c.f16711y.add(7);
                hashSet.add(titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Disturbed Sleep Patterns")) {
                gr.c.f16711y.add(8);
                hashSet.add(titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Dizziness")) {
                gr.c.f16711y.add(9);
                hashSet.add(titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Headaches")) {
                defpackage.d.l(10, gr.c.f16711y, hashSet, titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Trembling")) {
                defpackage.d.l(11, gr.c.f16711y, hashSet, titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Frequent Urination")) {
                defpackage.d.l(12, gr.c.f16711y, hashSet, titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Restlessness")) {
                defpackage.d.l(13, gr.c.f16711y, hashSet, titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Getting Easily Frightened")) {
                defpackage.d.l(14, gr.c.f16711y, hashSet, titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Procrastination")) {
                defpackage.d.l(15, gr.c.f16711y, hashSet, titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Difficulty Making Decisions")) {
                defpackage.d.l(16, gr.c.f16711y, hashSet, titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Difficulty Concentrating")) {
                defpackage.d.l(17, gr.c.f16711y, hashSet, titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Inability to Recall Events")) {
                defpackage.d.l(18, gr.c.f16711y, hashSet, titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Negative Thinking")) {
                defpackage.d.l(19, gr.c.f16711y, hashSet, titleText3);
            } else if (sleepCauseModel.getTitleText().equals("Thinking That You Worry Too Much")) {
                defpackage.d.l(20, gr.c.f16711y, hashSet, titleText3);
            }
        } else if (SymptomsActivity.B.equals(Constants.COURSE_ANGER)) {
            o1.v(aVar, o1Var, sleepCauseModel);
        }
    }
}
