package e1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.f;
import java.lang.ref.WeakReference;
/* compiled from: EmojiInputFilter.java */
/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f13707a;

    /* renamed from: b  reason: collision with root package name */
    public a f13708b;

    /* compiled from: EmojiInputFilter.java */
    /* loaded from: classes.dex */
    public static class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f13709a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference f13710b;

        public a(TextView textView, d dVar) {
            this.f13709a = new WeakReference(textView);
            this.f13710b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.f.e
        public final void b() {
            boolean z10;
            int length;
            InputFilter[] filters;
            TextView textView = (TextView) this.f13709a.get();
            InputFilter inputFilter = (InputFilter) this.f13710b.get();
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                for (InputFilter inputFilter2 : filters) {
                    if (inputFilter2 == inputFilter) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (z10 && textView.isAttachedToWindow()) {
                CharSequence text = textView.getText();
                androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
                if (text == null) {
                    length = 0;
                } else {
                    a10.getClass();
                    length = text.length();
                }
                CharSequence f = a10.f(0, length, text);
                if (text == f) {
                    return;
                }
                int selectionStart = Selection.getSelectionStart(f);
                int selectionEnd = Selection.getSelectionEnd(f);
                textView.setText(f);
                if (f instanceof Spannable) {
                    Spannable spannable = (Spannable) f;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public d(TextView textView) {
        this.f13707a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i6, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f13707a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b10 = androidx.emoji2.text.f.a().b();
        if (b10 != 0) {
            boolean z10 = true;
            if (b10 != 1) {
                if (b10 != 3) {
                    return charSequence;
                }
            } else {
                if (i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == textView.getText()) {
                    z10 = false;
                }
                if (z10 && charSequence != null) {
                    if (i6 != 0 || i10 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i6, i10);
                    }
                    return androidx.emoji2.text.f.a().f(0, charSequence.length(), charSequence);
                }
                return charSequence;
            }
        }
        androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
        if (this.f13708b == null) {
            this.f13708b = new a(textView, this);
        }
        a10.g(this.f13708b);
        return charSequence;
    }
}
