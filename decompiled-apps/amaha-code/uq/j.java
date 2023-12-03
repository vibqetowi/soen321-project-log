package uq;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GoalType;
import java.util.HashSet;
/* compiled from: PositiveEnduringFragment.java */
/* loaded from: classes2.dex */
public final class j implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ GoalType f34489u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ImageView f34490v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TextView f34491w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i f34492x;

    public j(i iVar, GoalType goalType, ImageView imageView, TextView textView) {
        this.f34492x = iVar;
        this.f34489u = goalType;
        this.f34490v = imageView;
        this.f34491w = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CardView cardView = (CardView) view;
        i iVar = this.f34492x;
        HashSet<String> hashSet = iVar.f34486v;
        GoalType goalType = this.f34489u;
        boolean contains = hashSet.contains(goalType.getGoalId());
        TextView textView = this.f34491w;
        ImageView imageView = this.f34490v;
        if (contains) {
            iVar.f34486v.remove(goalType.getGoalId());
            imageView.setBackground(iVar.getContext().getResources().getDrawable(R.drawable.circle_hollow_green));
            textView.setVisibility(4);
            return;
        }
        iVar.f34486v.add(goalType.getGoalId());
        imageView.setBackground(iVar.getContext().getResources().getDrawable(R.drawable.concentric_circle_green));
        textView.setVisibility(0);
        iVar.f34486v.add(goalType.getGoalId());
    }
}
