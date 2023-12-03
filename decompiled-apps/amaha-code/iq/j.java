package iq;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GoalType;
import java.util.HashSet;
/* compiled from: LifestyleCauseFragment.java */
/* loaded from: classes2.dex */
public final class j implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ GoalType f20548u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ImageView f20549v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TextView f20550w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i f20551x;

    public j(i iVar, GoalType goalType, ImageView imageView, TextView textView) {
        this.f20551x = iVar;
        this.f20548u = goalType;
        this.f20549v = imageView;
        this.f20550w = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CardView cardView = (CardView) view;
        i iVar = this.f20551x;
        HashSet<String> hashSet = iVar.f20545v;
        GoalType goalType = this.f20548u;
        boolean contains = hashSet.contains(goalType.getGoalId());
        TextView textView = this.f20550w;
        ImageView imageView = this.f20549v;
        if (contains) {
            iVar.f20545v.remove(goalType.getGoalId());
            imageView.setBackground(iVar.getContext().getResources().getDrawable(R.drawable.circle_hollow_green));
            textView.setVisibility(4);
            return;
        }
        iVar.f20545v.add(goalType.getGoalId());
        imageView.setBackground(iVar.getContext().getResources().getDrawable(R.drawable.concentric_circle_green));
        textView.setVisibility(0);
    }
}
