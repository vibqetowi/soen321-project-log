package ik;

import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f20189u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ View f20190v;

    public /* synthetic */ h0(View view, int i6) {
        this.f20189u = i6;
        this.f20190v = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f20189u;
        View view2 = this.f20190v;
        switch (i6) {
            case 0:
                if (((RobertoTextView) view2.findViewById(R.id.graphDialogSymptomBody)).getVisibility() == 8) {
                    ((RobertoTextView) view2.findViewById(R.id.graphDialogSymptomBody)).setVisibility(0);
                    ((AppCompatImageView) view2.findViewById(R.id.dropDownArrow)).startAnimation(Utils.INSTANCE.rotateBy180(0.0f, 180.0f));
                    return;
                }
                ((RobertoTextView) view2.findViewById(R.id.graphDialogSymptomBody)).setVisibility(8);
                ((AppCompatImageView) view2.findViewById(R.id.dropDownArrow)).startAnimation(Utils.INSTANCE.rotateBy180(180.0f, 360.0f));
                return;
            case 1:
                int i10 = b1.I;
                if (((RobertoTextView) view2.findViewById(R.id.graphDialogSymptomBody)).getVisibility() == 8) {
                    ((RobertoTextView) view2.findViewById(R.id.graphDialogSymptomBody)).setVisibility(0);
                    ((AppCompatImageView) view2.findViewById(R.id.dropDownArrow)).startAnimation(Utils.INSTANCE.rotateBy180(0.0f, 180.0f));
                    return;
                }
                ((RobertoTextView) view2.findViewById(R.id.graphDialogSymptomBody)).setVisibility(8);
                ((AppCompatImageView) view2.findViewById(R.id.dropDownArrow)).startAnimation(Utils.INSTANCE.rotateBy180(180.0f, 360.0f));
                return;
            case 2:
                int i11 = pq.o.f28805x;
                ((RadioButton) view2.findViewById(R.id.radioToggle)).setChecked(true);
                return;
            default:
                int i12 = pq.o.f28805x;
                ((RadioButton) view2.findViewById(R.id.radioToggle)).setChecked(true);
                return;
        }
    }
}
