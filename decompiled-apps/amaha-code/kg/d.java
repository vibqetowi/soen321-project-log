package kg;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
/* compiled from: CountryCodeAdapter.java */
/* loaded from: classes.dex */
public final class d implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f23327a;

    public d(f fVar) {
        this.f23327a = fVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
        if (i6 != 3) {
            return false;
        }
        f fVar = this.f23327a;
        ((InputMethodManager) fVar.E.getSystemService("input_method")).hideSoftInputFromWindow(fVar.C.getWindowToken(), 0);
        return true;
    }
}
