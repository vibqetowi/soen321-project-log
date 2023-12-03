package tn;

import android.widget.CompoundButton;
import androidx.fragment.app.p;
import com.google.android.material.chip.Chip;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f33350u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ h f33351v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Chip f33352w;

    public /* synthetic */ g(h hVar, Chip chip, int i6) {
        this.f33350u = i6;
        this.f33351v = hVar;
        this.f33352w = chip;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        int i6 = this.f33350u;
        Chip chip = this.f33352w;
        h this$0 = this.f33351v;
        switch (i6) {
            case 0:
                int i10 = h.D;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(chip, "$chip");
                ArrayList<String> arrayList = this$0.f33355w;
                if (z10) {
                    if (arrayList.size() + this$0.f33354v.size() == 3) {
                        Utils utils = Utils.INSTANCE;
                        p activity = this$0.getActivity();
                        String string = this$0.getString(R.string.multiTrackerEmotionsErrorMsg2);
                        kotlin.jvm.internal.i.f(string, "getString(R.string.multiTrackerEmotionsErrorMsg2)");
                        utils.showCustomToast(activity, string);
                        chip.setChecked(false);
                        return;
                    }
                    arrayList.add(chip.getText().toString());
                    chip.setChipBackgroundColorResource(this$0.A);
                    chip.setTextColor(g0.a.b(this$0.requireContext(), R.color.white));
                } else {
                    arrayList.remove(chip.getText().toString());
                    chip.setChipBackgroundColorResource(R.color.login_grey_background);
                    chip.setTextColor(g0.a.b(this$0.requireContext(), R.color.title_high_contrast));
                }
                this$0.P();
                return;
            default:
                int i11 = h.D;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(chip, "$chip");
                ArrayList<String> arrayList2 = this$0.f33354v;
                if (z10) {
                    if (this$0.f33355w.size() + arrayList2.size() == 3) {
                        Utils utils2 = Utils.INSTANCE;
                        p activity2 = this$0.getActivity();
                        String string2 = this$0.getString(R.string.multiTrackerEmotionsErrorMsg2);
                        kotlin.jvm.internal.i.f(string2, "getString(R.string.multiTrackerEmotionsErrorMsg2)");
                        utils2.showCustomToast(activity2, string2);
                        chip.setChecked(false);
                        return;
                    }
                    arrayList2.add(chip.getText().toString());
                    chip.setChipBackgroundColorResource(this$0.A);
                    chip.setTextColor(g0.a.b(this$0.requireContext(), R.color.white));
                } else {
                    arrayList2.remove(chip.getText().toString());
                    chip.setChipBackgroundColorResource(R.color.login_grey_background);
                    chip.setTextColor(g0.a.b(this$0.requireContext(), R.color.title_high_contrast));
                }
                this$0.P();
                return;
        }
    }
}
