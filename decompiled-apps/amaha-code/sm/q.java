package sm;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import ik.l1;
import pl.w0;
/* compiled from: JournalThoughtDescriptionFragment.kt */
/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.k implements ss.l<Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s f31733u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar) {
        super(1);
        this.f31733u = sVar;
    }

    @Override // ss.l
    public final hs.k invoke(Integer num) {
        String str;
        int intValue = num.intValue();
        Utils utils = Utils.INSTANCE;
        s sVar = this.f31733u;
        if (utils.checkConnectivity(sVar.requireActivity())) {
            String str2 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            int i6 = s.K;
            bundle.putString("template", sVar.O().A.b());
            bundle.putInt("step", sVar.f31737x + 1);
            WindowManager.LayoutParams layoutParams = null;
            if (sVar.O().H && sVar.O().J != null) {
                JournalModel journalModel = sVar.O().J;
                if (journalModel != null) {
                    str = journalModel.getId();
                } else {
                    str = null;
                }
            } else {
                str = "fresh_entry";
            }
            bundle.putString("entry_id", str);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "journal_image_remove_click");
            try {
                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_journal_save_popup, sVar.requireActivity(), R.style.Theme_Dialog);
                Window window = styledDialog.getWindow();
                if (window != null) {
                    layoutParams = window.getAttributes();
                }
                if (layoutParams != null) {
                    layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                }
                TextView textView = (TextView) styledDialog.findViewById(R.id.tvJournalDialogTitle);
                if (textView != null) {
                    textView.setText(sVar.getString(R.string.journalImageRemoveDialogHeader));
                }
                TextView textView2 = (TextView) styledDialog.findViewById(R.id.tvJournalDialogMessage);
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                TextView textView3 = (TextView) styledDialog.findViewById(R.id.tvJournalDialogCancel);
                textView3.setText(sVar.getString(R.string.no_cancel));
                textView3.setOnClickListener(new w0(styledDialog, 12, sVar));
                ((ConstraintLayout) styledDialog.findViewById(R.id.clJournalDialogYes)).setOnClickListener(new l1(sVar, intValue, styledDialog, 18));
                ((TextView) styledDialog.findViewById(R.id.tvJournalDialogYes)).setText(sVar.getString(R.string.yes_remove));
                styledDialog.show();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(sVar.f31735v, e10);
            }
        }
        return hs.k.f19476a;
    }
}
