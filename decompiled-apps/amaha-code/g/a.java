package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import g.k;
/* compiled from: ActionBar.java */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: ActionBar.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z10);

    public abstract int d();

    public abstract Context e();

    public boolean f() {
        return false;
    }

    public abstract void g();

    public abstract boolean i(int i6, KeyEvent keyEvent);

    public boolean j(KeyEvent keyEvent) {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract void l(boolean z10);

    public abstract void m(boolean z10);

    public abstract void n();

    public abstract void o(boolean z10);

    public abstract void p(CharSequence charSequence);

    public k.a q(k.d dVar) {
        return null;
    }

    /* compiled from: ActionBar.java */
    /* renamed from: g.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0242a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f16001a;

        public C0242a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16001a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kc.f.A);
            this.f16001a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0242a() {
            super(-2, -2);
            this.f16001a = 8388627;
        }

        public C0242a(C0242a c0242a) {
            super((ViewGroup.MarginLayoutParams) c0242a);
            this.f16001a = 0;
            this.f16001a = c0242a.f16001a;
        }

        public C0242a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16001a = 0;
        }
    }

    public void h() {
    }
}
