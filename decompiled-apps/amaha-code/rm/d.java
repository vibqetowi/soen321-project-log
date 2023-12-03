package rm;

import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: JournalTodayQuestionFragment.kt */
/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.k implements ss.l<String, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ h f30796u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar) {
        super(1);
        this.f30796u = hVar;
    }

    @Override // ss.l
    public final hs.k invoke(String str) {
        String str2 = str;
        RobertoTextView robertoTextView = (RobertoTextView) this.f30796u._$_findCachedViewById(R.id.tvJournalQuestionDateText);
        if (robertoTextView != null) {
            robertoTextView.setText(str2);
        }
        return hs.k.f19476a;
    }
}
