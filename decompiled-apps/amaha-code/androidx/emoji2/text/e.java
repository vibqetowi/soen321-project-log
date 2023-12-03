package androidx.emoji2.text;

import androidx.emoji2.text.f;
/* compiled from: EmojiCompat.java */
/* loaded from: classes.dex */
public final class e extends f.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.a f2032a;

    public e(f.a aVar) {
        this.f2032a = aVar;
    }

    @Override // androidx.emoji2.text.f.h
    public final void a(Throwable th2) {
        this.f2032a.f2044a.d(th2);
    }

    @Override // androidx.emoji2.text.f.h
    public final void b(o oVar) {
        f.a aVar = this.f2032a;
        aVar.f2043c = oVar;
        aVar.f2042b = new j(aVar.f2043c, new f.i(), aVar.f2044a.f2041h);
        aVar.f2044a.e();
    }
}
