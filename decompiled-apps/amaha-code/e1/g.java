package e1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import java.lang.ref.WeakReference;
/* compiled from: EmojiTextWatcher.java */
/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final EditText f13718u;

    /* renamed from: w  reason: collision with root package name */
    public a f13720w;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f13719v = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f13721x = true;

    /* compiled from: EmojiTextWatcher.java */
    /* loaded from: classes.dex */
    public static class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f13722a;

        public a(EditText editText) {
            this.f13722a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.f.e
        public final void b() {
            g.a((EditText) this.f13722a.get(), 1);
        }
    }

    public g(EditText editText) {
        this.f13718u = editText;
    }

    public static void a(EditText editText, int i6) {
        int length;
        if (i6 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
            if (editableText == null) {
                length = 0;
            } else {
                a10.getClass();
                length = editableText.length();
            }
            a10.f(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r1 == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        boolean z10;
        int b10;
        boolean z11;
        EditText editText = this.f13718u;
        if (!editText.isInEditMode()) {
            if (this.f13721x) {
                z10 = false;
                if (!this.f13719v) {
                    if (androidx.emoji2.text.f.f2034j != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (!z10 && i10 <= i11 && (charSequence instanceof Spannable)) {
                    b10 = androidx.emoji2.text.f.a().b();
                    if (b10 != 0) {
                        if (b10 != 1) {
                            if (b10 != 3) {
                                return;
                            }
                        } else {
                            androidx.emoji2.text.f.a().f(i6, i11 + i6, (Spannable) charSequence);
                            return;
                        }
                    }
                    androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
                    if (this.f13720w == null) {
                        this.f13720w = new a(editText);
                    }
                    a10.g(this.f13720w);
                }
                return;
            }
            z10 = true;
            if (!z10) {
                b10 = androidx.emoji2.text.f.a().b();
                if (b10 != 0) {
                }
                androidx.emoji2.text.f a102 = androidx.emoji2.text.f.a();
                if (this.f13720w == null) {
                }
                a102.g(this.f13720w);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}
