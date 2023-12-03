package g;

import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;
/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public final class d implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f16046a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f16047b;

    public d(View view, View view2) {
        this.f16046a = view;
        this.f16047b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i6, int i10, int i11) {
        AlertController.c(absListView, this.f16046a, this.f16047b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i6) {
    }
}
