package com.bumptech.glide.load.engine;

import android.util.Log;
import h4.e;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class GlideException extends Exception {

    /* renamed from: z  reason: collision with root package name */
    public static final StackTraceElement[] f5967z = new StackTraceElement[0];

    /* renamed from: u  reason: collision with root package name */
    public final List<Throwable> f5968u;

    /* renamed from: v  reason: collision with root package name */
    public e f5969v;

    /* renamed from: w  reason: collision with root package name */
    public h4.a f5970w;

    /* renamed from: x  reason: collision with root package name */
    public Class<?> f5971x;

    /* renamed from: y  reason: collision with root package name */
    public final String f5972y;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th2, ArrayList arrayList) {
        if (th2 instanceof GlideException) {
            for (Throwable th3 : ((GlideException) th2).f5968u) {
                a(th3, arrayList);
            }
            return;
        }
        arrayList.add(th2);
    }

    public static void b(List list, a aVar) {
        try {
            c(list, aVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List list, a aVar) {
        int size = list.size();
        int i6 = 0;
        while (i6 < size) {
            aVar.append("Cause (");
            int i10 = i6 + 1;
            aVar.append(String.valueOf(i10));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th2 = (Throwable) list.get(i6);
            if (th2 instanceof GlideException) {
                ((GlideException) th2).f(aVar);
            } else {
                d(th2, aVar);
            }
            i6 = i10;
        }
    }

    public static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            StringBuilder sb2 = new StringBuilder("Root cause (");
            int i10 = i6 + 1;
            sb2.append(i10);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i("Glide", sb2.toString(), (Throwable) arrayList.get(i6));
            i6 = i10;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f5968u, new a(appendable));
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f5972y);
        String str3 = "";
        if (this.f5971x == null) {
            str = "";
        } else {
            str = ", " + this.f5971x;
        }
        sb2.append(str);
        if (this.f5970w == null) {
            str2 = "";
        } else {
            str2 = ", " + this.f5970w;
        }
        sb2.append(str2);
        if (this.f5969v != null) {
            str3 = ", " + this.f5969v;
        }
        sb2.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        f(System.err);
    }

    public GlideException(String str, List<Throwable> list) {
        this.f5972y = str;
        setStackTrace(f5967z);
        this.f5968u = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }

    /* loaded from: classes.dex */
    public static final class a implements Appendable {

        /* renamed from: u  reason: collision with root package name */
        public final Appendable f5973u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f5974v = true;

        public a(Appendable appendable) {
            this.f5973u = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c10) {
            boolean z10 = this.f5974v;
            Appendable appendable = this.f5973u;
            if (z10) {
                this.f5974v = false;
                appendable.append("  ");
            }
            this.f5974v = c10 == '\n';
            appendable.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i6, int i10) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z10 = this.f5974v;
            Appendable appendable = this.f5973u;
            boolean z11 = false;
            if (z10) {
                this.f5974v = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i10 - 1) == '\n') {
                z11 = true;
            }
            this.f5974v = z11;
            appendable.append(charSequence, i6, i10);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
