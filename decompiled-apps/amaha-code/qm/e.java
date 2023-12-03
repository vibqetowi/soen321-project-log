package qm;

import android.text.Editable;
import android.text.TextWatcher;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: JournalBasicFragment.kt */
/* loaded from: classes2.dex */
public final class e implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j f29870u;

    public e(j jVar) {
        this.f29870u = jVar;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        ((RobertoTextView) this.f29870u._$_findCachedViewById(R.id.tvJournalBasicCount)).setVisibility(0);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        int length;
        j jVar = this.f29870u;
        if (charSequence != null) {
            try {
                length = charSequence.length();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(jVar.f29875v, e10);
                return;
            }
        } else {
            length = 0;
        }
        jVar.C = length;
        ((RobertoTextView) jVar._$_findCachedViewById(R.id.tvJournalBasicCount)).setText(jVar.C + "/80");
        if (jVar.C == 80) {
            ((RobertoTextView) jVar._$_findCachedViewById(R.id.tvJournalBasicCount)).setTextColor(g0.a.b(jVar.requireContext(), R.color.templateErrorRed));
        } else {
            ((RobertoTextView) jVar._$_findCachedViewById(R.id.tvJournalBasicCount)).setTextColor(g0.a.b(jVar.requireContext(), R.color.templateHintGrey));
        }
        jVar.Q();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }
}
