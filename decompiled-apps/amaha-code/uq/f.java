package uq;

import android.app.Dialog;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: EnduringResultFragment.java */
/* loaded from: classes2.dex */
public final class f implements View.OnClickListener {
    public final /* synthetic */ Dialog A;
    public final /* synthetic */ c B;

    /* renamed from: u  reason: collision with root package name */
    public boolean f34471u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Button f34472v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ GoalType f34473w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ CardView f34474x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ RobertoTextView f34475y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AppCompatImageView f34476z;

    public f(c cVar, boolean z10, Button button, GoalType goalType, CardView cardView, RobertoTextView robertoTextView, AppCompatImageView appCompatImageView, Dialog dialog) {
        this.B = cVar;
        this.f34472v = button;
        this.f34473w = goalType;
        this.f34474x = cardView;
        this.f34475y = robertoTextView;
        this.f34476z = appCompatImageView;
        this.A = dialog;
        this.f34471u = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10 = this.f34471u;
        c cVar = this.B;
        if (!z10 && cVar.f34462x >= 2) {
            Toast.makeText(cVar.getActivity(), "Adding more than 2 goals is not recommended", 0).show();
            return;
        }
        Dialog dialog = this.A;
        RobertoTextView robertoTextView = this.f34475y;
        CardView cardView = this.f34474x;
        Button button = this.f34472v;
        AppCompatImageView appCompatImageView = this.f34476z;
        GoalType goalType = this.f34473w;
        if (z10) {
            cVar.f34462x--;
            this.f34471u = false;
            button.setText("ADD THIS GOAL");
            cVar.f34463y.remove(goalType.getGoalId());
            Utils utils = Utils.INSTANCE;
            cardView.setCardBackgroundColor(utils.checkBuildBeforesetColor(R.color.white, cVar.getActivity()));
            robertoTextView.setTextColor(utils.checkBuildBeforesetColor(R.color.colorDarkGrey, cVar.getActivity()));
            appCompatImageView.setBackground(utils.checkBuildBeforesetDrawable(R.drawable.circle_hollow_green, cVar.getContext()));
            appCompatImageView.setImageDrawable(null);
            Toast.makeText(cVar.getActivity(), "Removed from goals", 0).show();
            FirebasePersistence.getInstance().removeGoalById(goalType.getGoalId(), cVar.f34461w);
            dialog.dismiss();
            return;
        }
        cVar.f34462x++;
        this.f34471u = true;
        cVar.f34463y.add(goalType.getGoalId());
        button.setText("REMOVE THIS GOAL");
        Utils utils2 = Utils.INSTANCE;
        cardView.setCardBackgroundColor(utils2.checkBuildBeforesetColor(R.color.seaSerpent, cVar.getActivity()));
        robertoTextView.setTextColor(utils2.checkBuildBeforesetColor(R.color.white, cVar.getActivity()));
        appCompatImageView.setBackground(utils2.checkBuildBeforesetDrawable(R.drawable.circle_hollow_white, cVar.getContext()));
        appCompatImageView.setImageDrawable(utils2.checkBuildBeforesetDrawable(R.drawable.ic_check_normal_light, cVar.getContext()));
        FirebasePersistence.getInstance().addNewGoal(goalType.getGoalId(), cVar.f34461w, true);
        Toast.makeText(cVar.getActivity(), "Added to goals", 0).show();
        dialog.dismiss();
    }
}
