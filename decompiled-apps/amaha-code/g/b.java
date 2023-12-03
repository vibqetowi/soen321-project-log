package g;

import android.view.View;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public final class b implements NestedScrollView.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f16006a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f16007b;

    public b(View view, View view2) {
        this.f16006a = view;
        this.f16007b = view2;
    }

    @Override // androidx.core.widget.NestedScrollView.c
    public final void a(NestedScrollView nestedScrollView) {
        AlertController.c(nestedScrollView, this.f16006a, this.f16007b);
    }
}
