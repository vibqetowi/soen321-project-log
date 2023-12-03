package uq;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GoalType;
import java.util.HashSet;
/* compiled from: NegativeEnduringFragment.java */
/* loaded from: classes2.dex */
public final class h implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ GoalType f34481u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ImageView f34482v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TextView f34483w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ g f34484x;

    public h(g gVar, GoalType goalType, ImageView imageView, TextView textView) {
        this.f34484x = gVar;
        this.f34481u = goalType;
        this.f34482v = imageView;
        this.f34483w = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CardView cardView = (CardView) view;
        g gVar = this.f34484x;
        HashSet<String> hashSet = gVar.f34478v;
        GoalType goalType = this.f34481u;
        boolean contains = hashSet.contains(goalType.getGoalId());
        TextView textView = this.f34483w;
        ImageView imageView = this.f34482v;
        if (contains) {
            gVar.f34478v.remove(goalType.getGoalId());
            imageView.setBackground(gVar.getContext().getResources().getDrawable(R.drawable.circle_hollow_green));
            textView.setVisibility(4);
            return;
        }
        gVar.f34478v.add(goalType.getGoalId());
        imageView.setBackground(gVar.getContext().getResources().getDrawable(R.drawable.concentric_circle_green));
        textView.setVisibility(0);
    }
}
