package m2;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public final class c implements RecyclerView.o {
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) nVar).width == -1 && ((ViewGroup.MarginLayoutParams) nVar).height == -1) {
            return;
        }
        throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void b(View view) {
    }
}
