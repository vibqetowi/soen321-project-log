package a6;

import is.u;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import p0.d;
import sp.b;
import ug.l;
import w5.d0;
import w5.e0;
import xs.e;
import y5.a;
/* compiled from: CrashHandler.kt */
/* loaded from: classes.dex */
public final class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: b  reason: collision with root package name */
    public static final C0009a f327b = new C0009a();

    /* renamed from: c  reason: collision with root package name */
    public static a f328c;

    /* renamed from: a  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f329a;

    /* compiled from: CrashHandler.kt */
    /* renamed from: a6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0009a {
        public static void a() {
            File[] listFiles;
            if (e0.y()) {
                return;
            }
            File B = b.B();
            if (B == null) {
                listFiles = new File[0];
            } else {
                listFiles = B.listFiles(new d0(1));
                if (listFiles == null) {
                    listFiles = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList(listFiles.length);
            for (File file : listFiles) {
                i.g(file, "file");
                arrayList.add(new y5.a(file));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((y5.a) next).b()) {
                    arrayList2.add(next);
                }
            }
            List D2 = u.D2(arrayList2, new d(3));
            JSONArray jSONArray = new JSONArray();
            e it2 = h.k0(0, Math.min(D2.size(), 5)).iterator();
            while (it2.f38001w) {
                jSONArray.put(D2.get(it2.nextInt()));
            }
            b.X("crash_reports", jSONArray, new z5.b(1, D2));
        }
    }

    public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f329a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t3, Throwable e10) {
        int i6;
        i.g(t3, "t");
        i.g(e10, "e");
        Throwable th2 = null;
        Throwable th3 = e10;
        loop0: while (true) {
            i6 = 0;
            if (th3 == null || th3 == th2) {
                break;
            }
            StackTraceElement[] stackTrace = th3.getStackTrace();
            i.f(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            while (i6 < length) {
                StackTraceElement element = stackTrace[i6];
                i6++;
                i.f(element, "element");
                if (b.J(element)) {
                    i6 = 1;
                    break loop0;
                }
            }
            th2 = th3;
            th3 = th3.getCause();
        }
        if (i6 != 0) {
            l.c(e10);
            new y5.a(e10, a.EnumC0649a.CrashReport).c();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f329a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t3, e10);
        }
    }
}
