package ek;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.SleepCauseSummaryModel;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ImpactOfStressAdapter.java */
/* loaded from: classes2.dex */
public final class m implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f14210u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o f14211v;

    public m(o oVar, int i6) {
        this.f14211v = oVar;
        this.f14210u = i6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o oVar = this.f14211v;
        SleepCauseSummaryModel sleepCauseSummaryModel = oVar.f14231x.get(this.f14210u);
        UiUtils.Companion companion = UiUtils.Companion;
        Context context = oVar.f14232y;
        Dialog dialog = companion.getDialog(R.layout.activity_dialog, context);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -1;
        ((ImageView) dialog.findViewById(R.id.cancel)).setOnClickListener(new n(dialog));
        if (oVar.f14233z) {
            ((ImageView) dialog.findViewById(R.id.impact_img)).setImageResource(sleepCauseSummaryModel.getPopupImage().intValue());
        } else {
            ((ImageView) dialog.findViewById(R.id.impact_img)).setVisibility(8);
        }
        ((RobertoTextView) dialog.findViewById(R.id.txt_title)).setText(sleepCauseSummaryModel.getTitleText());
        ((RobertoTextView) dialog.findViewById(R.id.txt_desc)).setText(sleepCauseSummaryModel.getPopupInfoText());
        context.getResources();
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
    }
}
