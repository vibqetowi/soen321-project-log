package sm;

import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.model.JournalThoughtThinkingItemListModel;
import java.util.ArrayList;
/* compiled from: JournalThoughtThinkingFragment.kt */
/* loaded from: classes2.dex */
public final class f0 extends kotlin.jvm.internal.k implements ss.p<JournalThoughtThinkingItemListModel, Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ h0 f31695u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var) {
        super(2);
        this.f31695u = h0Var;
    }

    @Override // ss.p
    public final hs.k invoke(JournalThoughtThinkingItemListModel journalThoughtThinkingItemListModel, Boolean bool) {
        JournalThoughtThinkingItemListModel tempJTTItemListModel = journalThoughtThinkingItemListModel;
        boolean booleanValue = bool.booleanValue();
        kotlin.jvm.internal.i.g(tempJTTItemListModel, "tempJTTItemListModel");
        RecyclerView.e eVar = null;
        h0 h0Var = this.f31695u;
        if (booleanValue) {
            boolean contains = h0Var.f31700w.contains(tempJTTItemListModel);
            ArrayList<JournalThoughtThinkingItemListModel> selectedOptionList = h0Var.f31700w;
            if (contains) {
                selectedOptionList.remove(tempJTTItemListModel);
            }
            RecyclerView recyclerView = (RecyclerView) h0Var._$_findCachedViewById(R.id.rvJournalThoughtThinkingListView);
            if (recyclerView != null) {
                eVar = recyclerView.getAdapter();
            }
            kotlin.jvm.internal.i.e(eVar, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.adapter.JournalThoughtThinkingListAdapter");
            mm.i iVar = (mm.i) eVar;
            kotlin.jvm.internal.i.g(selectedOptionList, "selectedOptionList");
            iVar.f25637y = selectedOptionList;
            iVar.i();
        } else {
            boolean contains2 = h0Var.f31700w.contains(tempJTTItemListModel);
            ArrayList<JournalThoughtThinkingItemListModel> selectedOptionList2 = h0Var.f31700w;
            if (!contains2) {
                selectedOptionList2.add(tempJTTItemListModel);
            }
            RecyclerView recyclerView2 = (RecyclerView) h0Var._$_findCachedViewById(R.id.rvJournalThoughtThinkingListView);
            if (recyclerView2 != null) {
                eVar = recyclerView2.getAdapter();
            }
            kotlin.jvm.internal.i.e(eVar, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.adapter.JournalThoughtThinkingListAdapter");
            mm.i iVar2 = (mm.i) eVar;
            kotlin.jvm.internal.i.g(selectedOptionList2, "selectedOptionList");
            iVar2.f25637y = selectedOptionList2;
            iVar2.i();
        }
        return hs.k.f19476a;
    }
}
