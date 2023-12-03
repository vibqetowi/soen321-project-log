package sm;

import android.os.Bundle;
import com.theinnerhour.b2b.components.journal.model.JournalThoughtThinkingItemListModel;
/* compiled from: JournalThoughtThinkingFragment.kt */
/* loaded from: classes2.dex */
public final class g0 extends kotlin.jvm.internal.k implements ss.l<JournalThoughtThinkingItemListModel, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public static final g0 f31697u = new g0();

    public g0() {
        super(1);
    }

    @Override // ss.l
    public final hs.k invoke(JournalThoughtThinkingItemListModel journalThoughtThinkingItemListModel) {
        String str;
        JournalThoughtThinkingItemListModel journalThoughtThinkingItemListModel2 = journalThoughtThinkingItemListModel;
        String str2 = gk.a.f16573a;
        Bundle bundle = new Bundle();
        if (journalThoughtThinkingItemListModel2 != null) {
            str = journalThoughtThinkingItemListModel2.getHeader();
        } else {
            str = null;
        }
        bundle.putString("thinking_style", str);
        hs.k kVar = hs.k.f19476a;
        gk.a.b(bundle, "journal_thinking_style_expand");
        return hs.k.f19476a;
    }
}
