package a5;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.LinearLayoutManager;
import d5.j;
/* compiled from: CustomTarget.java */
/* loaded from: classes.dex */
public abstract class c<T> implements h<T> {

    /* renamed from: u  reason: collision with root package name */
    public final int f307u;

    /* renamed from: v  reason: collision with root package name */
    public final int f308v;

    /* renamed from: w  reason: collision with root package name */
    public z4.b f309w;

    public c() {
        if (j.f(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET)) {
            this.f307u = LinearLayoutManager.INVALID_OFFSET;
            this.f308v = LinearLayoutManager.INVALID_OFFSET;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    @Override // a5.h
    public final void c(z4.h hVar) {
        this.f309w = hVar;
    }

    @Override // a5.h
    public final void e(g gVar) {
        gVar.a(this.f307u, this.f308v);
    }

    @Override // a5.h
    public final z4.b l() {
        return this.f309w;
    }

    @Override // w4.g
    public final void g() {
    }

    @Override // w4.g
    public final void i() {
    }

    @Override // w4.g
    public final void n() {
    }

    @Override // a5.h
    public final void h(Drawable drawable) {
    }

    @Override // a5.h
    public final void j(g gVar) {
    }

    @Override // a5.h
    public final void k(Drawable drawable) {
    }
}
