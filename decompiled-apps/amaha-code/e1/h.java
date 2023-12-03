package e1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
/* compiled from: EmojiTransformationMethod.java */
/* loaded from: classes.dex */
public final class h implements TransformationMethod {

    /* renamed from: u  reason: collision with root package name */
    public final TransformationMethod f13723u;

    public h(TransformationMethod transformationMethod) {
        this.f13723u = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f13723u;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && androidx.emoji2.text.f.a().b() == 1) {
            androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
            a10.getClass();
            return a10.f(0, charSequence.length(), charSequence);
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i6, Rect rect) {
        TransformationMethod transformationMethod = this.f13723u;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i6, rect);
        }
    }
}
