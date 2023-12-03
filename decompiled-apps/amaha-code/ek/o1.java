package ek;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.SleepCauseModel;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: StressCauseAdapter.java */
/* loaded from: classes2.dex */
public final class o1 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final List<SleepCauseModel> f14243x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14244y;

    /* renamed from: z  reason: collision with root package name */
    public final HashSet<Integer> f14245z = new HashSet<>();
    public boolean A = false;

    /* compiled from: StressCauseAdapter.java */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14246u;

        /* renamed from: v  reason: collision with root package name */
        public final TextView f14247v;

        /* renamed from: w  reason: collision with root package name */
        public final LinearLayout f14248w;

        /* renamed from: x  reason: collision with root package name */
        public final ImageView f14249x;

        public a(View view) {
            super(view);
            this.f14246u = (RobertoTextView) view.findViewById(R.id.txt_symptom);
            this.f14247v = (TextView) view.findViewById(R.id.tvDivider);
            this.f14248w = (LinearLayout) view.findViewById(R.id.ll_symptom);
            this.f14249x = (ImageView) view.findViewById(R.id.img_icon);
        }
    }

    public o1(androidx.fragment.app.p pVar, ArrayList arrayList) {
        this.f14243x = arrayList;
        this.f14244y = pVar;
    }

    public static void v(a aVar, o1 o1Var, SleepCauseModel sleepCauseModel) {
        o1Var.getClass();
        String titleText = sleepCauseModel.getTitleText();
        boolean z10 = o1Var.A;
        Context context = o1Var.f14244y;
        if (z10) {
            aVar.f14246u.setTextColor(context.getResources().getColor(R.color.colorDarkGrey));
            aVar.f14249x.setBackground(context.getResources().getDrawable(R.drawable.circle_hollow_green));
            aVar.f14247v.setVisibility(4);
            o1Var.A = false;
            if (sleepCauseModel.getTitleText().equals("Feeling Irritable")) {
                gr.c.f16711y.remove(1);
                gr.c.f16712z.remove(titleText);
                return;
            } else if (sleepCauseModel.getTitleText().equals("Feeling Angry Easily and Frequently")) {
                gr.c.f16711y.remove(2);
                gr.c.f16712z.remove(titleText);
                return;
            } else if (sleepCauseModel.getTitleText().equals("Feeling Worried about Your Anger")) {
                gr.c.f16711y.remove(3);
                gr.c.f16712z.remove(titleText);
                return;
            } else if (sleepCauseModel.getTitleText().equals("Venting on Friends or Family")) {
                gr.c.f16711y.remove(4);
                gr.c.f16712z.remove(titleText);
                return;
            } else if (sleepCauseModel.getTitleText().equals("Problems in Relationships")) {
                gr.c.f16711y.remove(5);
                gr.c.f16712z.remove(titleText);
                return;
            } else if (sleepCauseModel.getTitleText().equals("Tense Muscles")) {
                gr.c.f16711y.remove(6);
                gr.c.f16712z.remove(titleText);
                return;
            } else if (sleepCauseModel.getTitleText().equals("Racing Heartbeat")) {
                gr.c.f16711y.remove(7);
                gr.c.f16712z.remove(titleText);
                return;
            } else if (sleepCauseModel.getTitleText().equals("Disturbed Breathing Patterns")) {
                gr.c.f16711y.remove(8);
                gr.c.f16712z.remove(titleText);
                return;
            } else if (sleepCauseModel.getTitleText().equals("Increased Blood Pressure")) {
                gr.c.f16711y.remove(9);
                gr.c.f16712z.remove(titleText);
                return;
            } else if (sleepCauseModel.getTitleText().equals("Frequent Headaches")) {
                gr.c.f16711y.remove(10);
                gr.c.f16712z.remove(titleText);
                return;
            } else {
                return;
            }
        }
        aVar.f14246u.setTextColor(context.getResources().getColor(R.color.colorDarkGrey));
        aVar.f14247v.setVisibility(0);
        aVar.f14249x.setBackground(context.getResources().getDrawable(R.drawable.concentric_circle_green));
        o1Var.A = true;
        if (sleepCauseModel.getTitleText().equals("Feeling Irritable")) {
            gr.c.f16711y.add(1);
            gr.c.f16712z.add(titleText);
        } else if (sleepCauseModel.getTitleText().equals("Feeling Angry Easily and Frequently")) {
            gr.c.f16711y.add(2);
            gr.c.f16712z.add(titleText);
        } else if (sleepCauseModel.getTitleText().equals("Feeling Worried about Your Anger")) {
            gr.c.f16711y.add(3);
            gr.c.f16712z.add(titleText);
        } else if (sleepCauseModel.getTitleText().equals("Venting on Friends or Family")) {
            gr.c.f16711y.add(4);
            gr.c.f16712z.add(titleText);
        } else if (sleepCauseModel.getTitleText().equals("Problems in Relationships")) {
            gr.c.f16711y.add(5);
            gr.c.f16712z.add(titleText);
        } else if (sleepCauseModel.getTitleText().equals("Tense Muscles")) {
            gr.c.f16711y.add(6);
            gr.c.f16712z.add(titleText);
        } else if (sleepCauseModel.getTitleText().equals("Racing Heartbeat")) {
            gr.c.f16711y.add(7);
            gr.c.f16712z.add(titleText);
        } else if (sleepCauseModel.getTitleText().equals("Disturbed Breathing Patterns")) {
            gr.c.f16711y.add(8);
            gr.c.f16712z.add(titleText);
        } else if (sleepCauseModel.getTitleText().equals("Increased Blood Pressure")) {
            gr.c.f16711y.add(9);
            gr.c.f16712z.add(titleText);
        } else if (sleepCauseModel.getTitleText().equals("Frequent Headaches")) {
            gr.c.f16711y.add(10);
            gr.c.f16712z.add(titleText);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14243x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        RobertoTextView robertoTextView;
        ImageView imageView;
        Context context;
        a aVar2 = aVar;
        SleepCauseModel sleepCauseModel = this.f14243x.get(i6);
        Iterator<Integer> it = this.f14245z.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            robertoTextView = aVar2.f14246u;
            imageView = aVar2.f14249x;
            context = this.f14244y;
            if (!hasNext) {
                break;
            } else if (it.next().intValue() == 1) {
                robertoTextView.setTextColor(context.getResources().getColor(R.color.colorDarkGrey));
                imageView.setVisibility(0);
            }
        }
        boolean contains = gr.c.f16712z.toString().contains(sleepCauseModel.getTitleText());
        TextView textView = aVar2.f14247v;
        if (contains) {
            imageView.setBackground(context.getResources().getDrawable(R.drawable.concentric_circle_green));
            textView.setVisibility(0);
            this.A = true;
        } else {
            imageView.setBackground(context.getResources().getDrawable(R.drawable.circle_hollow_green));
            textView.setVisibility(4);
            this.A = false;
        }
        robertoTextView.getTextColors();
        robertoTextView.setText(sleepCauseModel.getTitleText());
        aVar2.f14248w.setOnClickListener(new n1(aVar2, this, sleepCauseModel));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        return new a(defpackage.d.d(recyclerView, R.layout.stress_symptom_list, recyclerView, false));
    }
}
