package xs;

import java.util.Iterator;
/* compiled from: Progressions.kt */
/* loaded from: classes2.dex */
public class a implements Iterable<Character>, ts.a {

    /* renamed from: u  reason: collision with root package name */
    public final char f37989u;

    /* renamed from: v  reason: collision with root package name */
    public final char f37990v;

    /* renamed from: w  reason: collision with root package name */
    public final int f37991w = 1;

    public a(char c10, char c11) {
        this.f37989u = c10;
        this.f37990v = (char) sp.b.F(c10, c11, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new b(this.f37989u, this.f37990v, this.f37991w);
    }
}
