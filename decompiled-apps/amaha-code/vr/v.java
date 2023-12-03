package vr;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;
/* compiled from: CompositeReadableBuffer.java */
/* loaded from: classes2.dex */
public final class v extends vr.c {

    /* renamed from: u  reason: collision with root package name */
    public final ArrayDeque f36007u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayDeque f36008v;

    /* renamed from: w  reason: collision with root package name */
    public int f36009w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f36010x;

    /* renamed from: y  reason: collision with root package name */
    public static final a f36005y = new a();

    /* renamed from: z  reason: collision with root package name */
    public static final b f36006z = new b();
    public static final c A = new c();
    public static final d B = new d();
    public static final e C = new e();

    /* compiled from: CompositeReadableBuffer.java */
    /* loaded from: classes2.dex */
    public class a implements f<Void> {
        @Override // vr.v.g
        public final int a(r2 r2Var, int i6, Object obj, int i10) {
            Void r32 = (Void) obj;
            return r2Var.readUnsignedByte();
        }
    }

    /* compiled from: CompositeReadableBuffer.java */
    /* loaded from: classes2.dex */
    public class b implements f<Void> {
        @Override // vr.v.g
        public final int a(r2 r2Var, int i6, Object obj, int i10) {
            Void r32 = (Void) obj;
            r2Var.skipBytes(i6);
            return 0;
        }
    }

    /* compiled from: CompositeReadableBuffer.java */
    /* loaded from: classes2.dex */
    public class c implements f<byte[]> {
        @Override // vr.v.g
        public final int a(r2 r2Var, int i6, Object obj, int i10) {
            r2Var.K(i10, (byte[]) obj, i6);
            return i10 + i6;
        }
    }

    /* compiled from: CompositeReadableBuffer.java */
    /* loaded from: classes2.dex */
    public class d implements f<ByteBuffer> {
        @Override // vr.v.g
        public final int a(r2 r2Var, int i6, Object obj, int i10) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i6);
            r2Var.D0(byteBuffer);
            byteBuffer.limit(limit);
            return 0;
        }
    }

    /* compiled from: CompositeReadableBuffer.java */
    /* loaded from: classes2.dex */
    public class e implements g<OutputStream> {
        @Override // vr.v.g
        public final int a(r2 r2Var, int i6, OutputStream outputStream, int i10) {
            r2Var.r0(outputStream, i6);
            return 0;
        }
    }

    /* compiled from: CompositeReadableBuffer.java */
    /* loaded from: classes2.dex */
    public interface f<T> extends g<T> {
    }

    /* compiled from: CompositeReadableBuffer.java */
    /* loaded from: classes2.dex */
    public interface g<T> {
        int a(r2 r2Var, int i6, T t3, int i10);
    }

    public v(int i6) {
        this.f36007u = new ArrayDeque(i6);
    }

    @Override // vr.r2
    public final void D0(ByteBuffer byteBuffer) {
        j(B, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // vr.r2
    public final void K(int i6, byte[] bArr, int i10) {
        j(A, i10, bArr, i6);
    }

    @Override // vr.c, vr.r2
    public final void a0() {
        ArrayDeque arrayDeque = this.f36008v;
        ArrayDeque arrayDeque2 = this.f36007u;
        if (arrayDeque == null) {
            this.f36008v = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.f36008v.isEmpty()) {
            ((r2) this.f36008v.remove()).close();
        }
        this.f36010x = true;
        r2 r2Var = (r2) arrayDeque2.peek();
        if (r2Var != null) {
            r2Var.a0();
        }
    }

    @Override // vr.r2
    public final int b() {
        return this.f36009w;
    }

    @Override // vr.c, vr.r2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            ArrayDeque arrayDeque = this.f36007u;
            if (arrayDeque.isEmpty()) {
                break;
            }
            ((r2) arrayDeque.remove()).close();
        }
        if (this.f36008v != null) {
            while (!this.f36008v.isEmpty()) {
                ((r2) this.f36008v.remove()).close();
            }
        }
    }

    public final void e(r2 r2Var) {
        boolean z10;
        boolean z11 = this.f36010x;
        ArrayDeque arrayDeque = this.f36007u;
        if (z11 && arrayDeque.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!(r2Var instanceof v)) {
            arrayDeque.add(r2Var);
            this.f36009w = r2Var.b() + this.f36009w;
        } else {
            v vVar = (v) r2Var;
            while (!vVar.f36007u.isEmpty()) {
                arrayDeque.add((r2) vVar.f36007u.remove());
            }
            this.f36009w += vVar.f36009w;
            vVar.f36009w = 0;
            vVar.close();
        }
        if (z10) {
            ((r2) arrayDeque.peek()).a0();
        }
    }

    public final void g() {
        boolean z10 = this.f36010x;
        ArrayDeque arrayDeque = this.f36007u;
        if (z10) {
            this.f36008v.add((r2) arrayDeque.remove());
            r2 r2Var = (r2) arrayDeque.peek();
            if (r2Var != null) {
                r2Var.a0();
                return;
            }
            return;
        }
        ((r2) arrayDeque.remove()).close();
    }

    public final <T> int h(g<T> gVar, int i6, T t3, int i10) {
        a(i6);
        ArrayDeque arrayDeque = this.f36007u;
        if (!arrayDeque.isEmpty() && ((r2) arrayDeque.peek()).b() == 0) {
            g();
        }
        while (i6 > 0 && !arrayDeque.isEmpty()) {
            r2 r2Var = (r2) arrayDeque.peek();
            int min = Math.min(i6, r2Var.b());
            i10 = gVar.a(r2Var, min, t3, i10);
            i6 -= min;
            this.f36009w -= min;
            if (((r2) arrayDeque.peek()).b() == 0) {
                g();
            }
        }
        if (i6 <= 0) {
            return i10;
        }
        throw new AssertionError("Failed executing read operation");
    }

    public final <T> int j(f<T> fVar, int i6, T t3, int i10) {
        try {
            return h(fVar, i6, t3, i10);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // vr.c, vr.r2
    public final boolean markSupported() {
        Iterator it = this.f36007u.iterator();
        while (it.hasNext()) {
            if (!((r2) it.next()).markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // vr.r2
    public final void r0(OutputStream outputStream, int i6) {
        h(C, i6, outputStream, 0);
    }

    @Override // vr.r2
    public final int readUnsignedByte() {
        return j(f36005y, 1, null, 0);
    }

    @Override // vr.c, vr.r2
    public final void reset() {
        if (this.f36010x) {
            ArrayDeque arrayDeque = this.f36007u;
            r2 r2Var = (r2) arrayDeque.peek();
            if (r2Var != null) {
                int b10 = r2Var.b();
                r2Var.reset();
                this.f36009w = (r2Var.b() - b10) + this.f36009w;
            }
            while (true) {
                r2 r2Var2 = (r2) this.f36008v.pollLast();
                if (r2Var2 != null) {
                    r2Var2.reset();
                    arrayDeque.addFirst(r2Var2);
                    this.f36009w = r2Var2.b() + this.f36009w;
                } else {
                    return;
                }
            }
        } else {
            throw new InvalidMarkException();
        }
    }

    @Override // vr.r2
    public final void skipBytes(int i6) {
        j(f36006z, i6, null, 0);
    }

    @Override // vr.r2
    public final r2 y(int i6) {
        r2 r2Var;
        int i10;
        r2 r2Var2;
        if (i6 <= 0) {
            return s2.f35952a;
        }
        a(i6);
        this.f36009w -= i6;
        v vVar = null;
        v vVar2 = null;
        while (true) {
            ArrayDeque arrayDeque = this.f36007u;
            r2 r2Var3 = (r2) arrayDeque.peek();
            int b10 = r2Var3.b();
            if (b10 > i6) {
                r2Var2 = r2Var3.y(i6);
                i10 = 0;
            } else {
                if (this.f36010x) {
                    r2Var = r2Var3.y(b10);
                    g();
                } else {
                    r2Var = (r2) arrayDeque.poll();
                }
                r2 r2Var4 = r2Var;
                i10 = i6 - b10;
                r2Var2 = r2Var4;
            }
            if (vVar == null) {
                vVar = r2Var2;
            } else {
                if (vVar2 == null) {
                    int i11 = 2;
                    if (i10 != 0) {
                        i11 = Math.min(arrayDeque.size() + 2, 16);
                    }
                    vVar2 = new v(i11);
                    vVar2.e(vVar);
                    vVar = vVar2;
                }
                vVar2.e(r2Var2);
            }
            if (i10 <= 0) {
                return vVar;
            }
            i6 = i10;
        }
    }

    public v() {
        this.f36007u = new ArrayDeque();
    }
}
