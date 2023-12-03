package rr;

import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: CustomFragment.java */
/* loaded from: classes2.dex */
public class b extends Fragment {

    /* compiled from: CustomFragment.java */
    /* loaded from: classes2.dex */
    public class a extends Animation {
    }

    public b F() {
        return null;
    }

    public boolean I() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i6, boolean z10, int i10) {
        if (Utils.INSTANCE.getClearingFragmentBackStack()) {
            a aVar = new a();
            aVar.setDuration(0L);
            return aVar;
        }
        return super.onCreateAnimation(i6, z10, i10);
    }
}
