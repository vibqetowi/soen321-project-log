package e1;

import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.f;
import androidx.emoji2.text.k;
/* compiled from: EmojiInputConnection.java */
/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f13705a;

    /* renamed from: b  reason: collision with root package name */
    public final a f13706b;

    /* compiled from: EmojiInputConnection.java */
    /* loaded from: classes.dex */
    public static class a {
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0050, code lost:
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0080, code lost:
            if (r11 != false) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x008d, code lost:
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L67;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean a(InputConnection inputConnection, Editable editable, int i6, int i10, boolean z10) {
            boolean z11;
            int min;
            Object obj = androidx.emoji2.text.f.f2033i;
            if (editable == null || inputConnection == null || i6 < 0 || i10 < 0) {
                return false;
            }
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                return false;
            }
            if (z10) {
                int max = Math.max(i6, 0);
                int length = editable.length();
                if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                    loop0: while (true) {
                        boolean z12 = false;
                        while (true) {
                            if (max == 0) {
                                break loop0;
                            }
                            selectionStart--;
                            if (selectionStart < 0) {
                                if (!z12) {
                                    selectionStart = 0;
                                }
                            } else {
                                char charAt = editable.charAt(selectionStart);
                                if (z12) {
                                    break;
                                } else if (!Character.isSurrogate(charAt)) {
                                    max--;
                                } else if (Character.isHighSurrogate(charAt)) {
                                    break loop0;
                                } else {
                                    z12 = true;
                                }
                            }
                        }
                        max--;
                    }
                }
                selectionStart = -1;
                int max2 = Math.max(i10, 0);
                min = editable.length();
                if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                    loop2: while (true) {
                        boolean z13 = false;
                        while (true) {
                            if (max2 == 0) {
                                min = selectionEnd;
                                break loop2;
                            } else if (selectionEnd < min) {
                                char charAt2 = editable.charAt(selectionEnd);
                                if (z13) {
                                    break;
                                } else if (!Character.isSurrogate(charAt2)) {
                                    max2--;
                                    selectionEnd++;
                                } else if (Character.isLowSurrogate(charAt2)) {
                                    break loop2;
                                } else {
                                    selectionEnd++;
                                    z13 = true;
                                }
                            }
                        }
                        max2--;
                        selectionEnd++;
                    }
                }
                min = -1;
                if (selectionStart == -1 || min == -1) {
                    return false;
                }
            } else {
                selectionStart = Math.max(selectionStart - i6, 0);
                min = Math.min(selectionEnd + i10, editable.length());
            }
            k[] kVarArr = (k[]) editable.getSpans(selectionStart, min, k.class);
            if (kVarArr == null || kVarArr.length <= 0) {
                return false;
            }
            for (k kVar : kVarArr) {
                int spanStart = editable.getSpanStart(kVar);
                int spanEnd = editable.getSpanEnd(kVar);
                selectionStart = Math.min(spanStart, selectionStart);
                min = Math.max(spanEnd, min);
            }
            int max3 = Math.max(selectionStart, 0);
            int min2 = Math.min(min, editable.length());
            inputConnection.beginBatchEdit();
            editable.delete(max3, min2);
            inputConnection.endBatchEdit();
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        boolean z10;
        int i6;
        a aVar = new a();
        this.f13705a = editText;
        this.f13706b = aVar;
        if (androidx.emoji2.text.f.f2034j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
            if ((a10.b() == 1) && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                f.a aVar2 = a10.f2039e;
                aVar2.getClass();
                Bundle bundle = editorInfo.extras;
                d1.b bVar = aVar2.f2043c.f2082a;
                int a11 = bVar.a(4);
                if (a11 != 0) {
                    i6 = bVar.f12130b.getInt(a11 + bVar.f12129a);
                } else {
                    i6 = 0;
                }
                bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i6);
                Bundle bundle2 = editorInfo.extras;
                aVar2.f2044a.getClass();
                bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i6, int i10) {
        Editable editableText = this.f13705a.getEditableText();
        this.f13706b.getClass();
        if (!a.a(this, editableText, i6, i10, false) && !super.deleteSurroundingText(i6, i10)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i6, int i10) {
        Editable editableText = this.f13705a.getEditableText();
        this.f13706b.getClass();
        if (a.a(this, editableText, i6, i10, true) || super.deleteSurroundingTextInCodePoints(i6, i10)) {
            return true;
        }
        return false;
    }
}
