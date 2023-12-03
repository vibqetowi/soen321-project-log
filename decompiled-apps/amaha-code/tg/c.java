package tg;

import hh.g;
/* compiled from: CardManager.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static a f33009a;

    static {
        try {
            Object newInstance = Class.forName("com.moengage.cards.core.internal.CardHandlerImpl").newInstance();
            if (newInstance != null) {
                f33009a = (a) newInstance;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.moengage.core.internal.cards.CardHandler");
        } catch (Exception unused) {
            hh.a aVar = g.f17610d;
            g.a.b(3, b.f33008u, 2);
        }
    }
}
