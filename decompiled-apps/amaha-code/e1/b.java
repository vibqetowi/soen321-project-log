package e1;

import android.text.Editable;
import androidx.emoji2.text.p;
/* compiled from: EmojiEditableFactory.java */
/* loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f13702a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile b f13703b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f13704c;

    public b() {
        try {
            f13704c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f13704c;
        if (cls != null) {
            return new p(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
