package s1;

import android.view.View;
import com.theinnerhour.b2b.R;
import java.lang.ref.WeakReference;
/* compiled from: Navigation.kt */
/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.k implements ss.l<View, i> {

    /* renamed from: u  reason: collision with root package name */
    public static final f0 f31123u = new f0();

    public f0() {
        super(1);
    }

    @Override // ss.l
    public final i invoke(View view) {
        View it = view;
        kotlin.jvm.internal.i.g(it, "it");
        Object tag = it.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (i) ((WeakReference) tag).get();
        }
        if (tag instanceof i) {
            return (i) tag;
        }
        return null;
    }
}
