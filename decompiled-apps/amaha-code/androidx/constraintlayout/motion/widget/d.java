package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.motion.widget.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: ViewTransitionController.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final MotionLayout f1746a;

    /* renamed from: c  reason: collision with root package name */
    public HashSet<View> f1748c;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<c.a> f1750e;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<c> f1747b = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final String f1749d = "ViewTransitionController";
    public final ArrayList<c.a> f = new ArrayList<>();

    /* compiled from: ViewTransitionController.java */
    /* loaded from: classes.dex */
    public class a {
    }

    public d(MotionLayout motionLayout) {
        this.f1746a = motionLayout;
    }

    public static void a(c cVar, boolean z10) {
        e sharedValues = ConstraintLayout.getSharedValues();
        int i6 = cVar.f1733u;
        a aVar = new a();
        HashMap<Integer, HashSet<WeakReference<Object>>> hashMap = sharedValues.f3925a;
        HashSet<WeakReference<Object>> hashSet = hashMap.get(Integer.valueOf(i6));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            hashMap.put(Integer.valueOf(i6), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }
}
