package nm;

import android.os.Bundle;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.components.journal.activity.JournalActivity;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.utils.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: JournalListFragment.kt */
/* loaded from: classes2.dex */
public final class e extends k implements l<JournalModel, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f26411u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar) {
        super(1);
        this.f26411u = dVar;
    }

    @Override // ss.l
    public final hs.k invoke(JournalModel journalModel) {
        JournalActivity journalActivity;
        String str;
        boolean z10;
        JournalModel journalModel2 = journalModel;
        if (journalModel2 != null) {
            int i6 = d.F;
            d dVar = this.f26411u;
            String[] J = dVar.J();
            p requireActivity = dVar.requireActivity();
            if (requireActivity instanceof JournalActivity) {
                journalActivity = (JournalActivity) requireActivity;
            } else {
                journalActivity = null;
            }
            if (journalActivity != null) {
                journalActivity.q0(journalModel2);
            }
            dVar.K().H = true;
            String str2 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("entry_id", journalModel2.getId());
            bundle.putLong("user_entered_date", journalModel2.getUserEnteredDate());
            bundle.putBoolean("is_favourite", journalModel2.isFavourite());
            bundle.putBoolean("is_draft", false);
            String templateType = journalModel2.getTemplateType();
            i.g(templateType, "templateType");
            if (i.b(templateType, "regular")) {
                str = "free_text_journal";
            } else {
                String str3 = "question";
                if (!i.b(templateType, "question")) {
                    if (i.b(templateType, Constants.GOAL_TYPE_THOUGHT)) {
                        str = "thought_journal";
                    } else {
                        str3 = "arc";
                        if (!i.b(templateType, "arc")) {
                            str = "";
                        }
                    }
                }
                str = str3;
            }
            bundle.putString("template", str);
            if (J.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            bundle.putBoolean("is_filter_applied", !z10);
            bundle.putStringArray("filter_value", J);
            bundle.putBoolean("is_from_search", false);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "journal_existing_open");
        }
        return hs.k.f19476a;
    }
}
