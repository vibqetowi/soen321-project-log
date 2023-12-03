package dl;

import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class z1 extends kotlin.jvm.internal.k implements ss.l<JournalModel, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13142u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(V3DashboardActivity v3DashboardActivity) {
        super(1);
        this.f13142u = v3DashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(JournalModel journalModel) {
        JournalModel journalModel2 = journalModel;
        if (journalModel2 != null) {
            ApplicationPersistence.getInstance().setStringValue("journal_last_entry_date", new il.a().b(journalModel2.getLastUpdated()));
            int i6 = V3DashboardActivity.f10714r1;
            this.f13142u.k1();
        }
        return hs.k.f19476a;
    }
}
