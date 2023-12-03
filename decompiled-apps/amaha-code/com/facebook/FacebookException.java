package com.facebook;

import f0.b;
import h5.p;
import java.util.Random;
import kotlin.Metadata;
import w5.l;
/* compiled from: FacebookException.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public class FacebookException extends RuntimeException {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f6108u = 0;

    public FacebookException() {
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        if (message == null) {
            return "";
        }
        return message;
    }

    public FacebookException(String str) {
        super(str);
        Random random = new Random();
        if (str == null || !p.h() || random.nextInt(100) <= 50) {
            return;
        }
        l lVar = l.f36497a;
        l.a(new b(3, str), l.b.ErrorReport);
    }

    public FacebookException(String str, Exception exc) {
        super(str, exc);
    }

    public FacebookException(Throwable th2) {
        super(th2);
    }
}
