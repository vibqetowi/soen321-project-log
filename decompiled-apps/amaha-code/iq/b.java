package iq;

import android.app.Dialog;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: CausesSummaryFragment.java */
/* loaded from: classes2.dex */
public final class b implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ GoalType f20517u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ RobertoTextView f20518v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AppCompatImageView f20519w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ a f20520x;

    public b(a aVar, GoalType goalType, RobertoTextView robertoTextView, AppCompatImageView appCompatImageView) {
        this.f20520x = aVar;
        this.f20517u = goalType;
        this.f20518v = robertoTextView;
        this.f20519w = appCompatImageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        CardView cardView = (CardView) view;
        a aVar = this.f20520x;
        HashSet<String> hashSet = aVar.f20514z;
        GoalType goalType = this.f20517u;
        boolean contains = hashSet.contains(goalType.getGoalId());
        RobertoTextView robertoTextView = this.f20518v;
        AppCompatImageView appCompatImageView = this.f20519w;
        try {
            Dialog dialog = UiUtils.Companion.getDialog(R.layout.popup_goals, aVar.getContext());
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(dialog.getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -1;
            HashMap hashMap = aVar.f20513y;
            GoalType goalType2 = (GoalType) hashMap.get(goalType.getGoalId());
            if (goalType2 != null) {
                Iterator<String> it = goalType2.getLinkedGoals().iterator();
                while (it.hasNext()) {
                    GoalType goalType3 = (GoalType) hashMap.get(it.next());
                    if (goalType3 != null && goalType3.getType().equals(Constants.GOAL_TYPE_HABIT)) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            ((RobertoTextView) dialog.findViewById(R.id.popupGoalHeader)).setText(goalType.getGoalName());
            ((RobertoTextView) dialog.findViewById(R.id.popupGoalDesc)).setText(goalType.getText1());
            if (z10) {
                ((RobertoTextView) dialog.findViewById(R.id.popupGoalDesc2)).setText(goalType.getCta());
            } else {
                ((RobertoTextView) dialog.findViewById(R.id.popupGoalDesc2)).setText("We've made a note of this and created a checklist accordingly. We'll run you through it later.");
            }
            float applyDimension = TypedValue.applyDimension(1, 10.0f, aVar.getContext().getResources().getDisplayMetrics());
            ((ImageView) dialog.findViewById(R.id.close)).setOnClickListener(new c(dialog));
            Button button = (Button) dialog.findViewById(R.id.popupGoalBtn);
            if (z10) {
                if (contains) {
                    button.setText("REMOVE THIS GOAL");
                } else {
                    button.setText("ADD THIS GOAL");
                }
                button.setCompoundDrawablePadding((int) applyDimension);
                button.setOnClickListener(new d(aVar, contains, button, goalType, cardView, robertoTextView, appCompatImageView, dialog));
            } else {
                button.setVisibility(8);
            }
            dialog.show();
            dialog.getWindow().setAttributes(layoutParams);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }
}
