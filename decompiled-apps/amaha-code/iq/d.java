package iq;

import android.app.Dialog;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: CausesSummaryFragment.java */
/* loaded from: classes2.dex */
public final class d implements View.OnClickListener {
    public final /* synthetic */ Dialog A;
    public final /* synthetic */ a B;

    /* renamed from: u  reason: collision with root package name */
    public boolean f20522u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Button f20523v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ GoalType f20524w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ CardView f20525x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ RobertoTextView f20526y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AppCompatImageView f20527z;

    public d(a aVar, boolean z10, Button button, GoalType goalType, CardView cardView, RobertoTextView robertoTextView, AppCompatImageView appCompatImageView, Dialog dialog) {
        this.B = aVar;
        this.f20523v = button;
        this.f20524w = goalType;
        this.f20525x = cardView;
        this.f20526y = robertoTextView;
        this.f20527z = appCompatImageView;
        this.A = dialog;
        this.f20522u = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10 = this.f20522u;
        a aVar = this.B;
        if (!z10 && aVar.f20512x >= 2) {
            Toast.makeText(aVar.getActivity(), "Adding more than 2 goals is not recommended", 0).show();
            return;
        }
        Dialog dialog = this.A;
        RobertoTextView robertoTextView = this.f20526y;
        CardView cardView = this.f20525x;
        Button button = this.f20523v;
        AppCompatImageView appCompatImageView = this.f20527z;
        GoalType goalType = this.f20524w;
        if (z10) {
            aVar.f20512x--;
            this.f20522u = false;
            button.setText("ADD THIS GOAL");
            aVar.f20514z.remove(goalType.getGoalId());
            Utils utils = Utils.INSTANCE;
            cardView.setCardBackgroundColor(utils.checkBuildBeforesetColor(R.color.white, aVar.getActivity()));
            robertoTextView.setTextColor(utils.checkBuildBeforesetColor(R.color.colorDarkGrey, aVar.getActivity()));
            appCompatImageView.setBackground(utils.checkBuildBeforesetDrawable(R.drawable.circle_hollow_green, aVar.getContext()));
            appCompatImageView.setImageDrawable(null);
            Toast.makeText(aVar.getActivity(), "Removed from goals", 0).show();
            a.J(aVar, goalType.getGoalId(), aVar.f20511w, false);
            dialog.dismiss();
            return;
        }
        aVar.f20512x++;
        this.f20522u = true;
        aVar.f20514z.add(goalType.getGoalId());
        button.setText("REMOVE THIS GOAL");
        Utils utils2 = Utils.INSTANCE;
        cardView.setCardBackgroundColor(utils2.checkBuildBeforesetColor(R.color.seaSerpent, aVar.getActivity()));
        robertoTextView.setTextColor(utils2.checkBuildBeforesetColor(R.color.white, aVar.getActivity()));
        appCompatImageView.setBackground(utils2.checkBuildBeforesetDrawable(R.drawable.circle_hollow_white, aVar.getContext()));
        appCompatImageView.setImageDrawable(utils2.checkBuildBeforesetDrawable(R.drawable.ic_check_normal_light, aVar.getContext()));
        a.J(aVar, goalType.getGoalId(), aVar.f20511w, true);
        Toast.makeText(aVar.getActivity(), "Added to goals", 0).show();
        dialog.dismiss();
    }
}
