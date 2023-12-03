package nm;

import android.os.Bundle;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.components.journal.activity.JournalActivity;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.utils.Constants;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: JournalListFragment.kt */
/* loaded from: classes2.dex */
public final class g extends k implements l<JournalModel, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f26413u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar) {
        super(1);
        this.f26413u = dVar;
    }

    @Override // ss.l
    public final hs.k invoke(JournalModel journalModel) {
        JournalActivity journalActivity;
        JournalModel journalModel2 = journalModel;
        if (journalModel2 != null) {
            String str = gk.a.f16573a;
            Bundle f = defpackage.e.f("action", "edit_draft", "source", Constants.SCREEN_DASHBOARD);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(f, "journal_card_click");
            p requireActivity = this.f26413u.requireActivity();
            if (requireActivity instanceof JournalActivity) {
                journalActivity = (JournalActivity) requireActivity;
            } else {
                journalActivity = null;
            }
            if (journalActivity != null) {
                journalActivity.o0(journalModel2.getId(), journalModel2.getTemplateType());
            }
        }
        return hs.k.f19476a;
    }
}
