package y8;

import c9.q;
import c9.w;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import p8.a;
import y8.e;
/* compiled from: Mp4WebvttDecoder.java */
/* loaded from: classes.dex */
public final class a extends p8.e {

    /* renamed from: m  reason: collision with root package name */
    public final q f38336m = new q();

    @Override // p8.e
    public final p8.f h(byte[] bArr, int i6, boolean z10) {
        p8.a a10;
        q qVar = this.f38336m;
        qVar.y(bArr, i6);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i10 = qVar.f5188c - qVar.f5187b;
            if (i10 > 0) {
                if (i10 >= 8) {
                    int c10 = qVar.c();
                    if (qVar.c() == 1987343459) {
                        int i11 = c10 - 8;
                        CharSequence charSequence = null;
                        a.C0467a c0467a = null;
                        while (i11 > 0) {
                            if (i11 >= 8) {
                                int c11 = qVar.c();
                                int c12 = qVar.c();
                                int i12 = c11 - 8;
                                String l2 = w.l(qVar.f5187b, qVar.f5186a, i12);
                                qVar.B(i12);
                                i11 = (i11 - 8) - i12;
                                if (c12 == 1937011815) {
                                    e.d dVar = new e.d();
                                    e.e(l2, dVar);
                                    c0467a = dVar.a();
                                } else if (c12 == 1885436268) {
                                    charSequence = e.f(null, l2.trim(), Collections.emptyList());
                                }
                            } else {
                                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
                            }
                        }
                        if (charSequence == null) {
                            charSequence = "";
                        }
                        if (c0467a != null) {
                            c0467a.f27989a = charSequence;
                            a10 = c0467a.a();
                        } else {
                            Pattern pattern = e.f38360a;
                            e.d dVar2 = new e.d();
                            dVar2.f38375c = charSequence;
                            a10 = dVar2.a().a();
                        }
                        arrayList.add(a10);
                    } else {
                        qVar.B(c10 - 8);
                    }
                } else {
                    throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
                }
            } else {
                return new q8.d(arrayList);
            }
        }
    }
}
