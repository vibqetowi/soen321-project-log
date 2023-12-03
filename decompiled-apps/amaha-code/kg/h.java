package kg;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
/* compiled from: InternationalPhoneTextWatcher.java */
/* loaded from: classes.dex */
public final class h implements TextWatcher {
    public final boolean A;

    /* renamed from: v  reason: collision with root package name */
    public boolean f23340v;

    /* renamed from: w  reason: collision with root package name */
    public ds.a f23341w;

    /* renamed from: y  reason: collision with root package name */
    public int f23343y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f23344z;

    /* renamed from: u  reason: collision with root package name */
    public boolean f23339u = false;

    /* renamed from: x  reason: collision with root package name */
    public Editable f23342x = null;

    public h(Context context, String str, int i6, boolean z10) {
        this.f23344z = false;
        if (str != null && str.length() != 0) {
            ds.c a10 = ds.c.a(context);
            this.f23343y = i6;
            ds.a aVar = new ds.a(a10, str);
            this.f23341w = aVar;
            aVar.g();
            Editable editable = this.f23342x;
            if (editable != null) {
                this.f23344z = true;
                String r = ds.c.r(editable);
                Editable editable2 = this.f23342x;
                editable2.replace(0, editable2.length(), r, 0, r.length());
                this.f23344z = false;
            }
            this.A = z10;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final String a(CharSequence charSequence) {
        this.f23341w.g();
        String str = "+" + this.f23343y;
        boolean z10 = this.A;
        if (z10 || (charSequence.length() > 0 && charSequence.charAt(0) != '0')) {
            charSequence = str + ((Object) charSequence);
        }
        int length = charSequence.length();
        String str2 = "";
        char c10 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = charSequence.charAt(i6);
            if (PhoneNumberUtils.isNonSeparator(charAt)) {
                if (c10 != 0) {
                    str2 = this.f23341w.j(c10);
                }
                c10 = charAt;
            }
        }
        if (c10 != 0) {
            str2 = this.f23341w.j(c10);
        }
        String trim = str2.trim();
        if (z10 || charSequence.length() == 0 || charSequence.charAt(0) != '0') {
            if (trim.length() <= str.length()) {
                trim = "";
            } else if (trim.charAt(str.length()) == ' ') {
                trim = trim.substring(str.length() + 1);
            } else {
                trim = trim.substring(str.length());
            }
        }
        if (TextUtils.isEmpty(trim)) {
            return "";
        }
        return trim;
    }

    @Override // android.text.TextWatcher
    public final synchronized void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11 = true;
        if (this.f23340v) {
            if (editable.length() == 0) {
                z11 = false;
            }
            this.f23340v = z11;
        } else if (!this.f23339u) {
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionEnd == editable.length()) {
                z10 = true;
            } else {
                z10 = false;
            }
            String a10 = a(editable);
            if (!a10.equals(editable.toString())) {
                if (z10) {
                    selectionEnd = a10.length();
                } else {
                    int i6 = 0;
                    for (int i10 = 0; i10 < editable.length() && i10 < selectionEnd; i10++) {
                        if (PhoneNumberUtils.isNonSeparator(editable.charAt(i10))) {
                            i6++;
                        }
                    }
                    selectionEnd = 0;
                    int i11 = 0;
                    while (true) {
                        if (selectionEnd < a10.length()) {
                            if (i11 == i6) {
                                break;
                            }
                            if (PhoneNumberUtils.isNonSeparator(a10.charAt(selectionEnd))) {
                                i11++;
                            }
                            selectionEnd++;
                        } else {
                            selectionEnd = 0;
                            break;
                        }
                    }
                }
            }
            if (!z10) {
                while (true) {
                    int i12 = selectionEnd - 1;
                    if (i12 > 0 && !PhoneNumberUtils.isNonSeparator(a10.charAt(i12))) {
                        selectionEnd--;
                    }
                }
            }
            try {
                this.f23339u = true;
                editable.replace(0, editable.length(), a10, 0, a10.length());
                this.f23339u = false;
                this.f23342x = editable;
                Selection.setSelection(editable, selectionEnd);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        boolean z10;
        if (!this.f23339u && !this.f23340v && i10 > 0) {
            int i12 = i6;
            while (true) {
                if (i12 < i6 + i10) {
                    if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i12))) {
                        z10 = true;
                        break;
                    }
                    i12++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10 && !this.f23344z) {
                this.f23340v = true;
                this.f23341w.g();
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        boolean z10;
        if (!this.f23339u && !this.f23340v && i11 > 0) {
            int i12 = i6;
            while (true) {
                if (i12 < i6 + i11) {
                    if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i12))) {
                        z10 = true;
                        break;
                    }
                    i12++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                this.f23340v = true;
                this.f23341w.g();
            }
        }
    }
}
