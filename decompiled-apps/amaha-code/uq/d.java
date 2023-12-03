package uq;

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
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashSet;
/* compiled from: EnduringResultFragment.java */
/* loaded from: classes2.dex */
public final class d implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ GoalType f34466u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ RobertoTextView f34467v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AppCompatImageView f34468w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ c f34469x;

    public d(c cVar, GoalType goalType, RobertoTextView robertoTextView, AppCompatImageView appCompatImageView) {
        this.f34469x = cVar;
        this.f34466u = goalType;
        this.f34467v = robertoTextView;
        this.f34468w = appCompatImageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CardView cardView = (CardView) view;
        c cVar = this.f34469x;
        HashSet<String> hashSet = cVar.f34463y;
        GoalType goalType = this.f34466u;
        boolean contains = hashSet.contains(goalType.getGoalId());
        RobertoTextView robertoTextView = this.f34467v;
        AppCompatImageView appCompatImageView = this.f34468w;
        Dialog dialog = UiUtils.Companion.getDialog(R.layout.popup_goals, cVar.getContext());
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -1;
        ((RobertoTextView) dialog.findViewById(R.id.popupGoalHeader)).setText(goalType.getGoalName());
        ((RobertoTextView) dialog.findViewById(R.id.popupGoalDesc)).setText(goalType.getText1());
        ((RobertoTextView) dialog.findViewById(R.id.popupGoalDesc2)).setText(goalType.getCta());
        float applyDimension = TypedValue.applyDimension(1, 10.0f, cVar.getContext().getResources().getDisplayMetrics());
        Button button = (Button) dialog.findViewById(R.id.popupGoalBtn);
        if (contains) {
            button.setText("REMOVE THIS GOAL");
        } else {
            button.setText("ADD THIS GOAL");
        }
        ((ImageView) dialog.findViewById(R.id.close)).setOnClickListener(new e(dialog));
        button.setCompoundDrawablePadding((int) applyDimension);
        button.setOnClickListener(new f(cVar, contains, button, goalType, cardView, robertoTextView, appCompatImageView, dialog));
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
    }
}
