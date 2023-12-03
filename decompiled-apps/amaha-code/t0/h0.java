package t0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
/* compiled from: ViewGroup.kt */
/* loaded from: classes.dex */
public final class h0 implements fv.h<View> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f32315a;

    public h0(ViewGroup viewGroup) {
        this.f32315a = viewGroup;
    }

    @Override // fv.h
    public final Iterator<View> iterator() {
        ViewGroup viewGroup = this.f32315a;
        kotlin.jvm.internal.i.g(viewGroup, "<this>");
        return new j0(viewGroup);
    }
}
