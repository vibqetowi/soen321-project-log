package qb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
/* compiled from: TextScale.java */
/* loaded from: classes.dex */
public final class r extends h2.k {

    /* compiled from: TextScale.java */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f29508a;

        public a(TextView textView) {
            this.f29508a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TextView textView = this.f29508a;
            textView.setScaleX(floatValue);
            textView.setScaleY(floatValue);
        }
    }

    @Override // h2.k
    public final void d(h2.r rVar) {
        View view = rVar.f17069b;
        if (view instanceof TextView) {
            rVar.f17068a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // h2.k
    public final void h(h2.r rVar) {
        View view = rVar.f17069b;
        if (view instanceof TextView) {
            rVar.f17068a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // h2.k
    public final Animator l(ViewGroup viewGroup, h2.r rVar, h2.r rVar2) {
        float f;
        if (rVar == null || rVar2 == null || !(rVar.f17069b instanceof TextView)) {
            return null;
        }
        View view = rVar2.f17069b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = rVar.f17068a;
        HashMap hashMap2 = rVar2.f17068a;
        float f2 = 1.0f;
        if (hashMap.get("android:textscale:scale") != null) {
            f = ((Float) hashMap.get("android:textscale:scale")).floatValue();
        } else {
            f = 1.0f;
        }
        if (hashMap2.get("android:textscale:scale") != null) {
            f2 = ((Float) hashMap2.get("android:textscale:scale")).floatValue();
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new a(textView));
        return ofFloat;
    }
}
