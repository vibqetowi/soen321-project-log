package rl;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.lifecycle.j;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import tl.q;
/* compiled from: ExpertCareInfoActivity.kt */
/* loaded from: classes2.dex */
public final class a extends FragmentStateAdapter {
    public final int F;

    public a(y yVar, j jVar) {
        super(yVar, jVar);
        this.F = 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.F;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment x(int i6) {
        q qVar = new q();
        Bundle bundle = new Bundle();
        if (i6 == 0) {
            bundle.putBoolean("is_therapy", true);
        } else {
            bundle.putBoolean("is_therapy", false);
        }
        qVar.setArguments(bundle);
        return qVar;
    }
}
