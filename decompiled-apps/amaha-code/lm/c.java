package lm;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.activity.JournalActivity;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: JournalActivity.kt */
/* loaded from: classes2.dex */
public final class c extends BottomSheetBehavior.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JournalActivity f24434a;

    public c(JournalActivity journalActivity) {
        this.f24434a = journalActivity;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
    public final void c(int i6, View view) {
        JournalActivity journalActivity = this.f24434a;
        if (i6 == 4) {
            try {
                View n02 = journalActivity.n0(R.id.viewJournalTemplateBottomSheetBlanketView);
                if (n02 != null) {
                    n02.setVisibility(4);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(journalActivity.f11211v, e10);
            }
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
    public final void b(View view) {
    }
}
