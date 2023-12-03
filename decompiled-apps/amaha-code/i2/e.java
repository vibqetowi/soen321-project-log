package i2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f19680a;

    public e(d dVar) {
        this.f19680a = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f19680a;
        ArrayList arrayList = new ArrayList(dVar.f19672y);
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((c) arrayList.get(i6)).a(dVar);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d dVar = this.f19680a;
        ArrayList arrayList = new ArrayList(dVar.f19672y);
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((c) arrayList.get(i6)).b(dVar);
        }
    }
}
