package iq;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GoalType;
import java.util.HashSet;
/* compiled from: FoodCauseFragment.java */
/* loaded from: classes2.dex */
public final class h implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ GoalType f20540u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ImageView f20541v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TextView f20542w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ g f20543x;

    public h(g gVar, GoalType goalType, ImageView imageView, TextView textView) {
        this.f20543x = gVar;
        this.f20540u = goalType;
        this.f20541v = imageView;
        this.f20542w = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CardView cardView = (CardView) view;
        g gVar = this.f20543x;
        HashSet<String> hashSet = gVar.f20537v;
        GoalType goalType = this.f20540u;
        boolean contains = hashSet.contains(goalType.getGoalId());
        TextView textView = this.f20542w;
        ImageView imageView = this.f20541v;
        if (contains) {
            gVar.f20537v.remove(goalType.getGoalId());
            imageView.setBackground(gVar.getContext().getResources().getDrawable(R.drawable.circle_hollow_green));
            textView.setVisibility(4);
            return;
        }
        gVar.f20537v.add(goalType.getGoalId());
        imageView.setBackground(gVar.getContext().getResources().getDrawable(R.drawable.concentric_circle_green));
        textView.setVisibility(0);
    }
}
