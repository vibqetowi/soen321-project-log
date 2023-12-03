package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
/* compiled from: FragmentAnim.java */
/* loaded from: classes.dex */
public final class q {
    public static int a(int i6, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i6});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f2263a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f2264b;

        public a(Animation animation) {
            this.f2263a = animation;
            this.f2264b = null;
        }

        public a(Animator animator) {
            this.f2263a = null;
            this.f2264b = animator;
        }
    }

    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final ViewGroup f2265u;

        /* renamed from: v  reason: collision with root package name */
        public final View f2266v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f2267w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f2268x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f2269y;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2269y = true;
            this.f2265u = viewGroup;
            this.f2266v = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j10, Transformation transformation) {
            this.f2269y = true;
            if (this.f2267w) {
                return !this.f2268x;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f2267w = true;
                t0.w.a(this.f2265u, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10 = this.f2267w;
            ViewGroup viewGroup = this.f2265u;
            if (!z10 && this.f2269y) {
                this.f2269y = false;
                viewGroup.post(this);
                return;
            }
            viewGroup.endViewTransition(this.f2266v);
            this.f2268x = true;
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j10, Transformation transformation, float f) {
            this.f2269y = true;
            if (this.f2267w) {
                return !this.f2268x;
            }
            if (!super.getTransformation(j10, transformation, f)) {
                this.f2267w = true;
                t0.w.a(this.f2265u, this);
            }
            return true;
        }
    }
}
