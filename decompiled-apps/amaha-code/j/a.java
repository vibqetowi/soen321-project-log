package j;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;
/* compiled from: AllCapsTransformationMethod.java */
/* loaded from: classes.dex */
public final class a implements TransformationMethod {

    /* renamed from: u  reason: collision with root package name */
    public final Locale f21618u;

    public a(Context context) {
        this.f21618u = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f21618u);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i6, Rect rect) {
    }
}
