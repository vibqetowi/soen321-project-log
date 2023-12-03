package iq;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GoalType;
import java.util.HashSet;
/* compiled from: EnvironmentCauseFragment.java */
/* loaded from: classes2.dex */
public final class f implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ GoalType f20532u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ImageView f20533v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TextView f20534w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ e f20535x;

    public f(e eVar, GoalType goalType, ImageView imageView, TextView textView) {
        this.f20535x = eVar;
        this.f20532u = goalType;
        this.f20533v = imageView;
        this.f20534w = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CardView cardView = (CardView) view;
        e eVar = this.f20535x;
        HashSet<String> hashSet = eVar.f20529v;
        GoalType goalType = this.f20532u;
        boolean contains = hashSet.contains(goalType.getGoalId());
        TextView textView = this.f20534w;
        ImageView imageView = this.f20533v;
        if (contains) {
            eVar.f20529v.remove(goalType.getGoalId());
            imageView.setBackground(eVar.getContext().getResources().getDrawable(R.drawable.circle_hollow_green));
            textView.setVisibility(4);
            return;
        }
        eVar.f20529v.add(goalType.getGoalId());
        imageView.setBackground(eVar.getContext().getResources().getDrawable(R.drawable.concentric_circle_green));
        textView.setVisibility(0);
    }
}
