package qb;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ View f29512u;

    public v(EditText editText) {
        this.f29512u = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f29512u;
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
    }
}
