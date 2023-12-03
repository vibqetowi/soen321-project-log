package e1;

import android.widget.EditText;
/* compiled from: EmojiEditTextHelper.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0213a f13699a;

    /* compiled from: EmojiEditTextHelper.java */
    /* renamed from: e1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0213a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final EditText f13700a;

        /* renamed from: b  reason: collision with root package name */
        public final g f13701b;

        public C0213a(EditText editText) {
            this.f13700a = editText;
            g gVar = new g(editText);
            this.f13701b = gVar;
            editText.addTextChangedListener(gVar);
            if (e1.b.f13703b == null) {
                synchronized (e1.b.f13702a) {
                    if (e1.b.f13703b == null) {
                        e1.b.f13703b = new e1.b();
                    }
                }
            }
            editText.setEditableFactory(e1.b.f13703b);
        }
    }

    /* compiled from: EmojiEditTextHelper.java */
    /* loaded from: classes.dex */
    public static class b {
    }

    public a(EditText editText) {
        if (editText != null) {
            this.f13699a = new C0213a(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }
}
