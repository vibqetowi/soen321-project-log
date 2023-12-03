package k2;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
/* compiled from: PagerAdapter.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final DataSetObservable f22771a = new DataSetObservable();

    /* renamed from: b  reason: collision with root package name */
    public DataSetObserver f22772b;

    @Deprecated
    public void d(View view, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void e(ViewGroup viewGroup, int i6, Object obj) {
        d(viewGroup, obj);
    }

    public abstract int g();

    public CharSequence h() {
        return null;
    }

    public Object i(int i6, ViewGroup viewGroup) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public abstract boolean j(View view, Object obj);

    public final void k() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f22772b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f22771a.notifyChanged();
    }

    public Parcelable m() {
        return null;
    }

    public final void o(ViewPager.j jVar) {
        synchronized (this) {
            this.f22772b = jVar;
        }
    }

    public void f() {
    }

    public void n(Object obj) {
    }

    public void p(ViewGroup viewGroup) {
    }

    public void l(Parcelable parcelable, ClassLoader classLoader) {
    }
}
