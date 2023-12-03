package t0;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.theinnerhour.b2b.utils.UiUtils;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32378u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ View f32379v;

    public /* synthetic */ t0(View view, int i6) {
        this.f32378u = i6;
        this.f32379v = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f32378u;
        View view = this.f32379v;
        switch (i6) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                UiUtils.Companion.b(view);
                return;
        }
    }
}
