package er;

import android.app.Dialog;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashSet;
/* compiled from: SleepGoalsResultFragment.java */
/* loaded from: classes2.dex */
public final class l implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ GoalType f14521u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ CheckBox f14522v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ k f14523w;

    public l(k kVar, GoalType goalType, CheckBox checkBox) {
        this.f14523w = kVar;
        this.f14521u = goalType;
        this.f14522v = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k kVar = this.f14523w;
        HashSet<String> hashSet = kVar.f14516w;
        GoalType goalType = this.f14521u;
        boolean contains = hashSet.contains(goalType.getGoalId());
        CheckBox checkBox = this.f14522v;
        Dialog dialog = UiUtils.Companion.getDialog(R.layout.popup_goals, kVar.getContext());
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -1;
        ((RobertoTextView) dialog.findViewById(R.id.popupGoalHeader)).setText(goalType.getGoalName());
        ((RobertoTextView) dialog.findViewById(R.id.popupGoalDesc)).setText(goalType.getText1());
        ((RobertoTextView) dialog.findViewById(R.id.popupGoalDesc2)).setText(goalType.getCta());
        float applyDimension = TypedValue.applyDimension(1, 10.0f, kVar.getContext().getResources().getDisplayMetrics());
        Button button = (Button) dialog.findViewById(R.id.popupGoalBtn);
        if (contains) {
            button.setText("REMOVE THIS GOAL");
        } else {
            button.setText("ADD THIS GOAL");
        }
        ((ImageView) dialog.findViewById(R.id.close)).setOnClickListener(new m(dialog));
        button.setCompoundDrawablePadding((int) applyDimension);
        button.setOnClickListener(new n(kVar, contains, button, goalType, checkBox, dialog));
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
    }
}
