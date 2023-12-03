package androidx.emoji2.text;

import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.f;
import androidx.emoji2.text.o;
import j0.f;
/* compiled from: EmojiProcessor.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final f.i f2060a;

    /* renamed from: b  reason: collision with root package name */
    public final o f2061b;

    /* renamed from: c  reason: collision with root package name */
    public final f.d f2062c;

    /* compiled from: EmojiProcessor.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2063a = 1;

        /* renamed from: b  reason: collision with root package name */
        public final o.a f2064b;

        /* renamed from: c  reason: collision with root package name */
        public o.a f2065c;

        /* renamed from: d  reason: collision with root package name */
        public o.a f2066d;

        /* renamed from: e  reason: collision with root package name */
        public int f2067e;
        public int f;

        public a(o.a aVar) {
            this.f2064b = aVar;
            this.f2065c = aVar;
        }

        public final int a(int i6) {
            o.a aVar;
            boolean z10;
            SparseArray<o.a> sparseArray = this.f2065c.f2086a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(i6);
            }
            int i10 = 2;
            if (this.f2063a != 2) {
                if (aVar == null) {
                    b();
                    i10 = 1;
                } else {
                    this.f2063a = 2;
                    this.f2065c = aVar;
                    this.f = 1;
                }
            } else if (aVar != null) {
                this.f2065c = aVar;
                this.f++;
            } else {
                boolean z11 = false;
                if (i6 == 65038) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    b();
                } else {
                    if (i6 == 65039) {
                        z11 = true;
                    }
                    if (!z11) {
                        o.a aVar2 = this.f2065c;
                        if (aVar2.f2087b != null) {
                            if (this.f == 1) {
                                if (c()) {
                                    this.f2066d = this.f2065c;
                                    b();
                                } else {
                                    b();
                                }
                            } else {
                                this.f2066d = aVar2;
                                b();
                            }
                            i10 = 3;
                        } else {
                            b();
                        }
                    }
                }
                i10 = 1;
            }
            this.f2067e = i6;
            return i10;
        }

        public final void b() {
            this.f2063a = 1;
            this.f2065c = this.f2064b;
            this.f = 0;
        }

        public final boolean c() {
            boolean z10;
            boolean z11;
            d1.a c10 = this.f2065c.f2087b.c();
            int a10 = c10.a(6);
            if (a10 != 0 && c10.f12130b.get(a10 + c10.f12129a) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
            if (this.f2067e == 65039) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return false;
            }
            return true;
        }
    }

    public j(o oVar, f.i iVar, d dVar) {
        this.f2060a = iVar;
        this.f2061b = oVar;
        this.f2062c = dVar;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        boolean z11;
        k[] kVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 && (kVarArr = (k[]) editable.getSpans(selectionStart, selectionEnd, k.class)) != null && kVarArr.length > 0) {
            for (k kVar : kVarArr) {
                int spanStart = editable.getSpanStart(kVar);
                int spanEnd = editable.getSpanEnd(kVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
        if (r6 >= r7) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(CharSequence charSequence, int i6, int i10, i iVar) {
        short s10;
        boolean z10;
        int i11;
        if (iVar.f2059c == 0) {
            f.d dVar = this.f2062c;
            d1.a c10 = iVar.c();
            int a10 = c10.a(8);
            if (a10 != 0) {
                s10 = c10.f12130b.getShort(a10 + c10.f12129a);
            } else {
                s10 = 0;
            }
            d dVar2 = (d) dVar;
            dVar2.getClass();
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 23 || s10 <= i12) {
                ThreadLocal<StringBuilder> threadLocal = d.f2030b;
                if (threadLocal.get() == null) {
                    threadLocal.set(new StringBuilder());
                }
                StringBuilder sb2 = threadLocal.get();
                sb2.setLength(0);
                while (i6 < i10) {
                    sb2.append(charSequence.charAt(i6));
                    i6++;
                }
                TextPaint textPaint = dVar2.f2031a;
                String sb3 = sb2.toString();
                ThreadLocal<s0.c<Rect, Rect>> threadLocal2 = j0.f.f21627a;
                if (Build.VERSION.SDK_INT >= 23) {
                    z10 = f.a.a(textPaint, sb3);
                } else {
                    int length = sb3.length();
                    if (length != 1 || !Character.isWhitespace(sb3.charAt(0))) {
                        float measureText = textPaint.measureText("\udfffd");
                        float measureText2 = textPaint.measureText("m");
                        float measureText3 = textPaint.measureText(sb3);
                        float f = 0.0f;
                        if (measureText3 != 0.0f) {
                            if (sb3.codePointCount(0, sb3.length()) > 1) {
                                if (measureText3 <= measureText2 * 2.0f) {
                                    int i13 = 0;
                                    while (i13 < length) {
                                        int charCount = Character.charCount(sb3.codePointAt(i13)) + i13;
                                        f += textPaint.measureText(sb3, i13, charCount);
                                        i13 = charCount;
                                    }
                                }
                            }
                            if (measureText3 == measureText) {
                                ThreadLocal<s0.c<Rect, Rect>> threadLocal3 = j0.f.f21627a;
                                s0.c<Rect, Rect> cVar = threadLocal3.get();
                                if (cVar == null) {
                                    cVar = new s0.c<>(new Rect(), new Rect());
                                    threadLocal3.set(cVar);
                                } else {
                                    cVar.f31064a.setEmpty();
                                    cVar.f31065b.setEmpty();
                                }
                                Rect rect = cVar.f31064a;
                                textPaint.getTextBounds("\udfffd", 0, 2, rect);
                                Rect rect2 = cVar.f31065b;
                                textPaint.getTextBounds(sb3, 0, length, rect2);
                                z10 = !rect.equals(rect2);
                            }
                        }
                    }
                    z10 = true;
                }
                if (!z10) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                iVar.f2059c = i11;
            }
            z10 = false;
            if (!z10) {
            }
            iVar.f2059c = i11;
        }
        if (iVar.f2059c != 2) {
            return false;
        }
        return true;
    }
}
