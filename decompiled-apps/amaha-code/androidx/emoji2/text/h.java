package androidx.emoji2.text;

import androidx.emoji2.text.f;
import java.util.concurrent.ThreadPoolExecutor;
/* compiled from: EmojiCompatInitializer.java */
/* loaded from: classes.dex */
public final class h extends f.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.h f2054a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f2055b;

    public h(f.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f2054a = hVar;
        this.f2055b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.f.h
    public final void a(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f2055b;
        try {
            this.f2054a.a(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.f.h
    public final void b(o oVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f2055b;
        try {
            this.f2054a.b(oVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
