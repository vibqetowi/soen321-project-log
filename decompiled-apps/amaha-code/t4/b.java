package t4;

import android.graphics.drawable.Drawable;
import k4.r;
import k4.v;
import kc.f;
/* compiled from: DrawableResource.java */
/* loaded from: classes.dex */
public abstract class b<T extends Drawable> implements v<T>, r {

    /* renamed from: u  reason: collision with root package name */
    public final T f32406u;

    public b(T t3) {
        f.p(t3);
        this.f32406u = t3;
    }

    @Override // k4.v
    public final Object get() {
        T t3 = this.f32406u;
        Drawable.ConstantState constantState = t3.getConstantState();
        if (constantState != null) {
            return constantState.newDrawable();
        }
        return t3;
    }
}
