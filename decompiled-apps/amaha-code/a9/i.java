package a9;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.recyclerview.widget.LinearLayoutManager;
import p8.a;
/* compiled from: SubtitleViewUtils.java */
/* loaded from: classes.dex */
public final class i {
    public static void a(a.C0467a c0467a) {
        Object[] spans;
        boolean z10;
        c0467a.f27998k = -3.4028235E38f;
        c0467a.f27997j = LinearLayoutManager.INVALID_OFFSET;
        CharSequence charSequence = c0467a.f27989a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                c0467a.f27989a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = c0467a.f27989a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if (!(obj instanceof AbsoluteSizeSpan) && !(obj instanceof RelativeSizeSpan)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float b(float f, int i6, int i10, int i11) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i10;
        } else {
            f2 = i11;
        }
        return f * f2;
    }
}
