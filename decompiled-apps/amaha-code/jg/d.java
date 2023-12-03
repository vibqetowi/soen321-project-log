package jg;

import androidx.recyclerview.widget.k;
import di.l;
/* compiled from: QRCode.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22018a;

    /* renamed from: b  reason: collision with root package name */
    public int f22019b;

    /* renamed from: c  reason: collision with root package name */
    public Object f22020c;

    /* renamed from: d  reason: collision with root package name */
    public Object f22021d;

    /* renamed from: e  reason: collision with root package name */
    public Object f22022e;
    public Object f;

    public d(String str, l lVar, String str2) {
        this.f22018a = 1;
        this.f22020c = str;
        this.f22021d = lVar;
        this.f22022e = str2;
        this.f = "ANDROID";
        this.f22019b = di.b.n();
    }

    public String toString() {
        switch (this.f22018a) {
            case 0:
                StringBuilder sb2 = new StringBuilder((int) k.d.DEFAULT_DRAG_ANIMATION_DURATION);
                sb2.append("<<\n mode: ");
                sb2.append((ig.b) this.f22020c);
                sb2.append("\n ecLevel: ");
                sb2.append((ig.a) this.f22021d);
                sb2.append("\n version: ");
                sb2.append((ig.c) this.f22022e);
                sb2.append("\n maskPattern: ");
                sb2.append(this.f22019b);
                if (((b) this.f) == null) {
                    sb2.append("\n matrix: null\n");
                } else {
                    sb2.append("\n matrix:\n");
                    sb2.append((b) this.f);
                }
                sb2.append(">>\n");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(d dVar) {
        this((String) dVar.f22020c, (l) dVar.f22021d, (String) dVar.f22022e);
        this.f22018a = 1;
    }
}
