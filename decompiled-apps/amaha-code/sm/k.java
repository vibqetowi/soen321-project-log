package sm;

import android.os.Bundle;
/* compiled from: JournalThoughtAcknowledgeFragment.kt */
/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.k implements ss.l<String, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public static final k f31717u = new k();

    public k() {
        super(1);
    }

    @Override // ss.l
    public final hs.k invoke(String str) {
        String expandedItem = str;
        kotlin.jvm.internal.i.g(expandedItem, "expandedItem");
        String str2 = gk.a.f16573a;
        Bundle a10 = r1.b0.a("item_name", expandedItem);
        hs.k kVar = hs.k.f19476a;
        gk.a.b(a10, "journal_emotion_expand");
        return hs.k.f19476a;
    }
}
