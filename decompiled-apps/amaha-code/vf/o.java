package vf;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import sf.v;
import sf.w;
import vf.q;
/* compiled from: TreeTypeAdapter.java */
/* loaded from: classes.dex */
public final class o<T> extends v<T> {

    /* renamed from: a  reason: collision with root package name */
    public final sf.q<T> f35031a;

    /* renamed from: b  reason: collision with root package name */
    public final sf.l<T> f35032b;

    /* renamed from: c  reason: collision with root package name */
    public final sf.i f35033c;

    /* renamed from: d  reason: collision with root package name */
    public final TypeToken<T> f35034d;

    /* renamed from: e  reason: collision with root package name */
    public final w f35035e;
    public volatile v<T> f;

    /* compiled from: TreeTypeAdapter.java */
    /* loaded from: classes.dex */
    public final class a {
    }

    public o(sf.q qVar, sf.l lVar, sf.i iVar, TypeToken typeToken) {
        new a();
        this.f35031a = qVar;
        this.f35032b = lVar;
        this.f35033c = iVar;
        this.f35034d = typeToken;
        this.f35035e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    @Override // sf.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T a(yf.a aVar) {
        boolean z10;
        Object obj;
        sf.l<T> lVar = this.f35032b;
        if (lVar == null) {
            v<T> vVar = this.f;
            if (vVar == null) {
                vVar = this.f35033c.e(this.f35035e, this.f35034d);
                this.f = vVar;
            }
            return vVar.a(aVar);
        }
        try {
            try {
                aVar.y0();
            } catch (EOFException e10) {
                e = e10;
                z10 = true;
            }
            try {
                q.f35062z.getClass();
                obj = q.t.c(aVar);
            } catch (EOFException e11) {
                e = e11;
                z10 = false;
                if (z10) {
                    obj = sf.n.f31510u;
                    obj.getClass();
                    if (!(obj instanceof sf.n)) {
                    }
                } else {
                    throw new JsonSyntaxException(e);
                }
            }
            obj.getClass();
            if (!(obj instanceof sf.n)) {
                return null;
            }
            this.f35034d.getType();
            return (T) lVar.a();
        } catch (MalformedJsonException e12) {
            throw new JsonSyntaxException(e12);
        } catch (IOException e13) {
            throw new JsonIOException(e13);
        } catch (NumberFormatException e14) {
            throw new JsonSyntaxException(e14);
        }
    }

    @Override // sf.v
    public final void b(yf.b bVar, T t3) {
        sf.q<T> qVar = this.f35031a;
        if (qVar == null) {
            v<T> vVar = this.f;
            if (vVar == null) {
                vVar = this.f35033c.e(this.f35035e, this.f35034d);
                this.f = vVar;
            }
            vVar.b(bVar, t3);
        } else if (t3 == null) {
            bVar.G();
        } else {
            this.f35034d.getType();
            q.f35062z.b(bVar, qVar.a());
        }
    }
}
