package qm;

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
/* compiled from: JournalBasicFragment.kt */
/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.k implements ss.l<Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j f29873u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar) {
        super(1);
        this.f29873u = jVar;
    }

    @Override // ss.l
    public final hs.k invoke(Integer num) {
        String str;
        int intValue = num.intValue();
        Utils utils = Utils.INSTANCE;
        j jVar = this.f29873u;
        if (utils.checkConnectivity(jVar.requireActivity())) {
            String str2 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            int i6 = j.L;
            bundle.putString("template", jVar.O().A.b());
            WindowManager.LayoutParams layoutParams = null;
            if (jVar.O().H && jVar.O().J != null) {
                JournalModel journalModel = jVar.O().J;
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
                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_journal_save_popup, jVar.requireActivity(), R.style.Theme_Dialog);
                Window window = styledDialog.getWindow();
                if (window != null) {
                    layoutParams = window.getAttributes();
                }
                if (layoutParams != null) {
                    layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                }
                TextView textView = (TextView) styledDialog.findViewById(R.id.tvJournalDialogTitle);
                if (textView != null) {
                    textView.setText(jVar.getString(R.string.journalImageRemoveDialogHeader));
                }
                TextView textView2 = (TextView) styledDialog.findViewById(R.id.tvJournalDialogMessage);
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                TextView textView3 = (TextView) styledDialog.findViewById(R.id.tvJournalDialogCancel);
                textView3.setText(jVar.getString(R.string.no_cancel));
                textView3.setOnClickListener(new w0(styledDialog, 7, jVar));
                ((ConstraintLayout) styledDialog.findViewById(R.id.clJournalDialogYes)).setOnClickListener(new l1(jVar, intValue, styledDialog, 16));
                ((TextView) styledDialog.findViewById(R.id.tvJournalDialogYes)).setText(jVar.getString(R.string.yes_remove));
                styledDialog.show();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(jVar.f29875v, e10);
            }
        }
        return hs.k.f19476a;
    }
}
